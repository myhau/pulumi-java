// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.RuleGroupRuleActionAllowArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleActionBlockArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleActionCountArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleActionArgs Empty = new RuleGroupRuleActionArgs();

    /**
     * Instructs AWS WAF to allow the web request. See Allow below for details.
     * 
     */
    @InputImport(name="allow")
      private final @Nullable Input<RuleGroupRuleActionAllowArgs> allow;

    public Input<RuleGroupRuleActionAllowArgs> getAllow() {
        return this.allow == null ? Input.empty() : this.allow;
    }

    /**
     * Instructs AWS WAF to block the web request. See Block below for details.
     * 
     */
    @InputImport(name="block")
      private final @Nullable Input<RuleGroupRuleActionBlockArgs> block;

    public Input<RuleGroupRuleActionBlockArgs> getBlock() {
        return this.block == null ? Input.empty() : this.block;
    }

    /**
     * Instructs AWS WAF to count the web request and allow it. See Count below for details.
     * 
     */
    @InputImport(name="count")
      private final @Nullable Input<RuleGroupRuleActionCountArgs> count;

    public Input<RuleGroupRuleActionCountArgs> getCount() {
        return this.count == null ? Input.empty() : this.count;
    }

    public RuleGroupRuleActionArgs(
        @Nullable Input<RuleGroupRuleActionAllowArgs> allow,
        @Nullable Input<RuleGroupRuleActionBlockArgs> block,
        @Nullable Input<RuleGroupRuleActionCountArgs> count) {
        this.allow = allow;
        this.block = block;
        this.count = count;
    }

    private RuleGroupRuleActionArgs() {
        this.allow = Input.empty();
        this.block = Input.empty();
        this.count = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RuleGroupRuleActionAllowArgs> allow;
        private @Nullable Input<RuleGroupRuleActionBlockArgs> block;
        private @Nullable Input<RuleGroupRuleActionCountArgs> count;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allow = defaults.allow;
    	      this.block = defaults.block;
    	      this.count = defaults.count;
        }

        public Builder setAllow(@Nullable Input<RuleGroupRuleActionAllowArgs> allow) {
            this.allow = allow;
            return this;
        }

        public Builder setAllow(@Nullable RuleGroupRuleActionAllowArgs allow) {
            this.allow = Input.ofNullable(allow);
            return this;
        }

        public Builder setBlock(@Nullable Input<RuleGroupRuleActionBlockArgs> block) {
            this.block = block;
            return this;
        }

        public Builder setBlock(@Nullable RuleGroupRuleActionBlockArgs block) {
            this.block = Input.ofNullable(block);
            return this;
        }

        public Builder setCount(@Nullable Input<RuleGroupRuleActionCountArgs> count) {
            this.count = count;
            return this;
        }

        public Builder setCount(@Nullable RuleGroupRuleActionCountArgs count) {
            this.count = Input.ofNullable(count);
            return this;
        }
        public RuleGroupRuleActionArgs build() {
            return new RuleGroupRuleActionArgs(allow, block, count);
        }
    }
}
