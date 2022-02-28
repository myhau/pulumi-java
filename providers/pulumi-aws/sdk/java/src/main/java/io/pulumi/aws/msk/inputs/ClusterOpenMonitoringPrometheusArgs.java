// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk.inputs;

import io.pulumi.aws.msk.inputs.ClusterOpenMonitoringPrometheusJmxExporterArgs;
import io.pulumi.aws.msk.inputs.ClusterOpenMonitoringPrometheusNodeExporterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterOpenMonitoringPrometheusArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterOpenMonitoringPrometheusArgs Empty = new ClusterOpenMonitoringPrometheusArgs();

    /**
     * Configuration block for JMX Exporter. See below.
     * 
     */
    @InputImport(name="jmxExporter")
      private final @Nullable Input<ClusterOpenMonitoringPrometheusJmxExporterArgs> jmxExporter;

    public Input<ClusterOpenMonitoringPrometheusJmxExporterArgs> getJmxExporter() {
        return this.jmxExporter == null ? Input.empty() : this.jmxExporter;
    }

    /**
     * Configuration block for Node Exporter. See below.
     * 
     */
    @InputImport(name="nodeExporter")
      private final @Nullable Input<ClusterOpenMonitoringPrometheusNodeExporterArgs> nodeExporter;

    public Input<ClusterOpenMonitoringPrometheusNodeExporterArgs> getNodeExporter() {
        return this.nodeExporter == null ? Input.empty() : this.nodeExporter;
    }

    public ClusterOpenMonitoringPrometheusArgs(
        @Nullable Input<ClusterOpenMonitoringPrometheusJmxExporterArgs> jmxExporter,
        @Nullable Input<ClusterOpenMonitoringPrometheusNodeExporterArgs> nodeExporter) {
        this.jmxExporter = jmxExporter;
        this.nodeExporter = nodeExporter;
    }

    private ClusterOpenMonitoringPrometheusArgs() {
        this.jmxExporter = Input.empty();
        this.nodeExporter = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterOpenMonitoringPrometheusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ClusterOpenMonitoringPrometheusJmxExporterArgs> jmxExporter;
        private @Nullable Input<ClusterOpenMonitoringPrometheusNodeExporterArgs> nodeExporter;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterOpenMonitoringPrometheusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jmxExporter = defaults.jmxExporter;
    	      this.nodeExporter = defaults.nodeExporter;
        }

        public Builder setJmxExporter(@Nullable Input<ClusterOpenMonitoringPrometheusJmxExporterArgs> jmxExporter) {
            this.jmxExporter = jmxExporter;
            return this;
        }

        public Builder setJmxExporter(@Nullable ClusterOpenMonitoringPrometheusJmxExporterArgs jmxExporter) {
            this.jmxExporter = Input.ofNullable(jmxExporter);
            return this;
        }

        public Builder setNodeExporter(@Nullable Input<ClusterOpenMonitoringPrometheusNodeExporterArgs> nodeExporter) {
            this.nodeExporter = nodeExporter;
            return this;
        }

        public Builder setNodeExporter(@Nullable ClusterOpenMonitoringPrometheusNodeExporterArgs nodeExporter) {
            this.nodeExporter = Input.ofNullable(nodeExporter);
            return this;
        }
        public ClusterOpenMonitoringPrometheusArgs build() {
            return new ClusterOpenMonitoringPrometheusArgs(jmxExporter, nodeExporter);
        }
    }
}
