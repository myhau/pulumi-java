// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.outputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AmazonS3LinkedServiceResponse {
    /**
     * The access key identifier of the Amazon S3 Identity and Access Management (IAM) user. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object accessKeyId;
    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * The authentication type of S3. Allowed value: AccessKey (default) or TemporarySecurityCredentials. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object authenticationType;
    /**
     * The integration runtime reference.
     * 
     */
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;
    /**
     * Linked service description.
     * 
     */
    private final @Nullable String description;
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object encryptedCredential;
    /**
     * Parameters for linked service.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * The secret access key of the Amazon S3 Identity and Access Management (IAM) user.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> secretAccessKey;
    /**
     * This value specifies the endpoint to access with the S3 Connector. This is an optional property; change it only if you want to try a different service endpoint or want to switch between https and http. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object serviceUrl;
    /**
     * The session token for the S3 temporary security credential.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> sessionToken;
    /**
     * Type of linked service.
     * Expected value is 'AmazonS3'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private AmazonS3LinkedServiceResponse(
        @CustomType.Parameter("accessKeyId") @Nullable Object accessKeyId,
        @CustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @CustomType.Parameter("authenticationType") @Nullable Object authenticationType,
        @CustomType.Parameter("connectVia") @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("encryptedCredential") @Nullable Object encryptedCredential,
        @CustomType.Parameter("parameters") @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @CustomType.Parameter("secretAccessKey") @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> secretAccessKey,
        @CustomType.Parameter("serviceUrl") @Nullable Object serviceUrl,
        @CustomType.Parameter("sessionToken") @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> sessionToken,
        @CustomType.Parameter("type") String type) {
        this.accessKeyId = accessKeyId;
        this.annotations = annotations;
        this.authenticationType = authenticationType;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.secretAccessKey = secretAccessKey;
        this.serviceUrl = serviceUrl;
        this.sessionToken = sessionToken;
        this.type = type;
    }

    /**
     * The access key identifier of the Amazon S3 Identity and Access Management (IAM) user. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> accessKeyId() {
        return Optional.ofNullable(this.accessKeyId);
    }
    /**
     * List of tags that can be used for describing the linked service.
     * 
    */
    public List<Object> annotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * The authentication type of S3. Allowed value: AccessKey (default) or TemporarySecurityCredentials. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> authenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }
    /**
     * The integration runtime reference.
     * 
    */
    public Optional<IntegrationRuntimeReferenceResponse> connectVia() {
        return Optional.ofNullable(this.connectVia);
    }
    /**
     * Linked service description.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> encryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }
    /**
     * Parameters for linked service.
     * 
    */
    public Map<String,ParameterSpecificationResponse> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * The secret access key of the Amazon S3 Identity and Access Management (IAM) user.
     * 
    */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> secretAccessKey() {
        return Optional.ofNullable(this.secretAccessKey);
    }
    /**
     * This value specifies the endpoint to access with the S3 Connector. This is an optional property; change it only if you want to try a different service endpoint or want to switch between https and http. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> serviceUrl() {
        return Optional.ofNullable(this.serviceUrl);
    }
    /**
     * The session token for the S3 temporary security credential.
     * 
    */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> sessionToken() {
        return Optional.ofNullable(this.sessionToken);
    }
    /**
     * Type of linked service.
     * Expected value is 'AmazonS3'.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AmazonS3LinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object accessKeyId;
        private @Nullable List<Object> annotations;
        private @Nullable Object authenticationType;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> secretAccessKey;
        private @Nullable Object serviceUrl;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> sessionToken;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AmazonS3LinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKeyId = defaults.accessKeyId;
    	      this.annotations = defaults.annotations;
    	      this.authenticationType = defaults.authenticationType;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.secretAccessKey = defaults.secretAccessKey;
    	      this.serviceUrl = defaults.serviceUrl;
    	      this.sessionToken = defaults.sessionToken;
    	      this.type = defaults.type;
        }

        public Builder accessKeyId(@Nullable Object accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder authenticationType(@Nullable Object authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public Builder connectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder secretAccessKey(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> secretAccessKey) {
            this.secretAccessKey = secretAccessKey;
            return this;
        }
        public Builder serviceUrl(@Nullable Object serviceUrl) {
            this.serviceUrl = serviceUrl;
            return this;
        }
        public Builder sessionToken(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> sessionToken) {
            this.sessionToken = sessionToken;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public AmazonS3LinkedServiceResponse build() {
            return new AmazonS3LinkedServiceResponse(accessKeyId, annotations, authenticationType, connectVia, description, encryptedCredential, parameters, secretAccessKey, serviceUrl, sessionToken, type);
        }
    }
}
