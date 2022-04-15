// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managednetwork.outputs;

import io.pulumi.azurenative.managednetwork.outputs.ConnectivityCollectionResponse;
import io.pulumi.azurenative.managednetwork.outputs.ScopeResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetManagedNetworkResult {
    /**
     * The collection of groups and policies concerned with connectivity
     * 
     */
    private final ConnectivityCollectionResponse connectivity;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
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
     * Provisioning state of the ManagedNetwork resource.
     * 
     */
    private final String provisioningState;
    /**
     * The collection of management groups, subscriptions, virtual networks, and subnets by the Managed Network. This is a read-only property that is reflective of all ScopeAssignments for this Managed Network
     * 
     */
    private final @Nullable ScopeResponse scope;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetManagedNetworkResult(
        @CustomType.Parameter("connectivity") ConnectivityCollectionResponse connectivity,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("scope") @Nullable ScopeResponse scope,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.connectivity = connectivity;
        this.etag = etag;
        this.id = id;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.scope = scope;
        this.tags = tags;
        this.type = type;
    }

    /**
     * The collection of groups and policies concerned with connectivity
     * 
    */
    public ConnectivityCollectionResponse connectivity() {
        return this.connectivity;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String etag() {
        return this.etag;
    }
    /**
     * Fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String id() {
        return this.id;
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
     * Provisioning state of the ManagedNetwork resource.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * The collection of management groups, subscriptions, virtual networks, and subnets by the Managed Network. This is a read-only property that is reflective of all ScopeAssignments for this Managed Network
     * 
    */
    public Optional<ScopeResponse> scope() {
        return Optional.ofNullable(this.scope);
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
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

    public static Builder builder(GetManagedNetworkResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectivityCollectionResponse connectivity;
        private String etag;
        private String id;
        private String location;
        private String name;
        private String provisioningState;
        private @Nullable ScopeResponse scope;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagedNetworkResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectivity = defaults.connectivity;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.scope = defaults.scope;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder connectivity(ConnectivityCollectionResponse connectivity) {
            this.connectivity = Objects.requireNonNull(connectivity);
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
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
        public Builder scope(@Nullable ScopeResponse scope) {
            this.scope = scope;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetManagedNetworkResult build() {
            return new GetManagedNetworkResult(connectivity, etag, id, location, name, provisioningState, scope, tags, type);
        }
    }
}
