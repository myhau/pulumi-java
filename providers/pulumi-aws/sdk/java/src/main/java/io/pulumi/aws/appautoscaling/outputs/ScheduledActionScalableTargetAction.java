// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appautoscaling.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ScheduledActionScalableTargetAction {
    /**
     * The maximum capacity. At least one of `max_capacity` or `min_capacity` must be set.
     * 
     */
    private final @Nullable Integer maxCapacity;
    /**
     * The minimum capacity. At least one of `min_capacity` or `max_capacity` must be set.
     * 
     */
    private final @Nullable Integer minCapacity;

    @OutputCustomType.Constructor({"maxCapacity","minCapacity"})
    private ScheduledActionScalableTargetAction(
        @Nullable Integer maxCapacity,
        @Nullable Integer minCapacity) {
        this.maxCapacity = maxCapacity;
        this.minCapacity = minCapacity;
    }

    /**
     * The maximum capacity. At least one of `max_capacity` or `min_capacity` must be set.
     * 
     */
    public Optional<Integer> getMaxCapacity() {
        return Optional.ofNullable(this.maxCapacity);
    }
    /**
     * The minimum capacity. At least one of `min_capacity` or `max_capacity` must be set.
     * 
     */
    public Optional<Integer> getMinCapacity() {
        return Optional.ofNullable(this.minCapacity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledActionScalableTargetAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxCapacity;
        private @Nullable Integer minCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledActionScalableTargetAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxCapacity = defaults.maxCapacity;
    	      this.minCapacity = defaults.minCapacity;
        }

        public Builder setMaxCapacity(@Nullable Integer maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }

        public Builder setMinCapacity(@Nullable Integer minCapacity) {
            this.minCapacity = minCapacity;
            return this;
        }
        public ScheduledActionScalableTargetAction build() {
            return new ScheduledActionScalableTargetAction(maxCapacity, minCapacity);
        }
    }
}
