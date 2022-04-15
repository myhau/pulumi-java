// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.batch.ApplicationArgs;
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
 * Contains information about an application in a Batch account.
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:batch:Application app1 /subscriptions/subid/resourceGroups/default-azurebatch-japaneast/providers/Microsoft.Batch/batchAccounts/sampleacct/applications/app1 
 * ```
 * 
 */
@ResourceType(type="azure-native:batch:Application")
public class Application extends io.pulumi.resources.CustomResource {
    /**
     * A value indicating whether packages within the application may be overwritten using the same version string.
     * 
     */
    @Export(name="allowUpdates", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowUpdates;

    /**
     * @return A value indicating whether packages within the application may be overwritten using the same version string.
     * 
     */
    public Output</* @Nullable */ Boolean> allowUpdates() {
        return this.allowUpdates;
    }
    /**
     * The package to use if a client requests the application but does not specify a version. This property can only be set to the name of an existing package.
     * 
     */
    @Export(name="defaultVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultVersion;

    /**
     * @return The package to use if a client requests the application but does not specify a version. This property can only be set to the name of an existing package.
     * 
     */
    public Output</* @Nullable */ String> defaultVersion() {
        return this.defaultVersion;
    }
    /**
     * The display name for the application.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return The display name for the application.
     * 
     */
    public Output</* @Nullable */ String> displayName() {
        return this.displayName;
    }
    /**
     * The ETag of the resource, used for concurrency statements.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return The ETag of the resource, used for concurrency statements.
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
    public Application(String name) {
        this(name, ApplicationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Application(String name, ApplicationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Application(String name, ApplicationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:batch:Application", name, args == null ? ApplicationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Application(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:batch:Application", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:batch/v20151201:Application").build()),
                Output.of(Alias.builder().type("azure-native:batch/v20170101:Application").build()),
                Output.of(Alias.builder().type("azure-native:batch/v20170501:Application").build()),
                Output.of(Alias.builder().type("azure-native:batch/v20170901:Application").build()),
                Output.of(Alias.builder().type("azure-native:batch/v20181201:Application").build()),
                Output.of(Alias.builder().type("azure-native:batch/v20190401:Application").build()),
                Output.of(Alias.builder().type("azure-native:batch/v20190801:Application").build()),
                Output.of(Alias.builder().type("azure-native:batch/v20200301:Application").build()),
                Output.of(Alias.builder().type("azure-native:batch/v20200501:Application").build()),
                Output.of(Alias.builder().type("azure-native:batch/v20200901:Application").build()),
                Output.of(Alias.builder().type("azure-native:batch/v20210101:Application").build()),
                Output.of(Alias.builder().type("azure-native:batch/v20210601:Application").build())
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
    public static Application get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Application(name, id, options);
    }
}
