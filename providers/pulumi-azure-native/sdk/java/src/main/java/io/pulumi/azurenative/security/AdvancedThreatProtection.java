// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.security.AdvancedThreatProtectionArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The Advanced Threat Protection resource.
 * API Version: 2019-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:security:AdvancedThreatProtection current /subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23/resourceGroups/SampleRG/providers/Microsoft.Storage/storageAccounts/samplestorageaccount/providers/Microsoft.Security/advancedThreatProtectionSettings/current 
 * ```
 * 
 */
@ResourceType(type="azure-native:security:AdvancedThreatProtection")
public class AdvancedThreatProtection extends io.pulumi.resources.CustomResource {
    /**
     * Indicates whether Advanced Threat Protection is enabled.
     * 
     */
    @Export(name="isEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isEnabled;

    /**
     * @return Indicates whether Advanced Threat Protection is enabled.
     * 
     */
    public Output</* @Nullable */ Boolean> isEnabled() {
        return this.isEnabled;
    }
    /**
     * Resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AdvancedThreatProtection(String name) {
        this(name, AdvancedThreatProtectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AdvancedThreatProtection(String name, AdvancedThreatProtectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AdvancedThreatProtection(String name, AdvancedThreatProtectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:security:AdvancedThreatProtection", name, args == null ? AdvancedThreatProtectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AdvancedThreatProtection(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:security:AdvancedThreatProtection", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:security/v20170801preview:AdvancedThreatProtection").build()),
                Output.of(Alias.builder().type("azure-native:security/v20190101:AdvancedThreatProtection").build())
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
    public static AdvancedThreatProtection get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AdvancedThreatProtection(name, id, options);
    }
}
