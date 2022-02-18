// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class NodePoolAutoscaling {
    /**
     * Maximum number of nodes in the NodePool. Must be >= min_node_count.
     * 
     */
    private final Integer maxNodeCount;
    /**
     * Minimum number of nodes in the NodePool. Must be >=0 and
     * <= `max_node_count`.
     * 
     */
    private final Integer minNodeCount;

    @OutputCustomType.Constructor({"maxNodeCount","minNodeCount"})
    private NodePoolAutoscaling(
        Integer maxNodeCount,
        Integer minNodeCount) {
        this.maxNodeCount = Objects.requireNonNull(maxNodeCount);
        this.minNodeCount = Objects.requireNonNull(minNodeCount);
    }

    /**
     * Maximum number of nodes in the NodePool. Must be >= min_node_count.
     * 
     */
    public Integer getMaxNodeCount() {
        return this.maxNodeCount;
    }
    /**
     * Minimum number of nodes in the NodePool. Must be >=0 and
     * <= `max_node_count`.
     * 
     */
    public Integer getMinNodeCount() {
        return this.minNodeCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolAutoscaling defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxNodeCount;
        private Integer minNodeCount;

        public Builder() {
    	      // Empty
        }

        public Builder(NodePoolAutoscaling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxNodeCount = defaults.maxNodeCount;
    	      this.minNodeCount = defaults.minNodeCount;
        }

        public Builder setMaxNodeCount(Integer maxNodeCount) {
            this.maxNodeCount = Objects.requireNonNull(maxNodeCount);
            return this;
        }

        public Builder setMinNodeCount(Integer minNodeCount) {
            this.minNodeCount = Objects.requireNonNull(minNodeCount);
            return this;
        }

        public NodePoolAutoscaling build() {
            return new NodePoolAutoscaling(maxNodeCount, minNodeCount);
        }
    }
}
