// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpcIpv6CidrBlockAssociationState extends io.pulumi.resources.ResourceArgs {

    public static final VpcIpv6CidrBlockAssociationState Empty = new VpcIpv6CidrBlockAssociationState();

    /**
     * The IPv6 CIDR block for the VPC. CIDR can be explicitly set or it can be derived from IPAM using `ipv6_netmask_length`. This parameter is required if `ipv6_netmask_length` is not set and he IPAM pool does not have `allocation_default_netmask` set.
     * 
     */
    @InputImport(name="ipv6CidrBlock")
      private final @Nullable Input<String> ipv6CidrBlock;

    public Input<String> getIpv6CidrBlock() {
        return this.ipv6CidrBlock == null ? Input.empty() : this.ipv6CidrBlock;
    }

    /**
     * The ID of an IPv6 IPAM pool you want to use for allocating this VPC's CIDR. IPAM is a VPC feature that you can use to automate your IP address management workflows including assigning, tracking, troubleshooting, and auditing IP addresses across AWS Regions and accounts.
     * 
     */
    @InputImport(name="ipv6IpamPoolId")
      private final @Nullable Input<String> ipv6IpamPoolId;

    public Input<String> getIpv6IpamPoolId() {
        return this.ipv6IpamPoolId == null ? Input.empty() : this.ipv6IpamPoolId;
    }

    /**
     * The netmask length of the IPv6 CIDR you want to allocate to this VPC. Requires specifying a `ipv6_ipam_pool_id`. This parameter is optional if the IPAM pool has `allocation_default_netmask` set, otherwise it or `cidr_block` are required
     * 
     */
    @InputImport(name="ipv6NetmaskLength")
      private final @Nullable Input<Integer> ipv6NetmaskLength;

    public Input<Integer> getIpv6NetmaskLength() {
        return this.ipv6NetmaskLength == null ? Input.empty() : this.ipv6NetmaskLength;
    }

    /**
     * The ID of the VPC to make the association with.
     * 
     */
    @InputImport(name="vpcId")
      private final @Nullable Input<String> vpcId;

    public Input<String> getVpcId() {
        return this.vpcId == null ? Input.empty() : this.vpcId;
    }

    public VpcIpv6CidrBlockAssociationState(
        @Nullable Input<String> ipv6CidrBlock,
        @Nullable Input<String> ipv6IpamPoolId,
        @Nullable Input<Integer> ipv6NetmaskLength,
        @Nullable Input<String> vpcId) {
        this.ipv6CidrBlock = ipv6CidrBlock;
        this.ipv6IpamPoolId = ipv6IpamPoolId;
        this.ipv6NetmaskLength = ipv6NetmaskLength;
        this.vpcId = vpcId;
    }

    private VpcIpv6CidrBlockAssociationState() {
        this.ipv6CidrBlock = Input.empty();
        this.ipv6IpamPoolId = Input.empty();
        this.ipv6NetmaskLength = Input.empty();
        this.vpcId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcIpv6CidrBlockAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> ipv6CidrBlock;
        private @Nullable Input<String> ipv6IpamPoolId;
        private @Nullable Input<Integer> ipv6NetmaskLength;
        private @Nullable Input<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcIpv6CidrBlockAssociationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipv6CidrBlock = defaults.ipv6CidrBlock;
    	      this.ipv6IpamPoolId = defaults.ipv6IpamPoolId;
    	      this.ipv6NetmaskLength = defaults.ipv6NetmaskLength;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setIpv6CidrBlock(@Nullable Input<String> ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }

        public Builder setIpv6CidrBlock(@Nullable String ipv6CidrBlock) {
            this.ipv6CidrBlock = Input.ofNullable(ipv6CidrBlock);
            return this;
        }

        public Builder setIpv6IpamPoolId(@Nullable Input<String> ipv6IpamPoolId) {
            this.ipv6IpamPoolId = ipv6IpamPoolId;
            return this;
        }

        public Builder setIpv6IpamPoolId(@Nullable String ipv6IpamPoolId) {
            this.ipv6IpamPoolId = Input.ofNullable(ipv6IpamPoolId);
            return this;
        }

        public Builder setIpv6NetmaskLength(@Nullable Input<Integer> ipv6NetmaskLength) {
            this.ipv6NetmaskLength = ipv6NetmaskLength;
            return this;
        }

        public Builder setIpv6NetmaskLength(@Nullable Integer ipv6NetmaskLength) {
            this.ipv6NetmaskLength = Input.ofNullable(ipv6NetmaskLength);
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
        public VpcIpv6CidrBlockAssociationState build() {
            return new VpcIpv6CidrBlockAssociationState(ipv6CidrBlock, ipv6IpamPoolId, ipv6NetmaskLength, vpcId);
        }
    }
}
