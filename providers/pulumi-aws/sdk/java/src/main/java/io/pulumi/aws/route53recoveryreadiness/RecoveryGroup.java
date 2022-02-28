// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53recoveryreadiness;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.route53recoveryreadiness.RecoveryGroupArgs;
import io.pulumi.aws.route53recoveryreadiness.inputs.RecoveryGroupState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an AWS Route 53 Recovery Readiness Recovery Group.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Route53 Recovery Readiness recovery groups can be imported via the recovery group name, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:route53recoveryreadiness/recoveryGroup:RecoveryGroup my-high-availability-app my-high-availability-app
 * ```
 * 
 */
@ResourceType(type="aws:route53recoveryreadiness/recoveryGroup:RecoveryGroup")
public class RecoveryGroup extends io.pulumi.resources.CustomResource {
    /**
     * ARN of the recovery group
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the recovery group
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * List of cell arns to add as nested fault domains within this recovery group
     * 
     */
    @OutputExport(name="cells", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> cells;

    /**
     * @return List of cell arns to add as nested fault domains within this recovery group
     * 
     */
    public Output</* @Nullable */ List<String>> getCells() {
        return this.cells;
    }
    /**
     * A unique name describing the recovery group.
     * 
     */
    @OutputExport(name="recoveryGroupName", type=String.class, parameters={})
    private Output<String> recoveryGroupName;

    /**
     * @return A unique name describing the recovery group.
     * 
     */
    public Output<String> getRecoveryGroupName() {
        return this.recoveryGroupName;
    }
    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RecoveryGroup(String name) {
        this(name, RecoveryGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RecoveryGroup(String name, RecoveryGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RecoveryGroup(String name, RecoveryGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53recoveryreadiness/recoveryGroup:RecoveryGroup", name, args == null ? RecoveryGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RecoveryGroup(String name, Input<String> id, @Nullable RecoveryGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53recoveryreadiness/recoveryGroup:RecoveryGroup", name, state, makeResourceOptions(options, id));
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
    public static RecoveryGroup get(String name, Input<String> id, @Nullable RecoveryGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RecoveryGroup(name, id, state, options);
    }
}
