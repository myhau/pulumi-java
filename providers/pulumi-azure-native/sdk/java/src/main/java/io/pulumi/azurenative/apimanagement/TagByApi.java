// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.TagByApiArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Tag Contract details.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:apimanagement:TagByApi tagId1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/tags/tagId1 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:TagByApi")
public class TagByApi extends io.pulumi.resources.CustomResource {
    /**
     * Tag name.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Tag name.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
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
     * Resource type for API Management resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type for API Management resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TagByApi(String name) {
        this(name, TagByApiArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TagByApi(String name, TagByApiArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TagByApi(String name, TagByApiArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:TagByApi", name, args == null ? TagByApiArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TagByApi(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:TagByApi", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:apimanagement/v20170301:TagByApi").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20180101:TagByApi").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20180601preview:TagByApi").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20190101:TagByApi").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20191201:TagByApi").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20191201preview:TagByApi").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20200601preview:TagByApi").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20201201:TagByApi").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210101preview:TagByApi").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210401preview:TagByApi").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210801:TagByApi").build())
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
    public static TagByApi get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TagByApi(name, id, options);
    }
}
