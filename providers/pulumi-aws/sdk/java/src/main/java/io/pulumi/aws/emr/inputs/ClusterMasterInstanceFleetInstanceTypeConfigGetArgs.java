// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.inputs;

import io.pulumi.aws.emr.inputs.ClusterMasterInstanceFleetInstanceTypeConfigConfigurationGetArgs;
import io.pulumi.aws.emr.inputs.ClusterMasterInstanceFleetInstanceTypeConfigEbsConfigGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterMasterInstanceFleetInstanceTypeConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterMasterInstanceFleetInstanceTypeConfigGetArgs Empty = new ClusterMasterInstanceFleetInstanceTypeConfigGetArgs();

    /**
     * Bid price for each EC2 instance in the instance group, expressed in USD. By setting this attribute, the instance group is being declared as a Spot Instance, and will implicitly create a Spot request. Leave this blank to use On-Demand Instances.
     * 
     */
    @InputImport(name="bidPrice")
      private final @Nullable Input<String> bidPrice;

    public Input<String> getBidPrice() {
        return this.bidPrice == null ? Input.empty() : this.bidPrice;
    }

    /**
     * Bid price, as a percentage of On-Demand price, for each EC2 Spot instance as defined by `instance_type`. Expressed as a number (for example, 20 specifies 20%). If neither `bid_price` nor `bid_price_as_percentage_of_on_demand_price` is provided, `bid_price_as_percentage_of_on_demand_price` defaults to 100%.
     * 
     */
    @InputImport(name="bidPriceAsPercentageOfOnDemandPrice")
      private final @Nullable Input<Double> bidPriceAsPercentageOfOnDemandPrice;

    public Input<Double> getBidPriceAsPercentageOfOnDemandPrice() {
        return this.bidPriceAsPercentageOfOnDemandPrice == null ? Input.empty() : this.bidPriceAsPercentageOfOnDemandPrice;
    }

    /**
     * Configuration classification that applies when provisioning cluster instances, which can include configurations for applications and software that run on the cluster. List of `configuration` blocks.
     * 
     */
    @InputImport(name="configurations")
      private final @Nullable Input<List<ClusterMasterInstanceFleetInstanceTypeConfigConfigurationGetArgs>> configurations;

    public Input<List<ClusterMasterInstanceFleetInstanceTypeConfigConfigurationGetArgs>> getConfigurations() {
        return this.configurations == null ? Input.empty() : this.configurations;
    }

    /**
     * Configuration block(s) for EBS volumes attached to each instance in the instance group. Detailed below.
     * 
     */
    @InputImport(name="ebsConfigs")
      private final @Nullable Input<List<ClusterMasterInstanceFleetInstanceTypeConfigEbsConfigGetArgs>> ebsConfigs;

    public Input<List<ClusterMasterInstanceFleetInstanceTypeConfigEbsConfigGetArgs>> getEbsConfigs() {
        return this.ebsConfigs == null ? Input.empty() : this.ebsConfigs;
    }

    /**
     * EC2 instance type for all instances in the instance group.
     * 
     */
    @InputImport(name="instanceType", required=true)
      private final Input<String> instanceType;

    public Input<String> getInstanceType() {
        return this.instanceType;
    }

    /**
     * Number of units that a provisioned instance of this type provides toward fulfilling the target capacities defined in `aws.emr.InstanceFleet`.
     * 
     */
    @InputImport(name="weightedCapacity")
      private final @Nullable Input<Integer> weightedCapacity;

    public Input<Integer> getWeightedCapacity() {
        return this.weightedCapacity == null ? Input.empty() : this.weightedCapacity;
    }

    public ClusterMasterInstanceFleetInstanceTypeConfigGetArgs(
        @Nullable Input<String> bidPrice,
        @Nullable Input<Double> bidPriceAsPercentageOfOnDemandPrice,
        @Nullable Input<List<ClusterMasterInstanceFleetInstanceTypeConfigConfigurationGetArgs>> configurations,
        @Nullable Input<List<ClusterMasterInstanceFleetInstanceTypeConfigEbsConfigGetArgs>> ebsConfigs,
        Input<String> instanceType,
        @Nullable Input<Integer> weightedCapacity) {
        this.bidPrice = bidPrice;
        this.bidPriceAsPercentageOfOnDemandPrice = bidPriceAsPercentageOfOnDemandPrice;
        this.configurations = configurations;
        this.ebsConfigs = ebsConfigs;
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
        this.weightedCapacity = weightedCapacity;
    }

    private ClusterMasterInstanceFleetInstanceTypeConfigGetArgs() {
        this.bidPrice = Input.empty();
        this.bidPriceAsPercentageOfOnDemandPrice = Input.empty();
        this.configurations = Input.empty();
        this.ebsConfigs = Input.empty();
        this.instanceType = Input.empty();
        this.weightedCapacity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterMasterInstanceFleetInstanceTypeConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> bidPrice;
        private @Nullable Input<Double> bidPriceAsPercentageOfOnDemandPrice;
        private @Nullable Input<List<ClusterMasterInstanceFleetInstanceTypeConfigConfigurationGetArgs>> configurations;
        private @Nullable Input<List<ClusterMasterInstanceFleetInstanceTypeConfigEbsConfigGetArgs>> ebsConfigs;
        private Input<String> instanceType;
        private @Nullable Input<Integer> weightedCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterMasterInstanceFleetInstanceTypeConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bidPrice = defaults.bidPrice;
    	      this.bidPriceAsPercentageOfOnDemandPrice = defaults.bidPriceAsPercentageOfOnDemandPrice;
    	      this.configurations = defaults.configurations;
    	      this.ebsConfigs = defaults.ebsConfigs;
    	      this.instanceType = defaults.instanceType;
    	      this.weightedCapacity = defaults.weightedCapacity;
        }

        public Builder setBidPrice(@Nullable Input<String> bidPrice) {
            this.bidPrice = bidPrice;
            return this;
        }

        public Builder setBidPrice(@Nullable String bidPrice) {
            this.bidPrice = Input.ofNullable(bidPrice);
            return this;
        }

        public Builder setBidPriceAsPercentageOfOnDemandPrice(@Nullable Input<Double> bidPriceAsPercentageOfOnDemandPrice) {
            this.bidPriceAsPercentageOfOnDemandPrice = bidPriceAsPercentageOfOnDemandPrice;
            return this;
        }

        public Builder setBidPriceAsPercentageOfOnDemandPrice(@Nullable Double bidPriceAsPercentageOfOnDemandPrice) {
            this.bidPriceAsPercentageOfOnDemandPrice = Input.ofNullable(bidPriceAsPercentageOfOnDemandPrice);
            return this;
        }

        public Builder setConfigurations(@Nullable Input<List<ClusterMasterInstanceFleetInstanceTypeConfigConfigurationGetArgs>> configurations) {
            this.configurations = configurations;
            return this;
        }

        public Builder setConfigurations(@Nullable List<ClusterMasterInstanceFleetInstanceTypeConfigConfigurationGetArgs> configurations) {
            this.configurations = Input.ofNullable(configurations);
            return this;
        }

        public Builder setEbsConfigs(@Nullable Input<List<ClusterMasterInstanceFleetInstanceTypeConfigEbsConfigGetArgs>> ebsConfigs) {
            this.ebsConfigs = ebsConfigs;
            return this;
        }

        public Builder setEbsConfigs(@Nullable List<ClusterMasterInstanceFleetInstanceTypeConfigEbsConfigGetArgs> ebsConfigs) {
            this.ebsConfigs = Input.ofNullable(ebsConfigs);
            return this;
        }

        public Builder setInstanceType(Input<String> instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Input.of(Objects.requireNonNull(instanceType));
            return this;
        }

        public Builder setWeightedCapacity(@Nullable Input<Integer> weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }

        public Builder setWeightedCapacity(@Nullable Integer weightedCapacity) {
            this.weightedCapacity = Input.ofNullable(weightedCapacity);
            return this;
        }
        public ClusterMasterInstanceFleetInstanceTypeConfigGetArgs build() {
            return new ClusterMasterInstanceFleetInstanceTypeConfigGetArgs(bidPrice, bidPriceAsPercentageOfOnDemandPrice, configurations, ebsConfigs, instanceType, weightedCapacity);
        }
    }
}
