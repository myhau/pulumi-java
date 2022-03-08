// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAFDEndpointResult {
    private final String deploymentStatus;
    /**
     * Whether to enable use of this rule. Permitted values are 'Enabled' or 'Disabled'
     * 
     */
    private final @Nullable String enabledState;
    /**
     * The host name of the endpoint structured as {endpointName}.{DNSZone}, e.g. contoso.azureedge.net
     * 
     */
    private final String hostName;
    /**
     * Resource ID.
     * 
     */
    private final String id;
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
     * Send and receive timeout on forwarding request to the origin. When timeout is reached, the request fails and returns.
     * 
     */
    private final @Nullable Integer originResponseTimeoutSeconds;
    /**
     * Provisioning status
     * 
     */
    private final String provisioningState;
    /**
     * Read only system data
     * 
     */
    private final SystemDataResponse systemData;
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

    @OutputCustomType.Constructor({"deploymentStatus","enabledState","hostName","id","location","name","originResponseTimeoutSeconds","provisioningState","systemData","tags","type"})
    private GetAFDEndpointResult(
        String deploymentStatus,
        @Nullable String enabledState,
        String hostName,
        String id,
        String location,
        String name,
        @Nullable Integer originResponseTimeoutSeconds,
        String provisioningState,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        String type) {
        this.deploymentStatus = deploymentStatus;
        this.enabledState = enabledState;
        this.hostName = hostName;
        this.id = id;
        this.location = location;
        this.name = name;
        this.originResponseTimeoutSeconds = originResponseTimeoutSeconds;
        this.provisioningState = provisioningState;
        this.systemData = systemData;
        this.tags = tags;
        this.type = type;
    }

    public String getDeploymentStatus() {
        return this.deploymentStatus;
    }
    /**
     * Whether to enable use of this rule. Permitted values are 'Enabled' or 'Disabled'
     * 
    */
    public Optional<String> getEnabledState() {
        return Optional.ofNullable(this.enabledState);
    }
    /**
     * The host name of the endpoint structured as {endpointName}.{DNSZone}, e.g. contoso.azureedge.net
     * 
    */
    public String getHostName() {
        return this.hostName;
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource location.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Send and receive timeout on forwarding request to the origin. When timeout is reached, the request fails and returns.
     * 
    */
    public Optional<Integer> getOriginResponseTimeoutSeconds() {
        return Optional.ofNullable(this.originResponseTimeoutSeconds);
    }
    /**
     * Provisioning status
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Read only system data
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAFDEndpointResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deploymentStatus;
        private @Nullable String enabledState;
        private String hostName;
        private String id;
        private String location;
        private String name;
        private @Nullable Integer originResponseTimeoutSeconds;
        private String provisioningState;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAFDEndpointResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentStatus = defaults.deploymentStatus;
    	      this.enabledState = defaults.enabledState;
    	      this.hostName = defaults.hostName;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.originResponseTimeoutSeconds = defaults.originResponseTimeoutSeconds;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setDeploymentStatus(String deploymentStatus) {
            this.deploymentStatus = Objects.requireNonNull(deploymentStatus);
            return this;
        }

        public Builder setEnabledState(@Nullable String enabledState) {
            this.enabledState = enabledState;
            return this;
        }

        public Builder setHostName(String hostName) {
            this.hostName = Objects.requireNonNull(hostName);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOriginResponseTimeoutSeconds(@Nullable Integer originResponseTimeoutSeconds) {
            this.originResponseTimeoutSeconds = originResponseTimeoutSeconds;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetAFDEndpointResult build() {
            return new GetAFDEndpointResult(deploymentStatus, enabledState, hostName, id, location, name, originResponseTimeoutSeconds, provisioningState, systemData, tags, type);
        }
    }
}
