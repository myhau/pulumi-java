// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementTextTransformationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementArgs Empty = new WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementArgs();

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @InputImport(name="fieldToMatch")
      private final @Nullable Input<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchArgs> fieldToMatch;

    public Input<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchArgs> getFieldToMatch() {
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
      private final Input<List<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementTextTransformationArgs>> textTransformations;

    public Input<List<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementTextTransformationArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementArgs(
        @Nullable Input<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchArgs> fieldToMatch,
        Input<String> positionalConstraint,
        Input<String> searchString,
        Input<List<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementTextTransformationArgs>> textTransformations) {
        this.fieldToMatch = fieldToMatch;
        this.positionalConstraint = Objects.requireNonNull(positionalConstraint, "expected parameter 'positionalConstraint' to be non-null");
        this.searchString = Objects.requireNonNull(searchString, "expected parameter 'searchString' to be non-null");
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementArgs() {
        this.fieldToMatch = Input.empty();
        this.positionalConstraint = Input.empty();
        this.searchString = Input.empty();
        this.textTransformations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchArgs> fieldToMatch;
        private Input<String> positionalConstraint;
        private Input<String> searchString;
        private Input<List<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementTextTransformationArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.positionalConstraint = defaults.positionalConstraint;
    	      this.searchString = defaults.searchString;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder setFieldToMatch(@Nullable Input<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchArgs> fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder setFieldToMatch(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchArgs fieldToMatch) {
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

        public Builder setTextTransformations(Input<List<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementTextTransformationArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }

        public Builder setTextTransformations(List<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementTextTransformationArgs> textTransformations) {
            this.textTransformations = Input.of(Objects.requireNonNull(textTransformations));
            return this;
        }
        public WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementArgs build() {
            return new WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementArgs(fieldToMatch, positionalConstraint, searchString, textTransformations);
        }
    }
}
