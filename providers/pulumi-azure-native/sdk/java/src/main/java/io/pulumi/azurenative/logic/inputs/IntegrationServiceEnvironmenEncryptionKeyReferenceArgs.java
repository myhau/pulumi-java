// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.ResourceReferenceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The encryption key details for the integration service environment.
 * 
 */
public final class IntegrationServiceEnvironmenEncryptionKeyReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationServiceEnvironmenEncryptionKeyReferenceArgs Empty = new IntegrationServiceEnvironmenEncryptionKeyReferenceArgs();

    /**
     * Gets the key name in the Key Vault.
     * 
     */
    @Import(name="keyName")
      private final @Nullable Output<String> keyName;

    public Output<String> keyName() {
        return this.keyName == null ? Codegen.empty() : this.keyName;
    }

    /**
     * The key vault reference.
     * 
     */
    @Import(name="keyVault")
      private final @Nullable Output<ResourceReferenceArgs> keyVault;

    public Output<ResourceReferenceArgs> keyVault() {
        return this.keyVault == null ? Codegen.empty() : this.keyVault;
    }

    /**
     * Gets the version of the key specified in the keyName property.
     * 
     */
    @Import(name="keyVersion")
      private final @Nullable Output<String> keyVersion;

    public Output<String> keyVersion() {
        return this.keyVersion == null ? Codegen.empty() : this.keyVersion;
    }

    public IntegrationServiceEnvironmenEncryptionKeyReferenceArgs(
        @Nullable Output<String> keyName,
        @Nullable Output<ResourceReferenceArgs> keyVault,
        @Nullable Output<String> keyVersion) {
        this.keyName = keyName;
        this.keyVault = keyVault;
        this.keyVersion = keyVersion;
    }

    private IntegrationServiceEnvironmenEncryptionKeyReferenceArgs() {
        this.keyName = Codegen.empty();
        this.keyVault = Codegen.empty();
        this.keyVersion = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationServiceEnvironmenEncryptionKeyReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> keyName;
        private @Nullable Output<ResourceReferenceArgs> keyVault;
        private @Nullable Output<String> keyVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationServiceEnvironmenEncryptionKeyReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.keyVault = defaults.keyVault;
    	      this.keyVersion = defaults.keyVersion;
        }

        public Builder keyName(@Nullable Output<String> keyName) {
            this.keyName = keyName;
            return this;
        }
        public Builder keyName(@Nullable String keyName) {
            this.keyName = Codegen.ofNullable(keyName);
            return this;
        }
        public Builder keyVault(@Nullable Output<ResourceReferenceArgs> keyVault) {
            this.keyVault = keyVault;
            return this;
        }
        public Builder keyVault(@Nullable ResourceReferenceArgs keyVault) {
            this.keyVault = Codegen.ofNullable(keyVault);
            return this;
        }
        public Builder keyVersion(@Nullable Output<String> keyVersion) {
            this.keyVersion = keyVersion;
            return this;
        }
        public Builder keyVersion(@Nullable String keyVersion) {
            this.keyVersion = Codegen.ofNullable(keyVersion);
            return this;
        }        public IntegrationServiceEnvironmenEncryptionKeyReferenceArgs build() {
            return new IntegrationServiceEnvironmenEncryptionKeyReferenceArgs(keyName, keyVault, keyVersion);
        }
    }
}
