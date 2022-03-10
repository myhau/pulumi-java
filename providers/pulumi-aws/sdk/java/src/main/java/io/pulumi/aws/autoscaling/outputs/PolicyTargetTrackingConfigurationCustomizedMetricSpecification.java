// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling.outputs;

import io.pulumi.aws.autoscaling.outputs.PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PolicyTargetTrackingConfigurationCustomizedMetricSpecification {
    /**
     * The dimensions of the metric.
     * 
     */
    private final @Nullable List<PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension> metricDimensions;
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
     * The statistic of the metric.
     * 
     */
    private final String statistic;
    /**
     * The unit of the metric.
     * 
     */
    private final @Nullable String unit;

    @OutputCustomType.Constructor({"metricDimensions","metricName","namespace","statistic","unit"})
    private PolicyTargetTrackingConfigurationCustomizedMetricSpecification(
        @Nullable List<PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension> metricDimensions,
        String metricName,
        String namespace,
        String statistic,
        @Nullable String unit) {
        this.metricDimensions = metricDimensions;
        this.metricName = metricName;
        this.namespace = namespace;
        this.statistic = statistic;
        this.unit = unit;
    }

    /**
     * The dimensions of the metric.
     * 
    */
    public List<PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension> getMetricDimensions() {
        return this.metricDimensions == null ? List.of() : this.metricDimensions;
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
     * The statistic of the metric.
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

    public static Builder builder(PolicyTargetTrackingConfigurationCustomizedMetricSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension> metricDimensions;
        private String metricName;
        private String namespace;
        private String statistic;
        private @Nullable String unit;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyTargetTrackingConfigurationCustomizedMetricSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricDimensions = defaults.metricDimensions;
    	      this.metricName = defaults.metricName;
    	      this.namespace = defaults.namespace;
    	      this.statistic = defaults.statistic;
    	      this.unit = defaults.unit;
        }

        public Builder setMetricDimensions(@Nullable List<PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension> metricDimensions) {
            this.metricDimensions = metricDimensions;
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
        public PolicyTargetTrackingConfigurationCustomizedMetricSpecification build() {
            return new PolicyTargetTrackingConfigurationCustomizedMetricSpecification(metricDimensions, metricName, namespace, statistic, unit);
        }
    }
}