// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.InstanceFailoverGroupArgs;
import io.pulumi.azurenative.sql.outputs.InstanceFailoverGroupReadOnlyEndpointResponse;
import io.pulumi.azurenative.sql.outputs.InstanceFailoverGroupReadWriteEndpointResponse;
import io.pulumi.azurenative.sql.outputs.ManagedInstancePairInfoResponse;
import io.pulumi.azurenative.sql.outputs.PartnerRegionInfoResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * An instance failover group.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sql:InstanceFailoverGroup failover-group-test-3 /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/Default/providers/Microsoft.Sql/locations/JapanEast/instanceFailoverGroups/failover-group-test-3 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:InstanceFailoverGroup")
public class InstanceFailoverGroup extends io.pulumi.resources.CustomResource {
    /**
     * List of managed instance pairs in the failover group.
     * 
     */
    @Export(name="managedInstancePairs", type=List.class, parameters={ManagedInstancePairInfoResponse.class})
    private Output<List<ManagedInstancePairInfoResponse>> managedInstancePairs;

    /**
     * @return List of managed instance pairs in the failover group.
     * 
     */
    public Output<List<ManagedInstancePairInfoResponse>> managedInstancePairs() {
        return this.managedInstancePairs;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Partner region information for the failover group.
     * 
     */
    @Export(name="partnerRegions", type=List.class, parameters={PartnerRegionInfoResponse.class})
    private Output<List<PartnerRegionInfoResponse>> partnerRegions;

    /**
     * @return Partner region information for the failover group.
     * 
     */
    public Output<List<PartnerRegionInfoResponse>> partnerRegions() {
        return this.partnerRegions;
    }
    /**
     * Read-only endpoint of the failover group instance.
     * 
     */
    @Export(name="readOnlyEndpoint", type=InstanceFailoverGroupReadOnlyEndpointResponse.class, parameters={})
    private Output</* @Nullable */ InstanceFailoverGroupReadOnlyEndpointResponse> readOnlyEndpoint;

    /**
     * @return Read-only endpoint of the failover group instance.
     * 
     */
    public Output</* @Nullable */ InstanceFailoverGroupReadOnlyEndpointResponse> readOnlyEndpoint() {
        return this.readOnlyEndpoint;
    }
    /**
     * Read-write endpoint of the failover group instance.
     * 
     */
    @Export(name="readWriteEndpoint", type=InstanceFailoverGroupReadWriteEndpointResponse.class, parameters={})
    private Output<InstanceFailoverGroupReadWriteEndpointResponse> readWriteEndpoint;

    /**
     * @return Read-write endpoint of the failover group instance.
     * 
     */
    public Output<InstanceFailoverGroupReadWriteEndpointResponse> readWriteEndpoint() {
        return this.readWriteEndpoint;
    }
    /**
     * Local replication role of the failover group instance.
     * 
     */
    @Export(name="replicationRole", type=String.class, parameters={})
    private Output<String> replicationRole;

    /**
     * @return Local replication role of the failover group instance.
     * 
     */
    public Output<String> replicationRole() {
        return this.replicationRole;
    }
    /**
     * Replication state of the failover group instance.
     * 
     */
    @Export(name="replicationState", type=String.class, parameters={})
    private Output<String> replicationState;

    /**
     * @return Replication state of the failover group instance.
     * 
     */
    public Output<String> replicationState() {
        return this.replicationState;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InstanceFailoverGroup(String name) {
        this(name, InstanceFailoverGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InstanceFailoverGroup(String name, InstanceFailoverGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstanceFailoverGroup(String name, InstanceFailoverGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:InstanceFailoverGroup", name, args == null ? InstanceFailoverGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InstanceFailoverGroup(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:InstanceFailoverGroup", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:sql/v20171001preview:InstanceFailoverGroup").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200202preview:InstanceFailoverGroup").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200801preview:InstanceFailoverGroup").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20201101preview:InstanceFailoverGroup").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210201preview:InstanceFailoverGroup").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210501preview:InstanceFailoverGroup").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210801preview:InstanceFailoverGroup").build())
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
    public static InstanceFailoverGroup get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new InstanceFailoverGroup(name, id, options);
    }
}
