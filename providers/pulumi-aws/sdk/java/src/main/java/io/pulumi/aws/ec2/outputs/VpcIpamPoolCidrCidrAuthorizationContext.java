// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VpcIpamPoolCidrCidrAuthorizationContext {
    /**
     * The plain-text authorization message for the prefix and account.
     * 
     */
    private final @Nullable String message;
    /**
     * The signed authorization message for the prefix and account.
     * 
     */
    private final @Nullable String signature;

    @OutputCustomType.Constructor({"message","signature"})
    private VpcIpamPoolCidrCidrAuthorizationContext(
        @Nullable String message,
        @Nullable String signature) {
        this.message = message;
        this.signature = signature;
    }

    /**
     * The plain-text authorization message for the prefix and account.
     * 
     */
    public Optional<String> getMessage() {
        return Optional.ofNullable(this.message);
    }
    /**
     * The signed authorization message for the prefix and account.
     * 
     */
    public Optional<String> getSignature() {
        return Optional.ofNullable(this.signature);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcIpamPoolCidrCidrAuthorizationContext defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String message;
        private @Nullable String signature;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcIpamPoolCidrCidrAuthorizationContext defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.signature = defaults.signature;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder setSignature(@Nullable String signature) {
            this.signature = signature;
            return this;
        }
        public VpcIpamPoolCidrCidrAuthorizationContext build() {
            return new VpcIpamPoolCidrCidrAuthorizationContext(message, signature);
        }
    }
}
