// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.KeyVaultKeyReferenceResponse;
import io.pulumi.azurenative.compute.outputs.KeyVaultSecretReferenceResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DiskEncryptionSettingsResponse {
    /**
     * Specifies the location of the disk encryption key, which is a Key Vault Secret.
     * 
     */
    private final @Nullable KeyVaultSecretReferenceResponse diskEncryptionKey;
    /**
     * Specifies whether disk encryption should be enabled on the virtual machine.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * Specifies the location of the key encryption key in Key Vault.
     * 
     */
    private final @Nullable KeyVaultKeyReferenceResponse keyEncryptionKey;

    @CustomType.Constructor
    private DiskEncryptionSettingsResponse(
        @CustomType.Parameter("diskEncryptionKey") @Nullable KeyVaultSecretReferenceResponse diskEncryptionKey,
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("keyEncryptionKey") @Nullable KeyVaultKeyReferenceResponse keyEncryptionKey) {
        this.diskEncryptionKey = diskEncryptionKey;
        this.enabled = enabled;
        this.keyEncryptionKey = keyEncryptionKey;
    }

    /**
     * Specifies the location of the disk encryption key, which is a Key Vault Secret.
     * 
    */
    public Optional<KeyVaultSecretReferenceResponse> diskEncryptionKey() {
        return Optional.ofNullable(this.diskEncryptionKey);
    }
    /**
     * Specifies whether disk encryption should be enabled on the virtual machine.
     * 
    */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * Specifies the location of the key encryption key in Key Vault.
     * 
    */
    public Optional<KeyVaultKeyReferenceResponse> keyEncryptionKey() {
        return Optional.ofNullable(this.keyEncryptionKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskEncryptionSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable KeyVaultSecretReferenceResponse diskEncryptionKey;
        private @Nullable Boolean enabled;
        private @Nullable KeyVaultKeyReferenceResponse keyEncryptionKey;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskEncryptionSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskEncryptionKey = defaults.diskEncryptionKey;
    	      this.enabled = defaults.enabled;
    	      this.keyEncryptionKey = defaults.keyEncryptionKey;
        }

        public Builder diskEncryptionKey(@Nullable KeyVaultSecretReferenceResponse diskEncryptionKey) {
            this.diskEncryptionKey = diskEncryptionKey;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder keyEncryptionKey(@Nullable KeyVaultKeyReferenceResponse keyEncryptionKey) {
            this.keyEncryptionKey = keyEncryptionKey;
            return this;
        }        public DiskEncryptionSettingsResponse build() {
            return new DiskEncryptionSettingsResponse(diskEncryptionKey, enabled, keyEncryptionKey);
        }
    }
}
