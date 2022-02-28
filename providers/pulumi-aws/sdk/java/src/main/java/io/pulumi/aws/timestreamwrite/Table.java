// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.timestreamwrite;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.timestreamwrite.TableArgs;
import io.pulumi.aws.timestreamwrite.inputs.TableState;
import io.pulumi.aws.timestreamwrite.outputs.TableMagneticStoreWriteProperties;
import io.pulumi.aws.timestreamwrite.outputs.TableRetentionProperties;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Timestream table resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Timestream tables can be imported using the `table_name` and `database_name` separate by a colon (`:`), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:timestreamwrite/table:Table example ExampleTable:ExampleDatabase
 * ```
 * 
 */
@ResourceType(type="aws:timestreamwrite/table:Table")
public class Table extends io.pulumi.resources.CustomResource {
    /**
     * The ARN that uniquely identifies this table.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN that uniquely identifies this table.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The name of the Timestream database.
     * 
     */
    @OutputExport(name="databaseName", type=String.class, parameters={})
    private Output<String> databaseName;

    /**
     * @return The name of the Timestream database.
     * 
     */
    public Output<String> getDatabaseName() {
        return this.databaseName;
    }
    /**
     * Contains properties to set on the table when enabling magnetic store writes. See Magnetic Store Write Properties below for more details.
     * 
     */
    @OutputExport(name="magneticStoreWriteProperties", type=TableMagneticStoreWriteProperties.class, parameters={})
    private Output<TableMagneticStoreWriteProperties> magneticStoreWriteProperties;

    /**
     * @return Contains properties to set on the table when enabling magnetic store writes. See Magnetic Store Write Properties below for more details.
     * 
     */
    public Output<TableMagneticStoreWriteProperties> getMagneticStoreWriteProperties() {
        return this.magneticStoreWriteProperties;
    }
    /**
     * The retention duration for the memory store and magnetic store. See Retention Properties below for more details. If not provided, `magnetic_store_retention_period_in_days` default to 73000 and `memory_store_retention_period_in_hours` defaults to 6.
     * 
     */
    @OutputExport(name="retentionProperties", type=TableRetentionProperties.class, parameters={})
    private Output<TableRetentionProperties> retentionProperties;

    /**
     * @return The retention duration for the memory store and magnetic store. See Retention Properties below for more details. If not provided, `magnetic_store_retention_period_in_days` default to 73000 and `memory_store_retention_period_in_hours` defaults to 6.
     * 
     */
    public Output<TableRetentionProperties> getRetentionProperties() {
        return this.retentionProperties;
    }
    /**
     * The name of the Timestream table.
     * 
     */
    @OutputExport(name="tableName", type=String.class, parameters={})
    private Output<String> tableName;

    /**
     * @return The name of the Timestream table.
     * 
     */
    public Output<String> getTableName() {
        return this.tableName;
    }
    /**
     * Map of tags to assign to this resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to this resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Table(String name) {
        this(name, TableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Table(String name, TableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Table(String name, TableArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:timestreamwrite/table:Table", name, args == null ? TableArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Table(String name, Input<String> id, @Nullable TableState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:timestreamwrite/table:Table", name, state, makeResourceOptions(options, id));
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
    public static Table get(String name, Input<String> id, @Nullable TableState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Table(name, id, state, options);
    }
}
