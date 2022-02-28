// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.RuleGroupRuleActionBlockCustomResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RuleGroupRuleActionBlock {
    /**
     * Defines a custom response for the web request. See Custom Response below for details.
     * 
     */
    private final @Nullable RuleGroupRuleActionBlockCustomResponse customResponse;

    @OutputCustomType.Constructor({"customResponse"})
    private RuleGroupRuleActionBlock(@Nullable RuleGroupRuleActionBlockCustomResponse customResponse) {
        this.customResponse = customResponse;
    }

    /**
     * Defines a custom response for the web request. See Custom Response below for details.
     * 
     */
    public Optional<RuleGroupRuleActionBlockCustomResponse> getCustomResponse() {
        return Optional.ofNullable(this.customResponse);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleActionBlock defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupRuleActionBlockCustomResponse customResponse;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleActionBlock defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customResponse = defaults.customResponse;
        }

        public Builder setCustomResponse(@Nullable RuleGroupRuleActionBlockCustomResponse customResponse) {
            this.customResponse = customResponse;
            return this;
        }
        public RuleGroupRuleActionBlock build() {
            return new RuleGroupRuleActionBlock(customResponse);
        }
    }
}
