// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleUrlRedirectArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherPathRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherPathRuleArgs Empty = new RegionUrlMapPathMatcherPathRuleArgs();

    /**
     * The list of path patterns to match. Each must start with / and the only place a
     * \* is allowed is at the end following a /. The string fed to the path matcher
     * does not include any text after the first ? or #, and those chars are not
     * allowed here.
     * 
     */
    @InputImport(name="paths", required=true)
    private final Input<List<String>> paths;

    public Input<List<String>> getPaths() {
        return this.paths;
    }

    /**
     * In response to a matching path, the load balancer performs advanced routing
     * actions like URL rewrites, header transformations, etc. prior to forwarding the
     * request to the selected backend. If routeAction specifies any
     * weightedBackendServices, service must not be set. Conversely if service is set,
     * routeAction cannot contain any  weightedBackendServices. Only one of routeAction
     * or urlRedirect must be set.
     * Structure is documented below.
     * 
     */
    @InputImport(name="routeAction")
    private final @Nullable Input<RegionUrlMapPathMatcherPathRuleRouteActionArgs> routeAction;

    public Input<RegionUrlMapPathMatcherPathRuleRouteActionArgs> getRouteAction() {
        return this.routeAction == null ? Input.empty() : this.routeAction;
    }

    /**
     * A reference to expected RegionBackendService resource the given URL should be mapped to.
     * 
     */
    @InputImport(name="service")
    private final @Nullable Input<String> service;

    public Input<String> getService() {
        return this.service == null ? Input.empty() : this.service;
    }

    /**
     * When a path pattern is matched, the request is redirected to a URL specified
     * by urlRedirect. If urlRedirect is specified, service or routeAction must not
     * be set.
     * Structure is documented below.
     * 
     */
    @InputImport(name="urlRedirect")
    private final @Nullable Input<RegionUrlMapPathMatcherPathRuleUrlRedirectArgs> urlRedirect;

    public Input<RegionUrlMapPathMatcherPathRuleUrlRedirectArgs> getUrlRedirect() {
        return this.urlRedirect == null ? Input.empty() : this.urlRedirect;
    }

    public RegionUrlMapPathMatcherPathRuleArgs(
        Input<List<String>> paths,
        @Nullable Input<RegionUrlMapPathMatcherPathRuleRouteActionArgs> routeAction,
        @Nullable Input<String> service,
        @Nullable Input<RegionUrlMapPathMatcherPathRuleUrlRedirectArgs> urlRedirect) {
        this.paths = Objects.requireNonNull(paths, "expected parameter 'paths' to be non-null");
        this.routeAction = routeAction;
        this.service = service;
        this.urlRedirect = urlRedirect;
    }

    private RegionUrlMapPathMatcherPathRuleArgs() {
        this.paths = Input.empty();
        this.routeAction = Input.empty();
        this.service = Input.empty();
        this.urlRedirect = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherPathRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> paths;
        private @Nullable Input<RegionUrlMapPathMatcherPathRuleRouteActionArgs> routeAction;
        private @Nullable Input<String> service;
        private @Nullable Input<RegionUrlMapPathMatcherPathRuleUrlRedirectArgs> urlRedirect;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherPathRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.paths = defaults.paths;
    	      this.routeAction = defaults.routeAction;
    	      this.service = defaults.service;
    	      this.urlRedirect = defaults.urlRedirect;
        }

        public Builder setPaths(Input<List<String>> paths) {
            this.paths = Objects.requireNonNull(paths);
            return this;
        }

        public Builder setPaths(List<String> paths) {
            this.paths = Input.of(Objects.requireNonNull(paths));
            return this;
        }

        public Builder setRouteAction(@Nullable Input<RegionUrlMapPathMatcherPathRuleRouteActionArgs> routeAction) {
            this.routeAction = routeAction;
            return this;
        }

        public Builder setRouteAction(@Nullable RegionUrlMapPathMatcherPathRuleRouteActionArgs routeAction) {
            this.routeAction = Input.ofNullable(routeAction);
            return this;
        }

        public Builder setService(@Nullable Input<String> service) {
            this.service = service;
            return this;
        }

        public Builder setService(@Nullable String service) {
            this.service = Input.ofNullable(service);
            return this;
        }

        public Builder setUrlRedirect(@Nullable Input<RegionUrlMapPathMatcherPathRuleUrlRedirectArgs> urlRedirect) {
            this.urlRedirect = urlRedirect;
            return this;
        }

        public Builder setUrlRedirect(@Nullable RegionUrlMapPathMatcherPathRuleUrlRedirectArgs urlRedirect) {
            this.urlRedirect = Input.ofNullable(urlRedirect);
            return this;
        }

        public RegionUrlMapPathMatcherPathRuleArgs build() {
            return new RegionUrlMapPathMatcherPathRuleArgs(paths, routeAction, service, urlRedirect);
        }
    }
}
