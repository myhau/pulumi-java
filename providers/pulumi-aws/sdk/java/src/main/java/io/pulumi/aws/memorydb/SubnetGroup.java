// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.memorydb;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.memorydb.SubnetGroupArgs;
import io.pulumi.aws.memorydb.inputs.SubnetGroupState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a MemoryDB Subnet Group.
 * 
 * More information about subnet groups can be found in the [MemoryDB User Guide](https://docs.aws.amazon.com/memorydb/latest/devguide/subnetgroups.html).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Use the `name` to import a subnet group. For example
 * 
 * ```sh
 *  $ pulumi import aws:memorydb/subnetGroup:SubnetGroup example my-subnet-group
 * ```
 * 
 */
@ResourceType(type="aws:memorydb/subnetGroup:SubnetGroup")
public class SubnetGroup extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the subnet group.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the subnet group.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

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
     * Set of VPC Subnet ID-s for the subnet group. At least one subnet must be provided.
     * 
     */
    @OutputExport(name="subnetIds", type=List.class, parameters={String.class})
    private Output<List<String>> subnetIds;

    /**
     * @return Set of VPC Subnet ID-s for the subnet group. At least one subnet must be provided.
     * 
     */
    public Output<List<String>> getSubnetIds() {
        return this.subnetIds;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * The VPC in which the subnet group exists.
     * 
     */
    @OutputExport(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return The VPC in which the subnet group exists.
     * 
     */
    public Output<String> getVpcId() {
        return this.vpcId;
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
        super("aws:memorydb/subnetGroup:SubnetGroup", name, args == null ? SubnetGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SubnetGroup(String name, Input<String> id, @Nullable SubnetGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:memorydb/subnetGroup:SubnetGroup", name, state, makeResourceOptions(options, id));
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
