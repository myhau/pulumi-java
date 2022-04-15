// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.media.MediaGraphArgs;
import io.pulumi.azurenative.media.outputs.MediaGraphAssetSinkResponse;
import io.pulumi.azurenative.media.outputs.MediaGraphRtspSourceResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The Media Graph.
 * API Version: 2020-02-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:media:MediaGraph SampleMediaGraph /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Media/mediaServices/{accountName}/mediaGraphs/{mediaGraphName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:media:MediaGraph")
public class MediaGraph extends io.pulumi.resources.CustomResource {
    /**
     * Date the Media Graph was created.
     * 
     */
    @Export(name="created", type=String.class, parameters={})
    private Output<String> created;

    /**
     * @return Date the Media Graph was created.
     * 
     */
    public Output<String> created() {
        return this.created;
    }
    /**
     * Media Graph description.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Media Graph description.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * Date the Media Graph was last modified.
     * 
     */
    @Export(name="lastModified", type=String.class, parameters={})
    private Output<String> lastModified;

    /**
     * @return Date the Media Graph was last modified.
     * 
     */
    public Output<String> lastModified() {
        return this.lastModified;
    }
    /**
     * The name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Media Graph sinks.
     * 
     */
    @Export(name="sinks", type=List.class, parameters={MediaGraphAssetSinkResponse.class})
    private Output<List<MediaGraphAssetSinkResponse>> sinks;

    /**
     * @return Media Graph sinks.
     * 
     */
    public Output<List<MediaGraphAssetSinkResponse>> sinks() {
        return this.sinks;
    }
    /**
     * Media Graph sources.
     * 
     */
    @Export(name="sources", type=List.class, parameters={MediaGraphRtspSourceResponse.class})
    private Output<List<MediaGraphRtspSourceResponse>> sources;

    /**
     * @return Media Graph sources.
     * 
     */
    public Output<List<MediaGraphRtspSourceResponse>> sources() {
        return this.sources;
    }
    /**
     * Media Graph state which indicates the resource allocation status for running the media graph pipeline.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return Media Graph state which indicates the resource allocation status for running the media graph pipeline.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MediaGraph(String name) {
        this(name, MediaGraphArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MediaGraph(String name, MediaGraphArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MediaGraph(String name, MediaGraphArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:media:MediaGraph", name, args == null ? MediaGraphArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MediaGraph(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:media:MediaGraph", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:media/v20190901preview:MediaGraph").build()),
                Output.of(Alias.builder().type("azure-native:media/v20200201preview:MediaGraph").build())
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
    public static MediaGraph get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MediaGraph(name, id, options);
    }
}
