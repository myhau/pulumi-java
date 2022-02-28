// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LaunchTemplateCapacityReservationSpecificationCapacityReservationTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final LaunchTemplateCapacityReservationSpecificationCapacityReservationTargetArgs Empty = new LaunchTemplateCapacityReservationSpecificationCapacityReservationTargetArgs();

    /**
     * The ID of the Capacity Reservation to target.
     * 
     */
    @InputImport(name="capacityReservationId")
      private final @Nullable Input<String> capacityReservationId;

    public Input<String> getCapacityReservationId() {
        return this.capacityReservationId == null ? Input.empty() : this.capacityReservationId;
    }

    public LaunchTemplateCapacityReservationSpecificationCapacityReservationTargetArgs(@Nullable Input<String> capacityReservationId) {
        this.capacityReservationId = capacityReservationId;
    }

    private LaunchTemplateCapacityReservationSpecificationCapacityReservationTargetArgs() {
        this.capacityReservationId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchTemplateCapacityReservationSpecificationCapacityReservationTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> capacityReservationId;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchTemplateCapacityReservationSpecificationCapacityReservationTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityReservationId = defaults.capacityReservationId;
        }

        public Builder setCapacityReservationId(@Nullable Input<String> capacityReservationId) {
            this.capacityReservationId = capacityReservationId;
            return this;
        }

        public Builder setCapacityReservationId(@Nullable String capacityReservationId) {
            this.capacityReservationId = Input.ofNullable(capacityReservationId);
            return this;
        }
        public LaunchTemplateCapacityReservationSpecificationCapacityReservationTargetArgs build() {
            return new LaunchTemplateCapacityReservationSpecificationCapacityReservationTargetArgs(capacityReservationId);
        }
    }
}
