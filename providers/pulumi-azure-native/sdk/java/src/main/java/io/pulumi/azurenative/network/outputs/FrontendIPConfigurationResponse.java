// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.PublicIPAddressResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.azurenative.network.outputs.SubnetResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FrontendIPConfigurationResponse {
    private final String etag;
    private final @Nullable String id;
    private final List<SubResourceResponse> inboundNatPools;
    private final List<SubResourceResponse> inboundNatRules;
    private final List<SubResourceResponse> loadBalancingRules;
    private final @Nullable String name;
    private final List<SubResourceResponse> outboundRules;
    private final @Nullable String privateIPAddress;
    private final @Nullable String privateIPAddressVersion;
    private final @Nullable String privateIPAllocationMethod;
    private final String provisioningState;
    private final @Nullable PublicIPAddressResponse publicIPAddress;
    private final @Nullable SubResourceResponse publicIPPrefix;
    private final @Nullable SubnetResponse subnet;
    private final String type;
    private final @Nullable List<String> zones;

    @OutputCustomType.Constructor({"etag","id","inboundNatPools","inboundNatRules","loadBalancingRules","name","outboundRules","privateIPAddress","privateIPAddressVersion","privateIPAllocationMethod","provisioningState","publicIPAddress","publicIPPrefix","subnet","type","zones"})
    private FrontendIPConfigurationResponse(
        String etag,
        @Nullable String id,
        List<SubResourceResponse> inboundNatPools,
        List<SubResourceResponse> inboundNatRules,
        List<SubResourceResponse> loadBalancingRules,
        @Nullable String name,
        List<SubResourceResponse> outboundRules,
        @Nullable String privateIPAddress,
        @Nullable String privateIPAddressVersion,
        @Nullable String privateIPAllocationMethod,
        String provisioningState,
        @Nullable PublicIPAddressResponse publicIPAddress,
        @Nullable SubResourceResponse publicIPPrefix,
        @Nullable SubnetResponse subnet,
        String type,
        @Nullable List<String> zones) {
        this.etag = Objects.requireNonNull(etag);
        this.id = id;
        this.inboundNatPools = Objects.requireNonNull(inboundNatPools);
        this.inboundNatRules = Objects.requireNonNull(inboundNatRules);
        this.loadBalancingRules = Objects.requireNonNull(loadBalancingRules);
        this.name = name;
        this.outboundRules = Objects.requireNonNull(outboundRules);
        this.privateIPAddress = privateIPAddress;
        this.privateIPAddressVersion = privateIPAddressVersion;
        this.privateIPAllocationMethod = privateIPAllocationMethod;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.publicIPAddress = publicIPAddress;
        this.publicIPPrefix = publicIPPrefix;
        this.subnet = subnet;
        this.type = Objects.requireNonNull(type);
        this.zones = zones;
    }

    public String getEtag() {
        return this.etag;
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public List<SubResourceResponse> getInboundNatPools() {
        return this.inboundNatPools;
    }
    public List<SubResourceResponse> getInboundNatRules() {
        return this.inboundNatRules;
    }
    public List<SubResourceResponse> getLoadBalancingRules() {
        return this.loadBalancingRules;
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public List<SubResourceResponse> getOutboundRules() {
        return this.outboundRules;
    }
    public Optional<String> getPrivateIPAddress() {
        return Optional.ofNullable(this.privateIPAddress);
    }
    public Optional<String> getPrivateIPAddressVersion() {
        return Optional.ofNullable(this.privateIPAddressVersion);
    }
    public Optional<String> getPrivateIPAllocationMethod() {
        return Optional.ofNullable(this.privateIPAllocationMethod);
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public Optional<PublicIPAddressResponse> getPublicIPAddress() {
        return Optional.ofNullable(this.publicIPAddress);
    }
    public Optional<SubResourceResponse> getPublicIPPrefix() {
        return Optional.ofNullable(this.publicIPPrefix);
    }
    public Optional<SubnetResponse> getSubnet() {
        return Optional.ofNullable(this.subnet);
    }
    public String getType() {
        return this.type;
    }
    public List<String> getZones() {
        return this.zones == null ? List.of() : this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrontendIPConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable String id;
        private List<SubResourceResponse> inboundNatPools;
        private List<SubResourceResponse> inboundNatRules;
        private List<SubResourceResponse> loadBalancingRules;
        private @Nullable String name;
        private List<SubResourceResponse> outboundRules;
        private @Nullable String privateIPAddress;
        private @Nullable String privateIPAddressVersion;
        private @Nullable String privateIPAllocationMethod;
        private String provisioningState;
        private @Nullable PublicIPAddressResponse publicIPAddress;
        private @Nullable SubResourceResponse publicIPPrefix;
        private @Nullable SubnetResponse subnet;
        private String type;
        private @Nullable List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(FrontendIPConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.inboundNatPools = defaults.inboundNatPools;
    	      this.inboundNatRules = defaults.inboundNatRules;
    	      this.loadBalancingRules = defaults.loadBalancingRules;
    	      this.name = defaults.name;
    	      this.outboundRules = defaults.outboundRules;
    	      this.privateIPAddress = defaults.privateIPAddress;
    	      this.privateIPAddressVersion = defaults.privateIPAddressVersion;
    	      this.privateIPAllocationMethod = defaults.privateIPAllocationMethod;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicIPAddress = defaults.publicIPAddress;
    	      this.publicIPPrefix = defaults.publicIPPrefix;
    	      this.subnet = defaults.subnet;
    	      this.type = defaults.type;
    	      this.zones = defaults.zones;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setInboundNatPools(List<SubResourceResponse> inboundNatPools) {
            this.inboundNatPools = Objects.requireNonNull(inboundNatPools);
            return this;
        }

        public Builder setInboundNatRules(List<SubResourceResponse> inboundNatRules) {
            this.inboundNatRules = Objects.requireNonNull(inboundNatRules);
            return this;
        }

        public Builder setLoadBalancingRules(List<SubResourceResponse> loadBalancingRules) {
            this.loadBalancingRules = Objects.requireNonNull(loadBalancingRules);
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setOutboundRules(List<SubResourceResponse> outboundRules) {
            this.outboundRules = Objects.requireNonNull(outboundRules);
            return this;
        }

        public Builder setPrivateIPAddress(@Nullable String privateIPAddress) {
            this.privateIPAddress = privateIPAddress;
            return this;
        }

        public Builder setPrivateIPAddressVersion(@Nullable String privateIPAddressVersion) {
            this.privateIPAddressVersion = privateIPAddressVersion;
            return this;
        }

        public Builder setPrivateIPAllocationMethod(@Nullable String privateIPAllocationMethod) {
            this.privateIPAllocationMethod = privateIPAllocationMethod;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPublicIPAddress(@Nullable PublicIPAddressResponse publicIPAddress) {
            this.publicIPAddress = publicIPAddress;
            return this;
        }

        public Builder setPublicIPPrefix(@Nullable SubResourceResponse publicIPPrefix) {
            this.publicIPPrefix = publicIPPrefix;
            return this;
        }

        public Builder setSubnet(@Nullable SubnetResponse subnet) {
            this.subnet = subnet;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setZones(@Nullable List<String> zones) {
            this.zones = zones;
            return this;
        }

        public FrontendIPConfigurationResponse build() {
            return new FrontendIPConfigurationResponse(etag, id, inboundNatPools, inboundNatRules, loadBalancingRules, name, outboundRules, privateIPAddress, privateIPAddressVersion, privateIPAllocationMethod, provisioningState, publicIPAddress, publicIPPrefix, subnet, type, zones);
        }
    }
}