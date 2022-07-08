// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute.alpha.enums.PacketMirroringEnable;
import com.pulumi.googlenative.compute.alpha.inputs.PacketMirroringFilterArgs;
import com.pulumi.googlenative.compute.alpha.inputs.PacketMirroringForwardingRuleInfoArgs;
import com.pulumi.googlenative.compute.alpha.inputs.PacketMirroringMirroredResourceInfoArgs;
import com.pulumi.googlenative.compute.alpha.inputs.PacketMirroringNetworkInfoArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PacketMirroringArgs extends com.pulumi.resources.ResourceArgs {

    public static final PacketMirroringArgs Empty = new PacketMirroringArgs();

    /**
     * The Forwarding Rule resource of type loadBalancingScheme=INTERNAL that will be used as collector for mirrored traffic. The specified forwarding rule must have isMirroringCollector set to true.
     * 
     */
    @Import(name="collectorIlb")
    private @Nullable Output<PacketMirroringForwardingRuleInfoArgs> collectorIlb;

    /**
     * @return The Forwarding Rule resource of type loadBalancingScheme=INTERNAL that will be used as collector for mirrored traffic. The specified forwarding rule must have isMirroringCollector set to true.
     * 
     */
    public Optional<Output<PacketMirroringForwardingRuleInfoArgs>> collectorIlb() {
        return Optional.ofNullable(this.collectorIlb);
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Indicates whether or not this packet mirroring takes effect. If set to FALSE, this packet mirroring policy will not be enforced on the network. The default is TRUE.
     * 
     */
    @Import(name="enable")
    private @Nullable Output<PacketMirroringEnable> enable;

    /**
     * @return Indicates whether or not this packet mirroring takes effect. If set to FALSE, this packet mirroring policy will not be enforced on the network. The default is TRUE.
     * 
     */
    public Optional<Output<PacketMirroringEnable>> enable() {
        return Optional.ofNullable(this.enable);
    }

    /**
     * Filter for mirrored traffic. If unspecified, all traffic is mirrored.
     * 
     */
    @Import(name="filter")
    private @Nullable Output<PacketMirroringFilterArgs> filter;

    /**
     * @return Filter for mirrored traffic. If unspecified, all traffic is mirrored.
     * 
     */
    public Optional<Output<PacketMirroringFilterArgs>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * PacketMirroring mirroredResourceInfos. MirroredResourceInfo specifies a set of mirrored VM instances, subnetworks and/or tags for which traffic from/to all VM instances will be mirrored.
     * 
     */
    @Import(name="mirroredResources")
    private @Nullable Output<PacketMirroringMirroredResourceInfoArgs> mirroredResources;

    /**
     * @return PacketMirroring mirroredResourceInfos. MirroredResourceInfo specifies a set of mirrored VM instances, subnetworks and/or tags for which traffic from/to all VM instances will be mirrored.
     * 
     */
    public Optional<Output<PacketMirroringMirroredResourceInfoArgs>> mirroredResources() {
        return Optional.ofNullable(this.mirroredResources);
    }

    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the mirrored VPC network. Only packets in this network will be mirrored. All mirrored VMs should have a NIC in the given network. All mirrored subnetworks should belong to the given network.
     * 
     */
    @Import(name="network")
    private @Nullable Output<PacketMirroringNetworkInfoArgs> network;

    /**
     * @return Specifies the mirrored VPC network. Only packets in this network will be mirrored. All mirrored VMs should have a NIC in the given network. All mirrored subnetworks should belong to the given network.
     * 
     */
    public Optional<Output<PacketMirroringNetworkInfoArgs>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * The priority of applying this configuration. Priority is used to break ties in cases where there is more than one matching rule. In the case of two rules that apply for a given Instance, the one with the lowest-numbered priority value wins. Default value is 1000. Valid range is 0 through 65535.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return The priority of applying this configuration. Priority is used to break ties in cases where there is more than one matching rule. In the case of two rules that apply for a given Instance, the one with the lowest-numbered priority value wins. Default value is 1000. Valid range is 0 through 65535.
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    /**
     * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
     * 
     */
    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    /**
     * @return An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
     * 
     */
    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    private PacketMirroringArgs() {}

    private PacketMirroringArgs(PacketMirroringArgs $) {
        this.collectorIlb = $.collectorIlb;
        this.description = $.description;
        this.enable = $.enable;
        this.filter = $.filter;
        this.mirroredResources = $.mirroredResources;
        this.name = $.name;
        this.network = $.network;
        this.priority = $.priority;
        this.project = $.project;
        this.region = $.region;
        this.requestId = $.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PacketMirroringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PacketMirroringArgs $;

        public Builder() {
            $ = new PacketMirroringArgs();
        }

        public Builder(PacketMirroringArgs defaults) {
            $ = new PacketMirroringArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param collectorIlb The Forwarding Rule resource of type loadBalancingScheme=INTERNAL that will be used as collector for mirrored traffic. The specified forwarding rule must have isMirroringCollector set to true.
         * 
         * @return builder
         * 
         */
        public Builder collectorIlb(@Nullable Output<PacketMirroringForwardingRuleInfoArgs> collectorIlb) {
            $.collectorIlb = collectorIlb;
            return this;
        }

        /**
         * @param collectorIlb The Forwarding Rule resource of type loadBalancingScheme=INTERNAL that will be used as collector for mirrored traffic. The specified forwarding rule must have isMirroringCollector set to true.
         * 
         * @return builder
         * 
         */
        public Builder collectorIlb(PacketMirroringForwardingRuleInfoArgs collectorIlb) {
            return collectorIlb(Output.of(collectorIlb));
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enable Indicates whether or not this packet mirroring takes effect. If set to FALSE, this packet mirroring policy will not be enforced on the network. The default is TRUE.
         * 
         * @return builder
         * 
         */
        public Builder enable(@Nullable Output<PacketMirroringEnable> enable) {
            $.enable = enable;
            return this;
        }

        /**
         * @param enable Indicates whether or not this packet mirroring takes effect. If set to FALSE, this packet mirroring policy will not be enforced on the network. The default is TRUE.
         * 
         * @return builder
         * 
         */
        public Builder enable(PacketMirroringEnable enable) {
            return enable(Output.of(enable));
        }

        /**
         * @param filter Filter for mirrored traffic. If unspecified, all traffic is mirrored.
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable Output<PacketMirroringFilterArgs> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter Filter for mirrored traffic. If unspecified, all traffic is mirrored.
         * 
         * @return builder
         * 
         */
        public Builder filter(PacketMirroringFilterArgs filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param mirroredResources PacketMirroring mirroredResourceInfos. MirroredResourceInfo specifies a set of mirrored VM instances, subnetworks and/or tags for which traffic from/to all VM instances will be mirrored.
         * 
         * @return builder
         * 
         */
        public Builder mirroredResources(@Nullable Output<PacketMirroringMirroredResourceInfoArgs> mirroredResources) {
            $.mirroredResources = mirroredResources;
            return this;
        }

        /**
         * @param mirroredResources PacketMirroring mirroredResourceInfos. MirroredResourceInfo specifies a set of mirrored VM instances, subnetworks and/or tags for which traffic from/to all VM instances will be mirrored.
         * 
         * @return builder
         * 
         */
        public Builder mirroredResources(PacketMirroringMirroredResourceInfoArgs mirroredResources) {
            return mirroredResources(Output.of(mirroredResources));
        }

        /**
         * @param name Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param network Specifies the mirrored VPC network. Only packets in this network will be mirrored. All mirrored VMs should have a NIC in the given network. All mirrored subnetworks should belong to the given network.
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<PacketMirroringNetworkInfoArgs> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network Specifies the mirrored VPC network. Only packets in this network will be mirrored. All mirrored VMs should have a NIC in the given network. All mirrored subnetworks should belong to the given network.
         * 
         * @return builder
         * 
         */
        public Builder network(PacketMirroringNetworkInfoArgs network) {
            return network(Output.of(network));
        }

        /**
         * @param priority The priority of applying this configuration. Priority is used to break ties in cases where there is more than one matching rule. In the case of two rules that apply for a given Instance, the one with the lowest-numbered priority value wins. Default value is 1000. Valid range is 0 through 65535.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority The priority of applying this configuration. Priority is used to break ties in cases where there is more than one matching rule. In the case of two rules that apply for a given Instance, the one with the lowest-numbered priority value wins. Default value is 1000. Valid range is 0 through 65535.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        /**
         * @param requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        public PacketMirroringArgs build() {
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
