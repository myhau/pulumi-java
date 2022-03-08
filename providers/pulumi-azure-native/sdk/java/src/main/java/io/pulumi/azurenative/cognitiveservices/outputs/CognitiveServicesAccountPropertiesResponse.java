// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.outputs;

import io.pulumi.azurenative.cognitiveservices.outputs.CognitiveServicesAccountApiPropertiesResponse;
import io.pulumi.azurenative.cognitiveservices.outputs.CognitiveServicesAccountSkuChangeInfoResponse;
import io.pulumi.azurenative.cognitiveservices.outputs.EncryptionResponse;
import io.pulumi.azurenative.cognitiveservices.outputs.NetworkRuleSetResponse;
import io.pulumi.azurenative.cognitiveservices.outputs.PrivateEndpointConnectionResponse;
import io.pulumi.azurenative.cognitiveservices.outputs.SkuCapabilityResponse;
import io.pulumi.azurenative.cognitiveservices.outputs.UserOwnedStorageResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CognitiveServicesAccountPropertiesResponse {
    /**
     * The api properties for special APIs.
     * 
     */
    private final @Nullable CognitiveServicesAccountApiPropertiesResponse apiProperties;
    /**
     * Gets the capabilities of the cognitive services account. Each item indicates the capability of a specific feature. The values are read-only and for reference only.
     * 
     */
    private final List<SkuCapabilityResponse> capabilities;
    /**
     * Optional subdomain name used for token-based authentication.
     * 
     */
    private final @Nullable String customSubDomainName;
    /**
     * Gets the date of cognitive services account creation.
     * 
     */
    private final String dateCreated;
    /**
     * The encryption properties for this resource.
     * 
     */
    private final @Nullable EncryptionResponse encryption;
    /**
     * Endpoint of the created account.
     * 
     */
    private final String endpoint;
    /**
     * The internal identifier.
     * 
     */
    private final String internalId;
    /**
     * If the resource is migrated from an existing key.
     * 
     */
    private final Boolean isMigrated;
    /**
     * A collection of rules governing the accessibility from specific network locations.
     * 
     */
    private final @Nullable NetworkRuleSetResponse networkAcls;
    /**
     * The private endpoint connection associated with the Cognitive Services account.
     * 
     */
    private final @Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections;
    /**
     * Gets the status of the cognitive services account at the time the operation was called.
     * 
     */
    private final String provisioningState;
    /**
     * Whether or not public endpoint access is allowed for this account. Value is optional but if passed in, must be 'Enabled' or 'Disabled'
     * 
     */
    private final @Nullable String publicNetworkAccess;
    /**
     * Sku change info of account.
     * 
     */
    private final CognitiveServicesAccountSkuChangeInfoResponse skuChangeInfo;
    /**
     * The storage accounts for this resource.
     * 
     */
    private final @Nullable List<UserOwnedStorageResponse> userOwnedStorage;

    @OutputCustomType.Constructor({"apiProperties","capabilities","customSubDomainName","dateCreated","encryption","endpoint","internalId","isMigrated","networkAcls","privateEndpointConnections","provisioningState","publicNetworkAccess","skuChangeInfo","userOwnedStorage"})
    private CognitiveServicesAccountPropertiesResponse(
        @Nullable CognitiveServicesAccountApiPropertiesResponse apiProperties,
        List<SkuCapabilityResponse> capabilities,
        @Nullable String customSubDomainName,
        String dateCreated,
        @Nullable EncryptionResponse encryption,
        String endpoint,
        String internalId,
        Boolean isMigrated,
        @Nullable NetworkRuleSetResponse networkAcls,
        @Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections,
        String provisioningState,
        @Nullable String publicNetworkAccess,
        CognitiveServicesAccountSkuChangeInfoResponse skuChangeInfo,
        @Nullable List<UserOwnedStorageResponse> userOwnedStorage) {
        this.apiProperties = apiProperties;
        this.capabilities = capabilities;
        this.customSubDomainName = customSubDomainName;
        this.dateCreated = dateCreated;
        this.encryption = encryption;
        this.endpoint = endpoint;
        this.internalId = internalId;
        this.isMigrated = isMigrated;
        this.networkAcls = networkAcls;
        this.privateEndpointConnections = privateEndpointConnections;
        this.provisioningState = provisioningState;
        this.publicNetworkAccess = publicNetworkAccess;
        this.skuChangeInfo = skuChangeInfo;
        this.userOwnedStorage = userOwnedStorage;
    }

    /**
     * The api properties for special APIs.
     * 
    */
    public Optional<CognitiveServicesAccountApiPropertiesResponse> getApiProperties() {
        return Optional.ofNullable(this.apiProperties);
    }
    /**
     * Gets the capabilities of the cognitive services account. Each item indicates the capability of a specific feature. The values are read-only and for reference only.
     * 
    */
    public List<SkuCapabilityResponse> getCapabilities() {
        return this.capabilities;
    }
    /**
     * Optional subdomain name used for token-based authentication.
     * 
    */
    public Optional<String> getCustomSubDomainName() {
        return Optional.ofNullable(this.customSubDomainName);
    }
    /**
     * Gets the date of cognitive services account creation.
     * 
    */
    public String getDateCreated() {
        return this.dateCreated;
    }
    /**
     * The encryption properties for this resource.
     * 
    */
    public Optional<EncryptionResponse> getEncryption() {
        return Optional.ofNullable(this.encryption);
    }
    /**
     * Endpoint of the created account.
     * 
    */
    public String getEndpoint() {
        return this.endpoint;
    }
    /**
     * The internal identifier.
     * 
    */
    public String getInternalId() {
        return this.internalId;
    }
    /**
     * If the resource is migrated from an existing key.
     * 
    */
    public Boolean getIsMigrated() {
        return this.isMigrated;
    }
    /**
     * A collection of rules governing the accessibility from specific network locations.
     * 
    */
    public Optional<NetworkRuleSetResponse> getNetworkAcls() {
        return Optional.ofNullable(this.networkAcls);
    }
    /**
     * The private endpoint connection associated with the Cognitive Services account.
     * 
    */
    public List<PrivateEndpointConnectionResponse> getPrivateEndpointConnections() {
        return this.privateEndpointConnections == null ? List.of() : this.privateEndpointConnections;
    }
    /**
     * Gets the status of the cognitive services account at the time the operation was called.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Whether or not public endpoint access is allowed for this account. Value is optional but if passed in, must be 'Enabled' or 'Disabled'
     * 
    */
    public Optional<String> getPublicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
    }
    /**
     * Sku change info of account.
     * 
    */
    public CognitiveServicesAccountSkuChangeInfoResponse getSkuChangeInfo() {
        return this.skuChangeInfo;
    }
    /**
     * The storage accounts for this resource.
     * 
    */
    public List<UserOwnedStorageResponse> getUserOwnedStorage() {
        return this.userOwnedStorage == null ? List.of() : this.userOwnedStorage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CognitiveServicesAccountPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CognitiveServicesAccountApiPropertiesResponse apiProperties;
        private List<SkuCapabilityResponse> capabilities;
        private @Nullable String customSubDomainName;
        private String dateCreated;
        private @Nullable EncryptionResponse encryption;
        private String endpoint;
        private String internalId;
        private Boolean isMigrated;
        private @Nullable NetworkRuleSetResponse networkAcls;
        private @Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections;
        private String provisioningState;
        private @Nullable String publicNetworkAccess;
        private CognitiveServicesAccountSkuChangeInfoResponse skuChangeInfo;
        private @Nullable List<UserOwnedStorageResponse> userOwnedStorage;

        public Builder() {
    	      // Empty
        }

        public Builder(CognitiveServicesAccountPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiProperties = defaults.apiProperties;
    	      this.capabilities = defaults.capabilities;
    	      this.customSubDomainName = defaults.customSubDomainName;
    	      this.dateCreated = defaults.dateCreated;
    	      this.encryption = defaults.encryption;
    	      this.endpoint = defaults.endpoint;
    	      this.internalId = defaults.internalId;
    	      this.isMigrated = defaults.isMigrated;
    	      this.networkAcls = defaults.networkAcls;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.skuChangeInfo = defaults.skuChangeInfo;
    	      this.userOwnedStorage = defaults.userOwnedStorage;
        }

        public Builder setApiProperties(@Nullable CognitiveServicesAccountApiPropertiesResponse apiProperties) {
            this.apiProperties = apiProperties;
            return this;
        }

        public Builder setCapabilities(List<SkuCapabilityResponse> capabilities) {
            this.capabilities = Objects.requireNonNull(capabilities);
            return this;
        }

        public Builder setCustomSubDomainName(@Nullable String customSubDomainName) {
            this.customSubDomainName = customSubDomainName;
            return this;
        }

        public Builder setDateCreated(String dateCreated) {
            this.dateCreated = Objects.requireNonNull(dateCreated);
            return this;
        }

        public Builder setEncryption(@Nullable EncryptionResponse encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder setEndpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }

        public Builder setInternalId(String internalId) {
            this.internalId = Objects.requireNonNull(internalId);
            return this;
        }

        public Builder setIsMigrated(Boolean isMigrated) {
            this.isMigrated = Objects.requireNonNull(isMigrated);
            return this;
        }

        public Builder setNetworkAcls(@Nullable NetworkRuleSetResponse networkAcls) {
            this.networkAcls = networkAcls;
            return this;
        }

        public Builder setPrivateEndpointConnections(@Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections) {
            this.privateEndpointConnections = privateEndpointConnections;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable String publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder setSkuChangeInfo(CognitiveServicesAccountSkuChangeInfoResponse skuChangeInfo) {
            this.skuChangeInfo = Objects.requireNonNull(skuChangeInfo);
            return this;
        }

        public Builder setUserOwnedStorage(@Nullable List<UserOwnedStorageResponse> userOwnedStorage) {
            this.userOwnedStorage = userOwnedStorage;
            return this;
        }
        public CognitiveServicesAccountPropertiesResponse build() {
            return new CognitiveServicesAccountPropertiesResponse(apiProperties, capabilities, customSubDomainName, dateCreated, encryption, endpoint, internalId, isMigrated, networkAcls, privateEndpointConnections, provisioningState, publicNetworkAccess, skuChangeInfo, userOwnedStorage);
        }
    }
}
