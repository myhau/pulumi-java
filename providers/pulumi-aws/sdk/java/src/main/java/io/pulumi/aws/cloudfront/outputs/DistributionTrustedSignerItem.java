// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DistributionTrustedSignerItem {
    /**
     * AWS account ID or `self`
     * 
     */
    private final @Nullable String awsAccountNumber;
    /**
     * Set of active CloudFront key pairs associated with the signer account
     * 
     */
    private final @Nullable List<String> keyPairIds;

    @OutputCustomType.Constructor({"awsAccountNumber","keyPairIds"})
    private DistributionTrustedSignerItem(
        @Nullable String awsAccountNumber,
        @Nullable List<String> keyPairIds) {
        this.awsAccountNumber = awsAccountNumber;
        this.keyPairIds = keyPairIds;
    }

    /**
     * AWS account ID or `self`
     * 
     */
    public Optional<String> getAwsAccountNumber() {
        return Optional.ofNullable(this.awsAccountNumber);
    }
    /**
     * Set of active CloudFront key pairs associated with the signer account
     * 
     */
    public List<String> getKeyPairIds() {
        return this.keyPairIds == null ? List.of() : this.keyPairIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionTrustedSignerItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String awsAccountNumber;
        private @Nullable List<String> keyPairIds;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionTrustedSignerItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsAccountNumber = defaults.awsAccountNumber;
    	      this.keyPairIds = defaults.keyPairIds;
        }

        public Builder setAwsAccountNumber(@Nullable String awsAccountNumber) {
            this.awsAccountNumber = awsAccountNumber;
            return this;
        }

        public Builder setKeyPairIds(@Nullable List<String> keyPairIds) {
            this.keyPairIds = keyPairIds;
            return this;
        }
        public DistributionTrustedSignerItem build() {
            return new DistributionTrustedSignerItem(awsAccountNumber, keyPairIds);
        }
    }
}
