// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf.inputs;

import io.pulumi.aws.waf.inputs.WebAclRuleActionGetArgs;
import io.pulumi.aws.waf.inputs.WebAclRuleOverrideActionGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleGetArgs Empty = new WebAclRuleGetArgs();

    /**
     * The action that CloudFront or AWS WAF takes when a web request matches the conditions in the rule. Not used if `type` is `GROUP`.
     * 
     */
    @InputImport(name="action")
      private final @Nullable Input<WebAclRuleActionGetArgs> action;

    public Input<WebAclRuleActionGetArgs> getAction() {
        return this.action == null ? Input.empty() : this.action;
    }

    /**
     * Override the action that a group requests CloudFront or AWS WAF takes when a web request matches the conditions in the rule. Only used if `type` is `GROUP`.
     * 
     */
    @InputImport(name="overrideAction")
      private final @Nullable Input<WebAclRuleOverrideActionGetArgs> overrideAction;

    public Input<WebAclRuleOverrideActionGetArgs> getOverrideAction() {
        return this.overrideAction == null ? Input.empty() : this.overrideAction;
    }

    /**
     * Specifies the order in which the rules in a WebACL are evaluated.
     * Rules with a lower value are evaluated before rules with a higher value.
     * 
     */
    @InputImport(name="priority", required=true)
      private final Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority;
    }

    /**
     * ID of the associated WAF (Global) rule (e.g. `aws.waf.Rule`). WAF (Regional) rules cannot be used.
     * 
     */
    @InputImport(name="ruleId", required=true)
      private final Input<String> ruleId;

    public Input<String> getRuleId() {
        return this.ruleId;
    }

    /**
     * The rule type, either `REGULAR`, as defined by [Rule](http://docs.aws.amazon.com/waf/latest/APIReference/API_Rule.html), `RATE_BASED`, as defined by [RateBasedRule](http://docs.aws.amazon.com/waf/latest/APIReference/API_RateBasedRule.html), or `GROUP`, as defined by [RuleGroup](https://docs.aws.amazon.com/waf/latest/APIReference/API_RuleGroup.html). The default is REGULAR. If you add a RATE_BASED rule, you need to set `type` as `RATE_BASED`. If you add a GROUP rule, you need to set `type` as `GROUP`.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public WebAclRuleGetArgs(
        @Nullable Input<WebAclRuleActionGetArgs> action,
        @Nullable Input<WebAclRuleOverrideActionGetArgs> overrideAction,
        Input<Integer> priority,
        Input<String> ruleId,
        @Nullable Input<String> type) {
        this.action = action;
        this.overrideAction = overrideAction;
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.ruleId = Objects.requireNonNull(ruleId, "expected parameter 'ruleId' to be non-null");
        this.type = type;
    }

    private WebAclRuleGetArgs() {
        this.action = Input.empty();
        this.overrideAction = Input.empty();
        this.priority = Input.empty();
        this.ruleId = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclRuleActionGetArgs> action;
        private @Nullable Input<WebAclRuleOverrideActionGetArgs> overrideAction;
        private Input<Integer> priority;
        private Input<String> ruleId;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.overrideAction = defaults.overrideAction;
    	      this.priority = defaults.priority;
    	      this.ruleId = defaults.ruleId;
    	      this.type = defaults.type;
        }

        public Builder setAction(@Nullable Input<WebAclRuleActionGetArgs> action) {
            this.action = action;
            return this;
        }

        public Builder setAction(@Nullable WebAclRuleActionGetArgs action) {
            this.action = Input.ofNullable(action);
            return this;
        }

        public Builder setOverrideAction(@Nullable Input<WebAclRuleOverrideActionGetArgs> overrideAction) {
            this.overrideAction = overrideAction;
            return this;
        }

        public Builder setOverrideAction(@Nullable WebAclRuleOverrideActionGetArgs overrideAction) {
            this.overrideAction = Input.ofNullable(overrideAction);
            return this;
        }

        public Builder setPriority(Input<Integer> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Input.of(Objects.requireNonNull(priority));
            return this;
        }

        public Builder setRuleId(Input<String> ruleId) {
            this.ruleId = Objects.requireNonNull(ruleId);
            return this;
        }

        public Builder setRuleId(String ruleId) {
            this.ruleId = Input.of(Objects.requireNonNull(ruleId));
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public WebAclRuleGetArgs build() {
            return new WebAclRuleGetArgs(action, overrideAction, priority, ruleId, type);
        }
    }
}
