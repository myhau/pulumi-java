// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.aws.cloudfront.outputs.GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig {
    /**
     * Determines whether any cookies in viewer requests are included in the cache key and automatically included in requests that CloudFront sends to the origin. Valid values are `none`, `whitelist`, `allExcept`, `all`.
     * 
     */
    private final String cookieBehavior;
    /**
     * Object that contains a list of cookie names. See Items for more information.
     * 
     */
    private final List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie> cookies;

    @OutputCustomType.Constructor({"cookieBehavior","cookies"})
    private GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig(
        String cookieBehavior,
        List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie> cookies) {
        this.cookieBehavior = Objects.requireNonNull(cookieBehavior);
        this.cookies = Objects.requireNonNull(cookies);
    }

    /**
     * Determines whether any cookies in viewer requests are included in the cache key and automatically included in requests that CloudFront sends to the origin. Valid values are `none`, `whitelist`, `allExcept`, `all`.
     * 
     */
    public String getCookieBehavior() {
        return this.cookieBehavior;
    }
    /**
     * Object that contains a list of cookie names. See Items for more information.
     * 
     */
    public List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie> getCookies() {
        return this.cookies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cookieBehavior;
        private List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie> cookies;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookieBehavior = defaults.cookieBehavior;
    	      this.cookies = defaults.cookies;
        }

        public Builder setCookieBehavior(String cookieBehavior) {
            this.cookieBehavior = Objects.requireNonNull(cookieBehavior);
            return this;
        }

        public Builder setCookies(List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie> cookies) {
            this.cookies = Objects.requireNonNull(cookies);
            return this;
        }
        public GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig build() {
            return new GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig(cookieBehavior, cookies);
        }
    }
}
