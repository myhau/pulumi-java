// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ram;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ram.ResourceShareArgs;
import io.pulumi.aws.ram.inputs.ResourceShareState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages a Resource Access Manager (RAM) Resource Share. To associate principals with the share, see the `aws.ram.PrincipalAssociation` resource. To associate resources with the share, see the `aws.ram.ResourceAssociation` resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Resource shares can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ram/resourceShare:ResourceShare example arn:aws:ram:eu-west-1:123456789012:resource-share/73da1ab9-b94a-4ba3-8eb4-45917f7f4b12
 * ```
 * 
 */
@ResourceType(type="aws:ram/resourceShare:ResourceShare")
public class ResourceShare extends io.pulumi.resources.CustomResource {
    /**
     * Indicates whether principals outside your organization can be associated with a resource share.
     * 
     */
    @OutputExport(name="allowExternalPrincipals", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowExternalPrincipals;

    /**
     * @return Indicates whether principals outside your organization can be associated with a resource share.
     * 
     */
    public Output</* @Nullable */ Boolean> getAllowExternalPrincipals() {
        return this.allowExternalPrincipals;
    }
    /**
     * The Amazon Resource Name (ARN) of the resource share.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the resource share.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The name of the resource share.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource share.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * A map of tags to assign to the resource share. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource share. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable ResourceShareArgs.Builder a);
    }
    private static io.pulumi.aws.ram.ResourceShareArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ram.ResourceShareArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ResourceShare(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResourceShare(String name) {
        this(name, ResourceShareArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResourceShare(String name, @Nullable ResourceShareArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourceShare(String name, @Nullable ResourceShareArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ram/resourceShare:ResourceShare", name, args == null ? ResourceShareArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ResourceShare(String name, Input<String> id, @Nullable ResourceShareState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ram/resourceShare:ResourceShare", name, state, makeResourceOptions(options, id));
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
    public static ResourceShare get(String name, Input<String> id, @Nullable ResourceShareState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ResourceShare(name, id, state, options);
    }
}