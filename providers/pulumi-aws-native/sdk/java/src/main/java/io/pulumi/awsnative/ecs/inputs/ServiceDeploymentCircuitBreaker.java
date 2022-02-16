// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class ServiceDeploymentCircuitBreaker extends io.pulumi.resources.InvokeArgs {

    public static final ServiceDeploymentCircuitBreaker Empty = new ServiceDeploymentCircuitBreaker();

    @InputImport(name="enable", required=true)
    private final Boolean enable;

    public Boolean getEnable() {
        return this.enable;
    }

    @InputImport(name="rollback", required=true)
    private final Boolean rollback;

    public Boolean getRollback() {
        return this.rollback;
    }

    public ServiceDeploymentCircuitBreaker(
        Boolean enable,
        Boolean rollback) {
        this.enable = Objects.requireNonNull(enable, "expected parameter 'enable' to be non-null");
        this.rollback = Objects.requireNonNull(rollback, "expected parameter 'rollback' to be non-null");
    }

    private ServiceDeploymentCircuitBreaker() {
        this.enable = null;
        this.rollback = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceDeploymentCircuitBreaker defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enable;
        private Boolean rollback;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceDeploymentCircuitBreaker defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.rollback = defaults.rollback;
        }

        public Builder setEnable(Boolean enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }

        public Builder setRollback(Boolean rollback) {
            this.rollback = Objects.requireNonNull(rollback);
            return this;
        }

        public ServiceDeploymentCircuitBreaker build() {
            return new ServiceDeploymentCircuitBreaker(enable, rollback);
        }
    }
}