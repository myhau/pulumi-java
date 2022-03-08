// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.ArmIdWrapperResponse;
import io.pulumi.azurenative.datafactory.outputs.PrivateLinkConnectionStateResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RemotePrivateEndpointConnectionResponse {
    /**
     * PrivateEndpoint of a remote private endpoint connection
     * 
     */
    private final @Nullable ArmIdWrapperResponse privateEndpoint;
    /**
     * The state of a private link connection
     * 
     */
    private final @Nullable PrivateLinkConnectionStateResponse privateLinkServiceConnectionState;
    private final String provisioningState;

    @OutputCustomType.Constructor({"privateEndpoint","privateLinkServiceConnectionState","provisioningState"})
    private RemotePrivateEndpointConnectionResponse(
        @Nullable ArmIdWrapperResponse privateEndpoint,
        @Nullable PrivateLinkConnectionStateResponse privateLinkServiceConnectionState,
        String provisioningState) {
        this.privateEndpoint = privateEndpoint;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.provisioningState = provisioningState;
    }

    /**
     * PrivateEndpoint of a remote private endpoint connection
     * 
    */
    public Optional<ArmIdWrapperResponse> getPrivateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }
    /**
     * The state of a private link connection
     * 
    */
    public Optional<PrivateLinkConnectionStateResponse> getPrivateLinkServiceConnectionState() {
        return Optional.ofNullable(this.privateLinkServiceConnectionState);
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RemotePrivateEndpointConnectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ArmIdWrapperResponse privateEndpoint;
        private @Nullable PrivateLinkConnectionStateResponse privateLinkServiceConnectionState;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(RemotePrivateEndpointConnectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder setPrivateEndpoint(@Nullable ArmIdWrapperResponse privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }

        public Builder setPrivateLinkServiceConnectionState(@Nullable PrivateLinkConnectionStateResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public RemotePrivateEndpointConnectionResponse build() {
            return new RemotePrivateEndpointConnectionResponse(privateEndpoint, privateLinkServiceConnectionState, provisioningState);
        }
    }
}
