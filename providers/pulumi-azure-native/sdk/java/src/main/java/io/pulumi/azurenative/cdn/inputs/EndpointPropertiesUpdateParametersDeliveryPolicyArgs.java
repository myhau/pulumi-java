// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.DeliveryRuleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A policy that specifies the delivery rules to be used for an endpoint.
 * 
 */
public final class EndpointPropertiesUpdateParametersDeliveryPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointPropertiesUpdateParametersDeliveryPolicyArgs Empty = new EndpointPropertiesUpdateParametersDeliveryPolicyArgs();

    /**
     * User-friendly description of the policy.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * A list of the delivery rules.
     * 
     */
    @Import(name="rules", required=true)
      private final Output<List<DeliveryRuleArgs>> rules;

    public Output<List<DeliveryRuleArgs>> rules() {
        return this.rules;
    }

    public EndpointPropertiesUpdateParametersDeliveryPolicyArgs(
        @Nullable Output<String> description,
        Output<List<DeliveryRuleArgs>> rules) {
        this.description = description;
        this.rules = Objects.requireNonNull(rules, "expected parameter 'rules' to be non-null");
    }

    private EndpointPropertiesUpdateParametersDeliveryPolicyArgs() {
        this.description = Codegen.empty();
        this.rules = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointPropertiesUpdateParametersDeliveryPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<List<DeliveryRuleArgs>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointPropertiesUpdateParametersDeliveryPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.rules = defaults.rules;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder rules(Output<List<DeliveryRuleArgs>> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(List<DeliveryRuleArgs> rules) {
            this.rules = Output.of(Objects.requireNonNull(rules));
            return this;
        }
        public Builder rules(DeliveryRuleArgs... rules) {
            return rules(List.of(rules));
        }        public EndpointPropertiesUpdateParametersDeliveryPolicyArgs build() {
            return new EndpointPropertiesUpdateParametersDeliveryPolicyArgs(description, rules);
        }
    }
}
