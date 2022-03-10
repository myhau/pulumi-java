// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementArgs Empty = new WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementArgs();

    /**
     * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    @InputImport(name="statements", required=true)
      private final Input<List<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementArgs>> statements;

    public Input<List<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementArgs>> getStatements() {
        return this.statements;
    }

    public WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementArgs(Input<List<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementArgs>> statements) {
        this.statements = Objects.requireNonNull(statements, "expected parameter 'statements' to be non-null");
    }

    private WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementArgs() {
        this.statements = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementArgs>> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder setStatements(Input<List<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementArgs>> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }

        public Builder setStatements(List<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementArgs> statements) {
            this.statements = Input.of(Objects.requireNonNull(statements));
            return this;
        }
        public WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementArgs build() {
            return new WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementArgs(statements);
        }
    }
}