// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.avs.GlobalReachConnectionArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A global reach connection resource
 * API Version: 2020-07-17-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:avs:GlobalReachConnection connection1 /subscriptions/{subscription-id}/resourceGroups/group1/providers/Microsoft.AVS/privateClouds/cloud1/globalReachConnections/connection1 
 * ```
 * 
 */
@ResourceType(type="azure-native:avs:GlobalReachConnection")
public class GlobalReachConnection extends io.pulumi.resources.CustomResource {
    /**
     * The network used for global reach carved out from the original network block provided for the private cloud
     * 
     */
    @Export(name="addressPrefix", type=String.class, parameters={})
    private Output<String> addressPrefix;

    /**
     * @return The network used for global reach carved out from the original network block provided for the private cloud
     * 
     */
    public Output<String> addressPrefix() {
        return this.addressPrefix;
    }
    /**
     * Authorization key from the peer express route used for the global reach connection
     * 
     */
    @Export(name="authorizationKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> authorizationKey;

    /**
     * @return Authorization key from the peer express route used for the global reach connection
     * 
     */
    public Output</* @Nullable */ String> authorizationKey() {
        return this.authorizationKey;
    }
    /**
     * The connection status of the global reach connection
     * 
     */
    @Export(name="circuitConnectionStatus", type=String.class, parameters={})
    private Output<String> circuitConnectionStatus;

    /**
     * @return The connection status of the global reach connection
     * 
     */
    public Output<String> circuitConnectionStatus() {
        return this.circuitConnectionStatus;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Identifier of the ExpressRoute Circuit to peer with in the global reach connection
     * 
     */
    @Export(name="peerExpressRouteCircuit", type=String.class, parameters={})
    private Output</* @Nullable */ String> peerExpressRouteCircuit;

    /**
     * @return Identifier of the ExpressRoute Circuit to peer with in the global reach connection
     * 
     */
    public Output</* @Nullable */ String> peerExpressRouteCircuit() {
        return this.peerExpressRouteCircuit;
    }
    /**
     * The state of the  ExpressRoute Circuit Authorization provisioning
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The state of the  ExpressRoute Circuit Authorization provisioning
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GlobalReachConnection(String name) {
        this(name, GlobalReachConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GlobalReachConnection(String name, GlobalReachConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GlobalReachConnection(String name, GlobalReachConnectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:avs:GlobalReachConnection", name, args == null ? GlobalReachConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GlobalReachConnection(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:avs:GlobalReachConnection", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:avs/v20200717preview:GlobalReachConnection").build()),
                Output.of(Alias.builder().type("azure-native:avs/v20210101preview:GlobalReachConnection").build()),
                Output.of(Alias.builder().type("azure-native:avs/v20210601:GlobalReachConnection").build()),
                Output.of(Alias.builder().type("azure-native:avs/v20211201:GlobalReachConnection").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static GlobalReachConnection get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new GlobalReachConnection(name, id, options);
    }
}
