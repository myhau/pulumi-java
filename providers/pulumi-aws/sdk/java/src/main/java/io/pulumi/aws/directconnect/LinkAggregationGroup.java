// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directconnect;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.directconnect.LinkAggregationGroupArgs;
import io.pulumi.aws.directconnect.inputs.LinkAggregationGroupState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Direct Connect LAG. Connections can be added to the LAG via the `aws.directconnect.Connection` and `aws.directconnect.ConnectionAssociation` resources.
 * 
 * > *NOTE:* When creating a LAG, if no existing connection is specified, Direct Connect will create a connection and this provider will remove this unmanaged connection during resource creation.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Direct Connect LAGs can be imported using the `lag id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:directconnect/linkAggregationGroup:LinkAggregationGroup test_lag dxlag-fgnsp5rq
 * ```
 * 
 */
@ResourceType(type="aws:directconnect/linkAggregationGroup:LinkAggregationGroup")
public class LinkAggregationGroup extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the LAG.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the LAG.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The ID of an existing dedicated connection to migrate to the LAG.
     * 
     */
    @OutputExport(name="connectionId", type=String.class, parameters={})
    private Output</* @Nullable */ String> connectionId;

    /**
     * @return The ID of an existing dedicated connection to migrate to the LAG.
     * 
     */
    public Output</* @Nullable */ String> getConnectionId() {
        return this.connectionId;
    }
    /**
     * The bandwidth of the individual physical connections bundled by the LAG. Valid values: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, 10Gbps and 100Gbps. Case sensitive.
     * 
     */
    @OutputExport(name="connectionsBandwidth", type=String.class, parameters={})
    private Output<String> connectionsBandwidth;

    /**
     * @return The bandwidth of the individual physical connections bundled by the LAG. Valid values: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, 10Gbps and 100Gbps. Case sensitive.
     * 
     */
    public Output<String> getConnectionsBandwidth() {
        return this.connectionsBandwidth;
    }
    /**
     * A boolean that indicates all connections associated with the LAG should be deleted so that the LAG can be destroyed without error. These objects are *not* recoverable.
     * 
     */
    @OutputExport(name="forceDestroy", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceDestroy;

    /**
     * @return A boolean that indicates all connections associated with the LAG should be deleted so that the LAG can be destroyed without error. These objects are *not* recoverable.
     * 
     */
    public Output</* @Nullable */ Boolean> getForceDestroy() {
        return this.forceDestroy;
    }
    /**
     * Indicates whether the LAG supports a secondary BGP peer in the same address family (IPv4/IPv6).
     * 
     */
    @OutputExport(name="hasLogicalRedundancy", type=String.class, parameters={})
    private Output<String> hasLogicalRedundancy;

    /**
     * @return Indicates whether the LAG supports a secondary BGP peer in the same address family (IPv4/IPv6).
     * 
     */
    public Output<String> getHasLogicalRedundancy() {
        return this.hasLogicalRedundancy;
    }
    @OutputExport(name="jumboFrameCapable", type=Boolean.class, parameters={})
    private Output<Boolean> jumboFrameCapable;

    public Output<Boolean> getJumboFrameCapable() {
        return this.jumboFrameCapable;
    }
    /**
     * The AWS Direct Connect location in which the LAG should be allocated. See [DescribeLocations](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeLocations.html) for the list of AWS Direct Connect locations. Use `locationCode`.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The AWS Direct Connect location in which the LAG should be allocated. See [DescribeLocations](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeLocations.html) for the list of AWS Direct Connect locations. Use `locationCode`.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The name of the LAG.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the LAG.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ID of the AWS account that owns the LAG.
     * 
     */
    @OutputExport(name="ownerAccountId", type=String.class, parameters={})
    private Output<String> ownerAccountId;

    /**
     * @return The ID of the AWS account that owns the LAG.
     * 
     */
    public Output<String> getOwnerAccountId() {
        return this.ownerAccountId;
    }
    /**
     * The name of the service provider associated with the LAG.
     * 
     */
    @OutputExport(name="providerName", type=String.class, parameters={})
    private Output<String> providerName;

    /**
     * @return The name of the service provider associated with the LAG.
     * 
     */
    public Output<String> getProviderName() {
        return this.providerName;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LinkAggregationGroup(String name) {
        this(name, LinkAggregationGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LinkAggregationGroup(String name, LinkAggregationGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LinkAggregationGroup(String name, LinkAggregationGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:directconnect/linkAggregationGroup:LinkAggregationGroup", name, args == null ? LinkAggregationGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private LinkAggregationGroup(String name, Input<String> id, @Nullable LinkAggregationGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:directconnect/linkAggregationGroup:LinkAggregationGroup", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static LinkAggregationGroup get(String name, Input<String> id, @Nullable LinkAggregationGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LinkAggregationGroup(name, id, state, options);
    }
}
