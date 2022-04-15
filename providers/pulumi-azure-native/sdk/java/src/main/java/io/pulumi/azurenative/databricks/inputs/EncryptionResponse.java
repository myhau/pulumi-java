// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databricks.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The object that contains details of encryption used on the workspace.
 * 
 */
public final class EncryptionResponse extends io.pulumi.resources.InvokeArgs {

    public static final EncryptionResponse Empty = new EncryptionResponse();

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
     * The encryption keySource (provider). Possible values (case-insensitive):  Default, Microsoft.Keyvault
     * 
     */
    @Import(name="keySource")
      private final @Nullable String keySource;

    public Optional<String> keySource() {
        return this.keySource == null ? Optional.empty() : Optional.ofNullable(this.keySource);
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

    public EncryptionResponse(
        @Nullable String keyName,
        @Nullable String keySource,
        @Nullable String keyVaultUri,
        @Nullable String keyVersion) {
        this.keyName = keyName;
        this.keySource = keySource == null ? "Default" : keySource;
        this.keyVaultUri = keyVaultUri;
        this.keyVersion = keyVersion;
    }

    private EncryptionResponse() {
        this.keyName = null;
        this.keySource = null;
        this.keyVaultUri = null;
        this.keyVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyName;
        private @Nullable String keySource;
        private @Nullable String keyVaultUri;
        private @Nullable String keyVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.keySource = defaults.keySource;
    	      this.keyVaultUri = defaults.keyVaultUri;
    	      this.keyVersion = defaults.keyVersion;
        }

        public Builder keyName(@Nullable String keyName) {
            this.keyName = keyName;
            return this;
        }
        public Builder keySource(@Nullable String keySource) {
            this.keySource = keySource;
            return this;
        }
        public Builder keyVaultUri(@Nullable String keyVaultUri) {
            this.keyVaultUri = keyVaultUri;
            return this;
        }
        public Builder keyVersion(@Nullable String keyVersion) {
            this.keyVersion = keyVersion;
            return this;
        }        public EncryptionResponse build() {
            return new EncryptionResponse(keyName, keySource, keyVaultUri, keyVersion);
        }
    }
}
