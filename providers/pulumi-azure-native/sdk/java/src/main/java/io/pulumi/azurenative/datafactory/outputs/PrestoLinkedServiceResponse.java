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
public final class PrestoLinkedServiceResponse {
    /**
     * Specifies whether to require a CA-issued SSL certificate name to match the host name of the server when connecting over SSL. The default value is false.
     * 
     */
    private final @Nullable Object allowHostNameCNMismatch;
    /**
     * Specifies whether to allow self-signed certificates from the server. The default value is false.
     * 
     */
    private final @Nullable Object allowSelfSignedServerCert;
    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * The authentication mechanism used to connect to the Presto server.
     * 
     */
    private final String authenticationType;
    /**
     * The catalog context for all request against the server.
     * 
     */
    private final Object catalog;
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
     * Specifies whether the connections to the server are encrypted using SSL. The default value is false.
     * 
     */
    private final @Nullable Object enableSsl;
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object encryptedCredential;
    /**
     * The IP address or host name of the Presto server. (i.e. 192.168.222.160)
     * 
     */
    private final Object host;
    /**
     * Parameters for linked service.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * The password corresponding to the user name.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
    /**
     * The TCP port that the Presto server uses to listen for client connections. The default value is 8080.
     * 
     */
    private final @Nullable Object port;
    /**
     * The version of the Presto server. (i.e. 0.148-t)
     * 
     */
    private final Object serverVersion;
    /**
     * The local time zone used by the connection. Valid values for this option are specified in the IANA Time Zone Database. The default value is the system time zone.
     * 
     */
    private final @Nullable Object timeZoneID;
    /**
     * The full path of the .pem file containing trusted CA certificates for verifying the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default value is the cacerts.pem file installed with the IR.
     * 
     */
    private final @Nullable Object trustedCertPath;
    /**
     * Type of linked service.
     * Expected value is 'Presto'.
     * 
     */
    private final String type;
    /**
     * Specifies whether to use a CA certificate from the system trust store or from a specified PEM file. The default value is false.
     * 
     */
    private final @Nullable Object useSystemTrustStore;
    /**
     * The user name used to connect to the Presto server.
     * 
     */
    private final @Nullable Object username;

    @OutputCustomType.Constructor({"allowHostNameCNMismatch","allowSelfSignedServerCert","annotations","authenticationType","catalog","connectVia","description","enableSsl","encryptedCredential","host","parameters","password","port","serverVersion","timeZoneID","trustedCertPath","type","useSystemTrustStore","username"})
    private PrestoLinkedServiceResponse(
        @Nullable Object allowHostNameCNMismatch,
        @Nullable Object allowSelfSignedServerCert,
        @Nullable List<Object> annotations,
        String authenticationType,
        Object catalog,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable String description,
        @Nullable Object enableSsl,
        @Nullable Object encryptedCredential,
        Object host,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        @Nullable Object port,
        Object serverVersion,
        @Nullable Object timeZoneID,
        @Nullable Object trustedCertPath,
        String type,
        @Nullable Object useSystemTrustStore,
        @Nullable Object username) {
        this.allowHostNameCNMismatch = allowHostNameCNMismatch;
        this.allowSelfSignedServerCert = allowSelfSignedServerCert;
        this.annotations = annotations;
        this.authenticationType = authenticationType;
        this.catalog = catalog;
        this.connectVia = connectVia;
        this.description = description;
        this.enableSsl = enableSsl;
        this.encryptedCredential = encryptedCredential;
        this.host = host;
        this.parameters = parameters;
        this.password = password;
        this.port = port;
        this.serverVersion = serverVersion;
        this.timeZoneID = timeZoneID;
        this.trustedCertPath = trustedCertPath;
        this.type = type;
        this.useSystemTrustStore = useSystemTrustStore;
        this.username = username;
    }

