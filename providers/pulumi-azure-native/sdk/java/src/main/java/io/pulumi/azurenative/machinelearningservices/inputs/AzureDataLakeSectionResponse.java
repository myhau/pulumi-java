// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AzureDataLakeSectionResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureDataLakeSectionResponse Empty = new AzureDataLakeSectionResponse();

    /**
     * The authority URL used for authentication.
     * 
     */
    @Import(name="authorityUrl")
      private final @Nullable String authorityUrl;

    public Optional<String> authorityUrl() {
        return this.authorityUrl == null ? Optional.empty() : Optional.ofNullable(this.authorityUrl);
    }

    /**
     * The content of the certificate used for authentication.
     * 
     */
    @Import(name="certificate")
      private final @Nullable String certificate;

    public Optional<String> certificate() {
        return this.certificate == null ? Optional.empty() : Optional.ofNullable(this.certificate);
    }

    /**
     * The Client ID/Application ID
     * 
     */
    @Import(name="clientId")
      private final @Nullable String clientId;

    public Optional<String> clientId() {
        return this.clientId == null ? Optional.empty() : Optional.ofNullable(this.clientId);
    }

    /**
     * The client secret.
     * 
     */
    @Import(name="clientSecret")
      private final @Nullable String clientSecret;

    public Optional<String> clientSecret() {
        return this.clientSecret == null ? Optional.empty() : Optional.ofNullable(this.clientSecret);
    }

    /**
     * The Azure Data Lake credential type.
     * 
     */
    @Import(name="credentialType")
      private final @Nullable String credentialType;

    public Optional<String> credentialType() {
        return this.credentialType == null ? Optional.empty() : Optional.ofNullable(this.credentialType);
    }

    /**
     *  Is it using certificate to authenticate. If false then use client secret.
     * 
     */
    @Import(name="isCertAuth")
      private final @Nullable Boolean isCertAuth;

    public Optional<Boolean> isCertAuth() {
        return this.isCertAuth == null ? Optional.empty() : Optional.ofNullable(this.isCertAuth);
    }

    /**
     * Resource Group.
     * 
     */
    @Import(name="resourceGroup")
      private final @Nullable String resourceGroup;

    public Optional<String> resourceGroup() {
        return this.resourceGroup == null ? Optional.empty() : Optional.ofNullable(this.resourceGroup);
    }

    /**
     * The resource the service principal/app has access to.
     * 
     */
    @Import(name="resourceUri")
      private final @Nullable String resourceUri;

    public Optional<String> resourceUri() {
        return this.resourceUri == null ? Optional.empty() : Optional.ofNullable(this.resourceUri);
    }

    /**
     * Indicates which identity to use to authenticate service data access to customer's storage.
     * 
     */
    @Import(name="serviceDataAccessAuthIdentity")
      private final @Nullable String serviceDataAccessAuthIdentity;

    public Optional<String> serviceDataAccessAuthIdentity() {
        return this.serviceDataAccessAuthIdentity == null ? Optional.empty() : Optional.ofNullable(this.serviceDataAccessAuthIdentity);
    }

    /**
     * The Azure Data Lake store name.
     * 
     */
    @Import(name="storeName")
      private final @Nullable String storeName;

    public Optional<String> storeName() {
        return this.storeName == null ? Optional.empty() : Optional.ofNullable(this.storeName);
    }

    /**
     * Subscription ID.
     * 
     */
    @Import(name="subscriptionId")
      private final @Nullable String subscriptionId;

    public Optional<String> subscriptionId() {
        return this.subscriptionId == null ? Optional.empty() : Optional.ofNullable(this.subscriptionId);
    }

    /**
     * The ID of the tenant the service principal/app belongs to.
     * 
     */
    @Import(name="tenantId")
      private final @Nullable String tenantId;

    public Optional<String> tenantId() {
        return this.tenantId == null ? Optional.empty() : Optional.ofNullable(this.tenantId);
    }

    /**
     * The thumbprint of the certificate above.
     * 
     */
    @Import(name="thumbprint")
      private final @Nullable String thumbprint;

    public Optional<String> thumbprint() {
        return this.thumbprint == null ? Optional.empty() : Optional.ofNullable(this.thumbprint);
    }

    public AzureDataLakeSectionResponse(
        @Nullable String authorityUrl,
        @Nullable String certificate,
        @Nullable String clientId,
        @Nullable String clientSecret,
        @Nullable String credentialType,
        @Nullable Boolean isCertAuth,
        @Nullable String resourceGroup,
        @Nullable String resourceUri,
        @Nullable String serviceDataAccessAuthIdentity,
        @Nullable String storeName,
        @Nullable String subscriptionId,
        @Nullable String tenantId,
        @Nullable String thumbprint) {
        this.authorityUrl = authorityUrl;
        this.certificate = certificate;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.credentialType = credentialType;
        this.isCertAuth = isCertAuth;
        this.resourceGroup = resourceGroup;
        this.resourceUri = resourceUri;
        this.serviceDataAccessAuthIdentity = serviceDataAccessAuthIdentity;
        this.storeName = storeName;
        this.subscriptionId = subscriptionId;
        this.tenantId = tenantId;
        this.thumbprint = thumbprint;
    }

    private AzureDataLakeSectionResponse() {
        this.authorityUrl = null;
        this.certificate = null;
        this.clientId = null;
        this.clientSecret = null;
        this.credentialType = null;
        this.isCertAuth = null;
        this.resourceGroup = null;
        this.resourceUri = null;
        this.serviceDataAccessAuthIdentity = null;
        this.storeName = null;
        this.subscriptionId = null;
        this.tenantId = null;
        this.thumbprint = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureDataLakeSectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authorityUrl;
        private @Nullable String certificate;
        private @Nullable String clientId;
        private @Nullable String clientSecret;
        private @Nullable String credentialType;
        private @Nullable Boolean isCertAuth;
        private @Nullable String resourceGroup;
        private @Nullable String resourceUri;
        private @Nullable String serviceDataAccessAuthIdentity;
        private @Nullable String storeName;
        private @Nullable String subscriptionId;
        private @Nullable String tenantId;
        private @Nullable String thumbprint;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureDataLakeSectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorityUrl = defaults.authorityUrl;
    	      this.certificate = defaults.certificate;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.credentialType = defaults.credentialType;
    	      this.isCertAuth = defaults.isCertAuth;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.resourceUri = defaults.resourceUri;
    	      this.serviceDataAccessAuthIdentity = defaults.serviceDataAccessAuthIdentity;
    	      this.storeName = defaults.storeName;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.tenantId = defaults.tenantId;
    	      this.thumbprint = defaults.thumbprint;
        }

        public Builder authorityUrl(@Nullable String authorityUrl) {
            this.authorityUrl = authorityUrl;
            return this;
        }
        public Builder certificate(@Nullable String certificate) {
            this.certificate = certificate;
            return this;
        }
        public Builder clientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }
        public Builder clientSecret(@Nullable String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public Builder credentialType(@Nullable String credentialType) {
            this.credentialType = credentialType;
            return this;
        }
        public Builder isCertAuth(@Nullable Boolean isCertAuth) {
            this.isCertAuth = isCertAuth;
            return this;
        }
        public Builder resourceGroup(@Nullable String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public Builder resourceUri(@Nullable String resourceUri) {
            this.resourceUri = resourceUri;
            return this;
        }
        public Builder serviceDataAccessAuthIdentity(@Nullable String serviceDataAccessAuthIdentity) {
            this.serviceDataAccessAuthIdentity = serviceDataAccessAuthIdentity;
            return this;
        }
        public Builder storeName(@Nullable String storeName) {
            this.storeName = storeName;
            return this;
        }
        public Builder subscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Builder thumbprint(@Nullable String thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }        public AzureDataLakeSectionResponse build() {
            return new AzureDataLakeSectionResponse(authorityUrl, certificate, clientId, clientSecret, credentialType, isCertAuth, resourceGroup, resourceUri, serviceDataAccessAuthIdentity, storeName, subscriptionId, tenantId, thumbprint);
        }
    }
}
