// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.VirtualNetworkTapResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetNetworkInterfaceTapConfigurationResult {
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
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * The provisioning state of the network interface tap configuration resource.
     * 
     */
    private final String provisioningState;
    /**
     * Sub Resource type.
     * 
     */
    private final String type;
    /**
     * The reference to the Virtual Network Tap resource.
     * 
     */
    private final @Nullable VirtualNetworkTapResponse virtualNetworkTap;

    @OutputCustomType.Constructor({"etag","id","name","provisioningState","type","virtualNetworkTap"})
    private GetNetworkInterfaceTapConfigurationResult(
        String etag,
        @Nullable String id,
        @Nullable String name,
        String provisioningState,
        String type,
        @Nullable VirtualNetworkTapResponse virtualNetworkTap) {
        this.etag = etag;
        this.id = id;
        this.name = name;
        this.provisioningState = provisioningState;
        this.type = type;
        this.virtualNetworkTap = virtualNetworkTap;
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The provisioning state of the network interface tap configuration resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Sub Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The reference to the Virtual Network Tap resource.
     * 
    */
    public Optional<VirtualNetworkTapResponse> getVirtualNetworkTap() {
        return Optional.ofNullable(this.virtualNetworkTap);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkInterfaceTapConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private String provisioningState;
        private String type;
        private @Nullable VirtualNetworkTapResponse virtualNetworkTap;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkInterfaceTapConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
    	      this.virtualNetworkTap = defaults.virtualNetworkTap;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
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

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVirtualNetworkTap(@Nullable VirtualNetworkTapResponse virtualNetworkTap) {
            this.virtualNetworkTap = virtualNetworkTap;
            return this;
        }
        public GetNetworkInterfaceTapConfigurationResult build() {
            return new GetNetworkInterfaceTapConfigurationResult(etag, id, name, provisioningState, type, virtualNetworkTap);
        }
    }
}
