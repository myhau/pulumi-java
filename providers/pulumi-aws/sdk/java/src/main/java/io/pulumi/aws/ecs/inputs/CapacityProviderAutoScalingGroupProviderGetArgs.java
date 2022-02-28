// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.aws.ecs.inputs.CapacityProviderAutoScalingGroupProviderManagedScalingGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CapacityProviderAutoScalingGroupProviderGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CapacityProviderAutoScalingGroupProviderGetArgs Empty = new CapacityProviderAutoScalingGroupProviderGetArgs();

    /**
     * - ARN of the associated auto scaling group.
     * 
     */
    @InputImport(name="autoScalingGroupArn", required=true)
      private final Input<String> autoScalingGroupArn;

    public Input<String> getAutoScalingGroupArn() {
        return this.autoScalingGroupArn;
    }

    /**
     * - Configuration block defining the parameters of the auto scaling. Detailed below.
     * 
     */
    @InputImport(name="managedScaling")
      private final @Nullable Input<CapacityProviderAutoScalingGroupProviderManagedScalingGetArgs> managedScaling;

    public Input<CapacityProviderAutoScalingGroupProviderManagedScalingGetArgs> getManagedScaling() {
        return this.managedScaling == null ? Input.empty() : this.managedScaling;
    }

    /**
     * - Enables or disables container-aware termination of instances in the auto scaling group when scale-in happens. Valid values are `ENABLED` and `DISABLED`.
     * 
     */
    @InputImport(name="managedTerminationProtection")
      private final @Nullable Input<String> managedTerminationProtection;

    public Input<String> getManagedTerminationProtection() {
        return this.managedTerminationProtection == null ? Input.empty() : this.managedTerminationProtection;
    }

    public CapacityProviderAutoScalingGroupProviderGetArgs(
        Input<String> autoScalingGroupArn,
        @Nullable Input<CapacityProviderAutoScalingGroupProviderManagedScalingGetArgs> managedScaling,
        @Nullable Input<String> managedTerminationProtection) {
        this.autoScalingGroupArn = Objects.requireNonNull(autoScalingGroupArn, "expected parameter 'autoScalingGroupArn' to be non-null");
        this.managedScaling = managedScaling;
        this.managedTerminationProtection = managedTerminationProtection;
    }

    private CapacityProviderAutoScalingGroupProviderGetArgs() {
        this.autoScalingGroupArn = Input.empty();
        this.managedScaling = Input.empty();
        this.managedTerminationProtection = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapacityProviderAutoScalingGroupProviderGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> autoScalingGroupArn;
        private @Nullable Input<CapacityProviderAutoScalingGroupProviderManagedScalingGetArgs> managedScaling;
        private @Nullable Input<String> managedTerminationProtection;

        public Builder() {
    	      // Empty
        }

        public Builder(CapacityProviderAutoScalingGroupProviderGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoScalingGroupArn = defaults.autoScalingGroupArn;
    	      this.managedScaling = defaults.managedScaling;
    	      this.managedTerminationProtection = defaults.managedTerminationProtection;
        }

        public Builder setAutoScalingGroupArn(Input<String> autoScalingGroupArn) {
            this.autoScalingGroupArn = Objects.requireNonNull(autoScalingGroupArn);
            return this;
        }

        public Builder setAutoScalingGroupArn(String autoScalingGroupArn) {
            this.autoScalingGroupArn = Input.of(Objects.requireNonNull(autoScalingGroupArn));
            return this;
        }

        public Builder setManagedScaling(@Nullable Input<CapacityProviderAutoScalingGroupProviderManagedScalingGetArgs> managedScaling) {
            this.managedScaling = managedScaling;
            return this;
        }

        public Builder setManagedScaling(@Nullable CapacityProviderAutoScalingGroupProviderManagedScalingGetArgs managedScaling) {
            this.managedScaling = Input.ofNullable(managedScaling);
            return this;
        }

        public Builder setManagedTerminationProtection(@Nullable Input<String> managedTerminationProtection) {
            this.managedTerminationProtection = managedTerminationProtection;
            return this;
        }

        public Builder setManagedTerminationProtection(@Nullable String managedTerminationProtection) {
            this.managedTerminationProtection = Input.ofNullable(managedTerminationProtection);
            return this;
        }
        public CapacityProviderAutoScalingGroupProviderGetArgs build() {
            return new CapacityProviderAutoScalingGroupProviderGetArgs(autoScalingGroupArn, managedScaling, managedTerminationProtection);
        }
    }
}
