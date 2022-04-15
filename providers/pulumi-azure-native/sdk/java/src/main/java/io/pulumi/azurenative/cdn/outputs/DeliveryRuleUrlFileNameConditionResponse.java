// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.UrlFileNameMatchConditionParametersResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DeliveryRuleUrlFileNameConditionResponse {
    /**
     * The name of the condition for the delivery rule.
     * Expected value is 'UrlFileName'.
     * 
     */
    private final String name;
    /**
     * Defines the parameters for the condition.
     * 
     */
    private final UrlFileNameMatchConditionParametersResponse parameters;

    @CustomType.Constructor
    private DeliveryRuleUrlFileNameConditionResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parameters") UrlFileNameMatchConditionParametersResponse parameters) {
        this.name = name;
        this.parameters = parameters;
    }

    /**
     * The name of the condition for the delivery rule.
     * Expected value is 'UrlFileName'.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Defines the parameters for the condition.
     * 
    */
    public UrlFileNameMatchConditionParametersResponse parameters() {
        return this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryRuleUrlFileNameConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private UrlFileNameMatchConditionParametersResponse parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryRuleUrlFileNameConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parameters(UrlFileNameMatchConditionParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }        public DeliveryRuleUrlFileNameConditionResponse build() {
            return new DeliveryRuleUrlFileNameConditionResponse(name, parameters);
        }
    }
}
