// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class RuleGroupRuleStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderGetArgs Empty = new RuleGroupRuleStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderGetArgs();

    /**
     * The name of the query header to inspect. This setting must be provided as lower case characters.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public RuleGroupRuleStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderGetArgs(Input<String> name) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private RuleGroupRuleStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderGetArgs() {
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }
        public RuleGroupRuleStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderGetArgs build() {
            return new RuleGroupRuleStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderGetArgs(name);
        }
    }
}
