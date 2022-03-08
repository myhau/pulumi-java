// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.vmmigration_v1.outputs.SchedulingNodeAffinityResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ComputeSchedulingResponse {
    /**
     * The minimum number of virtual CPUs this instance will consume when running on a sole-tenant node. Ignored if no node_affinites are configured.
     * 
     */
    private final Integer minNodeCpus;
    /**
     * A set of node affinity and anti-affinity configurations for sole tenant nodes.
     * 
     */
    private final List<SchedulingNodeAffinityResponse> nodeAffinities;
    /**
     * How the instance should behave when the host machine undergoes maintenance that may temporarily impact instance performance.
     * 
     */
    private final String onHostMaintenance;
    /**
     * Whether the Instance should be automatically restarted whenever it is terminated by Compute Engine (not terminated by user). This configuration is identical to `automaticRestart` field in Compute Engine create instance under scheduling. It was changed to an enum (instead of a boolean) to match the default value in Compute Engine which is automatic restart.
     * 
     */
    private final String restartType;

    @OutputCustomType.Constructor({"minNodeCpus","nodeAffinities","onHostMaintenance","restartType"})
    private ComputeSchedulingResponse(
        Integer minNodeCpus,
        List<SchedulingNodeAffinityResponse> nodeAffinities,
        String onHostMaintenance,
        String restartType) {
        this.minNodeCpus = minNodeCpus;
        this.nodeAffinities = nodeAffinities;
        this.onHostMaintenance = onHostMaintenance;
        this.restartType = restartType;
    }

    /**
     * The minimum number of virtual CPUs this instance will consume when running on a sole-tenant node. Ignored if no node_affinites are configured.
     * 
    */
    public Integer getMinNodeCpus() {
        return this.minNodeCpus;
    }
    /**
     * A set of node affinity and anti-affinity configurations for sole tenant nodes.
     * 
    */
    public List<SchedulingNodeAffinityResponse> getNodeAffinities() {
        return this.nodeAffinities;
    }
    /**
     * How the instance should behave when the host machine undergoes maintenance that may temporarily impact instance performance.
     * 
    */
    public String getOnHostMaintenance() {
        return this.onHostMaintenance;
    }
    /**
     * Whether the Instance should be automatically restarted whenever it is terminated by Compute Engine (not terminated by user). This configuration is identical to `automaticRestart` field in Compute Engine create instance under scheduling. It was changed to an enum (instead of a boolean) to match the default value in Compute Engine which is automatic restart.
     * 
    */
    public String getRestartType() {
        return this.restartType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeSchedulingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer minNodeCpus;
        private List<SchedulingNodeAffinityResponse> nodeAffinities;
        private String onHostMaintenance;
        private String restartType;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeSchedulingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minNodeCpus = defaults.minNodeCpus;
    	      this.nodeAffinities = defaults.nodeAffinities;
    	      this.onHostMaintenance = defaults.onHostMaintenance;
    	      this.restartType = defaults.restartType;
        }

        public Builder setMinNodeCpus(Integer minNodeCpus) {
            this.minNodeCpus = Objects.requireNonNull(minNodeCpus);
            return this;
        }

        public Builder setNodeAffinities(List<SchedulingNodeAffinityResponse> nodeAffinities) {
            this.nodeAffinities = Objects.requireNonNull(nodeAffinities);
            return this;
        }

        public Builder setOnHostMaintenance(String onHostMaintenance) {
            this.onHostMaintenance = Objects.requireNonNull(onHostMaintenance);
            return this;
        }

        public Builder setRestartType(String restartType) {
            this.restartType = Objects.requireNonNull(restartType);
            return this;
        }
        public ComputeSchedulingResponse build() {
            return new ComputeSchedulingResponse(minNodeCpus, nodeAffinities, onHostMaintenance, restartType);
        }
    }
}
