// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementGeoMatchStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementIpSetReferenceStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementLabelMatchStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementSizeConstraintStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementSqliMatchStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementXssMatchStatement;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatement {
    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatement byteMatchStatement;
    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementGeoMatchStatement geoMatchStatement;
    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementIpSetReferenceStatement ipSetReferenceStatement;
    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementLabelMatchStatement labelMatchStatement;
    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
     * 
     */
    private final @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementSizeConstraintStatement sizeConstraintStatement;
    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementSqliMatchStatement sqliMatchStatement;
    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementXssMatchStatement xssMatchStatement;

    @OutputCustomType.Constructor({"byteMatchStatement","geoMatchStatement","ipSetReferenceStatement","labelMatchStatement","regexPatternSetReferenceStatement","sizeConstraintStatement","sqliMatchStatement","xssMatchStatement"})
    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatement(
        @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatement byteMatchStatement,
        @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementGeoMatchStatement geoMatchStatement,
        @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementIpSetReferenceStatement ipSetReferenceStatement,
        @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementLabelMatchStatement labelMatchStatement,
        @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement,
        @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementSizeConstraintStatement sizeConstraintStatement,
        @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementSqliMatchStatement sqliMatchStatement,
        @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementXssMatchStatement xssMatchStatement) {
        this.byteMatchStatement = byteMatchStatement;
        this.geoMatchStatement = geoMatchStatement;
        this.ipSetReferenceStatement = ipSetReferenceStatement;
        this.labelMatchStatement = labelMatchStatement;
        this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
        this.sizeConstraintStatement = sizeConstraintStatement;
        this.sqliMatchStatement = sqliMatchStatement;
        this.xssMatchStatement = xssMatchStatement;
    }

    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    public Optional<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatement> getByteMatchStatement() {
        return Optional.ofNullable(this.byteMatchStatement);
    }
    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    public Optional<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementGeoMatchStatement> getGeoMatchStatement() {
        return Optional.ofNullable(this.geoMatchStatement);
    }
    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    public Optional<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementIpSetReferenceStatement> getIpSetReferenceStatement() {
        return Optional.ofNullable(this.ipSetReferenceStatement);
    }
    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    public Optional<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementLabelMatchStatement> getLabelMatchStatement() {
        return Optional.ofNullable(this.labelMatchStatement);
    }
    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    public Optional<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatement> getRegexPatternSetReferenceStatement() {
        return Optional.ofNullable(this.regexPatternSetReferenceStatement);
    }
    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
     * 
     */
    public Optional<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementSizeConstraintStatement> getSizeConstraintStatement() {
        return Optional.ofNullable(this.sizeConstraintStatement);
    }
    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    public Optional<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementSqliMatchStatement> getSqliMatchStatement() {
        return Optional.ofNullable(this.sqliMatchStatement);
    }
    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    public Optional<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementXssMatchStatement> getXssMatchStatement() {
        return Optional.ofNullable(this.xssMatchStatement);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatement byteMatchStatement;
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementGeoMatchStatement geoMatchStatement;
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementIpSetReferenceStatement ipSetReferenceStatement;
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementLabelMatchStatement labelMatchStatement;
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementSizeConstraintStatement sizeConstraintStatement;
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementSqliMatchStatement sqliMatchStatement;
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementXssMatchStatement xssMatchStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatement defaults) {
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

        public Builder setByteMatchStatement(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementByteMatchStatement byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }

        public Builder setGeoMatchStatement(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementGeoMatchStatement geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }

        public Builder setIpSetReferenceStatement(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementIpSetReferenceStatement ipSetReferenceStatement) {
            this.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }

        public Builder setLabelMatchStatement(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementLabelMatchStatement labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }

        public Builder setRegexPatternSetReferenceStatement(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }

        public Builder setSizeConstraintStatement(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementSizeConstraintStatement sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }

        public Builder setSqliMatchStatement(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementSqliMatchStatement sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }

        public Builder setXssMatchStatement(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatementXssMatchStatement xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }
        public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatement build() {
            return new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementStatement(byteMatchStatement, geoMatchStatement, ipSetReferenceStatement, labelMatchStatement, regexPatternSetReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }
}
