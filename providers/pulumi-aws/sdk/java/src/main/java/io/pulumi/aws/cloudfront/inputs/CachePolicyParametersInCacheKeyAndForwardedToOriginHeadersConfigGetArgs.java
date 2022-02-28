// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigGetArgs Empty = new CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigGetArgs();

    /**
     * Determines whether any HTTP headers are included in the cache key and automatically included in requests that CloudFront sends to the origin. Valid values are `none`, `whitelist`.
     * 
     */
    @InputImport(name="headerBehavior")
      private final @Nullable Input<String> headerBehavior;

    public Input<String> getHeaderBehavior() {
        return this.headerBehavior == null ? Input.empty() : this.headerBehavior;
    }

    /**
     * Object that contains a list of header names. See Items for more information.
     * 
     */
    @InputImport(name="headers")
      private final @Nullable Input<CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersGetArgs> headers;

    public Input<CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersGetArgs> getHeaders() {
        return this.headers == null ? Input.empty() : this.headers;
    }

    public CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigGetArgs(
        @Nullable Input<String> headerBehavior,
        @Nullable Input<CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersGetArgs> headers) {
        this.headerBehavior = headerBehavior;
        this.headers = headers;
    }

    private CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigGetArgs() {
        this.headerBehavior = Input.empty();
        this.headers = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> headerBehavior;
        private @Nullable Input<CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersGetArgs> headers;

        public Builder() {
    	      // Empty
        }

        public Builder(CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerBehavior = defaults.headerBehavior;
    	      this.headers = defaults.headers;
        }

        public Builder setHeaderBehavior(@Nullable Input<String> headerBehavior) {
            this.headerBehavior = headerBehavior;
            return this;
        }

        public Builder setHeaderBehavior(@Nullable String headerBehavior) {
            this.headerBehavior = Input.ofNullable(headerBehavior);
            return this;
        }

        public Builder setHeaders(@Nullable Input<CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersGetArgs> headers) {
            this.headers = headers;
            return this;
        }

        public Builder setHeaders(@Nullable CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersGetArgs headers) {
            this.headers = Input.ofNullable(headers);
            return this;
        }
        public CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigGetArgs build() {
            return new CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigGetArgs(headerBehavior, headers);
        }
    }
}
