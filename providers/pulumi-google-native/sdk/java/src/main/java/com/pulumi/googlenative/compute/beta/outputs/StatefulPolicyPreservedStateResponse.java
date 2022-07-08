// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class StatefulPolicyPreservedStateResponse {
    /**
     * @return Disks created on the instances that will be preserved on instance delete, update, etc. This map is keyed with the device names of the disks.
     * 
     */
    private final Map<String,String> disks;
    /**
     * @return External network IPs assigned to the instances that will be preserved on instance delete, update, etc. This map is keyed with the network interface name.
     * 
     */
    private final Map<String,String> externalIPs;
    /**
     * @return Internal network IPs assigned to the instances that will be preserved on instance delete, update, etc. This map is keyed with the network interface name.
     * 
     */
    private final Map<String,String> internalIPs;

    @CustomType.Constructor
    private StatefulPolicyPreservedStateResponse(
        @CustomType.Parameter("disks") Map<String,String> disks,
        @CustomType.Parameter("externalIPs") Map<String,String> externalIPs,
        @CustomType.Parameter("internalIPs") Map<String,String> internalIPs) {
        this.disks = disks;
        this.externalIPs = externalIPs;
        this.internalIPs = internalIPs;
    }

    /**
     * @return Disks created on the instances that will be preserved on instance delete, update, etc. This map is keyed with the device names of the disks.
     * 
     */
    public Map<String,String> disks() {
        return this.disks;
    }
    /**
     * @return External network IPs assigned to the instances that will be preserved on instance delete, update, etc. This map is keyed with the network interface name.
     * 
     */
    public Map<String,String> externalIPs() {
        return this.externalIPs;
    }
    /**
     * @return Internal network IPs assigned to the instances that will be preserved on instance delete, update, etc. This map is keyed with the network interface name.
     * 
     */
    public Map<String,String> internalIPs() {
        return this.internalIPs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulPolicyPreservedStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> disks;
        private Map<String,String> externalIPs;
        private Map<String,String> internalIPs;

        public Builder() {
    	      // Empty
        }

        public Builder(StatefulPolicyPreservedStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disks = defaults.disks;
    	      this.externalIPs = defaults.externalIPs;
    	      this.internalIPs = defaults.internalIPs;
        }

        public Builder disks(Map<String,String> disks) {
            this.disks = Objects.requireNonNull(disks);
            return this;
        }
        public Builder externalIPs(Map<String,String> externalIPs) {
            this.externalIPs = Objects.requireNonNull(externalIPs);
            return this;
        }
        public Builder internalIPs(Map<String,String> internalIPs) {
            this.internalIPs = Objects.requireNonNull(internalIPs);
            return this;
        }        public StatefulPolicyPreservedStateResponse build() {
            return new StatefulPolicyPreservedStateResponse(disks, externalIPs, internalIPs);
        }
    }
}
