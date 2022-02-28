// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationEbsBlockDeviceArgs;
import io.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceArgs;
import io.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationRootBlockDeviceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SpotFleetRequestLaunchSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpotFleetRequestLaunchSpecificationArgs Empty = new SpotFleetRequestLaunchSpecificationArgs();

    @InputImport(name="ami", required=true)
      private final Input<String> ami;

    public Input<String> getAmi() {
        return this.ami;
    }

    @InputImport(name="associatePublicIpAddress")
      private final @Nullable Input<Boolean> associatePublicIpAddress;

    public Input<Boolean> getAssociatePublicIpAddress() {
        return this.associatePublicIpAddress == null ? Input.empty() : this.associatePublicIpAddress;
    }

    /**
     * The availability zone in which to place the request.
     * 
     */
    @InputImport(name="availabilityZone")
      private final @Nullable Input<String> availabilityZone;

    public Input<String> getAvailabilityZone() {
        return this.availabilityZone == null ? Input.empty() : this.availabilityZone;
    }

    @InputImport(name="ebsBlockDevices")
      private final @Nullable Input<List<SpotFleetRequestLaunchSpecificationEbsBlockDeviceArgs>> ebsBlockDevices;

    public Input<List<SpotFleetRequestLaunchSpecificationEbsBlockDeviceArgs>> getEbsBlockDevices() {
        return this.ebsBlockDevices == null ? Input.empty() : this.ebsBlockDevices;
    }

    @InputImport(name="ebsOptimized")
      private final @Nullable Input<Boolean> ebsOptimized;

    public Input<Boolean> getEbsOptimized() {
        return this.ebsOptimized == null ? Input.empty() : this.ebsOptimized;
    }

    @InputImport(name="ephemeralBlockDevices")
      private final @Nullable Input<List<SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceArgs>> ephemeralBlockDevices;

    public Input<List<SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceArgs>> getEphemeralBlockDevices() {
        return this.ephemeralBlockDevices == null ? Input.empty() : this.ephemeralBlockDevices;
    }

    @InputImport(name="iamInstanceProfile")
      private final @Nullable Input<String> iamInstanceProfile;

    public Input<String> getIamInstanceProfile() {
        return this.iamInstanceProfile == null ? Input.empty() : this.iamInstanceProfile;
    }

    @InputImport(name="iamInstanceProfileArn")
      private final @Nullable Input<String> iamInstanceProfileArn;

    public Input<String> getIamInstanceProfileArn() {
        return this.iamInstanceProfileArn == null ? Input.empty() : this.iamInstanceProfileArn;
    }

    /**
     * The type of instance to request.
     * 
     */
    @InputImport(name="instanceType", required=true)
      private final Input<String> instanceType;

    public Input<String> getInstanceType() {
        return this.instanceType;
    }

    @InputImport(name="keyName")
      private final @Nullable Input<String> keyName;

    public Input<String> getKeyName() {
        return this.keyName == null ? Input.empty() : this.keyName;
    }

    @InputImport(name="monitoring")
      private final @Nullable Input<Boolean> monitoring;

    public Input<Boolean> getMonitoring() {
        return this.monitoring == null ? Input.empty() : this.monitoring;
    }

    @InputImport(name="placementGroup")
      private final @Nullable Input<String> placementGroup;

    public Input<String> getPlacementGroup() {
        return this.placementGroup == null ? Input.empty() : this.placementGroup;
    }

    @InputImport(name="placementTenancy")
      private final @Nullable Input<String> placementTenancy;

    public Input<String> getPlacementTenancy() {
        return this.placementTenancy == null ? Input.empty() : this.placementTenancy;
    }

    @InputImport(name="rootBlockDevices")
      private final @Nullable Input<List<SpotFleetRequestLaunchSpecificationRootBlockDeviceArgs>> rootBlockDevices;

    public Input<List<SpotFleetRequestLaunchSpecificationRootBlockDeviceArgs>> getRootBlockDevices() {
        return this.rootBlockDevices == null ? Input.empty() : this.rootBlockDevices;
    }

    /**
     * The maximum spot bid for this override request.
     * 
     */
    @InputImport(name="spotPrice")
      private final @Nullable Input<String> spotPrice;

    public Input<String> getSpotPrice() {
        return this.spotPrice == null ? Input.empty() : this.spotPrice;
    }

    /**
     * The subnet in which to launch the requested instance.
     * 
     */
    @InputImport(name="subnetId")
      private final @Nullable Input<String> subnetId;

    public Input<String> getSubnetId() {
        return this.subnetId == null ? Input.empty() : this.subnetId;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="userData")
      private final @Nullable Input<String> userData;

    public Input<String> getUserData() {
        return this.userData == null ? Input.empty() : this.userData;
    }

    @InputImport(name="vpcSecurityGroupIds")
      private final @Nullable Input<List<String>> vpcSecurityGroupIds;

    public Input<List<String>> getVpcSecurityGroupIds() {
        return this.vpcSecurityGroupIds == null ? Input.empty() : this.vpcSecurityGroupIds;
    }

    /**
     * The capacity added to the fleet by a fulfilled request.
     * 
     */
    @InputImport(name="weightedCapacity")
      private final @Nullable Input<String> weightedCapacity;

    public Input<String> getWeightedCapacity() {
        return this.weightedCapacity == null ? Input.empty() : this.weightedCapacity;
    }

    public SpotFleetRequestLaunchSpecificationArgs(
        Input<String> ami,
        @Nullable Input<Boolean> associatePublicIpAddress,
        @Nullable Input<String> availabilityZone,
        @Nullable Input<List<SpotFleetRequestLaunchSpecificationEbsBlockDeviceArgs>> ebsBlockDevices,
        @Nullable Input<Boolean> ebsOptimized,
        @Nullable Input<List<SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceArgs>> ephemeralBlockDevices,
        @Nullable Input<String> iamInstanceProfile,
        @Nullable Input<String> iamInstanceProfileArn,
        Input<String> instanceType,
        @Nullable Input<String> keyName,
        @Nullable Input<Boolean> monitoring,
        @Nullable Input<String> placementGroup,
        @Nullable Input<String> placementTenancy,
        @Nullable Input<List<SpotFleetRequestLaunchSpecificationRootBlockDeviceArgs>> rootBlockDevices,
        @Nullable Input<String> spotPrice,
        @Nullable Input<String> subnetId,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> userData,
        @Nullable Input<List<String>> vpcSecurityGroupIds,
        @Nullable Input<String> weightedCapacity) {
        this.ami = Objects.requireNonNull(ami, "expected parameter 'ami' to be non-null");
        this.associatePublicIpAddress = associatePublicIpAddress;
        this.availabilityZone = availabilityZone;
        this.ebsBlockDevices = ebsBlockDevices;
        this.ebsOptimized = ebsOptimized;
        this.ephemeralBlockDevices = ephemeralBlockDevices;
        this.iamInstanceProfile = iamInstanceProfile;
        this.iamInstanceProfileArn = iamInstanceProfileArn;
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
        this.keyName = keyName;
        this.monitoring = monitoring;
        this.placementGroup = placementGroup;
        this.placementTenancy = placementTenancy;
        this.rootBlockDevices = rootBlockDevices;
        this.spotPrice = spotPrice;
        this.subnetId = subnetId;
        this.tags = tags;
        this.userData = userData;
        this.vpcSecurityGroupIds = vpcSecurityGroupIds;
        this.weightedCapacity = weightedCapacity;
    }

    private SpotFleetRequestLaunchSpecificationArgs() {
        this.ami = Input.empty();
        this.associatePublicIpAddress = Input.empty();
        this.availabilityZone = Input.empty();
        this.ebsBlockDevices = Input.empty();
        this.ebsOptimized = Input.empty();
        this.ephemeralBlockDevices = Input.empty();
        this.iamInstanceProfile = Input.empty();
        this.iamInstanceProfileArn = Input.empty();
        this.instanceType = Input.empty();
        this.keyName = Input.empty();
        this.monitoring = Input.empty();
        this.placementGroup = Input.empty();
        this.placementTenancy = Input.empty();
        this.rootBlockDevices = Input.empty();
        this.spotPrice = Input.empty();
        this.subnetId = Input.empty();
        this.tags = Input.empty();
        this.userData = Input.empty();
        this.vpcSecurityGroupIds = Input.empty();
        this.weightedCapacity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetRequestLaunchSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> ami;
        private @Nullable Input<Boolean> associatePublicIpAddress;
        private @Nullable Input<String> availabilityZone;
        private @Nullable Input<List<SpotFleetRequestLaunchSpecificationEbsBlockDeviceArgs>> ebsBlockDevices;
        private @Nullable Input<Boolean> ebsOptimized;
        private @Nullable Input<List<SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceArgs>> ephemeralBlockDevices;
        private @Nullable Input<String> iamInstanceProfile;
        private @Nullable Input<String> iamInstanceProfileArn;
        private Input<String> instanceType;
        private @Nullable Input<String> keyName;
        private @Nullable Input<Boolean> monitoring;
        private @Nullable Input<String> placementGroup;
        private @Nullable Input<String> placementTenancy;
        private @Nullable Input<List<SpotFleetRequestLaunchSpecificationRootBlockDeviceArgs>> rootBlockDevices;
        private @Nullable Input<String> spotPrice;
        private @Nullable Input<String> subnetId;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> userData;
        private @Nullable Input<List<String>> vpcSecurityGroupIds;
        private @Nullable Input<String> weightedCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetRequestLaunchSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ami = defaults.ami;
    	      this.associatePublicIpAddress = defaults.associatePublicIpAddress;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.ebsBlockDevices = defaults.ebsBlockDevices;
    	      this.ebsOptimized = defaults.ebsOptimized;
    	      this.ephemeralBlockDevices = defaults.ephemeralBlockDevices;
    	      this.iamInstanceProfile = defaults.iamInstanceProfile;
    	      this.iamInstanceProfileArn = defaults.iamInstanceProfileArn;
    	      this.instanceType = defaults.instanceType;
    	      this.keyName = defaults.keyName;
    	      this.monitoring = defaults.monitoring;
    	      this.placementGroup = defaults.placementGroup;
    	      this.placementTenancy = defaults.placementTenancy;
    	      this.rootBlockDevices = defaults.rootBlockDevices;
    	      this.spotPrice = defaults.spotPrice;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
    	      this.userData = defaults.userData;
    	      this.vpcSecurityGroupIds = defaults.vpcSecurityGroupIds;
    	      this.weightedCapacity = defaults.weightedCapacity;
        }

        public Builder setAmi(Input<String> ami) {
            this.ami = Objects.requireNonNull(ami);
            return this;
        }

        public Builder setAmi(String ami) {
            this.ami = Input.of(Objects.requireNonNull(ami));
            return this;
        }

        public Builder setAssociatePublicIpAddress(@Nullable Input<Boolean> associatePublicIpAddress) {
            this.associatePublicIpAddress = associatePublicIpAddress;
            return this;
        }

        public Builder setAssociatePublicIpAddress(@Nullable Boolean associatePublicIpAddress) {
            this.associatePublicIpAddress = Input.ofNullable(associatePublicIpAddress);
            return this;
        }

        public Builder setAvailabilityZone(@Nullable Input<String> availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        public Builder setAvailabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = Input.ofNullable(availabilityZone);
            return this;
        }

        public Builder setEbsBlockDevices(@Nullable Input<List<SpotFleetRequestLaunchSpecificationEbsBlockDeviceArgs>> ebsBlockDevices) {
            this.ebsBlockDevices = ebsBlockDevices;
            return this;
        }

        public Builder setEbsBlockDevices(@Nullable List<SpotFleetRequestLaunchSpecificationEbsBlockDeviceArgs> ebsBlockDevices) {
            this.ebsBlockDevices = Input.ofNullable(ebsBlockDevices);
            return this;
        }

        public Builder setEbsOptimized(@Nullable Input<Boolean> ebsOptimized) {
            this.ebsOptimized = ebsOptimized;
            return this;
        }

        public Builder setEbsOptimized(@Nullable Boolean ebsOptimized) {
            this.ebsOptimized = Input.ofNullable(ebsOptimized);
            return this;
        }

        public Builder setEphemeralBlockDevices(@Nullable Input<List<SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceArgs>> ephemeralBlockDevices) {
            this.ephemeralBlockDevices = ephemeralBlockDevices;
            return this;
        }

        public Builder setEphemeralBlockDevices(@Nullable List<SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceArgs> ephemeralBlockDevices) {
            this.ephemeralBlockDevices = Input.ofNullable(ephemeralBlockDevices);
            return this;
        }

        public Builder setIamInstanceProfile(@Nullable Input<String> iamInstanceProfile) {
            this.iamInstanceProfile = iamInstanceProfile;
            return this;
        }

        public Builder setIamInstanceProfile(@Nullable String iamInstanceProfile) {
            this.iamInstanceProfile = Input.ofNullable(iamInstanceProfile);
            return this;
        }

        public Builder setIamInstanceProfileArn(@Nullable Input<String> iamInstanceProfileArn) {
            this.iamInstanceProfileArn = iamInstanceProfileArn;
            return this;
        }

        public Builder setIamInstanceProfileArn(@Nullable String iamInstanceProfileArn) {
            this.iamInstanceProfileArn = Input.ofNullable(iamInstanceProfileArn);
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

        public Builder setKeyName(@Nullable Input<String> keyName) {
            this.keyName = keyName;
            return this;
        }

        public Builder setKeyName(@Nullable String keyName) {
            this.keyName = Input.ofNullable(keyName);
            return this;
        }

        public Builder setMonitoring(@Nullable Input<Boolean> monitoring) {
            this.monitoring = monitoring;
            return this;
        }

        public Builder setMonitoring(@Nullable Boolean monitoring) {
            this.monitoring = Input.ofNullable(monitoring);
            return this;
        }

        public Builder setPlacementGroup(@Nullable Input<String> placementGroup) {
            this.placementGroup = placementGroup;
            return this;
        }

        public Builder setPlacementGroup(@Nullable String placementGroup) {
            this.placementGroup = Input.ofNullable(placementGroup);
            return this;
        }

        public Builder setPlacementTenancy(@Nullable Input<String> placementTenancy) {
            this.placementTenancy = placementTenancy;
            return this;
        }

        public Builder setPlacementTenancy(@Nullable String placementTenancy) {
            this.placementTenancy = Input.ofNullable(placementTenancy);
            return this;
        }

        public Builder setRootBlockDevices(@Nullable Input<List<SpotFleetRequestLaunchSpecificationRootBlockDeviceArgs>> rootBlockDevices) {
            this.rootBlockDevices = rootBlockDevices;
            return this;
        }

        public Builder setRootBlockDevices(@Nullable List<SpotFleetRequestLaunchSpecificationRootBlockDeviceArgs> rootBlockDevices) {
            this.rootBlockDevices = Input.ofNullable(rootBlockDevices);
            return this;
        }

        public Builder setSpotPrice(@Nullable Input<String> spotPrice) {
            this.spotPrice = spotPrice;
            return this;
        }

        public Builder setSpotPrice(@Nullable String spotPrice) {
            this.spotPrice = Input.ofNullable(spotPrice);
            return this;
        }

        public Builder setSubnetId(@Nullable Input<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder setSubnetId(@Nullable String subnetId) {
            this.subnetId = Input.ofNullable(subnetId);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setUserData(@Nullable Input<String> userData) {
            this.userData = userData;
            return this;
        }

        public Builder setUserData(@Nullable String userData) {
            this.userData = Input.ofNullable(userData);
            return this;
        }

        public Builder setVpcSecurityGroupIds(@Nullable Input<List<String>> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = vpcSecurityGroupIds;
            return this;
        }

        public Builder setVpcSecurityGroupIds(@Nullable List<String> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = Input.ofNullable(vpcSecurityGroupIds);
            return this;
        }

        public Builder setWeightedCapacity(@Nullable Input<String> weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }

        public Builder setWeightedCapacity(@Nullable String weightedCapacity) {
            this.weightedCapacity = Input.ofNullable(weightedCapacity);
            return this;
        }
        public SpotFleetRequestLaunchSpecificationArgs build() {
            return new SpotFleetRequestLaunchSpecificationArgs(ami, associatePublicIpAddress, availabilityZone, ebsBlockDevices, ebsOptimized, ephemeralBlockDevices, iamInstanceProfile, iamInstanceProfileArn, instanceType, keyName, monitoring, placementGroup, placementTenancy, rootBlockDevices, spotPrice, subnetId, tags, userData, vpcSecurityGroupIds, weightedCapacity);
        }
    }
}
