// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class MetricRuleResponse {
    /**
     * Metrics to update when the selected methods are called, and the associated cost applied to each metric. The key of the map is the metric name, and the values are the amount increased for the metric against which the quota limits are defined. The value must not be negative.
     * 
     */
    private final Map<String,String> metricCosts;
    /**
     * Selects the methods to which this rule applies. Refer to selector for syntax details.
     * 
     */
    private final String selector;

    @OutputCustomType.Constructor({"metricCosts","selector"})
    private MetricRuleResponse(
        Map<String,String> metricCosts,
        String selector) {
        this.metricCosts = metricCosts;
        this.selector = selector;
    }

    /**
     * Metrics to update when the selected methods are called, and the associated cost applied to each metric. The key of the map is the metric name, and the values are the amount increased for the metric against which the quota limits are defined. The value must not be negative.
     * 
    */
    public Map<String,String> getMetricCosts() {
        return this.metricCosts;
    }
    /**
     * Selects the methods to which this rule applies. Refer to selector for syntax details.
     * 
    */
    public String getSelector() {
        return this.selector;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> metricCosts;
        private String selector;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricCosts = defaults.metricCosts;
    	      this.selector = defaults.selector;
        }

        public Builder setMetricCosts(Map<String,String> metricCosts) {
            this.metricCosts = Objects.requireNonNull(metricCosts);
            return this;
        }

        public Builder setSelector(String selector) {
            this.selector = Objects.requireNonNull(selector);
            return this;
        }
        public MetricRuleResponse build() {
            return new MetricRuleResponse(metricCosts, selector);
        }
    }
}
