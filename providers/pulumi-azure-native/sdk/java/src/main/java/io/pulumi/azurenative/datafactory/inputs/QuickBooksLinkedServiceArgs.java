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
 * QuickBooks server linked service.
 * 
 */
public final class QuickBooksLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final QuickBooksLinkedServiceArgs Empty = new QuickBooksLinkedServiceArgs();

    /**
     * The access token for OAuth 1.0 authentication.
     * 
     */
    @Import(name="accessToken")
      private final @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accessToken;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accessToken() {
        return this.accessToken == null ? Codegen.empty() : this.accessToken;
    }

    /**
     * The access token secret for OAuth 1.0 authentication.
     * 
     */
    @Import(name="accessTokenSecret")
      private final @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accessTokenSecret;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accessTokenSecret() {
        return this.accessTokenSecret == null ? Codegen.empty() : this.accessTokenSecret;
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
     * The company ID of the QuickBooks company to authorize.
     * 
     */
    @Import(name="companyId")
      private final @Nullable Output<Object> companyId;

    public Output<Object> companyId() {
        return this.companyId == null ? Codegen.empty() : this.companyId;
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
     * Properties used to connect to QuickBooks. It is mutually exclusive with any other properties in the linked service. Type: object.
     * 
     */
    @Import(name="connectionProperties")
      private final @Nullable Output<Object> connectionProperties;

    public Output<Object> connectionProperties() {
        return this.connectionProperties == null ? Codegen.empty() : this.connectionProperties;
    }

    /**
     * The consumer key for OAuth 1.0 authentication.
     * 
     */
    @Import(name="consumerKey")
      private final @Nullable Output<Object> consumerKey;

    public Output<Object> consumerKey() {
        return this.consumerKey == null ? Codegen.empty() : this.consumerKey;
    }

    /**
     * The consumer secret for OAuth 1.0 authentication.
     * 
     */
    @Import(name="consumerSecret")
      private final @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> consumerSecret;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> consumerSecret() {
        return this.consumerSecret == null ? Codegen.empty() : this.consumerSecret;
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
     * The endpoint of the QuickBooks server. (i.e. quickbooks.api.intuit.com)
     * 
     */
    @Import(name="endpoint")
      private final @Nullable Output<Object> endpoint;

    public Output<Object> endpoint() {
        return this.endpoint == null ? Codegen.empty() : this.endpoint;
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
     * Type of linked service.
     * Expected value is 'QuickBooks'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * Specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     * 
     */
    @Import(name="useEncryptedEndpoints")
      private final @Nullable Output<Object> useEncryptedEndpoints;

    public Output<Object> useEncryptedEndpoints() {
        return this.useEncryptedEndpoints == null ? Codegen.empty() : this.useEncryptedEndpoints;
    }

    public QuickBooksLinkedServiceArgs(
        @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accessToken,
        @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accessTokenSecret,
        @Nullable Output<List<Object>> annotations,
        @Nullable Output<Object> companyId,
        @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Output<Object> connectionProperties,
        @Nullable Output<Object> consumerKey,
        @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> consumerSecret,
        @Nullable Output<String> description,
        @Nullable Output<Object> encryptedCredential,
        @Nullable Output<Object> endpoint,
        @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters,
        Output<String> type,
        @Nullable Output<Object> useEncryptedEndpoints) {
        this.accessToken = accessToken;
        this.accessTokenSecret = accessTokenSecret;
        this.annotations = annotations;
        this.companyId = companyId;
        this.connectVia = connectVia;
        this.connectionProperties = connectionProperties;
        this.consumerKey = consumerKey;
        this.consumerSecret = consumerSecret;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.endpoint = endpoint;
        this.parameters = parameters;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.useEncryptedEndpoints = useEncryptedEndpoints;
    }

    private QuickBooksLinkedServiceArgs() {
        this.accessToken = Codegen.empty();
        this.accessTokenSecret = Codegen.empty();
        this.annotations = Codegen.empty();
        this.companyId = Codegen.empty();
        this.connectVia = Codegen.empty();
        this.connectionProperties = Codegen.empty();
        this.consumerKey = Codegen.empty();
        this.consumerSecret = Codegen.empty();
        this.description = Codegen.empty();
        this.encryptedCredential = Codegen.empty();
        this.endpoint = Codegen.empty();
        this.parameters = Codegen.empty();
        this.type = Codegen.empty();
        this.useEncryptedEndpoints = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuickBooksLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accessToken;
        private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accessTokenSecret;
        private @Nullable Output<List<Object>> annotations;
        private @Nullable Output<Object> companyId;
        private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Output<Object> connectionProperties;
        private @Nullable Output<Object> consumerKey;
        private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> consumerSecret;
        private @Nullable Output<String> description;
        private @Nullable Output<Object> encryptedCredential;
        private @Nullable Output<Object> endpoint;
        private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;
        private Output<String> type;
        private @Nullable Output<Object> useEncryptedEndpoints;

        public Builder() {
    	      // Empty
        }

        public Builder(QuickBooksLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.accessTokenSecret = defaults.accessTokenSecret;
    	      this.annotations = defaults.annotations;
    	      this.companyId = defaults.companyId;
    	      this.connectVia = defaults.connectVia;
    	      this.connectionProperties = defaults.connectionProperties;
    	      this.consumerKey = defaults.consumerKey;
    	      this.consumerSecret = defaults.consumerSecret;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.endpoint = defaults.endpoint;
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
    	      this.useEncryptedEndpoints = defaults.useEncryptedEndpoints;
        }

        public Builder accessToken(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public Builder accessToken(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> accessToken) {
            this.accessToken = Codegen.ofNullable(accessToken);
            return this;
        }
        public Builder accessTokenSecret(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accessTokenSecret) {
            this.accessTokenSecret = accessTokenSecret;
            return this;
        }
        public Builder accessTokenSecret(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> accessTokenSecret) {
            this.accessTokenSecret = Codegen.ofNullable(accessTokenSecret);
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
        public Builder companyId(@Nullable Output<Object> companyId) {
            this.companyId = companyId;
            return this;
        }
        public Builder companyId(@Nullable Object companyId) {
            this.companyId = Codegen.ofNullable(companyId);
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
        public Builder connectionProperties(@Nullable Output<Object> connectionProperties) {
            this.connectionProperties = connectionProperties;
            return this;
        }
        public Builder connectionProperties(@Nullable Object connectionProperties) {
            this.connectionProperties = Codegen.ofNullable(connectionProperties);
            return this;
        }
        public Builder consumerKey(@Nullable Output<Object> consumerKey) {
            this.consumerKey = consumerKey;
            return this;
        }
        public Builder consumerKey(@Nullable Object consumerKey) {
            this.consumerKey = Codegen.ofNullable(consumerKey);
            return this;
        }
        public Builder consumerSecret(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> consumerSecret) {
            this.consumerSecret = consumerSecret;
            return this;
        }
        public Builder consumerSecret(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> consumerSecret) {
            this.consumerSecret = Codegen.ofNullable(consumerSecret);
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
        public Builder endpoint(@Nullable Output<Object> endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public Builder endpoint(@Nullable Object endpoint) {
            this.endpoint = Codegen.ofNullable(endpoint);
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
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder useEncryptedEndpoints(@Nullable Output<Object> useEncryptedEndpoints) {
            this.useEncryptedEndpoints = useEncryptedEndpoints;
            return this;
        }
        public Builder useEncryptedEndpoints(@Nullable Object useEncryptedEndpoints) {
            this.useEncryptedEndpoints = Codegen.ofNullable(useEncryptedEndpoints);
            return this;
        }        public QuickBooksLinkedServiceArgs build() {
            return new QuickBooksLinkedServiceArgs(accessToken, accessTokenSecret, annotations, companyId, connectVia, connectionProperties, consumerKey, consumerSecret, description, encryptedCredential, endpoint, parameters, type, useEncryptedEndpoints);
        }
    }
}
