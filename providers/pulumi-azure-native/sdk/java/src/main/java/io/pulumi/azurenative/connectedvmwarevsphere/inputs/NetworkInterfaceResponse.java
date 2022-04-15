// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.inputs;

import io.pulumi.azurenative.connectedvmwarevsphere.inputs.NicIPSettingsResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Network Interface model
 * 
 */
public final class NetworkInterfaceResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkInterfaceResponse Empty = new NetworkInterfaceResponse();

    /**
     * Gets or sets the device key value.
     * 
     */
    @Import(name="deviceKey")
      private final @Nullable Integer deviceKey;

    public Optional<Integer> deviceKey() {
        return this.deviceKey == null ? Optional.empty() : Optional.ofNullable(this.deviceKey);
    }

    /**
     * Gets or sets the nic ip addresses.
     * 
     */
    @Import(name="ipAddresses", required=true)
      private final List<String> ipAddresses;

    public List<String> ipAddresses() {
        return this.ipAddresses;
    }

    /**
     * Gets or sets the ipsettings.
     * 
     */
    @Import(name="ipSettings")
      private final @Nullable NicIPSettingsResponse ipSettings;

    public Optional<NicIPSettingsResponse> ipSettings() {
        return this.ipSettings == null ? Optional.empty() : Optional.ofNullable(this.ipSettings);
    }

    /**
     * Gets or sets the label of the virtual network in vCenter that the nic is connected to.
     * 
     */
    @Import(name="label", required=true)
      private final String label;

    public String label() {
        return this.label;
    }

    /**
     * Gets or sets the NIC MAC address.
     * 
     */
    @Import(name="macAddress", required=true)
      private final String macAddress;

    public String macAddress() {
        return this.macAddress;
    }

    /**
     * Gets or sets the name of the network interface.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Gets or sets the ARM Id of the network resource to connect the virtual machine.
     * 
     */
    @Import(name="networkId")
      private final @Nullable String networkId;

    public Optional<String> networkId() {
        return this.networkId == null ? Optional.empty() : Optional.ofNullable(this.networkId);
    }

    /**
     * Gets or sets the name of the virtual network in vCenter that the nic is connected to.
     * 
     */
    @Import(name="networkMoName", required=true)
      private final String networkMoName;

    public String networkMoName() {
        return this.networkMoName;
    }

    /**
     * Gets or sets the vCenter MoRef (Managed Object Reference) ID of the virtual network
     * that the nic is connected to.
     * 
     */
    @Import(name="networkMoRefId", required=true)
      private final String networkMoRefId;

    public String networkMoRefId() {
        return this.networkMoRefId;
    }

    /**
     * NIC type
     * 
     */
    @Import(name="nicType")
      private final @Nullable String nicType;

    public Optional<String> nicType() {
        return this.nicType == null ? Optional.empty() : Optional.ofNullable(this.nicType);
    }

    /**
     * Gets or sets the power on boot.
     * 
     */
    @Import(name="powerOnBoot")
      private final @Nullable String powerOnBoot;

    public Optional<String> powerOnBoot() {
        return this.powerOnBoot == null ? Optional.empty() : Optional.ofNullable(this.powerOnBoot);
    }

    public NetworkInterfaceResponse(
        @Nullable Integer deviceKey,
        List<String> ipAddresses,
        @Nullable NicIPSettingsResponse ipSettings,
        String label,
        String macAddress,
        @Nullable String name,
        @Nullable String networkId,
        String networkMoName,
        String networkMoRefId,
        @Nullable String nicType,
        @Nullable String powerOnBoot) {
        this.deviceKey = deviceKey;
        this.ipAddresses = Objects.requireNonNull(ipAddresses, "expected parameter 'ipAddresses' to be non-null");
        this.ipSettings = ipSettings;
        this.label = Objects.requireNonNull(label, "expected parameter 'label' to be non-null");
        this.macAddress = Objects.requireNonNull(macAddress, "expected parameter 'macAddress' to be non-null");
        this.name = name;
        this.networkId = networkId;
        this.networkMoName = Objects.requireNonNull(networkMoName, "expected parameter 'networkMoName' to be non-null");
        this.networkMoRefId = Objects.requireNonNull(networkMoRefId, "expected parameter 'networkMoRefId' to be non-null");
        this.nicType = nicType;
        this.powerOnBoot = powerOnBoot;
    }

    private NetworkInterfaceResponse() {
        this.deviceKey = null;
        this.ipAddresses = List.of();
        this.ipSettings = null;
        this.label = null;
        this.macAddress = null;
        this.name = null;
        this.networkId = null;
        this.networkMoName = null;
        this.networkMoRefId = null;
        this.nicType = null;
        this.powerOnBoot = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer deviceKey;
        private List<String> ipAddresses;
        private @Nullable NicIPSettingsResponse ipSettings;
        private String label;
        private String macAddress;
        private @Nullable String name;
        private @Nullable String networkId;
        private String networkMoName;
        private String networkMoRefId;
        private @Nullable String nicType;
        private @Nullable String powerOnBoot;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceKey = defaults.deviceKey;
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.ipSettings = defaults.ipSettings;
    	      this.label = defaults.label;
    	      this.macAddress = defaults.macAddress;
    	      this.name = defaults.name;
    	      this.networkId = defaults.networkId;
    	      this.networkMoName = defaults.networkMoName;
    	      this.networkMoRefId = defaults.networkMoRefId;
    	      this.nicType = defaults.nicType;
    	      this.powerOnBoot = defaults.powerOnBoot;
        }

        public Builder deviceKey(@Nullable Integer deviceKey) {
            this.deviceKey = deviceKey;
            return this;
        }
        public Builder ipAddresses(List<String> ipAddresses) {
            this.ipAddresses = Objects.requireNonNull(ipAddresses);
            return this;
        }
        public Builder ipAddresses(String... ipAddresses) {
            return ipAddresses(List.of(ipAddresses));
        }
        public Builder ipSettings(@Nullable NicIPSettingsResponse ipSettings) {
            this.ipSettings = ipSettings;
            return this;
        }
        public Builder label(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }
        public Builder macAddress(String macAddress) {
            this.macAddress = Objects.requireNonNull(macAddress);
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder networkId(@Nullable String networkId) {
            this.networkId = networkId;
            return this;
        }
        public Builder networkMoName(String networkMoName) {
            this.networkMoName = Objects.requireNonNull(networkMoName);
            return this;
        }
        public Builder networkMoRefId(String networkMoRefId) {
            this.networkMoRefId = Objects.requireNonNull(networkMoRefId);
            return this;
        }
        public Builder nicType(@Nullable String nicType) {
            this.nicType = nicType;
            return this;
        }
        public Builder powerOnBoot(@Nullable String powerOnBoot) {
            this.powerOnBoot = powerOnBoot;
            return this;
        }        public NetworkInterfaceResponse build() {
            return new NetworkInterfaceResponse(deviceKey, ipAddresses, ipSettings, label, macAddress, name, networkId, networkMoName, networkMoRefId, nicType, powerOnBoot);
        }
    }
}
