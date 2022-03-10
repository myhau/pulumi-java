// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.container_v1beta1.outputs.ManagedPrometheusConfigResponse;
import io.pulumi.googlenative.container_v1beta1.outputs.MonitoringComponentConfigResponse;
import java.util.Objects;

@OutputCustomType
public final class MonitoringConfigResponse {
    /**
     * Monitoring components configuration
     * 
     */
    private final MonitoringComponentConfigResponse componentConfig;
    /**
     * Enable Google Cloud Managed Service for Prometheus in the cluster.
     * 
     */
    private final ManagedPrometheusConfigResponse managedPrometheusConfig;

    @OutputCustomType.Constructor
    private MonitoringConfigResponse(
        @OutputCustomType.Parameter("componentConfig") MonitoringComponentConfigResponse componentConfig,
        @OutputCustomType.Parameter("managedPrometheusConfig") ManagedPrometheusConfigResponse managedPrometheusConfig) {
        this.componentConfig = componentConfig;
        this.managedPrometheusConfig = managedPrometheusConfig;
    }

    /**
     * Monitoring components configuration
     * 
    */
    public MonitoringComponentConfigResponse getComponentConfig() {
        return this.componentConfig;
    }
    /**
     * Enable Google Cloud Managed Service for Prometheus in the cluster.
     * 
    */
    public ManagedPrometheusConfigResponse getManagedPrometheusConfig() {
        return this.managedPrometheusConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitoringComponentConfigResponse componentConfig;
        private ManagedPrometheusConfigResponse managedPrometheusConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentConfig = defaults.componentConfig;
    	      this.managedPrometheusConfig = defaults.managedPrometheusConfig;
        }

        public Builder setComponentConfig(MonitoringComponentConfigResponse componentConfig) {
            this.componentConfig = Objects.requireNonNull(componentConfig);
            return this;
        }

        public Builder setManagedPrometheusConfig(ManagedPrometheusConfigResponse managedPrometheusConfig) {
            this.managedPrometheusConfig = Objects.requireNonNull(managedPrometheusConfig);
            return this;
        }
        public MonitoringConfigResponse build() {
            return new MonitoringConfigResponse(componentConfig, managedPrometheusConfig);
        }
    }
}
