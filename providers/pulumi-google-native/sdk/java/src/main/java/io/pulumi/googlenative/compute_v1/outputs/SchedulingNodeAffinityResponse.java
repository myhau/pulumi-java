// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class SchedulingNodeAffinityResponse {
    /**
     * Corresponds to the label key of Node resource.
     * 
     */
    private final String key;
    /**
     * Defines the operation of node selection. Valid operators are IN for affinity and NOT_IN for anti-affinity.
     * 
     */
    private final String operator;
    /**
     * Corresponds to the label values of Node resource.
     * 
     */
    private final List<String> values;

    @OutputCustomType.Constructor
    private SchedulingNodeAffinityResponse(
        @OutputCustomType.Parameter("key") String key,
        @OutputCustomType.Parameter("operator") String operator,
        @OutputCustomType.Parameter("values") List<String> values) {
        this.key = key;
        this.operator = operator;
        this.values = values;
    }

    /**
     * Corresponds to the label key of Node resource.
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * Defines the operation of node selection. Valid operators are IN for affinity and NOT_IN for anti-affinity.
     * 
    */
    public String getOperator() {
        return this.operator;
    }
    /**
     * Corresponds to the label values of Node resource.
     * 
    */
    public List<String> getValues() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchedulingNodeAffinityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String operator;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(SchedulingNodeAffinityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.operator = defaults.operator;
    	      this.values = defaults.values;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
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
        public SchedulingNodeAffinityResponse build() {
            return new SchedulingNodeAffinityResponse(key, operator, values);
        }
    }
}
