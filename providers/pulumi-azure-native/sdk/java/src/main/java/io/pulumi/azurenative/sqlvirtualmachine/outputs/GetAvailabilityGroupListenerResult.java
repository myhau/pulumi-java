// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine.outputs;

import io.pulumi.azurenative.sqlvirtualmachine.outputs.LoadBalancerConfigurationResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAvailabilityGroupListenerResult {
    /**
     * Name of the availability group.
     * 
     */
    private final @Nullable String availabilityGroupName;
    /**
     * Create a default availability group if it does not exist.
     * 
     */
    private final @Nullable Boolean createDefaultAvailabilityGroupIfNotExist;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * List of load balancer configurations for an availability group listener.
     * 
     */
    private final @Nullable List<LoadBalancerConfigurationResponse> loadBalancerConfigurations;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Listener port.
     * 
     */
    private final @Nullable Integer port;
    /**
     * Provisioning state to track the async operation status.
     * 
     */
    private final String provisioningState;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetAvailabilityGroupListenerResult(
        @CustomType.Parameter("availabilityGroupName") @Nullable String availabilityGroupName,
        @CustomType.Parameter("createDefaultAvailabilityGroupIfNotExist") @Nullable Boolean createDefaultAvailabilityGroupIfNotExist,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("loadBalancerConfigurations") @Nullable List<LoadBalancerConfigurationResponse> loadBalancerConfigurations,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("port") @Nullable Integer port,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("type") String type) {
        this.availabilityGroupName = availabilityGroupName;
        this.createDefaultAvailabilityGroupIfNotExist = createDefaultAvailabilityGroupIfNotExist;
        this.id = id;
        this.loadBalancerConfigurations = loadBalancerConfigurations;
        this.name = name;
        this.port = port;
        this.provisioningState = provisioningState;
        this.type = type;
    }

    /**
     * Name of the availability group.
     * 
    */
    public Optional<String> availabilityGroupName() {
        return Optional.ofNullable(this.availabilityGroupName);
    }
    /**
     * Create a default availability group if it does not exist.
     * 
    */
    public Optional<Boolean> createDefaultAvailabilityGroupIfNotExist() {
        return Optional.ofNullable(this.createDefaultAvailabilityGroupIfNotExist);
    }
    /**
     * Resource ID.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * List of load balancer configurations for an availability group listener.
     * 
    */
    public List<LoadBalancerConfigurationResponse> loadBalancerConfigurations() {
        return this.loadBalancerConfigurations == null ? List.of() : this.loadBalancerConfigurations;
    }
    /**
     * Resource name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Listener port.
     * 
    */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * Provisioning state to track the async operation status.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource type.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAvailabilityGroupListenerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String availabilityGroupName;
        private @Nullable Boolean createDefaultAvailabilityGroupIfNotExist;
        private String id;
        private @Nullable List<LoadBalancerConfigurationResponse> loadBalancerConfigurations;
        private String name;
        private @Nullable Integer port;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAvailabilityGroupListenerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityGroupName = defaults.availabilityGroupName;
    	      this.createDefaultAvailabilityGroupIfNotExist = defaults.createDefaultAvailabilityGroupIfNotExist;
    	      this.id = defaults.id;
    	      this.loadBalancerConfigurations = defaults.loadBalancerConfigurations;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder availabilityGroupName(@Nullable String availabilityGroupName) {
            this.availabilityGroupName = availabilityGroupName;
            return this;
        }
        public Builder createDefaultAvailabilityGroupIfNotExist(@Nullable Boolean createDefaultAvailabilityGroupIfNotExist) {
            this.createDefaultAvailabilityGroupIfNotExist = createDefaultAvailabilityGroupIfNotExist;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder loadBalancerConfigurations(@Nullable List<LoadBalancerConfigurationResponse> loadBalancerConfigurations) {
            this.loadBalancerConfigurations = loadBalancerConfigurations;
            return this;
        }
        public Builder loadBalancerConfigurations(LoadBalancerConfigurationResponse... loadBalancerConfigurations) {
            return loadBalancerConfigurations(List.of(loadBalancerConfigurations));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetAvailabilityGroupListenerResult build() {
            return new GetAvailabilityGroupListenerResult(availabilityGroupName, createDefaultAvailabilityGroupIfNotExist, id, loadBalancerConfigurations, name, port, provisioningState, type);
        }
    }
}
