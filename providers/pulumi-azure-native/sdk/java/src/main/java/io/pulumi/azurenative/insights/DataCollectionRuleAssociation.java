// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.insights.DataCollectionRuleAssociationArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Definition of generic ARM proxy resource.
 * API Version: 2019-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:insights:DataCollectionRuleAssociation myAssociation /subscriptions/703362b3-f278-4e4b-9179-c76eaf41ffc2/resourceGroups/myResourceGroup/providers/Microsoft.Compute/virtualMachines/myVm/providers/Microsoft.Insights/dataCollectionRuleAssociations/myAssociation 
 * ```
 * 
 */
@ResourceType(type="azure-native:insights:DataCollectionRuleAssociation")
public class DataCollectionRuleAssociation extends io.pulumi.resources.CustomResource {
    /**
     * The resource ID of the data collection rule that is to be associated.
     * 
     */
    @Export(name="dataCollectionRuleId", type=String.class, parameters={})
    private Output</* @Nullable */ String> dataCollectionRuleId;

    /**
     * @return The resource ID of the data collection rule that is to be associated.
     * 
     */
    public Output</* @Nullable */ String> dataCollectionRuleId() {
        return this.dataCollectionRuleId;
    }
    /**
     * Description of the association.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the association.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * Resource entity tag (ETag).
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Resource entity tag (ETag).
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The resource provisioning state.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The resource provisioning state.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataCollectionRuleAssociation(String name) {
        this(name, DataCollectionRuleAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataCollectionRuleAssociation(String name, DataCollectionRuleAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataCollectionRuleAssociation(String name, DataCollectionRuleAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:DataCollectionRuleAssociation", name, args == null ? DataCollectionRuleAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DataCollectionRuleAssociation(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:DataCollectionRuleAssociation", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:insights/v20191101preview:DataCollectionRuleAssociation").build()),
                Output.of(Alias.builder().type("azure-native:insights/v20210401:DataCollectionRuleAssociation").build())
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
    public static DataCollectionRuleAssociation get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DataCollectionRuleAssociation(name, id, options);
    }
}
