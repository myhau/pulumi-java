// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementByteMatchStatementFieldToMatchMethod {
    @OutputCustomType.Constructor({})
    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementByteMatchStatementFieldToMatchMethod() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementByteMatchStatementFieldToMatchMethod defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementByteMatchStatementFieldToMatchMethod defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementByteMatchStatementFieldToMatchMethod build() {
            return new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementByteMatchStatementFieldToMatchMethod();
        }
    }
}
