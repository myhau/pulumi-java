// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.eventhub.DisasterRecoveryConfigArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Single item in List or Get Alias(Disaster Recovery configuration) operation
 * API Version: 2017-04-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:eventhub:DisasterRecoveryConfig sdk-DisasterRecovery-3814 /subscriptions/exampleResourceGroup/resourceGroups/exampleResourceGroup/providers/Microsoft.EventHub/namespaces/sdk-Namespace-8859/disasterRecoveryConfig/sdk-DisasterRecovery-3814 
 * ```
 * 
 */
@ResourceType(type="azure-native:eventhub:DisasterRecoveryConfig")
public class DisasterRecoveryConfig extends io.pulumi.resources.CustomResource {
    /**
     * Alternate name specified when alias and namespace names are same.
     * 
     */
    @Export(name="alternateName", type=String.class, parameters={})
    private Output</* @Nullable */ String> alternateName;

    /**
     * @return Alternate name specified when alias and namespace names are same.
     * 
     */
    public Output</* @Nullable */ String> alternateName() {
        return this.alternateName;
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
     * ARM Id of the Primary/Secondary eventhub namespace name, which is part of GEO DR pairing
     * 
     */
    @Export(name="partnerNamespace", type=String.class, parameters={})
    private Output</* @Nullable */ String> partnerNamespace;

    /**
     * @return ARM Id of the Primary/Secondary eventhub namespace name, which is part of GEO DR pairing
     * 
     */
    public Output</* @Nullable */ String> partnerNamespace() {
        return this.partnerNamespace;
    }
    /**
     * Number of entities pending to be replicated.
     * 
     */
    @Export(name="pendingReplicationOperationsCount", type=Double.class, parameters={})
    private Output<Double> pendingReplicationOperationsCount;

    /**
     * @return Number of entities pending to be replicated.
     * 
     */
    public Output<Double> pendingReplicationOperationsCount() {
        return this.pendingReplicationOperationsCount;
    }
    /**
     * Provisioning state of the Alias(Disaster Recovery configuration) - possible values 'Accepted' or 'Succeeded' or 'Failed'
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the Alias(Disaster Recovery configuration) - possible values 'Accepted' or 'Succeeded' or 'Failed'
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * role of namespace in GEO DR - possible values 'Primary' or 'PrimaryNotReplicating' or 'Secondary'
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return role of namespace in GEO DR - possible values 'Primary' or 'PrimaryNotReplicating' or 'Secondary'
     * 
     */
    public Output<String> role() {
        return this.role;
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
    public DisasterRecoveryConfig(String name) {
        this(name, DisasterRecoveryConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DisasterRecoveryConfig(String name, DisasterRecoveryConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DisasterRecoveryConfig(String name, DisasterRecoveryConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventhub:DisasterRecoveryConfig", name, args == null ? DisasterRecoveryConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DisasterRecoveryConfig(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventhub:DisasterRecoveryConfig", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:eventhub/v20170401:DisasterRecoveryConfig").build()),
                Output.of(Alias.builder().type("azure-native:eventhub/v20180101preview:DisasterRecoveryConfig").build()),
                Output.of(Alias.builder().type("azure-native:eventhub/v20210101preview:DisasterRecoveryConfig").build()),
                Output.of(Alias.builder().type("azure-native:eventhub/v20210601preview:DisasterRecoveryConfig").build()),
                Output.of(Alias.builder().type("azure-native:eventhub/v20211101:DisasterRecoveryConfig").build())
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
    public static DisasterRecoveryConfig get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DisasterRecoveryConfig(name, id, options);
    }
}
