// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class BinaryAuthorizationResponse {
    /**
     * Enable Binary Authorization for this cluster. If enabled, all container images will be validated by Google Binauthz.
     * 
     */
    private final Boolean enabled;

    @OutputCustomType.Constructor
    private BinaryAuthorizationResponse(@OutputCustomType.Parameter("enabled") Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Enable Binary Authorization for this cluster. If enabled, all container images will be validated by Google Binauthz.
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BinaryAuthorizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(BinaryAuthorizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public BinaryAuthorizationResponse build() {
            return new BinaryAuthorizationResponse(enabled);
        }
    }
}
