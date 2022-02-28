// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingConnectionPasswordEncryption extends io.pulumi.resources.InvokeArgs {

    public static final GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingConnectionPasswordEncryption Empty = new GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingConnectionPasswordEncryption();

    /**
     * A KMS key ARN that is used to encrypt the connection password.
     * 
     */
    @InputImport(name="awsKmsKeyId", required=true)
      private final String awsKmsKeyId;

    public String getAwsKmsKeyId() {
        return this.awsKmsKeyId;
    }

    /**
     * When set to `true`, passwords remain encrypted in the responses of GetConnection and GetConnections. This encryption takes effect independently of the catalog encryption.
     * 
     */
    @InputImport(name="returnConnectionPasswordEncrypted", required=true)
      private final Boolean returnConnectionPasswordEncrypted;

    public Boolean getReturnConnectionPasswordEncrypted() {
        return this.returnConnectionPasswordEncrypted;
    }

    public GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingConnectionPasswordEncryption(
        String awsKmsKeyId,
        Boolean returnConnectionPasswordEncrypted) {
        this.awsKmsKeyId = Objects.requireNonNull(awsKmsKeyId, "expected parameter 'awsKmsKeyId' to be non-null");
        this.returnConnectionPasswordEncrypted = Objects.requireNonNull(returnConnectionPasswordEncrypted, "expected parameter 'returnConnectionPasswordEncrypted' to be non-null");
    }

    private GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingConnectionPasswordEncryption() {
        this.awsKmsKeyId = null;
        this.returnConnectionPasswordEncrypted = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingConnectionPasswordEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String awsKmsKeyId;
        private Boolean returnConnectionPasswordEncrypted;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingConnectionPasswordEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsKmsKeyId = defaults.awsKmsKeyId;
    	      this.returnConnectionPasswordEncrypted = defaults.returnConnectionPasswordEncrypted;
        }

        public Builder setAwsKmsKeyId(String awsKmsKeyId) {
            this.awsKmsKeyId = Objects.requireNonNull(awsKmsKeyId);
            return this;
        }

        public Builder setReturnConnectionPasswordEncrypted(Boolean returnConnectionPasswordEncrypted) {
            this.returnConnectionPasswordEncrypted = Objects.requireNonNull(returnConnectionPasswordEncrypted);
            return this;
        }
        public GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingConnectionPasswordEncryption build() {
            return new GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingConnectionPasswordEncryption(awsKmsKeyId, returnConnectionPasswordEncrypted);
        }
    }
}
