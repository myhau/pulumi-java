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
public final class DistributionTrustedKeyGroupItem {
    /**
     * The ID of the key group that contains the public keys
     * 
     */
    private final @Nullable String keyGroupId;
    /**
     * Set of active CloudFront key pairs associated with the signer account
     * 
     */
    private final @Nullable List<String> keyPairIds;

    @OutputCustomType.Constructor({"keyGroupId","keyPairIds"})
    private DistributionTrustedKeyGroupItem(
        @Nullable String keyGroupId,
        @Nullable List<String> keyPairIds) {
        this.keyGroupId = keyGroupId;
        this.keyPairIds = keyPairIds;
    }

    /**
     * The ID of the key group that contains the public keys
     * 
     */
    public Optional<String> getKeyGroupId() {
        return Optional.ofNullable(this.keyGroupId);
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

    public static Builder builder(DistributionTrustedKeyGroupItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyGroupId;
        private @Nullable List<String> keyPairIds;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionTrustedKeyGroupItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyGroupId = defaults.keyGroupId;
    	      this.keyPairIds = defaults.keyPairIds;
        }

        public Builder setKeyGroupId(@Nullable String keyGroupId) {
            this.keyGroupId = keyGroupId;
            return this;
        }

        public Builder setKeyPairIds(@Nullable List<String> keyPairIds) {
            this.keyPairIds = keyPairIds;
            return this;
        }
        public DistributionTrustedKeyGroupItem build() {
            return new DistributionTrustedKeyGroupItem(keyGroupId, keyPairIds);
        }
    }
}
