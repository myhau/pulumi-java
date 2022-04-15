// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.RequestMethodMatchConditionParametersResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DeliveryRuleRequestMethodConditionResponse {
    /**
     * The name of the condition for the delivery rule.
     * Expected value is 'RequestMethod'.
     * 
     */
    private final String name;
    /**
     * Defines the parameters for the condition.
     * 
     */
    private final RequestMethodMatchConditionParametersResponse parameters;

    @CustomType.Constructor
    private DeliveryRuleRequestMethodConditionResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parameters") RequestMethodMatchConditionParametersResponse parameters) {
        this.name = name;
        this.parameters = parameters;
    }

    /**
     * The name of the condition for the delivery rule.
     * Expected value is 'RequestMethod'.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Defines the parameters for the condition.
     * 
    */
    public RequestMethodMatchConditionParametersResponse parameters() {
        return this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryRuleRequestMethodConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private RequestMethodMatchConditionParametersResponse parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryRuleRequestMethodConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parameters(RequestMethodMatchConditionParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }        public DeliveryRuleRequestMethodConditionResponse build() {
            return new DeliveryRuleRequestMethodConditionResponse(name, parameters);
        }
    }
}
