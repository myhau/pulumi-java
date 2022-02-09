// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NonceResponse {
    private final @Nullable String nonceExpirationInterval;
    private final @Nullable Boolean validateNonce;

    @OutputCustomType.Constructor({"nonceExpirationInterval","validateNonce"})
    private NonceResponse(
        @Nullable String nonceExpirationInterval,
        @Nullable Boolean validateNonce) {
        this.nonceExpirationInterval = nonceExpirationInterval;
        this.validateNonce = validateNonce;
    }

    public Optional<String> getNonceExpirationInterval() {
        return Optional.ofNullable(this.nonceExpirationInterval);
    }
    public Optional<Boolean> getValidateNonce() {
        return Optional.ofNullable(this.validateNonce);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NonceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String nonceExpirationInterval;
        private @Nullable Boolean validateNonce;

        public Builder() {
    	      // Empty
        }

        public Builder(NonceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nonceExpirationInterval = defaults.nonceExpirationInterval;
    	      this.validateNonce = defaults.validateNonce;
        }

        public Builder setNonceExpirationInterval(@Nullable String nonceExpirationInterval) {
            this.nonceExpirationInterval = nonceExpirationInterval;
            return this;
        }

        public Builder setValidateNonce(@Nullable Boolean validateNonce) {
            this.validateNonce = validateNonce;
            return this;
        }

        public NonceResponse build() {
            return new NonceResponse(nonceExpirationInterval, validateNonce);
        }
    }
}