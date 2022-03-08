// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class NicIPAddressSettingsResponse {
    /**
     * Gets the ip address allocation method.
     * 
     */
    private final String allocationMethod;
    /**
     * Gets the ip address for the nic.
     * 
     */
    private final String ipAddress;
    /**
     * Gets the mask.
     * 
     */
    private final String subnetMask;

    @OutputCustomType.Constructor({"allocationMethod","ipAddress","subnetMask"})
    private NicIPAddressSettingsResponse(
        String allocationMethod,
        String ipAddress,
        String subnetMask) {
        this.allocationMethod = allocationMethod;
        this.ipAddress = ipAddress;
        this.subnetMask = subnetMask;
    }

    /**
     * Gets the ip address allocation method.
     * 
    */
    public String getAllocationMethod() {
        return this.allocationMethod;
    }
    /**
     * Gets the ip address for the nic.
     * 
    */
    public String getIpAddress() {
        return this.ipAddress;
    }
    /**
     * Gets the mask.
     * 
    */
    public String getSubnetMask() {
        return this.subnetMask;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NicIPAddressSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String allocationMethod;
        private String ipAddress;
        private String subnetMask;

        public Builder() {
    	      // Empty
        }

        public Builder(NicIPAddressSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationMethod = defaults.allocationMethod;
    	      this.ipAddress = defaults.ipAddress;
    	      this.subnetMask = defaults.subnetMask;
        }

        public Builder setAllocationMethod(String allocationMethod) {
            this.allocationMethod = Objects.requireNonNull(allocationMethod);
            return this;
        }

        public Builder setIpAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }

        public Builder setSubnetMask(String subnetMask) {
            this.subnetMask = Objects.requireNonNull(subnetMask);
            return this;
        }
        public NicIPAddressSettingsResponse build() {
            return new NicIPAddressSettingsResponse(allocationMethod, ipAddress, subnetMask);
        }
    }
}
