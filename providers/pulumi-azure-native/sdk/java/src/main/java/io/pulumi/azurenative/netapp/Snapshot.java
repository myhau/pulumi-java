// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.netapp.SnapshotArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Snapshot of a Volume
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:netapp:Snapshot account1/pool1/volume1/snapshot1 /subscriptions/D633CC2E-722B-4AE1-B636-BBD9E4C60ED9/resourceGroups/myRG/providers/Microsoft.NetApp/netAppAccounts/account1/capacityPools/pool1/volumes/volume1/snapshots/snapshot1 
 * ```
 * 
 */
@ResourceType(type="azure-native:netapp:Snapshot")
public class Snapshot extends io.pulumi.resources.CustomResource {
    /**
     * The creation date of the snapshot
     * 
     */
    @Export(name="created", type=String.class, parameters={})
    private Output<String> created;

    /**
     * @return The creation date of the snapshot
     * 
     */
    public Output<String> created() {
        return this.created;
    }
    /**
     * Resource location
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> location() {
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
     * Azure lifecycle management
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Azure lifecycle management
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * UUID v4 used to identify the Snapshot
     * 
     */
    @Export(name="snapshotId", type=String.class, parameters={})
    private Output<String> snapshotId;

    /**
     * @return UUID v4 used to identify the Snapshot
     * 
     */
    public Output<String> snapshotId() {
        return this.snapshotId;
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
    public Snapshot(String name) {
        this(name, SnapshotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Snapshot(String name, SnapshotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Snapshot(String name, SnapshotArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:netapp:Snapshot", name, args == null ? SnapshotArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Snapshot(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:netapp:Snapshot", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:netapp/v20170815:Snapshot").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20190501:Snapshot").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20190601:Snapshot").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20190701:Snapshot").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20190801:Snapshot").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20191001:Snapshot").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20191101:Snapshot").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20200201:Snapshot").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20200301:Snapshot").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20200501:Snapshot").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20200601:Snapshot").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20200701:Snapshot").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20200801:Snapshot").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20200901:Snapshot").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20201101:Snapshot").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20201201:Snapshot").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20210201:Snapshot").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20210401:Snapshot").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20210401preview:Snapshot").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20210601:Snapshot").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20210801:Snapshot").build())
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
    public static Snapshot get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Snapshot(name, id, options);
    }
}
