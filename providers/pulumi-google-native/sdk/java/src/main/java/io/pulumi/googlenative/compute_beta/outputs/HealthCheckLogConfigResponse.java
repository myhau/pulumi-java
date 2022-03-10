// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class HealthCheckLogConfigResponse {
    /**
     * Indicates whether or not to export logs. This is false by default, which means no health check logging will be done.
     * 
     */
    private final Boolean enable;

    @OutputCustomType.Constructor
    private HealthCheckLogConfigResponse(@OutputCustomType.Parameter("enable") Boolean enable) {
        this.enable = enable;
    }

    /**
     * Indicates whether or not to export logs. This is false by default, which means no health check logging will be done.
     * 
    */
    public Boolean getEnable() {
        return this.enable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthCheckLogConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enable;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthCheckLogConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
        }

        public Builder setEnable(Boolean enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }
        public HealthCheckLogConfigResponse build() {
            return new HealthCheckLogConfigResponse(enable);
        }
    }
}
