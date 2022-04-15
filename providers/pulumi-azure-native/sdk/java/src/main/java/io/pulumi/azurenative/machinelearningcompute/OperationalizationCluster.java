// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningcompute;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.machinelearningcompute.OperationalizationClusterArgs;
import io.pulumi.azurenative.machinelearningcompute.outputs.AcsClusterPropertiesResponse;
import io.pulumi.azurenative.machinelearningcompute.outputs.AppInsightsPropertiesResponse;
import io.pulumi.azurenative.machinelearningcompute.outputs.ContainerRegistryPropertiesResponse;
import io.pulumi.azurenative.machinelearningcompute.outputs.ErrorResponseWrapperResponse;
import io.pulumi.azurenative.machinelearningcompute.outputs.GlobalServiceConfigurationResponse;
import io.pulumi.azurenative.machinelearningcompute.outputs.StorageAccountPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Instance of an Azure ML Operationalization Cluster resource.
 * API Version: 2017-08-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:machinelearningcompute:OperationalizationCluster MyCluster /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.MachineLearningCompute/operationalizationClusters/MyCluster 
 * ```
 * 
 */
@ResourceType(type="azure-native:machinelearningcompute:OperationalizationCluster")
public class OperationalizationCluster extends io.pulumi.resources.CustomResource {
    /**
     * AppInsights configuration.
     * 
     */
    @Export(name="appInsights", type=AppInsightsPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ AppInsightsPropertiesResponse> appInsights;

    /**
     * @return AppInsights configuration.
     * 
     */
    public Output</* @Nullable */ AppInsightsPropertiesResponse> appInsights() {
        return this.appInsights;
    }
    /**
     * The cluster type.
     * 
     */
    @Export(name="clusterType", type=String.class, parameters={})
    private Output<String> clusterType;

    /**
     * @return The cluster type.
     * 
     */
    public Output<String> clusterType() {
        return this.clusterType;
    }
    /**
     * Container Registry properties.
     * 
     */
    @Export(name="containerRegistry", type=ContainerRegistryPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ ContainerRegistryPropertiesResponse> containerRegistry;

    /**
     * @return Container Registry properties.
     * 
     */
    public Output</* @Nullable */ ContainerRegistryPropertiesResponse> containerRegistry() {
        return this.containerRegistry;
    }
    /**
     * Parameters for the Azure Container Service cluster.
     * 
     */
    @Export(name="containerService", type=AcsClusterPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ AcsClusterPropertiesResponse> containerService;

    /**
     * @return Parameters for the Azure Container Service cluster.
     * 
     */
    public Output</* @Nullable */ AcsClusterPropertiesResponse> containerService() {
        return this.containerService;
    }
    /**
     * The date and time when the cluster was created.
     * 
     */
    @Export(name="createdOn", type=String.class, parameters={})
    private Output<String> createdOn;

    /**
     * @return The date and time when the cluster was created.
     * 
     */
    public Output<String> createdOn() {
        return this.createdOn;
    }
    /**
     * The description of the cluster.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the cluster.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * Contains global configuration for the web services in the cluster.
     * 
     */
    @Export(name="globalServiceConfiguration", type=GlobalServiceConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ GlobalServiceConfigurationResponse> globalServiceConfiguration;

    /**
     * @return Contains global configuration for the web services in the cluster.
     * 
     */
    public Output</* @Nullable */ GlobalServiceConfigurationResponse> globalServiceConfiguration() {
        return this.globalServiceConfiguration;
    }
    /**
     * Specifies the location of the resource.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Specifies the location of the resource.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The date and time when the cluster was last modified.
     * 
     */
    @Export(name="modifiedOn", type=String.class, parameters={})
    private Output<String> modifiedOn;

    /**
     * @return The date and time when the cluster was last modified.
     * 
     */
    public Output<String> modifiedOn() {
        return this.modifiedOn;
    }
    /**
     * Specifies the name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * List of provisioning errors reported by the resource provider.
     * 
     */
    @Export(name="provisioningErrors", type=List.class, parameters={ErrorResponseWrapperResponse.class})
    private Output<List<ErrorResponseWrapperResponse>> provisioningErrors;

    /**
     * @return List of provisioning errors reported by the resource provider.
     * 
     */
    public Output<List<ErrorResponseWrapperResponse>> provisioningErrors() {
        return this.provisioningErrors;
    }
    /**
     * The provision state of the cluster. Valid values are Unknown, Updating, Provisioning, Succeeded, and Failed.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provision state of the cluster. Valid values are Unknown, Updating, Provisioning, Succeeded, and Failed.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Storage Account properties.
     * 
     */
    @Export(name="storageAccount", type=StorageAccountPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ StorageAccountPropertiesResponse> storageAccount;

    /**
     * @return Storage Account properties.
     * 
     */
    public Output</* @Nullable */ StorageAccountPropertiesResponse> storageAccount() {
        return this.storageAccount;
    }
    /**
     * Contains resource tags defined as key/value pairs.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Contains resource tags defined as key/value pairs.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * Specifies the type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Specifies the type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OperationalizationCluster(String name) {
        this(name, OperationalizationClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OperationalizationCluster(String name, OperationalizationClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OperationalizationCluster(String name, OperationalizationClusterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:machinelearningcompute:OperationalizationCluster", name, args == null ? OperationalizationClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OperationalizationCluster(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:machinelearningcompute:OperationalizationCluster", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:machinelearningcompute/v20170601preview:OperationalizationCluster").build()),
                Output.of(Alias.builder().type("azure-native:machinelearningcompute/v20170801preview:OperationalizationCluster").build())
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
    public static OperationalizationCluster get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new OperationalizationCluster(name, id, options);
    }
}
