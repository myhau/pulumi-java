// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.networkservices.outputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderAction;
import io.pulumi.gcp.networkservices.outputs.EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRule;
import io.pulumi.gcp.networkservices.outputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteAction;
import io.pulumi.gcp.networkservices.outputs.EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirect;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EdgeCacheServiceRoutingPathMatcherRouteRule {
    /**
     * A human-readable description of the resource.
     * 
     */
    private final @Nullable String description;
    /**
     * The header actions, including adding & removing headers, for requests that match this route.
     * Structure is documented below.
     * 
     */
    private final @Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderAction headerAction;
    /**
     * The list of criteria for matching attributes of a request to this routeRule. This list has OR semantics: the request matches this routeRule when any of the matchRules are satisfied. However predicates
     * within a given matchRule have AND semantics. All predicates within a matchRule must match for the request to match the rule.
     * Structure is documented below.
     * 
     */
    private final List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRule> matchRules;
    /**
     * The Origin resource that requests to this route should fetch from when a matching response is not in cache. Origins can be defined as short names ("my-origin") or fully-qualified resource URLs - e.g. "networkservices.googleapis.com/projects/my-project/global/edgecacheorigins/my-origin"
     * Only one of origin or urlRedirect can be set.
     * 
     */
    private final @Nullable String origin;
    /**
     * The priority of this route rule, where 1 is the highest priority.
     * You cannot configure two or more routeRules with the same priority. Priority for each rule must be set to a number between 1 and 999 inclusive.
     * Priority numbers can have gaps, which enable you to add or remove rules in the future without affecting the rest of the rules. For example, 1, 2, 3, 4, 5, 9, 12, 16 is a valid series of priority numbers
     * to which you could add rules numbered from 6 to 8, 10 to 11, and 13 to 15 in the future without any impact on existing rules.
     * 
     */
    private final String priority;
    /**
     * In response to a matching path, the routeAction performs advanced routing actions like URL rewrites, header transformations, etc. prior to forwarding the request to the selected origin.
     * Structure is documented below.
     * 
     */
    private final @Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleRouteAction routeAction;
    /**
     * The URL redirect configuration for requests that match this route.
     * Structure is documented below.
     * 
     */
    private final @Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirect urlRedirect;

    @OutputCustomType.Constructor({"description","headerAction","matchRules","origin","priority","routeAction","urlRedirect"})
    private EdgeCacheServiceRoutingPathMatcherRouteRule(
        @Nullable String description,
        @Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderAction headerAction,
        List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRule> matchRules,
        @Nullable String origin,
        String priority,
        @Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleRouteAction routeAction,
        @Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirect urlRedirect) {
        this.description = description;
        this.headerAction = headerAction;
        this.matchRules = matchRules;
        this.origin = origin;
        this.priority = priority;
        this.routeAction = routeAction;
        this.urlRedirect = urlRedirect;
    }

    /**
     * A human-readable description of the resource.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The header actions, including adding & removing headers, for requests that match this route.
     * Structure is documented below.
     * 
    */
    public Optional<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderAction> getHeaderAction() {
        return Optional.ofNullable(this.headerAction);
    }
    /**
     * The list of criteria for matching attributes of a request to this routeRule. This list has OR semantics: the request matches this routeRule when any of the matchRules are satisfied. However predicates
     * within a given matchRule have AND semantics. All predicates within a matchRule must match for the request to match the rule.
     * Structure is documented below.
     * 
    */
    public List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRule> getMatchRules() {
        return this.matchRules;
    }
    /**
     * The Origin resource that requests to this route should fetch from when a matching response is not in cache. Origins can be defined as short names ("my-origin") or fully-qualified resource URLs - e.g. "networkservices.googleapis.com/projects/my-project/global/edgecacheorigins/my-origin"
     * Only one of origin or urlRedirect can be set.
     * 
    */
    public Optional<String> getOrigin() {
        return Optional.ofNullable(this.origin);
    }
    /**
     * The priority of this route rule, where 1 is the highest priority.
     * You cannot configure two or more routeRules with the same priority. Priority for each rule must be set to a number between 1 and 999 inclusive.
     * Priority numbers can have gaps, which enable you to add or remove rules in the future without affecting the rest of the rules. For example, 1, 2, 3, 4, 5, 9, 12, 16 is a valid series of priority numbers
     * to which you could add rules numbered from 6 to 8, 10 to 11, and 13 to 15 in the future without any impact on existing rules.
     * 
    */
    public String getPriority() {
        return this.priority;
    }
    /**
     * In response to a matching path, the routeAction performs advanced routing actions like URL rewrites, header transformations, etc. prior to forwarding the request to the selected origin.
     * Structure is documented below.
     * 
    */
    public Optional<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteAction> getRouteAction() {
        return Optional.ofNullable(this.routeAction);
    }
    /**
     * The URL redirect configuration for requests that match this route.
     * Structure is documented below.
     * 
    */
    public Optional<EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirect> getUrlRedirect() {
        return Optional.ofNullable(this.urlRedirect);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderAction headerAction;
        private List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRule> matchRules;
        private @Nullable String origin;
        private String priority;
        private @Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleRouteAction routeAction;
        private @Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirect urlRedirect;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.headerAction = defaults.headerAction;
    	      this.matchRules = defaults.matchRules;
    	      this.origin = defaults.origin;
    	      this.priority = defaults.priority;
    	      this.routeAction = defaults.routeAction;
    	      this.urlRedirect = defaults.urlRedirect;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setHeaderAction(@Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderAction headerAction) {
            this.headerAction = headerAction;
            return this;
        }

        public Builder setMatchRules(List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRule> matchRules) {
            this.matchRules = Objects.requireNonNull(matchRules);
            return this;
        }

        public Builder setOrigin(@Nullable String origin) {
            this.origin = origin;
            return this;
        }

        public Builder setPriority(String priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setRouteAction(@Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleRouteAction routeAction) {
            this.routeAction = routeAction;
            return this;
        }

        public Builder setUrlRedirect(@Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirect urlRedirect) {
            this.urlRedirect = urlRedirect;
            return this;
        }
        public EdgeCacheServiceRoutingPathMatcherRouteRule build() {
            return new EdgeCacheServiceRoutingPathMatcherRouteRule(description, headerAction, matchRules, origin, priority, routeAction, urlRedirect);
        }
    }
}
