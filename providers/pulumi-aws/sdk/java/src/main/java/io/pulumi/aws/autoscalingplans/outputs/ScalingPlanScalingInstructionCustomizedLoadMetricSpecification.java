// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscalingplans.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ScalingPlanScalingInstructionCustomizedLoadMetricSpecification {
    /**
     * The dimensions of the metric.
     * 
     */
    private final @Nullable Map<String,String> dimensions;
    /**
     * The name of the metric.
     * 
     */
    private final String metricName;
    /**
     * The namespace of the metric.
     * 
     */
    private final String namespace;
    /**
     * The statistic of the metric. Currently, the value must always be `Sum`.
     * 
     */
    private final String statistic;
    /**
     * The unit of the metric.
     * 
     */
    private final @Nullable String unit;

    @OutputCustomType.Constructor({"dimensions","metricName","namespace","statistic","unit"})
    private ScalingPlanScalingInstructionCustomizedLoadMetricSpecification(
        @Nullable Map<String,String> dimensions,
        String metricName,
        String namespace,
        String statistic,
        @Nullable String unit) {
        this.dimensions = dimensions;
        this.metricName = Objects.requireNonNull(metricName);
        this.namespace = Objects.requireNonNull(namespace);
        this.statistic = Objects.requireNonNull(statistic);
        this.unit = unit;
    }

    /**
     * The dimensions of the metric.
     * 
     */
    public Map<String,String> getDimensions() {
        return this.dimensions == null ? Map.of() : this.dimensions;
    }
    /**
     * The name of the metric.
     * 
     */
    public String getMetricName() {
        return this.metricName;
    }
    /**
     * The namespace of the metric.
     * 
     */
    public String getNamespace() {
        return this.namespace;
    }
    /**
     * The statistic of the metric. Currently, the value must always be `Sum`.
     * 
     */
    public String getStatistic() {
        return this.statistic;
    }
    /**
     * The unit of the metric.
     * 
     */
    public Optional<String> getUnit() {
        return Optional.ofNullable(this.unit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScalingPlanScalingInstructionCustomizedLoadMetricSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> dimensions;
        private String metricName;
        private String namespace;
        private String statistic;
        private @Nullable String unit;

        public Builder() {
    	      // Empty
        }

        public Builder(ScalingPlanScalingInstructionCustomizedLoadMetricSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensions = defaults.dimensions;
    	      this.metricName = defaults.metricName;
    	      this.namespace = defaults.namespace;
    	      this.statistic = defaults.statistic;
    	      this.unit = defaults.unit;
        }

        public Builder setDimensions(@Nullable Map<String,String> dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public Builder setMetricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }

        public Builder setNamespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }

        public Builder setStatistic(String statistic) {
            this.statistic = Objects.requireNonNull(statistic);
            return this;
        }

        public Builder setUnit(@Nullable String unit) {
            this.unit = unit;
            return this;
        }
        public ScalingPlanScalingInstructionCustomizedLoadMetricSpecification build() {
            return new ScalingPlanScalingInstructionCustomizedLoadMetricSpecification(dimensions, metricName, namespace, statistic, unit);
        }
    }
}
