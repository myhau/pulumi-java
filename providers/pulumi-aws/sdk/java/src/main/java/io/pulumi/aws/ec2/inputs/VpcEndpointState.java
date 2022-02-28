// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.VpcEndpointDnsEntryGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpcEndpointState extends io.pulumi.resources.ResourceArgs {

    public static final VpcEndpointState Empty = new VpcEndpointState();

    /**
     * The Amazon Resource Name (ARN) of the VPC endpoint.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Accept the VPC endpoint (the VPC endpoint and service need to be in the same AWS account).
     * 
     */
    @InputImport(name="autoAccept")
      private final @Nullable Input<Boolean> autoAccept;

    public Input<Boolean> getAutoAccept() {
        return this.autoAccept == null ? Input.empty() : this.autoAccept;
    }

    /**
     * The list of CIDR blocks for the exposed AWS service. Applicable for endpoints of type `Gateway`.
     * 
     */
    @InputImport(name="cidrBlocks")
      private final @Nullable Input<List<String>> cidrBlocks;

    public Input<List<String>> getCidrBlocks() {
        return this.cidrBlocks == null ? Input.empty() : this.cidrBlocks;
    }

    /**
     * The DNS entries for the VPC Endpoint. Applicable for endpoints of type `Interface`. DNS blocks are documented below.
     * 
     */
    @InputImport(name="dnsEntries")
      private final @Nullable Input<List<VpcEndpointDnsEntryGetArgs>> dnsEntries;

    public Input<List<VpcEndpointDnsEntryGetArgs>> getDnsEntries() {
        return this.dnsEntries == null ? Input.empty() : this.dnsEntries;
    }

    /**
     * One or more network interfaces for the VPC Endpoint. Applicable for endpoints of type `Interface`.
     * 
     */
    @InputImport(name="networkInterfaceIds")
      private final @Nullable Input<List<String>> networkInterfaceIds;

    public Input<List<String>> getNetworkInterfaceIds() {
        return this.networkInterfaceIds == null ? Input.empty() : this.networkInterfaceIds;
    }

    /**
     * The ID of the AWS account that owns the VPC endpoint.
     * 
     */
    @InputImport(name="ownerId")
      private final @Nullable Input<String> ownerId;

    public Input<String> getOwnerId() {
        return this.ownerId == null ? Input.empty() : this.ownerId;
    }

    /**
     * A policy to attach to the endpoint that controls access to the service. This is a JSON formatted string. Defaults to full access. All `Gateway` and some `Interface` endpoints support policies - see the [relevant AWS documentation](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-endpoints-access.html) for more details.
     * 
     */
    @InputImport(name="policy")
      private final @Nullable Input<String> policy;

    public Input<String> getPolicy() {
        return this.policy == null ? Input.empty() : this.policy;
    }

    /**
     * The prefix list ID of the exposed AWS service. Applicable for endpoints of type `Gateway`.
     * 
     */
    @InputImport(name="prefixListId")
      private final @Nullable Input<String> prefixListId;

    public Input<String> getPrefixListId() {
        return this.prefixListId == null ? Input.empty() : this.prefixListId;
    }

    /**
     * Whether or not to associate a private hosted zone with the specified VPC. Applicable for endpoints of type `Interface`.
     * Defaults to `false`.
     * 
     */
    @InputImport(name="privateDnsEnabled")
      private final @Nullable Input<Boolean> privateDnsEnabled;

    public Input<Boolean> getPrivateDnsEnabled() {
        return this.privateDnsEnabled == null ? Input.empty() : this.privateDnsEnabled;
    }

    /**
     * Whether or not the VPC Endpoint is being managed by its service - `true` or `false`.
     * 
     */
    @InputImport(name="requesterManaged")
      private final @Nullable Input<Boolean> requesterManaged;

    public Input<Boolean> getRequesterManaged() {
        return this.requesterManaged == null ? Input.empty() : this.requesterManaged;
    }

    /**
     * One or more route table IDs. Applicable for endpoints of type `Gateway`.
     * 
     */
    @InputImport(name="routeTableIds")
      private final @Nullable Input<List<String>> routeTableIds;

    public Input<List<String>> getRouteTableIds() {
        return this.routeTableIds == null ? Input.empty() : this.routeTableIds;
    }

    /**
     * The ID of one or more security groups to associate with the network interface. Required for endpoints of type `Interface`.
     * 
     */
    @InputImport(name="securityGroupIds")
      private final @Nullable Input<List<String>> securityGroupIds;

    public Input<List<String>> getSecurityGroupIds() {
        return this.securityGroupIds == null ? Input.empty() : this.securityGroupIds;
    }

    /**
     * The service name. For AWS services the service name is usually in the form `com.amazonaws.<region>.<service>` (the SageMaker Notebook service is an exception to this rule, the service name is in the form `aws.sagemaker.<region>.notebook`).
     * 
     */
    @InputImport(name="serviceName")
      private final @Nullable Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName == null ? Input.empty() : this.serviceName;
    }

    /**
     * The state of the VPC endpoint.
     * 
     */
    @InputImport(name="state")
      private final @Nullable Input<String> state;

    public Input<String> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    /**
     * The ID of one or more subnets in which to create a network interface for the endpoint. Applicable for endpoints of type `GatewayLoadBalancer` and `Interface`.
     * 
     */
    @InputImport(name="subnetIds")
      private final @Nullable Input<List<String>> subnetIds;

    public Input<List<String>> getSubnetIds() {
        return this.subnetIds == null ? Input.empty() : this.subnetIds;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * The VPC endpoint type, `Gateway`, `GatewayLoadBalancer`, or `Interface`. Defaults to `Gateway`.
     * 
     */
    @InputImport(name="vpcEndpointType")
      private final @Nullable Input<String> vpcEndpointType;

    public Input<String> getVpcEndpointType() {
        return this.vpcEndpointType == null ? Input.empty() : this.vpcEndpointType;
    }

    /**
     * The ID of the VPC in which the endpoint will be used.
     * 
     */
    @InputImport(name="vpcId")
      private final @Nullable Input<String> vpcId;

    public Input<String> getVpcId() {
        return this.vpcId == null ? Input.empty() : this.vpcId;
    }

    public VpcEndpointState(
        @Nullable Input<String> arn,
        @Nullable Input<Boolean> autoAccept,
        @Nullable Input<List<String>> cidrBlocks,
        @Nullable Input<List<VpcEndpointDnsEntryGetArgs>> dnsEntries,
        @Nullable Input<List<String>> networkInterfaceIds,
        @Nullable Input<String> ownerId,
        @Nullable Input<String> policy,
        @Nullable Input<String> prefixListId,
        @Nullable Input<Boolean> privateDnsEnabled,
        @Nullable Input<Boolean> requesterManaged,
        @Nullable Input<List<String>> routeTableIds,
        @Nullable Input<List<String>> securityGroupIds,
        @Nullable Input<String> serviceName,
        @Nullable Input<String> state,
        @Nullable Input<List<String>> subnetIds,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> vpcEndpointType,
        @Nullable Input<String> vpcId) {
        this.arn = arn;
        this.autoAccept = autoAccept;
        this.cidrBlocks = cidrBlocks;
        this.dnsEntries = dnsEntries;
        this.networkInterfaceIds = networkInterfaceIds;
        this.ownerId = ownerId;
        this.policy = policy;
        this.prefixListId = prefixListId;
        this.privateDnsEnabled = privateDnsEnabled;
        this.requesterManaged = requesterManaged;
        this.routeTableIds = routeTableIds;
        this.securityGroupIds = securityGroupIds;
        this.serviceName = serviceName;
        this.state = state;
        this.subnetIds = subnetIds;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.vpcEndpointType = vpcEndpointType;
        this.vpcId = vpcId;
    }

    private VpcEndpointState() {
        this.arn = Input.empty();
        this.autoAccept = Input.empty();
        this.cidrBlocks = Input.empty();
        this.dnsEntries = Input.empty();
        this.networkInterfaceIds = Input.empty();
        this.ownerId = Input.empty();
        this.policy = Input.empty();
        this.prefixListId = Input.empty();
        this.privateDnsEnabled = Input.empty();
        this.requesterManaged = Input.empty();
        this.routeTableIds = Input.empty();
        this.securityGroupIds = Input.empty();
        this.serviceName = Input.empty();
        this.state = Input.empty();
        this.subnetIds = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.vpcEndpointType = Input.empty();
        this.vpcId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcEndpointState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<Boolean> autoAccept;
        private @Nullable Input<List<String>> cidrBlocks;
        private @Nullable Input<List<VpcEndpointDnsEntryGetArgs>> dnsEntries;
        private @Nullable Input<List<String>> networkInterfaceIds;
        private @Nullable Input<String> ownerId;
        private @Nullable Input<String> policy;
        private @Nullable Input<String> prefixListId;
        private @Nullable Input<Boolean> privateDnsEnabled;
        private @Nullable Input<Boolean> requesterManaged;
        private @Nullable Input<List<String>> routeTableIds;
        private @Nullable Input<List<String>> securityGroupIds;
        private @Nullable Input<String> serviceName;
        private @Nullable Input<String> state;
        private @Nullable Input<List<String>> subnetIds;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> vpcEndpointType;
        private @Nullable Input<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcEndpointState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.autoAccept = defaults.autoAccept;
    	      this.cidrBlocks = defaults.cidrBlocks;
    	      this.dnsEntries = defaults.dnsEntries;
    	      this.networkInterfaceIds = defaults.networkInterfaceIds;
    	      this.ownerId = defaults.ownerId;
    	      this.policy = defaults.policy;
    	      this.prefixListId = defaults.prefixListId;
    	      this.privateDnsEnabled = defaults.privateDnsEnabled;
    	      this.requesterManaged = defaults.requesterManaged;
    	      this.routeTableIds = defaults.routeTableIds;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.serviceName = defaults.serviceName;
    	      this.state = defaults.state;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.vpcEndpointType = defaults.vpcEndpointType;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setAutoAccept(@Nullable Input<Boolean> autoAccept) {
            this.autoAccept = autoAccept;
            return this;
        }

        public Builder setAutoAccept(@Nullable Boolean autoAccept) {
            this.autoAccept = Input.ofNullable(autoAccept);
            return this;
        }

        public Builder setCidrBlocks(@Nullable Input<List<String>> cidrBlocks) {
            this.cidrBlocks = cidrBlocks;
            return this;
        }

        public Builder setCidrBlocks(@Nullable List<String> cidrBlocks) {
            this.cidrBlocks = Input.ofNullable(cidrBlocks);
            return this;
        }

        public Builder setDnsEntries(@Nullable Input<List<VpcEndpointDnsEntryGetArgs>> dnsEntries) {
            this.dnsEntries = dnsEntries;
            return this;
        }

        public Builder setDnsEntries(@Nullable List<VpcEndpointDnsEntryGetArgs> dnsEntries) {
            this.dnsEntries = Input.ofNullable(dnsEntries);
            return this;
        }

        public Builder setNetworkInterfaceIds(@Nullable Input<List<String>> networkInterfaceIds) {
            this.networkInterfaceIds = networkInterfaceIds;
            return this;
        }

        public Builder setNetworkInterfaceIds(@Nullable List<String> networkInterfaceIds) {
            this.networkInterfaceIds = Input.ofNullable(networkInterfaceIds);
            return this;
        }

        public Builder setOwnerId(@Nullable Input<String> ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder setOwnerId(@Nullable String ownerId) {
            this.ownerId = Input.ofNullable(ownerId);
            return this;
        }

        public Builder setPolicy(@Nullable Input<String> policy) {
            this.policy = policy;
            return this;
        }

        public Builder setPolicy(@Nullable String policy) {
            this.policy = Input.ofNullable(policy);
            return this;
        }

        public Builder setPrefixListId(@Nullable Input<String> prefixListId) {
            this.prefixListId = prefixListId;
            return this;
        }

        public Builder setPrefixListId(@Nullable String prefixListId) {
            this.prefixListId = Input.ofNullable(prefixListId);
            return this;
        }

        public Builder setPrivateDnsEnabled(@Nullable Input<Boolean> privateDnsEnabled) {
            this.privateDnsEnabled = privateDnsEnabled;
            return this;
        }

        public Builder setPrivateDnsEnabled(@Nullable Boolean privateDnsEnabled) {
            this.privateDnsEnabled = Input.ofNullable(privateDnsEnabled);
            return this;
        }

        public Builder setRequesterManaged(@Nullable Input<Boolean> requesterManaged) {
            this.requesterManaged = requesterManaged;
            return this;
        }

        public Builder setRequesterManaged(@Nullable Boolean requesterManaged) {
            this.requesterManaged = Input.ofNullable(requesterManaged);
            return this;
        }

        public Builder setRouteTableIds(@Nullable Input<List<String>> routeTableIds) {
            this.routeTableIds = routeTableIds;
            return this;
        }

        public Builder setRouteTableIds(@Nullable List<String> routeTableIds) {
            this.routeTableIds = Input.ofNullable(routeTableIds);
            return this;
        }

        public Builder setSecurityGroupIds(@Nullable Input<List<String>> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        public Builder setSecurityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = Input.ofNullable(securityGroupIds);
            return this;
        }

        public Builder setServiceName(@Nullable Input<String> serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        public Builder setServiceName(@Nullable String serviceName) {
            this.serviceName = Input.ofNullable(serviceName);
            return this;
        }

        public Builder setState(@Nullable Input<String> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Builder setSubnetIds(@Nullable Input<List<String>> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }

        public Builder setSubnetIds(@Nullable List<String> subnetIds) {
            this.subnetIds = Input.ofNullable(subnetIds);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder setVpcEndpointType(@Nullable Input<String> vpcEndpointType) {
            this.vpcEndpointType = vpcEndpointType;
            return this;
        }

        public Builder setVpcEndpointType(@Nullable String vpcEndpointType) {
            this.vpcEndpointType = Input.ofNullable(vpcEndpointType);
            return this;
        }

        public Builder setVpcId(@Nullable Input<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public Builder setVpcId(@Nullable String vpcId) {
            this.vpcId = Input.ofNullable(vpcId);
            return this;
        }
        public VpcEndpointState build() {
            return new VpcEndpointState(arn, autoAccept, cidrBlocks, dnsEntries, networkInterfaceIds, ownerId, policy, prefixListId, privateDnsEnabled, requesterManaged, routeTableIds, securityGroupIds, serviceName, state, subnetIds, tags, tagsAll, vpcEndpointType, vpcId);
        }
    }
}
