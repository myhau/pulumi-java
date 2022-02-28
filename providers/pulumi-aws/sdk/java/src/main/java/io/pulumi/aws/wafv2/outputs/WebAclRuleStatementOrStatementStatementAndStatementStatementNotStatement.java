// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatement;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatement {
    /**
     * The statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
     */
    private final List<WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatement> statements;

    @OutputCustomType.Constructor({"statements"})
    private WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatement(List<WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatement> statements) {
        this.statements = Objects.requireNonNull(statements);
    }

    /**
     * The statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
     */
    public List<WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatement> getStatements() {
        return this.statements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatement> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder setStatements(List<WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatement> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatement build() {
            return new WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatement(statements);
        }
    }
}
