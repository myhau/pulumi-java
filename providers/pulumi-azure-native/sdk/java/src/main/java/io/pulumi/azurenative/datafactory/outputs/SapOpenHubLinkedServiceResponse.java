// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
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
public final class SapOpenHubLinkedServiceResponse {
    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * Client ID of the client on the BW system where the open hub destination is located. (Usually a three-digit decimal number represented as a string) Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object clientId;
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
     * Language of the BW system where the open hub destination is located. The default value is EN. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object language;
    /**
     * The Logon Group for the SAP System. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object logonGroup;
    /**
     * The hostname of the SAP Message Server. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object messageServer;
    /**
     * The service name or port number of the Message Server. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object messageServerService;
    /**
     * Parameters for linked service.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * Password to access the SAP BW server where the open hub destination is located.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
    /**
     * Host name of the SAP BW instance where the open hub destination is located. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object server;
    /**
     * SystemID of the SAP system where the table is located. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object systemId;
    /**
     * System number of the BW system where the open hub destination is located. (Usually a two-digit decimal number represented as a string.) Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object systemNumber;
    /**
     * Type of linked service.
     * Expected value is 'SapOpenHub'.
     * 
     */
    private final String type;
    /**
     * Username to access the SAP BW server where the open hub destination is located. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object userName;

    @OutputCustomType.Constructor({"annotations","clientId","connectVia","description","encryptedCredential","language","logonGroup","messageServer","messageServerService","parameters","password","server","systemId","systemNumber","type","userName"})
    private SapOpenHubLinkedServiceResponse(
        @Nullable List<Object> annotations,
        @Nullable Object clientId,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable String description,
        @Nullable Object encryptedCredential,
        @Nullable Object language,
        @Nullable Object logonGroup,
        @Nullable Object messageServer,
        @Nullable Object messageServerService,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        @Nullable Object server,
        @Nullable Object systemId,
        @Nullable Object systemNumber,
        String type,
        @Nullable Object userName) {
        this.annotations = annotations;
        this.clientId = clientId;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.language = language;
        this.logonGroup = logonGroup;
        this.messageServer = messageServer;
        this.messageServerService = messageServerService;
        this.parameters = parameters;
        this.password = password;
        this.server = server;
        this.systemId = systemId;
        this.systemNumber = systemNumber;
        this.type = type;
        this.userName = userName;
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
    */
    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * Client ID of the client on the BW system where the open hub destination is located. (Usually a three-digit decimal number represented as a string) Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getClientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * The integration runtime reference.
     * 
    */
    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return Optional.ofNullable(this.connectVia);
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
     * Language of the BW system where the open hub destination is located. The default value is EN. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getLanguage() {
        return Optional.ofNullable(this.language);
    }
    /**
     * The Logon Group for the SAP System. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getLogonGroup() {
        return Optional.ofNullable(this.logonGroup);
    }
    /**
     * The hostname of the SAP Message Server. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getMessageServer() {
        return Optional.ofNullable(this.messageServer);
    }
    /**
     * The service name or port number of the Message Server. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getMessageServerService() {
        return Optional.ofNullable(this.messageServerService);
    }
    /**
     * Parameters for linked service.
     * 
    */
    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * Password to access the SAP BW server where the open hub destination is located.
     * 
    */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getPassword() {
        return Optional.ofNullable(this.password);
    }
    /**
     * Host name of the SAP BW instance where the open hub destination is located. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getServer() {
        return Optional.ofNullable(this.server);
    }
    /**
     * SystemID of the SAP system where the table is located. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getSystemId() {
        return Optional.ofNullable(this.systemId);
    }
    /**
     * System number of the BW system where the open hub destination is located. (Usually a two-digit decimal number represented as a string.) Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getSystemNumber() {
        return Optional.ofNullable(this.systemNumber);
    }
    /**
     * Type of linked service.
     * Expected value is 'SapOpenHub'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Username to access the SAP BW server where the open hub destination is located. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getUserName() {
        return Optional.ofNullable(this.userName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SapOpenHubLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable Object clientId;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private @Nullable Object language;
        private @Nullable Object logonGroup;
        private @Nullable Object messageServer;
        private @Nullable Object messageServerService;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
        private @Nullable Object server;
        private @Nullable Object systemId;
        private @Nullable Object systemNumber;
        private String type;
        private @Nullable Object userName;

        public Builder() {
    	      // Empty
        }

        public Builder(SapOpenHubLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.clientId = defaults.clientId;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.language = defaults.language;
    	      this.logonGroup = defaults.logonGroup;
    	      this.messageServer = defaults.messageServer;
    	      this.messageServerService = defaults.messageServerService;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.server = defaults.server;
    	      this.systemId = defaults.systemId;
    	      this.systemNumber = defaults.systemNumber;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setClientId(@Nullable Object clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setConnectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
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

        public Builder setLanguage(@Nullable Object language) {
            this.language = language;
            return this;
        }

        public Builder setLogonGroup(@Nullable Object logonGroup) {
            this.logonGroup = logonGroup;
            return this;
        }

        public Builder setMessageServer(@Nullable Object messageServer) {
            this.messageServer = messageServer;
            return this;
        }

        public Builder setMessageServerService(@Nullable Object messageServerService) {
            this.messageServerService = messageServerService;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setPassword(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password) {
            this.password = password;
            return this;
        }

        public Builder setServer(@Nullable Object server) {
            this.server = server;
            return this;
        }

        public Builder setSystemId(@Nullable Object systemId) {
            this.systemId = systemId;
            return this;
        }

        public Builder setSystemNumber(@Nullable Object systemNumber) {
            this.systemNumber = systemNumber;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserName(@Nullable Object userName) {
            this.userName = userName;
            return this;
        }
        public SapOpenHubLinkedServiceResponse build() {
            return new SapOpenHubLinkedServiceResponse(annotations, clientId, connectVia, description, encryptedCredential, language, logonGroup, messageServer, messageServerService, parameters, password, server, systemId, systemNumber, type, userName);
        }
    }
}
