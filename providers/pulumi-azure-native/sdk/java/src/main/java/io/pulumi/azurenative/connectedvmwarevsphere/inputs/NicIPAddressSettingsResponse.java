// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * IP address information for a virtual network adapter reported by the fabric.
 * 
 */
public final class NicIPAddressSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final NicIPAddressSettingsResponse Empty = new NicIPAddressSettingsResponse();

    /**
     * Gets the ip address allocation method.
     * 
     */
    @Import(name="allocationMethod", required=true)
      private final String allocationMethod;

    public String allocationMethod() {
        return this.allocationMethod;
    }

    /**
     * Gets the ip address for the nic.
     * 
     */
    @Import(name="ipAddress", required=true)
      private final String ipAddress;

    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Gets the mask.
     * 
     */
    @Import(name="subnetMask", required=true)
      private final String subnetMask;

    public String subnetMask() {
        return this.subnetMask;
    }

    public NicIPAddressSettingsResponse(
        String allocationMethod,
        String ipAddress,
        String subnetMask) {
        this.allocationMethod = Objects.requireNonNull(allocationMethod, "expected parameter 'allocationMethod' to be non-null");
        this.ipAddress = Objects.requireNonNull(ipAddress, "expected parameter 'ipAddress' to be non-null");
        this.subnetMask = Objects.requireNonNull(subnetMask, "expected parameter 'subnetMask' to be non-null");
    }

    private NicIPAddressSettingsResponse() {
        this.allocationMethod = null;
        this.ipAddress = null;
        this.subnetMask = null;
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

        public Builder allocationMethod(String allocationMethod) {
            this.allocationMethod = Objects.requireNonNull(allocationMethod);
            return this;
        }
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }
        public Builder subnetMask(String subnetMask) {
            this.subnetMask = Objects.requireNonNull(subnetMask);
            return this;
        }        public NicIPAddressSettingsResponse build() {
            return new NicIPAddressSettingsResponse(allocationMethod, ipAddress, subnetMask);
        }
    }
}
