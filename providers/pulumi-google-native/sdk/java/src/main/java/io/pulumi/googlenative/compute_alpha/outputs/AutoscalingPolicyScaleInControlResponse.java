// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.FixedOrPercentResponse;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class AutoscalingPolicyScaleInControlResponse {
    /**
     * Maximum allowed number (or %) of VMs that can be deducted from the peak recommendation during the window autoscaler looks at when computing recommendations. Possibly all these VMs can be deleted at once so user service needs to be prepared to lose that many VMs in one step.
     * 
     */
    private final FixedOrPercentResponse maxScaledInReplicas;
    /**
     * How far back autoscaling looks when computing recommendations to include directives regarding slower scale in, as described above.
     * 
     */
    private final Integer timeWindowSec;

    @OutputCustomType.Constructor({"maxScaledInReplicas","timeWindowSec"})
    private AutoscalingPolicyScaleInControlResponse(
        FixedOrPercentResponse maxScaledInReplicas,
        Integer timeWindowSec) {
        this.maxScaledInReplicas = maxScaledInReplicas;
        this.timeWindowSec = timeWindowSec;
    }

    /**
     * Maximum allowed number (or %) of VMs that can be deducted from the peak recommendation during the window autoscaler looks at when computing recommendations. Possibly all these VMs can be deleted at once so user service needs to be prepared to lose that many VMs in one step.
     * 
    */
    public FixedOrPercentResponse getMaxScaledInReplicas() {
        return this.maxScaledInReplicas;
    }
    /**
     * How far back autoscaling looks when computing recommendations to include directives regarding slower scale in, as described above.
     * 
    */
    public Integer getTimeWindowSec() {
        return this.timeWindowSec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalingPolicyScaleInControlResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FixedOrPercentResponse maxScaledInReplicas;
        private Integer timeWindowSec;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalingPolicyScaleInControlResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxScaledInReplicas = defaults.maxScaledInReplicas;
    	      this.timeWindowSec = defaults.timeWindowSec;
        }

        public Builder setMaxScaledInReplicas(FixedOrPercentResponse maxScaledInReplicas) {
            this.maxScaledInReplicas = Objects.requireNonNull(maxScaledInReplicas);
            return this;
        }

        public Builder setTimeWindowSec(Integer timeWindowSec) {
            this.timeWindowSec = Objects.requireNonNull(timeWindowSec);
            return this;
        }
        public AutoscalingPolicyScaleInControlResponse build() {
            return new AutoscalingPolicyScaleInControlResponse(maxScaledInReplicas, timeWindowSec);
        }
    }
}
