// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArguments;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchBody;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchMethod;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchQueryString;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeader;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchUriPath;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatch {
    /**
     * Inspect all query arguments.
     * 
     */
    private final @Nullable RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    private final @Nullable RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchBody body;
    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    private final @Nullable RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchMethod method;
    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    private final @Nullable RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchQueryString queryString;
    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeader singleHeader;
    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    private final @Nullable RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchUriPath uriPath;

    @OutputCustomType.Constructor({"allQueryArguments","body","method","queryString","singleHeader","singleQueryArgument","uriPath"})
    private RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatch(
        @Nullable RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArguments allQueryArguments,
        @Nullable RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchBody body,
        @Nullable RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchMethod method,
        @Nullable RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchQueryString queryString,
        @Nullable RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeader singleHeader,
        @Nullable RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument,
        @Nullable RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchUriPath uriPath) {
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
    public Optional<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArguments> getAllQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }
    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    public Optional<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchBody> getBody() {
        return Optional.ofNullable(this.body);
    }
    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    public Optional<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchMethod> getMethod() {
        return Optional.ofNullable(this.method);
    }
    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    public Optional<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchQueryString> getQueryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeader> getSingleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }
    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument> getSingleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }
    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    public Optional<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchUriPath> getUriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
        private @Nullable RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchBody body;
        private @Nullable RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchMethod method;
        private @Nullable RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchQueryString queryString;
        private @Nullable RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeader singleHeader;
        private @Nullable RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
        private @Nullable RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchUriPath uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder setAllQueryArguments(@Nullable RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArguments allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder setBody(@Nullable RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchBody body) {
            this.body = body;
            return this;
        }

        public Builder setMethod(@Nullable RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchMethod method) {
            this.method = method;
            return this;
        }

        public Builder setQueryString(@Nullable RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchQueryString queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder setSingleHeader(@Nullable RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeader singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder setSingleQueryArgument(@Nullable RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder setUriPath(@Nullable RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchUriPath uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatch build() {
            return new RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatch(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
