// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EnabledConfigResponse {
    /**
     * True if configuration is enabled, false if it is disabled and null if configuration is not set.
     * 
     */
    private final @Nullable Boolean enabled;

    @CustomType.Constructor
    private EnabledConfigResponse(@CustomType.Parameter("enabled") @Nullable Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * True if configuration is enabled, false if it is disabled and null if configuration is not set.
     * 
    */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnabledConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(EnabledConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }        public EnabledConfigResponse build() {
            return new EnabledConfigResponse(enabled);
        }
    }
}
