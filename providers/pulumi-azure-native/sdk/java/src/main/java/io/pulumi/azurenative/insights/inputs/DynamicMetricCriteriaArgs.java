// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.enums.AggregationTypeEnum;
import io.pulumi.azurenative.insights.enums.DynamicThresholdOperator;
import io.pulumi.azurenative.insights.enums.DynamicThresholdSensitivity;
import io.pulumi.azurenative.insights.inputs.DynamicThresholdFailingPeriodsArgs;
import io.pulumi.azurenative.insights.inputs.MetricDimensionArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Criterion for dynamic threshold.
 * 
 */
public final class DynamicMetricCriteriaArgs extends io.pulumi.resources.ResourceArgs {

    public static final DynamicMetricCriteriaArgs Empty = new DynamicMetricCriteriaArgs();

    /**
     * The extent of deviation required to trigger an alert. This will affect how tight the threshold is to the metric series pattern.
     * 
     */
    @Import(name="alertSensitivity", required=true)
      private final Output<Either<String,DynamicThresholdSensitivity>> alertSensitivity;

    public Output<Either<String,DynamicThresholdSensitivity>> alertSensitivity() {
        return this.alertSensitivity;
    }

    /**
     * Specifies the type of threshold criteria
     * Expected value is 'DynamicThresholdCriterion'.
     * 
     */
    @Import(name="criterionType", required=true)
      private final Output<String> criterionType;

    public Output<String> criterionType() {
        return this.criterionType;
    }

    /**
     * List of dimension conditions.
     * 
     */
    @Import(name="dimensions")
      private final @Nullable Output<List<MetricDimensionArgs>> dimensions;

    public Output<List<MetricDimensionArgs>> dimensions() {
        return this.dimensions == null ? Codegen.empty() : this.dimensions;
    }

    /**
     * The minimum number of violations required within the selected lookback time window required to raise an alert.
     * 
     */
    @Import(name="failingPeriods", required=true)
      private final Output<DynamicThresholdFailingPeriodsArgs> failingPeriods;

    public Output<DynamicThresholdFailingPeriodsArgs> failingPeriods() {
        return this.failingPeriods;
    }

    /**
     * Use this option to set the date from which to start learning the metric historical data and calculate the dynamic thresholds (in ISO8601 format)
     * 
     */
    @Import(name="ignoreDataBefore")
      private final @Nullable Output<String> ignoreDataBefore;

    public Output<String> ignoreDataBefore() {
        return this.ignoreDataBefore == null ? Codegen.empty() : this.ignoreDataBefore;
    }

    /**
     * Name of the metric.
     * 
     */
    @Import(name="metricName", required=true)
      private final Output<String> metricName;

    public Output<String> metricName() {
        return this.metricName;
    }

    /**
     * Namespace of the metric.
     * 
     */
    @Import(name="metricNamespace")
      private final @Nullable Output<String> metricNamespace;

    public Output<String> metricNamespace() {
        return this.metricNamespace == null ? Codegen.empty() : this.metricNamespace;
    }

    /**
     * Name of the criteria.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * The operator used to compare the metric value against the threshold.
     * 
     */
    @Import(name="operator", required=true)
      private final Output<Either<String,DynamicThresholdOperator>> operator;

    public Output<Either<String,DynamicThresholdOperator>> operator() {
        return this.operator;
    }

    /**
     * Allows creating an alert rule on a custom metric that isn't yet emitted, by causing the metric validation to be skipped.
     * 
     */
    @Import(name="skipMetricValidation")
      private final @Nullable Output<Boolean> skipMetricValidation;

    public Output<Boolean> skipMetricValidation() {
        return this.skipMetricValidation == null ? Codegen.empty() : this.skipMetricValidation;
    }

    /**
     * the criteria time aggregation types.
     * 
     */
    @Import(name="timeAggregation", required=true)
      private final Output<Either<String,AggregationTypeEnum>> timeAggregation;

    public Output<Either<String,AggregationTypeEnum>> timeAggregation() {
        return this.timeAggregation;
    }

    public DynamicMetricCriteriaArgs(
        Output<Either<String,DynamicThresholdSensitivity>> alertSensitivity,
        Output<String> criterionType,
        @Nullable Output<List<MetricDimensionArgs>> dimensions,
        Output<DynamicThresholdFailingPeriodsArgs> failingPeriods,
        @Nullable Output<String> ignoreDataBefore,
        Output<String> metricName,
        @Nullable Output<String> metricNamespace,
        Output<String> name,
        Output<Either<String,DynamicThresholdOperator>> operator,
        @Nullable Output<Boolean> skipMetricValidation,
        Output<Either<String,AggregationTypeEnum>> timeAggregation) {
        this.alertSensitivity = Objects.requireNonNull(alertSensitivity, "expected parameter 'alertSensitivity' to be non-null");
        this.criterionType = Objects.requireNonNull(criterionType, "expected parameter 'criterionType' to be non-null");
        this.dimensions = dimensions;
        this.failingPeriods = Objects.requireNonNull(failingPeriods, "expected parameter 'failingPeriods' to be non-null");
        this.ignoreDataBefore = ignoreDataBefore;
        this.metricName = Objects.requireNonNull(metricName, "expected parameter 'metricName' to be non-null");
        this.metricNamespace = metricNamespace;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.operator = Objects.requireNonNull(operator, "expected parameter 'operator' to be non-null");
        this.skipMetricValidation = skipMetricValidation;
        this.timeAggregation = Objects.requireNonNull(timeAggregation, "expected parameter 'timeAggregation' to be non-null");
    }

