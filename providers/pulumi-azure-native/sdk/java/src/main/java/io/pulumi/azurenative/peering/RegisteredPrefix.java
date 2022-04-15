// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.peering.RegisteredPrefixArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The customer's prefix that is registered by the peering service provider.
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:peering:RegisteredPrefix registeredPrefixName /subscriptions/subId/resourceGroups/rgName/providers/Microsoft.Peering/peerings/peeringName/registeredPrefixes/registeredPrefixName 
 * ```
 * 
 */
@ResourceType(type="azure-native:peering:RegisteredPrefix")
public class RegisteredPrefix extends io.pulumi.resources.CustomResource {
    /**
     * The error message associated with the validation state, if any.
     * 
     */
    @Export(name="errorMessage", type=String.class, parameters={})
    private Output<String> errorMessage;

    /**
     * @return The error message associated with the validation state, if any.
     * 
     */
    public Output<String> errorMessage() {
        return this.errorMessage;
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
     * The peering service prefix key that is to be shared with the customer.
     * 
     */
    @Export(name="peeringServicePrefixKey", type=String.class, parameters={})
    private Output<String> peeringServicePrefixKey;

    /**
     * @return The peering service prefix key that is to be shared with the customer.
     * 
     */
    public Output<String> peeringServicePrefixKey() {
        return this.peeringServicePrefixKey;
    }
    /**
     * The customer's prefix from which traffic originates.
     * 
     */
    @Export(name="prefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> prefix;

    /**
     * @return The customer's prefix from which traffic originates.
     * 
     */
    public Output</* @Nullable */ String> prefix() {
        return this.prefix;
    }
    /**
     * The prefix validation state.
     * 
     */
    @Export(name="prefixValidationState", type=String.class, parameters={})
    private Output<String> prefixValidationState;

    /**
     * @return The prefix validation state.
     * 
     */
    public Output<String> prefixValidationState() {
        return this.prefixValidationState;
    }
    /**
     * The provisioning state of the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the resource.
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
    public RegisteredPrefix(String name) {
        this(name, RegisteredPrefixArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegisteredPrefix(String name, RegisteredPrefixArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegisteredPrefix(String name, RegisteredPrefixArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:peering:RegisteredPrefix", name, args == null ? RegisteredPrefixArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RegisteredPrefix(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:peering:RegisteredPrefix", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:peering/v20200101preview:RegisteredPrefix").build()),
                Output.of(Alias.builder().type("azure-native:peering/v20200401:RegisteredPrefix").build()),
                Output.of(Alias.builder().type("azure-native:peering/v20201001:RegisteredPrefix").build()),
                Output.of(Alias.builder().type("azure-native:peering/v20210101:RegisteredPrefix").build()),
                Output.of(Alias.builder().type("azure-native:peering/v20210601:RegisteredPrefix").build())
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
    public static RegisteredPrefix get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RegisteredPrefix(name, id, options);
    }
}
