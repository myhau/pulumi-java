// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import io.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class XeroLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final XeroLinkedServiceArgs Empty = new XeroLinkedServiceArgs();

    @InputImport(name="annotations")
    private final @Nullable Input<List<Object>> annotations;

    public Input<List<Object>> getAnnotations() {
        return this.annotations == null ? Input.empty() : this.annotations;
    }

    @InputImport(name="connectVia")
    private final @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia;

    public Input<IntegrationRuntimeReferenceArgs> getConnectVia() {
        return this.connectVia == null ? Input.empty() : this.connectVia;
    }

    @InputImport(name="connectionProperties")
    private final @Nullable Input<Object> connectionProperties;

    public Input<Object> getConnectionProperties() {
        return this.connectionProperties == null ? Input.empty() : this.connectionProperties;
    }

    @InputImport(name="consumerKey")
    private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> consumerKey;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getConsumerKey() {
        return this.consumerKey == null ? Input.empty() : this.consumerKey;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="encryptedCredential")
    private final @Nullable Input<Object> encryptedCredential;

    public Input<Object> getEncryptedCredential() {
        return this.encryptedCredential == null ? Input.empty() : this.encryptedCredential;
    }

    @InputImport(name="host")
    private final @Nullable Input<Object> host;

    public Input<Object> getHost() {
        return this.host == null ? Input.empty() : this.host;
    }

    @InputImport(name="parameters")
    private final @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;

    public Input<Map<String,ParameterSpecificationArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    @InputImport(name="privateKey")
    private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> privateKey;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getPrivateKey() {
        return this.privateKey == null ? Input.empty() : this.privateKey;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    @InputImport(name="useEncryptedEndpoints")
    private final @Nullable Input<Object> useEncryptedEndpoints;

    public Input<Object> getUseEncryptedEndpoints() {
        return this.useEncryptedEndpoints == null ? Input.empty() : this.useEncryptedEndpoints;
    }

    @InputImport(name="useHostVerification")
    private final @Nullable Input<Object> useHostVerification;

    public Input<Object> getUseHostVerification() {
        return this.useHostVerification == null ? Input.empty() : this.useHostVerification;
    }

    @InputImport(name="usePeerVerification")
    private final @Nullable Input<Object> usePeerVerification;

    public Input<Object> getUsePeerVerification() {
        return this.usePeerVerification == null ? Input.empty() : this.usePeerVerification;
    }

    public XeroLinkedServiceArgs(
        @Nullable Input<List<Object>> annotations,
        @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Input<Object> connectionProperties,
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> consumerKey,
        @Nullable Input<String> description,
        @Nullable Input<Object> encryptedCredential,
        @Nullable Input<Object> host,
        @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> privateKey,
        Input<String> type,
        @Nullable Input<Object> useEncryptedEndpoints,
        @Nullable Input<Object> useHostVerification,
        @Nullable Input<Object> usePeerVerification) {
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.connectionProperties = connectionProperties;
        this.consumerKey = consumerKey;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.host = host;
        this.parameters = parameters;
        this.privateKey = privateKey;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        this.useHostVerification = useHostVerification;
        this.usePeerVerification = usePeerVerification;
    }

    private XeroLinkedServiceArgs() {
        this.annotations = Input.empty();
        this.connectVia = Input.empty();
        this.connectionProperties = Input.empty();
        this.consumerKey = Input.empty();
        this.description = Input.empty();
        this.encryptedCredential = Input.empty();
        this.host = Input.empty();
        this.parameters = Input.empty();
        this.privateKey = Input.empty();
        this.type = Input.empty();
        this.useEncryptedEndpoints = Input.empty();
        this.useHostVerification = Input.empty();
        this.usePeerVerification = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(XeroLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Object>> annotations;
        private @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Input<Object> connectionProperties;
        private @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> consumerKey;
        private @Nullable Input<String> description;
        private @Nullable Input<Object> encryptedCredential;
        private @Nullable Input<Object> host;
        private @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> privateKey;
        private Input<String> type;
        private @Nullable Input<Object> useEncryptedEndpoints;
        private @Nullable Input<Object> useHostVerification;
        private @Nullable Input<Object> usePeerVerification;

        public Builder() {
    	      // Empty
        }

        public Builder(XeroLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.connectionProperties = defaults.connectionProperties;
    	      this.consumerKey = defaults.consumerKey;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.host = defaults.host;
    	      this.parameters = defaults.parameters;
    	      this.privateKey = defaults.privateKey;
    	      this.type = defaults.type;
    	      this.useEncryptedEndpoints = defaults.useEncryptedEndpoints;
    	      this.useHostVerification = defaults.useHostVerification;
    	      this.usePeerVerification = defaults.usePeerVerification;
        }

        public Builder setAnnotations(@Nullable Input<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = Input.ofNullable(annotations);
            return this;
        }

        public Builder setConnectVia(@Nullable Input<IntegrationRuntimeReferenceArgs> connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder setConnectVia(@Nullable IntegrationRuntimeReferenceArgs connectVia) {
            this.connectVia = Input.ofNullable(connectVia);
            return this;
        }

        public Builder setConnectionProperties(@Nullable Input<Object> connectionProperties) {
            this.connectionProperties = connectionProperties;
            return this;
        }

        public Builder setConnectionProperties(@Nullable Object connectionProperties) {
            this.connectionProperties = Input.ofNullable(connectionProperties);
            return this;
        }

        public Builder setConsumerKey(@Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> consumerKey) {
            this.consumerKey = consumerKey;
            return this;
        }

        public Builder setConsumerKey(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> consumerKey) {
            this.consumerKey = Input.ofNullable(consumerKey);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEncryptedCredential(@Nullable Input<Object> encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder setEncryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = Input.ofNullable(encryptedCredential);
            return this;
        }

        public Builder setHost(@Nullable Input<Object> host) {
            this.host = host;
            return this;
        }

        public Builder setHost(@Nullable Object host) {
            this.host = Input.ofNullable(host);
            return this;
        }

        public Builder setParameters(@Nullable Input<Map<String,ParameterSpecificationArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder setPrivateKey(@Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> privateKey) {
            this.privateKey = privateKey;
            return this;
        }

        public Builder setPrivateKey(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> privateKey) {
            this.privateKey = Input.ofNullable(privateKey);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setUseEncryptedEndpoints(@Nullable Input<Object> useEncryptedEndpoints) {
            this.useEncryptedEndpoints = useEncryptedEndpoints;
            return this;
        }

        public Builder setUseEncryptedEndpoints(@Nullable Object useEncryptedEndpoints) {
            this.useEncryptedEndpoints = Input.ofNullable(useEncryptedEndpoints);
            return this;
        }

        public Builder setUseHostVerification(@Nullable Input<Object> useHostVerification) {
            this.useHostVerification = useHostVerification;
            return this;
        }

        public Builder setUseHostVerification(@Nullable Object useHostVerification) {
            this.useHostVerification = Input.ofNullable(useHostVerification);
            return this;
        }

        public Builder setUsePeerVerification(@Nullable Input<Object> usePeerVerification) {
            this.usePeerVerification = usePeerVerification;
            return this;
        }

        public Builder setUsePeerVerification(@Nullable Object usePeerVerification) {
            this.usePeerVerification = Input.ofNullable(usePeerVerification);
            return this;
        }

        public XeroLinkedServiceArgs build() {
            return new XeroLinkedServiceArgs(annotations, connectVia, connectionProperties, consumerKey, description, encryptedCredential, host, parameters, privateKey, type, useEncryptedEndpoints, useHostVerification, usePeerVerification);
        }
    }
}