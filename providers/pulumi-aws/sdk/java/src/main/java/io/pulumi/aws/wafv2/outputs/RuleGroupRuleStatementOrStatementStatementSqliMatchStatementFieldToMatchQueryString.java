// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class RuleGroupRuleStatementOrStatementStatementSqliMatchStatementFieldToMatchQueryString {
    @OutputCustomType.Constructor({})
    private RuleGroupRuleStatementOrStatementStatementSqliMatchStatementFieldToMatchQueryString() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementOrStatementStatementSqliMatchStatementFieldToMatchQueryString defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementOrStatementStatementSqliMatchStatementFieldToMatchQueryString defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public RuleGroupRuleStatementOrStatementStatementSqliMatchStatementFieldToMatchQueryString build() {
            return new RuleGroupRuleStatementOrStatementStatementSqliMatchStatementFieldToMatchQueryString();
        }
    }
}
