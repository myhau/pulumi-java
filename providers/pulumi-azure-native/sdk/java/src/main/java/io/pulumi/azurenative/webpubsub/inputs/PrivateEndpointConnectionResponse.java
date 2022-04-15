// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.inputs;

import io.pulumi.azurenative.webpubsub.inputs.PrivateEndpointResponse;
import io.pulumi.azurenative.webpubsub.inputs.PrivateLinkServiceConnectionStateResponse;
import io.pulumi.azurenative.webpubsub.inputs.SystemDataResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A private endpoint connection to an azure resource
 * 
 */
public final class PrivateEndpointConnectionResponse extends io.pulumi.resources.InvokeArgs {

    public static final PrivateEndpointConnectionResponse Empty = new PrivateEndpointConnectionResponse();

    /**
     * Fully qualified resource Id for the resource.
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String id() {
        return this.id;
    }

    /**
     * The name of the resource.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * Private endpoint associated with the private endpoint connection
     * 
     */
    @Import(name="privateEndpoint")
      private final @Nullable PrivateEndpointResponse privateEndpoint;

    public Optional<PrivateEndpointResponse> privateEndpoint() {
        return this.privateEndpoint == null ? Optional.empty() : Optional.ofNullable(this.privateEndpoint);
    }

    /**
     * Connection state
     * 
     */
    @Import(name="privateLinkServiceConnectionState")
      private final @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;

    public Optional<PrivateLinkServiceConnectionStateResponse> privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState == null ? Optional.empty() : Optional.ofNullable(this.privateLinkServiceConnectionState);
    }

    /**
     * Provisioning state of the private endpoint connection
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @Import(name="systemData", required=true)
      private final SystemDataResponse systemData;

    public SystemDataResponse systemData() {
        return this.systemData;
    }

    /**
     * The type of the resource - e.g. "Microsoft.SignalRService/SignalR"
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public PrivateEndpointConnectionResponse(
        String id,
        String name,
        @Nullable PrivateEndpointResponse privateEndpoint,
        @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState,
        String provisioningState,
        SystemDataResponse systemData,
        String type) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.privateEndpoint = privateEndpoint;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.systemData = Objects.requireNonNull(systemData, "expected parameter 'systemData' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private PrivateEndpointConnectionResponse() {
        this.id = null;
        this.name = null;
        this.privateEndpoint = null;
        this.privateLinkServiceConnectionState = null;
        this.provisioningState = null;
        this.systemData = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private @Nullable PrivateEndpointResponse privateEndpoint;
        private @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;
        private String provisioningState;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder privateEndpoint(@Nullable PrivateEndpointResponse privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }
        public Builder privateLinkServiceConnectionState(@Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public PrivateEndpointConnectionResponse build() {
            return new PrivateEndpointConnectionResponse(id, name, privateEndpoint, privateLinkServiceConnectionState, provisioningState, systemData, type);
        }
    }
}
