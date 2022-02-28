// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FleetTargetCapacitySpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final FleetTargetCapacitySpecificationArgs Empty = new FleetTargetCapacitySpecificationArgs();

    /**
     * Default target capacity type. Valid values: `on-demand`, `spot`.
     * 
     */
    @InputImport(name="defaultTargetCapacityType", required=true)
      private final Input<String> defaultTargetCapacityType;

    public Input<String> getDefaultTargetCapacityType() {
        return this.defaultTargetCapacityType;
    }

    /**
     * The number of On-Demand units to request.
     * 
     */
    @InputImport(name="onDemandTargetCapacity")
      private final @Nullable Input<Integer> onDemandTargetCapacity;

    public Input<Integer> getOnDemandTargetCapacity() {
        return this.onDemandTargetCapacity == null ? Input.empty() : this.onDemandTargetCapacity;
    }

    /**
     * The number of Spot units to request.
     * 
     */
    @InputImport(name="spotTargetCapacity")
      private final @Nullable Input<Integer> spotTargetCapacity;

    public Input<Integer> getSpotTargetCapacity() {
        return this.spotTargetCapacity == null ? Input.empty() : this.spotTargetCapacity;
    }

    /**
     * The number of units to request, filled using `default_target_capacity_type`.
     * 
     */
    @InputImport(name="totalTargetCapacity", required=true)
      private final Input<Integer> totalTargetCapacity;

    public Input<Integer> getTotalTargetCapacity() {
        return this.totalTargetCapacity;
    }

    public FleetTargetCapacitySpecificationArgs(
        Input<String> defaultTargetCapacityType,
        @Nullable Input<Integer> onDemandTargetCapacity,
        @Nullable Input<Integer> spotTargetCapacity,
        Input<Integer> totalTargetCapacity) {
        this.defaultTargetCapacityType = Objects.requireNonNull(defaultTargetCapacityType, "expected parameter 'defaultTargetCapacityType' to be non-null");
        this.onDemandTargetCapacity = onDemandTargetCapacity;
        this.spotTargetCapacity = spotTargetCapacity;
        this.totalTargetCapacity = Objects.requireNonNull(totalTargetCapacity, "expected parameter 'totalTargetCapacity' to be non-null");
    }

    private FleetTargetCapacitySpecificationArgs() {
        this.defaultTargetCapacityType = Input.empty();
        this.onDemandTargetCapacity = Input.empty();
        this.spotTargetCapacity = Input.empty();
        this.totalTargetCapacity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetTargetCapacitySpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> defaultTargetCapacityType;
        private @Nullable Input<Integer> onDemandTargetCapacity;
        private @Nullable Input<Integer> spotTargetCapacity;
        private Input<Integer> totalTargetCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetTargetCapacitySpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultTargetCapacityType = defaults.defaultTargetCapacityType;
    	      this.onDemandTargetCapacity = defaults.onDemandTargetCapacity;
    	      this.spotTargetCapacity = defaults.spotTargetCapacity;
    	      this.totalTargetCapacity = defaults.totalTargetCapacity;
        }

        public Builder setDefaultTargetCapacityType(Input<String> defaultTargetCapacityType) {
            this.defaultTargetCapacityType = Objects.requireNonNull(defaultTargetCapacityType);
            return this;
        }

        public Builder setDefaultTargetCapacityType(String defaultTargetCapacityType) {
            this.defaultTargetCapacityType = Input.of(Objects.requireNonNull(defaultTargetCapacityType));
            return this;
        }

        public Builder setOnDemandTargetCapacity(@Nullable Input<Integer> onDemandTargetCapacity) {
            this.onDemandTargetCapacity = onDemandTargetCapacity;
            return this;
        }

        public Builder setOnDemandTargetCapacity(@Nullable Integer onDemandTargetCapacity) {
            this.onDemandTargetCapacity = Input.ofNullable(onDemandTargetCapacity);
            return this;
        }

        public Builder setSpotTargetCapacity(@Nullable Input<Integer> spotTargetCapacity) {
            this.spotTargetCapacity = spotTargetCapacity;
            return this;
        }

        public Builder setSpotTargetCapacity(@Nullable Integer spotTargetCapacity) {
            this.spotTargetCapacity = Input.ofNullable(spotTargetCapacity);
            return this;
        }

        public Builder setTotalTargetCapacity(Input<Integer> totalTargetCapacity) {
            this.totalTargetCapacity = Objects.requireNonNull(totalTargetCapacity);
            return this;
        }

        public Builder setTotalTargetCapacity(Integer totalTargetCapacity) {
            this.totalTargetCapacity = Input.of(Objects.requireNonNull(totalTargetCapacity));
            return this;
        }
        public FleetTargetCapacitySpecificationArgs build() {
            return new FleetTargetCapacitySpecificationArgs(defaultTargetCapacityType, onDemandTargetCapacity, spotTargetCapacity, totalTargetCapacity);
        }
    }
}
