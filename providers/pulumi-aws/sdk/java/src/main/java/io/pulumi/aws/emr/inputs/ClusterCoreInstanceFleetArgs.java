// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.inputs;

import io.pulumi.aws.emr.inputs.ClusterCoreInstanceFleetInstanceTypeConfigArgs;
import io.pulumi.aws.emr.inputs.ClusterCoreInstanceFleetLaunchSpecificationsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterCoreInstanceFleetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterCoreInstanceFleetArgs Empty = new ClusterCoreInstanceFleetArgs();

    /**
     * ID of the cluster.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * Configuration block for instance fleet.
     * 
     */
    @InputImport(name="instanceTypeConfigs")
      private final @Nullable Input<List<ClusterCoreInstanceFleetInstanceTypeConfigArgs>> instanceTypeConfigs;

    public Input<List<ClusterCoreInstanceFleetInstanceTypeConfigArgs>> getInstanceTypeConfigs() {
        return this.instanceTypeConfigs == null ? Input.empty() : this.instanceTypeConfigs;
    }

    /**
     * Configuration block for launch specification.
     * 
     */
    @InputImport(name="launchSpecifications")
      private final @Nullable Input<ClusterCoreInstanceFleetLaunchSpecificationsArgs> launchSpecifications;

    public Input<ClusterCoreInstanceFleetLaunchSpecificationsArgs> getLaunchSpecifications() {
        return this.launchSpecifications == null ? Input.empty() : this.launchSpecifications;
    }

    /**
     * Name of the step.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="provisionedOnDemandCapacity")
      private final @Nullable Input<Integer> provisionedOnDemandCapacity;

    public Input<Integer> getProvisionedOnDemandCapacity() {
        return this.provisionedOnDemandCapacity == null ? Input.empty() : this.provisionedOnDemandCapacity;
    }

    @InputImport(name="provisionedSpotCapacity")
      private final @Nullable Input<Integer> provisionedSpotCapacity;

    public Input<Integer> getProvisionedSpotCapacity() {
        return this.provisionedSpotCapacity == null ? Input.empty() : this.provisionedSpotCapacity;
    }

    /**
     * Target capacity of On-Demand units for the instance fleet, which determines how many On-Demand instances to provision.
     * 
     */
    @InputImport(name="targetOnDemandCapacity")
      private final @Nullable Input<Integer> targetOnDemandCapacity;

    public Input<Integer> getTargetOnDemandCapacity() {
        return this.targetOnDemandCapacity == null ? Input.empty() : this.targetOnDemandCapacity;
    }

    /**
     * Target capacity of Spot units for the instance fleet, which determines how many Spot instances to provision.
     * 
     */
    @InputImport(name="targetSpotCapacity")
      private final @Nullable Input<Integer> targetSpotCapacity;

    public Input<Integer> getTargetSpotCapacity() {
        return this.targetSpotCapacity == null ? Input.empty() : this.targetSpotCapacity;
    }

    public ClusterCoreInstanceFleetArgs(
        @Nullable Input<String> id,
        @Nullable Input<List<ClusterCoreInstanceFleetInstanceTypeConfigArgs>> instanceTypeConfigs,
        @Nullable Input<ClusterCoreInstanceFleetLaunchSpecificationsArgs> launchSpecifications,
        @Nullable Input<String> name,
        @Nullable Input<Integer> provisionedOnDemandCapacity,
        @Nullable Input<Integer> provisionedSpotCapacity,
        @Nullable Input<Integer> targetOnDemandCapacity,
        @Nullable Input<Integer> targetSpotCapacity) {
        this.id = id;
        this.instanceTypeConfigs = instanceTypeConfigs;
        this.launchSpecifications = launchSpecifications;
        this.name = name;
        this.provisionedOnDemandCapacity = provisionedOnDemandCapacity;
        this.provisionedSpotCapacity = provisionedSpotCapacity;
        this.targetOnDemandCapacity = targetOnDemandCapacity;
        this.targetSpotCapacity = targetSpotCapacity;
    }

    private ClusterCoreInstanceFleetArgs() {
        this.id = Input.empty();
        this.instanceTypeConfigs = Input.empty();
        this.launchSpecifications = Input.empty();
        this.name = Input.empty();
        this.provisionedOnDemandCapacity = Input.empty();
        this.provisionedSpotCapacity = Input.empty();
        this.targetOnDemandCapacity = Input.empty();
        this.targetSpotCapacity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterCoreInstanceFleetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;
        private @Nullable Input<List<ClusterCoreInstanceFleetInstanceTypeConfigArgs>> instanceTypeConfigs;
        private @Nullable Input<ClusterCoreInstanceFleetLaunchSpecificationsArgs> launchSpecifications;
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> provisionedOnDemandCapacity;
        private @Nullable Input<Integer> provisionedSpotCapacity;
        private @Nullable Input<Integer> targetOnDemandCapacity;
        private @Nullable Input<Integer> targetSpotCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterCoreInstanceFleetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.instanceTypeConfigs = defaults.instanceTypeConfigs;
    	      this.launchSpecifications = defaults.launchSpecifications;
    	      this.name = defaults.name;
    	      this.provisionedOnDemandCapacity = defaults.provisionedOnDemandCapacity;
    	      this.provisionedSpotCapacity = defaults.provisionedSpotCapacity;
    	      this.targetOnDemandCapacity = defaults.targetOnDemandCapacity;
    	      this.targetSpotCapacity = defaults.targetSpotCapacity;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setInstanceTypeConfigs(@Nullable Input<List<ClusterCoreInstanceFleetInstanceTypeConfigArgs>> instanceTypeConfigs) {
            this.instanceTypeConfigs = instanceTypeConfigs;
            return this;
        }

        public Builder setInstanceTypeConfigs(@Nullable List<ClusterCoreInstanceFleetInstanceTypeConfigArgs> instanceTypeConfigs) {
            this.instanceTypeConfigs = Input.ofNullable(instanceTypeConfigs);
            return this;
        }

        public Builder setLaunchSpecifications(@Nullable Input<ClusterCoreInstanceFleetLaunchSpecificationsArgs> launchSpecifications) {
            this.launchSpecifications = launchSpecifications;
            return this;
        }

        public Builder setLaunchSpecifications(@Nullable ClusterCoreInstanceFleetLaunchSpecificationsArgs launchSpecifications) {
            this.launchSpecifications = Input.ofNullable(launchSpecifications);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProvisionedOnDemandCapacity(@Nullable Input<Integer> provisionedOnDemandCapacity) {
            this.provisionedOnDemandCapacity = provisionedOnDemandCapacity;
            return this;
        }

        public Builder setProvisionedOnDemandCapacity(@Nullable Integer provisionedOnDemandCapacity) {
            this.provisionedOnDemandCapacity = Input.ofNullable(provisionedOnDemandCapacity);
            return this;
        }

        public Builder setProvisionedSpotCapacity(@Nullable Input<Integer> provisionedSpotCapacity) {
            this.provisionedSpotCapacity = provisionedSpotCapacity;
            return this;
        }

        public Builder setProvisionedSpotCapacity(@Nullable Integer provisionedSpotCapacity) {
            this.provisionedSpotCapacity = Input.ofNullable(provisionedSpotCapacity);
            return this;
        }

        public Builder setTargetOnDemandCapacity(@Nullable Input<Integer> targetOnDemandCapacity) {
            this.targetOnDemandCapacity = targetOnDemandCapacity;
            return this;
        }

        public Builder setTargetOnDemandCapacity(@Nullable Integer targetOnDemandCapacity) {
            this.targetOnDemandCapacity = Input.ofNullable(targetOnDemandCapacity);
            return this;
        }

        public Builder setTargetSpotCapacity(@Nullable Input<Integer> targetSpotCapacity) {
            this.targetSpotCapacity = targetSpotCapacity;
            return this;
        }

        public Builder setTargetSpotCapacity(@Nullable Integer targetSpotCapacity) {
            this.targetSpotCapacity = Input.ofNullable(targetSpotCapacity);
            return this;
        }
        public ClusterCoreInstanceFleetArgs build() {
            return new ClusterCoreInstanceFleetArgs(id, instanceTypeConfigs, launchSpecifications, name, provisionedOnDemandCapacity, provisionedSpotCapacity, targetOnDemandCapacity, targetSpotCapacity);
        }
    }
}
