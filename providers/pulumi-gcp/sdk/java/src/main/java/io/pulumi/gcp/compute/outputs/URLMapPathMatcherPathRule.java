// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.URLMapPathMatcherPathRuleRouteAction;
import io.pulumi.gcp.compute.outputs.URLMapPathMatcherPathRuleUrlRedirect;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class URLMapPathMatcherPathRule {
    /**
     * The list of path patterns to match. Each must start with / and the only place a
     * \* is allowed is at the end following a /. The string fed to the path matcher
     * does not include any text after the first ? or #, and those chars are not
     * allowed here.
     * 
     */
    private final List<String> paths;
    /**
     * In response to a matching matchRule, the load balancer performs advanced routing
     * actions like URL rewrites, header transformations, etc. prior to forwarding the
     * request to the selected backend. If  routeAction specifies any
     * weightedBackendServices, service must not be set. Conversely if service is set,
     * routeAction cannot contain any  weightedBackendServices. Only one of routeAction
     * or urlRedirect must be set.
     * Structure is documented below.
     * 
     */
    private final @Nullable URLMapPathMatcherPathRuleRouteAction routeAction;
    /**
     * The backend service or backend bucket link that should be matched by this test.
     * 
     */
    private final @Nullable String service;
    /**
     * When this rule is matched, the request is redirected to a URL specified by
     * urlRedirect. If urlRedirect is specified, service or routeAction must not be
     * set.
     * Structure is documented below.
     * 
     */
    private final @Nullable URLMapPathMatcherPathRuleUrlRedirect urlRedirect;

    @OutputCustomType.Constructor({"paths","routeAction","service","urlRedirect"})
    private URLMapPathMatcherPathRule(
        List<String> paths,
        @Nullable URLMapPathMatcherPathRuleRouteAction routeAction,
        @Nullable String service,
        @Nullable URLMapPathMatcherPathRuleUrlRedirect urlRedirect) {
        this.paths = paths;
        this.routeAction = routeAction;
        this.service = service;
        this.urlRedirect = urlRedirect;
    }

    /**
     * The list of path patterns to match. Each must start with / and the only place a
     * \* is allowed is at the end following a /. The string fed to the path matcher
     * does not include any text after the first ? or #, and those chars are not
     * allowed here.
     * 
    */
    public List<String> getPaths() {
        return this.paths;
    }
    /**
     * In response to a matching matchRule, the load balancer performs advanced routing
     * actions like URL rewrites, header transformations, etc. prior to forwarding the
     * request to the selected backend. If  routeAction specifies any
     * weightedBackendServices, service must not be set. Conversely if service is set,
     * routeAction cannot contain any  weightedBackendServices. Only one of routeAction
     * or urlRedirect must be set.
     * Structure is documented below.
     * 
    */
    public Optional<URLMapPathMatcherPathRuleRouteAction> getRouteAction() {
        return Optional.ofNullable(this.routeAction);
    }
    /**
     * The backend service or backend bucket link that should be matched by this test.
     * 
    */
    public Optional<String> getService() {
        return Optional.ofNullable(this.service);
    }
    /**
     * When this rule is matched, the request is redirected to a URL specified by
     * urlRedirect. If urlRedirect is specified, service or routeAction must not be
     * set.
     * Structure is documented below.
     * 
    */
    public Optional<URLMapPathMatcherPathRuleUrlRedirect> getUrlRedirect() {
        return Optional.ofNullable(this.urlRedirect);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherPathRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> paths;
        private @Nullable URLMapPathMatcherPathRuleRouteAction routeAction;
        private @Nullable String service;
        private @Nullable URLMapPathMatcherPathRuleUrlRedirect urlRedirect;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherPathRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.paths = defaults.paths;
    	      this.routeAction = defaults.routeAction;
    	      this.service = defaults.service;
    	      this.urlRedirect = defaults.urlRedirect;
        }

        public Builder setPaths(List<String> paths) {
            this.paths = Objects.requireNonNull(paths);
            return this;
        }

        public Builder setRouteAction(@Nullable URLMapPathMatcherPathRuleRouteAction routeAction) {
            this.routeAction = routeAction;
            return this;
        }

        public Builder setService(@Nullable String service) {
            this.service = service;
            return this;
        }

        public Builder setUrlRedirect(@Nullable URLMapPathMatcherPathRuleUrlRedirect urlRedirect) {
            this.urlRedirect = urlRedirect;
            return this;
        }
        public URLMapPathMatcherPathRule build() {
            return new URLMapPathMatcherPathRule(paths, routeAction, service, urlRedirect);
        }
    }
}
