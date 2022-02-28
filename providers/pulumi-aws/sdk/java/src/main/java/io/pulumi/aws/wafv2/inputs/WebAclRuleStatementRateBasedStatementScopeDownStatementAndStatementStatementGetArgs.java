// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementByteMatchStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementGeoMatchStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementIpSetReferenceStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementLabelMatchStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSizeConstraintStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementGetArgs Empty = new WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementGetArgs();

    /**
     * A logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
     * 
     */
    @InputImport(name="andStatement")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementGetArgs> andStatement;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementGetArgs> getAndStatement() {
        return this.andStatement == null ? Input.empty() : this.andStatement;
    }

    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    @InputImport(name="byteMatchStatement")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementByteMatchStatementGetArgs> byteMatchStatement;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementByteMatchStatementGetArgs> getByteMatchStatement() {
        return this.byteMatchStatement == null ? Input.empty() : this.byteMatchStatement;
    }

    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    @InputImport(name="geoMatchStatement")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementGeoMatchStatementGetArgs> geoMatchStatement;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementGeoMatchStatementGetArgs> getGeoMatchStatement() {
        return this.geoMatchStatement == null ? Input.empty() : this.geoMatchStatement;
    }

    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    @InputImport(name="ipSetReferenceStatement")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementIpSetReferenceStatementGetArgs> getIpSetReferenceStatement() {
        return this.ipSetReferenceStatement == null ? Input.empty() : this.ipSetReferenceStatement;
    }

    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    @InputImport(name="labelMatchStatement")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementLabelMatchStatementGetArgs> labelMatchStatement;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementLabelMatchStatementGetArgs> getLabelMatchStatement() {
        return this.labelMatchStatement == null ? Input.empty() : this.labelMatchStatement;
    }

    /**
     * A logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
     * 
     */
    @InputImport(name="notStatement")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementGetArgs> notStatement;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementGetArgs> getNotStatement() {
        return this.notStatement == null ? Input.empty() : this.notStatement;
    }

    /**
     * A logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
     * 
     */
    @InputImport(name="orStatement")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementGetArgs> orStatement;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementGetArgs> getOrStatement() {
        return this.orStatement == null ? Input.empty() : this.orStatement;
    }

    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    @InputImport(name="regexPatternSetReferenceStatement")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs> getRegexPatternSetReferenceStatement() {
        return this.regexPatternSetReferenceStatement == null ? Input.empty() : this.regexPatternSetReferenceStatement;
    }

    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
     * 
     */
    @InputImport(name="sizeConstraintStatement")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSizeConstraintStatementGetArgs> getSizeConstraintStatement() {
        return this.sizeConstraintStatement == null ? Input.empty() : this.sizeConstraintStatement;
    }

    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    @InputImport(name="sqliMatchStatement")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementGetArgs> getSqliMatchStatement() {
        return this.sqliMatchStatement == null ? Input.empty() : this.sqliMatchStatement;
    }

    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    @InputImport(name="xssMatchStatement")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementGetArgs> xssMatchStatement;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementGetArgs> getXssMatchStatement() {
        return this.xssMatchStatement == null ? Input.empty() : this.xssMatchStatement;
    }

    public WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementGetArgs(
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementGetArgs> andStatement,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementByteMatchStatementGetArgs> byteMatchStatement,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementGeoMatchStatementGetArgs> geoMatchStatement,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementLabelMatchStatementGetArgs> labelMatchStatement,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementGetArgs> notStatement,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementGetArgs> orStatement,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementGetArgs> xssMatchStatement) {
        this.andStatement = andStatement;
        this.byteMatchStatement = byteMatchStatement;
        this.geoMatchStatement = geoMatchStatement;
        this.ipSetReferenceStatement = ipSetReferenceStatement;
        this.labelMatchStatement = labelMatchStatement;
        this.notStatement = notStatement;
        this.orStatement = orStatement;
        this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
        this.sizeConstraintStatement = sizeConstraintStatement;
        this.sqliMatchStatement = sqliMatchStatement;
        this.xssMatchStatement = xssMatchStatement;
    }

    private WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementGetArgs() {
        this.andStatement = Input.empty();
        this.byteMatchStatement = Input.empty();
        this.geoMatchStatement = Input.empty();
        this.ipSetReferenceStatement = Input.empty();
        this.labelMatchStatement = Input.empty();
        this.notStatement = Input.empty();
        this.orStatement = Input.empty();
        this.regexPatternSetReferenceStatement = Input.empty();
        this.sizeConstraintStatement = Input.empty();
        this.sqliMatchStatement = Input.empty();
        this.xssMatchStatement = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementGetArgs> andStatement;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementByteMatchStatementGetArgs> byteMatchStatement;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementGeoMatchStatementGetArgs> geoMatchStatement;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementLabelMatchStatementGetArgs> labelMatchStatement;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementGetArgs> notStatement;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementGetArgs> orStatement;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementGetArgs> xssMatchStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.andStatement = defaults.andStatement;
    	      this.byteMatchStatement = defaults.byteMatchStatement;
    	      this.geoMatchStatement = defaults.geoMatchStatement;
    	      this.ipSetReferenceStatement = defaults.ipSetReferenceStatement;
    	      this.labelMatchStatement = defaults.labelMatchStatement;
    	      this.notStatement = defaults.notStatement;
    	      this.orStatement = defaults.orStatement;
    	      this.regexPatternSetReferenceStatement = defaults.regexPatternSetReferenceStatement;
    	      this.sizeConstraintStatement = defaults.sizeConstraintStatement;
    	      this.sqliMatchStatement = defaults.sqliMatchStatement;
    	      this.xssMatchStatement = defaults.xssMatchStatement;
        }

        public Builder setAndStatement(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementGetArgs> andStatement) {
            this.andStatement = andStatement;
            return this;
        }

        public Builder setAndStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementGetArgs andStatement) {
            this.andStatement = Input.ofNullable(andStatement);
            return this;
        }

        public Builder setByteMatchStatement(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementByteMatchStatementGetArgs> byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }

        public Builder setByteMatchStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementByteMatchStatementGetArgs byteMatchStatement) {
            this.byteMatchStatement = Input.ofNullable(byteMatchStatement);
            return this;
        }

        public Builder setGeoMatchStatement(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementGeoMatchStatementGetArgs> geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }

        public Builder setGeoMatchStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementGeoMatchStatementGetArgs geoMatchStatement) {
            this.geoMatchStatement = Input.ofNullable(geoMatchStatement);
            return this;
        }

        public Builder setIpSetReferenceStatement(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement) {
            this.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }

        public Builder setIpSetReferenceStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementIpSetReferenceStatementGetArgs ipSetReferenceStatement) {
            this.ipSetReferenceStatement = Input.ofNullable(ipSetReferenceStatement);
            return this;
        }

        public Builder setLabelMatchStatement(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementLabelMatchStatementGetArgs> labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }

        public Builder setLabelMatchStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementLabelMatchStatementGetArgs labelMatchStatement) {
            this.labelMatchStatement = Input.ofNullable(labelMatchStatement);
            return this;
        }

        public Builder setNotStatement(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementGetArgs> notStatement) {
            this.notStatement = notStatement;
            return this;
        }

        public Builder setNotStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementGetArgs notStatement) {
            this.notStatement = Input.ofNullable(notStatement);
            return this;
        }

        public Builder setOrStatement(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementGetArgs> orStatement) {
            this.orStatement = orStatement;
            return this;
        }

        public Builder setOrStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementGetArgs orStatement) {
            this.orStatement = Input.ofNullable(orStatement);
            return this;
        }

        public Builder setRegexPatternSetReferenceStatement(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }

        public Builder setRegexPatternSetReferenceStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = Input.ofNullable(regexPatternSetReferenceStatement);
            return this;
        }

        public Builder setSizeConstraintStatement(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }

        public Builder setSizeConstraintStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSizeConstraintStatementGetArgs sizeConstraintStatement) {
            this.sizeConstraintStatement = Input.ofNullable(sizeConstraintStatement);
            return this;
        }

        public Builder setSqliMatchStatement(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }

        public Builder setSqliMatchStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatementGetArgs sqliMatchStatement) {
            this.sqliMatchStatement = Input.ofNullable(sqliMatchStatement);
            return this;
        }

        public Builder setXssMatchStatement(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementGetArgs> xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }

        public Builder setXssMatchStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatementGetArgs xssMatchStatement) {
            this.xssMatchStatement = Input.ofNullable(xssMatchStatement);
            return this;
        }
        public WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementGetArgs build() {
            return new WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementGetArgs(andStatement, byteMatchStatement, geoMatchStatement, ipSetReferenceStatement, labelMatchStatement, notStatement, orStatement, regexPatternSetReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }
}
