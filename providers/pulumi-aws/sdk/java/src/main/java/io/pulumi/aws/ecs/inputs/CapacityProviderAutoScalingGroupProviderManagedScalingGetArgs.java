// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CapacityProviderAutoScalingGroupProviderManagedScalingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CapacityProviderAutoScalingGroupProviderManagedScalingGetArgs Empty = new CapacityProviderAutoScalingGroupProviderManagedScalingGetArgs();

    /**
     * Period of time, in seconds, after a newly launched Amazon EC2 instance can contribute to CloudWatch metrics for Auto Scaling group. If this parameter is omitted, the default value of 300 seconds is used.
     * 
     */
    @InputImport(name="instanceWarmupPeriod")
      private final @Nullable Input<Integer> instanceWarmupPeriod;

    public Input<Integer> getInstanceWarmupPeriod() {
        return this.instanceWarmupPeriod == null ? Input.empty() : this.instanceWarmupPeriod;
    }

    /**
     * Maximum step adjustment size. A number between 1 and 10,000.
     * 
     */
    @InputImport(name="maximumScalingStepSize")
      private final @Nullable Input<Integer> maximumScalingStepSize;

    public Input<Integer> getMaximumScalingStepSize() {
        return this.maximumScalingStepSize == null ? Input.empty() : this.maximumScalingStepSize;
    }

    /**
     * Minimum step adjustment size. A number between 1 and 10,000.
     * 
     */
    @InputImport(name="minimumScalingStepSize")
      private final @Nullable Input<Integer> minimumScalingStepSize;

    public Input<Integer> getMinimumScalingStepSize() {
        return this.minimumScalingStepSize == null ? Input.empty() : this.minimumScalingStepSize;
    }

    /**
     * Whether auto scaling is managed by ECS. Valid values are `ENABLED` and `DISABLED`.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * Target utilization for the capacity provider. A number between 1 and 100.
     * 
     */
    @InputImport(name="targetCapacity")
      private final @Nullable Input<Integer> targetCapacity;

    public Input<Integer> getTargetCapacity() {
        return this.targetCapacity == null ? Input.empty() : this.targetCapacity;
    }

    public CapacityProviderAutoScalingGroupProviderManagedScalingGetArgs(
        @Nullable Input<Integer> instanceWarmupPeriod,
        @Nullable Input<Integer> maximumScalingStepSize,
        @Nullable Input<Integer> minimumScalingStepSize,
        @Nullable Input<String> status,
        @Nullable Input<Integer> targetCapacity) {
        this.instanceWarmupPeriod = instanceWarmupPeriod;
        this.maximumScalingStepSize = maximumScalingStepSize;
        this.minimumScalingStepSize = minimumScalingStepSize;
        this.status = status;
        this.targetCapacity = targetCapacity;
    }

    private CapacityProviderAutoScalingGroupProviderManagedScalingGetArgs() {
        this.instanceWarmupPeriod = Input.empty();
        this.maximumScalingStepSize = Input.empty();
        this.minimumScalingStepSize = Input.empty();
        this.status = Input.empty();
        this.targetCapacity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapacityProviderAutoScalingGroupProviderManagedScalingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> instanceWarmupPeriod;
        private @Nullable Input<Integer> maximumScalingStepSize;
        private @Nullable Input<Integer> minimumScalingStepSize;
        private @Nullable Input<String> status;
        private @Nullable Input<Integer> targetCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(CapacityProviderAutoScalingGroupProviderManagedScalingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceWarmupPeriod = defaults.instanceWarmupPeriod;
    	      this.maximumScalingStepSize = defaults.maximumScalingStepSize;
    	      this.minimumScalingStepSize = defaults.minimumScalingStepSize;
    	      this.status = defaults.status;
    	      this.targetCapacity = defaults.targetCapacity;
        }

        public Builder setInstanceWarmupPeriod(@Nullable Input<Integer> instanceWarmupPeriod) {
            this.instanceWarmupPeriod = instanceWarmupPeriod;
            return this;
        }

        public Builder setInstanceWarmupPeriod(@Nullable Integer instanceWarmupPeriod) {
            this.instanceWarmupPeriod = Input.ofNullable(instanceWarmupPeriod);
            return this;
        }

        public Builder setMaximumScalingStepSize(@Nullable Input<Integer> maximumScalingStepSize) {
            this.maximumScalingStepSize = maximumScalingStepSize;
            return this;
        }

        public Builder setMaximumScalingStepSize(@Nullable Integer maximumScalingStepSize) {
            this.maximumScalingStepSize = Input.ofNullable(maximumScalingStepSize);
            return this;
        }

        public Builder setMinimumScalingStepSize(@Nullable Input<Integer> minimumScalingStepSize) {
            this.minimumScalingStepSize = minimumScalingStepSize;
            return this;
        }

        public Builder setMinimumScalingStepSize(@Nullable Integer minimumScalingStepSize) {
            this.minimumScalingStepSize = Input.ofNullable(minimumScalingStepSize);
            return this;
        }

        public Builder setStatus(@Nullable Input<String> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder setTargetCapacity(@Nullable Input<Integer> targetCapacity) {
            this.targetCapacity = targetCapacity;
            return this;
        }

        public Builder setTargetCapacity(@Nullable Integer targetCapacity) {
            this.targetCapacity = Input.ofNullable(targetCapacity);
            return this;
        }
        public CapacityProviderAutoScalingGroupProviderManagedScalingGetArgs build() {
            return new CapacityProviderAutoScalingGroupProviderManagedScalingGetArgs(instanceWarmupPeriod, maximumScalingStepSize, minimumScalingStepSize, status, targetCapacity);
        }
    }
}
