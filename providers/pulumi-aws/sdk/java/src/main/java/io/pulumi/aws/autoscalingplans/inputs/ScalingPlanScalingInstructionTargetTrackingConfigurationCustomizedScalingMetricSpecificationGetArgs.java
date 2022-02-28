// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscalingplans.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecificationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecificationGetArgs Empty = new ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecificationGetArgs();

    /**
     * The dimensions of the metric.
     * 
     */
    @InputImport(name="dimensions")
      private final @Nullable Input<Map<String,String>> dimensions;

    public Input<Map<String,String>> getDimensions() {
        return this.dimensions == null ? Input.empty() : this.dimensions;
    }

    /**
     * The name of the metric.
     * 
     */
    @InputImport(name="metricName", required=true)
      private final Input<String> metricName;

    public Input<String> getMetricName() {
        return this.metricName;
    }

    /**
     * The namespace of the metric.
     * 
     */
    @InputImport(name="namespace", required=true)
      private final Input<String> namespace;

    public Input<String> getNamespace() {
        return this.namespace;
    }

    /**
     * The statistic of the metric. Valid values: `Average`, `Maximum`, `Minimum`, `SampleCount`, `Sum`.
     * 
     */
    @InputImport(name="statistic", required=true)
      private final Input<String> statistic;

    public Input<String> getStatistic() {
        return this.statistic;
    }

    /**
     * The unit of the metric.
     * 
     */
    @InputImport(name="unit")
      private final @Nullable Input<String> unit;

    public Input<String> getUnit() {
        return this.unit == null ? Input.empty() : this.unit;
    }

    public ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecificationGetArgs(
        @Nullable Input<Map<String,String>> dimensions,
        Input<String> metricName,
        Input<String> namespace,
        Input<String> statistic,
        @Nullable Input<String> unit) {
        this.dimensions = dimensions;
        this.metricName = Objects.requireNonNull(metricName, "expected parameter 'metricName' to be non-null");
        this.namespace = Objects.requireNonNull(namespace, "expected parameter 'namespace' to be non-null");
        this.statistic = Objects.requireNonNull(statistic, "expected parameter 'statistic' to be non-null");
        this.unit = unit;
    }

    private ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecificationGetArgs() {
        this.dimensions = Input.empty();
        this.metricName = Input.empty();
        this.namespace = Input.empty();
        this.statistic = Input.empty();
        this.unit = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecificationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> dimensions;
        private Input<String> metricName;
        private Input<String> namespace;
        private Input<String> statistic;
        private @Nullable Input<String> unit;

        public Builder() {
    	      // Empty
        }

        public Builder(ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecificationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensions = defaults.dimensions;
    	      this.metricName = defaults.metricName;
    	      this.namespace = defaults.namespace;
    	      this.statistic = defaults.statistic;
    	      this.unit = defaults.unit;
        }

        public Builder setDimensions(@Nullable Input<Map<String,String>> dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public Builder setDimensions(@Nullable Map<String,String> dimensions) {
            this.dimensions = Input.ofNullable(dimensions);
            return this;
        }

        public Builder setMetricName(Input<String> metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }

        public Builder setMetricName(String metricName) {
            this.metricName = Input.of(Objects.requireNonNull(metricName));
            return this;
        }

        public Builder setNamespace(Input<String> namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }

        public Builder setNamespace(String namespace) {
            this.namespace = Input.of(Objects.requireNonNull(namespace));
            return this;
        }

        public Builder setStatistic(Input<String> statistic) {
            this.statistic = Objects.requireNonNull(statistic);
            return this;
        }

        public Builder setStatistic(String statistic) {
            this.statistic = Input.of(Objects.requireNonNull(statistic));
            return this;
        }

        public Builder setUnit(@Nullable Input<String> unit) {
            this.unit = unit;
            return this;
        }

        public Builder setUnit(@Nullable String unit) {
            this.unit = Input.ofNullable(unit);
            return this;
        }
        public ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecificationGetArgs build() {
            return new ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecificationGetArgs(dimensions, metricName, namespace, statistic, unit);
        }
    }
}
