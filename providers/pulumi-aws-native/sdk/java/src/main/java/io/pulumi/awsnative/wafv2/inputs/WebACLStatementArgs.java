// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.WebACLAndStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLByteMatchStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLGeoMatchStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLIPSetReferenceStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLLabelMatchStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLManagedRuleGroupStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLNotStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLOrStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLRateBasedStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLRegexMatchStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLRegexPatternSetReferenceStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLRuleGroupReferenceStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLSizeConstraintStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLSqliMatchStatementArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLXssMatchStatementArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebACLStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebACLStatementArgs Empty = new WebACLStatementArgs();

    @InputImport(name="andStatement")
    private final @Nullable Input<WebACLAndStatementArgs> andStatement;

    public Input<WebACLAndStatementArgs> getAndStatement() {
        return this.andStatement == null ? Input.empty() : this.andStatement;
    }

    @InputImport(name="byteMatchStatement")
    private final @Nullable Input<WebACLByteMatchStatementArgs> byteMatchStatement;

    public Input<WebACLByteMatchStatementArgs> getByteMatchStatement() {
        return this.byteMatchStatement == null ? Input.empty() : this.byteMatchStatement;
    }

    @InputImport(name="geoMatchStatement")
    private final @Nullable Input<WebACLGeoMatchStatementArgs> geoMatchStatement;

    public Input<WebACLGeoMatchStatementArgs> getGeoMatchStatement() {
        return this.geoMatchStatement == null ? Input.empty() : this.geoMatchStatement;
    }

    @InputImport(name="iPSetReferenceStatement")
    private final @Nullable Input<WebACLIPSetReferenceStatementArgs> iPSetReferenceStatement;

    public Input<WebACLIPSetReferenceStatementArgs> getIPSetReferenceStatement() {
        return this.iPSetReferenceStatement == null ? Input.empty() : this.iPSetReferenceStatement;
    }

    @InputImport(name="labelMatchStatement")
    private final @Nullable Input<WebACLLabelMatchStatementArgs> labelMatchStatement;

    public Input<WebACLLabelMatchStatementArgs> getLabelMatchStatement() {
        return this.labelMatchStatement == null ? Input.empty() : this.labelMatchStatement;
    }

    @InputImport(name="managedRuleGroupStatement")
    private final @Nullable Input<WebACLManagedRuleGroupStatementArgs> managedRuleGroupStatement;

    public Input<WebACLManagedRuleGroupStatementArgs> getManagedRuleGroupStatement() {
        return this.managedRuleGroupStatement == null ? Input.empty() : this.managedRuleGroupStatement;
    }

    @InputImport(name="notStatement")
    private final @Nullable Input<WebACLNotStatementArgs> notStatement;

    public Input<WebACLNotStatementArgs> getNotStatement() {
        return this.notStatement == null ? Input.empty() : this.notStatement;
    }

    @InputImport(name="orStatement")
    private final @Nullable Input<WebACLOrStatementArgs> orStatement;

    public Input<WebACLOrStatementArgs> getOrStatement() {
        return this.orStatement == null ? Input.empty() : this.orStatement;
    }

    @InputImport(name="rateBasedStatement")
    private final @Nullable Input<WebACLRateBasedStatementArgs> rateBasedStatement;

    public Input<WebACLRateBasedStatementArgs> getRateBasedStatement() {
        return this.rateBasedStatement == null ? Input.empty() : this.rateBasedStatement;
    }

    @InputImport(name="regexMatchStatement")
    private final @Nullable Input<WebACLRegexMatchStatementArgs> regexMatchStatement;

    public Input<WebACLRegexMatchStatementArgs> getRegexMatchStatement() {
        return this.regexMatchStatement == null ? Input.empty() : this.regexMatchStatement;
    }

    @InputImport(name="regexPatternSetReferenceStatement")
    private final @Nullable Input<WebACLRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement;

    public Input<WebACLRegexPatternSetReferenceStatementArgs> getRegexPatternSetReferenceStatement() {
        return this.regexPatternSetReferenceStatement == null ? Input.empty() : this.regexPatternSetReferenceStatement;
    }

    @InputImport(name="ruleGroupReferenceStatement")
    private final @Nullable Input<WebACLRuleGroupReferenceStatementArgs> ruleGroupReferenceStatement;

    public Input<WebACLRuleGroupReferenceStatementArgs> getRuleGroupReferenceStatement() {
        return this.ruleGroupReferenceStatement == null ? Input.empty() : this.ruleGroupReferenceStatement;
    }

    @InputImport(name="sizeConstraintStatement")
    private final @Nullable Input<WebACLSizeConstraintStatementArgs> sizeConstraintStatement;

    public Input<WebACLSizeConstraintStatementArgs> getSizeConstraintStatement() {
        return this.sizeConstraintStatement == null ? Input.empty() : this.sizeConstraintStatement;
    }

    @InputImport(name="sqliMatchStatement")
    private final @Nullable Input<WebACLSqliMatchStatementArgs> sqliMatchStatement;

    public Input<WebACLSqliMatchStatementArgs> getSqliMatchStatement() {
        return this.sqliMatchStatement == null ? Input.empty() : this.sqliMatchStatement;
    }

    @InputImport(name="xssMatchStatement")
    private final @Nullable Input<WebACLXssMatchStatementArgs> xssMatchStatement;

    public Input<WebACLXssMatchStatementArgs> getXssMatchStatement() {
        return this.xssMatchStatement == null ? Input.empty() : this.xssMatchStatement;
    }

    public WebACLStatementArgs(
        @Nullable Input<WebACLAndStatementArgs> andStatement,
        @Nullable Input<WebACLByteMatchStatementArgs> byteMatchStatement,
        @Nullable Input<WebACLGeoMatchStatementArgs> geoMatchStatement,
        @Nullable Input<WebACLIPSetReferenceStatementArgs> iPSetReferenceStatement,
        @Nullable Input<WebACLLabelMatchStatementArgs> labelMatchStatement,
        @Nullable Input<WebACLManagedRuleGroupStatementArgs> managedRuleGroupStatement,
        @Nullable Input<WebACLNotStatementArgs> notStatement,
        @Nullable Input<WebACLOrStatementArgs> orStatement,
        @Nullable Input<WebACLRateBasedStatementArgs> rateBasedStatement,
        @Nullable Input<WebACLRegexMatchStatementArgs> regexMatchStatement,
        @Nullable Input<WebACLRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement,
        @Nullable Input<WebACLRuleGroupReferenceStatementArgs> ruleGroupReferenceStatement,
        @Nullable Input<WebACLSizeConstraintStatementArgs> sizeConstraintStatement,
        @Nullable Input<WebACLSqliMatchStatementArgs> sqliMatchStatement,
        @Nullable Input<WebACLXssMatchStatementArgs> xssMatchStatement) {
        this.andStatement = andStatement;
        this.byteMatchStatement = byteMatchStatement;
        this.geoMatchStatement = geoMatchStatement;
        this.iPSetReferenceStatement = iPSetReferenceStatement;
        this.labelMatchStatement = labelMatchStatement;
        this.managedRuleGroupStatement = managedRuleGroupStatement;
        this.notStatement = notStatement;
        this.orStatement = orStatement;
        this.rateBasedStatement = rateBasedStatement;
        this.regexMatchStatement = regexMatchStatement;
        this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
        this.ruleGroupReferenceStatement = ruleGroupReferenceStatement;
        this.sizeConstraintStatement = sizeConstraintStatement;
        this.sqliMatchStatement = sqliMatchStatement;
        this.xssMatchStatement = xssMatchStatement;
    }

    private WebACLStatementArgs() {
        this.andStatement = Input.empty();
        this.byteMatchStatement = Input.empty();
        this.geoMatchStatement = Input.empty();
        this.iPSetReferenceStatement = Input.empty();
        this.labelMatchStatement = Input.empty();
        this.managedRuleGroupStatement = Input.empty();
        this.notStatement = Input.empty();
        this.orStatement = Input.empty();
        this.rateBasedStatement = Input.empty();
        this.regexMatchStatement = Input.empty();
        this.regexPatternSetReferenceStatement = Input.empty();
        this.ruleGroupReferenceStatement = Input.empty();
        this.sizeConstraintStatement = Input.empty();
        this.sqliMatchStatement = Input.empty();
        this.xssMatchStatement = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebACLAndStatementArgs> andStatement;
        private @Nullable Input<WebACLByteMatchStatementArgs> byteMatchStatement;
        private @Nullable Input<WebACLGeoMatchStatementArgs> geoMatchStatement;
        private @Nullable Input<WebACLIPSetReferenceStatementArgs> iPSetReferenceStatement;
        private @Nullable Input<WebACLLabelMatchStatementArgs> labelMatchStatement;
        private @Nullable Input<WebACLManagedRuleGroupStatementArgs> managedRuleGroupStatement;
        private @Nullable Input<WebACLNotStatementArgs> notStatement;
        private @Nullable Input<WebACLOrStatementArgs> orStatement;
        private @Nullable Input<WebACLRateBasedStatementArgs> rateBasedStatement;
        private @Nullable Input<WebACLRegexMatchStatementArgs> regexMatchStatement;
        private @Nullable Input<WebACLRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement;
        private @Nullable Input<WebACLRuleGroupReferenceStatementArgs> ruleGroupReferenceStatement;
        private @Nullable Input<WebACLSizeConstraintStatementArgs> sizeConstraintStatement;
        private @Nullable Input<WebACLSqliMatchStatementArgs> sqliMatchStatement;
        private @Nullable Input<WebACLXssMatchStatementArgs> xssMatchStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.andStatement = defaults.andStatement;
    	      this.byteMatchStatement = defaults.byteMatchStatement;
    	      this.geoMatchStatement = defaults.geoMatchStatement;
    	      this.iPSetReferenceStatement = defaults.iPSetReferenceStatement;
    	      this.labelMatchStatement = defaults.labelMatchStatement;
    	      this.managedRuleGroupStatement = defaults.managedRuleGroupStatement;
    	      this.notStatement = defaults.notStatement;
    	      this.orStatement = defaults.orStatement;
    	      this.rateBasedStatement = defaults.rateBasedStatement;
    	      this.regexMatchStatement = defaults.regexMatchStatement;
    	      this.regexPatternSetReferenceStatement = defaults.regexPatternSetReferenceStatement;
    	      this.ruleGroupReferenceStatement = defaults.ruleGroupReferenceStatement;
    	      this.sizeConstraintStatement = defaults.sizeConstraintStatement;
    	      this.sqliMatchStatement = defaults.sqliMatchStatement;
    	      this.xssMatchStatement = defaults.xssMatchStatement;
        }

        public Builder setAndStatement(@Nullable Input<WebACLAndStatementArgs> andStatement) {
            this.andStatement = andStatement;
            return this;
        }

        public Builder setAndStatement(@Nullable WebACLAndStatementArgs andStatement) {
            this.andStatement = Input.ofNullable(andStatement);
            return this;
        }

        public Builder setByteMatchStatement(@Nullable Input<WebACLByteMatchStatementArgs> byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }

        public Builder setByteMatchStatement(@Nullable WebACLByteMatchStatementArgs byteMatchStatement) {
            this.byteMatchStatement = Input.ofNullable(byteMatchStatement);
            return this;
        }

        public Builder setGeoMatchStatement(@Nullable Input<WebACLGeoMatchStatementArgs> geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }

        public Builder setGeoMatchStatement(@Nullable WebACLGeoMatchStatementArgs geoMatchStatement) {
            this.geoMatchStatement = Input.ofNullable(geoMatchStatement);
            return this;
        }

        public Builder setIPSetReferenceStatement(@Nullable Input<WebACLIPSetReferenceStatementArgs> iPSetReferenceStatement) {
            this.iPSetReferenceStatement = iPSetReferenceStatement;
            return this;
        }

        public Builder setIPSetReferenceStatement(@Nullable WebACLIPSetReferenceStatementArgs iPSetReferenceStatement) {
            this.iPSetReferenceStatement = Input.ofNullable(iPSetReferenceStatement);
            return this;
        }

        public Builder setLabelMatchStatement(@Nullable Input<WebACLLabelMatchStatementArgs> labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }

        public Builder setLabelMatchStatement(@Nullable WebACLLabelMatchStatementArgs labelMatchStatement) {
            this.labelMatchStatement = Input.ofNullable(labelMatchStatement);
            return this;
        }

        public Builder setManagedRuleGroupStatement(@Nullable Input<WebACLManagedRuleGroupStatementArgs> managedRuleGroupStatement) {
            this.managedRuleGroupStatement = managedRuleGroupStatement;
            return this;
        }

        public Builder setManagedRuleGroupStatement(@Nullable WebACLManagedRuleGroupStatementArgs managedRuleGroupStatement) {
            this.managedRuleGroupStatement = Input.ofNullable(managedRuleGroupStatement);
            return this;
        }

        public Builder setNotStatement(@Nullable Input<WebACLNotStatementArgs> notStatement) {
            this.notStatement = notStatement;
            return this;
        }

        public Builder setNotStatement(@Nullable WebACLNotStatementArgs notStatement) {
            this.notStatement = Input.ofNullable(notStatement);
            return this;
        }

        public Builder setOrStatement(@Nullable Input<WebACLOrStatementArgs> orStatement) {
            this.orStatement = orStatement;
            return this;
        }

        public Builder setOrStatement(@Nullable WebACLOrStatementArgs orStatement) {
            this.orStatement = Input.ofNullable(orStatement);
            return this;
        }

        public Builder setRateBasedStatement(@Nullable Input<WebACLRateBasedStatementArgs> rateBasedStatement) {
            this.rateBasedStatement = rateBasedStatement;
            return this;
        }

        public Builder setRateBasedStatement(@Nullable WebACLRateBasedStatementArgs rateBasedStatement) {
            this.rateBasedStatement = Input.ofNullable(rateBasedStatement);
            return this;
        }

        public Builder setRegexMatchStatement(@Nullable Input<WebACLRegexMatchStatementArgs> regexMatchStatement) {
            this.regexMatchStatement = regexMatchStatement;
            return this;
        }

        public Builder setRegexMatchStatement(@Nullable WebACLRegexMatchStatementArgs regexMatchStatement) {
            this.regexMatchStatement = Input.ofNullable(regexMatchStatement);
            return this;
        }

        public Builder setRegexPatternSetReferenceStatement(@Nullable Input<WebACLRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }

        public Builder setRegexPatternSetReferenceStatement(@Nullable WebACLRegexPatternSetReferenceStatementArgs regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = Input.ofNullable(regexPatternSetReferenceStatement);
            return this;
        }

        public Builder setRuleGroupReferenceStatement(@Nullable Input<WebACLRuleGroupReferenceStatementArgs> ruleGroupReferenceStatement) {
            this.ruleGroupReferenceStatement = ruleGroupReferenceStatement;
            return this;
        }

        public Builder setRuleGroupReferenceStatement(@Nullable WebACLRuleGroupReferenceStatementArgs ruleGroupReferenceStatement) {
            this.ruleGroupReferenceStatement = Input.ofNullable(ruleGroupReferenceStatement);
            return this;
        }

        public Builder setSizeConstraintStatement(@Nullable Input<WebACLSizeConstraintStatementArgs> sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }

        public Builder setSizeConstraintStatement(@Nullable WebACLSizeConstraintStatementArgs sizeConstraintStatement) {
            this.sizeConstraintStatement = Input.ofNullable(sizeConstraintStatement);
            return this;
        }

        public Builder setSqliMatchStatement(@Nullable Input<WebACLSqliMatchStatementArgs> sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }

        public Builder setSqliMatchStatement(@Nullable WebACLSqliMatchStatementArgs sqliMatchStatement) {
            this.sqliMatchStatement = Input.ofNullable(sqliMatchStatement);
            return this;
        }

        public Builder setXssMatchStatement(@Nullable Input<WebACLXssMatchStatementArgs> xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }

        public Builder setXssMatchStatement(@Nullable WebACLXssMatchStatementArgs xssMatchStatement) {
            this.xssMatchStatement = Input.ofNullable(xssMatchStatement);
            return this;
        }

        public WebACLStatementArgs build() {
            return new WebACLStatementArgs(andStatement, byteMatchStatement, geoMatchStatement, iPSetReferenceStatement, labelMatchStatement, managedRuleGroupStatement, notStatement, orStatement, rateBasedStatement, regexMatchStatement, regexPatternSetReferenceStatement, ruleGroupReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }
}