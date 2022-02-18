// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.networkservices.outputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicy {
    /**
     * Defines the request parameters that contribute to the cache key.
     * Structure is documented below.
     * 
     */
    private final @Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicy cacheKeyPolicy;
    /**
     * Cache modes allow users to control the behaviour of the cache, what content it should cache automatically, whether to respect origin headers, or whether to unconditionally cache all responses.
     * For all cache modes, Cache-Control headers will be passed to the client. Use clientTtl to override what is sent to the client.
     * Possible values are `CACHE_ALL_STATIC`, `USE_ORIGIN_HEADERS`, `FORCE_CACHE_ALL`, and `BYPASS_CACHE`.
     * 
     */
    private final @Nullable String cacheMode;
    /**
     * Specifies a separate client (e.g. browser client) TTL, separate from the TTL used by the edge caches. Leaving this empty will use the same cache TTL for both the CDN and the client-facing response.
     * - The TTL must be > 0 and <= 86400s (1 day)
     * - The clientTtl cannot be larger than the defaultTtl (if set)
     * - Fractions of a second are not allowed.
     * - Omit this field to use the defaultTtl, or the max-age set by the origin, as the client-facing TTL.
     *   When the cache mode is set to "USE_ORIGIN_HEADERS" or "BYPASS_CACHE", you must omit this field.
     *   A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    private final @Nullable String clientTtl;
    /**
     * Specifies the default TTL for cached content served by this origin for responses that do not have an existing valid TTL (max-age or s-max-age).
     * Defaults to 3600s (1 hour).
     * - The TTL must be >= 0 and <= 2592000s (1 month)
     * - Setting a TTL of "0" means "always revalidate" (equivalent to must-revalidate)
     * - The value of defaultTTL cannot be set to a value greater than that of maxTTL.
     * - Fractions of a second are not allowed.
     * - When the cacheMode is set to FORCE_CACHE_ALL, the defaultTTL will overwrite the TTL set in all responses.
     *   Note that infrequently accessed objects may be evicted from the cache before the defined TTL. Objects that expire will be revalidated with the origin.
     *   When the cache mode is set to "USE_ORIGIN_HEADERS" or "BYPASS_CACHE", you must omit this field.
     *   A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    private final @Nullable String defaultTtl;
    /**
     * Specifies the maximum allowed TTL for cached content served by this origin.
     * Defaults to 86400s (1 day).
     * Cache directives that attempt to set a max-age or s-maxage higher than this, or an Expires header more than maxTtl seconds in the future will be capped at the value of maxTTL, as if it were the value of an s-maxage Cache-Control directive.
     * - The TTL must be >= 0 and <= 2592000s (1 month)
     * - Setting a TTL of "0" means "always revalidate"
     * - The value of maxTtl must be equal to or greater than defaultTtl.
     * - Fractions of a second are not allowed.
     * - When the cache mode is set to "USE_ORIGIN_HEADERS", "FORCE_CACHE_ALL", or "BYPASS_CACHE", you must omit this field.
     *   A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    private final @Nullable String maxTtl;
    /**
     * Negative caching allows per-status code TTLs to be set, in order to apply fine-grained caching for common errors or redirects. This can reduce the load on your origin and improve end-user experience by reducing response latency.
     * By default, the CDNPolicy will apply the following default TTLs to these status codes:
     * - HTTP 300 (Multiple Choice), 301, 308 (Permanent Redirects): 10m
     * - HTTP 404 (Not Found), 410 (Gone), 451 (Unavailable For Legal Reasons): 120s
     * - HTTP 405 (Method Not Found), 414 (URI Too Long), 501 (Not Implemented): 60s
     *   These defaults can be overridden in negativeCachingPolicy
     * 
     */
    private final @Nullable Boolean negativeCaching;
    /**
     * Sets a cache TTL for the specified HTTP status code. negativeCaching must be enabled to configure negativeCachingPolicy.
     * - Omitting the policy and leaving negativeCaching enabled will use the default TTLs for each status code, defined in negativeCaching.
     * - TTLs must be >= 0 (where 0 is "always revalidate") and <= 86400s (1 day)
     *   Note that when specifying an explicit negativeCachingPolicy, you should take care to specify a cache TTL for all response codes that you wish to cache. The CDNPolicy will not apply any default negative caching when a policy exists.
     * 
     */
    private final @Nullable Map<String,String> negativeCachingPolicy;
    /**
     * The EdgeCacheKeyset containing the set of public keys used to validate signed requests at the edge.
     * 
     */
    private final @Nullable String signedRequestKeyset;
    /**
     * Whether to enforce signed requests. The default value is DISABLED, which means all content is public, and does not authorize access.
     * You must also set a signedRequestKeyset to enable signed requests.
     * When set to REQUIRE_SIGNATURES, all matching requests will have their signature validated. Requests that were not signed with the corresponding private key, or that are otherwise invalid (expired, do not match the signature, IP address, or header) will be rejected with a HTTP 403 and (if enabled) logged.
     * Possible values are `DISABLED` and `REQUIRE_SIGNATURES`.
     * 
     */
    private final @Nullable String signedRequestMode;

    @OutputCustomType.Constructor({"cacheKeyPolicy","cacheMode","clientTtl","defaultTtl","maxTtl","negativeCaching","negativeCachingPolicy","signedRequestKeyset","signedRequestMode"})
    private EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicy(
        @Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicy cacheKeyPolicy,
        @Nullable String cacheMode,
        @Nullable String clientTtl,
        @Nullable String defaultTtl,
        @Nullable String maxTtl,
        @Nullable Boolean negativeCaching,
        @Nullable Map<String,String> negativeCachingPolicy,
        @Nullable String signedRequestKeyset,
        @Nullable String signedRequestMode) {
        this.cacheKeyPolicy = cacheKeyPolicy;
        this.cacheMode = cacheMode;
        this.clientTtl = clientTtl;
        this.defaultTtl = defaultTtl;
        this.maxTtl = maxTtl;
        this.negativeCaching = negativeCaching;
        this.negativeCachingPolicy = negativeCachingPolicy;
        this.signedRequestKeyset = signedRequestKeyset;
        this.signedRequestMode = signedRequestMode;
    }

    /**
     * Defines the request parameters that contribute to the cache key.
     * Structure is documented below.
     * 
     */
    public Optional<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicy> getCacheKeyPolicy() {
        return Optional.ofNullable(this.cacheKeyPolicy);
    }
    /**
     * Cache modes allow users to control the behaviour of the cache, what content it should cache automatically, whether to respect origin headers, or whether to unconditionally cache all responses.
     * For all cache modes, Cache-Control headers will be passed to the client. Use clientTtl to override what is sent to the client.
     * Possible values are `CACHE_ALL_STATIC`, `USE_ORIGIN_HEADERS`, `FORCE_CACHE_ALL`, and `BYPASS_CACHE`.
     * 
     */
    public Optional<String> getCacheMode() {
        return Optional.ofNullable(this.cacheMode);
    }
    /**
     * Specifies a separate client (e.g. browser client) TTL, separate from the TTL used by the edge caches. Leaving this empty will use the same cache TTL for both the CDN and the client-facing response.
     * - The TTL must be > 0 and <= 86400s (1 day)
     * - The clientTtl cannot be larger than the defaultTtl (if set)
     * - Fractions of a second are not allowed.
     * - Omit this field to use the defaultTtl, or the max-age set by the origin, as the client-facing TTL.
     *   When the cache mode is set to "USE_ORIGIN_HEADERS" or "BYPASS_CACHE", you must omit this field.
     *   A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    public Optional<String> getClientTtl() {
        return Optional.ofNullable(this.clientTtl);
    }
    /**
     * Specifies the default TTL for cached content served by this origin for responses that do not have an existing valid TTL (max-age or s-max-age).
     * Defaults to 3600s (1 hour).
     * - The TTL must be >= 0 and <= 2592000s (1 month)
     * - Setting a TTL of "0" means "always revalidate" (equivalent to must-revalidate)
     * - The value of defaultTTL cannot be set to a value greater than that of maxTTL.
     * - Fractions of a second are not allowed.
     * - When the cacheMode is set to FORCE_CACHE_ALL, the defaultTTL will overwrite the TTL set in all responses.
     *   Note that infrequently accessed objects may be evicted from the cache before the defined TTL. Objects that expire will be revalidated with the origin.
     *   When the cache mode is set to "USE_ORIGIN_HEADERS" or "BYPASS_CACHE", you must omit this field.
     *   A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    public Optional<String> getDefaultTtl() {
        return Optional.ofNullable(this.defaultTtl);
    }
    /**
     * Specifies the maximum allowed TTL for cached content served by this origin.
     * Defaults to 86400s (1 day).
     * Cache directives that attempt to set a max-age or s-maxage higher than this, or an Expires header more than maxTtl seconds in the future will be capped at the value of maxTTL, as if it were the value of an s-maxage Cache-Control directive.
     * - The TTL must be >= 0 and <= 2592000s (1 month)
     * - Setting a TTL of "0" means "always revalidate"
     * - The value of maxTtl must be equal to or greater than defaultTtl.
     * - Fractions of a second are not allowed.
     * - When the cache mode is set to "USE_ORIGIN_HEADERS", "FORCE_CACHE_ALL", or "BYPASS_CACHE", you must omit this field.
     *   A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    public Optional<String> getMaxTtl() {
        return Optional.ofNullable(this.maxTtl);
    }
    /**
     * Negative caching allows per-status code TTLs to be set, in order to apply fine-grained caching for common errors or redirects. This can reduce the load on your origin and improve end-user experience by reducing response latency.
     * By default, the CDNPolicy will apply the following default TTLs to these status codes:
     * - HTTP 300 (Multiple Choice), 301, 308 (Permanent Redirects): 10m
     * - HTTP 404 (Not Found), 410 (Gone), 451 (Unavailable For Legal Reasons): 120s
     * - HTTP 405 (Method Not Found), 414 (URI Too Long), 501 (Not Implemented): 60s
     *   These defaults can be overridden in negativeCachingPolicy
     * 
     */
    public Optional<Boolean> getNegativeCaching() {
        return Optional.ofNullable(this.negativeCaching);
    }
    /**
     * Sets a cache TTL for the specified HTTP status code. negativeCaching must be enabled to configure negativeCachingPolicy.
     * - Omitting the policy and leaving negativeCaching enabled will use the default TTLs for each status code, defined in negativeCaching.
     * - TTLs must be >= 0 (where 0 is "always revalidate") and <= 86400s (1 day)
     *   Note that when specifying an explicit negativeCachingPolicy, you should take care to specify a cache TTL for all response codes that you wish to cache. The CDNPolicy will not apply any default negative caching when a policy exists.
     * 
     */
    public Map<String,String> getNegativeCachingPolicy() {
        return this.negativeCachingPolicy == null ? Map.of() : this.negativeCachingPolicy;
    }
    /**
     * The EdgeCacheKeyset containing the set of public keys used to validate signed requests at the edge.
     * 
     */
    public Optional<String> getSignedRequestKeyset() {
        return Optional.ofNullable(this.signedRequestKeyset);
    }
    /**
     * Whether to enforce signed requests. The default value is DISABLED, which means all content is public, and does not authorize access.
     * You must also set a signedRequestKeyset to enable signed requests.
     * When set to REQUIRE_SIGNATURES, all matching requests will have their signature validated. Requests that were not signed with the corresponding private key, or that are otherwise invalid (expired, do not match the signature, IP address, or header) will be rejected with a HTTP 403 and (if enabled) logged.
     * Possible values are `DISABLED` and `REQUIRE_SIGNATURES`.
     * 
     */
    public Optional<String> getSignedRequestMode() {
        return Optional.ofNullable(this.signedRequestMode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicy cacheKeyPolicy;
        private @Nullable String cacheMode;
        private @Nullable String clientTtl;
        private @Nullable String defaultTtl;
        private @Nullable String maxTtl;
        private @Nullable Boolean negativeCaching;
        private @Nullable Map<String,String> negativeCachingPolicy;
        private @Nullable String signedRequestKeyset;
        private @Nullable String signedRequestMode;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheKeyPolicy = defaults.cacheKeyPolicy;
    	      this.cacheMode = defaults.cacheMode;
    	      this.clientTtl = defaults.clientTtl;
    	      this.defaultTtl = defaults.defaultTtl;
    	      this.maxTtl = defaults.maxTtl;
    	      this.negativeCaching = defaults.negativeCaching;
    	      this.negativeCachingPolicy = defaults.negativeCachingPolicy;
    	      this.signedRequestKeyset = defaults.signedRequestKeyset;
    	      this.signedRequestMode = defaults.signedRequestMode;
        }

        public Builder setCacheKeyPolicy(@Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicy cacheKeyPolicy) {
            this.cacheKeyPolicy = cacheKeyPolicy;
            return this;
        }

        public Builder setCacheMode(@Nullable String cacheMode) {
            this.cacheMode = cacheMode;
            return this;
        }

        public Builder setClientTtl(@Nullable String clientTtl) {
            this.clientTtl = clientTtl;
            return this;
        }

        public Builder setDefaultTtl(@Nullable String defaultTtl) {
            this.defaultTtl = defaultTtl;
            return this;
        }

        public Builder setMaxTtl(@Nullable String maxTtl) {
            this.maxTtl = maxTtl;
            return this;
        }

        public Builder setNegativeCaching(@Nullable Boolean negativeCaching) {
            this.negativeCaching = negativeCaching;
            return this;
        }

        public Builder setNegativeCachingPolicy(@Nullable Map<String,String> negativeCachingPolicy) {
            this.negativeCachingPolicy = negativeCachingPolicy;
            return this;
        }

        public Builder setSignedRequestKeyset(@Nullable String signedRequestKeyset) {
            this.signedRequestKeyset = signedRequestKeyset;
            return this;
        }

        public Builder setSignedRequestMode(@Nullable String signedRequestMode) {
            this.signedRequestMode = signedRequestMode;
            return this;
        }

        public EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicy build() {
            return new EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicy(cacheKeyPolicy, cacheMode, clientTtl, defaultTtl, maxTtl, negativeCaching, negativeCachingPolicy, signedRequestKeyset, signedRequestMode);
        }
    }
}
