// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import java.util.Objects;


public final class WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchMethodArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchMethodArgs Empty = new WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchMethodArgs();

    public WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchMethodArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchMethodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchMethodArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchMethodArgs build() {
            return new WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchMethodArgs();
        }
    }
}