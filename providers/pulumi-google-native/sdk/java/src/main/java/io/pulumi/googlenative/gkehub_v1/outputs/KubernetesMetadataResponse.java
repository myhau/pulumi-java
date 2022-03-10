// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class KubernetesMetadataResponse {
    /**
     * Kubernetes API server version string as reported by `/version`.
     * 
     */
    private final String kubernetesApiServerVersion;
    /**
     * The total memory capacity as reported by the sum of all Kubernetes nodes resources, defined in MB.
     * 
     */
    private final Integer memoryMb;
    /**
     * Node count as reported by Kubernetes nodes resources.
     * 
     */
    private final Integer nodeCount;
    /**
     * Node providerID as reported by the first node in the list of nodes on the Kubernetes endpoint. On Kubernetes platforms that support zero-node clusters (like GKE-on-GCP), the node_count will be zero and the node_provider_id will be empty.
     * 
     */
    private final String nodeProviderId;
    /**
     * The time at which these details were last updated. This update_time is different from the Membership-level update_time since EndpointDetails are updated internally for API consumers.
     * 
     */
    private final String updateTime;
    /**
     * vCPU count as reported by Kubernetes nodes resources.
     * 
     */
    private final Integer vcpuCount;

    @OutputCustomType.Constructor
    private KubernetesMetadataResponse(
        @OutputCustomType.Parameter("kubernetesApiServerVersion") String kubernetesApiServerVersion,
        @OutputCustomType.Parameter("memoryMb") Integer memoryMb,
        @OutputCustomType.Parameter("nodeCount") Integer nodeCount,
        @OutputCustomType.Parameter("nodeProviderId") String nodeProviderId,
        @OutputCustomType.Parameter("updateTime") String updateTime,
        @OutputCustomType.Parameter("vcpuCount") Integer vcpuCount) {
        this.kubernetesApiServerVersion = kubernetesApiServerVersion;
        this.memoryMb = memoryMb;
        this.nodeCount = nodeCount;
        this.nodeProviderId = nodeProviderId;
        this.updateTime = updateTime;
        this.vcpuCount = vcpuCount;
    }

    /**
     * Kubernetes API server version string as reported by `/version`.
     * 
    */
    public String getKubernetesApiServerVersion() {
        return this.kubernetesApiServerVersion;
    }
    /**
     * The total memory capacity as reported by the sum of all Kubernetes nodes resources, defined in MB.
     * 
    */
    public Integer getMemoryMb() {
        return this.memoryMb;
    }
    /**
     * Node count as reported by Kubernetes nodes resources.
     * 
    */
    public Integer getNodeCount() {
        return this.nodeCount;
    }
    /**
     * Node providerID as reported by the first node in the list of nodes on the Kubernetes endpoint. On Kubernetes platforms that support zero-node clusters (like GKE-on-GCP), the node_count will be zero and the node_provider_id will be empty.
     * 
    */
    public String getNodeProviderId() {
        return this.nodeProviderId;
    }
    /**
     * The time at which these details were last updated. This update_time is different from the Membership-level update_time since EndpointDetails are updated internally for API consumers.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }
    /**
     * vCPU count as reported by Kubernetes nodes resources.
     * 
    */
    public Integer getVcpuCount() {
        return this.vcpuCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kubernetesApiServerVersion;
        private Integer memoryMb;
        private Integer nodeCount;
        private String nodeProviderId;
        private String updateTime;
        private Integer vcpuCount;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kubernetesApiServerVersion = defaults.kubernetesApiServerVersion;
    	      this.memoryMb = defaults.memoryMb;
    	      this.nodeCount = defaults.nodeCount;
    	      this.nodeProviderId = defaults.nodeProviderId;
    	      this.updateTime = defaults.updateTime;
    	      this.vcpuCount = defaults.vcpuCount;
        }

        public Builder setKubernetesApiServerVersion(String kubernetesApiServerVersion) {
            this.kubernetesApiServerVersion = Objects.requireNonNull(kubernetesApiServerVersion);
            return this;
        }

        public Builder setMemoryMb(Integer memoryMb) {
            this.memoryMb = Objects.requireNonNull(memoryMb);
            return this;
        }

        public Builder setNodeCount(Integer nodeCount) {
            this.nodeCount = Objects.requireNonNull(nodeCount);
            return this;
        }

        public Builder setNodeProviderId(String nodeProviderId) {
            this.nodeProviderId = Objects.requireNonNull(nodeProviderId);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public Builder setVcpuCount(Integer vcpuCount) {
            this.vcpuCount = Objects.requireNonNull(vcpuCount);
            return this;
        }
        public KubernetesMetadataResponse build() {
            return new KubernetesMetadataResponse(kubernetesApiServerVersion, memoryMb, nodeCount, nodeProviderId, updateTime, vcpuCount);
        }
    }
}
