// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewriteGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewriteGetArgs Empty = new EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewriteGetArgs();

    /**
     * Prior to forwarding the request to the selected origin, the request's host header is replaced with contents of hostRewrite.
     * 
     */
    @InputImport(name="hostRewrite")
    private final @Nullable Input<String> hostRewrite;

    public Input<String> getHostRewrite() {
        return this.hostRewrite == null ? Input.empty() : this.hostRewrite;
    }

    /**
     * Prior to forwarding the request to the selected origin, the matching portion of the request's path is replaced by pathPrefixRewrite.
     * 
     */
    @InputImport(name="pathPrefixRewrite")
    private final @Nullable Input<String> pathPrefixRewrite;

    public Input<String> getPathPrefixRewrite() {
        return this.pathPrefixRewrite == null ? Input.empty() : this.pathPrefixRewrite;
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
    @InputImport(name="pathTemplateRewrite")
    private final @Nullable Input<String> pathTemplateRewrite;

    public Input<String> getPathTemplateRewrite() {
        return this.pathTemplateRewrite == null ? Input.empty() : this.pathTemplateRewrite;
    }

    public EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewriteGetArgs(
        @Nullable Input<String> hostRewrite,
        @Nullable Input<String> pathPrefixRewrite,
        @Nullable Input<String> pathTemplateRewrite) {
        this.hostRewrite = hostRewrite;
        this.pathPrefixRewrite = pathPrefixRewrite;
        this.pathTemplateRewrite = pathTemplateRewrite;
    }

    private EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewriteGetArgs() {
        this.hostRewrite = Input.empty();
        this.pathPrefixRewrite = Input.empty();
        this.pathTemplateRewrite = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewriteGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> hostRewrite;
        private @Nullable Input<String> pathPrefixRewrite;
        private @Nullable Input<String> pathTemplateRewrite;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewriteGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostRewrite = defaults.hostRewrite;
    	      this.pathPrefixRewrite = defaults.pathPrefixRewrite;
    	      this.pathTemplateRewrite = defaults.pathTemplateRewrite;
        }

        public Builder setHostRewrite(@Nullable Input<String> hostRewrite) {
            this.hostRewrite = hostRewrite;
            return this;
        }

        public Builder setHostRewrite(@Nullable String hostRewrite) {
            this.hostRewrite = Input.ofNullable(hostRewrite);
            return this;
        }

        public Builder setPathPrefixRewrite(@Nullable Input<String> pathPrefixRewrite) {
            this.pathPrefixRewrite = pathPrefixRewrite;
            return this;
        }

        public Builder setPathPrefixRewrite(@Nullable String pathPrefixRewrite) {
            this.pathPrefixRewrite = Input.ofNullable(pathPrefixRewrite);
            return this;
        }

        public Builder setPathTemplateRewrite(@Nullable Input<String> pathTemplateRewrite) {
            this.pathTemplateRewrite = pathTemplateRewrite;
            return this;
        }

        public Builder setPathTemplateRewrite(@Nullable String pathTemplateRewrite) {
            this.pathTemplateRewrite = Input.ofNullable(pathTemplateRewrite);
            return this;
        }

        public EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewriteGetArgs build() {
            return new EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewriteGetArgs(hostRewrite, pathPrefixRewrite, pathTemplateRewrite);
        }
    }
}
