// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.CredentialReferenceArgs;
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
 * Azure Data Lake Store linked service.
 * 
 */
public final class AzureDataLakeStoreLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureDataLakeStoreLinkedServiceArgs Empty = new AzureDataLakeStoreLinkedServiceArgs();

    /**
     * Data Lake Store account name. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="accountName")
      private final @Nullable Output<Object> accountName;

    public Output<Object> accountName() {
        return this.accountName == null ? Codegen.empty() : this.accountName;
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
     * Indicates the azure cloud type of the service principle auth. Allowed values are AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="azureCloudType")
      private final @Nullable Output<Object> azureCloudType;

    public Output<Object> azureCloudType() {
        return this.azureCloudType == null ? Codegen.empty() : this.azureCloudType;
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
     * The credential reference containing authentication information.
     * 
     */
    @Import(name="credential")
      private final @Nullable Output<CredentialReferenceArgs> credential;

    public Output<CredentialReferenceArgs> credential() {
        return this.credential == null ? Codegen.empty() : this.credential;
    }

    /**
     * Data Lake Store service URI. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="dataLakeStoreUri", required=true)
      private final Output<Object> dataLakeStoreUri;

    public Output<Object> dataLakeStoreUri() {
        return this.dataLakeStoreUri;
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
     * Data Lake Store account resource group name (if different from Data Factory account). Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="resourceGroupName")
      private final @Nullable Output<Object> resourceGroupName;

    public Output<Object> resourceGroupName() {
        return this.resourceGroupName == null ? Codegen.empty() : this.resourceGroupName;
    }

    /**
     * The ID of the application used to authenticate against the Azure Data Lake Store account. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalId")
      private final @Nullable Output<Object> servicePrincipalId;

    public Output<Object> servicePrincipalId() {
        return this.servicePrincipalId == null ? Codegen.empty() : this.servicePrincipalId;
    }

    /**
     * The Key of the application used to authenticate against the Azure Data Lake Store account.
     * 
     */
    @Import(name="servicePrincipalKey")
      private final @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey() {
        return this.servicePrincipalKey == null ? Codegen.empty() : this.servicePrincipalKey;
    }

    /**
     * Data Lake Store account subscription ID (if different from Data Factory account). Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="subscriptionId")
      private final @Nullable Output<Object> subscriptionId;

    public Output<Object> subscriptionId() {
        return this.subscriptionId == null ? Codegen.empty() : this.subscriptionId;
    }

    /**
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="tenant")
      private final @Nullable Output<Object> tenant;

    public Output<Object> tenant() {
        return this.tenant == null ? Codegen.empty() : this.tenant;
    }

    /**
     * Type of linked service.
     * Expected value is 'AzureDataLakeStore'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public AzureDataLakeStoreLinkedServiceArgs(
        @Nullable Output<Object> accountName,
        @Nullable Output<List<Object>> annotations,
        @Nullable Output<Object> azureCloudType,
        @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Output<CredentialReferenceArgs> credential,
        Output<Object> dataLakeStoreUri,
        @Nullable Output<String> description,
        @Nullable Output<Object> encryptedCredential,
        @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Output<Object> resourceGroupName,
        @Nullable Output<Object> servicePrincipalId,
        @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey,
        @Nullable Output<Object> subscriptionId,
        @Nullable Output<Object> tenant,
        Output<String> type) {
        this.accountName = accountName;
        this.annotations = annotations;
        this.azureCloudType = azureCloudType;
        this.connectVia = connectVia;
        this.credential = credential;
        this.dataLakeStoreUri = Objects.requireNonNull(dataLakeStoreUri, "expected parameter 'dataLakeStoreUri' to be non-null");
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.resourceGroupName = resourceGroupName;
        this.servicePrincipalId = servicePrincipalId;
        this.servicePrincipalKey = servicePrincipalKey;
        this.subscriptionId = subscriptionId;
        this.tenant = tenant;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AzureDataLakeStoreLinkedServiceArgs() {
        this.accountName = Codegen.empty();
        this.annotations = Codegen.empty();
        this.azureCloudType = Codegen.empty();
        this.connectVia = Codegen.empty();
        this.credential = Codegen.empty();
        this.dataLakeStoreUri = Codegen.empty();
        this.description = Codegen.empty();
        this.encryptedCredential = Codegen.empty();
        this.parameters = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.servicePrincipalId = Codegen.empty();
        this.servicePrincipalKey = Codegen.empty();
        this.subscriptionId = Codegen.empty();
        this.tenant = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureDataLakeStoreLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> accountName;
        private @Nullable Output<List<Object>> annotations;
        private @Nullable Output<Object> azureCloudType;
        private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Output<CredentialReferenceArgs> credential;
        private Output<Object> dataLakeStoreUri;
        private @Nullable Output<String> description;
        private @Nullable Output<Object> encryptedCredential;
        private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Output<Object> resourceGroupName;
        private @Nullable Output<Object> servicePrincipalId;
        private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey;
        private @Nullable Output<Object> subscriptionId;
        private @Nullable Output<Object> tenant;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureDataLakeStoreLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.annotations = defaults.annotations;
    	      this.azureCloudType = defaults.azureCloudType;
    	      this.connectVia = defaults.connectVia;
    	      this.credential = defaults.credential;
    	      this.dataLakeStoreUri = defaults.dataLakeStoreUri;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.servicePrincipalId = defaults.servicePrincipalId;
    	      this.servicePrincipalKey = defaults.servicePrincipalKey;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.tenant = defaults.tenant;
    	      this.type = defaults.type;
        }

        public Builder accountName(@Nullable Output<Object> accountName) {
            this.accountName = accountName;
            return this;
        }
        public Builder accountName(@Nullable Object accountName) {
            this.accountName = Codegen.ofNullable(accountName);
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
        public Builder azureCloudType(@Nullable Output<Object> azureCloudType) {
            this.azureCloudType = azureCloudType;
            return this;
        }
        public Builder azureCloudType(@Nullable Object azureCloudType) {
            this.azureCloudType = Codegen.ofNullable(azureCloudType);
            return this;
        }
        public Builder connectVia(@Nullable Output<IntegrationRuntimeReferenceArgs> connectVia) {
            this.connectVia = connectVia;
            return this;
        }
        public Builder connectVia(@Nullable IntegrationRuntimeReferenceArgs connectVia) {
            this.connectVia = Codegen.ofNullable(connectVia);
            return this;
        }
        public Builder credential(@Nullable Output<CredentialReferenceArgs> credential) {
            this.credential = credential;
            return this;
        }
        public Builder credential(@Nullable CredentialReferenceArgs credential) {
            this.credential = Codegen.ofNullable(credential);
            return this;
        }
        public Builder dataLakeStoreUri(Output<Object> dataLakeStoreUri) {
            this.dataLakeStoreUri = Objects.requireNonNull(dataLakeStoreUri);
            return this;
        }
        public Builder dataLakeStoreUri(Object dataLakeStoreUri) {
            this.dataLakeStoreUri = Output.of(Objects.requireNonNull(dataLakeStoreUri));
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
        public Builder resourceGroupName(@Nullable Output<Object> resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public Builder resourceGroupName(@Nullable Object resourceGroupName) {
            this.resourceGroupName = Codegen.ofNullable(resourceGroupName);
            return this;
        }
        public Builder servicePrincipalId(@Nullable Output<Object> servicePrincipalId) {
            this.servicePrincipalId = servicePrincipalId;
            return this;
        }
        public Builder servicePrincipalId(@Nullable Object servicePrincipalId) {
            this.servicePrincipalId = Codegen.ofNullable(servicePrincipalId);
            return this;
        }
        public Builder servicePrincipalKey(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey) {
            this.servicePrincipalKey = servicePrincipalKey;
            return this;
        }
        public Builder servicePrincipalKey(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> servicePrincipalKey) {
            this.servicePrincipalKey = Codegen.ofNullable(servicePrincipalKey);
            return this;
        }
        public Builder subscriptionId(@Nullable Output<Object> subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }
        public Builder subscriptionId(@Nullable Object subscriptionId) {
            this.subscriptionId = Codegen.ofNullable(subscriptionId);
            return this;
        }
        public Builder tenant(@Nullable Output<Object> tenant) {
            this.tenant = tenant;
            return this;
        }
        public Builder tenant(@Nullable Object tenant) {
            this.tenant = Codegen.ofNullable(tenant);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public AzureDataLakeStoreLinkedServiceArgs build() {
            return new AzureDataLakeStoreLinkedServiceArgs(accountName, annotations, azureCloudType, connectVia, credential, dataLakeStoreUri, description, encryptedCredential, parameters, resourceGroupName, servicePrincipalId, servicePrincipalKey, subscriptionId, tenant, type);
        }
    }
}
