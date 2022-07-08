// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigtableadmin.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.bigtableadmin.v2.outputs.AutoscalingLimitsResponse;
import com.pulumi.googlenative.bigtableadmin.v2.outputs.AutoscalingTargetsResponse;
import java.util.Objects;

@CustomType
public final class ClusterAutoscalingConfigResponse {
    /**
     * @return Autoscaling limits for this cluster.
     * 
     */
    private final AutoscalingLimitsResponse autoscalingLimits;
    /**
     * @return Autoscaling targets for this cluster.
     * 
     */
    private final AutoscalingTargetsResponse autoscalingTargets;

    @CustomType.Constructor
    private ClusterAutoscalingConfigResponse(
        @CustomType.Parameter("autoscalingLimits") AutoscalingLimitsResponse autoscalingLimits,
        @CustomType.Parameter("autoscalingTargets") AutoscalingTargetsResponse autoscalingTargets) {
        this.autoscalingLimits = autoscalingLimits;
        this.autoscalingTargets = autoscalingTargets;
    }

    /**
     * @return Autoscaling limits for this cluster.
     * 
     */
    public AutoscalingLimitsResponse autoscalingLimits() {
        return this.autoscalingLimits;
    }
    /**
     * @return Autoscaling targets for this cluster.
     * 
     */
    public AutoscalingTargetsResponse autoscalingTargets() {
        return this.autoscalingTargets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAutoscalingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoscalingLimitsResponse autoscalingLimits;
        private AutoscalingTargetsResponse autoscalingTargets;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterAutoscalingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalingLimits = defaults.autoscalingLimits;
    	      this.autoscalingTargets = defaults.autoscalingTargets;
        }

        public Builder autoscalingLimits(AutoscalingLimitsResponse autoscalingLimits) {
            this.autoscalingLimits = Objects.requireNonNull(autoscalingLimits);
            return this;
        }
        public Builder autoscalingTargets(AutoscalingTargetsResponse autoscalingTargets) {
            this.autoscalingTargets = Objects.requireNonNull(autoscalingTargets);
            return this;
        }        public ClusterAutoscalingConfigResponse build() {
            return new ClusterAutoscalingConfigResponse(autoscalingLimits, autoscalingTargets);
        }
    }
}
