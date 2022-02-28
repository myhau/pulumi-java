// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.alb.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LoadBalancerSubnetMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoadBalancerSubnetMappingArgs Empty = new LoadBalancerSubnetMappingArgs();

    /**
     * The allocation ID of the Elastic IP address.
     * 
     */
    @InputImport(name="allocationId")
      private final @Nullable Input<String> allocationId;

    public Input<String> getAllocationId() {
        return this.allocationId == null ? Input.empty() : this.allocationId;
    }

    /**
     * An ipv6 address within the subnet to assign to the internet-facing load balancer.
     * 
     */
    @InputImport(name="ipv6Address")
      private final @Nullable Input<String> ipv6Address;

    public Input<String> getIpv6Address() {
        return this.ipv6Address == null ? Input.empty() : this.ipv6Address;
    }

    @InputImport(name="outpostId")
      private final @Nullable Input<String> outpostId;

    public Input<String> getOutpostId() {
        return this.outpostId == null ? Input.empty() : this.outpostId;
    }

    /**
     * A private ipv4 address within the subnet to assign to the internal-facing load balancer.
     * 
     */
    @InputImport(name="privateIpv4Address")
      private final @Nullable Input<String> privateIpv4Address;

    public Input<String> getPrivateIpv4Address() {
        return this.privateIpv4Address == null ? Input.empty() : this.privateIpv4Address;
    }

    /**
     * The id of the subnet of which to attach to the load balancer. You can specify only one subnet per Availability Zone.
     * 
     */
    @InputImport(name="subnetId", required=true)
      private final Input<String> subnetId;

    public Input<String> getSubnetId() {
        return this.subnetId;
    }

    public LoadBalancerSubnetMappingArgs(
        @Nullable Input<String> allocationId,
        @Nullable Input<String> ipv6Address,
        @Nullable Input<String> outpostId,
        @Nullable Input<String> privateIpv4Address,
        Input<String> subnetId) {
        this.allocationId = allocationId;
        this.ipv6Address = ipv6Address;
        this.outpostId = outpostId;
        this.privateIpv4Address = privateIpv4Address;
        this.subnetId = Objects.requireNonNull(subnetId, "expected parameter 'subnetId' to be non-null");
    }

    private LoadBalancerSubnetMappingArgs() {
        this.allocationId = Input.empty();
        this.ipv6Address = Input.empty();
        this.outpostId = Input.empty();
        this.privateIpv4Address = Input.empty();
        this.subnetId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerSubnetMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> allocationId;
        private @Nullable Input<String> ipv6Address;
        private @Nullable Input<String> outpostId;
        private @Nullable Input<String> privateIpv4Address;
        private Input<String> subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerSubnetMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationId = defaults.allocationId;
    	      this.ipv6Address = defaults.ipv6Address;
    	      this.outpostId = defaults.outpostId;
    	      this.privateIpv4Address = defaults.privateIpv4Address;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder setAllocationId(@Nullable Input<String> allocationId) {
            this.allocationId = allocationId;
            return this;
        }

        public Builder setAllocationId(@Nullable String allocationId) {
            this.allocationId = Input.ofNullable(allocationId);
            return this;
        }

        public Builder setIpv6Address(@Nullable Input<String> ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }

        public Builder setIpv6Address(@Nullable String ipv6Address) {
            this.ipv6Address = Input.ofNullable(ipv6Address);
            return this;
        }

        public Builder setOutpostId(@Nullable Input<String> outpostId) {
            this.outpostId = outpostId;
            return this;
        }

        public Builder setOutpostId(@Nullable String outpostId) {
            this.outpostId = Input.ofNullable(outpostId);
            return this;
        }

        public Builder setPrivateIpv4Address(@Nullable Input<String> privateIpv4Address) {
            this.privateIpv4Address = privateIpv4Address;
            return this;
        }

        public Builder setPrivateIpv4Address(@Nullable String privateIpv4Address) {
            this.privateIpv4Address = Input.ofNullable(privateIpv4Address);
            return this;
        }

        public Builder setSubnetId(Input<String> subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }

        public Builder setSubnetId(String subnetId) {
            this.subnetId = Input.of(Objects.requireNonNull(subnetId));
            return this;
        }
        public LoadBalancerSubnetMappingArgs build() {
            return new LoadBalancerSubnetMappingArgs(allocationId, ipv6Address, outpostId, privateIpv4Address, subnetId);
        }
    }
}
