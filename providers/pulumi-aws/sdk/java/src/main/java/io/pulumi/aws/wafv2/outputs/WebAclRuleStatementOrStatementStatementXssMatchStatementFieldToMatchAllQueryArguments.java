// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class WebAclRuleStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArguments {
    @OutputCustomType.Constructor({})
    private WebAclRuleStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArguments() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArguments defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArguments defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArguments build() {
            return new WebAclRuleStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArguments();
        }
    }
}
