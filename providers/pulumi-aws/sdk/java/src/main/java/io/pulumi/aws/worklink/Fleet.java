// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.worklink;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.worklink.FleetArgs;
import io.pulumi.aws.worklink.inputs.FleetState;
import io.pulumi.aws.worklink.outputs.FleetIdentityProvider;
import io.pulumi.aws.worklink.outputs.FleetNetwork;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ## Import
 * 
 * WorkLink can be imported using the ARN, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:worklink/fleet:Fleet test arn:aws:worklink::123456789012:fleet/example
 * ```
 * 
 */
@ResourceType(type="aws:worklink/fleet:Fleet")
public class Fleet extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the created WorkLink Fleet.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the created WorkLink Fleet.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The ARN of the Amazon Kinesis data stream that receives the audit events. Kinesis data stream name must begin with `"AmazonWorkLink-"`.
     * 
     */
    @OutputExport(name="auditStreamArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> auditStreamArn;

    /**
     * @return The ARN of the Amazon Kinesis data stream that receives the audit events. Kinesis data stream name must begin with `"AmazonWorkLink-"`.
     * 
     */
    public Output</* @Nullable */ String> getAuditStreamArn() {
        return this.auditStreamArn;
    }
    /**
     * The identifier used by users to sign in to the Amazon WorkLink app.
     * 
     */
    @OutputExport(name="companyCode", type=String.class, parameters={})
    private Output<String> companyCode;

    /**
     * @return The identifier used by users to sign in to the Amazon WorkLink app.
     * 
     */
    public Output<String> getCompanyCode() {
        return this.companyCode;
    }
    /**
     * The time that the fleet was created.
     * 
     */
    @OutputExport(name="createdTime", type=String.class, parameters={})
    private Output<String> createdTime;

    /**
     * @return The time that the fleet was created.
     * 
     */
    public Output<String> getCreatedTime() {
        return this.createdTime;
    }
    /**
     * The certificate chain, including intermediate certificates and the root certificate authority certificate used to issue device certificates.
     * 
     */
    @OutputExport(name="deviceCaCertificate", type=String.class, parameters={})
    private Output</* @Nullable */ String> deviceCaCertificate;

    /**
     * @return The certificate chain, including intermediate certificates and the root certificate authority certificate used to issue device certificates.
     * 
     */
    public Output</* @Nullable */ String> getDeviceCaCertificate() {
        return this.deviceCaCertificate;
    }
    /**
     * The name of the fleet.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return The name of the fleet.
     * 
     */
    public Output</* @Nullable */ String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Provide this to allow manage the identity provider configuration for the fleet. Fields documented below.
     * 
     */
    @OutputExport(name="identityProvider", type=FleetIdentityProvider.class, parameters={})
    private Output</* @Nullable */ FleetIdentityProvider> identityProvider;

    /**
     * @return Provide this to allow manage the identity provider configuration for the fleet. Fields documented below.
     * 
     */
    public Output</* @Nullable */ FleetIdentityProvider> getIdentityProvider() {
        return this.identityProvider;
    }
    /**
     * The time that the fleet was last updated.
     * 
     */
    @OutputExport(name="lastUpdatedTime", type=String.class, parameters={})
    private Output<String> lastUpdatedTime;

    /**
     * @return The time that the fleet was last updated.
     * 
     */
    public Output<String> getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }
    /**
     * A region-unique name for the AMI.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A region-unique name for the AMI.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Provide this to allow manage the company network configuration for the fleet. Fields documented below.
     * 
     */
    @OutputExport(name="network", type=FleetNetwork.class, parameters={})
    private Output</* @Nullable */ FleetNetwork> network;

    /**
     * @return Provide this to allow manage the company network configuration for the fleet. Fields documented below.
     * 
     */
    public Output</* @Nullable */ FleetNetwork> getNetwork() {
        return this.network;
    }
    /**
     * The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region. Defaults to `true`.
     * 
     */
    @OutputExport(name="optimizeForEndUserLocation", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> optimizeForEndUserLocation;

    /**
     * @return The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region. Defaults to `true`.
     * 
     */
    public Output</* @Nullable */ Boolean> getOptimizeForEndUserLocation() {
        return this.optimizeForEndUserLocation;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Fleet(String name) {
        this(name, FleetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Fleet(String name, @Nullable FleetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Fleet(String name, @Nullable FleetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:worklink/fleet:Fleet", name, args == null ? FleetArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Fleet(String name, Input<String> id, @Nullable FleetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:worklink/fleet:Fleet", name, state, makeResourceOptions(options, id));
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
    public static Fleet get(String name, Input<String> id, @Nullable FleetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Fleet(name, id, state, options);
    }
}
