// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedClusterAddonProfileResponseIdentity {
    /**
     * The client id of the user assigned identity.
     * 
     */
    private final @Nullable String clientId;
    /**
     * The object id of the user assigned identity.
     * 
     */
    private final @Nullable String objectId;
    /**
     * The resource id of the user assigned identity.
     * 
     */
    private final @Nullable String resourceId;

    @CustomType.Constructor
    private ManagedClusterAddonProfileResponseIdentity(
        @CustomType.Parameter("clientId") @Nullable String clientId,
        @CustomType.Parameter("objectId") @Nullable String objectId,
        @CustomType.Parameter("resourceId") @Nullable String resourceId) {
        this.clientId = clientId;
        this.objectId = objectId;
        this.resourceId = resourceId;
    }

    /**
     * The client id of the user assigned identity.
     * 
    */
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * The object id of the user assigned identity.
     * 
    */
    public Optional<String> objectId() {
        return Optional.ofNullable(this.objectId);
    }
    /**
     * The resource id of the user assigned identity.
     * 
    */
    public Optional<String> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterAddonProfileResponseIdentity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientId;
        private @Nullable String objectId;
        private @Nullable String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterAddonProfileResponseIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.objectId = defaults.objectId;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder clientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }
        public Builder objectId(@Nullable String objectId) {
            this.objectId = objectId;
            return this;
        }
        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }        public ManagedClusterAddonProfileResponseIdentity build() {
            return new ManagedClusterAddonProfileResponseIdentity(clientId, objectId, resourceId);
        }
    }
}
