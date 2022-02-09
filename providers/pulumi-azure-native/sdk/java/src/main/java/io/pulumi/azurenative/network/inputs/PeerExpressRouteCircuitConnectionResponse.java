// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.SubResourceResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PeerExpressRouteCircuitConnectionResponse extends io.pulumi.resources.InvokeArgs {

    public static final PeerExpressRouteCircuitConnectionResponse Empty = new PeerExpressRouteCircuitConnectionResponse();

    @InputImport(name="addressPrefix")
    private final @Nullable String addressPrefix;

    public Optional<String> getAddressPrefix() {
        return this.addressPrefix == null ? Optional.empty() : Optional.ofNullable(this.addressPrefix);
    }

    @InputImport(name="authResourceGuid")
    private final @Nullable String authResourceGuid;

    public Optional<String> getAuthResourceGuid() {
        return this.authResourceGuid == null ? Optional.empty() : Optional.ofNullable(this.authResourceGuid);
    }

    @InputImport(name="circuitConnectionStatus", required=true)
    private final String circuitConnectionStatus;

    public String getCircuitConnectionStatus() {
        return this.circuitConnectionStatus;
    }

    @InputImport(name="connectionName")
    private final @Nullable String connectionName;

    public Optional<String> getConnectionName() {
        return this.connectionName == null ? Optional.empty() : Optional.ofNullable(this.connectionName);
    }

    @InputImport(name="etag", required=true)
    private final String etag;

    public String getEtag() {
        return this.etag;
    }

    @InputImport(name="expressRouteCircuitPeering")
    private final @Nullable SubResourceResponse expressRouteCircuitPeering;

    public Optional<SubResourceResponse> getExpressRouteCircuitPeering() {
        return this.expressRouteCircuitPeering == null ? Optional.empty() : Optional.ofNullable(this.expressRouteCircuitPeering);
    }

    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    @InputImport(name="peerExpressRouteCircuitPeering")
    private final @Nullable SubResourceResponse peerExpressRouteCircuitPeering;

    public Optional<SubResourceResponse> getPeerExpressRouteCircuitPeering() {
        return this.peerExpressRouteCircuitPeering == null ? Optional.empty() : Optional.ofNullable(this.peerExpressRouteCircuitPeering);
    }

    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public PeerExpressRouteCircuitConnectionResponse(
        @Nullable String addressPrefix,
        @Nullable String authResourceGuid,
        String circuitConnectionStatus,
        @Nullable String connectionName,
        String etag,
        @Nullable SubResourceResponse expressRouteCircuitPeering,
        @Nullable String id,
        @Nullable String name,
        @Nullable SubResourceResponse peerExpressRouteCircuitPeering,
        String provisioningState,
        String type) {
        this.addressPrefix = addressPrefix;
        this.authResourceGuid = authResourceGuid;
        this.circuitConnectionStatus = Objects.requireNonNull(circuitConnectionStatus, "expected parameter 'circuitConnectionStatus' to be non-null");
        this.connectionName = connectionName;
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.expressRouteCircuitPeering = expressRouteCircuitPeering;
        this.id = id;
        this.name = name;
        this.peerExpressRouteCircuitPeering = peerExpressRouteCircuitPeering;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private PeerExpressRouteCircuitConnectionResponse() {
        this.addressPrefix = null;
        this.authResourceGuid = null;
        this.circuitConnectionStatus = null;
        this.connectionName = null;
        this.etag = null;
        this.expressRouteCircuitPeering = null;
        this.id = null;
        this.name = null;
        this.peerExpressRouteCircuitPeering = null;
        this.provisioningState = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PeerExpressRouteCircuitConnectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String addressPrefix;
        private @Nullable String authResourceGuid;
        private String circuitConnectionStatus;
        private @Nullable String connectionName;
        private String etag;
        private @Nullable SubResourceResponse expressRouteCircuitPeering;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable SubResourceResponse peerExpressRouteCircuitPeering;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PeerExpressRouteCircuitConnectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPrefix = defaults.addressPrefix;
    	      this.authResourceGuid = defaults.authResourceGuid;
    	      this.circuitConnectionStatus = defaults.circuitConnectionStatus;
    	      this.connectionName = defaults.connectionName;
    	      this.etag = defaults.etag;
    	      this.expressRouteCircuitPeering = defaults.expressRouteCircuitPeering;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.peerExpressRouteCircuitPeering = defaults.peerExpressRouteCircuitPeering;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder setAddressPrefix(@Nullable String addressPrefix) {
            this.addressPrefix = addressPrefix;
            return this;
        }

        public Builder setAuthResourceGuid(@Nullable String authResourceGuid) {
            this.authResourceGuid = authResourceGuid;
            return this;
        }

        public Builder setCircuitConnectionStatus(String circuitConnectionStatus) {
            this.circuitConnectionStatus = Objects.requireNonNull(circuitConnectionStatus);
            return this;
        }

        public Builder setConnectionName(@Nullable String connectionName) {
            this.connectionName = connectionName;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setExpressRouteCircuitPeering(@Nullable SubResourceResponse expressRouteCircuitPeering) {
            this.expressRouteCircuitPeering = expressRouteCircuitPeering;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPeerExpressRouteCircuitPeering(@Nullable SubResourceResponse peerExpressRouteCircuitPeering) {
            this.peerExpressRouteCircuitPeering = peerExpressRouteCircuitPeering;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public PeerExpressRouteCircuitConnectionResponse build() {
            return new PeerExpressRouteCircuitConnectionResponse(addressPrefix, authResourceGuid, circuitConnectionStatus, connectionName, etag, expressRouteCircuitPeering, id, name, peerExpressRouteCircuitPeering, provisioningState, type);
        }
    }
}