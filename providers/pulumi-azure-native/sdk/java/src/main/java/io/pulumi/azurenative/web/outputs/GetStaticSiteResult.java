// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.ManagedServiceIdentityResponse;
import io.pulumi.azurenative.web.outputs.ResponseMessageEnvelopeRemotePrivateEndpointConnectionResponse;
import io.pulumi.azurenative.web.outputs.SkuDescriptionResponse;
import io.pulumi.azurenative.web.outputs.StaticSiteBuildPropertiesResponse;
import io.pulumi.azurenative.web.outputs.StaticSiteTemplateOptionsResponse;
import io.pulumi.azurenative.web.outputs.StaticSiteUserProvidedFunctionAppResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetStaticSiteResult {
    /**
     * <code>false</code> if config file is locked for this static web app; otherwise, <code>true</code>.
     * 
     */
    private final @Nullable Boolean allowConfigFileUpdates;
    /**
     * The target branch in the repository.
     * 
     */
    private final @Nullable String branch;
    /**
     * Build properties to configure on the repository.
     * 
     */
    private final @Nullable StaticSiteBuildPropertiesResponse buildProperties;
    /**
     * The content distribution endpoint for the static site.
     * 
     */
    private final String contentDistributionEndpoint;
    /**
     * The custom domains associated with this static site.
     * 
     */
    private final List<String> customDomains;
    /**
     * The default autogenerated hostname for the static site.
     * 
     */
    private final String defaultHostname;
    /**
     * Resource Id.
     * 
     */
    private final String id;
    /**
     * Managed service identity.
     * 
     */
    private final @Nullable ManagedServiceIdentityResponse identity;
    /**
     * Identity to use for Key Vault Reference authentication.
     * 
     */
    private final String keyVaultReferenceIdentity;
    /**
     * Kind of resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * Resource Location.
     * 
     */
    private final String location;
    /**
     * Resource Name.
     * 
     */
    private final String name;
    /**
     * Private endpoint connections
     * 
     */
    private final List<ResponseMessageEnvelopeRemotePrivateEndpointConnectionResponse> privateEndpointConnections;
    /**
     * The provider that submitted the last deployment to the primary environment of the static site.
     * 
     */
    private final String provider;
    /**
     * A user's github repository token. This is used to setup the Github Actions workflow file and API secrets.
     * 
     */
    private final @Nullable String repositoryToken;
    /**
     * URL for the repository of the static site.
     * 
     */
    private final @Nullable String repositoryUrl;
    /**
     * Description of a SKU for a scalable resource.
     * 
     */
    private final @Nullable SkuDescriptionResponse sku;
    /**
     * State indicating whether staging environments are allowed or not allowed for a static web app.
     * 
     */
    private final @Nullable String stagingEnvironmentPolicy;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Template options for generating a new repository.
     * 
     */
    private final @Nullable StaticSiteTemplateOptionsResponse templateProperties;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * User provided function apps registered with the static site
     * 
     */
    private final List<StaticSiteUserProvidedFunctionAppResponse> userProvidedFunctionApps;

    @CustomType.Constructor
    private GetStaticSiteResult(
        @CustomType.Parameter("allowConfigFileUpdates") @Nullable Boolean allowConfigFileUpdates,
        @CustomType.Parameter("branch") @Nullable String branch,
        @CustomType.Parameter("buildProperties") @Nullable StaticSiteBuildPropertiesResponse buildProperties,
        @CustomType.Parameter("contentDistributionEndpoint") String contentDistributionEndpoint,
        @CustomType.Parameter("customDomains") List<String> customDomains,
        @CustomType.Parameter("defaultHostname") String defaultHostname,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable ManagedServiceIdentityResponse identity,
        @CustomType.Parameter("keyVaultReferenceIdentity") String keyVaultReferenceIdentity,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("privateEndpointConnections") List<ResponseMessageEnvelopeRemotePrivateEndpointConnectionResponse> privateEndpointConnections,
        @CustomType.Parameter("provider") String provider,
        @CustomType.Parameter("repositoryToken") @Nullable String repositoryToken,
        @CustomType.Parameter("repositoryUrl") @Nullable String repositoryUrl,
        @CustomType.Parameter("sku") @Nullable SkuDescriptionResponse sku,
        @CustomType.Parameter("stagingEnvironmentPolicy") @Nullable String stagingEnvironmentPolicy,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("templateProperties") @Nullable StaticSiteTemplateOptionsResponse templateProperties,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userProvidedFunctionApps") List<StaticSiteUserProvidedFunctionAppResponse> userProvidedFunctionApps) {
        this.allowConfigFileUpdates = allowConfigFileUpdates;
        this.branch = branch;
        this.buildProperties = buildProperties;
        this.contentDistributionEndpoint = contentDistributionEndpoint;
        this.customDomains = customDomains;
        this.defaultHostname = defaultHostname;
        this.id = id;
        this.identity = identity;
        this.keyVaultReferenceIdentity = keyVaultReferenceIdentity;
        this.kind = kind;
        this.location = location;
        this.name = name;
        this.privateEndpointConnections = privateEndpointConnections;
        this.provider = provider;
        this.repositoryToken = repositoryToken;
        this.repositoryUrl = repositoryUrl;
        this.sku = sku;
        this.stagingEnvironmentPolicy = stagingEnvironmentPolicy;
        this.tags = tags;
        this.templateProperties = templateProperties;
        this.type = type;
        this.userProvidedFunctionApps = userProvidedFunctionApps;
    }

    /**
     * <code>false</code> if config file is locked for this static web app; otherwise, <code>true</code>.
     * 
    */
    public Optional<Boolean> allowConfigFileUpdates() {
        return Optional.ofNullable(this.allowConfigFileUpdates);
    }
    /**
     * The target branch in the repository.
     * 
    */
    public Optional<String> branch() {
        return Optional.ofNullable(this.branch);
    }
    /**
     * Build properties to configure on the repository.
     * 
    */
    public Optional<StaticSiteBuildPropertiesResponse> buildProperties() {
        return Optional.ofNullable(this.buildProperties);
    }
    /**
     * The content distribution endpoint for the static site.
     * 
    */
    public String contentDistributionEndpoint() {
        return this.contentDistributionEndpoint;
    }
    /**
     * The custom domains associated with this static site.
     * 
    */
    public List<String> customDomains() {
        return this.customDomains;
    }
    /**
     * The default autogenerated hostname for the static site.
     * 
    */
    public String defaultHostname() {
        return this.defaultHostname;
    }
    /**
     * Resource Id.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Managed service identity.
     * 
    */
    public Optional<ManagedServiceIdentityResponse> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * Identity to use for Key Vault Reference authentication.
     * 
    */
    public String keyVaultReferenceIdentity() {
        return this.keyVaultReferenceIdentity;
    }
    /**
     * Kind of resource.
     * 
    */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Resource Location.
     * 
    */
    public String location() {
        return this.location;
    }
    /**
     * Resource Name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Private endpoint connections
     * 
    */
    public List<ResponseMessageEnvelopeRemotePrivateEndpointConnectionResponse> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * The provider that submitted the last deployment to the primary environment of the static site.
     * 
    */
    public String provider() {
        return this.provider;
    }
    /**
     * A user's github repository token. This is used to setup the Github Actions workflow file and API secrets.
     * 
    */
    public Optional<String> repositoryToken() {
        return Optional.ofNullable(this.repositoryToken);
    }
    /**
     * URL for the repository of the static site.
     * 
    */
    public Optional<String> repositoryUrl() {
        return Optional.ofNullable(this.repositoryUrl);
    }
    /**
     * Description of a SKU for a scalable resource.
     * 
    */
    public Optional<SkuDescriptionResponse> sku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * State indicating whether staging environments are allowed or not allowed for a static web app.
     * 
    */
    public Optional<String> stagingEnvironmentPolicy() {
        return Optional.ofNullable(this.stagingEnvironmentPolicy);
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Template options for generating a new repository.
     * 
    */
    public Optional<StaticSiteTemplateOptionsResponse> templateProperties() {
        return Optional.ofNullable(this.templateProperties);
    }
    /**
     * Resource type.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * User provided function apps registered with the static site
     * 
    */
    public List<StaticSiteUserProvidedFunctionAppResponse> userProvidedFunctionApps() {
        return this.userProvidedFunctionApps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStaticSiteResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowConfigFileUpdates;
        private @Nullable String branch;
        private @Nullable StaticSiteBuildPropertiesResponse buildProperties;
        private String contentDistributionEndpoint;
        private List<String> customDomains;
        private String defaultHostname;
        private String id;
        private @Nullable ManagedServiceIdentityResponse identity;
        private String keyVaultReferenceIdentity;
        private @Nullable String kind;
        private String location;
        private String name;
        private List<ResponseMessageEnvelopeRemotePrivateEndpointConnectionResponse> privateEndpointConnections;
        private String provider;
        private @Nullable String repositoryToken;
        private @Nullable String repositoryUrl;
        private @Nullable SkuDescriptionResponse sku;
        private @Nullable String stagingEnvironmentPolicy;
        private @Nullable Map<String,String> tags;
        private @Nullable StaticSiteTemplateOptionsResponse templateProperties;
        private String type;
        private List<StaticSiteUserProvidedFunctionAppResponse> userProvidedFunctionApps;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStaticSiteResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowConfigFileUpdates = defaults.allowConfigFileUpdates;
    	      this.branch = defaults.branch;
    	      this.buildProperties = defaults.buildProperties;
    	      this.contentDistributionEndpoint = defaults.contentDistributionEndpoint;
    	      this.customDomains = defaults.customDomains;
    	      this.defaultHostname = defaults.defaultHostname;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.keyVaultReferenceIdentity = defaults.keyVaultReferenceIdentity;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.provider = defaults.provider;
    	      this.repositoryToken = defaults.repositoryToken;
    	      this.repositoryUrl = defaults.repositoryUrl;
    	      this.sku = defaults.sku;
    	      this.stagingEnvironmentPolicy = defaults.stagingEnvironmentPolicy;
    	      this.tags = defaults.tags;
    	      this.templateProperties = defaults.templateProperties;
    	      this.type = defaults.type;
    	      this.userProvidedFunctionApps = defaults.userProvidedFunctionApps;
        }

        public Builder allowConfigFileUpdates(@Nullable Boolean allowConfigFileUpdates) {
            this.allowConfigFileUpdates = allowConfigFileUpdates;
            return this;
        }
        public Builder branch(@Nullable String branch) {
            this.branch = branch;
            return this;
        }
        public Builder buildProperties(@Nullable StaticSiteBuildPropertiesResponse buildProperties) {
            this.buildProperties = buildProperties;
            return this;
        }
        public Builder contentDistributionEndpoint(String contentDistributionEndpoint) {
            this.contentDistributionEndpoint = Objects.requireNonNull(contentDistributionEndpoint);
            return this;
        }
        public Builder customDomains(List<String> customDomains) {
            this.customDomains = Objects.requireNonNull(customDomains);
            return this;
        }
        public Builder customDomains(String... customDomains) {
            return customDomains(List.of(customDomains));
        }
        public Builder defaultHostname(String defaultHostname) {
            this.defaultHostname = Objects.requireNonNull(defaultHostname);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identity(@Nullable ManagedServiceIdentityResponse identity) {
            this.identity = identity;
            return this;
        }
        public Builder keyVaultReferenceIdentity(String keyVaultReferenceIdentity) {
            this.keyVaultReferenceIdentity = Objects.requireNonNull(keyVaultReferenceIdentity);
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder privateEndpointConnections(List<ResponseMessageEnvelopeRemotePrivateEndpointConnectionResponse> privateEndpointConnections) {
            this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
            return this;
        }
        public Builder privateEndpointConnections(ResponseMessageEnvelopeRemotePrivateEndpointConnectionResponse... privateEndpointConnections) {
            return privateEndpointConnections(List.of(privateEndpointConnections));
        }
        public Builder provider(String provider) {
            this.provider = Objects.requireNonNull(provider);
            return this;
        }
        public Builder repositoryToken(@Nullable String repositoryToken) {
            this.repositoryToken = repositoryToken;
            return this;
        }
        public Builder repositoryUrl(@Nullable String repositoryUrl) {
            this.repositoryUrl = repositoryUrl;
            return this;
        }
        public Builder sku(@Nullable SkuDescriptionResponse sku) {
            this.sku = sku;
            return this;
        }
        public Builder stagingEnvironmentPolicy(@Nullable String stagingEnvironmentPolicy) {
            this.stagingEnvironmentPolicy = stagingEnvironmentPolicy;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder templateProperties(@Nullable StaticSiteTemplateOptionsResponse templateProperties) {
            this.templateProperties = templateProperties;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder userProvidedFunctionApps(List<StaticSiteUserProvidedFunctionAppResponse> userProvidedFunctionApps) {
            this.userProvidedFunctionApps = Objects.requireNonNull(userProvidedFunctionApps);
            return this;
        }
        public Builder userProvidedFunctionApps(StaticSiteUserProvidedFunctionAppResponse... userProvidedFunctionApps) {
            return userProvidedFunctionApps(List.of(userProvidedFunctionApps));
        }        public GetStaticSiteResult build() {
            return new GetStaticSiteResult(allowConfigFileUpdates, branch, buildProperties, contentDistributionEndpoint, customDomains, defaultHostname, id, identity, keyVaultReferenceIdentity, kind, location, name, privateEndpointConnections, provider, repositoryToken, repositoryUrl, sku, stagingEnvironmentPolicy, tags, templateProperties, type, userProvidedFunctionApps);
        }
    }
}
