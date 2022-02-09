// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.inputs;

import io.pulumi.azurenative.keyvault.inputs.MHSMNetworkRuleSetResponse;
import io.pulumi.azurenative.keyvault.inputs.MHSMPrivateEndpointConnectionItemResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedHsmPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedHsmPropertiesResponse Empty = new ManagedHsmPropertiesResponse();

    @InputImport(name="createMode")
    private final @Nullable String createMode;

    public Optional<String> getCreateMode() {
        return this.createMode == null ? Optional.empty() : Optional.ofNullable(this.createMode);
    }

    @InputImport(name="enablePurgeProtection")
    private final @Nullable Boolean enablePurgeProtection;

    public Optional<Boolean> getEnablePurgeProtection() {
        return this.enablePurgeProtection == null ? Optional.empty() : Optional.ofNullable(this.enablePurgeProtection);
    }

    @InputImport(name="enableSoftDelete")
    private final @Nullable Boolean enableSoftDelete;

    public Optional<Boolean> getEnableSoftDelete() {
        return this.enableSoftDelete == null ? Optional.empty() : Optional.ofNullable(this.enableSoftDelete);
    }

    @InputImport(name="hsmUri", required=true)
    private final String hsmUri;

    public String getHsmUri() {
        return this.hsmUri;
    }

    @InputImport(name="initialAdminObjectIds")
    private final @Nullable List<String> initialAdminObjectIds;

    public List<String> getInitialAdminObjectIds() {
        return this.initialAdminObjectIds == null ? List.of() : this.initialAdminObjectIds;
    }

    @InputImport(name="networkAcls")
    private final @Nullable MHSMNetworkRuleSetResponse networkAcls;

    public Optional<MHSMNetworkRuleSetResponse> getNetworkAcls() {
        return this.networkAcls == null ? Optional.empty() : Optional.ofNullable(this.networkAcls);
    }

    @InputImport(name="privateEndpointConnections", required=true)
    private final List<MHSMPrivateEndpointConnectionItemResponse> privateEndpointConnections;

    public List<MHSMPrivateEndpointConnectionItemResponse> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    @InputImport(name="publicNetworkAccess")
    private final @Nullable String publicNetworkAccess;

    public Optional<String> getPublicNetworkAccess() {
        return this.publicNetworkAccess == null ? Optional.empty() : Optional.ofNullable(this.publicNetworkAccess);
    }

    @InputImport(name="scheduledPurgeDate", required=true)
    private final String scheduledPurgeDate;

    public String getScheduledPurgeDate() {
        return this.scheduledPurgeDate;
    }

    @InputImport(name="softDeleteRetentionInDays")
    private final @Nullable Integer softDeleteRetentionInDays;

    public Optional<Integer> getSoftDeleteRetentionInDays() {
        return this.softDeleteRetentionInDays == null ? Optional.empty() : Optional.ofNullable(this.softDeleteRetentionInDays);
    }

    @InputImport(name="statusMessage", required=true)
    private final String statusMessage;

    public String getStatusMessage() {
        return this.statusMessage;
    }

    @InputImport(name="tenantId")
    private final @Nullable String tenantId;

    public Optional<String> getTenantId() {
        return this.tenantId == null ? Optional.empty() : Optional.ofNullable(this.tenantId);
    }

    public ManagedHsmPropertiesResponse(
        @Nullable String createMode,
        @Nullable Boolean enablePurgeProtection,
        @Nullable Boolean enableSoftDelete,
        String hsmUri,
        @Nullable List<String> initialAdminObjectIds,
        @Nullable MHSMNetworkRuleSetResponse networkAcls,
        List<MHSMPrivateEndpointConnectionItemResponse> privateEndpointConnections,
        String provisioningState,
        @Nullable String publicNetworkAccess,
        String scheduledPurgeDate,
        @Nullable Integer softDeleteRetentionInDays,
        String statusMessage,
        @Nullable String tenantId) {
        this.createMode = createMode;
        this.enablePurgeProtection = enablePurgeProtection == null ? true : enablePurgeProtection;
        this.enableSoftDelete = enableSoftDelete == null ? true : enableSoftDelete;
        this.hsmUri = Objects.requireNonNull(hsmUri, "expected parameter 'hsmUri' to be non-null");
        this.initialAdminObjectIds = initialAdminObjectIds;
        this.networkAcls = networkAcls;
        this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections, "expected parameter 'privateEndpointConnections' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.publicNetworkAccess = publicNetworkAccess;
        this.scheduledPurgeDate = Objects.requireNonNull(scheduledPurgeDate, "expected parameter 'scheduledPurgeDate' to be non-null");
        this.softDeleteRetentionInDays = softDeleteRetentionInDays == null ? 90 : softDeleteRetentionInDays;
        this.statusMessage = Objects.requireNonNull(statusMessage, "expected parameter 'statusMessage' to be non-null");
        this.tenantId = tenantId;
    }

    private ManagedHsmPropertiesResponse() {
        this.createMode = null;
        this.enablePurgeProtection = null;
        this.enableSoftDelete = null;
        this.hsmUri = null;
        this.initialAdminObjectIds = List.of();
        this.networkAcls = null;
        this.privateEndpointConnections = List.of();
        this.provisioningState = null;
        this.publicNetworkAccess = null;
        this.scheduledPurgeDate = null;
        this.softDeleteRetentionInDays = null;
        this.statusMessage = null;
        this.tenantId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedHsmPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String createMode;
        private @Nullable Boolean enablePurgeProtection;
        private @Nullable Boolean enableSoftDelete;
        private String hsmUri;
        private @Nullable List<String> initialAdminObjectIds;
        private @Nullable MHSMNetworkRuleSetResponse networkAcls;
        private List<MHSMPrivateEndpointConnectionItemResponse> privateEndpointConnections;
        private String provisioningState;
        private @Nullable String publicNetworkAccess;
        private String scheduledPurgeDate;
        private @Nullable Integer softDeleteRetentionInDays;
        private String statusMessage;
        private @Nullable String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedHsmPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createMode = defaults.createMode;
    	      this.enablePurgeProtection = defaults.enablePurgeProtection;
    	      this.enableSoftDelete = defaults.enableSoftDelete;
    	      this.hsmUri = defaults.hsmUri;
    	      this.initialAdminObjectIds = defaults.initialAdminObjectIds;
    	      this.networkAcls = defaults.networkAcls;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.scheduledPurgeDate = defaults.scheduledPurgeDate;
    	      this.softDeleteRetentionInDays = defaults.softDeleteRetentionInDays;
    	      this.statusMessage = defaults.statusMessage;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder setCreateMode(@Nullable String createMode) {
            this.createMode = createMode;
            return this;
        }

        public Builder setEnablePurgeProtection(@Nullable Boolean enablePurgeProtection) {
            this.enablePurgeProtection = enablePurgeProtection;
            return this;
        }

        public Builder setEnableSoftDelete(@Nullable Boolean enableSoftDelete) {
            this.enableSoftDelete = enableSoftDelete;
            return this;
        }

        public Builder setHsmUri(String hsmUri) {
            this.hsmUri = Objects.requireNonNull(hsmUri);
            return this;
        }

        public Builder setInitialAdminObjectIds(@Nullable List<String> initialAdminObjectIds) {
            this.initialAdminObjectIds = initialAdminObjectIds;
            return this;
        }

        public Builder setNetworkAcls(@Nullable MHSMNetworkRuleSetResponse networkAcls) {
            this.networkAcls = networkAcls;
            return this;
        }

        public Builder setPrivateEndpointConnections(List<MHSMPrivateEndpointConnectionItemResponse> privateEndpointConnections) {
            this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable String publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder setScheduledPurgeDate(String scheduledPurgeDate) {
            this.scheduledPurgeDate = Objects.requireNonNull(scheduledPurgeDate);
            return this;
        }

        public Builder setSoftDeleteRetentionInDays(@Nullable Integer softDeleteRetentionInDays) {
            this.softDeleteRetentionInDays = softDeleteRetentionInDays;
            return this;
        }

        public Builder setStatusMessage(String statusMessage) {
            this.statusMessage = Objects.requireNonNull(statusMessage);
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public ManagedHsmPropertiesResponse build() {
            return new ManagedHsmPropertiesResponse(createMode, enablePurgeProtection, enableSoftDelete, hsmUri, initialAdminObjectIds, networkAcls, privateEndpointConnections, provisioningState, publicNetworkAccess, scheduledPurgeDate, softDeleteRetentionInDays, statusMessage, tenantId);
        }
    }
}