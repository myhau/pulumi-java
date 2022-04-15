// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.inputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Open Data Protocol (OData) linked service.
 * 
 */
public final class ODataLinkedServiceResponse extends io.pulumi.resources.InvokeArgs {

    public static final ODataLinkedServiceResponse Empty = new ODataLinkedServiceResponse();

    /**
     * Specify the resource you are requesting authorization to use Directory. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="aadResourceId")
      private final @Nullable Object aadResourceId;

    public Optional<Object> aadResourceId() {
        return this.aadResourceId == null ? Optional.empty() : Optional.ofNullable(this.aadResourceId);
    }

    /**
     * Specify the credential type (key or cert) is used for service principal.
     * 
     */
    @Import(name="aadServicePrincipalCredentialType")
      private final @Nullable String aadServicePrincipalCredentialType;

    public Optional<String> aadServicePrincipalCredentialType() {
        return this.aadServicePrincipalCredentialType == null ? Optional.empty() : Optional.ofNullable(this.aadServicePrincipalCredentialType);
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
      private final @Nullable List<Object> annotations;

    public List<Object> annotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }

    /**
     * The additional HTTP headers in the request to RESTful API used for authorization. Type: object (or Expression with resultType object).
     * 
     */
    @Import(name="authHeaders")
      private final @Nullable Object authHeaders;

    public Optional<Object> authHeaders() {
        return this.authHeaders == null ? Optional.empty() : Optional.ofNullable(this.authHeaders);
    }

    /**
     * Type of authentication used to connect to the OData service.
     * 
     */
    @Import(name="authenticationType")
      private final @Nullable String authenticationType;

    public Optional<String> authenticationType() {
        return this.authenticationType == null ? Optional.empty() : Optional.ofNullable(this.authenticationType);
    }

    /**
     * Indicates the azure cloud type of the service principle auth. Allowed values are AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="azureCloudType")
      private final @Nullable Object azureCloudType;

    public Optional<Object> azureCloudType() {
        return this.azureCloudType == null ? Optional.empty() : Optional.ofNullable(this.azureCloudType);
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
      private final @Nullable IntegrationRuntimeReferenceResponse connectVia;

    public Optional<IntegrationRuntimeReferenceResponse> connectVia() {
        return this.connectVia == null ? Optional.empty() : Optional.ofNullable(this.connectVia);
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
      private final @Nullable Object encryptedCredential;

    public Optional<Object> encryptedCredential() {
        return this.encryptedCredential == null ? Optional.empty() : Optional.ofNullable(this.encryptedCredential);
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Map<String,ParameterSpecificationResponse> parameters;

    public Map<String,ParameterSpecificationResponse> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    /**
     * Password of the OData service.
     * 
     */
    @Import(name="password")
      private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password() {
        return this.password == null ? null : this.password;
    }

