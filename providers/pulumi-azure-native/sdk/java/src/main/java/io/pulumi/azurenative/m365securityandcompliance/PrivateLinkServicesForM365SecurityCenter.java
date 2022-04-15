// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.m365securityandcompliance;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.m365securityandcompliance.PrivateLinkServicesForM365SecurityCenterArgs;
import io.pulumi.azurenative.m365securityandcompliance.outputs.ServicesPropertiesResponse;
import io.pulumi.azurenative.m365securityandcompliance.outputs.ServicesResourceResponseIdentity;
import io.pulumi.azurenative.m365securityandcompliance.outputs.SystemDataResponse;
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
 * The description of the service.
 * API Version: 2021-03-25-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:m365securityandcompliance:privateLinkServicesForM365SecurityCenter service2 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.M365SecurityAndCompliance/privateLinkServicesForM365SecurityCenter/service2 
 * ```
 * 
 */
@ResourceType(type="azure-native:m365securityandcompliance:privateLinkServicesForM365SecurityCenter")
public class PrivateLinkServicesForM365SecurityCenter extends io.pulumi.resources.CustomResource {
    /**
     * An etag associated with the resource, used for optimistic concurrency when editing it.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return An etag associated with the resource, used for optimistic concurrency when editing it.
     * 
     */
    public Output</* @Nullable */ String> etag() {
        return this.etag;
    }
    /**
     * Setting indicating whether the service has a managed identity associated with it.
     * 
     */
    @Export(name="identity", type=ServicesResourceResponseIdentity.class, parameters={})
    private Output</* @Nullable */ ServicesResourceResponseIdentity> identity;

    /**
     * @return Setting indicating whether the service has a managed identity associated with it.
     * 
     */
    public Output</* @Nullable */ ServicesResourceResponseIdentity> identity() {
        return this.identity;
    }
    /**
     * The kind of the service.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The kind of the service.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * The resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The resource location.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The common properties of a service.
     * 
     */
    @Export(name="properties", type=ServicesPropertiesResponse.class, parameters={})
    private Output<ServicesPropertiesResponse> properties;

    /**
     * @return The common properties of a service.
     * 
     */
    public Output<ServicesPropertiesResponse> properties() {
        return this.properties;
    }
    /**
     * Required property for system data
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Required property for system data
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * The resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * The resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrivateLinkServicesForM365SecurityCenter(String name) {
        this(name, PrivateLinkServicesForM365SecurityCenterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrivateLinkServicesForM365SecurityCenter(String name, PrivateLinkServicesForM365SecurityCenterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivateLinkServicesForM365SecurityCenter(String name, PrivateLinkServicesForM365SecurityCenterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:m365securityandcompliance:privateLinkServicesForM365SecurityCenter", name, args == null ? PrivateLinkServicesForM365SecurityCenterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PrivateLinkServicesForM365SecurityCenter(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:m365securityandcompliance:privateLinkServicesForM365SecurityCenter", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:m365securityandcompliance/v20210325preview:privateLinkServicesForM365SecurityCenter").build())
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
    public static PrivateLinkServicesForM365SecurityCenter get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PrivateLinkServicesForM365SecurityCenter(name, id, options);
    }
}
