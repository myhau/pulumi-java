// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakestore.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Metadata information used by account encryption.
 * 
 */
public final class KeyVaultMetaInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final KeyVaultMetaInfoResponse Empty = new KeyVaultMetaInfoResponse();

    /**
     * The name of the user managed encryption key.
     * 
     */
    @Import(name="encryptionKeyName", required=true)
      private final String encryptionKeyName;

    public String encryptionKeyName() {
        return this.encryptionKeyName;
    }

    /**
     * The version of the user managed encryption key.
     * 
     */
    @Import(name="encryptionKeyVersion", required=true)
      private final String encryptionKeyVersion;

    public String encryptionKeyVersion() {
        return this.encryptionKeyVersion;
    }

    /**
     * The resource identifier for the user managed Key Vault being used to encrypt.
     * 
     */
    @Import(name="keyVaultResourceId", required=true)
      private final String keyVaultResourceId;

    public String keyVaultResourceId() {
        return this.keyVaultResourceId;
    }

    public KeyVaultMetaInfoResponse(
        String encryptionKeyName,
        String encryptionKeyVersion,
        String keyVaultResourceId) {
        this.encryptionKeyName = Objects.requireNonNull(encryptionKeyName, "expected parameter 'encryptionKeyName' to be non-null");
        this.encryptionKeyVersion = Objects.requireNonNull(encryptionKeyVersion, "expected parameter 'encryptionKeyVersion' to be non-null");
        this.keyVaultResourceId = Objects.requireNonNull(keyVaultResourceId, "expected parameter 'keyVaultResourceId' to be non-null");
    }

    private KeyVaultMetaInfoResponse() {
        this.encryptionKeyName = null;
        this.encryptionKeyVersion = null;
        this.keyVaultResourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultMetaInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String encryptionKeyName;
        private String encryptionKeyVersion;
        private String keyVaultResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultMetaInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionKeyName = defaults.encryptionKeyName;
    	      this.encryptionKeyVersion = defaults.encryptionKeyVersion;
    	      this.keyVaultResourceId = defaults.keyVaultResourceId;
        }

        public Builder encryptionKeyName(String encryptionKeyName) {
            this.encryptionKeyName = Objects.requireNonNull(encryptionKeyName);
            return this;
        }
        public Builder encryptionKeyVersion(String encryptionKeyVersion) {
            this.encryptionKeyVersion = Objects.requireNonNull(encryptionKeyVersion);
            return this;
        }
        public Builder keyVaultResourceId(String keyVaultResourceId) {
            this.keyVaultResourceId = Objects.requireNonNull(keyVaultResourceId);
            return this;
        }        public KeyVaultMetaInfoResponse build() {
            return new KeyVaultMetaInfoResponse(encryptionKeyName, encryptionKeyVersion, keyVaultResourceId);
        }
    }
}
