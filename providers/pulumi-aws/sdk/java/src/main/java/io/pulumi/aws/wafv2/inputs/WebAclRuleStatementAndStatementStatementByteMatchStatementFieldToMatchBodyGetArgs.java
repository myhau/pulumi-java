// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import java.util.Objects;


public final class WebAclRuleStatementAndStatementStatementByteMatchStatementFieldToMatchBodyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementByteMatchStatementFieldToMatchBodyGetArgs Empty = new WebAclRuleStatementAndStatementStatementByteMatchStatementFieldToMatchBodyGetArgs();

    public WebAclRuleStatementAndStatementStatementByteMatchStatementFieldToMatchBodyGetArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementByteMatchStatementFieldToMatchBodyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementByteMatchStatementFieldToMatchBodyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementAndStatementStatementByteMatchStatementFieldToMatchBodyGetArgs build() {
            return new WebAclRuleStatementAndStatementStatementByteMatchStatementFieldToMatchBodyGetArgs();
        }
    }
}