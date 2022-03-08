// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MaxPodsConstraintResponse {
    /**
     * Constraint enforced on the max num of pods per node.
     * 
     */
    private final String maxPodsPerNode;

    @OutputCustomType.Constructor({"maxPodsPerNode"})
    private MaxPodsConstraintResponse(String maxPodsPerNode) {
        this.maxPodsPerNode = maxPodsPerNode;
    }

    /**
     * Constraint enforced on the max num of pods per node.
     * 
    */
    public String getMaxPodsPerNode() {
        return this.maxPodsPerNode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaxPodsConstraintResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String maxPodsPerNode;

        public Builder() {
    	      // Empty
        }

        public Builder(MaxPodsConstraintResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxPodsPerNode = defaults.maxPodsPerNode;
        }

        public Builder setMaxPodsPerNode(String maxPodsPerNode) {
            this.maxPodsPerNode = Objects.requireNonNull(maxPodsPerNode);
            return this;
        }
        public MaxPodsConstraintResponse build() {
            return new MaxPodsConstraintResponse(maxPodsPerNode);
        }
    }
}
