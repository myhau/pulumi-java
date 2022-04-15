// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.RequestSchemeMatchConditionParametersArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the RequestScheme condition for the delivery rule.
 * 
 */
public final class DeliveryRuleRequestSchemeConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryRuleRequestSchemeConditionArgs Empty = new DeliveryRuleRequestSchemeConditionArgs();

    /**
     * The name of the condition for the delivery rule.
     * Expected value is 'RequestScheme'.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Defines the parameters for the condition.
     * 
     */
    @Import(name="parameters", required=true)
      private final Output<RequestSchemeMatchConditionParametersArgs> parameters;

    public Output<RequestSchemeMatchConditionParametersArgs> parameters() {
        return this.parameters;
    }

    public DeliveryRuleRequestSchemeConditionArgs(
        Output<String> name,
        Output<RequestSchemeMatchConditionParametersArgs> parameters) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
    }

    private DeliveryRuleRequestSchemeConditionArgs() {
        this.name = Codegen.empty();
        this.parameters = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryRuleRequestSchemeConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private Output<RequestSchemeMatchConditionParametersArgs> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryRuleRequestSchemeConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder parameters(Output<RequestSchemeMatchConditionParametersArgs> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public Builder parameters(RequestSchemeMatchConditionParametersArgs parameters) {
            this.parameters = Output.of(Objects.requireNonNull(parameters));
            return this;
        }        public DeliveryRuleRequestSchemeConditionArgs build() {
            return new DeliveryRuleRequestSchemeConditionArgs(name, parameters);
        }
    }
}
