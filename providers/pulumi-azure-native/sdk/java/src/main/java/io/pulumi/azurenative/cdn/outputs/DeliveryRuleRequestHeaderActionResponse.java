// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.HeaderActionParametersResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DeliveryRuleRequestHeaderActionResponse {
    /**
     * The name of the action for the delivery rule.
     * Expected value is 'ModifyRequestHeader'.
     * 
     */
    private final String name;
    /**
     * Defines the parameters for the action.
     * 
     */
    private final HeaderActionParametersResponse parameters;

    @OutputCustomType.Constructor({"name","parameters"})
    private DeliveryRuleRequestHeaderActionResponse(
        String name,
        HeaderActionParametersResponse parameters) {
        this.name = name;
        this.parameters = parameters;
    }

    /**
     * The name of the action for the delivery rule.
     * Expected value is 'ModifyRequestHeader'.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Defines the parameters for the action.
     * 
    */
    public HeaderActionParametersResponse getParameters() {
        return this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryRuleRequestHeaderActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private HeaderActionParametersResponse parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryRuleRequestHeaderActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParameters(HeaderActionParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public DeliveryRuleRequestHeaderActionResponse build() {
            return new DeliveryRuleRequestHeaderActionResponse(name, parameters);
        }
    }
}
