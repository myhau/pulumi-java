// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute.alpha.inputs.HttpFilterConfigArgs;
import com.pulumi.googlenative.compute.alpha.inputs.HttpHeaderActionArgs;
import com.pulumi.googlenative.compute.alpha.inputs.HttpRedirectActionArgs;
import com.pulumi.googlenative.compute.alpha.inputs.HttpRouteActionArgs;
import com.pulumi.googlenative.compute.alpha.inputs.HttpRouteRuleMatchArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The HttpRouteRule setting specifies how to match an HTTP request and the corresponding routing action that load balancing proxies perform.
 * 
 */
public final class HttpRouteRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final HttpRouteRuleArgs Empty = new HttpRouteRuleArgs();

    /**
     * The short description conveying the intent of this routeRule. The description can have a maximum length of 1024 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The short description conveying the intent of this routeRule. The description can have a maximum length of 1024 characters.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies changes to request and response headers that need to take effect for the selected backendService. The headerAction value specified here is applied before the matching pathMatchers[].headerAction and after pathMatchers[].routeRules[].routeAction.weightedBackendService.backendServiceWeightAction[].headerAction HeaderAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @Import(name="headerAction")
    private @Nullable Output<HttpHeaderActionArgs> headerAction;

    /**
     * @return Specifies changes to request and response headers that need to take effect for the selected backendService. The headerAction value specified here is applied before the matching pathMatchers[].headerAction and after pathMatchers[].routeRules[].routeAction.weightedBackendService.backendServiceWeightAction[].headerAction HeaderAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    public Optional<Output<HttpHeaderActionArgs>> headerAction() {
        return Optional.ofNullable(this.headerAction);
    }

    /**
     * Outbound route specific configuration for networkservices.HttpFilter resources enabled by Traffic Director. httpFilterConfigs only applies for load balancers with loadBalancingScheme set to INTERNAL_SELF_MANAGED. See ForwardingRule for more details. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @Import(name="httpFilterConfigs")
    private @Nullable Output<List<HttpFilterConfigArgs>> httpFilterConfigs;

    /**
     * @return Outbound route specific configuration for networkservices.HttpFilter resources enabled by Traffic Director. httpFilterConfigs only applies for load balancers with loadBalancingScheme set to INTERNAL_SELF_MANAGED. See ForwardingRule for more details. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    public Optional<Output<List<HttpFilterConfigArgs>>> httpFilterConfigs() {
        return Optional.ofNullable(this.httpFilterConfigs);
    }

    /**
     * Outbound route specific metadata supplied to networkservices.HttpFilter resources enabled by Traffic Director. httpFilterMetadata only applies for load balancers with loadBalancingScheme set to INTERNAL_SELF_MANAGED. See ForwardingRule for more details. The only configTypeUrl supported is type.googleapis.com/google.protobuf.Struct Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @Import(name="httpFilterMetadata")
    private @Nullable Output<List<HttpFilterConfigArgs>> httpFilterMetadata;

    /**
     * @return Outbound route specific metadata supplied to networkservices.HttpFilter resources enabled by Traffic Director. httpFilterMetadata only applies for load balancers with loadBalancingScheme set to INTERNAL_SELF_MANAGED. See ForwardingRule for more details. The only configTypeUrl supported is type.googleapis.com/google.protobuf.Struct Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    public Optional<Output<List<HttpFilterConfigArgs>>> httpFilterMetadata() {
        return Optional.ofNullable(this.httpFilterMetadata);
    }

    /**
     * The list of criteria for matching attributes of a request to this routeRule. This list has OR semantics: the request matches this routeRule when any of the matchRules are satisfied. However predicates within a given matchRule have AND semantics. All predicates within a matchRule must match for the request to match the rule.
     * 
     */
    @Import(name="matchRules")
    private @Nullable Output<List<HttpRouteRuleMatchArgs>> matchRules;

    /**
     * @return The list of criteria for matching attributes of a request to this routeRule. This list has OR semantics: the request matches this routeRule when any of the matchRules are satisfied. However predicates within a given matchRule have AND semantics. All predicates within a matchRule must match for the request to match the rule.
     * 
     */
    public Optional<Output<List<HttpRouteRuleMatchArgs>>> matchRules() {
        return Optional.ofNullable(this.matchRules);
    }

    /**
     * For routeRules within a given pathMatcher, priority determines the order in which a load balancer interprets routeRules. RouteRules are evaluated in order of priority, from the lowest to highest number. The priority of a rule decreases as its number increases (1, 2, 3, N+1). The first rule that matches the request is applied. You cannot configure two or more routeRules with the same priority. Priority for each rule must be set to a number from 0 to 2147483647 inclusive. Priority numbers can have gaps, which enable you to add or remove rules in the future without affecting the rest of the rules. For example, 1, 2, 3, 4, 5, 9, 12, 16 is a valid series of priority numbers to which you could add rules numbered from 6 to 8, 10 to 11, and 13 to 15 in the future without any impact on existing rules.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return For routeRules within a given pathMatcher, priority determines the order in which a load balancer interprets routeRules. RouteRules are evaluated in order of priority, from the lowest to highest number. The priority of a rule decreases as its number increases (1, 2, 3, N+1). The first rule that matches the request is applied. You cannot configure two or more routeRules with the same priority. Priority for each rule must be set to a number from 0 to 2147483647 inclusive. Priority numbers can have gaps, which enable you to add or remove rules in the future without affecting the rest of the rules. For example, 1, 2, 3, 4, 5, 9, 12, 16 is a valid series of priority numbers to which you could add rules numbered from 6 to 8, 10 to 11, and 13 to 15 in the future without any impact on existing rules.
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * In response to a matching matchRule, the load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If routeAction specifies any weightedBackendServices, service must not be set. Conversely if service is set, routeAction cannot contain any weightedBackendServices. Only one of urlRedirect, service or routeAction.weightedBackendService must be set. UrlMaps for external HTTP(S) load balancers support only the urlRewrite action within a route rule&#39;s routeAction.
     * 
     */
    @Import(name="routeAction")
    private @Nullable Output<HttpRouteActionArgs> routeAction;

    /**
     * @return In response to a matching matchRule, the load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If routeAction specifies any weightedBackendServices, service must not be set. Conversely if service is set, routeAction cannot contain any weightedBackendServices. Only one of urlRedirect, service or routeAction.weightedBackendService must be set. UrlMaps for external HTTP(S) load balancers support only the urlRewrite action within a route rule&#39;s routeAction.
     * 
     */
    public Optional<Output<HttpRouteActionArgs>> routeAction() {
        return Optional.ofNullable(this.routeAction);
    }

    /**
     * The full or partial URL of the backend service resource to which traffic is directed if this rule is matched. If routeAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. However, if service is specified, routeAction cannot contain any weightedBackendServices. Conversely, if routeAction specifies any weightedBackendServices, service must not be specified. Only one of urlRedirect, service or routeAction.weightedBackendService must be set.
     * 
     */
    @Import(name="service")
    private @Nullable Output<String> service;

    /**
     * @return The full or partial URL of the backend service resource to which traffic is directed if this rule is matched. If routeAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. However, if service is specified, routeAction cannot contain any weightedBackendServices. Conversely, if routeAction specifies any weightedBackendServices, service must not be specified. Only one of urlRedirect, service or routeAction.weightedBackendService must be set.
     * 
     */
    public Optional<Output<String>> service() {
        return Optional.ofNullable(this.service);
    }

    /**
     * When this rule is matched, the request is redirected to a URL specified by urlRedirect. If urlRedirect is specified, service or routeAction must not be set. Not supported when the URL map is bound to a target gRPC proxy.
     * 
     */
    @Import(name="urlRedirect")
    private @Nullable Output<HttpRedirectActionArgs> urlRedirect;

    /**
     * @return When this rule is matched, the request is redirected to a URL specified by urlRedirect. If urlRedirect is specified, service or routeAction must not be set. Not supported when the URL map is bound to a target gRPC proxy.
     * 
     */
    public Optional<Output<HttpRedirectActionArgs>> urlRedirect() {
        return Optional.ofNullable(this.urlRedirect);
    }

    private HttpRouteRuleArgs() {}

    private HttpRouteRuleArgs(HttpRouteRuleArgs $) {
        this.description = $.description;
        this.headerAction = $.headerAction;
        this.httpFilterConfigs = $.httpFilterConfigs;
        this.httpFilterMetadata = $.httpFilterMetadata;
        this.matchRules = $.matchRules;
        this.priority = $.priority;
        this.routeAction = $.routeAction;
        this.service = $.service;
        this.urlRedirect = $.urlRedirect;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpRouteRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpRouteRuleArgs $;

        public Builder() {
            $ = new HttpRouteRuleArgs();
        }

        public Builder(HttpRouteRuleArgs defaults) {
            $ = new HttpRouteRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The short description conveying the intent of this routeRule. The description can have a maximum length of 1024 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The short description conveying the intent of this routeRule. The description can have a maximum length of 1024 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param headerAction Specifies changes to request and response headers that need to take effect for the selected backendService. The headerAction value specified here is applied before the matching pathMatchers[].headerAction and after pathMatchers[].routeRules[].routeAction.weightedBackendService.backendServiceWeightAction[].headerAction HeaderAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
         * 
         * @return builder
         * 
         */
        public Builder headerAction(@Nullable Output<HttpHeaderActionArgs> headerAction) {
            $.headerAction = headerAction;
            return this;
        }

        /**
         * @param headerAction Specifies changes to request and response headers that need to take effect for the selected backendService. The headerAction value specified here is applied before the matching pathMatchers[].headerAction and after pathMatchers[].routeRules[].routeAction.weightedBackendService.backendServiceWeightAction[].headerAction HeaderAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
         * 
         * @return builder
         * 
         */
        public Builder headerAction(HttpHeaderActionArgs headerAction) {
            return headerAction(Output.of(headerAction));
        }

        /**
         * @param httpFilterConfigs Outbound route specific configuration for networkservices.HttpFilter resources enabled by Traffic Director. httpFilterConfigs only applies for load balancers with loadBalancingScheme set to INTERNAL_SELF_MANAGED. See ForwardingRule for more details. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
         * 
         * @return builder
         * 
         */
        public Builder httpFilterConfigs(@Nullable Output<List<HttpFilterConfigArgs>> httpFilterConfigs) {
            $.httpFilterConfigs = httpFilterConfigs;
            return this;
        }

        /**
         * @param httpFilterConfigs Outbound route specific configuration for networkservices.HttpFilter resources enabled by Traffic Director. httpFilterConfigs only applies for load balancers with loadBalancingScheme set to INTERNAL_SELF_MANAGED. See ForwardingRule for more details. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
         * 
         * @return builder
         * 
         */
        public Builder httpFilterConfigs(List<HttpFilterConfigArgs> httpFilterConfigs) {
            return httpFilterConfigs(Output.of(httpFilterConfigs));
        }

        /**
         * @param httpFilterConfigs Outbound route specific configuration for networkservices.HttpFilter resources enabled by Traffic Director. httpFilterConfigs only applies for load balancers with loadBalancingScheme set to INTERNAL_SELF_MANAGED. See ForwardingRule for more details. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
         * 
         * @return builder
         * 
         */
        public Builder httpFilterConfigs(HttpFilterConfigArgs... httpFilterConfigs) {
            return httpFilterConfigs(List.of(httpFilterConfigs));
        }

        /**
         * @param httpFilterMetadata Outbound route specific metadata supplied to networkservices.HttpFilter resources enabled by Traffic Director. httpFilterMetadata only applies for load balancers with loadBalancingScheme set to INTERNAL_SELF_MANAGED. See ForwardingRule for more details. The only configTypeUrl supported is type.googleapis.com/google.protobuf.Struct Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
         * 
         * @return builder
         * 
         */
        public Builder httpFilterMetadata(@Nullable Output<List<HttpFilterConfigArgs>> httpFilterMetadata) {
            $.httpFilterMetadata = httpFilterMetadata;
            return this;
        }

        /**
         * @param httpFilterMetadata Outbound route specific metadata supplied to networkservices.HttpFilter resources enabled by Traffic Director. httpFilterMetadata only applies for load balancers with loadBalancingScheme set to INTERNAL_SELF_MANAGED. See ForwardingRule for more details. The only configTypeUrl supported is type.googleapis.com/google.protobuf.Struct Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
         * 
         * @return builder
         * 
         */
        public Builder httpFilterMetadata(List<HttpFilterConfigArgs> httpFilterMetadata) {
            return httpFilterMetadata(Output.of(httpFilterMetadata));
        }

        /**
         * @param httpFilterMetadata Outbound route specific metadata supplied to networkservices.HttpFilter resources enabled by Traffic Director. httpFilterMetadata only applies for load balancers with loadBalancingScheme set to INTERNAL_SELF_MANAGED. See ForwardingRule for more details. The only configTypeUrl supported is type.googleapis.com/google.protobuf.Struct Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
         * 
         * @return builder
         * 
         */
        public Builder httpFilterMetadata(HttpFilterConfigArgs... httpFilterMetadata) {
            return httpFilterMetadata(List.of(httpFilterMetadata));
        }

        /**
         * @param matchRules The list of criteria for matching attributes of a request to this routeRule. This list has OR semantics: the request matches this routeRule when any of the matchRules are satisfied. However predicates within a given matchRule have AND semantics. All predicates within a matchRule must match for the request to match the rule.
         * 
         * @return builder
         * 
         */
        public Builder matchRules(@Nullable Output<List<HttpRouteRuleMatchArgs>> matchRules) {
            $.matchRules = matchRules;
            return this;
        }

        /**
         * @param matchRules The list of criteria for matching attributes of a request to this routeRule. This list has OR semantics: the request matches this routeRule when any of the matchRules are satisfied. However predicates within a given matchRule have AND semantics. All predicates within a matchRule must match for the request to match the rule.
         * 
         * @return builder
         * 
         */
        public Builder matchRules(List<HttpRouteRuleMatchArgs> matchRules) {
            return matchRules(Output.of(matchRules));
        }

        /**
         * @param matchRules The list of criteria for matching attributes of a request to this routeRule. This list has OR semantics: the request matches this routeRule when any of the matchRules are satisfied. However predicates within a given matchRule have AND semantics. All predicates within a matchRule must match for the request to match the rule.
         * 
         * @return builder
         * 
         */
        public Builder matchRules(HttpRouteRuleMatchArgs... matchRules) {
            return matchRules(List.of(matchRules));
        }

        /**
         * @param priority For routeRules within a given pathMatcher, priority determines the order in which a load balancer interprets routeRules. RouteRules are evaluated in order of priority, from the lowest to highest number. The priority of a rule decreases as its number increases (1, 2, 3, N+1). The first rule that matches the request is applied. You cannot configure two or more routeRules with the same priority. Priority for each rule must be set to a number from 0 to 2147483647 inclusive. Priority numbers can have gaps, which enable you to add or remove rules in the future without affecting the rest of the rules. For example, 1, 2, 3, 4, 5, 9, 12, 16 is a valid series of priority numbers to which you could add rules numbered from 6 to 8, 10 to 11, and 13 to 15 in the future without any impact on existing rules.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority For routeRules within a given pathMatcher, priority determines the order in which a load balancer interprets routeRules. RouteRules are evaluated in order of priority, from the lowest to highest number. The priority of a rule decreases as its number increases (1, 2, 3, N+1). The first rule that matches the request is applied. You cannot configure two or more routeRules with the same priority. Priority for each rule must be set to a number from 0 to 2147483647 inclusive. Priority numbers can have gaps, which enable you to add or remove rules in the future without affecting the rest of the rules. For example, 1, 2, 3, 4, 5, 9, 12, 16 is a valid series of priority numbers to which you could add rules numbered from 6 to 8, 10 to 11, and 13 to 15 in the future without any impact on existing rules.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param routeAction In response to a matching matchRule, the load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If routeAction specifies any weightedBackendServices, service must not be set. Conversely if service is set, routeAction cannot contain any weightedBackendServices. Only one of urlRedirect, service or routeAction.weightedBackendService must be set. UrlMaps for external HTTP(S) load balancers support only the urlRewrite action within a route rule&#39;s routeAction.
         * 
         * @return builder
         * 
         */
        public Builder routeAction(@Nullable Output<HttpRouteActionArgs> routeAction) {
            $.routeAction = routeAction;
            return this;
        }

        /**
         * @param routeAction In response to a matching matchRule, the load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If routeAction specifies any weightedBackendServices, service must not be set. Conversely if service is set, routeAction cannot contain any weightedBackendServices. Only one of urlRedirect, service or routeAction.weightedBackendService must be set. UrlMaps for external HTTP(S) load balancers support only the urlRewrite action within a route rule&#39;s routeAction.
         * 
         * @return builder
         * 
         */
        public Builder routeAction(HttpRouteActionArgs routeAction) {
            return routeAction(Output.of(routeAction));
        }

        /**
         * @param service The full or partial URL of the backend service resource to which traffic is directed if this rule is matched. If routeAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. However, if service is specified, routeAction cannot contain any weightedBackendServices. Conversely, if routeAction specifies any weightedBackendServices, service must not be specified. Only one of urlRedirect, service or routeAction.weightedBackendService must be set.
         * 
         * @return builder
         * 
         */
        public Builder service(@Nullable Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service The full or partial URL of the backend service resource to which traffic is directed if this rule is matched. If routeAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. However, if service is specified, routeAction cannot contain any weightedBackendServices. Conversely, if routeAction specifies any weightedBackendServices, service must not be specified. Only one of urlRedirect, service or routeAction.weightedBackendService must be set.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        /**
         * @param urlRedirect When this rule is matched, the request is redirected to a URL specified by urlRedirect. If urlRedirect is specified, service or routeAction must not be set. Not supported when the URL map is bound to a target gRPC proxy.
         * 
         * @return builder
         * 
         */
        public Builder urlRedirect(@Nullable Output<HttpRedirectActionArgs> urlRedirect) {
            $.urlRedirect = urlRedirect;
            return this;
        }

        /**
         * @param urlRedirect When this rule is matched, the request is redirected to a URL specified by urlRedirect. If urlRedirect is specified, service or routeAction must not be set. Not supported when the URL map is bound to a target gRPC proxy.
         * 
         * @return builder
         * 
         */
        public Builder urlRedirect(HttpRedirectActionArgs urlRedirect) {
            return urlRedirect(Output.of(urlRedirect));
        }

        public HttpRouteRuleArgs build() {
            return $;
        }
    }

}
