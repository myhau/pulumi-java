// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.RouteSpecTcpRouteActionWeightedTarget;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class RouteSpecTcpRouteAction {
    /**
     * The targets that traffic is routed to when a request matches the route.
     * You can specify one or more targets and their relative weights with which to distribute traffic.
     * 
     */
    private final List<RouteSpecTcpRouteActionWeightedTarget> weightedTargets;

    @OutputCustomType.Constructor({"weightedTargets"})
    private RouteSpecTcpRouteAction(List<RouteSpecTcpRouteActionWeightedTarget> weightedTargets) {
        this.weightedTargets = Objects.requireNonNull(weightedTargets);
    }

    /**
     * The targets that traffic is routed to when a request matches the route.
     * You can specify one or more targets and their relative weights with which to distribute traffic.
     * 
     */
    public List<RouteSpecTcpRouteActionWeightedTarget> getWeightedTargets() {
        return this.weightedTargets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecTcpRouteAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<RouteSpecTcpRouteActionWeightedTarget> weightedTargets;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecTcpRouteAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.weightedTargets = defaults.weightedTargets;
        }

        public Builder setWeightedTargets(List<RouteSpecTcpRouteActionWeightedTarget> weightedTargets) {
            this.weightedTargets = Objects.requireNonNull(weightedTargets);
            return this;
        }
        public RouteSpecTcpRouteAction build() {
            return new RouteSpecTcpRouteAction(weightedTargets);
        }
    }
}
