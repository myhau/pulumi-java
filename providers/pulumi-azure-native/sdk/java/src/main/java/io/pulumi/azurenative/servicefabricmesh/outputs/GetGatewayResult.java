// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.outputs;

import io.pulumi.azurenative.servicefabricmesh.outputs.HttpConfigResponse;
import io.pulumi.azurenative.servicefabricmesh.outputs.NetworkRefResponse;
import io.pulumi.azurenative.servicefabricmesh.outputs.TcpConfigResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGatewayResult {
    /**
     * User readable description of the gateway.
     * 
     */
    private final @Nullable String description;
    /**
     * Network that the Application is using.
     * 
     */
    private final NetworkRefResponse destinationNetwork;
    /**
     * Configuration for http connectivity for this gateway.
     * 
     */
    private final @Nullable List<HttpConfigResponse> http;
    /**
     * Fully qualified identifier for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * IP address of the gateway. This is populated in the response and is ignored for incoming requests.
     * 
     */
    private final String ipAddress;
    /**
     * The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * State of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * Network the gateway should listen on for requests.
     * 
     */
    private final NetworkRefResponse sourceNetwork;
    /**
     * Status of the resource.
     * 
     */
    private final String status;
    /**
     * Gives additional information about the current status of the gateway.
     * 
     */
    private final String statusDetails;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Configuration for tcp connectivity for this gateway.
     * 
     */
    private final @Nullable List<TcpConfigResponse> tcp;
    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetGatewayResult(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("destinationNetwork") NetworkRefResponse destinationNetwork,
        @CustomType.Parameter("http") @Nullable List<HttpConfigResponse> http,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ipAddress") String ipAddress,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("sourceNetwork") NetworkRefResponse sourceNetwork,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("statusDetails") String statusDetails,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("tcp") @Nullable List<TcpConfigResponse> tcp,
        @CustomType.Parameter("type") String type) {
        this.description = description;
        this.destinationNetwork = destinationNetwork;
        this.http = http;
        this.id = id;
        this.ipAddress = ipAddress;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.sourceNetwork = sourceNetwork;
        this.status = status;
        this.statusDetails = statusDetails;
        this.tags = tags;
        this.tcp = tcp;
        this.type = type;
    }

    /**
     * User readable description of the gateway.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Network that the Application is using.
     * 
    */
    public NetworkRefResponse destinationNetwork() {
        return this.destinationNetwork;
    }
    /**
     * Configuration for http connectivity for this gateway.
     * 
    */
    public List<HttpConfigResponse> http() {
        return this.http == null ? List.of() : this.http;
    }
    /**
     * Fully qualified identifier for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * IP address of the gateway. This is populated in the response and is ignored for incoming requests.
     * 
    */
    public String ipAddress() {
        return this.ipAddress;
    }
    /**
     * The geo-location where the resource lives
     * 
    */
    public String location() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * State of the resource.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * Network the gateway should listen on for requests.
     * 
    */
    public NetworkRefResponse sourceNetwork() {
        return this.sourceNetwork;
    }
    /**
     * Status of the resource.
     * 
    */
    public String status() {
        return this.status;
    }
    /**
     * Gives additional information about the current status of the gateway.
     * 
    */
    public String statusDetails() {
        return this.statusDetails;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Configuration for tcp connectivity for this gateway.
     * 
    */
    public List<TcpConfigResponse> tcp() {
        return this.tcp == null ? List.of() : this.tcp;
    }
    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private NetworkRefResponse destinationNetwork;
        private @Nullable List<HttpConfigResponse> http;
        private String id;
        private String ipAddress;
        private String location;
        private String name;
        private String provisioningState;
        private NetworkRefResponse sourceNetwork;
        private String status;
        private String statusDetails;
        private @Nullable Map<String,String> tags;
        private @Nullable List<TcpConfigResponse> tcp;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGatewayResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.destinationNetwork = defaults.destinationNetwork;
    	      this.http = defaults.http;
    	      this.id = defaults.id;
    	      this.ipAddress = defaults.ipAddress;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sourceNetwork = defaults.sourceNetwork;
    	      this.status = defaults.status;
    	      this.statusDetails = defaults.statusDetails;
    	      this.tags = defaults.tags;
    	      this.tcp = defaults.tcp;
    	      this.type = defaults.type;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder destinationNetwork(NetworkRefResponse destinationNetwork) {
            this.destinationNetwork = Objects.requireNonNull(destinationNetwork);
            return this;
        }
        public Builder http(@Nullable List<HttpConfigResponse> http) {
            this.http = http;
            return this;
        }
        public Builder http(HttpConfigResponse... http) {
            return http(List.of(http));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
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
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder sourceNetwork(NetworkRefResponse sourceNetwork) {
            this.sourceNetwork = Objects.requireNonNull(sourceNetwork);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder statusDetails(String statusDetails) {
            this.statusDetails = Objects.requireNonNull(statusDetails);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tcp(@Nullable List<TcpConfigResponse> tcp) {
            this.tcp = tcp;
            return this;
        }
        public Builder tcp(TcpConfigResponse... tcp) {
            return tcp(List.of(tcp));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetGatewayResult build() {
            return new GetGatewayResult(description, destinationNetwork, http, id, ipAddress, location, name, provisioningState, sourceNetwork, status, statusDetails, tags, tcp, type);
        }
    }
}
