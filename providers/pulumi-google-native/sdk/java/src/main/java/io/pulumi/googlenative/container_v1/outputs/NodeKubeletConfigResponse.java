// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class NodeKubeletConfigResponse {
    /**
     * Enable CPU CFS quota enforcement for containers that specify CPU limits. This option is enabled by default which makes kubelet use CFS quota (https://www.kernel.org/doc/Documentation/scheduler/sched-bwc.txt) to enforce container CPU limits. Otherwise, CPU limits will not be enforced at all. Disable this option to mitigate CPU throttling problems while still having your pods to be in Guaranteed QoS class by specifying the CPU limits. The default value is 'true' if unspecified.
     * 
     */
    private final Boolean cpuCfsQuota;
    /**
     * Set the CPU CFS quota period value 'cpu.cfs_period_us'. The string must be a sequence of decimal numbers, each with optional fraction and a unit suffix, such as "300ms". Valid time units are "ns", "us" (or "µs"), "ms", "s", "m", "h". The value must be a positive duration.
     * 
     */
    private final String cpuCfsQuotaPeriod;
    /**
     * Control the CPU management policy on the node. See https://kubernetes.io/docs/tasks/administer-cluster/cpu-management-policies/ The following values are allowed. * "none": the default, which represents the existing scheduling behavior. * "static": allows pods with certain resource characteristics to be granted increased CPU affinity and exclusivity on the node. The default value is 'none' if unspecified.
     * 
     */
    private final String cpuManagerPolicy;

    @OutputCustomType.Constructor({"cpuCfsQuota","cpuCfsQuotaPeriod","cpuManagerPolicy"})
    private NodeKubeletConfigResponse(
        Boolean cpuCfsQuota,
        String cpuCfsQuotaPeriod,
        String cpuManagerPolicy) {
        this.cpuCfsQuota = cpuCfsQuota;
        this.cpuCfsQuotaPeriod = cpuCfsQuotaPeriod;
        this.cpuManagerPolicy = cpuManagerPolicy;
    }

    /**
     * Enable CPU CFS quota enforcement for containers that specify CPU limits. This option is enabled by default which makes kubelet use CFS quota (https://www.kernel.org/doc/Documentation/scheduler/sched-bwc.txt) to enforce container CPU limits. Otherwise, CPU limits will not be enforced at all. Disable this option to mitigate CPU throttling problems while still having your pods to be in Guaranteed QoS class by specifying the CPU limits. The default value is 'true' if unspecified.
     * 
    */
    public Boolean getCpuCfsQuota() {
        return this.cpuCfsQuota;
    }
    /**
     * Set the CPU CFS quota period value 'cpu.cfs_period_us'. The string must be a sequence of decimal numbers, each with optional fraction and a unit suffix, such as "300ms". Valid time units are "ns", "us" (or "µs"), "ms", "s", "m", "h". The value must be a positive duration.
     * 
    */
    public String getCpuCfsQuotaPeriod() {
        return this.cpuCfsQuotaPeriod;
    }
    /**
     * Control the CPU management policy on the node. See https://kubernetes.io/docs/tasks/administer-cluster/cpu-management-policies/ The following values are allowed. * "none": the default, which represents the existing scheduling behavior. * "static": allows pods with certain resource characteristics to be granted increased CPU affinity and exclusivity on the node. The default value is 'none' if unspecified.
     * 
    */
    public String getCpuManagerPolicy() {
        return this.cpuManagerPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeKubeletConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean cpuCfsQuota;
        private String cpuCfsQuotaPeriod;
        private String cpuManagerPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeKubeletConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuCfsQuota = defaults.cpuCfsQuota;
    	      this.cpuCfsQuotaPeriod = defaults.cpuCfsQuotaPeriod;
    	      this.cpuManagerPolicy = defaults.cpuManagerPolicy;
        }

        public Builder setCpuCfsQuota(Boolean cpuCfsQuota) {
            this.cpuCfsQuota = Objects.requireNonNull(cpuCfsQuota);
            return this;
        }

        public Builder setCpuCfsQuotaPeriod(String cpuCfsQuotaPeriod) {
            this.cpuCfsQuotaPeriod = Objects.requireNonNull(cpuCfsQuotaPeriod);
            return this;
        }

        public Builder setCpuManagerPolicy(String cpuManagerPolicy) {
            this.cpuManagerPolicy = Objects.requireNonNull(cpuManagerPolicy);
            return this;
        }
        public NodeKubeletConfigResponse build() {
            return new NodeKubeletConfigResponse(cpuCfsQuota, cpuCfsQuotaPeriod, cpuManagerPolicy);
        }
    }
}