    private DynamicMetricCriteriaArgs() {
        this.alertSensitivity = Codegen.empty();
        this.criterionType = Codegen.empty();
        this.dimensions = Codegen.empty();
        this.failingPeriods = Codegen.empty();
        this.ignoreDataBefore = Codegen.empty();
        this.metricName = Codegen.empty();
        this.metricNamespace = Codegen.empty();
        this.name = Codegen.empty();
        this.operator = Codegen.empty();
        this.skipMetricValidation = Codegen.empty();
        this.timeAggregation = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DynamicMetricCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,DynamicThresholdSensitivity>> alertSensitivity;
        private Output<String> criterionType;
        private @Nullable Output<List<MetricDimensionArgs>> dimensions;
        private Output<DynamicThresholdFailingPeriodsArgs> failingPeriods;
        private @Nullable Output<String> ignoreDataBefore;
        private Output<String> metricName;
        private @Nullable Output<String> metricNamespace;
        private Output<String> name;
        private Output<Either<String,DynamicThresholdOperator>> operator;
        private @Nullable Output<Boolean> skipMetricValidation;
        private Output<Either<String,AggregationTypeEnum>> timeAggregation;

        public Builder() {
    	      // Empty
        }

        public Builder(DynamicMetricCriteriaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertSensitivity = defaults.alertSensitivity;
    	      this.criterionType = defaults.criterionType;
    	      this.dimensions = defaults.dimensions;
    	      this.failingPeriods = defaults.failingPeriods;
    	      this.ignoreDataBefore = defaults.ignoreDataBefore;
    	      this.metricName = defaults.metricName;
    	      this.metricNamespace = defaults.metricNamespace;
    	      this.name = defaults.name;
    	      this.operator = defaults.operator;
    	      this.skipMetricValidation = defaults.skipMetricValidation;
    	      this.timeAggregation = defaults.timeAggregation;
        }

        public Builder alertSensitivity(Output<Either<String,DynamicThresholdSensitivity>> alertSensitivity) {
            this.alertSensitivity = Objects.requireNonNull(alertSensitivity);
            return this;
        }
        public Builder alertSensitivity(Either<String,DynamicThresholdSensitivity> alertSensitivity) {
            this.alertSensitivity = Output.of(Objects.requireNonNull(alertSensitivity));
            return this;
        }
        public Builder criterionType(Output<String> criterionType) {
            this.criterionType = Objects.requireNonNull(criterionType);
            return this;
        }
        public Builder criterionType(String criterionType) {
            this.criterionType = Output.of(Objects.requireNonNull(criterionType));
            return this;
        }
        public Builder dimensions(@Nullable Output<List<MetricDimensionArgs>> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public Builder dimensions(@Nullable List<MetricDimensionArgs> dimensions) {
            this.dimensions = Codegen.ofNullable(dimensions);
            return this;
        }
        public Builder dimensions(MetricDimensionArgs... dimensions) {
            return dimensions(List.of(dimensions));
        }
        public Builder failingPeriods(Output<DynamicThresholdFailingPeriodsArgs> failingPeriods) {
            this.failingPeriods = Objects.requireNonNull(failingPeriods);
            return this;
        }
        public Builder failingPeriods(DynamicThresholdFailingPeriodsArgs failingPeriods) {
            this.failingPeriods = Output.of(Objects.requireNonNull(failingPeriods));
            return this;
        }
        public Builder ignoreDataBefore(@Nullable Output<String> ignoreDataBefore) {
            this.ignoreDataBefore = ignoreDataBefore;
            return this;
        }
        public Builder ignoreDataBefore(@Nullable String ignoreDataBefore) {
            this.ignoreDataBefore = Codegen.ofNullable(ignoreDataBefore);
            return this;
        }
        public Builder metricName(Output<String> metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }
        public Builder metricName(String metricName) {
            this.metricName = Output.of(Objects.requireNonNull(metricName));
            return this;
        }
        public Builder metricNamespace(@Nullable Output<String> metricNamespace) {
            this.metricNamespace = metricNamespace;
            return this;
        }
        public Builder metricNamespace(@Nullable String metricNamespace) {
            this.metricNamespace = Codegen.ofNullable(metricNamespace);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder operator(Output<Either<String,DynamicThresholdOperator>> operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }
        public Builder operator(Either<String,DynamicThresholdOperator> operator) {
            this.operator = Output.of(Objects.requireNonNull(operator));
            return this;
        }
        public Builder skipMetricValidation(@Nullable Output<Boolean> skipMetricValidation) {
            this.skipMetricValidation = skipMetricValidation;
            return this;
        }
        public Builder skipMetricValidation(@Nullable Boolean skipMetricValidation) {
            this.skipMetricValidation = Codegen.ofNullable(skipMetricValidation);
            return this;
        }
        public Builder timeAggregation(Output<Either<String,AggregationTypeEnum>> timeAggregation) {
            this.timeAggregation = Objects.requireNonNull(timeAggregation);
            return this;
        }
        public Builder timeAggregation(Either<String,AggregationTypeEnum> timeAggregation) {
            this.timeAggregation = Output.of(Objects.requireNonNull(timeAggregation));
            return this;
        }        public DynamicMetricCriteriaArgs build() {
            return new DynamicMetricCriteriaArgs(alertSensitivity, criterionType, dimensions, failingPeriods, ignoreDataBefore, metricName, metricNamespace, name, operator, skipMetricValidation, timeAggregation);
        }
    }
}
