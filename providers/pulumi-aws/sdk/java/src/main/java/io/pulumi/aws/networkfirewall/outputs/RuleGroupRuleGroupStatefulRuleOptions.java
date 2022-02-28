// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RuleGroupRuleGroupStatefulRuleOptions {
    /**
     * Indicates how to manage the order of the rule evaluation for the rule group. Default value: `DEFAULT_ACTION_ORDER`. Valid values: `DEFAULT_ACTION_ORDER`, `STRICT_ORDER`.
     * 
     */
    private final String ruleOrder;

    @OutputCustomType.Constructor({"ruleOrder"})
    private RuleGroupRuleGroupStatefulRuleOptions(String ruleOrder) {
        this.ruleOrder = Objects.requireNonNull(ruleOrder);
    }

    /**
     * Indicates how to manage the order of the rule evaluation for the rule group. Default value: `DEFAULT_ACTION_ORDER`. Valid values: `DEFAULT_ACTION_ORDER`, `STRICT_ORDER`.
     * 
     */
    public String getRuleOrder() {
        return this.ruleOrder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupStatefulRuleOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ruleOrder;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupStatefulRuleOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleOrder = defaults.ruleOrder;
        }

        public Builder setRuleOrder(String ruleOrder) {
            this.ruleOrder = Objects.requireNonNull(ruleOrder);
            return this;
        }
        public RuleGroupRuleGroupStatefulRuleOptions build() {
            return new RuleGroupRuleGroupStatefulRuleOptions(ruleOrder);
        }
    }
}
