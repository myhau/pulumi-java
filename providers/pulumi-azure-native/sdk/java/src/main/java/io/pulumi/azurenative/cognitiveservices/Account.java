// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.cognitiveservices.AccountArgs;
import io.pulumi.azurenative.cognitiveservices.outputs.CognitiveServicesAccountPropertiesResponse;
import io.pulumi.azurenative.cognitiveservices.outputs.IdentityResponse;
import io.pulumi.azurenative.cognitiveservices.outputs.SkuResponse;
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
 * Cognitive Services Account is an Azure resource representing the provisioned account, its type, location and SKU.
 * API Version: 2017-04-18.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:cognitiveservices:Account testCreate1 /subscriptions/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/resourceGroups/myResourceGroup/providers/Microsoft.CognitiveServices/accounts/testCreate1 
 * ```
 * 
 */
@ResourceType(type="azure-native:cognitiveservices:Account")
public class Account extends io.pulumi.resources.CustomResource {
    /**
     * Entity Tag
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Entity Tag
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The identity of Cognitive Services account.
     * 
     */
    @Export(name="identity", type=IdentityResponse.class, parameters={})
    private Output</* @Nullable */ IdentityResponse> identity;

    /**
     * @return The identity of Cognitive Services account.
     * 
     */
    public Output</* @Nullable */ IdentityResponse> identity() {
        return this.identity;
    }
    /**
     * The Kind of the resource.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return The Kind of the resource.
     * 
     */
    public Output</* @Nullable */ String> kind() {
        return this.kind;
    }
    /**
     * The location of the resource
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The location of the resource
     * 
     */
    public Output</* @Nullable */ String> location() {
        return this.location;
    }
    /**
     * The name of the created account
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the created account
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Properties of Cognitive Services account.
     * 
     */
    @Export(name="properties", type=CognitiveServicesAccountPropertiesResponse.class, parameters={})
    private Output<CognitiveServicesAccountPropertiesResponse> properties;

    /**
     * @return Properties of Cognitive Services account.
     * 
     */
    public Output<CognitiveServicesAccountPropertiesResponse> properties() {
        return this.properties;
    }
    /**
     * The SKU of Cognitive Services account.
     * 
     */
    @Export(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    /**
     * @return The SKU of Cognitive Services account.
     * 
     */
    public Output</* @Nullable */ SkuResponse> sku() {
        return this.sku;
    }
    /**
     * Gets or sets a list of key value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Gets or sets a list of key value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
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
    public Account(String name) {
        this(name, AccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Account(String name, AccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Account(String name, AccountArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cognitiveservices:Account", name, args == null ? AccountArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Account(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cognitiveservices:Account", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:cognitiveservices/v20160201preview:Account").build()),
                Output.of(Alias.builder().type("azure-native:cognitiveservices/v20170418:Account").build()),
                Output.of(Alias.builder().type("azure-native:cognitiveservices/v20210430:Account").build()),
                Output.of(Alias.builder().type("azure-native:cognitiveservices/v20211001:Account").build())
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
    public static Account get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Account(name, id, options);
    }
}
