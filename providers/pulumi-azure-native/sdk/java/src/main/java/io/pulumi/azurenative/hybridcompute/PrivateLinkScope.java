// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridcompute;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.hybridcompute.PrivateLinkScopeArgs;
import io.pulumi.azurenative.hybridcompute.outputs.HybridComputePrivateLinkScopePropertiesResponse;
import io.pulumi.azurenative.hybridcompute.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * An Azure Arc PrivateLinkScope definition.
 * API Version: 2021-03-25-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:hybridcompute:PrivateLinkScope my-privatelinkscope /subscriptions/86dc51d3-92ed-4d7e-947a-775ea79b4919/resourceGroups/my-resource-group/providers/microsoft.hybridCompute/privateLinkScopes/my-privatelinkscope 
 * ```
 * 
 */
@ResourceType(type="azure-native:hybridcompute:PrivateLinkScope")
public class PrivateLinkScope extends io.pulumi.resources.CustomResource {
    /**
     * Resource location
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Azure resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Properties that define a Azure Arc PrivateLinkScope resource.
     * 
     */
    @Export(name="properties", type=HybridComputePrivateLinkScopePropertiesResponse.class, parameters={})
    private Output<HybridComputePrivateLinkScopePropertiesResponse> properties;

    /**
     * @return Properties that define a Azure Arc PrivateLinkScope resource.
     * 
     */
    public Output<HybridComputePrivateLinkScopePropertiesResponse> properties() {
        return this.properties;
    }
    /**
     * The system meta data relating to this resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system meta data relating to this resource.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * Resource tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * Azure resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrivateLinkScope(String name) {
        this(name, PrivateLinkScopeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrivateLinkScope(String name, PrivateLinkScopeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivateLinkScope(String name, PrivateLinkScopeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hybridcompute:PrivateLinkScope", name, args == null ? PrivateLinkScopeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PrivateLinkScope(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hybridcompute:PrivateLinkScope", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:hybridcompute/v20200815preview:PrivateLinkScope").build()),
                Output.of(Alias.builder().type("azure-native:hybridcompute/v20210128preview:PrivateLinkScope").build()),
                Output.of(Alias.builder().type("azure-native:hybridcompute/v20210325preview:PrivateLinkScope").build()),
                Output.of(Alias.builder().type("azure-native:hybridcompute/v20210422preview:PrivateLinkScope").build()),
                Output.of(Alias.builder().type("azure-native:hybridcompute/v20210517preview:PrivateLinkScope").build()),
                Output.of(Alias.builder().type("azure-native:hybridcompute/v20210520:PrivateLinkScope").build()),
                Output.of(Alias.builder().type("azure-native:hybridcompute/v20210610preview:PrivateLinkScope").build()),
                Output.of(Alias.builder().type("azure-native:hybridcompute/v20211210preview:PrivateLinkScope").build())
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
    public static PrivateLinkScope get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PrivateLinkScope(name, id, options);
    }
}
