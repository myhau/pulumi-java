// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1AddonsConfigResponse;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1PropertiesResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetOrganizationResult {
    /**
     * Addon configurations of the Apigee organization.
     * 
     */
    private final GoogleCloudApigeeV1AddonsConfigResponse addonsConfig;
    /**
     * Primary GCP region for analytics data storage. For valid values, see [Create an Apigee organization](https://cloud.google.com/apigee/docs/api-platform/get-started/create-org).
     * 
     */
    private final String analyticsRegion;
    /**
     * Not used by Apigee.
     * 
     */
    private final List<String> attributes;
    /**
     * Compute Engine network used for Service Networking to be peered with Apigee runtime instances. See [Getting started with the Service Networking API](https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started). Valid only when [RuntimeType](#RuntimeType) is set to `CLOUD`. The value must be set before the creation of a runtime instance and can be updated only when there are no runtime instances. For example: `default`. Apigee also supports shared VPC (that is, the host network project is not the same as the one that is peering with Apigee). See [Shared VPC overview](https://cloud.google.com/vpc/docs/shared-vpc). To use a shared VPC network, use the following format: `projects/{host-project-id}/{region}/networks/{network-name}`. For example: `projects/my-sharedvpc-host/global/networks/mynetwork` **Note:** Not supported for Apigee hybrid.
     * 
     */
    private final String authorizedNetwork;
    /**
     * Billing type of the Apigee organization. See [Apigee pricing](https://cloud.google.com/apigee/pricing).
     * 
     */
    private final String billingType;
    /**
     * Base64-encoded public certificate for the root CA of the Apigee organization. Valid only when [RuntimeType](#RuntimeType) is `CLOUD`.
     * 
     */
    private final String caCertificate;
    /**
     * Time that the Apigee organization was created in milliseconds since epoch.
     * 
     */
    private final String createdAt;
    /**
     * Not used by Apigee.
     * 
     */
    private final String customerName;
    /**
     * Description of the Apigee organization.
     * 
     */
    private final String description;
    /**
     * Display name for the Apigee organization. Unused, but reserved for future use.
     * 
     */
    private final String displayName;
    /**
     * List of environments in the Apigee organization.
     * 
     */
    private final List<String> environments;
    /**
     * Time that the Apigee organization is scheduled for deletion.
     * 
     */
    private final String expiresAt;
    /**
     * Time that the Apigee organization was last modified in milliseconds since epoch.
     * 
     */
    private final String lastModifiedAt;
    /**
     * Name of the Apigee organization.
     * 
     */
    private final String name;
    /**
     * Configuration for the Portals settings.
     * 
     */
    private final Boolean portalDisabled;
    /**
     * Project ID associated with the Apigee organization.
     * 
     */
    private final String project;
    /**
     * Properties defined in the Apigee organization profile.
     * 
     */
    private final GoogleCloudApigeeV1PropertiesResponse properties;
    /**
     * Cloud KMS key name used for encrypting the data that is stored and replicated across runtime instances. Update is not allowed after the organization is created. Required when [RuntimeType](#RuntimeType) is `CLOUD`. If not specified when [RuntimeType](#RuntimeType) is `TRIAL`, a Google-Managed encryption key will be used. For example: "projects/foo/locations/us/keyRings/bar/cryptoKeys/baz". **Note:** Not supported for Apigee hybrid.
     * 
     */
    private final String runtimeDatabaseEncryptionKeyName;
    /**
     * Runtime type of the Apigee organization based on the Apigee subscription purchased.
     * 
     */
    private final String runtimeType;
    /**
     * State of the organization. Values other than ACTIVE means the resource is not ready to use.
     * 
     */
    private final String state;
    /**
     * Not used by Apigee.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"addonsConfig","analyticsRegion","attributes","authorizedNetwork","billingType","caCertificate","createdAt","customerName","description","displayName","environments","expiresAt","lastModifiedAt","name","portalDisabled","project","properties","runtimeDatabaseEncryptionKeyName","runtimeType","state","type"})
    private GetOrganizationResult(
        GoogleCloudApigeeV1AddonsConfigResponse addonsConfig,
        String analyticsRegion,
        List<String> attributes,
        String authorizedNetwork,
        String billingType,
        String caCertificate,
        String createdAt,
        String customerName,
        String description,
        String displayName,
        List<String> environments,
        String expiresAt,
        String lastModifiedAt,
        String name,
        Boolean portalDisabled,
        String project,
        GoogleCloudApigeeV1PropertiesResponse properties,
        String runtimeDatabaseEncryptionKeyName,
        String runtimeType,
        String state,
        String type) {
        this.addonsConfig = addonsConfig;
        this.analyticsRegion = analyticsRegion;
        this.attributes = attributes;
        this.authorizedNetwork = authorizedNetwork;
        this.billingType = billingType;
        this.caCertificate = caCertificate;
        this.createdAt = createdAt;
        this.customerName = customerName;
        this.description = description;
        this.displayName = displayName;
        this.environments = environments;
        this.expiresAt = expiresAt;
        this.lastModifiedAt = lastModifiedAt;
        this.name = name;
        this.portalDisabled = portalDisabled;
        this.project = project;
        this.properties = properties;
        this.runtimeDatabaseEncryptionKeyName = runtimeDatabaseEncryptionKeyName;
        this.runtimeType = runtimeType;
        this.state = state;
        this.type = type;
    }

    /**
     * Addon configurations of the Apigee organization.
     * 
    */
    public GoogleCloudApigeeV1AddonsConfigResponse getAddonsConfig() {
        return this.addonsConfig;
    }
    /**
     * Primary GCP region for analytics data storage. For valid values, see [Create an Apigee organization](https://cloud.google.com/apigee/docs/api-platform/get-started/create-org).
     * 
    */
    public String getAnalyticsRegion() {
        return this.analyticsRegion;
    }
    /**
     * Not used by Apigee.
     * 
    */
    public List<String> getAttributes() {
        return this.attributes;
    }
    /**
     * Compute Engine network used for Service Networking to be peered with Apigee runtime instances. See [Getting started with the Service Networking API](https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started). Valid only when [RuntimeType](#RuntimeType) is set to `CLOUD`. The value must be set before the creation of a runtime instance and can be updated only when there are no runtime instances. For example: `default`. Apigee also supports shared VPC (that is, the host network project is not the same as the one that is peering with Apigee). See [Shared VPC overview](https://cloud.google.com/vpc/docs/shared-vpc). To use a shared VPC network, use the following format: `projects/{host-project-id}/{region}/networks/{network-name}`. For example: `projects/my-sharedvpc-host/global/networks/mynetwork` **Note:** Not supported for Apigee hybrid.
     * 
    */
    public String getAuthorizedNetwork() {
        return this.authorizedNetwork;
    }
    /**
     * Billing type of the Apigee organization. See [Apigee pricing](https://cloud.google.com/apigee/pricing).
     * 
    */
    public String getBillingType() {
        return this.billingType;
    }
    /**
     * Base64-encoded public certificate for the root CA of the Apigee organization. Valid only when [RuntimeType](#RuntimeType) is `CLOUD`.
     * 
    */
    public String getCaCertificate() {
        return this.caCertificate;
    }
    /**
     * Time that the Apigee organization was created in milliseconds since epoch.
     * 
    */
    public String getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Not used by Apigee.
     * 
    */
    public String getCustomerName() {
        return this.customerName;
    }
    /**
     * Description of the Apigee organization.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Display name for the Apigee organization. Unused, but reserved for future use.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * List of environments in the Apigee organization.
     * 
    */
    public List<String> getEnvironments() {
        return this.environments;
    }
    /**
     * Time that the Apigee organization is scheduled for deletion.
     * 
    */
    public String getExpiresAt() {
        return this.expiresAt;
    }
    /**
     * Time that the Apigee organization was last modified in milliseconds since epoch.
     * 
    */
    public String getLastModifiedAt() {
        return this.lastModifiedAt;
    }
    /**
     * Name of the Apigee organization.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Configuration for the Portals settings.
     * 
    */
    public Boolean getPortalDisabled() {
        return this.portalDisabled;
    }
    /**
     * Project ID associated with the Apigee organization.
     * 
    */
    public String getProject() {
        return this.project;
    }
    /**
     * Properties defined in the Apigee organization profile.
     * 
    */
    public GoogleCloudApigeeV1PropertiesResponse getProperties() {
        return this.properties;
    }
    /**
     * Cloud KMS key name used for encrypting the data that is stored and replicated across runtime instances. Update is not allowed after the organization is created. Required when [RuntimeType](#RuntimeType) is `CLOUD`. If not specified when [RuntimeType](#RuntimeType) is `TRIAL`, a Google-Managed encryption key will be used. For example: "projects/foo/locations/us/keyRings/bar/cryptoKeys/baz". **Note:** Not supported for Apigee hybrid.
     * 
    */
    public String getRuntimeDatabaseEncryptionKeyName() {
        return this.runtimeDatabaseEncryptionKeyName;
    }
    /**
     * Runtime type of the Apigee organization based on the Apigee subscription purchased.
     * 
    */
    public String getRuntimeType() {
        return this.runtimeType;
    }
    /**
     * State of the organization. Values other than ACTIVE means the resource is not ready to use.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * Not used by Apigee.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudApigeeV1AddonsConfigResponse addonsConfig;
        private String analyticsRegion;
        private List<String> attributes;
        private String authorizedNetwork;
        private String billingType;
        private String caCertificate;
        private String createdAt;
        private String customerName;
        private String description;
        private String displayName;
        private List<String> environments;
        private String expiresAt;
        private String lastModifiedAt;
        private String name;
        private Boolean portalDisabled;
        private String project;
        private GoogleCloudApigeeV1PropertiesResponse properties;
        private String runtimeDatabaseEncryptionKeyName;
        private String runtimeType;
        private String state;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addonsConfig = defaults.addonsConfig;
    	      this.analyticsRegion = defaults.analyticsRegion;
    	      this.attributes = defaults.attributes;
    	      this.authorizedNetwork = defaults.authorizedNetwork;
    	      this.billingType = defaults.billingType;
    	      this.caCertificate = defaults.caCertificate;
    	      this.createdAt = defaults.createdAt;
    	      this.customerName = defaults.customerName;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.environments = defaults.environments;
    	      this.expiresAt = defaults.expiresAt;
    	      this.lastModifiedAt = defaults.lastModifiedAt;
    	      this.name = defaults.name;
    	      this.portalDisabled = defaults.portalDisabled;
    	      this.project = defaults.project;
    	      this.properties = defaults.properties;
    	      this.runtimeDatabaseEncryptionKeyName = defaults.runtimeDatabaseEncryptionKeyName;
    	      this.runtimeType = defaults.runtimeType;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
        }

        public Builder setAddonsConfig(GoogleCloudApigeeV1AddonsConfigResponse addonsConfig) {
            this.addonsConfig = Objects.requireNonNull(addonsConfig);
            return this;
        }

        public Builder setAnalyticsRegion(String analyticsRegion) {
            this.analyticsRegion = Objects.requireNonNull(analyticsRegion);
            return this;
        }

        public Builder setAttributes(List<String> attributes) {
            this.attributes = Objects.requireNonNull(attributes);
            return this;
        }

        public Builder setAuthorizedNetwork(String authorizedNetwork) {
            this.authorizedNetwork = Objects.requireNonNull(authorizedNetwork);
            return this;
        }

        public Builder setBillingType(String billingType) {
            this.billingType = Objects.requireNonNull(billingType);
            return this;
        }

        public Builder setCaCertificate(String caCertificate) {
            this.caCertificate = Objects.requireNonNull(caCertificate);
            return this;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }

        public Builder setCustomerName(String customerName) {
            this.customerName = Objects.requireNonNull(customerName);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setEnvironments(List<String> environments) {
            this.environments = Objects.requireNonNull(environments);
            return this;
        }

        public Builder setExpiresAt(String expiresAt) {
            this.expiresAt = Objects.requireNonNull(expiresAt);
            return this;
        }

        public Builder setLastModifiedAt(String lastModifiedAt) {
            this.lastModifiedAt = Objects.requireNonNull(lastModifiedAt);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPortalDisabled(Boolean portalDisabled) {
            this.portalDisabled = Objects.requireNonNull(portalDisabled);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setProperties(GoogleCloudApigeeV1PropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setRuntimeDatabaseEncryptionKeyName(String runtimeDatabaseEncryptionKeyName) {
            this.runtimeDatabaseEncryptionKeyName = Objects.requireNonNull(runtimeDatabaseEncryptionKeyName);
            return this;
        }

        public Builder setRuntimeType(String runtimeType) {
            this.runtimeType = Objects.requireNonNull(runtimeType);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetOrganizationResult build() {
            return new GetOrganizationResult(addonsConfig, analyticsRegion, attributes, authorizedNetwork, billingType, caCertificate, createdAt, customerName, description, displayName, environments, expiresAt, lastModifiedAt, name, portalDisabled, project, properties, runtimeDatabaseEncryptionKeyName, runtimeType, state, type);
        }
    }
}
