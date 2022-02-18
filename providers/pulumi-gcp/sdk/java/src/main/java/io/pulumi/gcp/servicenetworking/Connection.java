// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.servicenetworking;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.servicenetworking.ConnectionArgs;
import io.pulumi.gcp.servicenetworking.inputs.ConnectionState;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages a private VPC connection with a GCP service provider. For more information see
 * [the official documentation](https://cloud.google.com/vpc/docs/configure-private-services-access#creating-connection)
 * and
 * [API](https://cloud.google.com/service-infrastructure/docs/service-networking/reference/rest/v1/services.connections).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * ServiceNetworkingConnection can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:servicenetworking/connection:Connection peering_connection {{peering-network}}:{{service}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:servicenetworking/connection:Connection peering_connection /projects/{{project}}/global/networks/{{peering-network}}:{{service}}
 * ```
 * 
 */
@ResourceType(type="gcp:servicenetworking/connection:Connection")
public class Connection extends io.pulumi.resources.CustomResource {
    /**
     * Name of VPC network connected with service producers using VPC peering.
     * 
     */
    @OutputExport(name="network", type=String.class, parameters={})
    private Output<String> network;

    /**
     * @return Name of VPC network connected with service producers using VPC peering.
     * 
     */
    public Output<String> getNetwork() {
        return this.network;
    }
    @OutputExport(name="peering", type=String.class, parameters={})
    private Output<String> peering;

    public Output<String> getPeering() {
        return this.peering;
    }
    /**
     * Named IP address range(s) of PEERING type reserved for
     * this service provider. Note that invoking this method with a different range when connection
     * is already established will not reallocate already provisioned service producer subnetworks.
     * 
     */
    @OutputExport(name="reservedPeeringRanges", type=List.class, parameters={String.class})
    private Output<List<String>> reservedPeeringRanges;

    /**
     * @return Named IP address range(s) of PEERING type reserved for
     * this service provider. Note that invoking this method with a different range when connection
     * is already established will not reallocate already provisioned service producer subnetworks.
     * 
     */
    public Output<List<String>> getReservedPeeringRanges() {
        return this.reservedPeeringRanges;
    }
    /**
     * Provider peering service that is managing peering connectivity for a
     * service provider organization. For Google services that support this functionality it is
     * 'servicenetworking.googleapis.com'.
     * 
     */
    @OutputExport(name="service", type=String.class, parameters={})
    private Output<String> service;

    /**
     * @return Provider peering service that is managing peering connectivity for a
     * service provider organization. For Google services that support this functionality it is
     * 'servicenetworking.googleapis.com'.
     * 
     */
    public Output<String> getService() {
        return this.service;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Connection(String name, ConnectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:servicenetworking/connection:Connection", name, args == null ? ConnectionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Connection(String name, Input<String> id, @Nullable ConnectionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:servicenetworking/connection:Connection", name, state, makeResourceOptions(options, id));
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
    public static Connection get(String name, Input<String> id, @Nullable ConnectionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Connection(name, id, state, options);
    }
}
