// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.RuleGroupRuleActionAllowGetArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleActionBlockGetArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleActionCountGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleActionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleActionGetArgs Empty = new RuleGroupRuleActionGetArgs();

    /**
     * Instructs AWS WAF to allow the web request. See Allow below for details.
     * 
     */
    @InputImport(name="allow")
      private final @Nullable Input<RuleGroupRuleActionAllowGetArgs> allow;

    public Input<RuleGroupRuleActionAllowGetArgs> getAllow() {
        return this.allow == null ? Input.empty() : this.allow;
    }

    /**
     * Instructs AWS WAF to block the web request. See Block below for details.
     * 
     */
    @InputImport(name="block")
      private final @Nullable Input<RuleGroupRuleActionBlockGetArgs> block;

    public Input<RuleGroupRuleActionBlockGetArgs> getBlock() {
        return this.block == null ? Input.empty() : this.block;
    }

    /**
     * Instructs AWS WAF to count the web request and allow it. See Count below for details.
     * 
     */
    @InputImport(name="count")
      private final @Nullable Input<RuleGroupRuleActionCountGetArgs> count;

    public Input<RuleGroupRuleActionCountGetArgs> getCount() {
        return this.count == null ? Input.empty() : this.count;
    }

    public RuleGroupRuleActionGetArgs(
        @Nullable Input<RuleGroupRuleActionAllowGetArgs> allow,
        @Nullable Input<RuleGroupRuleActionBlockGetArgs> block,
        @Nullable Input<RuleGroupRuleActionCountGetArgs> count) {
        this.allow = allow;
        this.block = block;
        this.count = count;
    }

    private RuleGroupRuleActionGetArgs() {
        this.allow = Input.empty();
        this.block = Input.empty();
        this.count = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleActionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RuleGroupRuleActionAllowGetArgs> allow;
        private @Nullable Input<RuleGroupRuleActionBlockGetArgs> block;
        private @Nullable Input<RuleGroupRuleActionCountGetArgs> count;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleActionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allow = defaults.allow;
    	      this.block = defaults.block;
    	      this.count = defaults.count;
        }

        public Builder setAllow(@Nullable Input<RuleGroupRuleActionAllowGetArgs> allow) {
            this.allow = allow;
            return this;
        }

        public Builder setAllow(@Nullable RuleGroupRuleActionAllowGetArgs allow) {
            this.allow = Input.ofNullable(allow);
            return this;
        }

        public Builder setBlock(@Nullable Input<RuleGroupRuleActionBlockGetArgs> block) {
            this.block = block;
            return this;
        }

        public Builder setBlock(@Nullable RuleGroupRuleActionBlockGetArgs block) {
            this.block = Input.ofNullable(block);
            return this;
        }

        public Builder setCount(@Nullable Input<RuleGroupRuleActionCountGetArgs> count) {
            this.count = count;
            return this;
        }

        public Builder setCount(@Nullable RuleGroupRuleActionCountGetArgs count) {
            this.count = Input.ofNullable(count);
            return this;
        }
        public RuleGroupRuleActionGetArgs build() {
            return new RuleGroupRuleActionGetArgs(allow, block, count);
        }
    }
}
