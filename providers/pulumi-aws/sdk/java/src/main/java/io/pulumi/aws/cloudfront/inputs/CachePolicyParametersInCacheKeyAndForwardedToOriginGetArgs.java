// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigGetArgs;
import io.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigGetArgs;
import io.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CachePolicyParametersInCacheKeyAndForwardedToOriginGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CachePolicyParametersInCacheKeyAndForwardedToOriginGetArgs Empty = new CachePolicyParametersInCacheKeyAndForwardedToOriginGetArgs();

    /**
     * Object that determines whether any cookies in viewer requests (and if so, which cookies) are included in the cache key and automatically included in requests that CloudFront sends to the origin. See Cookies Config for more information.
     * 
     */
    @InputImport(name="cookiesConfig", required=true)
      private final Input<CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigGetArgs> cookiesConfig;

    public Input<CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigGetArgs> getCookiesConfig() {
        return this.cookiesConfig;
    }

    /**
     * A flag that can affect whether the Accept-Encoding HTTP header is included in the cache key and included in requests that CloudFront sends to the origin.
     * 
     */
    @InputImport(name="enableAcceptEncodingBrotli")
      private final @Nullable Input<Boolean> enableAcceptEncodingBrotli;

    public Input<Boolean> getEnableAcceptEncodingBrotli() {
        return this.enableAcceptEncodingBrotli == null ? Input.empty() : this.enableAcceptEncodingBrotli;
    }

    /**
     * A flag that can affect whether the Accept-Encoding HTTP header is included in the cache key and included in requests that CloudFront sends to the origin.
     * 
     */
    @InputImport(name="enableAcceptEncodingGzip")
      private final @Nullable Input<Boolean> enableAcceptEncodingGzip;

    public Input<Boolean> getEnableAcceptEncodingGzip() {
        return this.enableAcceptEncodingGzip == null ? Input.empty() : this.enableAcceptEncodingGzip;
    }

    /**
     * Object that determines whether any HTTP headers (and if so, which headers) are included in the cache key and automatically included in requests that CloudFront sends to the origin. See Headers Config for more information.
     * 
     */
    @InputImport(name="headersConfig", required=true)
      private final Input<CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigGetArgs> headersConfig;

    public Input<CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigGetArgs> getHeadersConfig() {
        return this.headersConfig;
    }

    /**
     * Object that determines whether any URL query strings in viewer requests (and if so, which query strings) are included in the cache key and automatically included in requests that CloudFront sends to the origin. See Query String Config for more information.
     * 
     */
    @InputImport(name="queryStringsConfig", required=true)
      private final Input<CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigGetArgs> queryStringsConfig;

    public Input<CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigGetArgs> getQueryStringsConfig() {
        return this.queryStringsConfig;
    }

    public CachePolicyParametersInCacheKeyAndForwardedToOriginGetArgs(
        Input<CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigGetArgs> cookiesConfig,
        @Nullable Input<Boolean> enableAcceptEncodingBrotli,
        @Nullable Input<Boolean> enableAcceptEncodingGzip,
        Input<CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigGetArgs> headersConfig,
        Input<CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigGetArgs> queryStringsConfig) {
        this.cookiesConfig = Objects.requireNonNull(cookiesConfig, "expected parameter 'cookiesConfig' to be non-null");
        this.enableAcceptEncodingBrotli = enableAcceptEncodingBrotli;
        this.enableAcceptEncodingGzip = enableAcceptEncodingGzip;
        this.headersConfig = Objects.requireNonNull(headersConfig, "expected parameter 'headersConfig' to be non-null");
        this.queryStringsConfig = Objects.requireNonNull(queryStringsConfig, "expected parameter 'queryStringsConfig' to be non-null");
    }

    private CachePolicyParametersInCacheKeyAndForwardedToOriginGetArgs() {
        this.cookiesConfig = Input.empty();
        this.enableAcceptEncodingBrotli = Input.empty();
        this.enableAcceptEncodingGzip = Input.empty();
        this.headersConfig = Input.empty();
        this.queryStringsConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CachePolicyParametersInCacheKeyAndForwardedToOriginGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigGetArgs> cookiesConfig;
        private @Nullable Input<Boolean> enableAcceptEncodingBrotli;
        private @Nullable Input<Boolean> enableAcceptEncodingGzip;
        private Input<CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigGetArgs> headersConfig;
        private Input<CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigGetArgs> queryStringsConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(CachePolicyParametersInCacheKeyAndForwardedToOriginGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookiesConfig = defaults.cookiesConfig;
    	      this.enableAcceptEncodingBrotli = defaults.enableAcceptEncodingBrotli;
    	      this.enableAcceptEncodingGzip = defaults.enableAcceptEncodingGzip;
    	      this.headersConfig = defaults.headersConfig;
    	      this.queryStringsConfig = defaults.queryStringsConfig;
        }

        public Builder setCookiesConfig(Input<CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigGetArgs> cookiesConfig) {
            this.cookiesConfig = Objects.requireNonNull(cookiesConfig);
            return this;
        }

        public Builder setCookiesConfig(CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigGetArgs cookiesConfig) {
            this.cookiesConfig = Input.of(Objects.requireNonNull(cookiesConfig));
            return this;
        }

        public Builder setEnableAcceptEncodingBrotli(@Nullable Input<Boolean> enableAcceptEncodingBrotli) {
            this.enableAcceptEncodingBrotli = enableAcceptEncodingBrotli;
            return this;
        }

        public Builder setEnableAcceptEncodingBrotli(@Nullable Boolean enableAcceptEncodingBrotli) {
            this.enableAcceptEncodingBrotli = Input.ofNullable(enableAcceptEncodingBrotli);
            return this;
        }

        public Builder setEnableAcceptEncodingGzip(@Nullable Input<Boolean> enableAcceptEncodingGzip) {
            this.enableAcceptEncodingGzip = enableAcceptEncodingGzip;
            return this;
        }

        public Builder setEnableAcceptEncodingGzip(@Nullable Boolean enableAcceptEncodingGzip) {
            this.enableAcceptEncodingGzip = Input.ofNullable(enableAcceptEncodingGzip);
            return this;
        }

        public Builder setHeadersConfig(Input<CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigGetArgs> headersConfig) {
            this.headersConfig = Objects.requireNonNull(headersConfig);
            return this;
        }

        public Builder setHeadersConfig(CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigGetArgs headersConfig) {
            this.headersConfig = Input.of(Objects.requireNonNull(headersConfig));
            return this;
        }

        public Builder setQueryStringsConfig(Input<CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigGetArgs> queryStringsConfig) {
            this.queryStringsConfig = Objects.requireNonNull(queryStringsConfig);
            return this;
        }

        public Builder setQueryStringsConfig(CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigGetArgs queryStringsConfig) {
            this.queryStringsConfig = Input.of(Objects.requireNonNull(queryStringsConfig));
            return this;
        }
        public CachePolicyParametersInCacheKeyAndForwardedToOriginGetArgs build() {
            return new CachePolicyParametersInCacheKeyAndForwardedToOriginGetArgs(cookiesConfig, enableAcceptEncodingBrotli, enableAcceptEncodingGzip, headersConfig, queryStringsConfig);
        }
    }
}
