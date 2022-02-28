// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementLabelMatchStatement {
    /**
     * The string to match against.
     * 
     */
    private final String key;
    /**
     * Specify whether you want to match using the label name or just the namespace. Valid values are `LABEL` or `NAMESPACE`.
     * 
     */
    private final String scope;

    @OutputCustomType.Constructor({"key","scope"})
    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementLabelMatchStatement(
        String key,
        String scope) {
        this.key = Objects.requireNonNull(key);
        this.scope = Objects.requireNonNull(scope);
    }

    /**
     * The string to match against.
     * 
     */
    public String getKey() {
        return this.key;
    }
    /**
     * Specify whether you want to match using the label name or just the namespace. Valid values are `LABEL` or `NAMESPACE`.
     * 
     */
    public String getScope() {
        return this.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementLabelMatchStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String scope;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementLabelMatchStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.scope = defaults.scope;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementLabelMatchStatement build() {
            return new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementStatementLabelMatchStatement(key, scope);
        }
    }
}
