// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import java.util.Objects;


public final class WebAclRuleStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPathArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPathArgs Empty = new WebAclRuleStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPathArgs();

    public WebAclRuleStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPathArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPathArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPathArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPathArgs build() {
            return new WebAclRuleStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPathArgs();
        }
    }
}