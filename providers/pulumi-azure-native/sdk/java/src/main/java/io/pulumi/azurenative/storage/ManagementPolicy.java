// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storage.ManagementPolicyArgs;
import io.pulumi.azurenative.storage.outputs.ManagementPolicySchemaResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The Get Storage Account ManagementPolicies operation response.
 * API Version: 2021-02-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:storage:ManagementPolicy DefaultManagementPolicy /subscriptions/{subscription-id}/resourceGroups/res7231/providers/Microsoft.Storage/storageAccounts/sto288/managementPolicies/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:storage:ManagementPolicy")
public class ManagementPolicy extends io.pulumi.resources.CustomResource {
    /**
     * Returns the date and time the ManagementPolicies was last modified.
     * 
     */
    @Export(name="lastModifiedTime", type=String.class, parameters={})
    private Output<String> lastModifiedTime;

    /**
     * @return Returns the date and time the ManagementPolicies was last modified.
     * 
     */
    public Output<String> lastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The Storage Account ManagementPolicy, in JSON format. See more details in: https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
     * 
     */
    @Export(name="policy", type=ManagementPolicySchemaResponse.class, parameters={})
    private Output<ManagementPolicySchemaResponse> policy;

    /**
     * @return The Storage Account ManagementPolicy, in JSON format. See more details in: https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
     * 
     */
    public Output<ManagementPolicySchemaResponse> policy() {
        return this.policy;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagementPolicy(String name) {
        this(name, ManagementPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagementPolicy(String name, ManagementPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagementPolicy(String name, ManagementPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:ManagementPolicy", name, args == null ? ManagementPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ManagementPolicy(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:ManagementPolicy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:storage/v20180301preview:ManagementPolicy").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20181101:ManagementPolicy").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20190401:ManagementPolicy").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20190601:ManagementPolicy").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20200801preview:ManagementPolicy").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210101:ManagementPolicy").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210201:ManagementPolicy").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210401:ManagementPolicy").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210601:ManagementPolicy").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210801:ManagementPolicy").build())
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
    public static ManagementPolicy get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ManagementPolicy(name, id, options);
    }
}
