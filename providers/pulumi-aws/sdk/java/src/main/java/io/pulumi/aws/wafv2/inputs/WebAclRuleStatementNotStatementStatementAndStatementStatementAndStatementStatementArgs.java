// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementGeoMatchStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementLabelMatchStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementArgs Empty = new WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementArgs();

    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    @InputImport(name="byteMatchStatement")
      private final @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementArgs> byteMatchStatement;

    public Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementArgs> getByteMatchStatement() {
        return this.byteMatchStatement == null ? Input.empty() : this.byteMatchStatement;
    }

    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    @InputImport(name="geoMatchStatement")
      private final @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementGeoMatchStatementArgs> geoMatchStatement;

    public Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementGeoMatchStatementArgs> getGeoMatchStatement() {
        return this.geoMatchStatement == null ? Input.empty() : this.geoMatchStatement;
    }

    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    @InputImport(name="ipSetReferenceStatement")
      private final @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement;

    public Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementArgs> getIpSetReferenceStatement() {
        return this.ipSetReferenceStatement == null ? Input.empty() : this.ipSetReferenceStatement;
    }

    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    @InputImport(name="labelMatchStatement")
      private final @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementLabelMatchStatementArgs> labelMatchStatement;

    public Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementLabelMatchStatementArgs> getLabelMatchStatement() {
        return this.labelMatchStatement == null ? Input.empty() : this.labelMatchStatement;
    }

    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    @InputImport(name="regexPatternSetReferenceStatement")
      private final @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement;

    public Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs> getRegexPatternSetReferenceStatement() {
        return this.regexPatternSetReferenceStatement == null ? Input.empty() : this.regexPatternSetReferenceStatement;
    }

    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
     * 
     */
    @InputImport(name="sizeConstraintStatement")
      private final @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement;

    public Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatementArgs> getSizeConstraintStatement() {
        return this.sizeConstraintStatement == null ? Input.empty() : this.sizeConstraintStatement;
    }

    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    @InputImport(name="sqliMatchStatement")
      private final @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatementArgs> sqliMatchStatement;

    public Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatementArgs> getSqliMatchStatement() {
        return this.sqliMatchStatement == null ? Input.empty() : this.sqliMatchStatement;
    }

    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    @InputImport(name="xssMatchStatement")
      private final @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementArgs> xssMatchStatement;

    public Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementArgs> getXssMatchStatement() {
        return this.xssMatchStatement == null ? Input.empty() : this.xssMatchStatement;
    }

    public WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementArgs(
        @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementArgs> byteMatchStatement,
        @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementGeoMatchStatementArgs> geoMatchStatement,
        @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement,
        @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementLabelMatchStatementArgs> labelMatchStatement,
        @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement,
        @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement,
        @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatementArgs> sqliMatchStatement,
        @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementArgs> xssMatchStatement) {
        this.byteMatchStatement = byteMatchStatement;
        this.geoMatchStatement = geoMatchStatement;
        this.ipSetReferenceStatement = ipSetReferenceStatement;
        this.labelMatchStatement = labelMatchStatement;
        this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
        this.sizeConstraintStatement = sizeConstraintStatement;
        this.sqliMatchStatement = sqliMatchStatement;
        this.xssMatchStatement = xssMatchStatement;
    }

    private WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementArgs() {
        this.byteMatchStatement = Input.empty();
        this.geoMatchStatement = Input.empty();
        this.ipSetReferenceStatement = Input.empty();
        this.labelMatchStatement = Input.empty();
        this.regexPatternSetReferenceStatement = Input.empty();
        this.sizeConstraintStatement = Input.empty();
        this.sqliMatchStatement = Input.empty();
        this.xssMatchStatement = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementArgs> byteMatchStatement;
        private @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementGeoMatchStatementArgs> geoMatchStatement;
        private @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement;
        private @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementLabelMatchStatementArgs> labelMatchStatement;
        private @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement;
        private @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement;
        private @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatementArgs> sqliMatchStatement;
        private @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementArgs> xssMatchStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.byteMatchStatement = defaults.byteMatchStatement;
    	      this.geoMatchStatement = defaults.geoMatchStatement;
    	      this.ipSetReferenceStatement = defaults.ipSetReferenceStatement;
    	      this.labelMatchStatement = defaults.labelMatchStatement;
    	      this.regexPatternSetReferenceStatement = defaults.regexPatternSetReferenceStatement;
    	      this.sizeConstraintStatement = defaults.sizeConstraintStatement;
    	      this.sqliMatchStatement = defaults.sqliMatchStatement;
    	      this.xssMatchStatement = defaults.xssMatchStatement;
        }

        public Builder setByteMatchStatement(@Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementArgs> byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }

        public Builder setByteMatchStatement(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementByteMatchStatementArgs byteMatchStatement) {
            this.byteMatchStatement = Input.ofNullable(byteMatchStatement);
            return this;
        }

        public Builder setGeoMatchStatement(@Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementGeoMatchStatementArgs> geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }

        public Builder setGeoMatchStatement(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementGeoMatchStatementArgs geoMatchStatement) {
            this.geoMatchStatement = Input.ofNullable(geoMatchStatement);
            return this;
        }

        public Builder setIpSetReferenceStatement(@Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement) {
            this.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }

        public Builder setIpSetReferenceStatement(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementArgs ipSetReferenceStatement) {
            this.ipSetReferenceStatement = Input.ofNullable(ipSetReferenceStatement);
            return this;
        }

        public Builder setLabelMatchStatement(@Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementLabelMatchStatementArgs> labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }

        public Builder setLabelMatchStatement(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementLabelMatchStatementArgs labelMatchStatement) {
            this.labelMatchStatement = Input.ofNullable(labelMatchStatement);
            return this;
        }

        public Builder setRegexPatternSetReferenceStatement(@Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }

        public Builder setRegexPatternSetReferenceStatement(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = Input.ofNullable(regexPatternSetReferenceStatement);
            return this;
        }

        public Builder setSizeConstraintStatement(@Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }

        public Builder setSizeConstraintStatement(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatementArgs sizeConstraintStatement) {
            this.sizeConstraintStatement = Input.ofNullable(sizeConstraintStatement);
            return this;
        }

        public Builder setSqliMatchStatement(@Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatementArgs> sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }

        public Builder setSqliMatchStatement(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatementArgs sqliMatchStatement) {
            this.sqliMatchStatement = Input.ofNullable(sqliMatchStatement);
            return this;
        }

        public Builder setXssMatchStatement(@Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementArgs> xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }

        public Builder setXssMatchStatement(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementArgs xssMatchStatement) {
            this.xssMatchStatement = Input.ofNullable(xssMatchStatement);
            return this;
        }
        public WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementArgs build() {
            return new WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementArgs(byteMatchStatement, geoMatchStatement, ipSetReferenceStatement, labelMatchStatement, regexPatternSetReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }
}
