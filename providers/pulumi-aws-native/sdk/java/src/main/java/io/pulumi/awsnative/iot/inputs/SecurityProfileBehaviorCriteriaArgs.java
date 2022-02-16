// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.enums.SecurityProfileBehaviorCriteriaComparisonOperator;
import io.pulumi.awsnative.iot.inputs.SecurityProfileMachineLearningDetectionConfigArgs;
import io.pulumi.awsnative.iot.inputs.SecurityProfileMetricValueArgs;
import io.pulumi.awsnative.iot.inputs.SecurityProfileStatisticalThresholdArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityProfileBehaviorCriteriaArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityProfileBehaviorCriteriaArgs Empty = new SecurityProfileBehaviorCriteriaArgs();

    @InputImport(name="comparisonOperator")
    private final @Nullable Input<SecurityProfileBehaviorCriteriaComparisonOperator> comparisonOperator;

    public Input<SecurityProfileBehaviorCriteriaComparisonOperator> getComparisonOperator() {
        return this.comparisonOperator == null ? Input.empty() : this.comparisonOperator;
    }

    @InputImport(name="consecutiveDatapointsToAlarm")
    private final @Nullable Input<Integer> consecutiveDatapointsToAlarm;

    public Input<Integer> getConsecutiveDatapointsToAlarm() {
        return this.consecutiveDatapointsToAlarm == null ? Input.empty() : this.consecutiveDatapointsToAlarm;
    }

    @InputImport(name="consecutiveDatapointsToClear")
    private final @Nullable Input<Integer> consecutiveDatapointsToClear;

    public Input<Integer> getConsecutiveDatapointsToClear() {
        return this.consecutiveDatapointsToClear == null ? Input.empty() : this.consecutiveDatapointsToClear;
    }

    @InputImport(name="durationSeconds")
    private final @Nullable Input<Integer> durationSeconds;

    public Input<Integer> getDurationSeconds() {
        return this.durationSeconds == null ? Input.empty() : this.durationSeconds;
    }

    @InputImport(name="mlDetectionConfig")
    private final @Nullable Input<SecurityProfileMachineLearningDetectionConfigArgs> mlDetectionConfig;

    public Input<SecurityProfileMachineLearningDetectionConfigArgs> getMlDetectionConfig() {
        return this.mlDetectionConfig == null ? Input.empty() : this.mlDetectionConfig;
    }

    @InputImport(name="statisticalThreshold")
    private final @Nullable Input<SecurityProfileStatisticalThresholdArgs> statisticalThreshold;

    public Input<SecurityProfileStatisticalThresholdArgs> getStatisticalThreshold() {
        return this.statisticalThreshold == null ? Input.empty() : this.statisticalThreshold;
    }

    @InputImport(name="value")
    private final @Nullable Input<SecurityProfileMetricValueArgs> value;

    public Input<SecurityProfileMetricValueArgs> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public SecurityProfileBehaviorCriteriaArgs(
        @Nullable Input<SecurityProfileBehaviorCriteriaComparisonOperator> comparisonOperator,
        @Nullable Input<Integer> consecutiveDatapointsToAlarm,
        @Nullable Input<Integer> consecutiveDatapointsToClear,
        @Nullable Input<Integer> durationSeconds,
        @Nullable Input<SecurityProfileMachineLearningDetectionConfigArgs> mlDetectionConfig,
        @Nullable Input<SecurityProfileStatisticalThresholdArgs> statisticalThreshold,
        @Nullable Input<SecurityProfileMetricValueArgs> value) {
        this.comparisonOperator = comparisonOperator;
        this.consecutiveDatapointsToAlarm = consecutiveDatapointsToAlarm;
        this.consecutiveDatapointsToClear = consecutiveDatapointsToClear;
        this.durationSeconds = durationSeconds;
        this.mlDetectionConfig = mlDetectionConfig;
        this.statisticalThreshold = statisticalThreshold;
        this.value = value;
    }

    private SecurityProfileBehaviorCriteriaArgs() {
        this.comparisonOperator = Input.empty();
        this.consecutiveDatapointsToAlarm = Input.empty();
        this.consecutiveDatapointsToClear = Input.empty();
        this.durationSeconds = Input.empty();
        this.mlDetectionConfig = Input.empty();
        this.statisticalThreshold = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityProfileBehaviorCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SecurityProfileBehaviorCriteriaComparisonOperator> comparisonOperator;
        private @Nullable Input<Integer> consecutiveDatapointsToAlarm;
        private @Nullable Input<Integer> consecutiveDatapointsToClear;
        private @Nullable Input<Integer> durationSeconds;
        private @Nullable Input<SecurityProfileMachineLearningDetectionConfigArgs> mlDetectionConfig;
        private @Nullable Input<SecurityProfileStatisticalThresholdArgs> statisticalThreshold;
        private @Nullable Input<SecurityProfileMetricValueArgs> value;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityProfileBehaviorCriteriaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparisonOperator = defaults.comparisonOperator;
    	      this.consecutiveDatapointsToAlarm = defaults.consecutiveDatapointsToAlarm;
    	      this.consecutiveDatapointsToClear = defaults.consecutiveDatapointsToClear;
    	      this.durationSeconds = defaults.durationSeconds;
    	      this.mlDetectionConfig = defaults.mlDetectionConfig;
    	      this.statisticalThreshold = defaults.statisticalThreshold;
    	      this.value = defaults.value;
        }

        public Builder setComparisonOperator(@Nullable Input<SecurityProfileBehaviorCriteriaComparisonOperator> comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }

        public Builder setComparisonOperator(@Nullable SecurityProfileBehaviorCriteriaComparisonOperator comparisonOperator) {
            this.comparisonOperator = Input.ofNullable(comparisonOperator);
            return this;
        }

        public Builder setConsecutiveDatapointsToAlarm(@Nullable Input<Integer> consecutiveDatapointsToAlarm) {
            this.consecutiveDatapointsToAlarm = consecutiveDatapointsToAlarm;
            return this;
        }

        public Builder setConsecutiveDatapointsToAlarm(@Nullable Integer consecutiveDatapointsToAlarm) {
            this.consecutiveDatapointsToAlarm = Input.ofNullable(consecutiveDatapointsToAlarm);
            return this;
        }

        public Builder setConsecutiveDatapointsToClear(@Nullable Input<Integer> consecutiveDatapointsToClear) {
            this.consecutiveDatapointsToClear = consecutiveDatapointsToClear;
            return this;
        }

        public Builder setConsecutiveDatapointsToClear(@Nullable Integer consecutiveDatapointsToClear) {
            this.consecutiveDatapointsToClear = Input.ofNullable(consecutiveDatapointsToClear);
            return this;
        }

        public Builder setDurationSeconds(@Nullable Input<Integer> durationSeconds) {
            this.durationSeconds = durationSeconds;
            return this;
        }

        public Builder setDurationSeconds(@Nullable Integer durationSeconds) {
            this.durationSeconds = Input.ofNullable(durationSeconds);
            return this;
        }

        public Builder setMlDetectionConfig(@Nullable Input<SecurityProfileMachineLearningDetectionConfigArgs> mlDetectionConfig) {
            this.mlDetectionConfig = mlDetectionConfig;
            return this;
        }

        public Builder setMlDetectionConfig(@Nullable SecurityProfileMachineLearningDetectionConfigArgs mlDetectionConfig) {
            this.mlDetectionConfig = Input.ofNullable(mlDetectionConfig);
            return this;
        }

        public Builder setStatisticalThreshold(@Nullable Input<SecurityProfileStatisticalThresholdArgs> statisticalThreshold) {
            this.statisticalThreshold = statisticalThreshold;
            return this;
        }

        public Builder setStatisticalThreshold(@Nullable SecurityProfileStatisticalThresholdArgs statisticalThreshold) {
            this.statisticalThreshold = Input.ofNullable(statisticalThreshold);
            return this;
        }

        public Builder setValue(@Nullable Input<SecurityProfileMetricValueArgs> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable SecurityProfileMetricValueArgs value) {
            this.value = Input.ofNullable(value);
            return this;
        }

        public SecurityProfileBehaviorCriteriaArgs build() {
            return new SecurityProfileBehaviorCriteriaArgs(comparisonOperator, consecutiveDatapointsToAlarm, consecutiveDatapointsToClear, durationSeconds, mlDetectionConfig, statisticalThreshold, value);
        }
    }
}