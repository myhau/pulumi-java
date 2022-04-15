// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.inputs;

import io.pulumi.azurenative.storagecache.inputs.KeyVaultKeyReferenceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Cache encryption settings.
 * 
 */
public final class CacheEncryptionSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final CacheEncryptionSettingsArgs Empty = new CacheEncryptionSettingsArgs();

    /**
     * Specifies the location of the key encryption key in Key Vault.
     * 
     */
    @Import(name="keyEncryptionKey")
      private final @Nullable Output<KeyVaultKeyReferenceArgs> keyEncryptionKey;

    public Output<KeyVaultKeyReferenceArgs> keyEncryptionKey() {
        return this.keyEncryptionKey == null ? Codegen.empty() : this.keyEncryptionKey;
    }

    public CacheEncryptionSettingsArgs(@Nullable Output<KeyVaultKeyReferenceArgs> keyEncryptionKey) {
        this.keyEncryptionKey = keyEncryptionKey;
    }

    private CacheEncryptionSettingsArgs() {
        this.keyEncryptionKey = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheEncryptionSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<KeyVaultKeyReferenceArgs> keyEncryptionKey;

        public Builder() {
    	      // Empty
        }

        public Builder(CacheEncryptionSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyEncryptionKey = defaults.keyEncryptionKey;
        }

        public Builder keyEncryptionKey(@Nullable Output<KeyVaultKeyReferenceArgs> keyEncryptionKey) {
            this.keyEncryptionKey = keyEncryptionKey;
            return this;
        }
        public Builder keyEncryptionKey(@Nullable KeyVaultKeyReferenceArgs keyEncryptionKey) {
            this.keyEncryptionKey = Codegen.ofNullable(keyEncryptionKey);
            return this;
        }        public CacheEncryptionSettingsArgs build() {
            return new CacheEncryptionSettingsArgs(keyEncryptionKey);
        }
    }
}
