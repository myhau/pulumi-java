// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.pinpoint;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.pinpoint.ApnsVoipSandboxChannelArgs;
import io.pulumi.aws.pinpoint.inputs.ApnsVoipSandboxChannelState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Pinpoint APNs VoIP Sandbox Channel resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Pinpoint APNs VoIP Sandbox Channel can be imported using the `application-id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:pinpoint/apnsVoipSandboxChannel:ApnsVoipSandboxChannel apns_voip_sandbox application-id
 * ```
 * 
 */
@ResourceType(type="aws:pinpoint/apnsVoipSandboxChannel:ApnsVoipSandboxChannel")
public class ApnsVoipSandboxChannel extends io.pulumi.resources.CustomResource {
    /**
     * The application ID.
     * 
     */
    @OutputExport(name="applicationId", type=String.class, parameters={})
    private Output<String> applicationId;

    /**
     * @return The application ID.
     * 
     */
    public Output<String> getApplicationId() {
        return this.applicationId;
    }
    /**
     * The ID assigned to your iOS app. To find this value, choose Certificates, IDs & Profiles, choose App IDs in the Identifiers section, and choose your app.
     * 
     */
    @OutputExport(name="bundleId", type=String.class, parameters={})
    private Output</* @Nullable */ String> bundleId;

    /**
     * @return The ID assigned to your iOS app. To find this value, choose Certificates, IDs & Profiles, choose App IDs in the Identifiers section, and choose your app.
     * 
     */
    public Output</* @Nullable */ String> getBundleId() {
        return this.bundleId;
    }
    /**
     * The pem encoded TLS Certificate from Apple.
     * 
     */
    @OutputExport(name="certificate", type=String.class, parameters={})
    private Output</* @Nullable */ String> certificate;

    /**
     * @return The pem encoded TLS Certificate from Apple.
     * 
     */
    public Output</* @Nullable */ String> getCertificate() {
        return this.certificate;
    }
    /**
     * The default authentication method used for APNs.
     * __NOTE__: Amazon Pinpoint uses this default for every APNs push notification that you send using the console.
     * You can override the default when you send a message programmatically using the Amazon Pinpoint API, the AWS CLI, or an AWS SDK.
     * If your default authentication type fails, Amazon Pinpoint doesn't attempt to use the other authentication type.
     * 
     */
    @OutputExport(name="defaultAuthenticationMethod", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultAuthenticationMethod;

    /**
     * @return The default authentication method used for APNs.
     * __NOTE__: Amazon Pinpoint uses this default for every APNs push notification that you send using the console.
     * You can override the default when you send a message programmatically using the Amazon Pinpoint API, the AWS CLI, or an AWS SDK.
     * If your default authentication type fails, Amazon Pinpoint doesn't attempt to use the other authentication type.
     * 
     */
    public Output</* @Nullable */ String> getDefaultAuthenticationMethod() {
        return this.defaultAuthenticationMethod;
    }
    /**
     * Whether the channel is enabled or disabled. Defaults to `true`.
     * 
     */
    @OutputExport(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Whether the channel is enabled or disabled. Defaults to `true`.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnabled() {
        return this.enabled;
    }
    /**
     * The Certificate Private Key file (ie. `.key` file).
     * 
     */
    @OutputExport(name="privateKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> privateKey;

    /**
     * @return The Certificate Private Key file (ie. `.key` file).
     * 
     */
    public Output</* @Nullable */ String> getPrivateKey() {
        return this.privateKey;
    }
    /**
     * The ID assigned to your Apple developer account team. This value is provided on the Membership page.
     * 
     */
    @OutputExport(name="teamId", type=String.class, parameters={})
    private Output</* @Nullable */ String> teamId;

    /**
     * @return The ID assigned to your Apple developer account team. This value is provided on the Membership page.
     * 
     */
    public Output</* @Nullable */ String> getTeamId() {
        return this.teamId;
    }
    /**
     * The `.p8` file that you download from your Apple developer account when you create an authentication key.
     * 
     */
    @OutputExport(name="tokenKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> tokenKey;

    /**
     * @return The `.p8` file that you download from your Apple developer account when you create an authentication key.
     * 
     */
    public Output</* @Nullable */ String> getTokenKey() {
        return this.tokenKey;
    }
    /**
     * The ID assigned to your signing key. To find this value, choose Certificates, IDs & Profiles, and choose your key in the Keys section.
     * 
     */
    @OutputExport(name="tokenKeyId", type=String.class, parameters={})
    private Output</* @Nullable */ String> tokenKeyId;

    /**
     * @return The ID assigned to your signing key. To find this value, choose Certificates, IDs & Profiles, and choose your key in the Keys section.
     * 
     */
    public Output</* @Nullable */ String> getTokenKeyId() {
        return this.tokenKeyId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApnsVoipSandboxChannel(String name) {
        this(name, ApnsVoipSandboxChannelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApnsVoipSandboxChannel(String name, ApnsVoipSandboxChannelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApnsVoipSandboxChannel(String name, ApnsVoipSandboxChannelArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:pinpoint/apnsVoipSandboxChannel:ApnsVoipSandboxChannel", name, args == null ? ApnsVoipSandboxChannelArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ApnsVoipSandboxChannel(String name, Input<String> id, @Nullable ApnsVoipSandboxChannelState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:pinpoint/apnsVoipSandboxChannel:ApnsVoipSandboxChannel", name, state, makeResourceOptions(options, id));
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
    public static ApnsVoipSandboxChannel get(String name, Input<String> id, @Nullable ApnsVoipSandboxChannelState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ApnsVoipSandboxChannel(name, id, state, options);
    }
}
