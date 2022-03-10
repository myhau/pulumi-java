// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchBodyArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchMethodArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchQueryStringArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchUriPathArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchArgs Empty = new WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @InputImport(name="allQueryArguments")
      private final @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;

    public Input<WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs> getAllQueryArguments() {
        return this.allQueryArguments == null ? Input.empty() : this.allQueryArguments;
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @InputImport(name="body")
      private final @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchBodyArgs> body;

    public Input<WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchBodyArgs> getBody() {
        return this.body == null ? Input.empty() : this.body;
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @InputImport(name="method")
      private final @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchMethodArgs> method;

    public Input<WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchMethodArgs> getMethod() {
        return this.method == null ? Input.empty() : this.method;
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @InputImport(name="queryString")
      private final @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchQueryStringArgs> queryString;

    public Input<WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchQueryStringArgs> getQueryString() {
        return this.queryString == null ? Input.empty() : this.queryString;
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @InputImport(name="singleHeader")
      private final @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs> singleHeader;

    public Input<WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs> getSingleHeader() {
        return this.singleHeader == null ? Input.empty() : this.singleHeader;
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @InputImport(name="singleQueryArgument")
      private final @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;

    public Input<WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Input.empty() : this.singleQueryArgument;
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @InputImport(name="uriPath")
      private final @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchUriPathArgs> uriPath;

    public Input<WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchUriPathArgs> getUriPath() {
        return this.uriPath == null ? Input.empty() : this.uriPath;
    }

    public WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchArgs(
        @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments,
        @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchBodyArgs> body,
        @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchMethodArgs> method,
        @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchQueryStringArgs> queryString,
        @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs> singleHeader,
        @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument,
        @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchUriPathArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchArgs() {
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

    public static Builder builder(WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;
        private @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchBodyArgs> body;
        private @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchMethodArgs> method;
        private @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchQueryStringArgs> queryString;
        private @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs> singleHeader;
        private @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;
        private @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchUriPathArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder setAllQueryArguments(@Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder setAllQueryArguments(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs allQueryArguments) {
            this.allQueryArguments = Input.ofNullable(allQueryArguments);
            return this;
        }

        public Builder setBody(@Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchBodyArgs> body) {
            this.body = body;
            return this;
        }

        public Builder setBody(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchBodyArgs body) {
            this.body = Input.ofNullable(body);
            return this;
        }

        public Builder setMethod(@Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchMethodArgs> method) {
            this.method = method;
            return this;
        }

        public Builder setMethod(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchMethodArgs method) {
            this.method = Input.ofNullable(method);
            return this;
        }

        public Builder setQueryString(@Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchQueryStringArgs> queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder setQueryString(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchQueryStringArgs queryString) {
            this.queryString = Input.ofNullable(queryString);
            return this;
        }

        public Builder setSingleHeader(@Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder setSingleHeader(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs singleHeader) {
            this.singleHeader = Input.ofNullable(singleHeader);
            return this;
        }

        public Builder setSingleQueryArgument(@Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder setSingleQueryArgument(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs singleQueryArgument) {
            this.singleQueryArgument = Input.ofNullable(singleQueryArgument);
            return this;
        }

        public Builder setUriPath(@Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchUriPathArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }

        public Builder setUriPath(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchUriPathArgs uriPath) {
            this.uriPath = Input.ofNullable(uriPath);
            return this;
        }
        public WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchArgs build() {
            return new WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}