// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.inputs;

import io.pulumi.azurenative.storagecache.inputs.KeyVaultKeyReferenceResponse;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Cache encryption settings.
 * 
 */
public final class CacheEncryptionSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final CacheEncryptionSettingsResponse Empty = new CacheEncryptionSettingsResponse();

    /**
     * Specifies the location of the key encryption key in Key Vault.
     * 
     */
    @Import(name="keyEncryptionKey")
      private final @Nullable KeyVaultKeyReferenceResponse keyEncryptionKey;

    public Optional<KeyVaultKeyReferenceResponse> keyEncryptionKey() {
        return this.keyEncryptionKey == null ? Optional.empty() : Optional.ofNullable(this.keyEncryptionKey);
    }

    public CacheEncryptionSettingsResponse(@Nullable KeyVaultKeyReferenceResponse keyEncryptionKey) {
        this.keyEncryptionKey = keyEncryptionKey;
    }

    private CacheEncryptionSettingsResponse() {
        this.keyEncryptionKey = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheEncryptionSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable KeyVaultKeyReferenceResponse keyEncryptionKey;

        public Builder() {
    	      // Empty
        }

        public Builder(CacheEncryptionSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyEncryptionKey = defaults.keyEncryptionKey;
        }

        public Builder keyEncryptionKey(@Nullable KeyVaultKeyReferenceResponse keyEncryptionKey) {
            this.keyEncryptionKey = keyEncryptionKey;
            return this;
        }        public CacheEncryptionSettingsResponse build() {
            return new CacheEncryptionSettingsResponse(keyEncryptionKey);
        }
    }
}
