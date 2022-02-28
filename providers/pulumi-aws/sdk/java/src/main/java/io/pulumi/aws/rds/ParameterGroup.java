// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.rds.ParameterGroupArgs;
import io.pulumi.aws.rds.inputs.ParameterGroupState;
import io.pulumi.aws.rds.outputs.ParameterGroupParameter;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * DB Parameter groups can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:rds/parameterGroup:ParameterGroup rds_pg rds-pg
 * ```
 * 
 */
@ResourceType(type="aws:rds/parameterGroup:ParameterGroup")
public class ParameterGroup extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the db parameter group.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the db parameter group.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The description of the DB parameter group. Defaults to "Managed by Pulumi".
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return The description of the DB parameter group. Defaults to "Managed by Pulumi".
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The family of the DB parameter group.
     * 
     */
    @OutputExport(name="family", type=String.class, parameters={})
    private Output<String> family;

    /**
     * @return The family of the DB parameter group.
     * 
     */
    public Output<String> getFamily() {
        return this.family;
    }
    /**
     * The name of the DB parameter.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the DB parameter.
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
     * A list of DB parameters to apply. Note that parameters may differ from a family to an other. Full list of all parameters can be discovered via [`aws rds describe-db-parameters`](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-parameters.html) after initial creation of the group.
     * 
     */
    @OutputExport(name="parameters", type=List.class, parameters={ParameterGroupParameter.class})
    private Output</* @Nullable */ List<ParameterGroupParameter>> parameters;

    /**
     * @return A list of DB parameters to apply. Note that parameters may differ from a family to an other. Full list of all parameters can be discovered via [`aws rds describe-db-parameters`](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-parameters.html) after initial creation of the group.
     * 
     */
    public Output</* @Nullable */ List<ParameterGroupParameter>> getParameters() {
        return this.parameters;
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
    public ParameterGroup(String name) {
        this(name, ParameterGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ParameterGroup(String name, ParameterGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ParameterGroup(String name, ParameterGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/parameterGroup:ParameterGroup", name, args == null ? ParameterGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ParameterGroup(String name, Input<String> id, @Nullable ParameterGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/parameterGroup:ParameterGroup", name, state, makeResourceOptions(options, id));
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
    public static ParameterGroup get(String name, Input<String> id, @Nullable ParameterGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ParameterGroup(name, id, state, options);
    }
}
