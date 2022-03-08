// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.azurenative.insights.outputs.MetricDimensionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MetricCriteriaResponse {
    /**
     * Specifies the type of threshold criteria
     * Expected value is 'StaticThresholdCriterion'.
     * 
     */
    private final String criterionType;
    /**
     * List of dimension conditions.
     * 
     */
    private final @Nullable List<MetricDimensionResponse> dimensions;
    /**
     * Name of the metric.
     * 
     */
    private final String metricName;
    /**
     * Namespace of the metric.
     * 
     */
    private final @Nullable String metricNamespace;
    /**
     * Name of the criteria.
     * 
     */
    private final String name;
    /**
     * the criteria operator.
     * 
     */
    private final String operator;
    /**
     * Allows creating an alert rule on a custom metric that isn't yet emitted, by causing the metric validation to be skipped.
     * 
     */
    private final @Nullable Boolean skipMetricValidation;
    /**
     * the criteria threshold value that activates the alert.
     * 
     */
    private final Double threshold;
    /**
     * the criteria time aggregation types.
     * 
     */
    private final String timeAggregation;

    @OutputCustomType.Constructor({"criterionType","dimensions","metricName","metricNamespace","name","operator","skipMetricValidation","threshold","timeAggregation"})
    private MetricCriteriaResponse(
        String criterionType,
        @Nullable List<MetricDimensionResponse> dimensions,
        String metricName,
        @Nullable String metricNamespace,
        String name,
        String operator,
        @Nullable Boolean skipMetricValidation,
        Double threshold,
        String timeAggregation) {
        this.criterionType = criterionType;
        this.dimensions = dimensions;
        this.metricName = metricName;
        this.metricNamespace = metricNamespace;
        this.name = name;
        this.operator = operator;
        this.skipMetricValidation = skipMetricValidation;
        this.threshold = threshold;
        this.timeAggregation = timeAggregation;
    }

    /**
     * Specifies the type of threshold criteria
     * Expected value is 'StaticThresholdCriterion'.
     * 
    */
    public String getCriterionType() {
        return this.criterionType;
    }
    /**
     * List of dimension conditions.
     * 
    */
    public List<MetricDimensionResponse> getDimensions() {
        return this.dimensions == null ? List.of() : this.dimensions;
    }
    /**
     * Name of the metric.
     * 
    */
    public String getMetricName() {
        return this.metricName;
    }
    /**
     * Namespace of the metric.
     * 
    */
    public Optional<String> getMetricNamespace() {
        return Optional.ofNullable(this.metricNamespace);
    }
    /**
     * Name of the criteria.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * the criteria operator.
     * 
    */
    public String getOperator() {
        return this.operator;
    }
    /**
     * Allows creating an alert rule on a custom metric that isn't yet emitted, by causing the metric validation to be skipped.
     * 
    */
    public Optional<Boolean> getSkipMetricValidation() {
        return Optional.ofNullable(this.skipMetricValidation);
    }
    /**
     * the criteria threshold value that activates the alert.
     * 
    */
    public Double getThreshold() {
        return this.threshold;
    }
    /**
     * the criteria time aggregation types.
     * 
    */
    public String getTimeAggregation() {
        return this.timeAggregation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricCriteriaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String criterionType;
        private @Nullable List<MetricDimensionResponse> dimensions;
        private String metricName;
        private @Nullable String metricNamespace;
        private String name;
        private String operator;
        private @Nullable Boolean skipMetricValidation;
        private Double threshold;
        private String timeAggregation;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricCriteriaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.criterionType = defaults.criterionType;
    	      this.dimensions = defaults.dimensions;
    	      this.metricName = defaults.metricName;
    	      this.metricNamespace = defaults.metricNamespace;
    	      this.name = defaults.name;
    	      this.operator = defaults.operator;
    	      this.skipMetricValidation = defaults.skipMetricValidation;
    	      this.threshold = defaults.threshold;
    	      this.timeAggregation = defaults.timeAggregation;
        }

        public Builder setCriterionType(String criterionType) {
            this.criterionType = Objects.requireNonNull(criterionType);
            return this;
        }

        public Builder setDimensions(@Nullable List<MetricDimensionResponse> dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public Builder setMetricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }

        public Builder setMetricNamespace(@Nullable String metricNamespace) {
            this.metricNamespace = metricNamespace;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOperator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }

        public Builder setSkipMetricValidation(@Nullable Boolean skipMetricValidation) {
            this.skipMetricValidation = skipMetricValidation;
            return this;
        }

        public Builder setThreshold(Double threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }

        public Builder setTimeAggregation(String timeAggregation) {
            this.timeAggregation = Objects.requireNonNull(timeAggregation);
            return this;
        }
        public MetricCriteriaResponse build() {
            return new MetricCriteriaResponse(criterionType, dimensions, metricName, metricNamespace, name, operator, skipMetricValidation, threshold, timeAggregation);
        }
    }
}
