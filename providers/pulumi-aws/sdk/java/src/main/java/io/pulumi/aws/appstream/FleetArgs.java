// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appstream;

import io.pulumi.aws.appstream.inputs.FleetComputeCapacityArgs;
import io.pulumi.aws.appstream.inputs.FleetDomainJoinInfoArgs;
import io.pulumi.aws.appstream.inputs.FleetVpcConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FleetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FleetArgs Empty = new FleetArgs();

    /**
     * Configuration block for the desired capacity of the fleet. See below.
     * 
     */
    @InputImport(name="computeCapacity", required=true)
      private final Input<FleetComputeCapacityArgs> computeCapacity;

    public Input<FleetComputeCapacityArgs> getComputeCapacity() {
        return this.computeCapacity;
    }

    /**
     * Description to display.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Amount of time that a streaming session remains active after users disconnect.
     * 
     */
    @InputImport(name="disconnectTimeoutInSeconds")
      private final @Nullable Input<Integer> disconnectTimeoutInSeconds;

    public Input<Integer> getDisconnectTimeoutInSeconds() {
        return this.disconnectTimeoutInSeconds == null ? Input.empty() : this.disconnectTimeoutInSeconds;
    }

    /**
     * Human-readable friendly name for the AppStream fleet.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Configuration block for the name of the directory and organizational unit (OU) to use to join the fleet to a Microsoft Active Directory domain. See below.
     * 
     */
    @InputImport(name="domainJoinInfo")
      private final @Nullable Input<FleetDomainJoinInfoArgs> domainJoinInfo;

    public Input<FleetDomainJoinInfoArgs> getDomainJoinInfo() {
        return this.domainJoinInfo == null ? Input.empty() : this.domainJoinInfo;
    }

    /**
     * Enables or disables default internet access for the fleet.
     * 
     */
    @InputImport(name="enableDefaultInternetAccess")
      private final @Nullable Input<Boolean> enableDefaultInternetAccess;

    public Input<Boolean> getEnableDefaultInternetAccess() {
        return this.enableDefaultInternetAccess == null ? Input.empty() : this.enableDefaultInternetAccess;
    }

    /**
     * Fleet type. Valid values are: `ON_DEMAND`, `ALWAYS_ON`
     * 
     */
    @InputImport(name="fleetType")
      private final @Nullable Input<String> fleetType;

    public Input<String> getFleetType() {
        return this.fleetType == null ? Input.empty() : this.fleetType;
    }

    /**
     * ARN of the IAM role to apply to the fleet.
     * 
     */
    @InputImport(name="iamRoleArn")
      private final @Nullable Input<String> iamRoleArn;

    public Input<String> getIamRoleArn() {
        return this.iamRoleArn == null ? Input.empty() : this.iamRoleArn;
    }

    /**
     * Amount of time that users can be idle (inactive) before they are disconnected from their streaming session and the `disconnect_timeout_in_seconds` time interval begins.
     * 
     */
    @InputImport(name="idleDisconnectTimeoutInSeconds")
      private final @Nullable Input<Integer> idleDisconnectTimeoutInSeconds;

    public Input<Integer> getIdleDisconnectTimeoutInSeconds() {
        return this.idleDisconnectTimeoutInSeconds == null ? Input.empty() : this.idleDisconnectTimeoutInSeconds;
    }

    /**
     * ARN of the public, private, or shared image to use.
     * 
     */
    @InputImport(name="imageArn")
      private final @Nullable Input<String> imageArn;

    public Input<String> getImageArn() {
        return this.imageArn == null ? Input.empty() : this.imageArn;
    }

    /**
     * Name of the image used to create the fleet.
     * 
     */
    @InputImport(name="imageName")
      private final @Nullable Input<String> imageName;

    public Input<String> getImageName() {
        return this.imageName == null ? Input.empty() : this.imageName;
    }

    /**
     * Instance type to use when launching fleet instances.
     * 
     */
    @InputImport(name="instanceType", required=true)
      private final Input<String> instanceType;

    public Input<String> getInstanceType() {
        return this.instanceType;
    }

    /**
     * Maximum amount of time that a streaming session can remain active, in seconds.
     * 
     */
    @InputImport(name="maxUserDurationInSeconds")
      private final @Nullable Input<Integer> maxUserDurationInSeconds;

    public Input<Integer> getMaxUserDurationInSeconds() {
        return this.maxUserDurationInSeconds == null ? Input.empty() : this.maxUserDurationInSeconds;
    }

    /**
     * Unique name for the fleet.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * AppStream 2.0 view that is displayed to your users when they stream from the fleet. When `APP` is specified, only the windows of applications opened by users display. When `DESKTOP` is specified, the standard desktop that is provided by the operating system displays. If not specified, defaults to `APP`.
     * 
     */
    @InputImport(name="streamView")
      private final @Nullable Input<String> streamView;

    public Input<String> getStreamView() {
        return this.streamView == null ? Input.empty() : this.streamView;
    }

    /**
     * Map of tags to attach to AppStream instances.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Configuration block for the VPC configuration for the image builder. See below.
     * 
     */
    @InputImport(name="vpcConfig")
      private final @Nullable Input<FleetVpcConfigArgs> vpcConfig;

    public Input<FleetVpcConfigArgs> getVpcConfig() {
        return this.vpcConfig == null ? Input.empty() : this.vpcConfig;
    }

    public FleetArgs(
        Input<FleetComputeCapacityArgs> computeCapacity,
        @Nullable Input<String> description,
        @Nullable Input<Integer> disconnectTimeoutInSeconds,
        @Nullable Input<String> displayName,
        @Nullable Input<FleetDomainJoinInfoArgs> domainJoinInfo,
        @Nullable Input<Boolean> enableDefaultInternetAccess,
        @Nullable Input<String> fleetType,
        @Nullable Input<String> iamRoleArn,
        @Nullable Input<Integer> idleDisconnectTimeoutInSeconds,
        @Nullable Input<String> imageArn,
        @Nullable Input<String> imageName,
        Input<String> instanceType,
        @Nullable Input<Integer> maxUserDurationInSeconds,
        @Nullable Input<String> name,
        @Nullable Input<String> streamView,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<FleetVpcConfigArgs> vpcConfig) {
        this.computeCapacity = Objects.requireNonNull(computeCapacity, "expected parameter 'computeCapacity' to be non-null");
        this.description = description;
        this.disconnectTimeoutInSeconds = disconnectTimeoutInSeconds;
        this.displayName = displayName;
        this.domainJoinInfo = domainJoinInfo;
        this.enableDefaultInternetAccess = enableDefaultInternetAccess;
        this.fleetType = fleetType;
        this.iamRoleArn = iamRoleArn;
        this.idleDisconnectTimeoutInSeconds = idleDisconnectTimeoutInSeconds;
        this.imageArn = imageArn;
        this.imageName = imageName;
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
        this.maxUserDurationInSeconds = maxUserDurationInSeconds;
        this.name = name;
        this.streamView = streamView;
        this.tags = tags;
        this.vpcConfig = vpcConfig;
    }

    private FleetArgs() {
        this.computeCapacity = Input.empty();
        this.description = Input.empty();
        this.disconnectTimeoutInSeconds = Input.empty();
        this.displayName = Input.empty();
        this.domainJoinInfo = Input.empty();
        this.enableDefaultInternetAccess = Input.empty();
        this.fleetType = Input.empty();
        this.iamRoleArn = Input.empty();
        this.idleDisconnectTimeoutInSeconds = Input.empty();
        this.imageArn = Input.empty();
        this.imageName = Input.empty();
        this.instanceType = Input.empty();
        this.maxUserDurationInSeconds = Input.empty();
        this.name = Input.empty();
        this.streamView = Input.empty();
        this.tags = Input.empty();
        this.vpcConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<FleetComputeCapacityArgs> computeCapacity;
        private @Nullable Input<String> description;
        private @Nullable Input<Integer> disconnectTimeoutInSeconds;
        private @Nullable Input<String> displayName;
        private @Nullable Input<FleetDomainJoinInfoArgs> domainJoinInfo;
        private @Nullable Input<Boolean> enableDefaultInternetAccess;
        private @Nullable Input<String> fleetType;
        private @Nullable Input<String> iamRoleArn;
        private @Nullable Input<Integer> idleDisconnectTimeoutInSeconds;
        private @Nullable Input<String> imageArn;
        private @Nullable Input<String> imageName;
        private Input<String> instanceType;
        private @Nullable Input<Integer> maxUserDurationInSeconds;
        private @Nullable Input<String> name;
        private @Nullable Input<String> streamView;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<FleetVpcConfigArgs> vpcConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeCapacity = defaults.computeCapacity;
    	      this.description = defaults.description;
    	      this.disconnectTimeoutInSeconds = defaults.disconnectTimeoutInSeconds;
    	      this.displayName = defaults.displayName;
    	      this.domainJoinInfo = defaults.domainJoinInfo;
    	      this.enableDefaultInternetAccess = defaults.enableDefaultInternetAccess;
    	      this.fleetType = defaults.fleetType;
    	      this.iamRoleArn = defaults.iamRoleArn;
    	      this.idleDisconnectTimeoutInSeconds = defaults.idleDisconnectTimeoutInSeconds;
    	      this.imageArn = defaults.imageArn;
    	      this.imageName = defaults.imageName;
    	      this.instanceType = defaults.instanceType;
    	      this.maxUserDurationInSeconds = defaults.maxUserDurationInSeconds;
    	      this.name = defaults.name;
    	      this.streamView = defaults.streamView;
    	      this.tags = defaults.tags;
    	      this.vpcConfig = defaults.vpcConfig;
        }

        public Builder setComputeCapacity(Input<FleetComputeCapacityArgs> computeCapacity) {
            this.computeCapacity = Objects.requireNonNull(computeCapacity);
            return this;
        }

        public Builder setComputeCapacity(FleetComputeCapacityArgs computeCapacity) {
            this.computeCapacity = Input.of(Objects.requireNonNull(computeCapacity));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisconnectTimeoutInSeconds(@Nullable Input<Integer> disconnectTimeoutInSeconds) {
            this.disconnectTimeoutInSeconds = disconnectTimeoutInSeconds;
            return this;
        }

        public Builder setDisconnectTimeoutInSeconds(@Nullable Integer disconnectTimeoutInSeconds) {
            this.disconnectTimeoutInSeconds = Input.ofNullable(disconnectTimeoutInSeconds);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setDomainJoinInfo(@Nullable Input<FleetDomainJoinInfoArgs> domainJoinInfo) {
            this.domainJoinInfo = domainJoinInfo;
            return this;
        }

        public Builder setDomainJoinInfo(@Nullable FleetDomainJoinInfoArgs domainJoinInfo) {
            this.domainJoinInfo = Input.ofNullable(domainJoinInfo);
            return this;
        }

        public Builder setEnableDefaultInternetAccess(@Nullable Input<Boolean> enableDefaultInternetAccess) {
            this.enableDefaultInternetAccess = enableDefaultInternetAccess;
            return this;
        }

        public Builder setEnableDefaultInternetAccess(@Nullable Boolean enableDefaultInternetAccess) {
            this.enableDefaultInternetAccess = Input.ofNullable(enableDefaultInternetAccess);
            return this;
        }

        public Builder setFleetType(@Nullable Input<String> fleetType) {
            this.fleetType = fleetType;
            return this;
        }

        public Builder setFleetType(@Nullable String fleetType) {
            this.fleetType = Input.ofNullable(fleetType);
            return this;
        }

        public Builder setIamRoleArn(@Nullable Input<String> iamRoleArn) {
            this.iamRoleArn = iamRoleArn;
            return this;
        }

        public Builder setIamRoleArn(@Nullable String iamRoleArn) {
            this.iamRoleArn = Input.ofNullable(iamRoleArn);
            return this;
        }

        public Builder setIdleDisconnectTimeoutInSeconds(@Nullable Input<Integer> idleDisconnectTimeoutInSeconds) {
            this.idleDisconnectTimeoutInSeconds = idleDisconnectTimeoutInSeconds;
            return this;
        }

        public Builder setIdleDisconnectTimeoutInSeconds(@Nullable Integer idleDisconnectTimeoutInSeconds) {
            this.idleDisconnectTimeoutInSeconds = Input.ofNullable(idleDisconnectTimeoutInSeconds);
            return this;
        }

        public Builder setImageArn(@Nullable Input<String> imageArn) {
            this.imageArn = imageArn;
            return this;
        }

        public Builder setImageArn(@Nullable String imageArn) {
            this.imageArn = Input.ofNullable(imageArn);
            return this;
        }

        public Builder setImageName(@Nullable Input<String> imageName) {
            this.imageName = imageName;
            return this;
        }

        public Builder setImageName(@Nullable String imageName) {
            this.imageName = Input.ofNullable(imageName);
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

        public Builder setMaxUserDurationInSeconds(@Nullable Input<Integer> maxUserDurationInSeconds) {
            this.maxUserDurationInSeconds = maxUserDurationInSeconds;
            return this;
        }

        public Builder setMaxUserDurationInSeconds(@Nullable Integer maxUserDurationInSeconds) {
            this.maxUserDurationInSeconds = Input.ofNullable(maxUserDurationInSeconds);
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

        public Builder setStreamView(@Nullable Input<String> streamView) {
            this.streamView = streamView;
            return this;
        }

        public Builder setStreamView(@Nullable String streamView) {
            this.streamView = Input.ofNullable(streamView);
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

        public Builder setVpcConfig(@Nullable Input<FleetVpcConfigArgs> vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }

        public Builder setVpcConfig(@Nullable FleetVpcConfigArgs vpcConfig) {
            this.vpcConfig = Input.ofNullable(vpcConfig);
            return this;
        }
        public FleetArgs build() {
            return new FleetArgs(computeCapacity, description, disconnectTimeoutInSeconds, displayName, domainJoinInfo, enableDefaultInternetAccess, fleetType, iamRoleArn, idleDisconnectTimeoutInSeconds, imageArn, imageName, instanceType, maxUserDurationInSeconds, name, streamView, tags, vpcConfig);
        }
    }
}
