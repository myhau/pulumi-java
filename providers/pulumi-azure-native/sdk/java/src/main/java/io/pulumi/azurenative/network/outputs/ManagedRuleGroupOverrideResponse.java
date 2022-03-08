// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ManagedRuleOverrideResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagedRuleGroupOverrideResponse {
    /**
     * The managed rule group to override.
     * 
     */
    private final String ruleGroupName;
    /**
     * List of rules that will be disabled. If none specified, all rules in the group will be disabled.
     * 
     */
    private final @Nullable List<ManagedRuleOverrideResponse> rules;

    @OutputCustomType.Constructor({"ruleGroupName","rules"})
    private ManagedRuleGroupOverrideResponse(
        String ruleGroupName,
        @Nullable List<ManagedRuleOverrideResponse> rules) {
        this.ruleGroupName = ruleGroupName;
        this.rules = rules;
    }

    /**
     * The managed rule group to override.
     * 
    */
    public String getRuleGroupName() {
        return this.ruleGroupName;
    }
    /**
     * List of rules that will be disabled. If none specified, all rules in the group will be disabled.
     * 
    */
    public List<ManagedRuleOverrideResponse> getRules() {
        return this.rules == null ? List.of() : this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedRuleGroupOverrideResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ruleGroupName;
        private @Nullable List<ManagedRuleOverrideResponse> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedRuleGroupOverrideResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleGroupName = defaults.ruleGroupName;
    	      this.rules = defaults.rules;
        }

        public Builder setRuleGroupName(String ruleGroupName) {
            this.ruleGroupName = Objects.requireNonNull(ruleGroupName);
            return this;
        }

        public Builder setRules(@Nullable List<ManagedRuleOverrideResponse> rules) {
            this.rules = rules;
            return this;
        }
        public ManagedRuleGroupOverrideResponse build() {
            return new ManagedRuleGroupOverrideResponse(ruleGroupName, rules);
        }
    }
}
