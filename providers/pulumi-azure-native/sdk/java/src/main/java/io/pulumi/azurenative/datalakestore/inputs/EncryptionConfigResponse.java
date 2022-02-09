// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakestore.inputs;

import io.pulumi.azurenative.datalakestore.inputs.KeyVaultMetaInfoResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EncryptionConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final EncryptionConfigResponse Empty = new EncryptionConfigResponse();

    @InputImport(name="keyVaultMetaInfo")
    private final @Nullable KeyVaultMetaInfoResponse keyVaultMetaInfo;

    public Optional<KeyVaultMetaInfoResponse> getKeyVaultMetaInfo() {
        return this.keyVaultMetaInfo == null ? Optional.empty() : Optional.ofNullable(this.keyVaultMetaInfo);
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public EncryptionConfigResponse(
        @Nullable KeyVaultMetaInfoResponse keyVaultMetaInfo,
        String type) {
        this.keyVaultMetaInfo = keyVaultMetaInfo;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private EncryptionConfigResponse() {
        this.keyVaultMetaInfo = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable KeyVaultMetaInfoResponse keyVaultMetaInfo;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyVaultMetaInfo = defaults.keyVaultMetaInfo;
    	      this.type = defaults.type;
        }

        public Builder setKeyVaultMetaInfo(@Nullable KeyVaultMetaInfoResponse keyVaultMetaInfo) {
            this.keyVaultMetaInfo = keyVaultMetaInfo;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public EncryptionConfigResponse build() {
            return new EncryptionConfigResponse(keyVaultMetaInfo, type);
        }
    }
}