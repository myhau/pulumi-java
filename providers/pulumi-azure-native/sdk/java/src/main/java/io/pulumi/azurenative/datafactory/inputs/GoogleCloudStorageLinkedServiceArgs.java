// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import io.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Linked service for Google Cloud Storage.
 * 
 */
public final class GoogleCloudStorageLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudStorageLinkedServiceArgs Empty = new GoogleCloudStorageLinkedServiceArgs();

    /**
     * The access key identifier of the Google Cloud Storage Identity and Access Management (IAM) user. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="accessKeyId")
      private final @Nullable Output<Object> accessKeyId;

    public Output<Object> accessKeyId() {
        return this.accessKeyId == null ? Codegen.empty() : this.accessKeyId;
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
      private final @Nullable Output<List<Object>> annotations;

    public Output<List<Object>> annotations() {
        return this.annotations == null ? Codegen.empty() : this.annotations;
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
      private final @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;

    public Output<IntegrationRuntimeReferenceArgs> connectVia() {
        return this.connectVia == null ? Codegen.empty() : this.connectVia;
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
      private final @Nullable Output<Object> encryptedCredential;

    public Output<Object> encryptedCredential() {
        return this.encryptedCredential == null ? Codegen.empty() : this.encryptedCredential;
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;

    public Output<Map<String,ParameterSpecificationArgs>> parameters() {
        return this.parameters == null ? Codegen.empty() : this.parameters;
    }

    /**
     * The secret access key of the Google Cloud Storage Identity and Access Management (IAM) user.
     * 
     */
    @Import(name="secretAccessKey")
      private final @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> secretAccessKey;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> secretAccessKey() {
        return this.secretAccessKey == null ? Codegen.empty() : this.secretAccessKey;
    }

    /**
     * This value specifies the endpoint to access with the Google Cloud Storage Connector. This is an optional property; change it only if you want to try a different service endpoint or want to switch between https and http. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="serviceUrl")
      private final @Nullable Output<Object> serviceUrl;

    public Output<Object> serviceUrl() {
        return this.serviceUrl == null ? Codegen.empty() : this.serviceUrl;
    }

    /**
     * Type of linked service.
     * Expected value is 'GoogleCloudStorage'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public GoogleCloudStorageLinkedServiceArgs(
        @Nullable Output<Object> accessKeyId,
        @Nullable Output<List<Object>> annotations,
        @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Output<String> description,
        @Nullable Output<Object> encryptedCredential,
        @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> secretAccessKey,
        @Nullable Output<Object> serviceUrl,
        Output<String> type) {
        this.accessKeyId = accessKeyId;
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.secretAccessKey = secretAccessKey;
        this.serviceUrl = serviceUrl;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GoogleCloudStorageLinkedServiceArgs() {
        this.accessKeyId = Codegen.empty();
        this.annotations = Codegen.empty();
        this.connectVia = Codegen.empty();
        this.description = Codegen.empty();
        this.encryptedCredential = Codegen.empty();
        this.parameters = Codegen.empty();
        this.secretAccessKey = Codegen.empty();
        this.serviceUrl = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudStorageLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> accessKeyId;
        private @Nullable Output<List<Object>> annotations;
        private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Output<String> description;
        private @Nullable Output<Object> encryptedCredential;
        private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> secretAccessKey;
        private @Nullable Output<Object> serviceUrl;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudStorageLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKeyId = defaults.accessKeyId;
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.secretAccessKey = defaults.secretAccessKey;
    	      this.serviceUrl = defaults.serviceUrl;
    	      this.type = defaults.type;
        }

        public Builder accessKeyId(@Nullable Output<Object> accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public Builder accessKeyId(@Nullable Object accessKeyId) {
            this.accessKeyId = Codegen.ofNullable(accessKeyId);
            return this;
        }
        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = Codegen.ofNullable(annotations);
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder connectVia(@Nullable Output<IntegrationRuntimeReferenceArgs> connectVia) {
            this.connectVia = connectVia;
            return this;
        }
        public Builder connectVia(@Nullable IntegrationRuntimeReferenceArgs connectVia) {
            this.connectVia = Codegen.ofNullable(connectVia);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder encryptedCredential(@Nullable Output<Object> encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }
        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = Codegen.ofNullable(encryptedCredential);
            return this;
        }
        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterSpecificationArgs> parameters) {
            this.parameters = Codegen.ofNullable(parameters);
            return this;
        }
        public Builder secretAccessKey(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> secretAccessKey) {
            this.secretAccessKey = secretAccessKey;
            return this;
        }
        public Builder secretAccessKey(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> secretAccessKey) {
            this.secretAccessKey = Codegen.ofNullable(secretAccessKey);
            return this;
        }
        public Builder serviceUrl(@Nullable Output<Object> serviceUrl) {
            this.serviceUrl = serviceUrl;
            return this;
        }
        public Builder serviceUrl(@Nullable Object serviceUrl) {
            this.serviceUrl = Codegen.ofNullable(serviceUrl);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public GoogleCloudStorageLinkedServiceArgs build() {
            return new GoogleCloudStorageLinkedServiceArgs(accessKeyId, annotations, connectVia, description, encryptedCredential, parameters, secretAccessKey, serviceUrl, type);
        }
    }
}
