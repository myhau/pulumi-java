// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscalingplans.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ScalingPlanScalingInstructionPredefinedLoadMetricSpecificationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScalingPlanScalingInstructionPredefinedLoadMetricSpecificationGetArgs Empty = new ScalingPlanScalingInstructionPredefinedLoadMetricSpecificationGetArgs();

    /**
     * The metric type. Valid values: `ALBTargetGroupRequestCount`, `ASGTotalCPUUtilization`, `ASGTotalNetworkIn`, `ASGTotalNetworkOut`.
     * 
     */
    @InputImport(name="predefinedLoadMetricType", required=true)
      private final Input<String> predefinedLoadMetricType;

    public Input<String> getPredefinedLoadMetricType() {
        return this.predefinedLoadMetricType;
    }

    /**
     * Identifies the resource associated with the metric type.
     * 
     */
    @InputImport(name="resourceLabel")
      private final @Nullable Input<String> resourceLabel;

    public Input<String> getResourceLabel() {
        return this.resourceLabel == null ? Input.empty() : this.resourceLabel;
    }

    public ScalingPlanScalingInstructionPredefinedLoadMetricSpecificationGetArgs(
        Input<String> predefinedLoadMetricType,
        @Nullable Input<String> resourceLabel) {
        this.predefinedLoadMetricType = Objects.requireNonNull(predefinedLoadMetricType, "expected parameter 'predefinedLoadMetricType' to be non-null");
        this.resourceLabel = resourceLabel;
    }

    private ScalingPlanScalingInstructionPredefinedLoadMetricSpecificationGetArgs() {
        this.predefinedLoadMetricType = Input.empty();
        this.resourceLabel = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScalingPlanScalingInstructionPredefinedLoadMetricSpecificationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> predefinedLoadMetricType;
        private @Nullable Input<String> resourceLabel;

        public Builder() {
    	      // Empty
        }

        public Builder(ScalingPlanScalingInstructionPredefinedLoadMetricSpecificationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.predefinedLoadMetricType = defaults.predefinedLoadMetricType;
    	      this.resourceLabel = defaults.resourceLabel;
        }

        public Builder setPredefinedLoadMetricType(Input<String> predefinedLoadMetricType) {
            this.predefinedLoadMetricType = Objects.requireNonNull(predefinedLoadMetricType);
            return this;
        }

        public Builder setPredefinedLoadMetricType(String predefinedLoadMetricType) {
            this.predefinedLoadMetricType = Input.of(Objects.requireNonNull(predefinedLoadMetricType));
            return this;
        }

        public Builder setResourceLabel(@Nullable Input<String> resourceLabel) {
            this.resourceLabel = resourceLabel;
            return this;
        }

        public Builder setResourceLabel(@Nullable String resourceLabel) {
            this.resourceLabel = Input.ofNullable(resourceLabel);
            return this;
        }
        public ScalingPlanScalingInstructionPredefinedLoadMetricSpecificationGetArgs build() {
            return new ScalingPlanScalingInstructionPredefinedLoadMetricSpecificationGetArgs(predefinedLoadMetricType, resourceLabel);
        }
    }
}