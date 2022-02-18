// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewrite {
    /**
     * Prior to forwarding the request to the selected origin, the request's host header is replaced with contents of hostRewrite.
     * 
     */
    private final @Nullable String hostRewrite;
    /**
     * Prior to forwarding the request to the selected origin, the matching portion of the request's path is replaced by pathPrefixRewrite.
     * 
     */
    private final @Nullable String pathPrefixRewrite;
    /**
     * Prior to forwarding the request to the selected origin, if the
     * request matched a pathTemplateMatch, the matching portion of the
     * request's path is replaced re-written using the pattern specified
     * by pathTemplateRewrite.
     * pathTemplateRewrite must be between 1 and 255 characters
     * (inclusive), must start with a '/', and must only use variables
     * captured by the route's pathTemplate matchers.
     * pathTemplateRewrite may only be used when all of a route's
     * MatchRules specify pathTemplate.
     * Only one of pathPrefixRewrite and pathTemplateRewrite may be
     * specified.
     * 
     */
    private final @Nullable String pathTemplateRewrite;

    @OutputCustomType.Constructor({"hostRewrite","pathPrefixRewrite","pathTemplateRewrite"})
    private EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewrite(
        @Nullable String hostRewrite,
        @Nullable String pathPrefixRewrite,
        @Nullable String pathTemplateRewrite) {
        this.hostRewrite = hostRewrite;
        this.pathPrefixRewrite = pathPrefixRewrite;
        this.pathTemplateRewrite = pathTemplateRewrite;
    }

    /**
     * Prior to forwarding the request to the selected origin, the request's host header is replaced with contents of hostRewrite.
     * 
     */
    public Optional<String> getHostRewrite() {
        return Optional.ofNullable(this.hostRewrite);
    }
    /**
     * Prior to forwarding the request to the selected origin, the matching portion of the request's path is replaced by pathPrefixRewrite.
     * 
     */
    public Optional<String> getPathPrefixRewrite() {
        return Optional.ofNullable(this.pathPrefixRewrite);
    }
    /**
     * Prior to forwarding the request to the selected origin, if the
     * request matched a pathTemplateMatch, the matching portion of the
     * request's path is replaced re-written using the pattern specified
     * by pathTemplateRewrite.
     * pathTemplateRewrite must be between 1 and 255 characters
     * (inclusive), must start with a '/', and must only use variables
     * captured by the route's pathTemplate matchers.
     * pathTemplateRewrite may only be used when all of a route's
     * MatchRules specify pathTemplate.
     * Only one of pathPrefixRewrite and pathTemplateRewrite may be
     * specified.
     * 
     */
    public Optional<String> getPathTemplateRewrite() {
        return Optional.ofNullable(this.pathTemplateRewrite);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewrite defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String hostRewrite;
        private @Nullable String pathPrefixRewrite;
        private @Nullable String pathTemplateRewrite;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewrite defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostRewrite = defaults.hostRewrite;
    	      this.pathPrefixRewrite = defaults.pathPrefixRewrite;
    	      this.pathTemplateRewrite = defaults.pathTemplateRewrite;
        }

        public Builder setHostRewrite(@Nullable String hostRewrite) {
            this.hostRewrite = hostRewrite;
            return this;
        }

        public Builder setPathPrefixRewrite(@Nullable String pathPrefixRewrite) {
            this.pathPrefixRewrite = pathPrefixRewrite;
            return this;
        }

        public Builder setPathTemplateRewrite(@Nullable String pathTemplateRewrite) {
            this.pathTemplateRewrite = pathTemplateRewrite;
            return this;
        }

        public EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewrite build() {
            return new EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewrite(hostRewrite, pathPrefixRewrite, pathTemplateRewrite);
        }
    }
}
