// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PrivateIPAddressResponse {
    /**
     * Private IP address bound to the availability group listener.
     * 
     */
    private final @Nullable String ipAddress;
    /**
     * Subnet used to include private IP.
     * 
     */
    private final @Nullable String subnetResourceId;

    @CustomType.Constructor
    private PrivateIPAddressResponse(
        @CustomType.Parameter("ipAddress") @Nullable String ipAddress,
        @CustomType.Parameter("subnetResourceId") @Nullable String subnetResourceId) {
        this.ipAddress = ipAddress;
        this.subnetResourceId = subnetResourceId;
    }

    /**
     * Private IP address bound to the availability group listener.
     * 
    */
    public Optional<String> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }
    /**
     * Subnet used to include private IP.
     * 
    */
    public Optional<String> subnetResourceId() {
        return Optional.ofNullable(this.subnetResourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateIPAddressResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ipAddress;
        private @Nullable String subnetResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateIPAddressResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.subnetResourceId = defaults.subnetResourceId;
        }

        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public Builder subnetResourceId(@Nullable String subnetResourceId) {
            this.subnetResourceId = subnetResourceId;
            return this;
        }        public PrivateIPAddressResponse build() {
            return new PrivateIPAddressResponse(ipAddress, subnetResourceId);
        }
    }
}
