// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.azurenative.securityinsights.inputs.AutomationRuleRunPlaybookActionActionConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Describes an automation rule action to run a playbook
 * 
 */
public final class AutomationRuleRunPlaybookActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutomationRuleRunPlaybookActionArgs Empty = new AutomationRuleRunPlaybookActionArgs();

    /**
     * The configuration of the run playbook automation rule action
     * 
     */
    @Import(name="actionConfiguration", required=true)
      private final Output<AutomationRuleRunPlaybookActionActionConfigurationArgs> actionConfiguration;

    public Output<AutomationRuleRunPlaybookActionActionConfigurationArgs> actionConfiguration() {
        return this.actionConfiguration;
    }

    /**
     * The type of the automation rule action
     * Expected value is 'RunPlaybook'.
     * 
     */
    @Import(name="actionType", required=true)
      private final Output<String> actionType;

    public Output<String> actionType() {
        return this.actionType;
    }

    /**
     * The order of execution of the automation rule action
     * 
     */
    @Import(name="order", required=true)
      private final Output<Integer> order;

    public Output<Integer> order() {
        return this.order;
    }

    public AutomationRuleRunPlaybookActionArgs(
        Output<AutomationRuleRunPlaybookActionActionConfigurationArgs> actionConfiguration,
        Output<String> actionType,
        Output<Integer> order) {
        this.actionConfiguration = Objects.requireNonNull(actionConfiguration, "expected parameter 'actionConfiguration' to be non-null");
        this.actionType = Objects.requireNonNull(actionType, "expected parameter 'actionType' to be non-null");
        this.order = Objects.requireNonNull(order, "expected parameter 'order' to be non-null");
    }

    private AutomationRuleRunPlaybookActionArgs() {
        this.actionConfiguration = Codegen.empty();
        this.actionType = Codegen.empty();
        this.order = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationRuleRunPlaybookActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<AutomationRuleRunPlaybookActionActionConfigurationArgs> actionConfiguration;
        private Output<String> actionType;
        private Output<Integer> order;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationRuleRunPlaybookActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionConfiguration = defaults.actionConfiguration;
    	      this.actionType = defaults.actionType;
    	      this.order = defaults.order;
        }

        public Builder actionConfiguration(Output<AutomationRuleRunPlaybookActionActionConfigurationArgs> actionConfiguration) {
            this.actionConfiguration = Objects.requireNonNull(actionConfiguration);
            return this;
        }
        public Builder actionConfiguration(AutomationRuleRunPlaybookActionActionConfigurationArgs actionConfiguration) {
            this.actionConfiguration = Output.of(Objects.requireNonNull(actionConfiguration));
            return this;
        }
        public Builder actionType(Output<String> actionType) {
            this.actionType = Objects.requireNonNull(actionType);
            return this;
        }
        public Builder actionType(String actionType) {
            this.actionType = Output.of(Objects.requireNonNull(actionType));
            return this;
        }
        public Builder order(Output<Integer> order) {
            this.order = Objects.requireNonNull(order);
            return this;
        }
        public Builder order(Integer order) {
            this.order = Output.of(Objects.requireNonNull(order));
            return this;
        }        public AutomationRuleRunPlaybookActionArgs build() {
            return new AutomationRuleRunPlaybookActionArgs(actionConfiguration, actionType, order);
        }
    }
}
