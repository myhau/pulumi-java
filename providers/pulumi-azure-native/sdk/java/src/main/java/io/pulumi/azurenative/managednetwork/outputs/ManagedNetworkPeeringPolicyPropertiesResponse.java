// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managednetwork.outputs;

import io.pulumi.azurenative.managednetwork.outputs.ResourceIdResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagedNetworkPeeringPolicyPropertiesResponse {
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Gets or sets the hub virtual network ID
     * 
     */
    private final @Nullable ResourceIdResponse hub;
    /**
     * Gets or sets the mesh group IDs
     * 
     */
    private final @Nullable List<ResourceIdResponse> mesh;
    /**
     * Provisioning state of the ManagedNetwork resource.
     * 
     */
    private final String provisioningState;
    /**
     * Gets or sets the spokes group IDs
     * 
     */
    private final @Nullable List<ResourceIdResponse> spokes;
    /**
     * Gets or sets the connectivity type of a network structure policy
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"etag","hub","mesh","provisioningState","spokes","type"})
    private ManagedNetworkPeeringPolicyPropertiesResponse(
        String etag,
        @Nullable ResourceIdResponse hub,
        @Nullable List<ResourceIdResponse> mesh,
        String provisioningState,
        @Nullable List<ResourceIdResponse> spokes,
        String type) {
        this.etag = etag;
        this.hub = hub;
        this.mesh = mesh;
        this.provisioningState = provisioningState;
        this.spokes = spokes;
        this.type = type;
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Gets or sets the hub virtual network ID
     * 
    */
    public Optional<ResourceIdResponse> getHub() {
        return Optional.ofNullable(this.hub);
    }
    /**
     * Gets or sets the mesh group IDs
     * 
    */
    public List<ResourceIdResponse> getMesh() {
        return this.mesh == null ? List.of() : this.mesh;
    }
    /**
     * Provisioning state of the ManagedNetwork resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Gets or sets the spokes group IDs
     * 
    */
    public List<ResourceIdResponse> getSpokes() {
        return this.spokes == null ? List.of() : this.spokes;
    }
    /**
     * Gets or sets the connectivity type of a network structure policy
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedNetworkPeeringPolicyPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable ResourceIdResponse hub;
        private @Nullable List<ResourceIdResponse> mesh;
        private String provisioningState;
        private @Nullable List<ResourceIdResponse> spokes;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedNetworkPeeringPolicyPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.hub = defaults.hub;
    	      this.mesh = defaults.mesh;
    	      this.provisioningState = defaults.provisioningState;
    	      this.spokes = defaults.spokes;
    	      this.type = defaults.type;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setHub(@Nullable ResourceIdResponse hub) {
            this.hub = hub;
            return this;
        }

        public Builder setMesh(@Nullable List<ResourceIdResponse> mesh) {
            this.mesh = mesh;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSpokes(@Nullable List<ResourceIdResponse> spokes) {
            this.spokes = spokes;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ManagedNetworkPeeringPolicyPropertiesResponse build() {
            return new ManagedNetworkPeeringPolicyPropertiesResponse(etag, hub, mesh, provisioningState, spokes, type);
        }
    }
}
