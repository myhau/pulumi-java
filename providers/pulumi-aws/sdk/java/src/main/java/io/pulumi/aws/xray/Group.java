// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.xray;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.xray.GroupArgs;
import io.pulumi.aws.xray.inputs.GroupState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates and manages an AWS XRay Group.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * XRay Groups can be imported using the ARN, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:xray/group:Group example arn:aws:xray:us-west-2:1234567890:group/example-group/TNGX7SW5U6QY36T4ZMOUA3HVLBYCZTWDIOOXY3CJAXTHSS3YCWUA
 * ```
 * 
 */
@ResourceType(type="aws:xray/group:Group")
public class Group extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the Group.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the Group.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The filter expression defining criteria by which to group traces. more info can be found in official [docs](https://docs.aws.amazon.com/xray/latest/devguide/xray-console-filters.html).
     * 
     */
    @OutputExport(name="filterExpression", type=String.class, parameters={})
    private Output<String> filterExpression;

    /**
     * @return The filter expression defining criteria by which to group traces. more info can be found in official [docs](https://docs.aws.amazon.com/xray/latest/devguide/xray-console-filters.html).
     * 
     */
    public Output<String> getFilterExpression() {
        return this.filterExpression;
    }
    /**
     * The name of the group.
     * 
     */
    @OutputExport(name="groupName", type=String.class, parameters={})
    private Output<String> groupName;

    /**
     * @return The name of the group.
     * 
     */
    public Output<String> getGroupName() {
        return this.groupName;
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
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    public interface BuilderApplicator {
        public void apply(GroupArgs.Builder a);
    }
    private static io.pulumi.aws.xray.GroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.xray.GroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Group(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Group(String name) {
        this(name, GroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Group(String name, GroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Group(String name, GroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:xray/group:Group", name, args == null ? GroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Group(String name, Input<String> id, @Nullable GroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:xray/group:Group", name, state, makeResourceOptions(options, id));
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
    public static Group get(String name, Input<String> id, @Nullable GroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Group(name, id, state, options);
    }
}