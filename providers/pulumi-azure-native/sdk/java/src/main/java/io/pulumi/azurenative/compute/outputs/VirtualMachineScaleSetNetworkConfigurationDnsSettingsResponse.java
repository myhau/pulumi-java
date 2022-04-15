// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class VirtualMachineScaleSetNetworkConfigurationDnsSettingsResponse {
    /**
     * List of DNS servers IP addresses
     * 
     */
    private final @Nullable List<String> dnsServers;

    @CustomType.Constructor
    private VirtualMachineScaleSetNetworkConfigurationDnsSettingsResponse(@CustomType.Parameter("dnsServers") @Nullable List<String> dnsServers) {
        this.dnsServers = dnsServers;
    }

    /**
     * List of DNS servers IP addresses
     * 
    */
    public List<String> dnsServers() {
        return this.dnsServers == null ? List.of() : this.dnsServers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetNetworkConfigurationDnsSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> dnsServers;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetNetworkConfigurationDnsSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsServers = defaults.dnsServers;
        }

        public Builder dnsServers(@Nullable List<String> dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }
        public Builder dnsServers(String... dnsServers) {
            return dnsServers(List.of(dnsServers));
        }        public VirtualMachineScaleSetNetworkConfigurationDnsSettingsResponse build() {
            return new VirtualMachineScaleSetNetworkConfigurationDnsSettingsResponse(dnsServers);
        }
    }
}
