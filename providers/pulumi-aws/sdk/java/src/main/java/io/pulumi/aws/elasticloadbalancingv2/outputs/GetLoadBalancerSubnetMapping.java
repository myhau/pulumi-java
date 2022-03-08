// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancingv2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetLoadBalancerSubnetMapping {
    private final String allocationId;
    private final String ipv6Address;
    private final String outpostId;
    private final String privateIpv4Address;
    private final String subnetId;

    @OutputCustomType.Constructor({"allocationId","ipv6Address","outpostId","privateIpv4Address","subnetId"})
    private GetLoadBalancerSubnetMapping(
        String allocationId,
        String ipv6Address,
        String outpostId,
        String privateIpv4Address,
        String subnetId) {
        this.allocationId = allocationId;
        this.ipv6Address = ipv6Address;
        this.outpostId = outpostId;
        this.privateIpv4Address = privateIpv4Address;
        this.subnetId = subnetId;
    }

    public String getAllocationId() {
        return this.allocationId;
    }
    public String getIpv6Address() {
        return this.ipv6Address;
    }
    public String getOutpostId() {
        return this.outpostId;
    }
    public String getPrivateIpv4Address() {
        return this.privateIpv4Address;
    }
    public String getSubnetId() {
        return this.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancerSubnetMapping defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String allocationId;
        private String ipv6Address;
        private String outpostId;
        private String privateIpv4Address;
        private String subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLoadBalancerSubnetMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationId = defaults.allocationId;
    	      this.ipv6Address = defaults.ipv6Address;
    	      this.outpostId = defaults.outpostId;
    	      this.privateIpv4Address = defaults.privateIpv4Address;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder setAllocationId(String allocationId) {
            this.allocationId = Objects.requireNonNull(allocationId);
            return this;
        }

        public Builder setIpv6Address(String ipv6Address) {
            this.ipv6Address = Objects.requireNonNull(ipv6Address);
            return this;
        }

        public Builder setOutpostId(String outpostId) {
            this.outpostId = Objects.requireNonNull(outpostId);
            return this;
        }

        public Builder setPrivateIpv4Address(String privateIpv4Address) {
            this.privateIpv4Address = Objects.requireNonNull(privateIpv4Address);
            return this;
        }

        public Builder setSubnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public GetLoadBalancerSubnetMapping build() {
            return new GetLoadBalancerSubnetMapping(allocationId, ipv6Address, outpostId, privateIpv4Address, subnetId);
        }
    }
}
