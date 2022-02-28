// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.neptune;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.neptune.SubnetGroupArgs;
import io.pulumi.aws.neptune.inputs.SubnetGroupState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an Neptune subnet group resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Neptune Subnet groups can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:neptune/subnetGroup:SubnetGroup default production-subnet-group
 * ```
 * 
 */
@ResourceType(type="aws:neptune/subnetGroup:SubnetGroup")
public class SubnetGroup extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the neptune subnet group.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the neptune subnet group.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The description of the neptune subnet group. Defaults to "Managed by Pulumi".
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return The description of the neptune subnet group. Defaults to "Managed by Pulumi".
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The name of the neptune subnet group. If omitted, this provider will assign a random, unique name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the neptune subnet group. If omitted, this provider will assign a random, unique name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @OutputExport(name="namePrefix", type=String.class, parameters={})
    private Output<String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    public Output<String> getNamePrefix() {
        return this.namePrefix;
    }
    /**
     * A list of VPC subnet IDs.
     * 
     */
    @OutputExport(name="subnetIds", type=List.class, parameters={String.class})
    private Output<List<String>> subnetIds;

    /**
     * @return A list of VPC subnet IDs.
     * 
     */
    public Output<List<String>> getSubnetIds() {
        return this.subnetIds;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SubnetGroup(String name) {
        this(name, SubnetGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SubnetGroup(String name, SubnetGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SubnetGroup(String name, SubnetGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:neptune/subnetGroup:SubnetGroup", name, args == null ? SubnetGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SubnetGroup(String name, Input<String> id, @Nullable SubnetGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:neptune/subnetGroup:SubnetGroup", name, state, makeResourceOptions(options, id));
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
    public static SubnetGroup get(String name, Input<String> id, @Nullable SubnetGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SubnetGroup(name, id, state, options);
    }
}
