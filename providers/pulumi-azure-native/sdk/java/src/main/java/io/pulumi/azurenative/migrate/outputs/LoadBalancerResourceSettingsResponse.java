// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.azurenative.migrate.outputs.LBBackendAddressPoolResourceSettingsResponse;
import io.pulumi.azurenative.migrate.outputs.LBFrontendIPConfigurationResourceSettingsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LoadBalancerResourceSettingsResponse {
    /**
     * Gets or sets the backend address pools of the load balancer.
     * 
     */
    private final @Nullable List<LBBackendAddressPoolResourceSettingsResponse> backendAddressPools;
    /**
     * Gets or sets the frontend IP configurations of the load balancer.
     * 
     */
    private final @Nullable List<LBFrontendIPConfigurationResourceSettingsResponse> frontendIPConfigurations;
    /**
     * The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is 'Microsoft.Network/loadBalancers'.
     * 
     */
    private final String resourceType;
    /**
     * Gets or sets load balancer sku (Basic/Standard).
     * 
     */
    private final @Nullable String sku;
    /**
     * Gets or sets the target Resource name.
     * 
     */
    private final String targetResourceName;
    /**
     * Gets or sets the csv list of zones common for all frontend IP configurations. Note this is given
     *  precedence only if frontend IP configurations settings are not present.
     * 
     */
    private final @Nullable String zones;

    @OutputCustomType.Constructor({"backendAddressPools","frontendIPConfigurations","resourceType","sku","targetResourceName","zones"})
    private LoadBalancerResourceSettingsResponse(
        @Nullable List<LBBackendAddressPoolResourceSettingsResponse> backendAddressPools,
        @Nullable List<LBFrontendIPConfigurationResourceSettingsResponse> frontendIPConfigurations,
        String resourceType,
        @Nullable String sku,
        String targetResourceName,
        @Nullable String zones) {
        this.backendAddressPools = backendAddressPools;
        this.frontendIPConfigurations = frontendIPConfigurations;
        this.resourceType = resourceType;
        this.sku = sku;
        this.targetResourceName = targetResourceName;
        this.zones = zones;
    }

    /**
     * Gets or sets the backend address pools of the load balancer.
     * 
    */
    public List<LBBackendAddressPoolResourceSettingsResponse> getBackendAddressPools() {
        return this.backendAddressPools == null ? List.of() : this.backendAddressPools;
    }
    /**
     * Gets or sets the frontend IP configurations of the load balancer.
     * 
    */
    public List<LBFrontendIPConfigurationResourceSettingsResponse> getFrontendIPConfigurations() {
        return this.frontendIPConfigurations == null ? List.of() : this.frontendIPConfigurations;
    }
    /**
     * The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is 'Microsoft.Network/loadBalancers'.
     * 
    */
    public String getPropResourceType() {
        return this.resourceType;
    }
    /**
     * Gets or sets load balancer sku (Basic/Standard).
     * 
    */
    public Optional<String> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * Gets or sets the target Resource name.
     * 
    */
    public String getTargetResourceName() {
        return this.targetResourceName;
    }
    /**
     * Gets or sets the csv list of zones common for all frontend IP configurations. Note this is given
     *  precedence only if frontend IP configurations settings are not present.
     * 
    */
    public Optional<String> getZones() {
        return Optional.ofNullable(this.zones);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerResourceSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<LBBackendAddressPoolResourceSettingsResponse> backendAddressPools;
        private @Nullable List<LBFrontendIPConfigurationResourceSettingsResponse> frontendIPConfigurations;
        private String resourceType;
        private @Nullable String sku;
        private String targetResourceName;
        private @Nullable String zones;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerResourceSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendAddressPools = defaults.backendAddressPools;
    	      this.frontendIPConfigurations = defaults.frontendIPConfigurations;
    	      this.resourceType = defaults.resourceType;
    	      this.sku = defaults.sku;
    	      this.targetResourceName = defaults.targetResourceName;
    	      this.zones = defaults.zones;
        }

        public Builder setBackendAddressPools(@Nullable List<LBBackendAddressPoolResourceSettingsResponse> backendAddressPools) {
            this.backendAddressPools = backendAddressPools;
            return this;
        }

        public Builder setFrontendIPConfigurations(@Nullable List<LBFrontendIPConfigurationResourceSettingsResponse> frontendIPConfigurations) {
            this.frontendIPConfigurations = frontendIPConfigurations;
            return this;
        }

        public Builder setResourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }

        public Builder setSku(@Nullable String sku) {
            this.sku = sku;
            return this;
        }

        public Builder setTargetResourceName(String targetResourceName) {
            this.targetResourceName = Objects.requireNonNull(targetResourceName);
            return this;
        }

        public Builder setZones(@Nullable String zones) {
            this.zones = zones;
            return this;
        }
        public LoadBalancerResourceSettingsResponse build() {
            return new LoadBalancerResourceSettingsResponse(backendAddressPools, frontendIPConfigurations, resourceType, sku, targetResourceName, zones);
        }
    }
}
