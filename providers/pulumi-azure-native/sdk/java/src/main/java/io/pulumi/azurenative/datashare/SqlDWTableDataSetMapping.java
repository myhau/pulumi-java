// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datashare.SqlDWTableDataSetMappingArgs;
import io.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A SQL DW Table data set mapping.
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:datashare:SqlDWTableDataSetMapping datasetMappingName1 /subscriptions/0f3dcfc3-18f8-4099-b381-8353e19d43a7/resourceGroups/SampleResourceGroup/providers/Microsoft.DataShare/accounts/consumerAccount/shareSubscriptions/ShareSubscription1/dataSetMappings/datasetMappingName1 
 * ```
 * 
 */
@ResourceType(type="azure-native:datashare:SqlDWTableDataSetMapping")
public class SqlDWTableDataSetMapping extends io.pulumi.resources.CustomResource {
    /**
     * The id of the source data set.
     * 
     */
    @Export(name="dataSetId", type=String.class, parameters={})
    private Output<String> dataSetId;

    /**
     * @return The id of the source data set.
     * 
     */
    public Output<String> dataSetId() {
        return this.dataSetId;
    }
    /**
     * Gets the status of the data set mapping.
     * 
     */
    @Export(name="dataSetMappingStatus", type=String.class, parameters={})
    private Output<String> dataSetMappingStatus;

    /**
     * @return Gets the status of the data set mapping.
     * 
     */
    public Output<String> dataSetMappingStatus() {
        return this.dataSetMappingStatus;
    }
    /**
     * DataWarehouse name of the source data set
     * 
     */
    @Export(name="dataWarehouseName", type=String.class, parameters={})
    private Output<String> dataWarehouseName;

    /**
     * @return DataWarehouse name of the source data set
     * 
     */
    public Output<String> dataWarehouseName() {
        return this.dataWarehouseName;
    }
    /**
     * Kind of data set mapping.
     * Expected value is 'SqlDWTable'.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Kind of data set mapping.
     * Expected value is 'SqlDWTable'.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * Name of the azure resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the azure resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Provisioning state of the data set mapping.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the data set mapping.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Schema of the table. Default value is dbo.
     * 
     */
    @Export(name="schemaName", type=String.class, parameters={})
    private Output<String> schemaName;

    /**
     * @return Schema of the table. Default value is dbo.
     * 
     */
    public Output<String> schemaName() {
        return this.schemaName;
    }
    /**
     * Resource id of SQL server
     * 
     */
    @Export(name="sqlServerResourceId", type=String.class, parameters={})
    private Output<String> sqlServerResourceId;

    /**
     * @return Resource id of SQL server
     * 
     */
    public Output<String> sqlServerResourceId() {
        return this.sqlServerResourceId;
    }
    /**
     * System Data of the Azure resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return System Data of the Azure resource.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * SQL DW table name.
     * 
     */
    @Export(name="tableName", type=String.class, parameters={})
    private Output<String> tableName;

    /**
     * @return SQL DW table name.
     * 
     */
    public Output<String> tableName() {
        return this.tableName;
    }
    /**
     * Type of the azure resource
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of the azure resource
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SqlDWTableDataSetMapping(String name) {
        this(name, SqlDWTableDataSetMappingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SqlDWTableDataSetMapping(String name, SqlDWTableDataSetMappingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SqlDWTableDataSetMapping(String name, SqlDWTableDataSetMappingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:SqlDWTableDataSetMapping", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private SqlDWTableDataSetMapping(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:SqlDWTableDataSetMapping", name, null, makeResourceOptions(options, id));
    }

    private static SqlDWTableDataSetMappingArgs makeArgs(SqlDWTableDataSetMappingArgs args) {
        var builder = args == null ? SqlDWTableDataSetMappingArgs.builder() : SqlDWTableDataSetMappingArgs.builder(args);
        return builder
            .kind("SqlDWTable")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:datashare/v20181101preview:SqlDWTableDataSetMapping").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20191101:SqlDWTableDataSetMapping").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20200901:SqlDWTableDataSetMapping").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20201001preview:SqlDWTableDataSetMapping").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20210801:SqlDWTableDataSetMapping").build())
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
    public static SqlDWTableDataSetMapping get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SqlDWTableDataSetMapping(name, id, options);
    }
}
