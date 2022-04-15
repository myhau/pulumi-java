// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datacatalog;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datacatalog.ADCCatalogArgs;
import io.pulumi.azurenative.datacatalog.outputs.PrincipalsResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Azure Data Catalog.
 * API Version: 2016-03-30.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:datacatalog:ADCCatalog exampleCatalog /subscriptions/12345678-1234-1234-12345678abc/resourceGroups/exampleResourceGroup/providers/Microsoft.DataCatalog/catalogs/exampleCatalog 
 * ```
 * 
 */
@ResourceType(type="azure-native:datacatalog:ADCCatalog")
public class ADCCatalog extends io.pulumi.resources.CustomResource {
    /**
     * Azure data catalog admin list.
     * 
     */
    @Export(name="admins", type=List.class, parameters={PrincipalsResponse.class})
    private Output</* @Nullable */ List<PrincipalsResponse>> admins;

    /**
     * @return Azure data catalog admin list.
     * 
     */
    public Output</* @Nullable */ List<PrincipalsResponse>> admins() {
        return this.admins;
    }
    /**
     * Automatic unit adjustment enabled or not.
     * 
     */
    @Export(name="enableAutomaticUnitAdjustment", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableAutomaticUnitAdjustment;

    /**
     * @return Automatic unit adjustment enabled or not.
     * 
     */
    public Output</* @Nullable */ Boolean> enableAutomaticUnitAdjustment() {
        return this.enableAutomaticUnitAdjustment;
    }
    /**
     * Resource etag
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return Resource etag
     * 
     */
    public Output</* @Nullable */ String> etag() {
        return this.etag;
    }
    /**
     * Resource location
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location
     * 
     */
    public Output</* @Nullable */ String> location() {
        return this.location;
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
     * Azure data catalog SKU.
     * 
     */
    @Export(name="sku", type=String.class, parameters={})
    private Output</* @Nullable */ String> sku;

    /**
     * @return Azure data catalog SKU.
     * 
     */
    public Output</* @Nullable */ String> sku() {
        return this.sku;
    }
    /**
     * Azure data catalog provision status.
     * 
     */
    @Export(name="successfullyProvisioned", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> successfullyProvisioned;

    /**
     * @return Azure data catalog provision status.
     * 
     */
    public Output</* @Nullable */ Boolean> successfullyProvisioned() {
        return this.successfullyProvisioned;
    }
    /**
     * Resource tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
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
     * Azure data catalog units.
     * 
     */
    @Export(name="units", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> units;

    /**
     * @return Azure data catalog units.
     * 
     */
    public Output</* @Nullable */ Integer> units() {
        return this.units;
    }
    /**
     * Azure data catalog user list.
     * 
     */
    @Export(name="users", type=List.class, parameters={PrincipalsResponse.class})
    private Output</* @Nullable */ List<PrincipalsResponse>> users;

    /**
     * @return Azure data catalog user list.
     * 
     */
    public Output</* @Nullable */ List<PrincipalsResponse>> users() {
        return this.users;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ADCCatalog(String name) {
        this(name, ADCCatalogArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ADCCatalog(String name, ADCCatalogArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ADCCatalog(String name, ADCCatalogArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datacatalog:ADCCatalog", name, args == null ? ADCCatalogArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ADCCatalog(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datacatalog:ADCCatalog", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:datacatalog/v20160330:ADCCatalog").build())
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
    public static ADCCatalog get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ADCCatalog(name, id, options);
    }
}
