// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deviceupdate.outputs;

import io.pulumi.azurenative.deviceupdate.outputs.ConnectionDetailsResponse;
import io.pulumi.azurenative.deviceupdate.outputs.PrivateLinkServiceConnectionResponse;
import io.pulumi.azurenative.deviceupdate.outputs.PrivateLinkServiceProxyResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RemotePrivateEndpointResponse {
    /**
     * List of connection details.
     * 
     */
    private final @Nullable List<ConnectionDetailsResponse> connectionDetails;
    /**
     * Remote endpoint resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * List of private link service connections that need manual approval.
     * 
     */
    private final @Nullable List<PrivateLinkServiceConnectionResponse> manualPrivateLinkServiceConnections;
    /**
     * List of automatically approved private link service connections.
     * 
     */
    private final @Nullable List<PrivateLinkServiceConnectionResponse> privateLinkServiceConnections;
    /**
     * List of private link service proxies.
     * 
     */
    private final @Nullable List<PrivateLinkServiceProxyResponse> privateLinkServiceProxies;
    /**
     * Virtual network traffic tag.
     * 
     */
    private final String vnetTrafficTag;

    @CustomType.Constructor
    private RemotePrivateEndpointResponse(
        @CustomType.Parameter("connectionDetails") @Nullable List<ConnectionDetailsResponse> connectionDetails,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("manualPrivateLinkServiceConnections") @Nullable List<PrivateLinkServiceConnectionResponse> manualPrivateLinkServiceConnections,
        @CustomType.Parameter("privateLinkServiceConnections") @Nullable List<PrivateLinkServiceConnectionResponse> privateLinkServiceConnections,
        @CustomType.Parameter("privateLinkServiceProxies") @Nullable List<PrivateLinkServiceProxyResponse> privateLinkServiceProxies,
        @CustomType.Parameter("vnetTrafficTag") String vnetTrafficTag) {
        this.connectionDetails = connectionDetails;
        this.id = id;
        this.manualPrivateLinkServiceConnections = manualPrivateLinkServiceConnections;
        this.privateLinkServiceConnections = privateLinkServiceConnections;
        this.privateLinkServiceProxies = privateLinkServiceProxies;
        this.vnetTrafficTag = vnetTrafficTag;
    }

    /**
     * List of connection details.
     * 
    */
    public List<ConnectionDetailsResponse> connectionDetails() {
        return this.connectionDetails == null ? List.of() : this.connectionDetails;
    }
    /**
     * Remote endpoint resource ID.
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * List of private link service connections that need manual approval.
     * 
    */
    public List<PrivateLinkServiceConnectionResponse> manualPrivateLinkServiceConnections() {
        return this.manualPrivateLinkServiceConnections == null ? List.of() : this.manualPrivateLinkServiceConnections;
    }
    /**
     * List of automatically approved private link service connections.
     * 
    */
    public List<PrivateLinkServiceConnectionResponse> privateLinkServiceConnections() {
        return this.privateLinkServiceConnections == null ? List.of() : this.privateLinkServiceConnections;
    }
    /**
     * List of private link service proxies.
     * 
    */
    public List<PrivateLinkServiceProxyResponse> privateLinkServiceProxies() {
        return this.privateLinkServiceProxies == null ? List.of() : this.privateLinkServiceProxies;
    }
    /**
     * Virtual network traffic tag.
     * 
    */
    public String vnetTrafficTag() {
        return this.vnetTrafficTag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RemotePrivateEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ConnectionDetailsResponse> connectionDetails;
        private @Nullable String id;
        private @Nullable List<PrivateLinkServiceConnectionResponse> manualPrivateLinkServiceConnections;
        private @Nullable List<PrivateLinkServiceConnectionResponse> privateLinkServiceConnections;
        private @Nullable List<PrivateLinkServiceProxyResponse> privateLinkServiceProxies;
        private String vnetTrafficTag;

        public Builder() {
    	      // Empty
        }

        public Builder(RemotePrivateEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionDetails = defaults.connectionDetails;
    	      this.id = defaults.id;
    	      this.manualPrivateLinkServiceConnections = defaults.manualPrivateLinkServiceConnections;
    	      this.privateLinkServiceConnections = defaults.privateLinkServiceConnections;
    	      this.privateLinkServiceProxies = defaults.privateLinkServiceProxies;
    	      this.vnetTrafficTag = defaults.vnetTrafficTag;
        }

        public Builder connectionDetails(@Nullable List<ConnectionDetailsResponse> connectionDetails) {
            this.connectionDetails = connectionDetails;
            return this;
        }
        public Builder connectionDetails(ConnectionDetailsResponse... connectionDetails) {
            return connectionDetails(List.of(connectionDetails));
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder manualPrivateLinkServiceConnections(@Nullable List<PrivateLinkServiceConnectionResponse> manualPrivateLinkServiceConnections) {
            this.manualPrivateLinkServiceConnections = manualPrivateLinkServiceConnections;
            return this;
        }
        public Builder manualPrivateLinkServiceConnections(PrivateLinkServiceConnectionResponse... manualPrivateLinkServiceConnections) {
            return manualPrivateLinkServiceConnections(List.of(manualPrivateLinkServiceConnections));
        }
        public Builder privateLinkServiceConnections(@Nullable List<PrivateLinkServiceConnectionResponse> privateLinkServiceConnections) {
            this.privateLinkServiceConnections = privateLinkServiceConnections;
            return this;
        }
        public Builder privateLinkServiceConnections(PrivateLinkServiceConnectionResponse... privateLinkServiceConnections) {
            return privateLinkServiceConnections(List.of(privateLinkServiceConnections));
        }
        public Builder privateLinkServiceProxies(@Nullable List<PrivateLinkServiceProxyResponse> privateLinkServiceProxies) {
            this.privateLinkServiceProxies = privateLinkServiceProxies;
            return this;
        }
        public Builder privateLinkServiceProxies(PrivateLinkServiceProxyResponse... privateLinkServiceProxies) {
            return privateLinkServiceProxies(List.of(privateLinkServiceProxies));
        }
        public Builder vnetTrafficTag(String vnetTrafficTag) {
            this.vnetTrafficTag = Objects.requireNonNull(vnetTrafficTag);
            return this;
        }        public RemotePrivateEndpointResponse build() {
            return new RemotePrivateEndpointResponse(connectionDetails, id, manualPrivateLinkServiceConnections, privateLinkServiceConnections, privateLinkServiceProxies, vnetTrafficTag);
        }
    }
}
