// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBody;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethod;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryString;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeader;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPath;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch {
    /**
     * Inspect all query arguments.
     * 
     */
    private final @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    private final @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBody body;
    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    private final @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethod method;
    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    private final @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryString queryString;
    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeader singleHeader;
    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    private final @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPath uriPath;

    @OutputCustomType.Constructor({"allQueryArguments","body","method","queryString","singleHeader","singleQueryArgument","uriPath"})
    private WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch(
        @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments allQueryArguments,
        @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBody body,
        @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethod method,
        @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryString queryString,
        @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeader singleHeader,
        @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument,
        @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPath uriPath) {
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
    public Optional<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments> getAllQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }
    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    public Optional<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBody> getBody() {
        return Optional.ofNullable(this.body);
    }
    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    public Optional<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethod> getMethod() {
        return Optional.ofNullable(this.method);
    }
    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    public Optional<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryString> getQueryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    public Optional<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeader> getSingleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }
    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    public Optional<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument> getSingleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }
    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    public Optional<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPath> getUriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
        private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBody body;
        private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethod method;
        private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryString queryString;
        private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeader singleHeader;
        private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
        private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPath uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder setAllQueryArguments(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder setBody(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBody body) {
            this.body = body;
            return this;
        }

        public Builder setMethod(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethod method) {
            this.method = method;
            return this;
        }

        public Builder setQueryString(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryString queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder setSingleHeader(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeader singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder setSingleQueryArgument(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder setUriPath(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPath uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch build() {
            return new WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
