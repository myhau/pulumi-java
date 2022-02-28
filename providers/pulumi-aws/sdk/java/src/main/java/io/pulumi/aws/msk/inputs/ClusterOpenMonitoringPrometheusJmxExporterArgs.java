// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class ClusterOpenMonitoringPrometheusJmxExporterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterOpenMonitoringPrometheusJmxExporterArgs Empty = new ClusterOpenMonitoringPrometheusJmxExporterArgs();

    /**
     * Indicates whether you want to enable or disable the JMX Exporter.
     * 
     */
    @InputImport(name="enabledInBroker", required=true)
      private final Input<Boolean> enabledInBroker;

    public Input<Boolean> getEnabledInBroker() {
        return this.enabledInBroker;
    }

    public ClusterOpenMonitoringPrometheusJmxExporterArgs(Input<Boolean> enabledInBroker) {
        this.enabledInBroker = Objects.requireNonNull(enabledInBroker, "expected parameter 'enabledInBroker' to be non-null");
    }

    private ClusterOpenMonitoringPrometheusJmxExporterArgs() {
        this.enabledInBroker = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterOpenMonitoringPrometheusJmxExporterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> enabledInBroker;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterOpenMonitoringPrometheusJmxExporterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabledInBroker = defaults.enabledInBroker;
        }

        public Builder setEnabledInBroker(Input<Boolean> enabledInBroker) {
            this.enabledInBroker = Objects.requireNonNull(enabledInBroker);
            return this;
        }

        public Builder setEnabledInBroker(Boolean enabledInBroker) {
            this.enabledInBroker = Input.of(Objects.requireNonNull(enabledInBroker));
            return this;
        }
        public ClusterOpenMonitoringPrometheusJmxExporterArgs build() {
            return new ClusterOpenMonitoringPrometheusJmxExporterArgs(enabledInBroker);
        }
    }
}
