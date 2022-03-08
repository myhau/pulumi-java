// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.GetInstanceSchedulingNodeAffinity;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetInstanceScheduling {
    /**
     * Specifies if the instance should be
     * restarted if it was terminated by Compute Engine (not a user).
     * 
     */
    private final Boolean automaticRestart;
    private final Integer minNodeCpus;
    private final List<GetInstanceSchedulingNodeAffinity> nodeAffinities;
    /**
     * Describes maintenance behavior for the
     * instance. One of `MIGRATE` or `TERMINATE`, for more info, read
     * [here](https://cloud.google.com/compute/docs/instances/setting-instance-scheduling-options)
     * 
     */
    private final String onHostMaintenance;
    /**
     * Whether the instance is preemptible.
     * 
     */
    private final Boolean preemptible;

    @OutputCustomType.Constructor({"automaticRestart","minNodeCpus","nodeAffinities","onHostMaintenance","preemptible"})
    private GetInstanceScheduling(
        Boolean automaticRestart,
        Integer minNodeCpus,
        List<GetInstanceSchedulingNodeAffinity> nodeAffinities,
        String onHostMaintenance,
        Boolean preemptible) {
        this.automaticRestart = automaticRestart;
        this.minNodeCpus = minNodeCpus;
        this.nodeAffinities = nodeAffinities;
        this.onHostMaintenance = onHostMaintenance;
        this.preemptible = preemptible;
    }

    /**
     * Specifies if the instance should be
     * restarted if it was terminated by Compute Engine (not a user).
     * 
    */
    public Boolean getAutomaticRestart() {
        return this.automaticRestart;
    }
    public Integer getMinNodeCpus() {
        return this.minNodeCpus;
    }
    public List<GetInstanceSchedulingNodeAffinity> getNodeAffinities() {
        return this.nodeAffinities;
    }
    /**
     * Describes maintenance behavior for the
     * instance. One of `MIGRATE` or `TERMINATE`, for more info, read
     * [here](https://cloud.google.com/compute/docs/instances/setting-instance-scheduling-options)
     * 
    */
    public String getOnHostMaintenance() {
        return this.onHostMaintenance;
    }
    /**
     * Whether the instance is preemptible.
     * 
    */
    public Boolean getPreemptible() {
        return this.preemptible;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceScheduling defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean automaticRestart;
        private Integer minNodeCpus;
        private List<GetInstanceSchedulingNodeAffinity> nodeAffinities;
        private String onHostMaintenance;
        private Boolean preemptible;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceScheduling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticRestart = defaults.automaticRestart;
    	      this.minNodeCpus = defaults.minNodeCpus;
    	      this.nodeAffinities = defaults.nodeAffinities;
    	      this.onHostMaintenance = defaults.onHostMaintenance;
    	      this.preemptible = defaults.preemptible;
        }

        public Builder setAutomaticRestart(Boolean automaticRestart) {
            this.automaticRestart = Objects.requireNonNull(automaticRestart);
            return this;
        }

        public Builder setMinNodeCpus(Integer minNodeCpus) {
            this.minNodeCpus = Objects.requireNonNull(minNodeCpus);
            return this;
        }

        public Builder setNodeAffinities(List<GetInstanceSchedulingNodeAffinity> nodeAffinities) {
            this.nodeAffinities = Objects.requireNonNull(nodeAffinities);
            return this;
        }

        public Builder setOnHostMaintenance(String onHostMaintenance) {
            this.onHostMaintenance = Objects.requireNonNull(onHostMaintenance);
            return this;
        }

        public Builder setPreemptible(Boolean preemptible) {
            this.preemptible = Objects.requireNonNull(preemptible);
            return this;
        }
        public GetInstanceScheduling build() {
            return new GetInstanceScheduling(automaticRestart, minNodeCpus, nodeAffinities, onHostMaintenance, preemptible);
        }
    }
}
