// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetLaunchTemplateNetworkInterface {
    private final String associateCarrierIpAddress;
    private final @Nullable Boolean associatePublicIpAddress;
    private final @Nullable Boolean deleteOnTermination;
    /**
     * Description of the launch template.
     * 
     */
    private final String description;
    private final Integer deviceIndex;
    private final String interfaceType;
    private final Integer ipv4AddressCount;
    private final List<String> ipv4Addresses;
    private final Integer ipv6AddressCount;
    private final List<String> ipv6Addresses;
    private final @Nullable Integer networkCardIndex;
    private final String networkInterfaceId;
    private final String privateIpAddress;
    private final List<String> securityGroups;
    private final String subnetId;

    @OutputCustomType.Constructor({"associateCarrierIpAddress","associatePublicIpAddress","deleteOnTermination","description","deviceIndex","interfaceType","ipv4AddressCount","ipv4Addresses","ipv6AddressCount","ipv6Addresses","networkCardIndex","networkInterfaceId","privateIpAddress","securityGroups","subnetId"})
    private GetLaunchTemplateNetworkInterface(
        String associateCarrierIpAddress,
        @Nullable Boolean associatePublicIpAddress,
        @Nullable Boolean deleteOnTermination,
        String description,
        Integer deviceIndex,
        String interfaceType,
        Integer ipv4AddressCount,
        List<String> ipv4Addresses,
        Integer ipv6AddressCount,
        List<String> ipv6Addresses,
        @Nullable Integer networkCardIndex,
        String networkInterfaceId,
        String privateIpAddress,
        List<String> securityGroups,
        String subnetId) {
        this.associateCarrierIpAddress = Objects.requireNonNull(associateCarrierIpAddress);
        this.associatePublicIpAddress = associatePublicIpAddress;
        this.deleteOnTermination = deleteOnTermination;
        this.description = Objects.requireNonNull(description);
        this.deviceIndex = Objects.requireNonNull(deviceIndex);
        this.interfaceType = Objects.requireNonNull(interfaceType);
        this.ipv4AddressCount = Objects.requireNonNull(ipv4AddressCount);
        this.ipv4Addresses = Objects.requireNonNull(ipv4Addresses);
        this.ipv6AddressCount = Objects.requireNonNull(ipv6AddressCount);
        this.ipv6Addresses = Objects.requireNonNull(ipv6Addresses);
        this.networkCardIndex = networkCardIndex;
        this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId);
        this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
        this.securityGroups = Objects.requireNonNull(securityGroups);
        this.subnetId = Objects.requireNonNull(subnetId);
    }

    public String getAssociateCarrierIpAddress() {
        return this.associateCarrierIpAddress;
    }
    public Optional<Boolean> getAssociatePublicIpAddress() {
        return Optional.ofNullable(this.associatePublicIpAddress);
    }
    public Optional<Boolean> getDeleteOnTermination() {
        return Optional.ofNullable(this.deleteOnTermination);
    }
    /**
     * Description of the launch template.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    public Integer getDeviceIndex() {
        return this.deviceIndex;
    }
    public String getInterfaceType() {
        return this.interfaceType;
    }
    public Integer getIpv4AddressCount() {
        return this.ipv4AddressCount;
    }
    public List<String> getIpv4Addresses() {
        return this.ipv4Addresses;
    }
    public Integer getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }
    public List<String> getIpv6Addresses() {
        return this.ipv6Addresses;
    }
    public Optional<Integer> getNetworkCardIndex() {
        return Optional.ofNullable(this.networkCardIndex);
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }
    public List<String> getSecurityGroups() {
        return this.securityGroups;
    }
    public String getSubnetId() {
        return this.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchTemplateNetworkInterface defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String associateCarrierIpAddress;
        private @Nullable Boolean associatePublicIpAddress;
        private @Nullable Boolean deleteOnTermination;
        private String description;
        private Integer deviceIndex;
        private String interfaceType;
        private Integer ipv4AddressCount;
        private List<String> ipv4Addresses;
        private Integer ipv6AddressCount;
        private List<String> ipv6Addresses;
        private @Nullable Integer networkCardIndex;
        private String networkInterfaceId;
        private String privateIpAddress;
        private List<String> securityGroups;
        private String subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLaunchTemplateNetworkInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associateCarrierIpAddress = defaults.associateCarrierIpAddress;
    	      this.associatePublicIpAddress = defaults.associatePublicIpAddress;
    	      this.deleteOnTermination = defaults.deleteOnTermination;
    	      this.description = defaults.description;
    	      this.deviceIndex = defaults.deviceIndex;
    	      this.interfaceType = defaults.interfaceType;
    	      this.ipv4AddressCount = defaults.ipv4AddressCount;
    	      this.ipv4Addresses = defaults.ipv4Addresses;
    	      this.ipv6AddressCount = defaults.ipv6AddressCount;
    	      this.ipv6Addresses = defaults.ipv6Addresses;
    	      this.networkCardIndex = defaults.networkCardIndex;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.securityGroups = defaults.securityGroups;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder setAssociateCarrierIpAddress(String associateCarrierIpAddress) {
            this.associateCarrierIpAddress = Objects.requireNonNull(associateCarrierIpAddress);
            return this;
        }

        public Builder setAssociatePublicIpAddress(@Nullable Boolean associatePublicIpAddress) {
            this.associatePublicIpAddress = associatePublicIpAddress;
            return this;
        }

        public Builder setDeleteOnTermination(@Nullable Boolean deleteOnTermination) {
            this.deleteOnTermination = deleteOnTermination;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDeviceIndex(Integer deviceIndex) {
            this.deviceIndex = Objects.requireNonNull(deviceIndex);
            return this;
        }

        public Builder setInterfaceType(String interfaceType) {
            this.interfaceType = Objects.requireNonNull(interfaceType);
            return this;
        }

        public Builder setIpv4AddressCount(Integer ipv4AddressCount) {
            this.ipv4AddressCount = Objects.requireNonNull(ipv4AddressCount);
            return this;
        }

        public Builder setIpv4Addresses(List<String> ipv4Addresses) {
            this.ipv4Addresses = Objects.requireNonNull(ipv4Addresses);
            return this;
        }

        public Builder setIpv6AddressCount(Integer ipv6AddressCount) {
            this.ipv6AddressCount = Objects.requireNonNull(ipv6AddressCount);
            return this;
        }

        public Builder setIpv6Addresses(List<String> ipv6Addresses) {
            this.ipv6Addresses = Objects.requireNonNull(ipv6Addresses);
            return this;
        }

        public Builder setNetworkCardIndex(@Nullable Integer networkCardIndex) {
            this.networkCardIndex = networkCardIndex;
            return this;
        }

        public Builder setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId);
            return this;
        }

        public Builder setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
            return this;
        }

        public Builder setSecurityGroups(List<String> securityGroups) {
            this.securityGroups = Objects.requireNonNull(securityGroups);
            return this;
        }

        public Builder setSubnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public GetLaunchTemplateNetworkInterface build() {
            return new GetLaunchTemplateNetworkInterface(associateCarrierIpAddress, associatePublicIpAddress, deleteOnTermination, description, deviceIndex, interfaceType, ipv4AddressCount, ipv4Addresses, ipv6AddressCount, ipv6Addresses, networkCardIndex, networkInterfaceId, privateIpAddress, securityGroups, subnetId);
        }
    }
}
