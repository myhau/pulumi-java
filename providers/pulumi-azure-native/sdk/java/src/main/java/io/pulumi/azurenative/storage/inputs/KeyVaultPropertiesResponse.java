// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of key vault.
 * 
 */
public final class KeyVaultPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final KeyVaultPropertiesResponse Empty = new KeyVaultPropertiesResponse();

    /**
     * The object identifier of the current versioned Key Vault Key in use.
     * 
     */
    @Import(name="currentVersionedKeyIdentifier", required=true)
      private final String currentVersionedKeyIdentifier;

    public String currentVersionedKeyIdentifier() {
        return this.currentVersionedKeyIdentifier;
    }

    /**
     * The name of KeyVault key.
     * 
     */
    @Import(name="keyName")
      private final @Nullable String keyName;

    public Optional<String> keyName() {
        return this.keyName == null ? Optional.empty() : Optional.ofNullable(this.keyName);
    }

    /**
     * The Uri of KeyVault.
     * 
     */
    @Import(name="keyVaultUri")
      private final @Nullable String keyVaultUri;

    public Optional<String> keyVaultUri() {
        return this.keyVaultUri == null ? Optional.empty() : Optional.ofNullable(this.keyVaultUri);
    }

    /**
     * The version of KeyVault key.
     * 
     */
    @Import(name="keyVersion")
      private final @Nullable String keyVersion;

    public Optional<String> keyVersion() {
        return this.keyVersion == null ? Optional.empty() : Optional.ofNullable(this.keyVersion);
    }

    /**
     * Timestamp of last rotation of the Key Vault Key.
     * 
     */
    @Import(name="lastKeyRotationTimestamp", required=true)
      private final String lastKeyRotationTimestamp;

    public String lastKeyRotationTimestamp() {
        return this.lastKeyRotationTimestamp;
    }

    public KeyVaultPropertiesResponse(
        String currentVersionedKeyIdentifier,
        @Nullable String keyName,
        @Nullable String keyVaultUri,
        @Nullable String keyVersion,
        String lastKeyRotationTimestamp) {
        this.currentVersionedKeyIdentifier = Objects.requireNonNull(currentVersionedKeyIdentifier, "expected parameter 'currentVersionedKeyIdentifier' to be non-null");
        this.keyName = keyName;
        this.keyVaultUri = keyVaultUri;
        this.keyVersion = keyVersion;
        this.lastKeyRotationTimestamp = Objects.requireNonNull(lastKeyRotationTimestamp, "expected parameter 'lastKeyRotationTimestamp' to be non-null");
    }

    private KeyVaultPropertiesResponse() {
        this.currentVersionedKeyIdentifier = null;
        this.keyName = null;
        this.keyVaultUri = null;
        this.keyVersion = null;
        this.lastKeyRotationTimestamp = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String currentVersionedKeyIdentifier;
        private @Nullable String keyName;
        private @Nullable String keyVaultUri;
        private @Nullable String keyVersion;
        private String lastKeyRotationTimestamp;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentVersionedKeyIdentifier = defaults.currentVersionedKeyIdentifier;
    	      this.keyName = defaults.keyName;
    	      this.keyVaultUri = defaults.keyVaultUri;
    	      this.keyVersion = defaults.keyVersion;
    	      this.lastKeyRotationTimestamp = defaults.lastKeyRotationTimestamp;
        }

        public Builder currentVersionedKeyIdentifier(String currentVersionedKeyIdentifier) {
            this.currentVersionedKeyIdentifier = Objects.requireNonNull(currentVersionedKeyIdentifier);
            return this;
        }
        public Builder keyName(@Nullable String keyName) {
            this.keyName = keyName;
            return this;
        }
        public Builder keyVaultUri(@Nullable String keyVaultUri) {
            this.keyVaultUri = keyVaultUri;
            return this;
        }
        public Builder keyVersion(@Nullable String keyVersion) {
            this.keyVersion = keyVersion;
            return this;
        }
        public Builder lastKeyRotationTimestamp(String lastKeyRotationTimestamp) {
            this.lastKeyRotationTimestamp = Objects.requireNonNull(lastKeyRotationTimestamp);
            return this;
        }        public KeyVaultPropertiesResponse build() {
            return new KeyVaultPropertiesResponse(currentVersionedKeyIdentifier, keyName, keyVaultUri, keyVersion, lastKeyRotationTimestamp);
        }
    }
}
