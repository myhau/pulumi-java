// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VolumeBackupPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final VolumeBackupPropertiesResponse Empty = new VolumeBackupPropertiesResponse();

    @InputImport(name="backupEnabled")
    private final @Nullable Boolean backupEnabled;

    public Optional<Boolean> getBackupEnabled() {
        return this.backupEnabled == null ? Optional.empty() : Optional.ofNullable(this.backupEnabled);
    }

    @InputImport(name="backupPolicyId")
    private final @Nullable String backupPolicyId;

    public Optional<String> getBackupPolicyId() {
        return this.backupPolicyId == null ? Optional.empty() : Optional.ofNullable(this.backupPolicyId);
    }

    @InputImport(name="policyEnforced")
    private final @Nullable Boolean policyEnforced;

    public Optional<Boolean> getPolicyEnforced() {
        return this.policyEnforced == null ? Optional.empty() : Optional.ofNullable(this.policyEnforced);
    }

    @InputImport(name="vaultId")
    private final @Nullable String vaultId;

    public Optional<String> getVaultId() {
        return this.vaultId == null ? Optional.empty() : Optional.ofNullable(this.vaultId);
    }

    public VolumeBackupPropertiesResponse(
        @Nullable Boolean backupEnabled,
        @Nullable String backupPolicyId,
        @Nullable Boolean policyEnforced,
        @Nullable String vaultId) {
        this.backupEnabled = backupEnabled;
        this.backupPolicyId = backupPolicyId;
        this.policyEnforced = policyEnforced;
        this.vaultId = vaultId;
    }

    private VolumeBackupPropertiesResponse() {
        this.backupEnabled = null;
        this.backupPolicyId = null;
        this.policyEnforced = null;
        this.vaultId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeBackupPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean backupEnabled;
        private @Nullable String backupPolicyId;
        private @Nullable Boolean policyEnforced;
        private @Nullable String vaultId;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeBackupPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupEnabled = defaults.backupEnabled;
    	      this.backupPolicyId = defaults.backupPolicyId;
    	      this.policyEnforced = defaults.policyEnforced;
    	      this.vaultId = defaults.vaultId;
        }

        public Builder setBackupEnabled(@Nullable Boolean backupEnabled) {
            this.backupEnabled = backupEnabled;
            return this;
        }

        public Builder setBackupPolicyId(@Nullable String backupPolicyId) {
            this.backupPolicyId = backupPolicyId;
            return this;
        }

        public Builder setPolicyEnforced(@Nullable Boolean policyEnforced) {
            this.policyEnforced = policyEnforced;
            return this;
        }

        public Builder setVaultId(@Nullable String vaultId) {
            this.vaultId = vaultId;
            return this;
        }

        public VolumeBackupPropertiesResponse build() {
            return new VolumeBackupPropertiesResponse(backupEnabled, backupPolicyId, policyEnforced, vaultId);
        }
    }
}