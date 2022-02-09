// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_v1.outputs.SchedulingNodeAffinityResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class SchedulingResponse {
    private final Boolean automaticRestart;
    private final String instanceTerminationAction;
    private final String locationHint;
    private final Integer minNodeCpus;
    private final List<SchedulingNodeAffinityResponse> nodeAffinities;
    private final String onHostMaintenance;
    private final Boolean preemptible;
    private final String provisioningModel;

    @OutputCustomType.Constructor({"automaticRestart","instanceTerminationAction","locationHint","minNodeCpus","nodeAffinities","onHostMaintenance","preemptible","provisioningModel"})
    private SchedulingResponse(
        Boolean automaticRestart,
        String instanceTerminationAction,
        String locationHint,
        Integer minNodeCpus,
        List<SchedulingNodeAffinityResponse> nodeAffinities,
        String onHostMaintenance,
        Boolean preemptible,
        String provisioningModel) {
        this.automaticRestart = Objects.requireNonNull(automaticRestart);
        this.instanceTerminationAction = Objects.requireNonNull(instanceTerminationAction);
        this.locationHint = Objects.requireNonNull(locationHint);
        this.minNodeCpus = Objects.requireNonNull(minNodeCpus);
        this.nodeAffinities = Objects.requireNonNull(nodeAffinities);
        this.onHostMaintenance = Objects.requireNonNull(onHostMaintenance);
        this.preemptible = Objects.requireNonNull(preemptible);
        this.provisioningModel = Objects.requireNonNull(provisioningModel);
    }

    public Boolean getAutomaticRestart() {
        return this.automaticRestart;
    }
    public String getInstanceTerminationAction() {
        return this.instanceTerminationAction;
    }
    public String getLocationHint() {
        return this.locationHint;
    }
    public Integer getMinNodeCpus() {
        return this.minNodeCpus;
    }
    public List<SchedulingNodeAffinityResponse> getNodeAffinities() {
        return this.nodeAffinities;
    }
    public String getOnHostMaintenance() {
        return this.onHostMaintenance;
    }
    public Boolean getPreemptible() {
        return this.preemptible;
    }
    public String getProvisioningModel() {
        return this.provisioningModel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchedulingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean automaticRestart;
        private String instanceTerminationAction;
        private String locationHint;
        private Integer minNodeCpus;
        private List<SchedulingNodeAffinityResponse> nodeAffinities;
        private String onHostMaintenance;
        private Boolean preemptible;
        private String provisioningModel;

        public Builder() {
    	      // Empty
        }

        public Builder(SchedulingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticRestart = defaults.automaticRestart;
    	      this.instanceTerminationAction = defaults.instanceTerminationAction;
    	      this.locationHint = defaults.locationHint;
    	      this.minNodeCpus = defaults.minNodeCpus;
    	      this.nodeAffinities = defaults.nodeAffinities;
    	      this.onHostMaintenance = defaults.onHostMaintenance;
    	      this.preemptible = defaults.preemptible;
    	      this.provisioningModel = defaults.provisioningModel;
        }

        public Builder setAutomaticRestart(Boolean automaticRestart) {
            this.automaticRestart = Objects.requireNonNull(automaticRestart);
            return this;
        }

        public Builder setInstanceTerminationAction(String instanceTerminationAction) {
            this.instanceTerminationAction = Objects.requireNonNull(instanceTerminationAction);
            return this;
        }

        public Builder setLocationHint(String locationHint) {
            this.locationHint = Objects.requireNonNull(locationHint);
            return this;
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

        public Builder setPreemptible(Boolean preemptible) {
            this.preemptible = Objects.requireNonNull(preemptible);
            return this;
        }

        public Builder setProvisioningModel(String provisioningModel) {
            this.provisioningModel = Objects.requireNonNull(provisioningModel);
            return this;
        }

        public SchedulingResponse build() {
            return new SchedulingResponse(automaticRestart, instanceTerminationAction, locationHint, minNodeCpus, nodeAffinities, onHostMaintenance, preemptible, provisioningModel);
        }
    }
}