// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class RuleGroupActivatedRuleActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupActivatedRuleActionArgs Empty = new RuleGroupActivatedRuleActionArgs();

    /**
     * The rule type, either `REGULAR`, `RATE_BASED`, or `GROUP`. Defaults to `REGULAR`.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public RuleGroupActivatedRuleActionArgs(Input<String> type) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private RuleGroupActivatedRuleActionArgs() {
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupActivatedRuleActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupActivatedRuleActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public RuleGroupActivatedRuleActionArgs build() {
            return new RuleGroupActivatedRuleActionArgs(type);
        }
    }
}
