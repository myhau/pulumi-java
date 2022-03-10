// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.outputs;

import io.pulumi.aws.networkfirewall.outputs.RuleGroupRuleGroupRulesSourceRulesSourceList;
import io.pulumi.aws.networkfirewall.outputs.RuleGroupRuleGroupRulesSourceStatefulRule;
import io.pulumi.aws.networkfirewall.outputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActions;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RuleGroupRuleGroupRulesSource {
    /**
     * A configuration block containing **stateful** inspection criteria for a domain list rule group. See Rules Source List below for details.
     * 
     */
    private final @Nullable RuleGroupRuleGroupRulesSourceRulesSourceList rulesSourceList;
    /**
     * The fully qualified name of a file in an S3 bucket that contains Suricata compatible intrusion preventions system (IPS) rules or the Suricata rules as a string. These rules contain **stateful** inspection criteria and the action to take for traffic that matches the criteria.
     * 
     */
    private final @Nullable String rulesString;
    /**
     * Set of configuration blocks containing **stateful** inspection criteria for 5-tuple rules to be used together in a rule group. See Stateful Rule below for details.
     * 
     */
    private final @Nullable List<RuleGroupRuleGroupRulesSourceStatefulRule> statefulRules;
    /**
     * A configuration block containing **stateless** inspection criteria for a stateless rule group. See Stateless Rules and Custom Actions below for details.
     * 
     */
    private final @Nullable RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActions statelessRulesAndCustomActions;

    @OutputCustomType.Constructor({"rulesSourceList","rulesString","statefulRules","statelessRulesAndCustomActions"})
    private RuleGroupRuleGroupRulesSource(
        @Nullable RuleGroupRuleGroupRulesSourceRulesSourceList rulesSourceList,
        @Nullable String rulesString,
        @Nullable List<RuleGroupRuleGroupRulesSourceStatefulRule> statefulRules,
        @Nullable RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActions statelessRulesAndCustomActions) {
        this.rulesSourceList = rulesSourceList;
        this.rulesString = rulesString;
        this.statefulRules = statefulRules;
        this.statelessRulesAndCustomActions = statelessRulesAndCustomActions;
    }

    /**
     * A configuration block containing **stateful** inspection criteria for a domain list rule group. See Rules Source List below for details.
     * 
    */
    public Optional<RuleGroupRuleGroupRulesSourceRulesSourceList> getRulesSourceList() {
        return Optional.ofNullable(this.rulesSourceList);
    }
    /**
     * The fully qualified name of a file in an S3 bucket that contains Suricata compatible intrusion preventions system (IPS) rules or the Suricata rules as a string. These rules contain **stateful** inspection criteria and the action to take for traffic that matches the criteria.
     * 
    */
    public Optional<String> getRulesString() {
        return Optional.ofNullable(this.rulesString);
    }
    /**
     * Set of configuration blocks containing **stateful** inspection criteria for 5-tuple rules to be used together in a rule group. See Stateful Rule below for details.
     * 
    */
    public List<RuleGroupRuleGroupRulesSourceStatefulRule> getStatefulRules() {
        return this.statefulRules == null ? List.of() : this.statefulRules;
    }
    /**
     * A configuration block containing **stateless** inspection criteria for a stateless rule group. See Stateless Rules and Custom Actions below for details.
     * 
    */
    public Optional<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActions> getStatelessRulesAndCustomActions() {
        return Optional.ofNullable(this.statelessRulesAndCustomActions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRulesSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupRuleGroupRulesSourceRulesSourceList rulesSourceList;
        private @Nullable String rulesString;
        private @Nullable List<RuleGroupRuleGroupRulesSourceStatefulRule> statefulRules;
        private @Nullable RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActions statelessRulesAndCustomActions;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupRulesSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rulesSourceList = defaults.rulesSourceList;
    	      this.rulesString = defaults.rulesString;
    	      this.statefulRules = defaults.statefulRules;
    	      this.statelessRulesAndCustomActions = defaults.statelessRulesAndCustomActions;
        }

        public Builder setRulesSourceList(@Nullable RuleGroupRuleGroupRulesSourceRulesSourceList rulesSourceList) {
            this.rulesSourceList = rulesSourceList;
            return this;
        }

        public Builder setRulesString(@Nullable String rulesString) {
            this.rulesString = rulesString;
            return this;
        }

        public Builder setStatefulRules(@Nullable List<RuleGroupRuleGroupRulesSourceStatefulRule> statefulRules) {
            this.statefulRules = statefulRules;
            return this;
        }

        public Builder setStatelessRulesAndCustomActions(@Nullable RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActions statelessRulesAndCustomActions) {
            this.statelessRulesAndCustomActions = statelessRulesAndCustomActions;
            return this;
        }
        public RuleGroupRuleGroupRulesSource build() {
            return new RuleGroupRuleGroupRulesSource(rulesSourceList, rulesString, statefulRules, statelessRulesAndCustomActions);
        }
    }
}