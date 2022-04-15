// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.cdn.AFDEndpointArgs;
import io.pulumi.azurenative.cdn.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * CDN endpoint is the entity within a CDN profile containing configuration information such as origin, protocol, content caching and delivery behavior. The AzureFrontDoor endpoint uses the URL format <endpointname>.azureedge.net.
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:cdn:AFDEndpoint endpoint1 /subscriptions/subid/resourcegroups/RG/providers/Microsoft.Cdn/profiles/profile1/afdEndpoints/endpoint1 
 * ```
 * 
 */
@ResourceType(type="azure-native:cdn:AFDEndpoint")
public class AFDEndpoint extends io.pulumi.resources.CustomResource {
    @Export(name="deploymentStatus", type=String.class, parameters={})
    private Output<String> deploymentStatus;

    public Output<String> deploymentStatus() {
        return this.deploymentStatus;
    }
    /**
     * Whether to enable use of this rule. Permitted values are 'Enabled' or 'Disabled'
     * 
     */
    @Export(name="enabledState", type=String.class, parameters={})
    private Output</* @Nullable */ String> enabledState;

    /**
     * @return Whether to enable use of this rule. Permitted values are 'Enabled' or 'Disabled'
     * 
     */
    public Output</* @Nullable */ String> enabledState() {
        return this.enabledState;
    }
    /**
     * The host name of the endpoint structured as {endpointName}.{DNSZone}, e.g. contoso.azureedge.net
     * 
     */
    @Export(name="hostName", type=String.class, parameters={})
    private Output<String> hostName;

    /**
     * @return The host name of the endpoint structured as {endpointName}.{DNSZone}, e.g. contoso.azureedge.net
     * 
     */
    public Output<String> hostName() {
        return this.hostName;
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<String> location() {
        return this.location;
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
     * Send and receive timeout on forwarding request to the origin. When timeout is reached, the request fails and returns.
     * 
     */
    @Export(name="originResponseTimeoutSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> originResponseTimeoutSeconds;

    /**
     * @return Send and receive timeout on forwarding request to the origin. When timeout is reached, the request fails and returns.
     * 
     */
    public Output</* @Nullable */ Integer> originResponseTimeoutSeconds() {
        return this.originResponseTimeoutSeconds;
    }
    /**
     * Provisioning status
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning status
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Read only system data
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Read only system data
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
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
    public AFDEndpoint(String name) {
        this(name, AFDEndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AFDEndpoint(String name, AFDEndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AFDEndpoint(String name, AFDEndpointArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cdn:AFDEndpoint", name, args == null ? AFDEndpointArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AFDEndpoint(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cdn:AFDEndpoint", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:cdn/v20200901:AFDEndpoint").build()),
                Output.of(Alias.builder().type("azure-native:cdn/v20210601:AFDEndpoint").build())
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
    public static AFDEndpoint get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AFDEndpoint(name, id, options);
    }
}
