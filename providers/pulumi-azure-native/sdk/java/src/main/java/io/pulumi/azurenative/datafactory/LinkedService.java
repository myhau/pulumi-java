// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datafactory.LinkedServiceArgs;
import io.pulumi.azurenative.datafactory.outputs.AmazonMWSLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.AmazonRdsForOracleLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.AmazonRdsForSqlServerLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.AmazonRedshiftLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.AmazonS3CompatibleLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.AmazonS3LinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureBatchLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureBlobFSLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureBlobStorageLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureDataExplorerLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureDataLakeAnalyticsLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureDataLakeStoreLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureDatabricksDeltaLakeLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureDatabricksLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureFileStorageLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureFunctionLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureKeyVaultLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureMLLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureMLServiceLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureMariaDBLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureMySqlLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzurePostgreSqlLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureSearchLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureSqlDWLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureSqlDatabaseLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureSqlMILinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureStorageLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureTableStorageLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.CassandraLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.CommonDataServiceForAppsLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.ConcurLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.CosmosDbLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.CosmosDbMongoDbApiLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.CouchbaseLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.CustomDataSourceLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.Db2LinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.DrillLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.DynamicsAXLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.DynamicsCrmLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.DynamicsLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.EloquaLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.FileServerLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.FtpServerLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.GoogleAdWordsLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.GoogleBigQueryLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.GoogleCloudStorageLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.GreenplumLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.HBaseLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.HDInsightLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.HDInsightOnDemandLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.HdfsLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.HiveLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.HttpLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.HubspotLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.ImpalaLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.InformixLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.JiraLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.MagentoLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.MariaDBLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.MarketoLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.MicrosoftAccessLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.MongoDbAtlasLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.MongoDbLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.MongoDbV2LinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.MySqlLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.NetezzaLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.ODataLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.OdbcLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.Office365LinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.OracleCloudStorageLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.OracleLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.OracleServiceCloudLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.PaypalLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.PhoenixLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.PostgreSqlLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.PrestoLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.QuickBooksLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.ResponsysLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.RestServiceLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.SalesforceLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.SalesforceMarketingCloudLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.SalesforceServiceCloudLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.SapBWLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.SapCloudForCustomerLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.SapEccLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.SapHanaLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.SapOpenHubLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.SapTableLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.ServiceNowLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.SftpServerLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.SharePointOnlineListLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.ShopifyLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.SnowflakeLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.SparkLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.SqlServerLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.SquareLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.SybaseLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.TeradataLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.VerticaLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.WebLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.XeroLinkedServiceResponse;
import io.pulumi.azurenative.datafactory.outputs.ZohoLinkedServiceResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Linked service resource type.
 * API Version: 2018-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:datafactory:LinkedService exampleLinkedService /subscriptions/12345678-1234-1234-1234-12345678abc/resourceGroups/exampleResourceGroup/providers/Microsoft.DataFactory/factories/exampleFactoryName/linkedservices/exampleLinkedService 
 * ```
 * 
 */
@ResourceType(type="azure-native:datafactory:LinkedService")
public class LinkedService extends io.pulumi.resources.CustomResource {
    /**
     * Etag identifies change in the resource.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Etag identifies change in the resource.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Properties of linked service.
     * 
     */
    @Export(name="properties", type=Object.class, parameters={})
    private Output<Object> properties;

    /**
     * @return Properties of linked service.
     * 
     */
    public Output<Object> properties() {
        return this.properties;
    }
    /**
     * The resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LinkedService(String name) {
        this(name, LinkedServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LinkedService(String name, LinkedServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LinkedService(String name, LinkedServiceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datafactory:LinkedService", name, args == null ? LinkedServiceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LinkedService(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datafactory:LinkedService", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:datafactory/v20170901preview:LinkedService").build()),
                Output.of(Alias.builder().type("azure-native:datafactory/v20180601:LinkedService").build())
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
    public static LinkedService get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LinkedService(name, id, options);
    }
}
