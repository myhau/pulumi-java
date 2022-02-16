// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionGetArgs;
import io.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleGetArgs;
import io.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionGetArgs;
import io.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirectGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EdgeCacheServiceRoutingPathMatcherRouteRuleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdgeCacheServiceRoutingPathMatcherRouteRuleGetArgs Empty = new EdgeCacheServiceRoutingPathMatcherRouteRuleGetArgs();

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="headerAction")
    private final @Nullable Input<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionGetArgs> headerAction;

    public Input<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionGetArgs> getHeaderAction() {
        return this.headerAction == null ? Input.empty() : this.headerAction;
    }

    @InputImport(name="matchRules", required=true)
    private final Input<List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleGetArgs>> matchRules;

    public Input<List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleGetArgs>> getMatchRules() {
        return this.matchRules;
    }

    @InputImport(name="origin")
    private final @Nullable Input<String> origin;

    public Input<String> getOrigin() {
        return this.origin == null ? Input.empty() : this.origin;
    }

    @InputImport(name="priority", required=true)
    private final Input<String> priority;

    public Input<String> getPriority() {
        return this.priority;
    }

    @InputImport(name="routeAction")
    private final @Nullable Input<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionGetArgs> routeAction;

    public Input<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionGetArgs> getRouteAction() {
        return this.routeAction == null ? Input.empty() : this.routeAction;
    }

    @InputImport(name="urlRedirect")
    private final @Nullable Input<EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirectGetArgs> urlRedirect;

    public Input<EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirectGetArgs> getUrlRedirect() {
        return this.urlRedirect == null ? Input.empty() : this.urlRedirect;
    }

    public EdgeCacheServiceRoutingPathMatcherRouteRuleGetArgs(
        @Nullable Input<String> description,
        @Nullable Input<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionGetArgs> headerAction,
        Input<List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleGetArgs>> matchRules,
        @Nullable Input<String> origin,
        Input<String> priority,
        @Nullable Input<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionGetArgs> routeAction,
        @Nullable Input<EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirectGetArgs> urlRedirect) {
        this.description = description;
        this.headerAction = headerAction;
        this.matchRules = Objects.requireNonNull(matchRules, "expected parameter 'matchRules' to be non-null");
        this.origin = origin;
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.routeAction = routeAction;
        this.urlRedirect = urlRedirect;
    }

    private EdgeCacheServiceRoutingPathMatcherRouteRuleGetArgs() {
        this.description = Input.empty();
        this.headerAction = Input.empty();
        this.matchRules = Input.empty();
        this.origin = Input.empty();
        this.priority = Input.empty();
        this.routeAction = Input.empty();
        this.urlRedirect = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionGetArgs> headerAction;
        private Input<List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleGetArgs>> matchRules;
        private @Nullable Input<String> origin;
        private Input<String> priority;
        private @Nullable Input<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionGetArgs> routeAction;
        private @Nullable Input<EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirectGetArgs> urlRedirect;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRuleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.headerAction = defaults.headerAction;
    	      this.matchRules = defaults.matchRules;
    	      this.origin = defaults.origin;
    	      this.priority = defaults.priority;
    	      this.routeAction = defaults.routeAction;
    	      this.urlRedirect = defaults.urlRedirect;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setHeaderAction(@Nullable Input<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionGetArgs> headerAction) {
            this.headerAction = headerAction;
            return this;
        }

        public Builder setHeaderAction(@Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionGetArgs headerAction) {
            this.headerAction = Input.ofNullable(headerAction);
            return this;
        }

        public Builder setMatchRules(Input<List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleGetArgs>> matchRules) {
            this.matchRules = Objects.requireNonNull(matchRules);
            return this;
        }

        public Builder setMatchRules(List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleGetArgs> matchRules) {
            this.matchRules = Input.of(Objects.requireNonNull(matchRules));
            return this;
        }

        public Builder setOrigin(@Nullable Input<String> origin) {
            this.origin = origin;
            return this;
        }

        public Builder setOrigin(@Nullable String origin) {
            this.origin = Input.ofNullable(origin);
            return this;
        }

        public Builder setPriority(Input<String> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setPriority(String priority) {
            this.priority = Input.of(Objects.requireNonNull(priority));
            return this;
        }

        public Builder setRouteAction(@Nullable Input<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionGetArgs> routeAction) {
            this.routeAction = routeAction;
            return this;
        }

        public Builder setRouteAction(@Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionGetArgs routeAction) {
            this.routeAction = Input.ofNullable(routeAction);
            return this;
        }

        public Builder setUrlRedirect(@Nullable Input<EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirectGetArgs> urlRedirect) {
            this.urlRedirect = urlRedirect;
            return this;
        }

        public Builder setUrlRedirect(@Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirectGetArgs urlRedirect) {
            this.urlRedirect = Input.ofNullable(urlRedirect);
            return this;
        }

        public EdgeCacheServiceRoutingPathMatcherRouteRuleGetArgs build() {
            return new EdgeCacheServiceRoutingPathMatcherRouteRuleGetArgs(description, headerAction, matchRules, origin, priority, routeAction, urlRedirect);
        }
    }
}