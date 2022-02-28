// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBody;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethod;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryString;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeader;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPath;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch {
    /**
     * Inspect all query arguments.
     * 
     */
    private final @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    private final @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBody body;
    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    private final @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethod method;
    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    private final @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryString queryString;
    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeader singleHeader;
    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    private final @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPath uriPath;

    @OutputCustomType.Constructor({"allQueryArguments","body","method","queryString","singleHeader","singleQueryArgument","uriPath"})
    private RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch(
        @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments allQueryArguments,
        @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBody body,
        @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethod method,
        @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryString queryString,
        @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeader singleHeader,
        @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument,
        @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPath uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    /**
     * Inspect all query arguments.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments> getAllQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }
    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBody> getBody() {
        return Optional.ofNullable(this.body);
    }
    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethod> getMethod() {
        return Optional.ofNullable(this.method);
    }
    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryString> getQueryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeader> getSingleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }
    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument> getSingleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }
    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPath> getUriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
        private @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBody body;
        private @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethod method;
        private @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryString queryString;
        private @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeader singleHeader;
        private @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
        private @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPath uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder setAllQueryArguments(@Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder setBody(@Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBody body) {
            this.body = body;
            return this;
        }

        public Builder setMethod(@Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethod method) {
            this.method = method;
            return this;
        }

        public Builder setQueryString(@Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryString queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder setSingleHeader(@Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeader singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder setSingleQueryArgument(@Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder setUriPath(@Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPath uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch build() {
            return new RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
