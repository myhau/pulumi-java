// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementGetArgs Empty = new WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementGetArgs();

    /**
     * The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    @InputImport(name="statements", required=true)
      private final Input<List<WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementGetArgs>> statements;

    public Input<List<WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementGetArgs>> getStatements() {
        return this.statements;
    }

    public WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementGetArgs(Input<List<WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementGetArgs>> statements) {
        this.statements = Objects.requireNonNull(statements, "expected parameter 'statements' to be non-null");
    }

    private WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementGetArgs() {
        this.statements = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementGetArgs>> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder setStatements(Input<List<WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementGetArgs>> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }

        public Builder setStatements(List<WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementGetArgs> statements) {
            this.statements = Input.of(Objects.requireNonNull(statements));
            return this;
        }
        public WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementGetArgs build() {
            return new WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementGetArgs(statements);
        }
    }
}
