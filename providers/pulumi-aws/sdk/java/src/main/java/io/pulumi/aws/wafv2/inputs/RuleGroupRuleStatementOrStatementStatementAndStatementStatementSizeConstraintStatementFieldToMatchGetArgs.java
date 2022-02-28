// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsGetArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchBodyGetArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchMethodGetArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchQueryStringGetArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderGetArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentGetArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchUriPathGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchGetArgs Empty = new RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchGetArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @InputImport(name="allQueryArguments")
      private final @Nullable Input<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments;

    public Input<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsGetArgs> getAllQueryArguments() {
        return this.allQueryArguments == null ? Input.empty() : this.allQueryArguments;
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @InputImport(name="body")
      private final @Nullable Input<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchBodyGetArgs> body;

    public Input<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchBodyGetArgs> getBody() {
        return this.body == null ? Input.empty() : this.body;
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @InputImport(name="method")
      private final @Nullable Input<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchMethodGetArgs> method;

    public Input<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchMethodGetArgs> getMethod() {
        return this.method == null ? Input.empty() : this.method;
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @InputImport(name="queryString")
      private final @Nullable Input<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchQueryStringGetArgs> queryString;

    public Input<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchQueryStringGetArgs> getQueryString() {
        return this.queryString == null ? Input.empty() : this.queryString;
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @InputImport(name="singleHeader")
      private final @Nullable Input<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderGetArgs> singleHeader;

    public Input<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderGetArgs> getSingleHeader() {
        return this.singleHeader == null ? Input.empty() : this.singleHeader;
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @InputImport(name="singleQueryArgument")
      private final @Nullable Input<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument;

    public Input<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentGetArgs> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Input.empty() : this.singleQueryArgument;
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @InputImport(name="uriPath")
      private final @Nullable Input<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchUriPathGetArgs> uriPath;

    public Input<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchUriPathGetArgs> getUriPath() {
        return this.uriPath == null ? Input.empty() : this.uriPath;
    }

    public RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchGetArgs(
        @Nullable Input<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments,
        @Nullable Input<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchBodyGetArgs> body,
        @Nullable Input<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchMethodGetArgs> method,
        @Nullable Input<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchQueryStringGetArgs> queryString,
        @Nullable Input<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderGetArgs> singleHeader,
        @Nullable Input<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument,
        @Nullable Input<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchUriPathGetArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchGetArgs() {
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

    public static Builder builder(RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments;
        private @Nullable Input<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchBodyGetArgs> body;
        private @Nullable Input<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchMethodGetArgs> method;
        private @Nullable Input<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchQueryStringGetArgs> queryString;
        private @Nullable Input<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderGetArgs> singleHeader;
        private @Nullable Input<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument;
        private @Nullable Input<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchUriPathGetArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder setAllQueryArguments(@Nullable Input<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder setAllQueryArguments(@Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsGetArgs allQueryArguments) {
            this.allQueryArguments = Input.ofNullable(allQueryArguments);
            return this;
        }

        public Builder setBody(@Nullable Input<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchBodyGetArgs> body) {
            this.body = body;
            return this;
        }

        public Builder setBody(@Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchBodyGetArgs body) {
            this.body = Input.ofNullable(body);
            return this;
        }

        public Builder setMethod(@Nullable Input<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchMethodGetArgs> method) {
            this.method = method;
            return this;
        }

        public Builder setMethod(@Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchMethodGetArgs method) {
            this.method = Input.ofNullable(method);
            return this;
        }

        public Builder setQueryString(@Nullable Input<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchQueryStringGetArgs> queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder setQueryString(@Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchQueryStringGetArgs queryString) {
            this.queryString = Input.ofNullable(queryString);
            return this;
        }

        public Builder setSingleHeader(@Nullable Input<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderGetArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder setSingleHeader(@Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderGetArgs singleHeader) {
            this.singleHeader = Input.ofNullable(singleHeader);
            return this;
        }

        public Builder setSingleQueryArgument(@Nullable Input<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder setSingleQueryArgument(@Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentGetArgs singleQueryArgument) {
            this.singleQueryArgument = Input.ofNullable(singleQueryArgument);
            return this;
        }

        public Builder setUriPath(@Nullable Input<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchUriPathGetArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }

        public Builder setUriPath(@Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchUriPathGetArgs uriPath) {
            this.uriPath = Input.ofNullable(uriPath);
            return this;
        }
        public RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchGetArgs build() {
            return new RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchGetArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
