// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managednetwork.inputs;

import io.pulumi.azurenative.managednetwork.inputs.ResourceIdResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Managed Network Group resource
 * 
 */
public final class ManagedNetworkGroupResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedNetworkGroupResponse Empty = new ManagedNetworkGroupResponse();

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Import(name="etag", required=true)
      private final String etag;

    public String etag() {
        return this.etag;
    }

    /**
     * Fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String id() {
        return this.id;
    }

    /**
     * Responsibility role under which this Managed Network Group will be created
     * 
     */
    @Import(name="kind")
      private final @Nullable String kind;

    public Optional<String> kind() {
        return this.kind == null ? Optional.empty() : Optional.ofNullable(this.kind);
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
      private final @Nullable String location;

    public Optional<String> location() {
        return this.location == null ? Optional.empty() : Optional.ofNullable(this.location);
    }

    /**
     * The collection of management groups covered by the Managed Network
     * 
     */
    @Import(name="managementGroups")
      private final @Nullable List<ResourceIdResponse> managementGroups;

    public List<ResourceIdResponse> managementGroups() {
        return this.managementGroups == null ? List.of() : this.managementGroups;
    }

    /**
     * The name of the resource
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * Provisioning state of the ManagedNetwork resource.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * The collection of  subnets covered by the Managed Network
     * 
     */
    @Import(name="subnets")
      private final @Nullable List<ResourceIdResponse> subnets;

    public List<ResourceIdResponse> subnets() {
        return this.subnets == null ? List.of() : this.subnets;
    }

    /**
     * The collection of subscriptions covered by the Managed Network
     * 
     */
    @Import(name="subscriptions")
      private final @Nullable List<ResourceIdResponse> subscriptions;

    public List<ResourceIdResponse> subscriptions() {
        return this.subscriptions == null ? List.of() : this.subscriptions;
    }

    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    /**
     * The collection of virtual nets covered by the Managed Network
     * 
     */
    @Import(name="virtualNetworks")
      private final @Nullable List<ResourceIdResponse> virtualNetworks;

    public List<ResourceIdResponse> virtualNetworks() {
        return this.virtualNetworks == null ? List.of() : this.virtualNetworks;
    }

    public ManagedNetworkGroupResponse(
        String etag,
        String id,
        @Nullable String kind,
        @Nullable String location,
        @Nullable List<ResourceIdResponse> managementGroups,
        String name,
        String provisioningState,
        @Nullable List<ResourceIdResponse> subnets,
        @Nullable List<ResourceIdResponse> subscriptions,
        String type,
        @Nullable List<ResourceIdResponse> virtualNetworks) {
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.kind = kind;
        this.location = location;
        this.managementGroups = managementGroups;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.subnets = subnets;
        this.subscriptions = subscriptions;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.virtualNetworks = virtualNetworks;
    }

    private ManagedNetworkGroupResponse() {
        this.etag = null;
        this.id = null;
        this.kind = null;
        this.location = null;
        this.managementGroups = List.of();
        this.name = null;
        this.provisioningState = null;
        this.subnets = List.of();
        this.subscriptions = List.of();
        this.type = null;
        this.virtualNetworks = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedNetworkGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private String id;
        private @Nullable String kind;
        private @Nullable String location;
        private @Nullable List<ResourceIdResponse> managementGroups;
        private String name;
        private String provisioningState;
        private @Nullable List<ResourceIdResponse> subnets;
        private @Nullable List<ResourceIdResponse> subscriptions;
        private String type;
        private @Nullable List<ResourceIdResponse> virtualNetworks;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedNetworkGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.managementGroups = defaults.managementGroups;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.subnets = defaults.subnets;
    	      this.subscriptions = defaults.subscriptions;
    	      this.type = defaults.type;
    	      this.virtualNetworks = defaults.virtualNetworks;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder managementGroups(@Nullable List<ResourceIdResponse> managementGroups) {
            this.managementGroups = managementGroups;
            return this;
        }
        public Builder managementGroups(ResourceIdResponse... managementGroups) {
            return managementGroups(List.of(managementGroups));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder subnets(@Nullable List<ResourceIdResponse> subnets) {
            this.subnets = subnets;
            return this;
        }
        public Builder subnets(ResourceIdResponse... subnets) {
            return subnets(List.of(subnets));
        }
        public Builder subscriptions(@Nullable List<ResourceIdResponse> subscriptions) {
            this.subscriptions = subscriptions;
            return this;
        }
        public Builder subscriptions(ResourceIdResponse... subscriptions) {
            return subscriptions(List.of(subscriptions));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder virtualNetworks(@Nullable List<ResourceIdResponse> virtualNetworks) {
            this.virtualNetworks = virtualNetworks;
            return this;
        }
        public Builder virtualNetworks(ResourceIdResponse... virtualNetworks) {
            return virtualNetworks(List.of(virtualNetworks));
        }        public ManagedNetworkGroupResponse build() {
            return new ManagedNetworkGroupResponse(etag, id, kind, location, managementGroups, name, provisioningState, subnets, subscriptions, type, virtualNetworks);
        }
    }
}
