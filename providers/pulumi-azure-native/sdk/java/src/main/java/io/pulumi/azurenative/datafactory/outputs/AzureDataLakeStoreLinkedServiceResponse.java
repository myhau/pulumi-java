// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.CredentialReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.outputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureDataLakeStoreLinkedServiceResponse {
    /**
     * Data Lake Store account name. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object accountName;
    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * Indicates the azure cloud type of the service principle auth. Allowed values are AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object azureCloudType;
    /**
     * The integration runtime reference.
     * 
     */
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;
    /**
     * The credential reference containing authentication information.
     * 
     */
    private final @Nullable CredentialReferenceResponse credential;
    /**
     * Data Lake Store service URI. Type: string (or Expression with resultType string).
     * 
     */
    private final Object dataLakeStoreUri;
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
     * Data Lake Store account resource group name (if different from Data Factory account). Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object resourceGroupName;
    /**
     * The ID of the application used to authenticate against the Azure Data Lake Store account. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object servicePrincipalId;
    /**
     * The Key of the application used to authenticate against the Azure Data Lake Store account.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;
    /**
     * Data Lake Store account subscription ID (if different from Data Factory account). Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object subscriptionId;
    /**
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object tenant;
    /**
     * Type of linked service.
     * Expected value is 'AzureDataLakeStore'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"accountName","annotations","azureCloudType","connectVia","credential","dataLakeStoreUri","description","encryptedCredential","parameters","resourceGroupName","servicePrincipalId","servicePrincipalKey","subscriptionId","tenant","type"})
    private AzureDataLakeStoreLinkedServiceResponse(
        @Nullable Object accountName,
        @Nullable List<Object> annotations,
        @Nullable Object azureCloudType,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable CredentialReferenceResponse credential,
        Object dataLakeStoreUri,
        @Nullable String description,
        @Nullable Object encryptedCredential,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Object resourceGroupName,
        @Nullable Object servicePrincipalId,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey,
        @Nullable Object subscriptionId,
        @Nullable Object tenant,
        String type) {
        this.accountName = accountName;
        this.annotations = annotations;
        this.azureCloudType = azureCloudType;
        this.connectVia = connectVia;
        this.credential = credential;
        this.dataLakeStoreUri = dataLakeStoreUri;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.resourceGroupName = resourceGroupName;
        this.servicePrincipalId = servicePrincipalId;
        this.servicePrincipalKey = servicePrincipalKey;
        this.subscriptionId = subscriptionId;
        this.tenant = tenant;
        this.type = type;
    }

    /**
     * Data Lake Store account name. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getAccountName() {
        return Optional.ofNullable(this.accountName);
    }
    /**
     * List of tags that can be used for describing the linked service.
     * 
    */
    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * Indicates the azure cloud type of the service principle auth. Allowed values are AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getAzureCloudType() {
        return Optional.ofNullable(this.azureCloudType);
    }
    /**
     * The integration runtime reference.
     * 
    */
    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return Optional.ofNullable(this.connectVia);
    }
    /**
     * The credential reference containing authentication information.
     * 
    */
    public Optional<CredentialReferenceResponse> getCredential() {
        return Optional.ofNullable(this.credential);
    }
    /**
     * Data Lake Store service URI. Type: string (or Expression with resultType string).
     * 
    */
    public Object getDataLakeStoreUri() {
        return this.dataLakeStoreUri;
    }
    /**
     * Linked service description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getEncryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }
    /**
     * Parameters for linked service.
     * 
    */
    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * Data Lake Store account resource group name (if different from Data Factory account). Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getResourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }
    /**
     * The ID of the application used to authenticate against the Azure Data Lake Store account. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getServicePrincipalId() {
        return Optional.ofNullable(this.servicePrincipalId);
    }
    /**
     * The Key of the application used to authenticate against the Azure Data Lake Store account.
     * 
    */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getServicePrincipalKey() {
        return Optional.ofNullable(this.servicePrincipalKey);
    }
    /**
     * Data Lake Store account subscription ID (if different from Data Factory account). Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getSubscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }
    /**
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getTenant() {
        return Optional.ofNullable(this.tenant);
    }
    /**
     * Type of linked service.
     * Expected value is 'AzureDataLakeStore'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureDataLakeStoreLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object accountName;
        private @Nullable List<Object> annotations;
        private @Nullable Object azureCloudType;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable CredentialReferenceResponse credential;
        private Object dataLakeStoreUri;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Object resourceGroupName;
        private @Nullable Object servicePrincipalId;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;
        private @Nullable Object subscriptionId;
        private @Nullable Object tenant;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureDataLakeStoreLinkedServiceResponse defaults) {
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

        public Builder setAccountName(@Nullable Object accountName) {
            this.accountName = accountName;
            return this;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAzureCloudType(@Nullable Object azureCloudType) {
            this.azureCloudType = azureCloudType;
            return this;
        }

        public Builder setConnectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder setCredential(@Nullable CredentialReferenceResponse credential) {
            this.credential = credential;
            return this;
        }

        public Builder setDataLakeStoreUri(Object dataLakeStoreUri) {
            this.dataLakeStoreUri = Objects.requireNonNull(dataLakeStoreUri);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEncryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setResourceGroupName(@Nullable Object resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder setServicePrincipalId(@Nullable Object servicePrincipalId) {
            this.servicePrincipalId = servicePrincipalId;
            return this;
        }

        public Builder setServicePrincipalKey(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey) {
            this.servicePrincipalKey = servicePrincipalKey;
            return this;
        }

        public Builder setSubscriptionId(@Nullable Object subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        public Builder setTenant(@Nullable Object tenant) {
            this.tenant = tenant;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public AzureDataLakeStoreLinkedServiceResponse build() {
            return new AzureDataLakeStoreLinkedServiceResponse(accountName, annotations, azureCloudType, connectVia, credential, dataLakeStoreUri, description, encryptedCredential, parameters, resourceGroupName, servicePrincipalId, servicePrincipalKey, subscriptionId, tenant, type);
        }
    }
}
