// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.inputs.UserAssignedIdentityResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Identity for the resource.
 * 
 */
public final class IdentityResponse extends io.pulumi.resources.InvokeArgs {

    public static final IdentityResponse Empty = new IdentityResponse();

    /**
     * The principal ID of resource identity.
     * 
     */
    @Import(name="principalId", required=true)
      private final String principalId;

    public String principalId() {
        return this.principalId;
    }

    /**
     * The tenant ID of resource.
     * 
     */
    @Import(name="tenantId", required=true)
      private final String tenantId;

    public String tenantId() {
        return this.tenantId;
    }

    /**
     * The identity type.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    /**
     * Gets or sets a list of key value pairs that describe the set of User Assigned identities that will be used with this storage account. The key is the ARM resource identifier of the identity. Only 1 User Assigned identity is permitted here.
     * 
     */
    @Import(name="userAssignedIdentities")
      private final @Nullable Map<String,UserAssignedIdentityResponse> userAssignedIdentities;

    public Map<String,UserAssignedIdentityResponse> userAssignedIdentities() {
        return this.userAssignedIdentities == null ? Map.of() : this.userAssignedIdentities;
    }

    public IdentityResponse(
        String principalId,
        String tenantId,
        String type,
        @Nullable Map<String,UserAssignedIdentityResponse> userAssignedIdentities) {
        this.principalId = Objects.requireNonNull(principalId, "expected parameter 'principalId' to be non-null");
        this.tenantId = Objects.requireNonNull(tenantId, "expected parameter 'tenantId' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userAssignedIdentities = userAssignedIdentities;
    }

    private IdentityResponse() {
        this.principalId = null;
        this.tenantId = null;
        this.type = null;
        this.userAssignedIdentities = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String tenantId;
        private String type;
        private @Nullable Map<String,UserAssignedIdentityResponse> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder userAssignedIdentities(@Nullable Map<String,UserAssignedIdentityResponse> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }        public IdentityResponse build() {
            return new IdentityResponse(principalId, tenantId, type, userAssignedIdentities);
        }
    }
}
