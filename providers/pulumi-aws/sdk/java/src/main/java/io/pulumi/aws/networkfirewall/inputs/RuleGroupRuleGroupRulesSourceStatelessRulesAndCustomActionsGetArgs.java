// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionGetArgs;
import io.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsGetArgs Empty = new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsGetArgs();

    /**
     * Set of configuration blocks containing custom action definitions that are available for use by the set of `stateless rule`. See Custom Action below for details.
     * 
     */
    @InputImport(name="customActions")
      private final @Nullable Input<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionGetArgs>> customActions;

    public Input<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionGetArgs>> getCustomActions() {
        return this.customActions == null ? Input.empty() : this.customActions;
    }

    /**
     * Set of configuration blocks containing the stateless rules for use in the stateless rule group. See Stateless Rule below for details.
     * 
     */
    @InputImport(name="statelessRules", required=true)
      private final Input<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleGetArgs>> statelessRules;

    public Input<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleGetArgs>> getStatelessRules() {
        return this.statelessRules;
    }

    public RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsGetArgs(
        @Nullable Input<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionGetArgs>> customActions,
        Input<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleGetArgs>> statelessRules) {
        this.customActions = customActions;
        this.statelessRules = Objects.requireNonNull(statelessRules, "expected parameter 'statelessRules' to be non-null");
    }

    private RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsGetArgs() {
        this.customActions = Input.empty();
        this.statelessRules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionGetArgs>> customActions;
        private Input<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleGetArgs>> statelessRules;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customActions = defaults.customActions;
    	      this.statelessRules = defaults.statelessRules;
        }

        public Builder setCustomActions(@Nullable Input<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionGetArgs>> customActions) {
            this.customActions = customActions;
            return this;
        }

        public Builder setCustomActions(@Nullable List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionGetArgs> customActions) {
            this.customActions = Input.ofNullable(customActions);
            return this;
        }

        public Builder setStatelessRules(Input<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleGetArgs>> statelessRules) {
            this.statelessRules = Objects.requireNonNull(statelessRules);
            return this;
        }

        public Builder setStatelessRules(List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleGetArgs> statelessRules) {
            this.statelessRules = Input.of(Objects.requireNonNull(statelessRules));
            return this;
        }
        public RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsGetArgs build() {
            return new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsGetArgs(customActions, statelessRules);
        }
    }
}