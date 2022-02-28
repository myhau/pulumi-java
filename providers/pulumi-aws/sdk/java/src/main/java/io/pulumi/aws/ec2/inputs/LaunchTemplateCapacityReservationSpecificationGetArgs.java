// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.LaunchTemplateCapacityReservationSpecificationCapacityReservationTargetGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LaunchTemplateCapacityReservationSpecificationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final LaunchTemplateCapacityReservationSpecificationGetArgs Empty = new LaunchTemplateCapacityReservationSpecificationGetArgs();

    /**
     * Indicates the instance's Capacity Reservation preferences. Can be `open` or `none`. (Default `none`).
     * 
     */
    @InputImport(name="capacityReservationPreference")
      private final @Nullable Input<String> capacityReservationPreference;

    public Input<String> getCapacityReservationPreference() {
        return this.capacityReservationPreference == null ? Input.empty() : this.capacityReservationPreference;
    }

    /**
     * Used to target a specific Capacity Reservation:
     * 
     */
    @InputImport(name="capacityReservationTarget")
      private final @Nullable Input<LaunchTemplateCapacityReservationSpecificationCapacityReservationTargetGetArgs> capacityReservationTarget;

    public Input<LaunchTemplateCapacityReservationSpecificationCapacityReservationTargetGetArgs> getCapacityReservationTarget() {
        return this.capacityReservationTarget == null ? Input.empty() : this.capacityReservationTarget;
    }

    public LaunchTemplateCapacityReservationSpecificationGetArgs(
        @Nullable Input<String> capacityReservationPreference,
        @Nullable Input<LaunchTemplateCapacityReservationSpecificationCapacityReservationTargetGetArgs> capacityReservationTarget) {
        this.capacityReservationPreference = capacityReservationPreference;
        this.capacityReservationTarget = capacityReservationTarget;
    }

    private LaunchTemplateCapacityReservationSpecificationGetArgs() {
        this.capacityReservationPreference = Input.empty();
        this.capacityReservationTarget = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchTemplateCapacityReservationSpecificationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> capacityReservationPreference;
        private @Nullable Input<LaunchTemplateCapacityReservationSpecificationCapacityReservationTargetGetArgs> capacityReservationTarget;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchTemplateCapacityReservationSpecificationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityReservationPreference = defaults.capacityReservationPreference;
    	      this.capacityReservationTarget = defaults.capacityReservationTarget;
        }

        public Builder setCapacityReservationPreference(@Nullable Input<String> capacityReservationPreference) {
            this.capacityReservationPreference = capacityReservationPreference;
            return this;
        }

        public Builder setCapacityReservationPreference(@Nullable String capacityReservationPreference) {
            this.capacityReservationPreference = Input.ofNullable(capacityReservationPreference);
            return this;
        }

        public Builder setCapacityReservationTarget(@Nullable Input<LaunchTemplateCapacityReservationSpecificationCapacityReservationTargetGetArgs> capacityReservationTarget) {
            this.capacityReservationTarget = capacityReservationTarget;
            return this;
        }

        public Builder setCapacityReservationTarget(@Nullable LaunchTemplateCapacityReservationSpecificationCapacityReservationTargetGetArgs capacityReservationTarget) {
            this.capacityReservationTarget = Input.ofNullable(capacityReservationTarget);
            return this;
        }
        public LaunchTemplateCapacityReservationSpecificationGetArgs build() {
            return new LaunchTemplateCapacityReservationSpecificationGetArgs(capacityReservationPreference, capacityReservationTarget);
        }
    }
}
