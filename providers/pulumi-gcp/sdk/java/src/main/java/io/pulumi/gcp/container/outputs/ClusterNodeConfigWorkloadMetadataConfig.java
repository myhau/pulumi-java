// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ClusterNodeConfigWorkloadMetadataConfig {
    /**
     * How to expose the node metadata to the workload running on the node.
     * Accepted values are:
     * * UNSPECIFIED: Not Set
     * * GCE_METADATA: Expose all Compute Engine metadata to pods.
     * * GKE_METADATA: Run the GKE Metadata Server on this node. The GKE Metadata Server exposes a metadata API to workloads that is compatible with the V1 Compute Metadata APIs exposed by the Compute Engine and App Engine Metadata Servers. This feature can only be enabled if [workload identity](https://cloud.google.com/kubernetes-engine/docs/how-to/workload-identity) is enabled at the cluster level.
     * 
     */
    private final String mode;

    @OutputCustomType.Constructor({"mode"})
    private ClusterNodeConfigWorkloadMetadataConfig(String mode) {
        this.mode = mode;
    }

    /**
     * How to expose the node metadata to the workload running on the node.
     * Accepted values are:
     * * UNSPECIFIED: Not Set
     * * GCE_METADATA: Expose all Compute Engine metadata to pods.
     * * GKE_METADATA: Run the GKE Metadata Server on this node. The GKE Metadata Server exposes a metadata API to workloads that is compatible with the V1 Compute Metadata APIs exposed by the Compute Engine and App Engine Metadata Servers. This feature can only be enabled if [workload identity](https://cloud.google.com/kubernetes-engine/docs/how-to/workload-identity) is enabled at the cluster level.
     * 
    */
    public String getMode() {
        return this.mode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodeConfigWorkloadMetadataConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mode;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodeConfigWorkloadMetadataConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
        }

        public Builder setMode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public ClusterNodeConfigWorkloadMetadataConfig build() {
            return new ClusterNodeConfigWorkloadMetadataConfig(mode);
        }
    }
}
