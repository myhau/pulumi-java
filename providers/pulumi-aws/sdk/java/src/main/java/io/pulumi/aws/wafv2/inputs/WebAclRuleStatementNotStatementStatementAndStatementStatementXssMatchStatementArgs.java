// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementTextTransformationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementArgs Empty = new WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementArgs();

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @InputImport(name="fieldToMatch")
      private final @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchArgs> fieldToMatch;

    public Input<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchArgs> getFieldToMatch() {
        return this.fieldToMatch == null ? Input.empty() : this.fieldToMatch;
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @InputImport(name="textTransformations", required=true)
      private final Input<List<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementTextTransformationArgs>> textTransformations;

    public Input<List<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementTextTransformationArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementArgs(
        @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchArgs> fieldToMatch,
        Input<List<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementTextTransformationArgs>> textTransformations) {
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementArgs() {
        this.fieldToMatch = Input.empty();
        this.textTransformations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchArgs> fieldToMatch;
        private Input<List<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementTextTransformationArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder setFieldToMatch(@Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchArgs> fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder setFieldToMatch(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementFieldToMatchArgs fieldToMatch) {
            this.fieldToMatch = Input.ofNullable(fieldToMatch);
            return this;
        }

        public Builder setTextTransformations(Input<List<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementTextTransformationArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }

        public Builder setTextTransformations(List<WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementTextTransformationArgs> textTransformations) {
            this.textTransformations = Input.of(Objects.requireNonNull(textTransformations));
            return this;
        }
        public WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementArgs build() {
            return new WebAclRuleStatementNotStatementStatementAndStatementStatementXssMatchStatementArgs(fieldToMatch, textTransformations);
        }
    }
}