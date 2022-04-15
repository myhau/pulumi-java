// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.outputs;

import io.pulumi.azurenative.resources.outputs.UserAssignedIdentityResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedServiceIdentityResponse {
    /**
     * ID of the Azure Active Directory.
     * 
     */
    private final String tenantId;
    /**
     * Type of the managed identity.
     * 
     */
    private final @Nullable String type;
    /**
     * The list of user-assigned managed identities associated with the resource. Key is the Azure resource Id of the managed identity.
     * 
     */
    private final @Nullable Map<String,UserAssignedIdentityResponse> userAssignedIdentities;

    @CustomType.Constructor
    private ManagedServiceIdentityResponse(
        @CustomType.Parameter("tenantId") String tenantId,
        @CustomType.Parameter("type") @Nullable String type,
        @CustomType.Parameter("userAssignedIdentities") @Nullable Map<String,UserAssignedIdentityResponse> userAssignedIdentities) {
        this.tenantId = tenantId;
        this.type = type;
        this.userAssignedIdentities = userAssignedIdentities;
    }

    /**
     * ID of the Azure Active Directory.
     * 
    */
    public String tenantId() {
        return this.tenantId;
    }
    /**
     * Type of the managed identity.
     * 
    */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * The list of user-assigned managed identities associated with the resource. Key is the Azure resource Id of the managed identity.
     * 
    */
    public Map<String,UserAssignedIdentityResponse> userAssignedIdentities() {
        return this.userAssignedIdentities == null ? Map.of() : this.userAssignedIdentities;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedServiceIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String tenantId;
        private @Nullable String type;
        private @Nullable Map<String,UserAssignedIdentityResponse> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedServiceIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public Builder userAssignedIdentities(@Nullable Map<String,UserAssignedIdentityResponse> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }        public ManagedServiceIdentityResponse build() {
            return new ManagedServiceIdentityResponse(tenantId, type, userAssignedIdentities);
        }
    }
}
