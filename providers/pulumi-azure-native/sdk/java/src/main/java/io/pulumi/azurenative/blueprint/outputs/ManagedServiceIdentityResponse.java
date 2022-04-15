// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint.outputs;

import io.pulumi.azurenative.blueprint.outputs.UserAssignedIdentityResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedServiceIdentityResponse {
    /**
     * Azure Active Directory principal ID associated with this Identity.
     * 
     */
    private final @Nullable String principalId;
    /**
     * ID of the Azure Active Directory.
     * 
     */
    private final @Nullable String tenantId;
    /**
     * Type of the managed identity.
     * 
     */
    private final String type;
    /**
     * The list of user-assigned managed identities associated with the resource. Key is the Azure resource Id of the managed identity.
     * 
     */
    private final @Nullable Map<String,UserAssignedIdentityResponse> userAssignedIdentities;

    @CustomType.Constructor
    private ManagedServiceIdentityResponse(
        @CustomType.Parameter("principalId") @Nullable String principalId,
        @CustomType.Parameter("tenantId") @Nullable String tenantId,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userAssignedIdentities") @Nullable Map<String,UserAssignedIdentityResponse> userAssignedIdentities) {
        this.principalId = principalId;
        this.tenantId = tenantId;
        this.type = type;
        this.userAssignedIdentities = userAssignedIdentities;
    }

    /**
     * Azure Active Directory principal ID associated with this Identity.
     * 
    */
    public Optional<String> principalId() {
        return Optional.ofNullable(this.principalId);
    }
    /**
     * ID of the Azure Active Directory.
     * 
    */
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }
    /**
     * Type of the managed identity.
     * 
    */
    public String type() {
        return this.type;
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
        private @Nullable String principalId;
        private @Nullable String tenantId;
        private String type;
        private @Nullable Map<String,UserAssignedIdentityResponse> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedServiceIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder principalId(@Nullable String principalId) {
            this.principalId = principalId;
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder userAssignedIdentities(@Nullable Map<String,UserAssignedIdentityResponse> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }        public ManagedServiceIdentityResponse build() {
            return new ManagedServiceIdentityResponse(principalId, tenantId, type, userAssignedIdentities);
        }
    }
}
