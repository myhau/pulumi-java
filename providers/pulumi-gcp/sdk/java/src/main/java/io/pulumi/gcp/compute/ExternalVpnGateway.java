// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.ExternalVpnGatewayArgs;
import io.pulumi.gcp.compute.inputs.ExternalVpnGatewayState;
import io.pulumi.gcp.compute.outputs.ExternalVpnGatewayInterface;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Represents a VPN gateway managed outside of GCP.
 * 
 * To get more information about ExternalVpnGateway, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/externalVpnGateways)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * ExternalVpnGateway can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/externalVpnGateway:ExternalVpnGateway default projects/{{project}}/global/externalVpnGateways/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/externalVpnGateway:ExternalVpnGateway default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/externalVpnGateway:ExternalVpnGateway default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/externalVpnGateway:ExternalVpnGateway")
public class ExternalVpnGateway extends io.pulumi.resources.CustomResource {
    /**
     * An optional description of this resource.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of this resource.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * A list of interfaces on this external VPN gateway.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="interfaces", type=List.class, parameters={ExternalVpnGatewayInterface.class})
    private Output</* @Nullable */ List<ExternalVpnGatewayInterface>> interfaces;

    /**
     * @return A list of interfaces on this external VPN gateway.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ List<ExternalVpnGatewayInterface>> getInterfaces() {
        return this.interfaces;
    }
    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035.  Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z?` which means
     * the first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035.  Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z?` which means
     * the first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * Indicates the redundancy type of this external VPN gateway
     * Possible values are `FOUR_IPS_REDUNDANCY`, `SINGLE_IP_INTERNALLY_REDUNDANT`, and `TWO_IPS_REDUNDANCY`.
     * 
     */
    @OutputExport(name="redundancyType", type=String.class, parameters={})
    private Output</* @Nullable */ String> redundancyType;

    /**
     * @return Indicates the redundancy type of this external VPN gateway
     * Possible values are `FOUR_IPS_REDUNDANCY`, `SINGLE_IP_INTERNALLY_REDUNDANT`, and `TWO_IPS_REDUNDANCY`.
     * 
     */
    public Output</* @Nullable */ String> getRedundancyType() {
        return this.redundancyType;
    }
    /**
     * The URI of the created resource.
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ExternalVpnGateway(String name, @Nullable ExternalVpnGatewayArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/externalVpnGateway:ExternalVpnGateway", name, args == null ? ExternalVpnGatewayArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ExternalVpnGateway(String name, Input<String> id, @Nullable ExternalVpnGatewayState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/externalVpnGateway:ExternalVpnGateway", name, state, makeResourceOptions(options, id));
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
    public static ExternalVpnGateway get(String name, Input<String> id, @Nullable ExternalVpnGatewayState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ExternalVpnGateway(name, id, state, options);
    }
}
