// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingEncryptionAtRest {
    /**
     * The encryption-at-rest mode for encrypting Data Catalog data.
     * 
     */
    private final String catalogEncryptionMode;
    /**
     * The ARN of the AWS KMS key to use for encryption at rest.
     * 
     */
    private final String sseAwsKmsKeyId;

    @OutputCustomType.Constructor({"catalogEncryptionMode","sseAwsKmsKeyId"})
    private GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingEncryptionAtRest(
        String catalogEncryptionMode,
        String sseAwsKmsKeyId) {
        this.catalogEncryptionMode = Objects.requireNonNull(catalogEncryptionMode);
        this.sseAwsKmsKeyId = Objects.requireNonNull(sseAwsKmsKeyId);
    }

    /**
     * The encryption-at-rest mode for encrypting Data Catalog data.
     * 
     */
    public String getCatalogEncryptionMode() {
        return this.catalogEncryptionMode;
    }
    /**
     * The ARN of the AWS KMS key to use for encryption at rest.
     * 
     */
    public String getSseAwsKmsKeyId() {
        return this.sseAwsKmsKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingEncryptionAtRest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String catalogEncryptionMode;
        private String sseAwsKmsKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingEncryptionAtRest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogEncryptionMode = defaults.catalogEncryptionMode;
    	      this.sseAwsKmsKeyId = defaults.sseAwsKmsKeyId;
        }

        public Builder setCatalogEncryptionMode(String catalogEncryptionMode) {
            this.catalogEncryptionMode = Objects.requireNonNull(catalogEncryptionMode);
            return this;
        }

        public Builder setSseAwsKmsKeyId(String sseAwsKmsKeyId) {
            this.sseAwsKmsKeyId = Objects.requireNonNull(sseAwsKmsKeyId);
            return this;
        }
        public GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingEncryptionAtRest build() {
            return new GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingEncryptionAtRest(catalogEncryptionMode, sseAwsKmsKeyId);
        }
    }
}
