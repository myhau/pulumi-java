// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementTextTransformationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementArgs Empty = new WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementArgs();

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @InputImport(name="fieldToMatch")
      private final @Nullable Input<WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchArgs> fieldToMatch;

    public Input<WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchArgs> getFieldToMatch() {
        return this.fieldToMatch == null ? Input.empty() : this.fieldToMatch;
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @InputImport(name="textTransformations", required=true)
      private final Input<List<WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementTextTransformationArgs>> textTransformations;

    public Input<List<WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementTextTransformationArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementArgs(
        @Nullable Input<WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchArgs> fieldToMatch,
        Input<List<WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementTextTransformationArgs>> textTransformations) {
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementArgs() {
        this.fieldToMatch = Input.empty();
        this.textTransformations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchArgs> fieldToMatch;
        private Input<List<WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementTextTransformationArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder setFieldToMatch(@Nullable Input<WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchArgs> fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder setFieldToMatch(@Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchArgs fieldToMatch) {
            this.fieldToMatch = Input.ofNullable(fieldToMatch);
            return this;
        }

        public Builder setTextTransformations(Input<List<WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementTextTransformationArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }

        public Builder setTextTransformations(List<WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementTextTransformationArgs> textTransformations) {
            this.textTransformations = Input.of(Objects.requireNonNull(textTransformations));
            return this;
        }
        public WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementArgs build() {
            return new WebAclRuleStatementNotStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementArgs(fieldToMatch, textTransformations);
        }
    }
}
