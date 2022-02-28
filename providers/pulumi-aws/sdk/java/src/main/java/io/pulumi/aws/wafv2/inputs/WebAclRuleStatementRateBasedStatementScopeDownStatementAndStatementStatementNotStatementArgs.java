// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementArgs Empty = new WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementArgs();

    /**
     * The statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
     */
    @InputImport(name="statements", required=true)
      private final Input<List<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementArgs>> statements;

    public Input<List<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementArgs>> getStatements() {
        return this.statements;
    }

    public WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementArgs(Input<List<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementArgs>> statements) {
        this.statements = Objects.requireNonNull(statements, "expected parameter 'statements' to be non-null");
    }

    private WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementArgs() {
        this.statements = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementArgs>> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder setStatements(Input<List<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementArgs>> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }

        public Builder setStatements(List<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementArgs> statements) {
            this.statements = Input.of(Objects.requireNonNull(statements));
            return this;
        }
        public WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementArgs build() {
            return new WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementArgs(statements);
        }
    }
}
