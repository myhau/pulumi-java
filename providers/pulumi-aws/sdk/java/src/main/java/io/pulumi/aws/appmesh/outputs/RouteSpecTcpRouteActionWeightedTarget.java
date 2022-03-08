// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RouteSpecTcpRouteActionWeightedTarget {
    /**
     * The virtual node to associate with the weighted target. Must be between 1 and 255 characters in length.
     * 
     */
    private final String virtualNode;
    /**
     * The relative weight of the weighted target. An integer between 0 and 100.
     * 
     */
    private final Integer weight;

    @OutputCustomType.Constructor({"virtualNode","weight"})
    private RouteSpecTcpRouteActionWeightedTarget(
        String virtualNode,
        Integer weight) {
        this.virtualNode = virtualNode;
        this.weight = weight;
    }

    /**
     * The virtual node to associate with the weighted target. Must be between 1 and 255 characters in length.
     * 
    */
    public String getVirtualNode() {
        return this.virtualNode;
    }
    /**
     * The relative weight of the weighted target. An integer between 0 and 100.
     * 
    */
    public Integer getWeight() {
        return this.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecTcpRouteActionWeightedTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String virtualNode;
        private Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecTcpRouteActionWeightedTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.virtualNode = defaults.virtualNode;
    	      this.weight = defaults.weight;
        }

        public Builder setVirtualNode(String virtualNode) {
            this.virtualNode = Objects.requireNonNull(virtualNode);
            return this;
        }

        public Builder setWeight(Integer weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }
        public RouteSpecTcpRouteActionWeightedTarget build() {
            return new RouteSpecTcpRouteActionWeightedTarget(virtualNode, weight);
        }
    }
}