    /**
     * Specifies whether to require a CA-issued SSL certificate name to match the host name of the server when connecting over SSL. The default value is false.
     * 
    */
    public Optional<Object> getAllowHostNameCNMismatch() {
        return Optional.ofNullable(this.allowHostNameCNMismatch);
    }
    /**
     * Specifies whether to allow self-signed certificates from the server. The default value is false.
     * 
    */
    public Optional<Object> getAllowSelfSignedServerCert() {
        return Optional.ofNullable(this.allowSelfSignedServerCert);
    }
    /**
     * List of tags that can be used for describing the linked service.
     * 
    */
    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * The authentication mechanism used to connect to the Presto server.
     * 
    */
    public String getAuthenticationType() {
        return this.authenticationType;
    }
    /**
     * The catalog context for all request against the server.
     * 
    */
    public Object getCatalog() {
        return this.catalog;
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
     * Specifies whether the connections to the server are encrypted using SSL. The default value is false.
     * 
    */
    public Optional<Object> getEnableSsl() {
        return Optional.ofNullable(this.enableSsl);
    }
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getEncryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }
    /**
     * The IP address or host name of the Presto server. (i.e. 192.168.222.160)
     * 
    */
    public Object getHost() {
        return this.host;
    }
    /**
     * Parameters for linked service.
     * 
    */
    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * The password corresponding to the user name.
     * 
    */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getPassword() {
        return Optional.ofNullable(this.password);
    }
    /**
     * The TCP port that the Presto server uses to listen for client connections. The default value is 8080.
     * 
    */
    public Optional<Object> getPort() {
        return Optional.ofNullable(this.port);
    }
    /**
     * The version of the Presto server. (i.e. 0.148-t)
     * 
    */
    public Object getServerVersion() {
        return this.serverVersion;
    }
    /**
     * The local time zone used by the connection. Valid values for this option are specified in the IANA Time Zone Database. The default value is the system time zone.
     * 
    */
    public Optional<Object> getTimeZoneID() {
        return Optional.ofNullable(this.timeZoneID);
    }
    /**
     * The full path of the .pem file containing trusted CA certificates for verifying the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default value is the cacerts.pem file installed with the IR.
     * 
    */
    public Optional<Object> getTrustedCertPath() {
        return Optional.ofNullable(this.trustedCertPath);
    }
    /**
     * Type of linked service.
     * Expected value is 'Presto'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Specifies whether to use a CA certificate from the system trust store or from a specified PEM file. The default value is false.
     * 
    */
    public Optional<Object> getUseSystemTrustStore() {
        return Optional.ofNullable(this.useSystemTrustStore);
    }
    /**
     * The user name used to connect to the Presto server.
     * 
    */
    public Optional<Object> getUsername() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrestoLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object allowHostNameCNMismatch;
        private @Nullable Object allowSelfSignedServerCert;
        private @Nullable List<Object> annotations;
        private String authenticationType;
        private Object catalog;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Object enableSsl;
        private @Nullable Object encryptedCredential;
        private Object host;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
        private @Nullable Object port;
        private Object serverVersion;
        private @Nullable Object timeZoneID;
        private @Nullable Object trustedCertPath;
        private String type;
        private @Nullable Object useSystemTrustStore;
        private @Nullable Object username;

        public Builder() {
    	      // Empty
        }

        public Builder(PrestoLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowHostNameCNMismatch = defaults.allowHostNameCNMismatch;
    	      this.allowSelfSignedServerCert = defaults.allowSelfSignedServerCert;
    	      this.annotations = defaults.annotations;
    	      this.authenticationType = defaults.authenticationType;
    	      this.catalog = defaults.catalog;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.enableSsl = defaults.enableSsl;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.host = defaults.host;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.serverVersion = defaults.serverVersion;
    	      this.timeZoneID = defaults.timeZoneID;
    	      this.trustedCertPath = defaults.trustedCertPath;
    	      this.type = defaults.type;
    	      this.useSystemTrustStore = defaults.useSystemTrustStore;
    	      this.username = defaults.username;
        }

        public Builder setAllowHostNameCNMismatch(@Nullable Object allowHostNameCNMismatch) {
            this.allowHostNameCNMismatch = allowHostNameCNMismatch;
            return this;
        }

        public Builder setAllowSelfSignedServerCert(@Nullable Object allowSelfSignedServerCert) {
            this.allowSelfSignedServerCert = allowSelfSignedServerCert;
            return this;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAuthenticationType(String authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }

        public Builder setCatalog(Object catalog) {
            this.catalog = Objects.requireNonNull(catalog);
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

        public Builder setEnableSsl(@Nullable Object enableSsl) {
            this.enableSsl = enableSsl;
            return this;
        }

        public Builder setEncryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder setHost(Object host) {
            this.host = Objects.requireNonNull(host);
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

        public Builder setPort(@Nullable Object port) {
            this.port = port;
            return this;
        }

        public Builder setServerVersion(Object serverVersion) {
            this.serverVersion = Objects.requireNonNull(serverVersion);
            return this;
        }

        public Builder setTimeZoneID(@Nullable Object timeZoneID) {
            this.timeZoneID = timeZoneID;
            return this;
        }

        public Builder setTrustedCertPath(@Nullable Object trustedCertPath) {
            this.trustedCertPath = trustedCertPath;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUseSystemTrustStore(@Nullable Object useSystemTrustStore) {
            this.useSystemTrustStore = useSystemTrustStore;
            return this;
        }

        public Builder setUsername(@Nullable Object username) {
            this.username = username;
            return this;
        }
        public PrestoLinkedServiceResponse build() {
            return new PrestoLinkedServiceResponse(allowHostNameCNMismatch, allowSelfSignedServerCert, annotations, authenticationType, catalog, connectVia, description, enableSsl, encryptedCredential, host, parameters, password, port, serverVersion, timeZoneID, trustedCertPath, type, useSystemTrustStore, username);
        }
    }
}
