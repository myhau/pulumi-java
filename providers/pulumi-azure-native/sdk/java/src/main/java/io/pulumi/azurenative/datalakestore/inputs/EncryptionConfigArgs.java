// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakestore.inputs;

import io.pulumi.azurenative.datalakestore.enums.EncryptionConfigType;
import io.pulumi.azurenative.datalakestore.inputs.KeyVaultMetaInfoArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The encryption configuration for the account.
 * 
 */
public final class EncryptionConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final EncryptionConfigArgs Empty = new EncryptionConfigArgs();

    /**
     * The Key Vault information for connecting to user managed encryption keys.
     * 
     */
    @Import(name="keyVaultMetaInfo")
      private final @Nullable Output<KeyVaultMetaInfoArgs> keyVaultMetaInfo;

    public Output<KeyVaultMetaInfoArgs> keyVaultMetaInfo() {
        return this.keyVaultMetaInfo == null ? Codegen.empty() : this.keyVaultMetaInfo;
    }

    /**
     * The type of encryption configuration being used. Currently the only supported types are 'UserManaged' and 'ServiceManaged'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<EncryptionConfigType> type;

    public Output<EncryptionConfigType> type() {
        return this.type;
    }

    public EncryptionConfigArgs(
        @Nullable Output<KeyVaultMetaInfoArgs> keyVaultMetaInfo,
        Output<EncryptionConfigType> type) {
        this.keyVaultMetaInfo = keyVaultMetaInfo;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private EncryptionConfigArgs() {
        this.keyVaultMetaInfo = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<KeyVaultMetaInfoArgs> keyVaultMetaInfo;
        private Output<EncryptionConfigType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyVaultMetaInfo = defaults.keyVaultMetaInfo;
    	      this.type = defaults.type;
        }

        public Builder keyVaultMetaInfo(@Nullable Output<KeyVaultMetaInfoArgs> keyVaultMetaInfo) {
            this.keyVaultMetaInfo = keyVaultMetaInfo;
            return this;
        }
        public Builder keyVaultMetaInfo(@Nullable KeyVaultMetaInfoArgs keyVaultMetaInfo) {
            this.keyVaultMetaInfo = Codegen.ofNullable(keyVaultMetaInfo);
            return this;
        }
        public Builder type(Output<EncryptionConfigType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(EncryptionConfigType type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public EncryptionConfigArgs build() {
            return new EncryptionConfigArgs(keyVaultMetaInfo, type);
        }
    }
}
