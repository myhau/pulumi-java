// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ScaleRuleMetricDimensionResponse {
    /**
     * Name of the dimension.
     * 
     */
    private final String dimensionName;
    /**
     * the dimension operator. Only 'Equals' and 'NotEquals' are supported. 'Equals' being equal to any of the values. 'NotEquals' being not equal to all of the values
     * 
     */
    private final String operator;
    /**
     * list of dimension values. For example: ["App1","App2"].
     * 
     */
    private final List<String> values;

    @OutputCustomType.Constructor({"dimensionName","operator","values"})
    private ScaleRuleMetricDimensionResponse(
        String dimensionName,
        String operator,
        List<String> values) {
        this.dimensionName = dimensionName;
        this.operator = operator;
        this.values = values;
    }

    /**
     * Name of the dimension.
     * 
    */
    public String getDimensionName() {
        return this.dimensionName;
    }
    /**
     * the dimension operator. Only 'Equals' and 'NotEquals' are supported. 'Equals' being equal to any of the values. 'NotEquals' being not equal to all of the values
     * 
    */
    public String getOperator() {
        return this.operator;
    }
    /**
     * list of dimension values. For example: ["App1","App2"].
     * 
    */
    public List<String> getValues() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleRuleMetricDimensionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dimensionName;
        private String operator;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ScaleRuleMetricDimensionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensionName = defaults.dimensionName;
    	      this.operator = defaults.operator;
    	      this.values = defaults.values;
        }

        public Builder setDimensionName(String dimensionName) {
            this.dimensionName = Objects.requireNonNull(dimensionName);
            return this;
        }

        public Builder setOperator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }

        public Builder setValues(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public ScaleRuleMetricDimensionResponse build() {
            return new ScaleRuleMetricDimensionResponse(dimensionName, operator, values);
        }
    }
}
