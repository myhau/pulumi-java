// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementTextTransformationGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementGetArgs Empty = new WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementGetArgs();

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @InputImport(name="fieldToMatch")
      private final @Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchGetArgs> fieldToMatch;

    public Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchGetArgs> getFieldToMatch() {
        return this.fieldToMatch == null ? Input.empty() : this.fieldToMatch;
    }

    /**
     * The area within the portion of a web request that you want AWS WAF to search for `search_string`. Valid values include the following: `EXACTLY`, `STARTS_WITH`, `ENDS_WITH`, `CONTAINS`, `CONTAINS_WORD`. See the AWS [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_ByteMatchStatement.html) for more information.
     * 
     */
    @InputImport(name="positionalConstraint", required=true)
      private final Input<String> positionalConstraint;

    public Input<String> getPositionalConstraint() {
        return this.positionalConstraint;
    }

    /**
     * A string value that you want AWS WAF to search for. AWS WAF searches only in the part of web requests that you designate for inspection in `field_to_match`. The maximum length of the value is 50 bytes.
     * 
     */
    @InputImport(name="searchString", required=true)
      private final Input<String> searchString;

    public Input<String> getSearchString() {
        return this.searchString;
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @InputImport(name="textTransformations", required=true)
      private final Input<List<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementTextTransformationGetArgs>> textTransformations;

    public Input<List<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementTextTransformationGetArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementGetArgs(
        @Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchGetArgs> fieldToMatch,
        Input<String> positionalConstraint,
        Input<String> searchString,
        Input<List<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementTextTransformationGetArgs>> textTransformations) {
        this.fieldToMatch = fieldToMatch;
        this.positionalConstraint = Objects.requireNonNull(positionalConstraint, "expected parameter 'positionalConstraint' to be non-null");
        this.searchString = Objects.requireNonNull(searchString, "expected parameter 'searchString' to be non-null");
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementGetArgs() {
        this.fieldToMatch = Input.empty();
        this.positionalConstraint = Input.empty();
        this.searchString = Input.empty();
        this.textTransformations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchGetArgs> fieldToMatch;
        private Input<String> positionalConstraint;
        private Input<String> searchString;
        private Input<List<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementTextTransformationGetArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.positionalConstraint = defaults.positionalConstraint;
    	      this.searchString = defaults.searchString;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder setFieldToMatch(@Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchGetArgs> fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder setFieldToMatch(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchGetArgs fieldToMatch) {
            this.fieldToMatch = Input.ofNullable(fieldToMatch);
            return this;
        }

        public Builder setPositionalConstraint(Input<String> positionalConstraint) {
            this.positionalConstraint = Objects.requireNonNull(positionalConstraint);
            return this;
        }

        public Builder setPositionalConstraint(String positionalConstraint) {
            this.positionalConstraint = Input.of(Objects.requireNonNull(positionalConstraint));
            return this;
        }

        public Builder setSearchString(Input<String> searchString) {
            this.searchString = Objects.requireNonNull(searchString);
            return this;
        }

        public Builder setSearchString(String searchString) {
            this.searchString = Input.of(Objects.requireNonNull(searchString));
            return this;
        }

        public Builder setTextTransformations(Input<List<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementTextTransformationGetArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }

        public Builder setTextTransformations(List<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementTextTransformationGetArgs> textTransformations) {
            this.textTransformations = Input.of(Objects.requireNonNull(textTransformations));
            return this;
        }
        public WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementGetArgs build() {
            return new WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementGetArgs(fieldToMatch, positionalConstraint, searchString, textTransformations);
        }
    }
}
