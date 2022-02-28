// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.storagegateway;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.storagegateway.GatewayArgs;
import io.pulumi.aws.storagegateway.inputs.GatewayState;
import io.pulumi.aws.storagegateway.outputs.GatewayGatewayNetworkInterface;
import io.pulumi.aws.storagegateway.outputs.GatewaySmbActiveDirectorySettings;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages an AWS Storage Gateway file, tape, or volume gateway in the provider region.
 * 
 * > **NOTE:** The Storage Gateway API requires the gateway to be connected to properly return information after activation. If you are receiving `The specified gateway is not connected` errors during resource creation (gateway activation), ensure your gateway instance meets the [Storage Gateway requirements](https://docs.aws.amazon.com/storagegateway/latest/userguide/Requirements.html).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_storagegateway_gateway` can be imported by using the gateway Amazon Resource Name (ARN), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:storagegateway/gateway:Gateway example arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678
 * ```
 * 
 *  Certain resource arguments, like `gateway_ip_address` do not have a Storage Gateway API method for reading the information after creation, either omit the argument from the provider configuration or use `ignoreChanges` to hide the difference.
 * 
 */
@ResourceType(type="aws:storagegateway/gateway:Gateway")
public class Gateway extends io.pulumi.resources.CustomResource {
    /**
     * Gateway activation key during resource creation. Conflicts with `gateway_ip_address`. Additional information is available in the [Storage Gateway User Guide](https://docs.aws.amazon.com/storagegateway/latest/userguide/get-activation-key.html).
     * 
     */
    @OutputExport(name="activationKey", type=String.class, parameters={})
    private Output<String> activationKey;

    /**
     * @return Gateway activation key during resource creation. Conflicts with `gateway_ip_address`. Additional information is available in the [Storage Gateway User Guide](https://docs.aws.amazon.com/storagegateway/latest/userguide/get-activation-key.html).
     * 
     */
    public Output<String> getActivationKey() {
        return this.activationKey;
    }
    /**
     * Amazon Resource Name (ARN) of the gateway.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the gateway.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The average download bandwidth rate limit in bits per second. This is supported for the `CACHED`, `STORED`, and `VTL` gateway types.
     * 
     */
    @OutputExport(name="averageDownloadRateLimitInBitsPerSec", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> averageDownloadRateLimitInBitsPerSec;

    /**
     * @return The average download bandwidth rate limit in bits per second. This is supported for the `CACHED`, `STORED`, and `VTL` gateway types.
     * 
     */
    public Output</* @Nullable */ Integer> getAverageDownloadRateLimitInBitsPerSec() {
        return this.averageDownloadRateLimitInBitsPerSec;
    }
    /**
     * The average upload bandwidth rate limit in bits per second. This is supported for the `CACHED`, `STORED`, and `VTL` gateway types.
     * 
     */
    @OutputExport(name="averageUploadRateLimitInBitsPerSec", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> averageUploadRateLimitInBitsPerSec;

    /**
     * @return The average upload bandwidth rate limit in bits per second. This is supported for the `CACHED`, `STORED`, and `VTL` gateway types.
     * 
     */
    public Output</* @Nullable */ Integer> getAverageUploadRateLimitInBitsPerSec() {
        return this.averageUploadRateLimitInBitsPerSec;
    }
    /**
     * The Amazon Resource Name (ARN) of the Amazon CloudWatch log group to use to monitor and log events in the gateway.
     * 
     */
    @OutputExport(name="cloudwatchLogGroupArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> cloudwatchLogGroupArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Amazon CloudWatch log group to use to monitor and log events in the gateway.
     * 
     */
    public Output</* @Nullable */ String> getCloudwatchLogGroupArn() {
        return this.cloudwatchLogGroupArn;
    }
    /**
     * The ID of the Amazon EC2 instance that was used to launch the gateway.
     * 
     */
    @OutputExport(name="ec2InstanceId", type=String.class, parameters={})
    private Output<String> ec2InstanceId;

    /**
     * @return The ID of the Amazon EC2 instance that was used to launch the gateway.
     * 
     */
    public Output<String> getEc2InstanceId() {
        return this.ec2InstanceId;
    }
    /**
     * The type of endpoint for your gateway.
     * 
     */
    @OutputExport(name="endpointType", type=String.class, parameters={})
    private Output<String> endpointType;

    /**
     * @return The type of endpoint for your gateway.
     * 
     */
    public Output<String> getEndpointType() {
        return this.endpointType;
    }
    /**
     * Identifier of the gateway.
     * 
     */
    @OutputExport(name="gatewayId", type=String.class, parameters={})
    private Output<String> gatewayId;

    /**
     * @return Identifier of the gateway.
     * 
     */
    public Output<String> getGatewayId() {
        return this.gatewayId;
    }
    /**
     * Gateway IP address to retrieve activation key during resource creation. Conflicts with `activation_key`. Gateway must be accessible on port 80 from where this provider is running. Additional information is available in the [Storage Gateway User Guide](https://docs.aws.amazon.com/storagegateway/latest/userguide/get-activation-key.html).
     * 
     */
    @OutputExport(name="gatewayIpAddress", type=String.class, parameters={})
    private Output<String> gatewayIpAddress;

    /**
     * @return Gateway IP address to retrieve activation key during resource creation. Conflicts with `activation_key`. Gateway must be accessible on port 80 from where this provider is running. Additional information is available in the [Storage Gateway User Guide](https://docs.aws.amazon.com/storagegateway/latest/userguide/get-activation-key.html).
     * 
     */
    public Output<String> getGatewayIpAddress() {
        return this.gatewayIpAddress;
    }
    /**
     * Name of the gateway.
     * 
     */
    @OutputExport(name="gatewayName", type=String.class, parameters={})
    private Output<String> gatewayName;

    /**
     * @return Name of the gateway.
     * 
     */
    public Output<String> getGatewayName() {
        return this.gatewayName;
    }
    /**
     * An array that contains descriptions of the gateway network interfaces. See Gateway Network Interface.
     * 
     */
    @OutputExport(name="gatewayNetworkInterfaces", type=List.class, parameters={GatewayGatewayNetworkInterface.class})
    private Output<List<GatewayGatewayNetworkInterface>> gatewayNetworkInterfaces;

    /**
     * @return An array that contains descriptions of the gateway network interfaces. See Gateway Network Interface.
     * 
     */
    public Output<List<GatewayGatewayNetworkInterface>> getGatewayNetworkInterfaces() {
        return this.gatewayNetworkInterfaces;
    }
    /**
     * Time zone for the gateway. The time zone is of the format "GMT", "GMT-hr:mm", or "GMT+hr:mm". For example, `GMT-4:00` indicates the time is 4 hours behind GMT. The time zone is used, for example, for scheduling snapshots and your gateway's maintenance schedule.
     * 
     */
    @OutputExport(name="gatewayTimezone", type=String.class, parameters={})
    private Output<String> gatewayTimezone;

    /**
     * @return Time zone for the gateway. The time zone is of the format "GMT", "GMT-hr:mm", or "GMT+hr:mm". For example, `GMT-4:00` indicates the time is 4 hours behind GMT. The time zone is used, for example, for scheduling snapshots and your gateway's maintenance schedule.
     * 
     */
    public Output<String> getGatewayTimezone() {
        return this.gatewayTimezone;
    }
    /**
     * Type of the gateway. The default value is `STORED`. Valid values: `CACHED`, `FILE_FSX_SMB`, `FILE_S3`, `STORED`, `VTL`.
     * 
     */
    @OutputExport(name="gatewayType", type=String.class, parameters={})
    private Output</* @Nullable */ String> gatewayType;

    /**
     * @return Type of the gateway. The default value is `STORED`. Valid values: `CACHED`, `FILE_FSX_SMB`, `FILE_S3`, `STORED`, `VTL`.
     * 
     */
    public Output</* @Nullable */ String> getGatewayType() {
        return this.gatewayType;
    }
    /**
     * VPC endpoint address to be used when activating your gateway. This should be used when your instance is in a private subnet. Requires HTTP access from client computer running this provider. More info on what ports are required by your VPC Endpoint Security group in [Activating a Gateway in a Virtual Private Cloud](https://docs.aws.amazon.com/storagegateway/latest/userguide/gateway-private-link.html).
     * 
     */
    @OutputExport(name="gatewayVpcEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> gatewayVpcEndpoint;

    /**
     * @return VPC endpoint address to be used when activating your gateway. This should be used when your instance is in a private subnet. Requires HTTP access from client computer running this provider. More info on what ports are required by your VPC Endpoint Security group in [Activating a Gateway in a Virtual Private Cloud](https://docs.aws.amazon.com/storagegateway/latest/userguide/gateway-private-link.html).
     * 
     */
    public Output</* @Nullable */ String> getGatewayVpcEndpoint() {
        return this.gatewayVpcEndpoint;
    }
    /**
     * The type of hypervisor environment used by the host.
     * 
     */
    @OutputExport(name="hostEnvironment", type=String.class, parameters={})
    private Output<String> hostEnvironment;

    /**
     * @return The type of hypervisor environment used by the host.
     * 
     */
    public Output<String> getHostEnvironment() {
        return this.hostEnvironment;
    }
    /**
     * Type of medium changer to use for tape gateway. This provider cannot detect drift of this argument. Valid values: `STK-L700`, `AWS-Gateway-VTL`, `IBM-03584L32-0402`.
     * 
     */
    @OutputExport(name="mediumChangerType", type=String.class, parameters={})
    private Output</* @Nullable */ String> mediumChangerType;

    /**
     * @return Type of medium changer to use for tape gateway. This provider cannot detect drift of this argument. Valid values: `STK-L700`, `AWS-Gateway-VTL`, `IBM-03584L32-0402`.
     * 
     */
    public Output</* @Nullable */ String> getMediumChangerType() {
        return this.mediumChangerType;
    }
    /**
     * Nested argument with Active Directory domain join information for Server Message Block (SMB) file shares. Only valid for `FILE_S3` and `FILE_FSX_SMB` gateway types. Must be set before creating `ActiveDirectory` authentication SMB file shares. More details below.
     * 
     */
    @OutputExport(name="smbActiveDirectorySettings", type=GatewaySmbActiveDirectorySettings.class, parameters={})
    private Output</* @Nullable */ GatewaySmbActiveDirectorySettings> smbActiveDirectorySettings;

    /**
     * @return Nested argument with Active Directory domain join information for Server Message Block (SMB) file shares. Only valid for `FILE_S3` and `FILE_FSX_SMB` gateway types. Must be set before creating `ActiveDirectory` authentication SMB file shares. More details below.
     * 
     */
    public Output</* @Nullable */ GatewaySmbActiveDirectorySettings> getSmbActiveDirectorySettings() {
        return this.smbActiveDirectorySettings;
    }
    /**
     * Specifies whether the shares on this gateway appear when listing shares.
     * 
     */
    @OutputExport(name="smbFileShareVisibility", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> smbFileShareVisibility;

    /**
     * @return Specifies whether the shares on this gateway appear when listing shares.
     * 
     */
    public Output</* @Nullable */ Boolean> getSmbFileShareVisibility() {
        return this.smbFileShareVisibility;
    }
    /**
     * Guest password for Server Message Block (SMB) file shares. Only valid for `FILE_S3` and `FILE_FSX_SMB` gateway types. Must be set before creating `GuestAccess` authentication SMB file shares. This provider can only detect drift of the existence of a guest password, not its actual value from the gateway. This provider can however update the password with changing the argument.
     * 
     */
    @OutputExport(name="smbGuestPassword", type=String.class, parameters={})
    private Output</* @Nullable */ String> smbGuestPassword;

    /**
     * @return Guest password for Server Message Block (SMB) file shares. Only valid for `FILE_S3` and `FILE_FSX_SMB` gateway types. Must be set before creating `GuestAccess` authentication SMB file shares. This provider can only detect drift of the existence of a guest password, not its actual value from the gateway. This provider can however update the password with changing the argument.
     * 
     */
    public Output</* @Nullable */ String> getSmbGuestPassword() {
        return this.smbGuestPassword;
    }
    /**
     * Specifies the type of security strategy. Valid values are: `ClientSpecified`, `MandatorySigning`, and `MandatoryEncryption`. See [Setting a Security Level for Your Gateway](https://docs.aws.amazon.com/storagegateway/latest/userguide/managing-gateway-file.html#security-strategy) for more information.
     * 
     */
    @OutputExport(name="smbSecurityStrategy", type=String.class, parameters={})
    private Output<String> smbSecurityStrategy;

    /**
     * @return Specifies the type of security strategy. Valid values are: `ClientSpecified`, `MandatorySigning`, and `MandatoryEncryption`. See [Setting a Security Level for Your Gateway](https://docs.aws.amazon.com/storagegateway/latest/userguide/managing-gateway-file.html#security-strategy) for more information.
     * 
     */
    public Output<String> getSmbSecurityStrategy() {
        return this.smbSecurityStrategy;
    }
    /**
     * Key-value map of resource tags
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * Type of tape drive to use for tape gateway. This provider cannot detect drift of this argument. Valid values: `IBM-ULT3580-TD5`.
     * 
     */
    @OutputExport(name="tapeDriveType", type=String.class, parameters={})
    private Output</* @Nullable */ String> tapeDriveType;

    /**
     * @return Type of tape drive to use for tape gateway. This provider cannot detect drift of this argument. Valid values: `IBM-ULT3580-TD5`.
     * 
     */
    public Output</* @Nullable */ String> getTapeDriveType() {
        return this.tapeDriveType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Gateway(String name) {
        this(name, GatewayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Gateway(String name, GatewayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Gateway(String name, GatewayArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:storagegateway/gateway:Gateway", name, args == null ? GatewayArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Gateway(String name, Input<String> id, @Nullable GatewayState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:storagegateway/gateway:Gateway", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Gateway get(String name, Input<String> id, @Nullable GatewayState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Gateway(name, id, state, options);
    }
}
