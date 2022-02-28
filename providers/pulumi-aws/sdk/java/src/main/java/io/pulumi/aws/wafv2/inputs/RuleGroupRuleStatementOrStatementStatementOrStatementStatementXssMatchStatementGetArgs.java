// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchGetArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementTextTransformationGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementGetArgs Empty = new RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementGetArgs();

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @InputImport(name="fieldToMatch")
      private final @Nullable Input<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchGetArgs> fieldToMatch;

    public Input<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchGetArgs> getFieldToMatch() {
        return this.fieldToMatch == null ? Input.empty() : this.fieldToMatch;
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @InputImport(name="textTransformations", required=true)
      private final Input<List<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementTextTransformationGetArgs>> textTransformations;

    public Input<List<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementTextTransformationGetArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementGetArgs(
        @Nullable Input<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchGetArgs> fieldToMatch,
        Input<List<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementTextTransformationGetArgs>> textTransformations) {
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementGetArgs() {
        this.fieldToMatch = Input.empty();
        this.textTransformations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchGetArgs> fieldToMatch;
        private Input<List<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementTextTransformationGetArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder setFieldToMatch(@Nullable Input<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchGetArgs> fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder setFieldToMatch(@Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchGetArgs fieldToMatch) {
            this.fieldToMatch = Input.ofNullable(fieldToMatch);
            return this;
        }

        public Builder setTextTransformations(Input<List<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementTextTransformationGetArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }

        public Builder setTextTransformations(List<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementTextTransformationGetArgs> textTransformations) {
            this.textTransformations = Input.of(Objects.requireNonNull(textTransformations));
            return this;
        }
        public RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementGetArgs build() {
            return new RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementGetArgs(fieldToMatch, textTransformations);
        }
    }
}
