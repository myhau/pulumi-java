// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.aws.ec2.outputs.GetVpcEndpointDnsEntry;
import io.pulumi.aws.ec2.outputs.GetVpcEndpointFilter;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetVpcEndpointResult {
    /**
     * The Amazon Resource Name (ARN) of the VPC endpoint.
     * 
     */
    private final String arn;
    /**
     * The list of CIDR blocks for the exposed AWS service. Applicable for endpoints of type `Gateway`.
     * 
     */
    private final List<String> cidrBlocks;
    /**
     * The DNS entries for the VPC Endpoint. Applicable for endpoints of type `Interface`. DNS blocks are documented below.
     * 
     */
    private final List<GetVpcEndpointDnsEntry> dnsEntries;
    private final @Nullable List<GetVpcEndpointFilter> filters;
    private final String id;
    /**
     * One or more network interfaces for the VPC Endpoint. Applicable for endpoints of type `Interface`.
     * 
     */
    private final List<String> networkInterfaceIds;
    /**
     * The ID of the AWS account that owns the VPC endpoint.
     * 
     */
    private final String ownerId;
    /**
     * The policy document associated with the VPC Endpoint. Applicable for endpoints of type `Gateway`.
     * 
     */
    private final String policy;
    /**
     * The prefix list ID of the exposed AWS service. Applicable for endpoints of type `Gateway`.
     * 
     */
    private final String prefixListId;
    /**
     * Whether or not the VPC is associated with a private hosted zone - `true` or `false`. Applicable for endpoints of type `Interface`.
     * 
     */
    private final Boolean privateDnsEnabled;
    /**
     * Whether or not the VPC Endpoint is being managed by its service - `true` or `false`.
     * 
     */
    private final Boolean requesterManaged;
    /**
     * One or more route tables associated with the VPC Endpoint. Applicable for endpoints of type `Gateway`.
     * 
     */
    private final List<String> routeTableIds;
    /**
     * One or more security groups associated with the network interfaces. Applicable for endpoints of type `Interface`.
     * 
     */
    private final List<String> securityGroupIds;
    private final String serviceName;
    private final String state;
    /**
     * One or more subnets in which the VPC Endpoint is located. Applicable for endpoints of type `Interface`.
     * 
     */
    private final List<String> subnetIds;
    private final Map<String,String> tags;
    /**
     * The VPC Endpoint type, `Gateway` or `Interface`.
     * 
     */
    private final String vpcEndpointType;
    private final String vpcId;

    @OutputCustomType.Constructor({"arn","cidrBlocks","dnsEntries","filters","id","networkInterfaceIds","ownerId","policy","prefixListId","privateDnsEnabled","requesterManaged","routeTableIds","securityGroupIds","serviceName","state","subnetIds","tags","vpcEndpointType","vpcId"})
    private GetVpcEndpointResult(
        String arn,
        List<String> cidrBlocks,
        List<GetVpcEndpointDnsEntry> dnsEntries,
        @Nullable List<GetVpcEndpointFilter> filters,
        String id,
        List<String> networkInterfaceIds,
        String ownerId,
        String policy,
        String prefixListId,
        Boolean privateDnsEnabled,
        Boolean requesterManaged,
        List<String> routeTableIds,
        List<String> securityGroupIds,
        String serviceName,
        String state,
        List<String> subnetIds,
        Map<String,String> tags,
        String vpcEndpointType,
        String vpcId) {
        this.arn = arn;
        this.cidrBlocks = cidrBlocks;
        this.dnsEntries = dnsEntries;
        this.filters = filters;
        this.id = id;
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
        this.vpcEndpointType = vpcEndpointType;
        this.vpcId = vpcId;
    }

    /**
     * The Amazon Resource Name (ARN) of the VPC endpoint.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * The list of CIDR blocks for the exposed AWS service. Applicable for endpoints of type `Gateway`.
     * 
    */
    public List<String> getCidrBlocks() {
        return this.cidrBlocks;
    }
    /**
     * The DNS entries for the VPC Endpoint. Applicable for endpoints of type `Interface`. DNS blocks are documented below.
     * 
    */
    public List<GetVpcEndpointDnsEntry> getDnsEntries() {
        return this.dnsEntries;
    }
    public List<GetVpcEndpointFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }
    public String getId() {
        return this.id;
    }
    /**
     * One or more network interfaces for the VPC Endpoint. Applicable for endpoints of type `Interface`.
     * 
    */
    public List<String> getNetworkInterfaceIds() {
        return this.networkInterfaceIds;
    }
    /**
     * The ID of the AWS account that owns the VPC endpoint.
     * 
    */
    public String getOwnerId() {
        return this.ownerId;
    }
    /**
     * The policy document associated with the VPC Endpoint. Applicable for endpoints of type `Gateway`.
     * 
    */
    public String getPolicy() {
        return this.policy;
    }
    /**
     * The prefix list ID of the exposed AWS service. Applicable for endpoints of type `Gateway`.
     * 
    */
    public String getPrefixListId() {
        return this.prefixListId;
    }
    /**
     * Whether or not the VPC is associated with a private hosted zone - `true` or `false`. Applicable for endpoints of type `Interface`.
     * 
    */
    public Boolean getPrivateDnsEnabled() {
        return this.privateDnsEnabled;
    }
    /**
     * Whether or not the VPC Endpoint is being managed by its service - `true` or `false`.
     * 
    */
    public Boolean getRequesterManaged() {
        return this.requesterManaged;
    }
    /**
     * One or more route tables associated with the VPC Endpoint. Applicable for endpoints of type `Gateway`.
     * 
    */
    public List<String> getRouteTableIds() {
        return this.routeTableIds;
    }
    /**
     * One or more security groups associated with the network interfaces. Applicable for endpoints of type `Interface`.
     * 
    */
    public List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }
    public String getServiceName() {
        return this.serviceName;
    }
    public String getState() {
        return this.state;
    }
    /**
     * One or more subnets in which the VPC Endpoint is located. Applicable for endpoints of type `Interface`.
     * 
    */
    public List<String> getSubnetIds() {
        return this.subnetIds;
    }
    public Map<String,String> getTags() {
        return this.tags;
    }
    /**
     * The VPC Endpoint type, `Gateway` or `Interface`.
     * 
    */
    public String getVpcEndpointType() {
        return this.vpcEndpointType;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcEndpointResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private List<String> cidrBlocks;
        private List<GetVpcEndpointDnsEntry> dnsEntries;
        private @Nullable List<GetVpcEndpointFilter> filters;
        private String id;
        private List<String> networkInterfaceIds;
        private String ownerId;
        private String policy;
        private String prefixListId;
        private Boolean privateDnsEnabled;
        private Boolean requesterManaged;
        private List<String> routeTableIds;
        private List<String> securityGroupIds;
        private String serviceName;
        private String state;
        private List<String> subnetIds;
        private Map<String,String> tags;
        private String vpcEndpointType;
        private String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpcEndpointResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.cidrBlocks = defaults.cidrBlocks;
    	      this.dnsEntries = defaults.dnsEntries;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
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
    	      this.vpcEndpointType = defaults.vpcEndpointType;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setCidrBlocks(List<String> cidrBlocks) {
            this.cidrBlocks = Objects.requireNonNull(cidrBlocks);
            return this;
        }

        public Builder setDnsEntries(List<GetVpcEndpointDnsEntry> dnsEntries) {
            this.dnsEntries = Objects.requireNonNull(dnsEntries);
            return this;
        }

        public Builder setFilters(@Nullable List<GetVpcEndpointFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setNetworkInterfaceIds(List<String> networkInterfaceIds) {
            this.networkInterfaceIds = Objects.requireNonNull(networkInterfaceIds);
            return this;
        }

        public Builder setOwnerId(String ownerId) {
            this.ownerId = Objects.requireNonNull(ownerId);
            return this;
        }

        public Builder setPolicy(String policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }

        public Builder setPrefixListId(String prefixListId) {
            this.prefixListId = Objects.requireNonNull(prefixListId);
            return this;
        }

        public Builder setPrivateDnsEnabled(Boolean privateDnsEnabled) {
            this.privateDnsEnabled = Objects.requireNonNull(privateDnsEnabled);
            return this;
        }

        public Builder setRequesterManaged(Boolean requesterManaged) {
            this.requesterManaged = Objects.requireNonNull(requesterManaged);
            return this;
        }

        public Builder setRouteTableIds(List<String> routeTableIds) {
            this.routeTableIds = Objects.requireNonNull(routeTableIds);
            return this;
        }

        public Builder setSecurityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setSubnetIds(List<String> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setVpcEndpointType(String vpcEndpointType) {
            this.vpcEndpointType = Objects.requireNonNull(vpcEndpointType);
            return this;
        }

        public Builder setVpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public GetVpcEndpointResult build() {
            return new GetVpcEndpointResult(arn, cidrBlocks, dnsEntries, filters, id, networkInterfaceIds, ownerId, policy, prefixListId, privateDnsEnabled, requesterManaged, routeTableIds, securityGroupIds, serviceName, state, subnetIds, tags, vpcEndpointType, vpcId);
        }
    }
}