// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementGeoMatchStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementLabelMatchStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementGetArgs Empty = new WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementGetArgs();

    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    @InputImport(name="byteMatchStatement")
      private final @Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementGetArgs> byteMatchStatement;

    public Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementGetArgs> getByteMatchStatement() {
        return this.byteMatchStatement == null ? Input.empty() : this.byteMatchStatement;
    }

    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    @InputImport(name="geoMatchStatement")
      private final @Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementGeoMatchStatementGetArgs> geoMatchStatement;

    public Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementGeoMatchStatementGetArgs> getGeoMatchStatement() {
        return this.geoMatchStatement == null ? Input.empty() : this.geoMatchStatement;
    }

    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    @InputImport(name="ipSetReferenceStatement")
      private final @Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement;

    public Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementGetArgs> getIpSetReferenceStatement() {
        return this.ipSetReferenceStatement == null ? Input.empty() : this.ipSetReferenceStatement;
    }

    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    @InputImport(name="labelMatchStatement")
      private final @Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementLabelMatchStatementGetArgs> labelMatchStatement;

    public Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementLabelMatchStatementGetArgs> getLabelMatchStatement() {
        return this.labelMatchStatement == null ? Input.empty() : this.labelMatchStatement;
    }

    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    @InputImport(name="regexPatternSetReferenceStatement")
      private final @Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement;

    public Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs> getRegexPatternSetReferenceStatement() {
        return this.regexPatternSetReferenceStatement == null ? Input.empty() : this.regexPatternSetReferenceStatement;
    }

    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
     * 
     */
    @InputImport(name="sizeConstraintStatement")
      private final @Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement;

    public Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementGetArgs> getSizeConstraintStatement() {
        return this.sizeConstraintStatement == null ? Input.empty() : this.sizeConstraintStatement;
    }

    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    @InputImport(name="sqliMatchStatement")
      private final @Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement;

    public Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementGetArgs> getSqliMatchStatement() {
        return this.sqliMatchStatement == null ? Input.empty() : this.sqliMatchStatement;
    }

    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    @InputImport(name="xssMatchStatement")
      private final @Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementGetArgs> xssMatchStatement;

    public Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementGetArgs> getXssMatchStatement() {
        return this.xssMatchStatement == null ? Input.empty() : this.xssMatchStatement;
    }

    public WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementGetArgs(
        @Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementGetArgs> byteMatchStatement,
        @Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementGeoMatchStatementGetArgs> geoMatchStatement,
        @Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement,
        @Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementLabelMatchStatementGetArgs> labelMatchStatement,
        @Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement,
        @Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement,
        @Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement,
        @Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementGetArgs> xssMatchStatement) {
        this.byteMatchStatement = byteMatchStatement;
        this.geoMatchStatement = geoMatchStatement;
        this.ipSetReferenceStatement = ipSetReferenceStatement;
        this.labelMatchStatement = labelMatchStatement;
        this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
        this.sizeConstraintStatement = sizeConstraintStatement;
        this.sqliMatchStatement = sqliMatchStatement;
        this.xssMatchStatement = xssMatchStatement;
    }

    private WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementGetArgs() {
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

    public static Builder builder(WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementGetArgs> byteMatchStatement;
        private @Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementGeoMatchStatementGetArgs> geoMatchStatement;
        private @Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement;
        private @Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementLabelMatchStatementGetArgs> labelMatchStatement;
        private @Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement;
        private @Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement;
        private @Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement;
        private @Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementGetArgs> xssMatchStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementGetArgs defaults) {
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

        public Builder setByteMatchStatement(@Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementGetArgs> byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }

        public Builder setByteMatchStatement(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementByteMatchStatementGetArgs byteMatchStatement) {
            this.byteMatchStatement = Input.ofNullable(byteMatchStatement);
            return this;
        }

        public Builder setGeoMatchStatement(@Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementGeoMatchStatementGetArgs> geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }

        public Builder setGeoMatchStatement(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementGeoMatchStatementGetArgs geoMatchStatement) {
            this.geoMatchStatement = Input.ofNullable(geoMatchStatement);
            return this;
        }

        public Builder setIpSetReferenceStatement(@Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement) {
            this.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }

        public Builder setIpSetReferenceStatement(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementGetArgs ipSetReferenceStatement) {
            this.ipSetReferenceStatement = Input.ofNullable(ipSetReferenceStatement);
            return this;
        }

        public Builder setLabelMatchStatement(@Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementLabelMatchStatementGetArgs> labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }

        public Builder setLabelMatchStatement(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementLabelMatchStatementGetArgs labelMatchStatement) {
            this.labelMatchStatement = Input.ofNullable(labelMatchStatement);
            return this;
        }

        public Builder setRegexPatternSetReferenceStatement(@Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }

        public Builder setRegexPatternSetReferenceStatement(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = Input.ofNullable(regexPatternSetReferenceStatement);
            return this;
        }

        public Builder setSizeConstraintStatement(@Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }

        public Builder setSizeConstraintStatement(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementGetArgs sizeConstraintStatement) {
            this.sizeConstraintStatement = Input.ofNullable(sizeConstraintStatement);
            return this;
        }

        public Builder setSqliMatchStatement(@Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }

        public Builder setSqliMatchStatement(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementGetArgs sqliMatchStatement) {
            this.sqliMatchStatement = Input.ofNullable(sqliMatchStatement);
            return this;
        }

        public Builder setXssMatchStatement(@Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementGetArgs> xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }

        public Builder setXssMatchStatement(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementGetArgs xssMatchStatement) {
            this.xssMatchStatement = Input.ofNullable(xssMatchStatement);
            return this;
        }
        public WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementGetArgs build() {
            return new WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementGetArgs(byteMatchStatement, geoMatchStatement, ipSetReferenceStatement, labelMatchStatement, regexPatternSetReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }
}
