// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.outputs;

import io.pulumi.aws.outputs.GetElasticIpFilter;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetElasticIpResult {
    /**
     * The ID representing the association of the address with an instance in a VPC.
     * 
     */
    private final String associationId;
    /**
     * The carrier IP address.
     * 
     */
    private final String carrierIp;
    /**
     * Customer Owned IP.
     * 
     */
    private final String customerOwnedIp;
    /**
     * The ID of a Customer Owned IP Pool. For more on customer owned IP addressed check out [Customer-owned IP addresses guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#ip-addressing)
     * 
     */
    private final String customerOwnedIpv4Pool;
    /**
     * Indicates whether the address is for use in EC2-Classic (standard) or in a VPC (vpc).
     * 
     */
    private final String domain;
    private final @Nullable List<GetElasticIpFilter> filters;
    /**
     * If VPC Elastic IP, the allocation identifier. If EC2-Classic Elastic IP, the public IP address.
     * 
     */
    private final String id;
    /**
     * The ID of the instance that the address is associated with (if any).
     * 
     */
    private final String instanceId;
    /**
     * The ID of the network interface.
     * 
     */
    private final String networkInterfaceId;
    /**
     * The ID of the AWS account that owns the network interface.
     * 
     */
    private final String networkInterfaceOwnerId;
    /**
     * The Private DNS associated with the Elastic IP address.
     * 
     */
    private final String privateDns;
    /**
     * The private IP address associated with the Elastic IP address.
     * 
     */
    private final String privateIp;
    /**
     * Public DNS associated with the Elastic IP address.
     * 
     */
    private final String publicDns;
    /**
     * Public IP address of Elastic IP.
     * 
     */
    private final String publicIp;
    /**
     * The ID of an address pool.
     * 
     */
    private final String publicIpv4Pool;
    /**
     * Key-value map of tags associated with Elastic IP.
     * 
     */
    private final Map<String,String> tags;

    @OutputCustomType.Constructor({"associationId","carrierIp","customerOwnedIp","customerOwnedIpv4Pool","domain","filters","id","instanceId","networkInterfaceId","networkInterfaceOwnerId","privateDns","privateIp","publicDns","publicIp","publicIpv4Pool","tags"})
    private GetElasticIpResult(
        String associationId,
        String carrierIp,
        String customerOwnedIp,
        String customerOwnedIpv4Pool,
        String domain,
        @Nullable List<GetElasticIpFilter> filters,
        String id,
        String instanceId,
        String networkInterfaceId,
        String networkInterfaceOwnerId,
        String privateDns,
        String privateIp,
        String publicDns,
        String publicIp,
        String publicIpv4Pool,
        Map<String,String> tags) {
        this.associationId = Objects.requireNonNull(associationId);
        this.carrierIp = Objects.requireNonNull(carrierIp);
        this.customerOwnedIp = Objects.requireNonNull(customerOwnedIp);
        this.customerOwnedIpv4Pool = Objects.requireNonNull(customerOwnedIpv4Pool);
        this.domain = Objects.requireNonNull(domain);
        this.filters = filters;
        this.id = Objects.requireNonNull(id);
        this.instanceId = Objects.requireNonNull(instanceId);
        this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId);
        this.networkInterfaceOwnerId = Objects.requireNonNull(networkInterfaceOwnerId);
        this.privateDns = Objects.requireNonNull(privateDns);
        this.privateIp = Objects.requireNonNull(privateIp);
        this.publicDns = Objects.requireNonNull(publicDns);
        this.publicIp = Objects.requireNonNull(publicIp);
        this.publicIpv4Pool = Objects.requireNonNull(publicIpv4Pool);
        this.tags = Objects.requireNonNull(tags);
    }

    /**
     * The ID representing the association of the address with an instance in a VPC.
     * 
     */
    public String getAssociationId() {
        return this.associationId;
    }
    /**
     * The carrier IP address.
     * 
     */
    public String getCarrierIp() {
        return this.carrierIp;
    }
    /**
     * Customer Owned IP.
     * 
     */
    public String getCustomerOwnedIp() {
        return this.customerOwnedIp;
    }
    /**
     * The ID of a Customer Owned IP Pool. For more on customer owned IP addressed check out [Customer-owned IP addresses guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#ip-addressing)
     * 
     */
    public String getCustomerOwnedIpv4Pool() {
        return this.customerOwnedIpv4Pool;
    }
    /**
     * Indicates whether the address is for use in EC2-Classic (standard) or in a VPC (vpc).
     * 
     */
    public String getDomain() {
        return this.domain;
    }
    public List<GetElasticIpFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * If VPC Elastic IP, the allocation identifier. If EC2-Classic Elastic IP, the public IP address.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The ID of the instance that the address is associated with (if any).
     * 
     */
    public String getInstanceId() {
        return this.instanceId;
    }
    /**
     * The ID of the network interface.
     * 
     */
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }
    /**
     * The ID of the AWS account that owns the network interface.
     * 
     */
    public String getNetworkInterfaceOwnerId() {
        return this.networkInterfaceOwnerId;
    }
    /**
     * The Private DNS associated with the Elastic IP address.
     * 
     */
    public String getPrivateDns() {
        return this.privateDns;
    }
    /**
     * The private IP address associated with the Elastic IP address.
     * 
     */
    public String getPrivateIp() {
        return this.privateIp;
    }
    /**
     * Public DNS associated with the Elastic IP address.
     * 
     */
    public String getPublicDns() {
        return this.publicDns;
    }
    /**
     * Public IP address of Elastic IP.
     * 
     */
    public String getPublicIp() {
        return this.publicIp;
    }
    /**
     * The ID of an address pool.
     * 
     */
    public String getPublicIpv4Pool() {
        return this.publicIpv4Pool;
    }
    /**
     * Key-value map of tags associated with Elastic IP.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetElasticIpResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String associationId;
        private String carrierIp;
        private String customerOwnedIp;
        private String customerOwnedIpv4Pool;
        private String domain;
        private @Nullable List<GetElasticIpFilter> filters;
        private String id;
        private String instanceId;
        private String networkInterfaceId;
        private String networkInterfaceOwnerId;
        private String privateDns;
        private String privateIp;
        private String publicDns;
        private String publicIp;
        private String publicIpv4Pool;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetElasticIpResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associationId = defaults.associationId;
    	      this.carrierIp = defaults.carrierIp;
    	      this.customerOwnedIp = defaults.customerOwnedIp;
    	      this.customerOwnedIpv4Pool = defaults.customerOwnedIpv4Pool;
    	      this.domain = defaults.domain;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.networkInterfaceOwnerId = defaults.networkInterfaceOwnerId;
    	      this.privateDns = defaults.privateDns;
    	      this.privateIp = defaults.privateIp;
    	      this.publicDns = defaults.publicDns;
    	      this.publicIp = defaults.publicIp;
    	      this.publicIpv4Pool = defaults.publicIpv4Pool;
    	      this.tags = defaults.tags;
        }

        public Builder setAssociationId(String associationId) {
            this.associationId = Objects.requireNonNull(associationId);
            return this;
        }

        public Builder setCarrierIp(String carrierIp) {
            this.carrierIp = Objects.requireNonNull(carrierIp);
            return this;
        }

        public Builder setCustomerOwnedIp(String customerOwnedIp) {
            this.customerOwnedIp = Objects.requireNonNull(customerOwnedIp);
            return this;
        }

        public Builder setCustomerOwnedIpv4Pool(String customerOwnedIpv4Pool) {
            this.customerOwnedIpv4Pool = Objects.requireNonNull(customerOwnedIpv4Pool);
            return this;
        }

        public Builder setDomain(String domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }

        public Builder setFilters(@Nullable List<GetElasticIpFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInstanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }

        public Builder setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId);
            return this;
        }

        public Builder setNetworkInterfaceOwnerId(String networkInterfaceOwnerId) {
            this.networkInterfaceOwnerId = Objects.requireNonNull(networkInterfaceOwnerId);
            return this;
        }

        public Builder setPrivateDns(String privateDns) {
            this.privateDns = Objects.requireNonNull(privateDns);
            return this;
        }

        public Builder setPrivateIp(String privateIp) {
            this.privateIp = Objects.requireNonNull(privateIp);
            return this;
        }

        public Builder setPublicDns(String publicDns) {
            this.publicDns = Objects.requireNonNull(publicDns);
            return this;
        }

        public Builder setPublicIp(String publicIp) {
            this.publicIp = Objects.requireNonNull(publicIp);
            return this;
        }

        public Builder setPublicIpv4Pool(String publicIpv4Pool) {
            this.publicIpv4Pool = Objects.requireNonNull(publicIpv4Pool);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetElasticIpResult build() {
            return new GetElasticIpResult(associationId, carrierIp, customerOwnedIp, customerOwnedIpv4Pool, domain, filters, id, instanceId, networkInterfaceId, networkInterfaceOwnerId, privateDns, privateIp, publicDns, publicIp, publicIpv4Pool, tags);
        }
    }
}
