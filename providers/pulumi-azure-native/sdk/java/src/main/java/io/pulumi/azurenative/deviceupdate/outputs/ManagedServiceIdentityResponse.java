// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deviceupdate.outputs;

import io.pulumi.azurenative.deviceupdate.outputs.UserAssignedIdentityResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagedServiceIdentityResponse {
    /**
     * The service principal ID of the system assigned identity. This property will only be provided for a system assigned identity.
     * 
     */
    private final String principalId;
    /**
     * The tenant ID of the system assigned identity. This property will only be provided for a system assigned identity.
     * 
     */
    private final String tenantId;
    /**
     * Type of managed service identity (where both SystemAssigned and UserAssigned types are allowed).
     * 
     */
    private final String type;
    /**
     * The set of user assigned identities associated with the resource. The userAssignedIdentities dictionary keys will be ARM resource ids in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}. The dictionary values can be empty objects ({}) in requests.
     * 
     */
    private final @Nullable Map<String,UserAssignedIdentityResponse> userAssignedIdentities;

    @OutputCustomType.Constructor({"principalId","tenantId","type","userAssignedIdentities"})
    private ManagedServiceIdentityResponse(
        String principalId,
        String tenantId,
        String type,
        @Nullable Map<String,UserAssignedIdentityResponse> userAssignedIdentities) {
        this.principalId = principalId;
        this.tenantId = tenantId;
        this.type = type;
        this.userAssignedIdentities = userAssignedIdentities;
    }

    /**
     * The service principal ID of the system assigned identity. This property will only be provided for a system assigned identity.
     * 
    */
    public String getPrincipalId() {
        return this.principalId;
    }
    /**
     * The tenant ID of the system assigned identity. This property will only be provided for a system assigned identity.
     * 
    */
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Type of managed service identity (where both SystemAssigned and UserAssigned types are allowed).
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The set of user assigned identities associated with the resource. The userAssignedIdentities dictionary keys will be ARM resource ids in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}. The dictionary values can be empty objects ({}) in requests.
     * 
    */
    public Map<String,UserAssignedIdentityResponse> getUserAssignedIdentities() {
        return this.userAssignedIdentities == null ? Map.of() : this.userAssignedIdentities;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedServiceIdentityResponse defaults) {
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

        public Builder(ManagedServiceIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder setPrincipalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserAssignedIdentities(@Nullable Map<String,UserAssignedIdentityResponse> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }
        public ManagedServiceIdentityResponse build() {
            return new ManagedServiceIdentityResponse(principalId, tenantId, type, userAssignedIdentities);
        }
    }
}
