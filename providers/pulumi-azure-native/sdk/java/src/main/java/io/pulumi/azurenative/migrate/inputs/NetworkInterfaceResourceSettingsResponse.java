// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.azurenative.migrate.inputs.NicIpConfigurationResourceSettingsResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the network interface resource settings.
 * 
 */
public final class NetworkInterfaceResourceSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkInterfaceResourceSettingsResponse Empty = new NetworkInterfaceResourceSettingsResponse();

    /**
     * Gets or sets a value indicating whether accelerated networking is enabled.
     * 
     */
    @Import(name="enableAcceleratedNetworking")
      private final @Nullable Boolean enableAcceleratedNetworking;

    public Optional<Boolean> enableAcceleratedNetworking() {
        return this.enableAcceleratedNetworking == null ? Optional.empty() : Optional.ofNullable(this.enableAcceleratedNetworking);
    }

    /**
     * Gets or sets the IP configurations of the NIC.
     * 
     */
    @Import(name="ipConfigurations")
      private final @Nullable List<NicIpConfigurationResourceSettingsResponse> ipConfigurations;

    public List<NicIpConfigurationResourceSettingsResponse> ipConfigurations() {
        return this.ipConfigurations == null ? List.of() : this.ipConfigurations;
    }

    /**
     * The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is 'Microsoft.Network/networkInterfaces'.
     * 
     */
    @Import(name="resourceType", required=true)
      private final String resourceType;

    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Gets or sets the target Resource name.
     * 
     */
    @Import(name="targetResourceName", required=true)
      private final String targetResourceName;

    public String targetResourceName() {
        return this.targetResourceName;
    }

    public NetworkInterfaceResourceSettingsResponse(
        @Nullable Boolean enableAcceleratedNetworking,
        @Nullable List<NicIpConfigurationResourceSettingsResponse> ipConfigurations,
        String resourceType,
        String targetResourceName) {
        this.enableAcceleratedNetworking = enableAcceleratedNetworking;
        this.ipConfigurations = ipConfigurations;
        this.resourceType = Objects.requireNonNull(resourceType, "expected parameter 'resourceType' to be non-null");
        this.targetResourceName = Objects.requireNonNull(targetResourceName, "expected parameter 'targetResourceName' to be non-null");
    }

    private NetworkInterfaceResourceSettingsResponse() {
        this.enableAcceleratedNetworking = null;
        this.ipConfigurations = List.of();
        this.resourceType = null;
        this.targetResourceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceResourceSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableAcceleratedNetworking;
        private @Nullable List<NicIpConfigurationResourceSettingsResponse> ipConfigurations;
        private String resourceType;
        private String targetResourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceResourceSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableAcceleratedNetworking = defaults.enableAcceleratedNetworking;
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.resourceType = defaults.resourceType;
    	      this.targetResourceName = defaults.targetResourceName;
        }

        public Builder enableAcceleratedNetworking(@Nullable Boolean enableAcceleratedNetworking) {
            this.enableAcceleratedNetworking = enableAcceleratedNetworking;
            return this;
        }
        public Builder ipConfigurations(@Nullable List<NicIpConfigurationResourceSettingsResponse> ipConfigurations) {
            this.ipConfigurations = ipConfigurations;
            return this;
        }
        public Builder ipConfigurations(NicIpConfigurationResourceSettingsResponse... ipConfigurations) {
            return ipConfigurations(List.of(ipConfigurations));
        }
        public Builder resourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }
        public Builder targetResourceName(String targetResourceName) {
            this.targetResourceName = Objects.requireNonNull(targetResourceName);
            return this;
        }        public NetworkInterfaceResourceSettingsResponse build() {
            return new NetworkInterfaceResourceSettingsResponse(enableAcceleratedNetworking, ipConfigurations, resourceType, targetResourceName);
        }
    }
}
