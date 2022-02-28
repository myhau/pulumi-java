// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.rds.OptionGroupArgs;
import io.pulumi.aws.rds.inputs.OptionGroupState;
import io.pulumi.aws.rds.outputs.OptionGroupOption;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an RDS DB option group resource. Documentation of the available options for various RDS engines can be found at:
 * 
 * * [MariaDB Options](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.MariaDB.Options.html)
 * * [Microsoft SQL Server Options](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.SQLServer.Options.html)
 * * [MySQL Options](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.MySQL.Options.html)
 * * [Oracle Options](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.Oracle.Options.html)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * DB Option groups can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:rds/optionGroup:OptionGroup example mysql-option-group
 * ```
 * 
 */
@ResourceType(type="aws:rds/optionGroup:OptionGroup")
public class OptionGroup extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the db option group.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the db option group.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Specifies the name of the engine that this option group should be associated with.
     * 
     */
    @OutputExport(name="engineName", type=String.class, parameters={})
    private Output<String> engineName;

    /**
     * @return Specifies the name of the engine that this option group should be associated with.
     * 
     */
    public Output<String> getEngineName() {
        return this.engineName;
    }
    /**
     * Specifies the major version of the engine that this option group should be associated with.
     * 
     */
    @OutputExport(name="majorEngineVersion", type=String.class, parameters={})
    private Output<String> majorEngineVersion;

    /**
     * @return Specifies the major version of the engine that this option group should be associated with.
     * 
     */
    public Output<String> getMajorEngineVersion() {
        return this.majorEngineVersion;
    }
    /**
     * The Name of the setting.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The Name of the setting.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`. Must be lowercase, to match as it is stored in AWS.
     * 
     */
    @OutputExport(name="namePrefix", type=String.class, parameters={})
    private Output<String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified prefix. Conflicts with `name`. Must be lowercase, to match as it is stored in AWS.
     * 
     */
    public Output<String> getNamePrefix() {
        return this.namePrefix;
    }
    /**
     * The description of the option group. Defaults to "Managed by Pulumi".
     * 
     */
    @OutputExport(name="optionGroupDescription", type=String.class, parameters={})
    private Output<String> optionGroupDescription;

    /**
     * @return The description of the option group. Defaults to "Managed by Pulumi".
     * 
     */
    public Output<String> getOptionGroupDescription() {
        return this.optionGroupDescription;
    }
    /**
     * A list of Options to apply.
     * 
     */
    @OutputExport(name="options", type=List.class, parameters={OptionGroupOption.class})
    private Output</* @Nullable */ List<OptionGroupOption>> options;

    /**
     * @return A list of Options to apply.
     * 
     */
    public Output</* @Nullable */ List<OptionGroupOption>> getOptions() {
        return this.options;
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
    public OptionGroup(String name) {
        this(name, OptionGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OptionGroup(String name, OptionGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OptionGroup(String name, OptionGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/optionGroup:OptionGroup", name, args == null ? OptionGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private OptionGroup(String name, Input<String> id, @Nullable OptionGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/optionGroup:OptionGroup", name, state, makeResourceOptions(options, id));
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
    public static OptionGroup get(String name, Input<String> id, @Nullable OptionGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new OptionGroup(name, id, state, options);
    }
}