    /**
     * Specify the base64 encoded certificate of your application registered in Azure Active Directory. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalEmbeddedCert")
      private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalEmbeddedCert;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalEmbeddedCert() {
        return this.servicePrincipalEmbeddedCert == null ? null : this.servicePrincipalEmbeddedCert;
    }

    /**
     * Specify the password of your certificate if your certificate has a password and you are using AadServicePrincipal authentication. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalEmbeddedCertPassword")
      private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalEmbeddedCertPassword;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalEmbeddedCertPassword() {
        return this.servicePrincipalEmbeddedCertPassword == null ? null : this.servicePrincipalEmbeddedCertPassword;
    }

    /**
     * Specify the application id of your application registered in Azure Active Directory. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalId")
      private final @Nullable Object servicePrincipalId;

    public Optional<Object> servicePrincipalId() {
        return this.servicePrincipalId == null ? Optional.empty() : Optional.ofNullable(this.servicePrincipalId);
    }

    /**
     * Specify the secret of your application registered in Azure Active Directory. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalKey")
      private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey() {
        return this.servicePrincipalKey == null ? null : this.servicePrincipalKey;
    }

    /**
     * Specify the tenant information (domain name or tenant ID) under which your application resides. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="tenant")
      private final @Nullable Object tenant;

    public Optional<Object> tenant() {
        return this.tenant == null ? Optional.empty() : Optional.ofNullable(this.tenant);
    }

    /**
     * Type of linked service.
     * Expected value is 'OData'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    /**
     * The URL of the OData service endpoint. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="url", required=true)
      private final Object url;

    public Object url() {
        return this.url;
    }

    /**
     * User name of the OData service. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="userName")
      private final @Nullable Object userName;

    public Optional<Object> userName() {
        return this.userName == null ? Optional.empty() : Optional.ofNullable(this.userName);
    }

    public ODataLinkedServiceResponse(
        @Nullable Object aadResourceId,
        @Nullable String aadServicePrincipalCredentialType,
        @Nullable List<Object> annotations,
        @Nullable Object authHeaders,
        @Nullable String authenticationType,
        @Nullable Object azureCloudType,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable String description,
        @Nullable Object encryptedCredential,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalEmbeddedCert,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalEmbeddedCertPassword,
        @Nullable Object servicePrincipalId,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey,
        @Nullable Object tenant,
        String type,
        Object url,
        @Nullable Object userName) {
        this.aadResourceId = aadResourceId;
        this.aadServicePrincipalCredentialType = aadServicePrincipalCredentialType;
        this.annotations = annotations;
        this.authHeaders = authHeaders;
        this.authenticationType = authenticationType;
        this.azureCloudType = azureCloudType;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.password = password;
        this.servicePrincipalEmbeddedCert = servicePrincipalEmbeddedCert;
        this.servicePrincipalEmbeddedCertPassword = servicePrincipalEmbeddedCertPassword;
        this.servicePrincipalId = servicePrincipalId;
        this.servicePrincipalKey = servicePrincipalKey;
        this.tenant = tenant;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
        this.userName = userName;
    }

    private ODataLinkedServiceResponse() {
        this.aadResourceId = null;
        this.aadServicePrincipalCredentialType = null;
        this.annotations = List.of();
        this.authHeaders = null;
        this.authenticationType = null;
        this.azureCloudType = null;
        this.connectVia = null;
        this.description = null;
        this.encryptedCredential = null;
        this.parameters = Map.of();
        this.password = null;
        this.servicePrincipalEmbeddedCert = null;
        this.servicePrincipalEmbeddedCertPassword = null;
        this.servicePrincipalId = null;
        this.servicePrincipalKey = null;
        this.tenant = null;
        this.type = null;
        this.url = null;
        this.userName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ODataLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object aadResourceId;
        private @Nullable String aadServicePrincipalCredentialType;
        private @Nullable List<Object> annotations;
        private @Nullable Object authHeaders;
        private @Nullable String authenticationType;
        private @Nullable Object azureCloudType;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalEmbeddedCert;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalEmbeddedCertPassword;
        private @Nullable Object servicePrincipalId;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;
        private @Nullable Object tenant;
        private String type;
        private Object url;
        private @Nullable Object userName;

        public Builder() {
    	      // Empty
        }

        public Builder(ODataLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadResourceId = defaults.aadResourceId;
    	      this.aadServicePrincipalCredentialType = defaults.aadServicePrincipalCredentialType;
    	      this.annotations = defaults.annotations;
    	      this.authHeaders = defaults.authHeaders;
    	      this.authenticationType = defaults.authenticationType;
    	      this.azureCloudType = defaults.azureCloudType;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.servicePrincipalEmbeddedCert = defaults.servicePrincipalEmbeddedCert;
    	      this.servicePrincipalEmbeddedCertPassword = defaults.servicePrincipalEmbeddedCertPassword;
    	      this.servicePrincipalId = defaults.servicePrincipalId;
    	      this.servicePrincipalKey = defaults.servicePrincipalKey;
    	      this.tenant = defaults.tenant;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
    	      this.userName = defaults.userName;
        }

        public Builder aadResourceId(@Nullable Object aadResourceId) {
            this.aadResourceId = aadResourceId;
            return this;
        }
        public Builder aadServicePrincipalCredentialType(@Nullable String aadServicePrincipalCredentialType) {
            this.aadServicePrincipalCredentialType = aadServicePrincipalCredentialType;
            return this;
        }
        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder authHeaders(@Nullable Object authHeaders) {
            this.authHeaders = authHeaders;
            return this;
        }
        public Builder authenticationType(@Nullable String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public Builder azureCloudType(@Nullable Object azureCloudType) {
            this.azureCloudType = azureCloudType;
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
        public Builder password(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password) {
            this.password = password;
            return this;
        }
        public Builder servicePrincipalEmbeddedCert(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalEmbeddedCert) {
            this.servicePrincipalEmbeddedCert = servicePrincipalEmbeddedCert;
            return this;
        }
        public Builder servicePrincipalEmbeddedCertPassword(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalEmbeddedCertPassword) {
            this.servicePrincipalEmbeddedCertPassword = servicePrincipalEmbeddedCertPassword;
            return this;
        }
        public Builder servicePrincipalId(@Nullable Object servicePrincipalId) {
            this.servicePrincipalId = servicePrincipalId;
            return this;
        }
        public Builder servicePrincipalKey(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey) {
            this.servicePrincipalKey = servicePrincipalKey;
            return this;
        }
        public Builder tenant(@Nullable Object tenant) {
            this.tenant = tenant;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder url(Object url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public Builder userName(@Nullable Object userName) {
            this.userName = userName;
            return this;
        }        public ODataLinkedServiceResponse build() {
            return new ODataLinkedServiceResponse(aadResourceId, aadServicePrincipalCredentialType, annotations, authHeaders, authenticationType, azureCloudType, connectVia, description, encryptedCredential, parameters, password, servicePrincipalEmbeddedCert, servicePrincipalEmbeddedCertPassword, servicePrincipalId, servicePrincipalKey, tenant, type, url, userName);
        }
    }
}
