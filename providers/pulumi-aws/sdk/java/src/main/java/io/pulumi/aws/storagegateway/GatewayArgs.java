// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.storagegateway;

import io.pulumi.aws.storagegateway.inputs.GatewaySmbActiveDirectorySettingsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayArgs Empty = new GatewayArgs();

    /**
     * Gateway activation key during resource creation. Conflicts with `gateway_ip_address`. Additional information is available in the [Storage Gateway User Guide](https://docs.aws.amazon.com/storagegateway/latest/userguide/get-activation-key.html).
     * 
     */
    @InputImport(name="activationKey")
      private final @Nullable Input<String> activationKey;

    public Input<String> getActivationKey() {
        return this.activationKey == null ? Input.empty() : this.activationKey;
    }

    /**
     * The average download bandwidth rate limit in bits per second. This is supported for the `CACHED`, `STORED`, and `VTL` gateway types.
     * 
     */
    @InputImport(name="averageDownloadRateLimitInBitsPerSec")
      private final @Nullable Input<Integer> averageDownloadRateLimitInBitsPerSec;

    public Input<Integer> getAverageDownloadRateLimitInBitsPerSec() {
        return this.averageDownloadRateLimitInBitsPerSec == null ? Input.empty() : this.averageDownloadRateLimitInBitsPerSec;
    }

    /**
     * The average upload bandwidth rate limit in bits per second. This is supported for the `CACHED`, `STORED`, and `VTL` gateway types.
     * 
     */
    @InputImport(name="averageUploadRateLimitInBitsPerSec")
      private final @Nullable Input<Integer> averageUploadRateLimitInBitsPerSec;

    public Input<Integer> getAverageUploadRateLimitInBitsPerSec() {
        return this.averageUploadRateLimitInBitsPerSec == null ? Input.empty() : this.averageUploadRateLimitInBitsPerSec;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon CloudWatch log group to use to monitor and log events in the gateway.
     * 
     */
    @InputImport(name="cloudwatchLogGroupArn")
      private final @Nullable Input<String> cloudwatchLogGroupArn;

    public Input<String> getCloudwatchLogGroupArn() {
        return this.cloudwatchLogGroupArn == null ? Input.empty() : this.cloudwatchLogGroupArn;
    }

    /**
     * Gateway IP address to retrieve activation key during resource creation. Conflicts with `activation_key`. Gateway must be accessible on port 80 from where this provider is running. Additional information is available in the [Storage Gateway User Guide](https://docs.aws.amazon.com/storagegateway/latest/userguide/get-activation-key.html).
     * 
     */
    @InputImport(name="gatewayIpAddress")
      private final @Nullable Input<String> gatewayIpAddress;

    public Input<String> getGatewayIpAddress() {
        return this.gatewayIpAddress == null ? Input.empty() : this.gatewayIpAddress;
    }

    /**
     * Name of the gateway.
     * 
     */
    @InputImport(name="gatewayName", required=true)
      private final Input<String> gatewayName;

    public Input<String> getGatewayName() {
        return this.gatewayName;
    }

    /**
     * Time zone for the gateway. The time zone is of the format "GMT", "GMT-hr:mm", or "GMT+hr:mm". For example, `GMT-4:00` indicates the time is 4 hours behind GMT. The time zone is used, for example, for scheduling snapshots and your gateway's maintenance schedule.
     * 
     */
    @InputImport(name="gatewayTimezone", required=true)
      private final Input<String> gatewayTimezone;

    public Input<String> getGatewayTimezone() {
        return this.gatewayTimezone;
    }

    /**
     * Type of the gateway. The default value is `STORED`. Valid values: `CACHED`, `FILE_FSX_SMB`, `FILE_S3`, `STORED`, `VTL`.
     * 
     */
    @InputImport(name="gatewayType")
      private final @Nullable Input<String> gatewayType;

    public Input<String> getGatewayType() {
        return this.gatewayType == null ? Input.empty() : this.gatewayType;
    }

    /**
     * VPC endpoint address to be used when activating your gateway. This should be used when your instance is in a private subnet. Requires HTTP access from client computer running this provider. More info on what ports are required by your VPC Endpoint Security group in [Activating a Gateway in a Virtual Private Cloud](https://docs.aws.amazon.com/storagegateway/latest/userguide/gateway-private-link.html).
     * 
     */
    @InputImport(name="gatewayVpcEndpoint")
      private final @Nullable Input<String> gatewayVpcEndpoint;

    public Input<String> getGatewayVpcEndpoint() {
        return this.gatewayVpcEndpoint == null ? Input.empty() : this.gatewayVpcEndpoint;
    }

    /**
     * Type of medium changer to use for tape gateway. This provider cannot detect drift of this argument. Valid values: `STK-L700`, `AWS-Gateway-VTL`, `IBM-03584L32-0402`.
     * 
     */
    @InputImport(name="mediumChangerType")
      private final @Nullable Input<String> mediumChangerType;

    public Input<String> getMediumChangerType() {
        return this.mediumChangerType == null ? Input.empty() : this.mediumChangerType;
    }

    /**
     * Nested argument with Active Directory domain join information for Server Message Block (SMB) file shares. Only valid for `FILE_S3` and `FILE_FSX_SMB` gateway types. Must be set before creating `ActiveDirectory` authentication SMB file shares. More details below.
     * 
     */
    @InputImport(name="smbActiveDirectorySettings")
      private final @Nullable Input<GatewaySmbActiveDirectorySettingsArgs> smbActiveDirectorySettings;

    public Input<GatewaySmbActiveDirectorySettingsArgs> getSmbActiveDirectorySettings() {
        return this.smbActiveDirectorySettings == null ? Input.empty() : this.smbActiveDirectorySettings;
    }

    /**
     * Specifies whether the shares on this gateway appear when listing shares.
     * 
     */
    @InputImport(name="smbFileShareVisibility")
      private final @Nullable Input<Boolean> smbFileShareVisibility;

    public Input<Boolean> getSmbFileShareVisibility() {
        return this.smbFileShareVisibility == null ? Input.empty() : this.smbFileShareVisibility;
    }

    /**
     * Guest password for Server Message Block (SMB) file shares. Only valid for `FILE_S3` and `FILE_FSX_SMB` gateway types. Must be set before creating `GuestAccess` authentication SMB file shares. This provider can only detect drift of the existence of a guest password, not its actual value from the gateway. This provider can however update the password with changing the argument.
     * 
     */
    @InputImport(name="smbGuestPassword")
      private final @Nullable Input<String> smbGuestPassword;

    public Input<String> getSmbGuestPassword() {
        return this.smbGuestPassword == null ? Input.empty() : this.smbGuestPassword;
    }

    /**
     * Specifies the type of security strategy. Valid values are: `ClientSpecified`, `MandatorySigning`, and `MandatoryEncryption`. See [Setting a Security Level for Your Gateway](https://docs.aws.amazon.com/storagegateway/latest/userguide/managing-gateway-file.html#security-strategy) for more information.
     * 
     */
    @InputImport(name="smbSecurityStrategy")
      private final @Nullable Input<String> smbSecurityStrategy;

    public Input<String> getSmbSecurityStrategy() {
        return this.smbSecurityStrategy == null ? Input.empty() : this.smbSecurityStrategy;
    }

    /**
     * Key-value map of resource tags
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Type of tape drive to use for tape gateway. This provider cannot detect drift of this argument. Valid values: `IBM-ULT3580-TD5`.
     * 
     */
    @InputImport(name="tapeDriveType")
      private final @Nullable Input<String> tapeDriveType;

    public Input<String> getTapeDriveType() {
        return this.tapeDriveType == null ? Input.empty() : this.tapeDriveType;
    }

    public GatewayArgs(
        @Nullable Input<String> activationKey,
        @Nullable Input<Integer> averageDownloadRateLimitInBitsPerSec,
        @Nullable Input<Integer> averageUploadRateLimitInBitsPerSec,
        @Nullable Input<String> cloudwatchLogGroupArn,
        @Nullable Input<String> gatewayIpAddress,
        Input<String> gatewayName,
        Input<String> gatewayTimezone,
        @Nullable Input<String> gatewayType,
        @Nullable Input<String> gatewayVpcEndpoint,
        @Nullable Input<String> mediumChangerType,
        @Nullable Input<GatewaySmbActiveDirectorySettingsArgs> smbActiveDirectorySettings,
        @Nullable Input<Boolean> smbFileShareVisibility,
        @Nullable Input<String> smbGuestPassword,
        @Nullable Input<String> smbSecurityStrategy,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> tapeDriveType) {
        this.activationKey = activationKey;
        this.averageDownloadRateLimitInBitsPerSec = averageDownloadRateLimitInBitsPerSec;
        this.averageUploadRateLimitInBitsPerSec = averageUploadRateLimitInBitsPerSec;
        this.cloudwatchLogGroupArn = cloudwatchLogGroupArn;
        this.gatewayIpAddress = gatewayIpAddress;
        this.gatewayName = Objects.requireNonNull(gatewayName, "expected parameter 'gatewayName' to be non-null");
        this.gatewayTimezone = Objects.requireNonNull(gatewayTimezone, "expected parameter 'gatewayTimezone' to be non-null");
        this.gatewayType = gatewayType;
        this.gatewayVpcEndpoint = gatewayVpcEndpoint;
        this.mediumChangerType = mediumChangerType;
        this.smbActiveDirectorySettings = smbActiveDirectorySettings;
        this.smbFileShareVisibility = smbFileShareVisibility;
        this.smbGuestPassword = smbGuestPassword;
        this.smbSecurityStrategy = smbSecurityStrategy;
        this.tags = tags;
        this.tapeDriveType = tapeDriveType;
    }

    private GatewayArgs() {
        this.activationKey = Input.empty();
        this.averageDownloadRateLimitInBitsPerSec = Input.empty();
        this.averageUploadRateLimitInBitsPerSec = Input.empty();
        this.cloudwatchLogGroupArn = Input.empty();
        this.gatewayIpAddress = Input.empty();
        this.gatewayName = Input.empty();
        this.gatewayTimezone = Input.empty();
        this.gatewayType = Input.empty();
        this.gatewayVpcEndpoint = Input.empty();
        this.mediumChangerType = Input.empty();
        this.smbActiveDirectorySettings = Input.empty();
        this.smbFileShareVisibility = Input.empty();
        this.smbGuestPassword = Input.empty();
        this.smbSecurityStrategy = Input.empty();
        this.tags = Input.empty();
        this.tapeDriveType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> activationKey;
        private @Nullable Input<Integer> averageDownloadRateLimitInBitsPerSec;
        private @Nullable Input<Integer> averageUploadRateLimitInBitsPerSec;
        private @Nullable Input<String> cloudwatchLogGroupArn;
        private @Nullable Input<String> gatewayIpAddress;
        private Input<String> gatewayName;
        private Input<String> gatewayTimezone;
        private @Nullable Input<String> gatewayType;
        private @Nullable Input<String> gatewayVpcEndpoint;
        private @Nullable Input<String> mediumChangerType;
        private @Nullable Input<GatewaySmbActiveDirectorySettingsArgs> smbActiveDirectorySettings;
        private @Nullable Input<Boolean> smbFileShareVisibility;
        private @Nullable Input<String> smbGuestPassword;
        private @Nullable Input<String> smbSecurityStrategy;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> tapeDriveType;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activationKey = defaults.activationKey;
    	      this.averageDownloadRateLimitInBitsPerSec = defaults.averageDownloadRateLimitInBitsPerSec;
    	      this.averageUploadRateLimitInBitsPerSec = defaults.averageUploadRateLimitInBitsPerSec;
    	      this.cloudwatchLogGroupArn = defaults.cloudwatchLogGroupArn;
    	      this.gatewayIpAddress = defaults.gatewayIpAddress;
    	      this.gatewayName = defaults.gatewayName;
    	      this.gatewayTimezone = defaults.gatewayTimezone;
    	      this.gatewayType = defaults.gatewayType;
    	      this.gatewayVpcEndpoint = defaults.gatewayVpcEndpoint;
    	      this.mediumChangerType = defaults.mediumChangerType;
    	      this.smbActiveDirectorySettings = defaults.smbActiveDirectorySettings;
    	      this.smbFileShareVisibility = defaults.smbFileShareVisibility;
    	      this.smbGuestPassword = defaults.smbGuestPassword;
    	      this.smbSecurityStrategy = defaults.smbSecurityStrategy;
    	      this.tags = defaults.tags;
    	      this.tapeDriveType = defaults.tapeDriveType;
        }

        public Builder setActivationKey(@Nullable Input<String> activationKey) {
            this.activationKey = activationKey;
            return this;
        }

        public Builder setActivationKey(@Nullable String activationKey) {
            this.activationKey = Input.ofNullable(activationKey);
            return this;
        }

        public Builder setAverageDownloadRateLimitInBitsPerSec(@Nullable Input<Integer> averageDownloadRateLimitInBitsPerSec) {
            this.averageDownloadRateLimitInBitsPerSec = averageDownloadRateLimitInBitsPerSec;
            return this;
        }

        public Builder setAverageDownloadRateLimitInBitsPerSec(@Nullable Integer averageDownloadRateLimitInBitsPerSec) {
            this.averageDownloadRateLimitInBitsPerSec = Input.ofNullable(averageDownloadRateLimitInBitsPerSec);
            return this;
        }

        public Builder setAverageUploadRateLimitInBitsPerSec(@Nullable Input<Integer> averageUploadRateLimitInBitsPerSec) {
            this.averageUploadRateLimitInBitsPerSec = averageUploadRateLimitInBitsPerSec;
            return this;
        }

        public Builder setAverageUploadRateLimitInBitsPerSec(@Nullable Integer averageUploadRateLimitInBitsPerSec) {
            this.averageUploadRateLimitInBitsPerSec = Input.ofNullable(averageUploadRateLimitInBitsPerSec);
            return this;
        }

        public Builder setCloudwatchLogGroupArn(@Nullable Input<String> cloudwatchLogGroupArn) {
            this.cloudwatchLogGroupArn = cloudwatchLogGroupArn;
            return this;
        }

        public Builder setCloudwatchLogGroupArn(@Nullable String cloudwatchLogGroupArn) {
            this.cloudwatchLogGroupArn = Input.ofNullable(cloudwatchLogGroupArn);
            return this;
        }

        public Builder setGatewayIpAddress(@Nullable Input<String> gatewayIpAddress) {
            this.gatewayIpAddress = gatewayIpAddress;
            return this;
        }

        public Builder setGatewayIpAddress(@Nullable String gatewayIpAddress) {
            this.gatewayIpAddress = Input.ofNullable(gatewayIpAddress);
            return this;
        }

        public Builder setGatewayName(Input<String> gatewayName) {
            this.gatewayName = Objects.requireNonNull(gatewayName);
            return this;
        }

        public Builder setGatewayName(String gatewayName) {
            this.gatewayName = Input.of(Objects.requireNonNull(gatewayName));
            return this;
        }

        public Builder setGatewayTimezone(Input<String> gatewayTimezone) {
            this.gatewayTimezone = Objects.requireNonNull(gatewayTimezone);
            return this;
        }

        public Builder setGatewayTimezone(String gatewayTimezone) {
            this.gatewayTimezone = Input.of(Objects.requireNonNull(gatewayTimezone));
            return this;
        }

        public Builder setGatewayType(@Nullable Input<String> gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }

        public Builder setGatewayType(@Nullable String gatewayType) {
            this.gatewayType = Input.ofNullable(gatewayType);
            return this;
        }

        public Builder setGatewayVpcEndpoint(@Nullable Input<String> gatewayVpcEndpoint) {
            this.gatewayVpcEndpoint = gatewayVpcEndpoint;
            return this;
        }

        public Builder setGatewayVpcEndpoint(@Nullable String gatewayVpcEndpoint) {
            this.gatewayVpcEndpoint = Input.ofNullable(gatewayVpcEndpoint);
            return this;
        }

        public Builder setMediumChangerType(@Nullable Input<String> mediumChangerType) {
            this.mediumChangerType = mediumChangerType;
            return this;
        }

        public Builder setMediumChangerType(@Nullable String mediumChangerType) {
            this.mediumChangerType = Input.ofNullable(mediumChangerType);
            return this;
        }

        public Builder setSmbActiveDirectorySettings(@Nullable Input<GatewaySmbActiveDirectorySettingsArgs> smbActiveDirectorySettings) {
            this.smbActiveDirectorySettings = smbActiveDirectorySettings;
            return this;
        }

        public Builder setSmbActiveDirectorySettings(@Nullable GatewaySmbActiveDirectorySettingsArgs smbActiveDirectorySettings) {
            this.smbActiveDirectorySettings = Input.ofNullable(smbActiveDirectorySettings);
            return this;
        }

        public Builder setSmbFileShareVisibility(@Nullable Input<Boolean> smbFileShareVisibility) {
            this.smbFileShareVisibility = smbFileShareVisibility;
            return this;
        }

        public Builder setSmbFileShareVisibility(@Nullable Boolean smbFileShareVisibility) {
            this.smbFileShareVisibility = Input.ofNullable(smbFileShareVisibility);
            return this;
        }

        public Builder setSmbGuestPassword(@Nullable Input<String> smbGuestPassword) {
            this.smbGuestPassword = smbGuestPassword;
            return this;
        }

        public Builder setSmbGuestPassword(@Nullable String smbGuestPassword) {
            this.smbGuestPassword = Input.ofNullable(smbGuestPassword);
            return this;
        }

        public Builder setSmbSecurityStrategy(@Nullable Input<String> smbSecurityStrategy) {
            this.smbSecurityStrategy = smbSecurityStrategy;
            return this;
        }

        public Builder setSmbSecurityStrategy(@Nullable String smbSecurityStrategy) {
            this.smbSecurityStrategy = Input.ofNullable(smbSecurityStrategy);
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

        public Builder setTapeDriveType(@Nullable Input<String> tapeDriveType) {
            this.tapeDriveType = tapeDriveType;
            return this;
        }

        public Builder setTapeDriveType(@Nullable String tapeDriveType) {
            this.tapeDriveType = Input.ofNullable(tapeDriveType);
            return this;
        }
        public GatewayArgs build() {
            return new GatewayArgs(activationKey, averageDownloadRateLimitInBitsPerSec, averageUploadRateLimitInBitsPerSec, cloudwatchLogGroupArn, gatewayIpAddress, gatewayName, gatewayTimezone, gatewayType, gatewayVpcEndpoint, mediumChangerType, smbActiveDirectorySettings, smbFileShareVisibility, smbGuestPassword, smbSecurityStrategy, tags, tapeDriveType);
        }
    }
}