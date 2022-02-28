// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementOrStatementStatement;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class WebAclRuleStatementAndStatementStatementOrStatement {
    /**
     * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    private final List<WebAclRuleStatementAndStatementStatementOrStatementStatement> statements;

    @OutputCustomType.Constructor({"statements"})
    private WebAclRuleStatementAndStatementStatementOrStatement(List<WebAclRuleStatementAndStatementStatementOrStatementStatement> statements) {
        this.statements = Objects.requireNonNull(statements);
    }

    /**
     * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    public List<WebAclRuleStatementAndStatementStatementOrStatementStatement> getStatements() {
        return this.statements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementOrStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<WebAclRuleStatementAndStatementStatementOrStatementStatement> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementOrStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder setStatements(List<WebAclRuleStatementAndStatementStatementOrStatementStatement> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public WebAclRuleStatementAndStatementStatementOrStatement build() {
            return new WebAclRuleStatementAndStatementStatementOrStatement(statements);
        }
    }
}
