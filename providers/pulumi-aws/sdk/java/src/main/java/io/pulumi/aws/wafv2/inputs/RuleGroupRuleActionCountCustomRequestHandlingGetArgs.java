// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.RuleGroupRuleActionCountCustomRequestHandlingInsertHeaderGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class RuleGroupRuleActionCountCustomRequestHandlingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleActionCountCustomRequestHandlingGetArgs Empty = new RuleGroupRuleActionCountCustomRequestHandlingGetArgs();

    /**
     * The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
     * 
     */
    @InputImport(name="insertHeaders", required=true)
      private final Input<List<RuleGroupRuleActionCountCustomRequestHandlingInsertHeaderGetArgs>> insertHeaders;

    public Input<List<RuleGroupRuleActionCountCustomRequestHandlingInsertHeaderGetArgs>> getInsertHeaders() {
        return this.insertHeaders;
    }

    public RuleGroupRuleActionCountCustomRequestHandlingGetArgs(Input<List<RuleGroupRuleActionCountCustomRequestHandlingInsertHeaderGetArgs>> insertHeaders) {
        this.insertHeaders = Objects.requireNonNull(insertHeaders, "expected parameter 'insertHeaders' to be non-null");
    }

    private RuleGroupRuleActionCountCustomRequestHandlingGetArgs() {
        this.insertHeaders = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleActionCountCustomRequestHandlingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<RuleGroupRuleActionCountCustomRequestHandlingInsertHeaderGetArgs>> insertHeaders;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleActionCountCustomRequestHandlingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.insertHeaders = defaults.insertHeaders;
        }

        public Builder setInsertHeaders(Input<List<RuleGroupRuleActionCountCustomRequestHandlingInsertHeaderGetArgs>> insertHeaders) {
            this.insertHeaders = Objects.requireNonNull(insertHeaders);
            return this;
        }

        public Builder setInsertHeaders(List<RuleGroupRuleActionCountCustomRequestHandlingInsertHeaderGetArgs> insertHeaders) {
            this.insertHeaders = Input.of(Objects.requireNonNull(insertHeaders));
            return this;
        }
        public RuleGroupRuleActionCountCustomRequestHandlingGetArgs build() {
            return new RuleGroupRuleActionCountCustomRequestHandlingGetArgs(insertHeaders);
        }
    }
}
