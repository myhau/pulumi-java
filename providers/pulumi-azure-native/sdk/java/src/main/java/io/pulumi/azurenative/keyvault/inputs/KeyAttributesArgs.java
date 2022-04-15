// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The attributes of the key.
 * 
 */
public final class KeyAttributesArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyAttributesArgs Empty = new KeyAttributesArgs();

    /**
     * Determines whether or not the object is enabled.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    /**
     * Expiry date in seconds since 1970-01-01T00:00:00Z.
     * 
     */
    @Import(name="expires")
      private final @Nullable Output<Double> expires;

    public Output<Double> expires() {
        return this.expires == null ? Codegen.empty() : this.expires;
    }

    /**
     * Not before date in seconds since 1970-01-01T00:00:00Z.
     * 
     */
    @Import(name="notBefore")
      private final @Nullable Output<Double> notBefore;

    public Output<Double> notBefore() {
        return this.notBefore == null ? Codegen.empty() : this.notBefore;
    }

    public KeyAttributesArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<Double> expires,
        @Nullable Output<Double> notBefore) {
        this.enabled = enabled;
        this.expires = expires;
        this.notBefore = notBefore;
    }

    private KeyAttributesArgs() {
        this.enabled = Codegen.empty();
        this.expires = Codegen.empty();
        this.notBefore = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyAttributesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<Double> expires;
        private @Nullable Output<Double> notBefore;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyAttributesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.expires = defaults.expires;
    	      this.notBefore = defaults.notBefore;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder expires(@Nullable Output<Double> expires) {
            this.expires = expires;
            return this;
        }
        public Builder expires(@Nullable Double expires) {
            this.expires = Codegen.ofNullable(expires);
            return this;
        }
        public Builder notBefore(@Nullable Output<Double> notBefore) {
            this.notBefore = notBefore;
            return this;
        }
        public Builder notBefore(@Nullable Double notBefore) {
            this.notBefore = Codegen.ofNullable(notBefore);
            return this;
        }        public KeyAttributesArgs build() {
            return new KeyAttributesArgs(enabled, expires, notBefore);
        }
    }
}
