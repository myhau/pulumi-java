// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.inputs;

import io.pulumi.azurenative.cognitiveservices.enums.PublicNetworkAccess;
import io.pulumi.azurenative.cognitiveservices.inputs.CognitiveServicesAccountApiPropertiesArgs;
import io.pulumi.azurenative.cognitiveservices.inputs.EncryptionArgs;
import io.pulumi.azurenative.cognitiveservices.inputs.NetworkRuleSetArgs;
import io.pulumi.azurenative.cognitiveservices.inputs.PrivateEndpointConnectionArgs;
import io.pulumi.azurenative.cognitiveservices.inputs.UserOwnedStorageArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of Cognitive Services account.
 * 
 */
public final class CognitiveServicesAccountPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final CognitiveServicesAccountPropertiesArgs Empty = new CognitiveServicesAccountPropertiesArgs();

    /**
     * The api properties for special APIs.
     * 
     */
    @Import(name="apiProperties")
      private final @Nullable Output<CognitiveServicesAccountApiPropertiesArgs> apiProperties;

    public Output<CognitiveServicesAccountApiPropertiesArgs> apiProperties() {
        return this.apiProperties == null ? Codegen.empty() : this.apiProperties;
    }

    /**
     * Optional subdomain name used for token-based authentication.
     * 
     */
    @Import(name="customSubDomainName")
      private final @Nullable Output<String> customSubDomainName;

    public Output<String> customSubDomainName() {
        return this.customSubDomainName == null ? Codegen.empty() : this.customSubDomainName;
    }

    /**
     * The encryption properties for this resource.
     * 
     */
    @Import(name="encryption")
      private final @Nullable Output<EncryptionArgs> encryption;

    public Output<EncryptionArgs> encryption() {
        return this.encryption == null ? Codegen.empty() : this.encryption;
    }

    /**
     * A collection of rules governing the accessibility from specific network locations.
     * 
     */
    @Import(name="networkAcls")
      private final @Nullable Output<NetworkRuleSetArgs> networkAcls;

    public Output<NetworkRuleSetArgs> networkAcls() {
        return this.networkAcls == null ? Codegen.empty() : this.networkAcls;
    }

    /**
     * The private endpoint connection associated with the Cognitive Services account.
     * 
     */
    @Import(name="privateEndpointConnections")
      private final @Nullable Output<List<PrivateEndpointConnectionArgs>> privateEndpointConnections;

    public Output<List<PrivateEndpointConnectionArgs>> privateEndpointConnections() {
        return this.privateEndpointConnections == null ? Codegen.empty() : this.privateEndpointConnections;
    }

    /**
     * Whether or not public endpoint access is allowed for this account. Value is optional but if passed in, must be 'Enabled' or 'Disabled'
     * 
     */
    @Import(name="publicNetworkAccess")
      private final @Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess;

    public Output<Either<String,PublicNetworkAccess>> publicNetworkAccess() {
        return this.publicNetworkAccess == null ? Codegen.empty() : this.publicNetworkAccess;
    }

    /**
     * The storage accounts for this resource.
     * 
     */
    @Import(name="userOwnedStorage")
      private final @Nullable Output<List<UserOwnedStorageArgs>> userOwnedStorage;

    public Output<List<UserOwnedStorageArgs>> userOwnedStorage() {
        return this.userOwnedStorage == null ? Codegen.empty() : this.userOwnedStorage;
    }

    public CognitiveServicesAccountPropertiesArgs(
        @Nullable Output<CognitiveServicesAccountApiPropertiesArgs> apiProperties,
        @Nullable Output<String> customSubDomainName,
        @Nullable Output<EncryptionArgs> encryption,
        @Nullable Output<NetworkRuleSetArgs> networkAcls,
        @Nullable Output<List<PrivateEndpointConnectionArgs>> privateEndpointConnections,
        @Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess,
        @Nullable Output<List<UserOwnedStorageArgs>> userOwnedStorage) {
        this.apiProperties = apiProperties;
        this.customSubDomainName = customSubDomainName;
        this.encryption = encryption;
        this.networkAcls = networkAcls;
        this.privateEndpointConnections = privateEndpointConnections;
        this.publicNetworkAccess = publicNetworkAccess;
        this.userOwnedStorage = userOwnedStorage;
    }

    private CognitiveServicesAccountPropertiesArgs() {
        this.apiProperties = Codegen.empty();
        this.customSubDomainName = Codegen.empty();
        this.encryption = Codegen.empty();
        this.networkAcls = Codegen.empty();
        this.privateEndpointConnections = Codegen.empty();
        this.publicNetworkAccess = Codegen.empty();
        this.userOwnedStorage = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CognitiveServicesAccountPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CognitiveServicesAccountApiPropertiesArgs> apiProperties;
        private @Nullable Output<String> customSubDomainName;
        private @Nullable Output<EncryptionArgs> encryption;
        private @Nullable Output<NetworkRuleSetArgs> networkAcls;
        private @Nullable Output<List<PrivateEndpointConnectionArgs>> privateEndpointConnections;
        private @Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess;
        private @Nullable Output<List<UserOwnedStorageArgs>> userOwnedStorage;

        public Builder() {
    	      // Empty
        }

        public Builder(CognitiveServicesAccountPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiProperties = defaults.apiProperties;
    	      this.customSubDomainName = defaults.customSubDomainName;
    	      this.encryption = defaults.encryption;
    	      this.networkAcls = defaults.networkAcls;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.userOwnedStorage = defaults.userOwnedStorage;
        }

        public Builder apiProperties(@Nullable Output<CognitiveServicesAccountApiPropertiesArgs> apiProperties) {
            this.apiProperties = apiProperties;
            return this;
        }
        public Builder apiProperties(@Nullable CognitiveServicesAccountApiPropertiesArgs apiProperties) {
            this.apiProperties = Codegen.ofNullable(apiProperties);
            return this;
        }
        public Builder customSubDomainName(@Nullable Output<String> customSubDomainName) {
            this.customSubDomainName = customSubDomainName;
            return this;
        }
        public Builder customSubDomainName(@Nullable String customSubDomainName) {
            this.customSubDomainName = Codegen.ofNullable(customSubDomainName);
            return this;
        }
        public Builder encryption(@Nullable Output<EncryptionArgs> encryption) {
            this.encryption = encryption;
            return this;
        }
        public Builder encryption(@Nullable EncryptionArgs encryption) {
            this.encryption = Codegen.ofNullable(encryption);
            return this;
        }
        public Builder networkAcls(@Nullable Output<NetworkRuleSetArgs> networkAcls) {
            this.networkAcls = networkAcls;
            return this;
        }
        public Builder networkAcls(@Nullable NetworkRuleSetArgs networkAcls) {
            this.networkAcls = Codegen.ofNullable(networkAcls);
            return this;
        }
        public Builder privateEndpointConnections(@Nullable Output<List<PrivateEndpointConnectionArgs>> privateEndpointConnections) {
            this.privateEndpointConnections = privateEndpointConnections;
            return this;
        }
        public Builder privateEndpointConnections(@Nullable List<PrivateEndpointConnectionArgs> privateEndpointConnections) {
            this.privateEndpointConnections = Codegen.ofNullable(privateEndpointConnections);
            return this;
        }
        public Builder privateEndpointConnections(PrivateEndpointConnectionArgs... privateEndpointConnections) {
            return privateEndpointConnections(List.of(privateEndpointConnections));
        }
        public Builder publicNetworkAccess(@Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }
        public Builder publicNetworkAccess(@Nullable Either<String,PublicNetworkAccess> publicNetworkAccess) {
            this.publicNetworkAccess = Codegen.ofNullable(publicNetworkAccess);
            return this;
        }
        public Builder userOwnedStorage(@Nullable Output<List<UserOwnedStorageArgs>> userOwnedStorage) {
            this.userOwnedStorage = userOwnedStorage;
            return this;
        }
        public Builder userOwnedStorage(@Nullable List<UserOwnedStorageArgs> userOwnedStorage) {
            this.userOwnedStorage = Codegen.ofNullable(userOwnedStorage);
            return this;
        }
        public Builder userOwnedStorage(UserOwnedStorageArgs... userOwnedStorage) {
            return userOwnedStorage(List.of(userOwnedStorage));
        }        public CognitiveServicesAccountPropertiesArgs build() {
            return new CognitiveServicesAccountPropertiesArgs(apiProperties, customSubDomainName, encryption, networkAcls, privateEndpointConnections, publicNetworkAccess, userOwnedStorage);
        }
    }
}
