// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchBodyArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethodArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchArgs Empty = new WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @InputImport(name="allQueryArguments")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs> getAllQueryArguments() {
        return this.allQueryArguments == null ? Input.empty() : this.allQueryArguments;
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @InputImport(name="body")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchBodyArgs> body;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchBodyArgs> getBody() {
        return this.body == null ? Input.empty() : this.body;
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @InputImport(name="method")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethodArgs> method;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethodArgs> getMethod() {
        return this.method == null ? Input.empty() : this.method;
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @InputImport(name="queryString")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs> queryString;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs> getQueryString() {
        return this.queryString == null ? Input.empty() : this.queryString;
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @InputImport(name="singleHeader")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs> singleHeader;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs> getSingleHeader() {
        return this.singleHeader == null ? Input.empty() : this.singleHeader;
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @InputImport(name="singleQueryArgument")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Input.empty() : this.singleQueryArgument;
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @InputImport(name="uriPath")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs> uriPath;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs> getUriPath() {
        return this.uriPath == null ? Input.empty() : this.uriPath;
    }

    public WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchArgs(
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchBodyArgs> body,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethodArgs> method,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs> queryString,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs> singleHeader,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchArgs() {
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

    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchBodyArgs> body;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethodArgs> method;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs> queryString;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs> singleHeader;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder setAllQueryArguments(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder setAllQueryArguments(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs allQueryArguments) {
            this.allQueryArguments = Input.ofNullable(allQueryArguments);
            return this;
        }

        public Builder setBody(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchBodyArgs> body) {
            this.body = body;
            return this;
        }

        public Builder setBody(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchBodyArgs body) {
            this.body = Input.ofNullable(body);
            return this;
        }

        public Builder setMethod(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethodArgs> method) {
            this.method = method;
            return this;
        }

        public Builder setMethod(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethodArgs method) {
            this.method = Input.ofNullable(method);
            return this;
        }

        public Builder setQueryString(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs> queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder setQueryString(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs queryString) {
            this.queryString = Input.ofNullable(queryString);
            return this;
        }

        public Builder setSingleHeader(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder setSingleHeader(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs singleHeader) {
            this.singleHeader = Input.ofNullable(singleHeader);
            return this;
        }

        public Builder setSingleQueryArgument(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder setSingleQueryArgument(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs singleQueryArgument) {
            this.singleQueryArgument = Input.ofNullable(singleQueryArgument);
            return this;
        }

        public Builder setUriPath(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }

        public Builder setUriPath(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs uriPath) {
            this.uriPath = Input.ofNullable(uriPath);
            return this;
        }
        public WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchArgs build() {
            return new WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
