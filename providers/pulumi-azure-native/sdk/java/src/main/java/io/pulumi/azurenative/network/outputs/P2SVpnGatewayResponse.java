// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.P2SConnectionConfigurationResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.azurenative.network.outputs.VpnClientConnectionHealthResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class P2SVpnGatewayResponse {
    /**
     * List of all customer specified DNS servers IP addresses.
     * 
     */
    private final @Nullable List<String> customDnsServers;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * Enable Routing Preference property for the Public IP Interface of the P2SVpnGateway.
     * 
     */
    private final @Nullable Boolean isRoutingPreferenceInternet;
    /**
     * Resource location.
     * 
     */
    private final String location;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * List of all p2s connection configurations of the gateway.
     * 
     */
    private final @Nullable List<P2SConnectionConfigurationResponse> p2SConnectionConfigurations;
    /**
     * The provisioning state of the P2S VPN gateway resource.
     * 
     */
    private final String provisioningState;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * The VirtualHub to which the gateway belongs.
     * 
     */
    private final @Nullable SubResourceResponse virtualHub;
    /**
     * All P2S VPN clients' connection health status.
     * 
     */
    private final VpnClientConnectionHealthResponse vpnClientConnectionHealth;
    /**
     * The scale unit for this p2s vpn gateway.
     * 
     */
    private final @Nullable Integer vpnGatewayScaleUnit;
    /**
     * The VpnServerConfiguration to which the p2sVpnGateway is attached to.
     * 
     */
    private final @Nullable SubResourceResponse vpnServerConfiguration;

    @CustomType.Constructor
    private P2SVpnGatewayResponse(
        @CustomType.Parameter("customDnsServers") @Nullable List<String> customDnsServers,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("isRoutingPreferenceInternet") @Nullable Boolean isRoutingPreferenceInternet,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("p2SConnectionConfigurations") @Nullable List<P2SConnectionConfigurationResponse> p2SConnectionConfigurations,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("virtualHub") @Nullable SubResourceResponse virtualHub,
        @CustomType.Parameter("vpnClientConnectionHealth") VpnClientConnectionHealthResponse vpnClientConnectionHealth,
        @CustomType.Parameter("vpnGatewayScaleUnit") @Nullable Integer vpnGatewayScaleUnit,
        @CustomType.Parameter("vpnServerConfiguration") @Nullable SubResourceResponse vpnServerConfiguration) {
        this.customDnsServers = customDnsServers;
        this.etag = etag;
        this.id = id;
        this.isRoutingPreferenceInternet = isRoutingPreferenceInternet;
        this.location = location;
        this.name = name;
        this.p2SConnectionConfigurations = p2SConnectionConfigurations;
        this.provisioningState = provisioningState;
        this.tags = tags;
        this.type = type;
        this.virtualHub = virtualHub;
        this.vpnClientConnectionHealth = vpnClientConnectionHealth;
        this.vpnGatewayScaleUnit = vpnGatewayScaleUnit;
        this.vpnServerConfiguration = vpnServerConfiguration;
    }

    /**
     * List of all customer specified DNS servers IP addresses.
     * 
    */
    public List<String> customDnsServers() {
        return this.customDnsServers == null ? List.of() : this.customDnsServers;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String etag() {
        return this.etag;
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Enable Routing Preference property for the Public IP Interface of the P2SVpnGateway.
     * 
    */
    public Optional<Boolean> isRoutingPreferenceInternet() {
        return Optional.ofNullable(this.isRoutingPreferenceInternet);
    }
    /**
     * Resource location.
     * 
    */
    public String location() {
        return this.location;
    }
    /**
     * Resource name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * List of all p2s connection configurations of the gateway.
     * 
    */
    public List<P2SConnectionConfigurationResponse> p2SConnectionConfigurations() {
        return this.p2SConnectionConfigurations == null ? List.of() : this.p2SConnectionConfigurations;
    }
    /**
     * The provisioning state of the P2S VPN gateway resource.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * The VirtualHub to which the gateway belongs.
     * 
    */
    public Optional<SubResourceResponse> virtualHub() {
        return Optional.ofNullable(this.virtualHub);
    }
    /**
     * All P2S VPN clients' connection health status.
     * 
    */
    public VpnClientConnectionHealthResponse vpnClientConnectionHealth() {
        return this.vpnClientConnectionHealth;
    }
    /**
     * The scale unit for this p2s vpn gateway.
     * 
    */
    public Optional<Integer> vpnGatewayScaleUnit() {
        return Optional.ofNullable(this.vpnGatewayScaleUnit);
    }
    /**
     * The VpnServerConfiguration to which the p2sVpnGateway is attached to.
     * 
    */
    public Optional<SubResourceResponse> vpnServerConfiguration() {
        return Optional.ofNullable(this.vpnServerConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(P2SVpnGatewayResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> customDnsServers;
        private String etag;
        private @Nullable String id;
        private @Nullable Boolean isRoutingPreferenceInternet;
        private String location;
        private String name;
        private @Nullable List<P2SConnectionConfigurationResponse> p2SConnectionConfigurations;
        private String provisioningState;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable SubResourceResponse virtualHub;
        private VpnClientConnectionHealthResponse vpnClientConnectionHealth;
        private @Nullable Integer vpnGatewayScaleUnit;
        private @Nullable SubResourceResponse vpnServerConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(P2SVpnGatewayResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customDnsServers = defaults.customDnsServers;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.isRoutingPreferenceInternet = defaults.isRoutingPreferenceInternet;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.p2SConnectionConfigurations = defaults.p2SConnectionConfigurations;
    	      this.provisioningState = defaults.provisioningState;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.virtualHub = defaults.virtualHub;
    	      this.vpnClientConnectionHealth = defaults.vpnClientConnectionHealth;
    	      this.vpnGatewayScaleUnit = defaults.vpnGatewayScaleUnit;
    	      this.vpnServerConfiguration = defaults.vpnServerConfiguration;
        }

        public Builder customDnsServers(@Nullable List<String> customDnsServers) {
            this.customDnsServers = customDnsServers;
            return this;
        }
        public Builder customDnsServers(String... customDnsServers) {
            return customDnsServers(List.of(customDnsServers));
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder isRoutingPreferenceInternet(@Nullable Boolean isRoutingPreferenceInternet) {
            this.isRoutingPreferenceInternet = isRoutingPreferenceInternet;
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder p2SConnectionConfigurations(@Nullable List<P2SConnectionConfigurationResponse> p2SConnectionConfigurations) {
            this.p2SConnectionConfigurations = p2SConnectionConfigurations;
            return this;
        }
        public Builder p2SConnectionConfigurations(P2SConnectionConfigurationResponse... p2SConnectionConfigurations) {
            return p2SConnectionConfigurations(List.of(p2SConnectionConfigurations));
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder virtualHub(@Nullable SubResourceResponse virtualHub) {
            this.virtualHub = virtualHub;
            return this;
        }
        public Builder vpnClientConnectionHealth(VpnClientConnectionHealthResponse vpnClientConnectionHealth) {
            this.vpnClientConnectionHealth = Objects.requireNonNull(vpnClientConnectionHealth);
            return this;
        }
        public Builder vpnGatewayScaleUnit(@Nullable Integer vpnGatewayScaleUnit) {
            this.vpnGatewayScaleUnit = vpnGatewayScaleUnit;
            return this;
        }
        public Builder vpnServerConfiguration(@Nullable SubResourceResponse vpnServerConfiguration) {
            this.vpnServerConfiguration = vpnServerConfiguration;
            return this;
        }        public P2SVpnGatewayResponse build() {
            return new P2SVpnGatewayResponse(customDnsServers, etag, id, isRoutingPreferenceInternet, location, name, p2SConnectionConfigurations, provisioningState, tags, type, virtualHub, vpnClientConnectionHealth, vpnGatewayScaleUnit, vpnServerConfiguration);
        }
    }
}
