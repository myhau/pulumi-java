// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.outputs;

import io.pulumi.aws.ecs.outputs.CapacityProviderAutoScalingGroupProviderManagedScaling;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CapacityProviderAutoScalingGroupProvider {
    /**
     * - ARN of the associated auto scaling group.
     * 
     */
    private final String autoScalingGroupArn;
    /**
     * - Configuration block defining the parameters of the auto scaling. Detailed below.
     * 
     */
    private final @Nullable CapacityProviderAutoScalingGroupProviderManagedScaling managedScaling;
    /**
     * - Enables or disables container-aware termination of instances in the auto scaling group when scale-in happens. Valid values are `ENABLED` and `DISABLED`.
     * 
     */
    private final @Nullable String managedTerminationProtection;

    @OutputCustomType.Constructor({"autoScalingGroupArn","managedScaling","managedTerminationProtection"})
    private CapacityProviderAutoScalingGroupProvider(
        String autoScalingGroupArn,
        @Nullable CapacityProviderAutoScalingGroupProviderManagedScaling managedScaling,
        @Nullable String managedTerminationProtection) {
        this.autoScalingGroupArn = Objects.requireNonNull(autoScalingGroupArn);
        this.managedScaling = managedScaling;
        this.managedTerminationProtection = managedTerminationProtection;
    }

    /**
     * - ARN of the associated auto scaling group.
     * 
     */
    public String getAutoScalingGroupArn() {
        return this.autoScalingGroupArn;
    }
    /**
     * - Configuration block defining the parameters of the auto scaling. Detailed below.
     * 
     */
    public Optional<CapacityProviderAutoScalingGroupProviderManagedScaling> getManagedScaling() {
        return Optional.ofNullable(this.managedScaling);
    }
    /**
     * - Enables or disables container-aware termination of instances in the auto scaling group when scale-in happens. Valid values are `ENABLED` and `DISABLED`.
     * 
     */
    public Optional<String> getManagedTerminationProtection() {
        return Optional.ofNullable(this.managedTerminationProtection);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapacityProviderAutoScalingGroupProvider defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String autoScalingGroupArn;
        private @Nullable CapacityProviderAutoScalingGroupProviderManagedScaling managedScaling;
        private @Nullable String managedTerminationProtection;

        public Builder() {
    	      // Empty
        }

        public Builder(CapacityProviderAutoScalingGroupProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoScalingGroupArn = defaults.autoScalingGroupArn;
    	      this.managedScaling = defaults.managedScaling;
    	      this.managedTerminationProtection = defaults.managedTerminationProtection;
        }

        public Builder setAutoScalingGroupArn(String autoScalingGroupArn) {
            this.autoScalingGroupArn = Objects.requireNonNull(autoScalingGroupArn);
            return this;
        }

        public Builder setManagedScaling(@Nullable CapacityProviderAutoScalingGroupProviderManagedScaling managedScaling) {
            this.managedScaling = managedScaling;
            return this;
        }

        public Builder setManagedTerminationProtection(@Nullable String managedTerminationProtection) {
            this.managedTerminationProtection = managedTerminationProtection;
            return this;
        }
        public CapacityProviderAutoScalingGroupProvider build() {
            return new CapacityProviderAutoScalingGroupProvider(autoScalingGroupArn, managedScaling, managedTerminationProtection);
        }
    }
}
