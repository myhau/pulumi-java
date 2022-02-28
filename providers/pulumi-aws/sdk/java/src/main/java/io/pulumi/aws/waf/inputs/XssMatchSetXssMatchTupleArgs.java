// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf.inputs;

import io.pulumi.aws.waf.inputs.XssMatchSetXssMatchTupleFieldToMatchArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class XssMatchSetXssMatchTupleArgs extends io.pulumi.resources.ResourceArgs {

    public static final XssMatchSetXssMatchTupleArgs Empty = new XssMatchSetXssMatchTupleArgs();

    /**
     * Specifies where in a web request to look for cross-site scripting attacks.
     * 
     */
    @InputImport(name="fieldToMatch", required=true)
      private final Input<XssMatchSetXssMatchTupleFieldToMatchArgs> fieldToMatch;

    public Input<XssMatchSetXssMatchTupleFieldToMatchArgs> getFieldToMatch() {
        return this.fieldToMatch;
    }

    /**
     * Text transformations used to eliminate unusual formatting that attackers use in web requests in an effort to bypass AWS WAF.
     * If you specify a transformation, AWS WAF performs the transformation on `target_string` before inspecting a request for a match.
     * e.g., `CMD_LINE`, `HTML_ENTITY_DECODE` or `NONE`.
     * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_XssMatchTuple.html#WAF-Type-XssMatchTuple-TextTransformation)
     * for all supported values.
     * 
     */
    @InputImport(name="textTransformation", required=true)
      private final Input<String> textTransformation;

    public Input<String> getTextTransformation() {
        return this.textTransformation;
    }

    public XssMatchSetXssMatchTupleArgs(
        Input<XssMatchSetXssMatchTupleFieldToMatchArgs> fieldToMatch,
        Input<String> textTransformation) {
        this.fieldToMatch = Objects.requireNonNull(fieldToMatch, "expected parameter 'fieldToMatch' to be non-null");
        this.textTransformation = Objects.requireNonNull(textTransformation, "expected parameter 'textTransformation' to be non-null");
    }

    private XssMatchSetXssMatchTupleArgs() {
        this.fieldToMatch = Input.empty();
        this.textTransformation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(XssMatchSetXssMatchTupleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<XssMatchSetXssMatchTupleFieldToMatchArgs> fieldToMatch;
        private Input<String> textTransformation;

        public Builder() {
    	      // Empty
        }

        public Builder(XssMatchSetXssMatchTupleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformation = defaults.textTransformation;
        }

        public Builder setFieldToMatch(Input<XssMatchSetXssMatchTupleFieldToMatchArgs> fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }

        public Builder setFieldToMatch(XssMatchSetXssMatchTupleFieldToMatchArgs fieldToMatch) {
            this.fieldToMatch = Input.of(Objects.requireNonNull(fieldToMatch));
            return this;
        }

        public Builder setTextTransformation(Input<String> textTransformation) {
            this.textTransformation = Objects.requireNonNull(textTransformation);
            return this;
        }

        public Builder setTextTransformation(String textTransformation) {
            this.textTransformation = Input.of(Objects.requireNonNull(textTransformation));
            return this;
        }
        public XssMatchSetXssMatchTupleArgs build() {
            return new XssMatchSetXssMatchTupleArgs(fieldToMatch, textTransformation);
        }
    }
}
