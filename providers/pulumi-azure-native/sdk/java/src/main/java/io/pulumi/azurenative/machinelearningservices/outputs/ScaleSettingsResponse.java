// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ScaleSettingsResponse {
    /**
     * Max number of nodes to use
     * 
     */
    private final Integer maxNodeCount;
    /**
     * Min number of nodes to use
     * 
     */
    private final @Nullable Integer minNodeCount;
    /**
     * Node Idle Time before scaling down amlCompute. This string needs to be in the RFC Format.
     * 
     */
    private final @Nullable String nodeIdleTimeBeforeScaleDown;

    @OutputCustomType.Constructor({"maxNodeCount","minNodeCount","nodeIdleTimeBeforeScaleDown"})
    private ScaleSettingsResponse(
        Integer maxNodeCount,
        @Nullable Integer minNodeCount,
        @Nullable String nodeIdleTimeBeforeScaleDown) {
        this.maxNodeCount = maxNodeCount;
        this.minNodeCount = minNodeCount;
        this.nodeIdleTimeBeforeScaleDown = nodeIdleTimeBeforeScaleDown;
    }

    /**
     * Max number of nodes to use
     * 
    */
    public Integer getMaxNodeCount() {
        return this.maxNodeCount;
    }
    /**
     * Min number of nodes to use
     * 
    */
    public Optional<Integer> getMinNodeCount() {
        return Optional.ofNullable(this.minNodeCount);
    }
    /**
     * Node Idle Time before scaling down amlCompute. This string needs to be in the RFC Format.
     * 
    */
    public Optional<String> getNodeIdleTimeBeforeScaleDown() {
        return Optional.ofNullable(this.nodeIdleTimeBeforeScaleDown);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxNodeCount;
        private @Nullable Integer minNodeCount;
        private @Nullable String nodeIdleTimeBeforeScaleDown;

        public Builder() {
    	      // Empty
        }

        public Builder(ScaleSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxNodeCount = defaults.maxNodeCount;
    	      this.minNodeCount = defaults.minNodeCount;
    	      this.nodeIdleTimeBeforeScaleDown = defaults.nodeIdleTimeBeforeScaleDown;
        }

        public Builder setMaxNodeCount(Integer maxNodeCount) {
            this.maxNodeCount = Objects.requireNonNull(maxNodeCount);
            return this;
        }

        public Builder setMinNodeCount(@Nullable Integer minNodeCount) {
            this.minNodeCount = minNodeCount;
            return this;
        }

        public Builder setNodeIdleTimeBeforeScaleDown(@Nullable String nodeIdleTimeBeforeScaleDown) {
            this.nodeIdleTimeBeforeScaleDown = nodeIdleTimeBeforeScaleDown;
            return this;
        }
        public ScaleSettingsResponse build() {
            return new ScaleSettingsResponse(maxNodeCount, minNodeCount, nodeIdleTimeBeforeScaleDown);
        }
    }
}
