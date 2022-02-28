// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.RouteSpecTcpRouteActionWeightedTargetGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class RouteSpecTcpRouteActionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteSpecTcpRouteActionGetArgs Empty = new RouteSpecTcpRouteActionGetArgs();

    /**
     * The targets that traffic is routed to when a request matches the route.
     * You can specify one or more targets and their relative weights with which to distribute traffic.
     * 
     */
    @InputImport(name="weightedTargets", required=true)
      private final Input<List<RouteSpecTcpRouteActionWeightedTargetGetArgs>> weightedTargets;

    public Input<List<RouteSpecTcpRouteActionWeightedTargetGetArgs>> getWeightedTargets() {
        return this.weightedTargets;
    }

    public RouteSpecTcpRouteActionGetArgs(Input<List<RouteSpecTcpRouteActionWeightedTargetGetArgs>> weightedTargets) {
        this.weightedTargets = Objects.requireNonNull(weightedTargets, "expected parameter 'weightedTargets' to be non-null");
    }

    private RouteSpecTcpRouteActionGetArgs() {
        this.weightedTargets = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecTcpRouteActionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<RouteSpecTcpRouteActionWeightedTargetGetArgs>> weightedTargets;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecTcpRouteActionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.weightedTargets = defaults.weightedTargets;
        }

        public Builder setWeightedTargets(Input<List<RouteSpecTcpRouteActionWeightedTargetGetArgs>> weightedTargets) {
            this.weightedTargets = Objects.requireNonNull(weightedTargets);
            return this;
        }

        public Builder setWeightedTargets(List<RouteSpecTcpRouteActionWeightedTargetGetArgs> weightedTargets) {
            this.weightedTargets = Input.of(Objects.requireNonNull(weightedTargets));
            return this;
        }
        public RouteSpecTcpRouteActionGetArgs build() {
            return new RouteSpecTcpRouteActionGetArgs(weightedTargets);
        }
    }
}
