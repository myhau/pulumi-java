// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.RuleGroupRuleActionCountCustomRequestHandlingInsertHeaderArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class RuleGroupRuleActionCountCustomRequestHandlingArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleActionCountCustomRequestHandlingArgs Empty = new RuleGroupRuleActionCountCustomRequestHandlingArgs();

    /**
     * The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
     * 
     */
    @InputImport(name="insertHeaders", required=true)
      private final Input<List<RuleGroupRuleActionCountCustomRequestHandlingInsertHeaderArgs>> insertHeaders;

    public Input<List<RuleGroupRuleActionCountCustomRequestHandlingInsertHeaderArgs>> getInsertHeaders() {
        return this.insertHeaders;
    }

    public RuleGroupRuleActionCountCustomRequestHandlingArgs(Input<List<RuleGroupRuleActionCountCustomRequestHandlingInsertHeaderArgs>> insertHeaders) {
        this.insertHeaders = Objects.requireNonNull(insertHeaders, "expected parameter 'insertHeaders' to be non-null");
    }

    private RuleGroupRuleActionCountCustomRequestHandlingArgs() {
        this.insertHeaders = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleActionCountCustomRequestHandlingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<RuleGroupRuleActionCountCustomRequestHandlingInsertHeaderArgs>> insertHeaders;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleActionCountCustomRequestHandlingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.insertHeaders = defaults.insertHeaders;
        }

        public Builder setInsertHeaders(Input<List<RuleGroupRuleActionCountCustomRequestHandlingInsertHeaderArgs>> insertHeaders) {
            this.insertHeaders = Objects.requireNonNull(insertHeaders);
            return this;
        }

        public Builder setInsertHeaders(List<RuleGroupRuleActionCountCustomRequestHandlingInsertHeaderArgs> insertHeaders) {
            this.insertHeaders = Input.of(Objects.requireNonNull(insertHeaders));
            return this;
        }
        public RuleGroupRuleActionCountCustomRequestHandlingArgs build() {
            return new RuleGroupRuleActionCountCustomRequestHandlingArgs(insertHeaders);
        }
    }
}
