// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchBodyGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchMethodGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchUriPathGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs Empty = new WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @InputImport(name="allQueryArguments")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsGetArgs> getAllQueryArguments() {
        return this.allQueryArguments == null ? Input.empty() : this.allQueryArguments;
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @InputImport(name="body")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchBodyGetArgs> body;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchBodyGetArgs> getBody() {
        return this.body == null ? Input.empty() : this.body;
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @InputImport(name="method")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchMethodGetArgs> method;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchMethodGetArgs> getMethod() {
        return this.method == null ? Input.empty() : this.method;
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @InputImport(name="queryString")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringGetArgs> queryString;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringGetArgs> getQueryString() {
        return this.queryString == null ? Input.empty() : this.queryString;
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @InputImport(name="singleHeader")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderGetArgs> singleHeader;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderGetArgs> getSingleHeader() {
        return this.singleHeader == null ? Input.empty() : this.singleHeader;
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @InputImport(name="singleQueryArgument")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentGetArgs> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Input.empty() : this.singleQueryArgument;
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @InputImport(name="uriPath")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchUriPathGetArgs> uriPath;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchUriPathGetArgs> getUriPath() {
        return this.uriPath == null ? Input.empty() : this.uriPath;
    }

    public WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs(
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchBodyGetArgs> body,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchMethodGetArgs> method,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringGetArgs> queryString,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderGetArgs> singleHeader,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchUriPathGetArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs() {
        this.allQueryArguments = Input.empty();
        this.body = Input.empty();
        this.method = Input.empty();
        this.queryString = Input.empty();
        this.singleHeader = Input.empty();
        this.singleQueryArgument = Input.empty();
        this.uriPath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchBodyGetArgs> body;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchMethodGetArgs> method;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringGetArgs> queryString;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderGetArgs> singleHeader;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchUriPathGetArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder setAllQueryArguments(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder setAllQueryArguments(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsGetArgs allQueryArguments) {
            this.allQueryArguments = Input.ofNullable(allQueryArguments);
            return this;
        }

        public Builder setBody(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchBodyGetArgs> body) {
            this.body = body;
            return this;
        }

        public Builder setBody(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchBodyGetArgs body) {
            this.body = Input.ofNullable(body);
            return this;
        }

        public Builder setMethod(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchMethodGetArgs> method) {
            this.method = method;
            return this;
        }

        public Builder setMethod(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchMethodGetArgs method) {
            this.method = Input.ofNullable(method);
            return this;
        }

        public Builder setQueryString(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringGetArgs> queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder setQueryString(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringGetArgs queryString) {
            this.queryString = Input.ofNullable(queryString);
            return this;
        }

        public Builder setSingleHeader(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderGetArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder setSingleHeader(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderGetArgs singleHeader) {
            this.singleHeader = Input.ofNullable(singleHeader);
            return this;
        }

        public Builder setSingleQueryArgument(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder setSingleQueryArgument(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentGetArgs singleQueryArgument) {
            this.singleQueryArgument = Input.ofNullable(singleQueryArgument);
            return this;
        }

        public Builder setUriPath(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchUriPathGetArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }

        public Builder setUriPath(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchUriPathGetArgs uriPath) {
            this.uriPath = Input.ofNullable(uriPath);
            return this;
        }
        public WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs build() {
            return new WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
