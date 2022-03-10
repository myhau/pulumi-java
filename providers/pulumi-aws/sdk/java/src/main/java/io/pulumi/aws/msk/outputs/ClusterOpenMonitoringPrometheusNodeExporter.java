// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class ClusterOpenMonitoringPrometheusNodeExporter {
    /**
     * Indicates whether you want to enable or disable the JMX Exporter.
     * 
     */
    private final Boolean enabledInBroker;

    @OutputCustomType.Constructor({"enabledInBroker"})
    private ClusterOpenMonitoringPrometheusNodeExporter(Boolean enabledInBroker) {
        this.enabledInBroker = enabledInBroker;
    }

    /**
     * Indicates whether you want to enable or disable the JMX Exporter.
     * 
    */
    public Boolean getEnabledInBroker() {
        return this.enabledInBroker;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterOpenMonitoringPrometheusNodeExporter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabledInBroker;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterOpenMonitoringPrometheusNodeExporter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabledInBroker = defaults.enabledInBroker;
        }

        public Builder setEnabledInBroker(Boolean enabledInBroker) {
            this.enabledInBroker = Objects.requireNonNull(enabledInBroker);
            return this;
        }
        public ClusterOpenMonitoringPrometheusNodeExporter build() {
            return new ClusterOpenMonitoringPrometheusNodeExporter(enabledInBroker);
        }
    }
}