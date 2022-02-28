// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.aws.ec2.outputs.GetNetworkInterfaceAssociation;
import io.pulumi.aws.ec2.outputs.GetNetworkInterfaceAttachment;
import io.pulumi.aws.ec2.outputs.GetNetworkInterfaceFilter;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetNetworkInterfaceResult {
    /**
     * The ARN of the network interface.
     * 
     */
    private final String arn;
    /**
     * The association information for an Elastic IP address (IPv4) associated with the network interface. See supported fields below.
     * 
     */
    private final List<GetNetworkInterfaceAssociation> associations;
    private final List<GetNetworkInterfaceAttachment> attachments;
    /**
     * The Availability Zone.
     * 
     */
    private final String availabilityZone;
    /**
     * Description of the network interface.
     * 
     */
    private final String description;
    private final @Nullable List<GetNetworkInterfaceFilter> filters;
    private final String id;
    /**
     * The type of interface.
     * 
     */
    private final String interfaceType;
    /**
     * List of IPv6 addresses to assign to the ENI.
     * 
     */
    private final List<String> ipv6Addresses;
    /**
     * The MAC address.
     * 
     */
    private final String macAddress;
    /**
     * The Amazon Resource Name (ARN) of the Outpost.
     * 
     */
    private final String outpostArn;
    /**
     * The AWS account ID of the owner of the network interface.
     * 
     */
    private final String ownerId;
    /**
     * The private DNS name.
     * 
     */
    private final String privateDnsName;
    /**
     * The private IPv4 address of the network interface within the subnet.
     * 
     */
    private final String privateIp;
    /**
     * The private IPv4 addresses associated with the network interface.
     * 
     */
    private final List<String> privateIps;
    /**
     * The ID of the entity that launched the instance on your behalf.
     * 
     */
    private final String requesterId;
    /**
     * The list of security groups for the network interface.
     * 
     */
    private final List<String> securityGroups;
    /**
     * The ID of the subnet.
     * 
     */
    private final String subnetId;
    /**
     * Any tags assigned to the network interface.
     * 
     */
    private final Map<String,String> tags;
    /**
     * The ID of the VPC.
     * 
     */
    private final String vpcId;

    @OutputCustomType.Constructor({"arn","associations","attachments","availabilityZone","description","filters","id","interfaceType","ipv6Addresses","macAddress","outpostArn","ownerId","privateDnsName","privateIp","privateIps","requesterId","securityGroups","subnetId","tags","vpcId"})
    private GetNetworkInterfaceResult(
        String arn,
        List<GetNetworkInterfaceAssociation> associations,
        List<GetNetworkInterfaceAttachment> attachments,
        String availabilityZone,
        String description,
        @Nullable List<GetNetworkInterfaceFilter> filters,
        String id,
        String interfaceType,
        List<String> ipv6Addresses,
        String macAddress,
        String outpostArn,
        String ownerId,
        String privateDnsName,
        String privateIp,
        List<String> privateIps,
        String requesterId,
        List<String> securityGroups,
        String subnetId,
        Map<String,String> tags,
        String vpcId) {
        this.arn = Objects.requireNonNull(arn);
        this.associations = Objects.requireNonNull(associations);
        this.attachments = Objects.requireNonNull(attachments);
        this.availabilityZone = Objects.requireNonNull(availabilityZone);
        this.description = Objects.requireNonNull(description);
        this.filters = filters;
        this.id = Objects.requireNonNull(id);
        this.interfaceType = Objects.requireNonNull(interfaceType);
        this.ipv6Addresses = Objects.requireNonNull(ipv6Addresses);
        this.macAddress = Objects.requireNonNull(macAddress);
        this.outpostArn = Objects.requireNonNull(outpostArn);
        this.ownerId = Objects.requireNonNull(ownerId);
        this.privateDnsName = Objects.requireNonNull(privateDnsName);
        this.privateIp = Objects.requireNonNull(privateIp);
        this.privateIps = Objects.requireNonNull(privateIps);
        this.requesterId = Objects.requireNonNull(requesterId);
        this.securityGroups = Objects.requireNonNull(securityGroups);
        this.subnetId = Objects.requireNonNull(subnetId);
        this.tags = Objects.requireNonNull(tags);
        this.vpcId = Objects.requireNonNull(vpcId);
    }

    /**
     * The ARN of the network interface.
     * 
     */
    public String getArn() {
        return this.arn;
    }
    /**
     * The association information for an Elastic IP address (IPv4) associated with the network interface. See supported fields below.
     * 
     */
    public List<GetNetworkInterfaceAssociation> getAssociations() {
        return this.associations;
    }
    public List<GetNetworkInterfaceAttachment> getAttachments() {
        return this.attachments;
    }
    /**
     * The Availability Zone.
     * 
     */
    public String getAvailabilityZone() {
        return this.availabilityZone;
    }
    /**
     * Description of the network interface.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    public List<GetNetworkInterfaceFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }
    public String getId() {
        return this.id;
    }
    /**
     * The type of interface.
     * 
     */
    public String getInterfaceType() {
        return this.interfaceType;
    }
    /**
     * List of IPv6 addresses to assign to the ENI.
     * 
     */
    public List<String> getIpv6Addresses() {
        return this.ipv6Addresses;
    }
    /**
     * The MAC address.
     * 
     */
    public String getMacAddress() {
        return this.macAddress;
    }
    /**
     * The Amazon Resource Name (ARN) of the Outpost.
     * 
     */
    public String getOutpostArn() {
        return this.outpostArn;
    }
    /**
     * The AWS account ID of the owner of the network interface.
     * 
     */
    public String getOwnerId() {
        return this.ownerId;
    }
    /**
     * The private DNS name.
     * 
     */
    public String getPrivateDnsName() {
        return this.privateDnsName;
    }
    /**
     * The private IPv4 address of the network interface within the subnet.
     * 
     */
    public String getPrivateIp() {
        return this.privateIp;
    }
    /**
     * The private IPv4 addresses associated with the network interface.
     * 
     */
    public List<String> getPrivateIps() {
        return this.privateIps;
    }
    /**
     * The ID of the entity that launched the instance on your behalf.
     * 
     */
    public String getRequesterId() {
        return this.requesterId;
    }
    /**
     * The list of security groups for the network interface.
     * 
     */
    public List<String> getSecurityGroups() {
        return this.securityGroups;
    }
    /**
     * The ID of the subnet.
     * 
     */
    public String getSubnetId() {
        return this.subnetId;
    }
    /**
     * Any tags assigned to the network interface.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags;
    }
    /**
     * The ID of the VPC.
     * 
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkInterfaceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private List<GetNetworkInterfaceAssociation> associations;
        private List<GetNetworkInterfaceAttachment> attachments;
        private String availabilityZone;
        private String description;
        private @Nullable List<GetNetworkInterfaceFilter> filters;
        private String id;
        private String interfaceType;
        private List<String> ipv6Addresses;
        private String macAddress;
        private String outpostArn;
        private String ownerId;
        private String privateDnsName;
        private String privateIp;
        private List<String> privateIps;
        private String requesterId;
        private List<String> securityGroups;
        private String subnetId;
        private Map<String,String> tags;
        private String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkInterfaceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.associations = defaults.associations;
    	      this.attachments = defaults.attachments;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.description = defaults.description;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.interfaceType = defaults.interfaceType;
    	      this.ipv6Addresses = defaults.ipv6Addresses;
    	      this.macAddress = defaults.macAddress;
    	      this.outpostArn = defaults.outpostArn;
    	      this.ownerId = defaults.ownerId;
    	      this.privateDnsName = defaults.privateDnsName;
    	      this.privateIp = defaults.privateIp;
    	      this.privateIps = defaults.privateIps;
    	      this.requesterId = defaults.requesterId;
    	      this.securityGroups = defaults.securityGroups;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setAssociations(List<GetNetworkInterfaceAssociation> associations) {
            this.associations = Objects.requireNonNull(associations);
            return this;
        }

        public Builder setAttachments(List<GetNetworkInterfaceAttachment> attachments) {
            this.attachments = Objects.requireNonNull(attachments);
            return this;
        }

        public Builder setAvailabilityZone(String availabilityZone) {
            this.availabilityZone = Objects.requireNonNull(availabilityZone);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setFilters(@Nullable List<GetNetworkInterfaceFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInterfaceType(String interfaceType) {
            this.interfaceType = Objects.requireNonNull(interfaceType);
            return this;
        }

        public Builder setIpv6Addresses(List<String> ipv6Addresses) {
            this.ipv6Addresses = Objects.requireNonNull(ipv6Addresses);
            return this;
        }

        public Builder setMacAddress(String macAddress) {
            this.macAddress = Objects.requireNonNull(macAddress);
            return this;
        }

        public Builder setOutpostArn(String outpostArn) {
            this.outpostArn = Objects.requireNonNull(outpostArn);
            return this;
        }

        public Builder setOwnerId(String ownerId) {
            this.ownerId = Objects.requireNonNull(ownerId);
            return this;
        }

        public Builder setPrivateDnsName(String privateDnsName) {
            this.privateDnsName = Objects.requireNonNull(privateDnsName);
            return this;
        }

        public Builder setPrivateIp(String privateIp) {
            this.privateIp = Objects.requireNonNull(privateIp);
            return this;
        }

        public Builder setPrivateIps(List<String> privateIps) {
            this.privateIps = Objects.requireNonNull(privateIps);
            return this;
        }

        public Builder setRequesterId(String requesterId) {
            this.requesterId = Objects.requireNonNull(requesterId);
            return this;
        }

        public Builder setSecurityGroups(List<String> securityGroups) {
            this.securityGroups = Objects.requireNonNull(securityGroups);
            return this;
        }

        public Builder setSubnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setVpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public GetNetworkInterfaceResult build() {
            return new GetNetworkInterfaceResult(arn, associations, attachments, availabilityZone, description, filters, id, interfaceType, ipv6Addresses, macAddress, outpostArn, ownerId, privateDnsName, privateIp, privateIps, requesterId, securityGroups, subnetId, tags, vpcId);
        }
    }
}
