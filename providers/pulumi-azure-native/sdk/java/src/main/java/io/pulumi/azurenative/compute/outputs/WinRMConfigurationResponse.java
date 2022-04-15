// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.WinRMListenerResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class WinRMConfigurationResponse {
    /**
     * The list of Windows Remote Management listeners
     * 
     */
    private final @Nullable List<WinRMListenerResponse> listeners;

    @CustomType.Constructor
    private WinRMConfigurationResponse(@CustomType.Parameter("listeners") @Nullable List<WinRMListenerResponse> listeners) {
        this.listeners = listeners;
    }

    /**
     * The list of Windows Remote Management listeners
     * 
    */
    public List<WinRMListenerResponse> listeners() {
        return this.listeners == null ? List.of() : this.listeners;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WinRMConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<WinRMListenerResponse> listeners;

        public Builder() {
    	      // Empty
        }

        public Builder(WinRMConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.listeners = defaults.listeners;
        }

        public Builder listeners(@Nullable List<WinRMListenerResponse> listeners) {
            this.listeners = listeners;
            return this;
        }
        public Builder listeners(WinRMListenerResponse... listeners) {
            return listeners(List.of(listeners));
        }        public WinRMConfigurationResponse build() {
            return new WinRMConfigurationResponse(listeners);
        }
    }
}
