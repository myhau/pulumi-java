// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.ContentTypeArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Content type contract details.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:apimanagement:ContentType page /contentTypes/page 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:ContentType")
public class ContentType extends io.pulumi.resources.CustomResource {
    /**
     * Content type description.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Content type description.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
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
     * Content type schema.
     * 
     */
    @Export(name="schema", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> schema;

    /**
     * @return Content type schema.
     * 
     */
    public Output</* @Nullable */ Object> schema() {
        return this.schema;
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
     * Content type version.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output</* @Nullable */ String> version;

    /**
     * @return Content type version.
     * 
     */
    public Output</* @Nullable */ String> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ContentType(String name) {
        this(name, ContentTypeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ContentType(String name, ContentTypeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ContentType(String name, ContentTypeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:ContentType", name, args == null ? ContentTypeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ContentType(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:ContentType", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:apimanagement/v20191201:ContentType").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20200601preview:ContentType").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20201201:ContentType").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210101preview:ContentType").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210401preview:ContentType").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210801:ContentType").build())
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
    public static ContentType get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ContentType(name, id, options);
    }
}
