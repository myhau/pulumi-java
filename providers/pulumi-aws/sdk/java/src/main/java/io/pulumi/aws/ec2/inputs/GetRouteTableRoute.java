// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetRouteTableRoute extends io.pulumi.resources.InvokeArgs {

    public static final GetRouteTableRoute Empty = new GetRouteTableRoute();

    /**
     * ID of the Carrier Gateway.
     * 
     */
    @InputImport(name="carrierGatewayId", required=true)
      private final String carrierGatewayId;

    public String getCarrierGatewayId() {
        return this.carrierGatewayId;
    }

    /**
     * CIDR block of the route.
     * 
     */
    @InputImport(name="cidrBlock", required=true)
      private final String cidrBlock;

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * The ID of a managed prefix list destination of the route.
     * 
     */
    @InputImport(name="destinationPrefixListId", required=true)
      private final String destinationPrefixListId;

    public String getDestinationPrefixListId() {
        return this.destinationPrefixListId;
    }

    /**
     * ID of the Egress Only Internet Gateway.
     * 
     */
    @InputImport(name="egressOnlyGatewayId", required=true)
      private final String egressOnlyGatewayId;

    public String getEgressOnlyGatewayId() {
        return this.egressOnlyGatewayId;
    }

    /**
     * ID of an Internet Gateway or Virtual Private Gateway which is connected to the Route Table (not exported if not passed as a parameter).
     * 
     */
    @InputImport(name="gatewayId", required=true)
      private final String gatewayId;

    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * EC2 instance ID.
     * 
     */
    @InputImport(name="instanceId", required=true)
      private final String instanceId;

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * IPv6 CIDR block of the route.
     * 
     */
    @InputImport(name="ipv6CidrBlock", required=true)
      private final String ipv6CidrBlock;

    public String getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }

    /**
     * Local Gateway ID.
     * 
     */
    @InputImport(name="localGatewayId", required=true)
      private final String localGatewayId;

    public String getLocalGatewayId() {
        return this.localGatewayId;
    }

    /**
     * NAT Gateway ID.
     * 
     */
    @InputImport(name="natGatewayId", required=true)
      private final String natGatewayId;

    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * ID of the elastic network interface (eni) to use.
     * 
     */
    @InputImport(name="networkInterfaceId", required=true)
      private final String networkInterfaceId;

    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * EC2 Transit Gateway ID.
     * 
     */
    @InputImport(name="transitGatewayId", required=true)
      private final String transitGatewayId;

    public String getTransitGatewayId() {
        return this.transitGatewayId;
    }

    /**
     * VPC Endpoint ID.
     * 
     */
    @InputImport(name="vpcEndpointId", required=true)
      private final String vpcEndpointId;

    public String getVpcEndpointId() {
        return this.vpcEndpointId;
    }

    /**
     * VPC Peering ID.
     * 
     */
    @InputImport(name="vpcPeeringConnectionId", required=true)
      private final String vpcPeeringConnectionId;

    public String getVpcPeeringConnectionId() {
        return this.vpcPeeringConnectionId;
    }

    public GetRouteTableRoute(
        String carrierGatewayId,
        String cidrBlock,
        String destinationPrefixListId,
        String egressOnlyGatewayId,
        String gatewayId,
        String instanceId,
        String ipv6CidrBlock,
        String localGatewayId,
        String natGatewayId,
        String networkInterfaceId,
        String transitGatewayId,
        String vpcEndpointId,
        String vpcPeeringConnectionId) {
        this.carrierGatewayId = Objects.requireNonNull(carrierGatewayId, "expected parameter 'carrierGatewayId' to be non-null");
        this.cidrBlock = Objects.requireNonNull(cidrBlock, "expected parameter 'cidrBlock' to be non-null");
        this.destinationPrefixListId = Objects.requireNonNull(destinationPrefixListId, "expected parameter 'destinationPrefixListId' to be non-null");
        this.egressOnlyGatewayId = Objects.requireNonNull(egressOnlyGatewayId, "expected parameter 'egressOnlyGatewayId' to be non-null");
        this.gatewayId = Objects.requireNonNull(gatewayId, "expected parameter 'gatewayId' to be non-null");
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.ipv6CidrBlock = Objects.requireNonNull(ipv6CidrBlock, "expected parameter 'ipv6CidrBlock' to be non-null");
        this.localGatewayId = Objects.requireNonNull(localGatewayId, "expected parameter 'localGatewayId' to be non-null");
        this.natGatewayId = Objects.requireNonNull(natGatewayId, "expected parameter 'natGatewayId' to be non-null");
        this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId, "expected parameter 'networkInterfaceId' to be non-null");
        this.transitGatewayId = Objects.requireNonNull(transitGatewayId, "expected parameter 'transitGatewayId' to be non-null");
        this.vpcEndpointId = Objects.requireNonNull(vpcEndpointId, "expected parameter 'vpcEndpointId' to be non-null");
        this.vpcPeeringConnectionId = Objects.requireNonNull(vpcPeeringConnectionId, "expected parameter 'vpcPeeringConnectionId' to be non-null");
    }

    private GetRouteTableRoute() {
        this.carrierGatewayId = null;
        this.cidrBlock = null;
        this.destinationPrefixListId = null;
        this.egressOnlyGatewayId = null;
        this.gatewayId = null;
        this.instanceId = null;
        this.ipv6CidrBlock = null;
        this.localGatewayId = null;
        this.natGatewayId = null;
        this.networkInterfaceId = null;
        this.transitGatewayId = null;
        this.vpcEndpointId = null;
        this.vpcPeeringConnectionId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteTableRoute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String carrierGatewayId;
        private String cidrBlock;
        private String destinationPrefixListId;
        private String egressOnlyGatewayId;
        private String gatewayId;
        private String instanceId;
        private String ipv6CidrBlock;
        private String localGatewayId;
        private String natGatewayId;
        private String networkInterfaceId;
        private String transitGatewayId;
        private String vpcEndpointId;
        private String vpcPeeringConnectionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouteTableRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.carrierGatewayId = defaults.carrierGatewayId;
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.destinationPrefixListId = defaults.destinationPrefixListId;
    	      this.egressOnlyGatewayId = defaults.egressOnlyGatewayId;
    	      this.gatewayId = defaults.gatewayId;
    	      this.instanceId = defaults.instanceId;
    	      this.ipv6CidrBlock = defaults.ipv6CidrBlock;
    	      this.localGatewayId = defaults.localGatewayId;
    	      this.natGatewayId = defaults.natGatewayId;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.transitGatewayId = defaults.transitGatewayId;
    	      this.vpcEndpointId = defaults.vpcEndpointId;
    	      this.vpcPeeringConnectionId = defaults.vpcPeeringConnectionId;
        }

        public Builder setCarrierGatewayId(String carrierGatewayId) {
            this.carrierGatewayId = Objects.requireNonNull(carrierGatewayId);
            return this;
        }

        public Builder setCidrBlock(String cidrBlock) {
            this.cidrBlock = Objects.requireNonNull(cidrBlock);
            return this;
        }

        public Builder setDestinationPrefixListId(String destinationPrefixListId) {
            this.destinationPrefixListId = Objects.requireNonNull(destinationPrefixListId);
            return this;
        }

        public Builder setEgressOnlyGatewayId(String egressOnlyGatewayId) {
            this.egressOnlyGatewayId = Objects.requireNonNull(egressOnlyGatewayId);
            return this;
        }

        public Builder setGatewayId(String gatewayId) {
            this.gatewayId = Objects.requireNonNull(gatewayId);
            return this;
        }

        public Builder setInstanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }

        public Builder setIpv6CidrBlock(String ipv6CidrBlock) {
            this.ipv6CidrBlock = Objects.requireNonNull(ipv6CidrBlock);
            return this;
        }

        public Builder setLocalGatewayId(String localGatewayId) {
            this.localGatewayId = Objects.requireNonNull(localGatewayId);
            return this;
        }

        public Builder setNatGatewayId(String natGatewayId) {
            this.natGatewayId = Objects.requireNonNull(natGatewayId);
            return this;
        }

        public Builder setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId);
            return this;
        }

        public Builder setTransitGatewayId(String transitGatewayId) {
            this.transitGatewayId = Objects.requireNonNull(transitGatewayId);
            return this;
        }

        public Builder setVpcEndpointId(String vpcEndpointId) {
            this.vpcEndpointId = Objects.requireNonNull(vpcEndpointId);
            return this;
        }

        public Builder setVpcPeeringConnectionId(String vpcPeeringConnectionId) {
            this.vpcPeeringConnectionId = Objects.requireNonNull(vpcPeeringConnectionId);
            return this;
        }
        public GetRouteTableRoute build() {
            return new GetRouteTableRoute(carrierGatewayId, cidrBlock, destinationPrefixListId, egressOnlyGatewayId, gatewayId, instanceId, ipv6CidrBlock, localGatewayId, natGatewayId, networkInterfaceId, transitGatewayId, vpcEndpointId, vpcPeeringConnectionId);
        }
    }
}
