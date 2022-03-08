// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.outputs;

import io.pulumi.azurenative.resources.outputs.AliasResponse;
import io.pulumi.azurenative.resources.outputs.ApiProfileResponse;
import io.pulumi.azurenative.resources.outputs.ProviderExtendedLocationResponse;
import io.pulumi.azurenative.resources.outputs.ZoneMappingResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ProviderResourceTypeResponse {
    /**
     * The aliases that are supported by this resource type.
     * 
     */
    private final @Nullable List<AliasResponse> aliases;
    /**
     * The API profiles for the resource provider.
     * 
     */
    private final List<ApiProfileResponse> apiProfiles;
    /**
     * The API version.
     * 
     */
    private final @Nullable List<String> apiVersions;
    /**
     * The additional capabilities offered by this resource type.
     * 
     */
    private final @Nullable String capabilities;
    /**
     * The default API version.
     * 
     */
    private final String defaultApiVersion;
    /**
     * The location mappings that are supported by this resource type.
     * 
     */
    private final @Nullable List<ProviderExtendedLocationResponse> locationMappings;
    /**
     * The collection of locations where this resource type can be created.
     * 
     */
    private final @Nullable List<String> locations;
    /**
     * The properties.
     * 
     */
    private final @Nullable Map<String,String> properties;
    /**
     * The resource type.
     * 
     */
    private final @Nullable String resourceType;
    private final @Nullable List<ZoneMappingResponse> zoneMappings;

    @OutputCustomType.Constructor({"aliases","apiProfiles","apiVersions","capabilities","defaultApiVersion","locationMappings","locations","properties","resourceType","zoneMappings"})
    private ProviderResourceTypeResponse(
        @Nullable List<AliasResponse> aliases,
        List<ApiProfileResponse> apiProfiles,
        @Nullable List<String> apiVersions,
        @Nullable String capabilities,
        String defaultApiVersion,
        @Nullable List<ProviderExtendedLocationResponse> locationMappings,
        @Nullable List<String> locations,
        @Nullable Map<String,String> properties,
        @Nullable String resourceType,
        @Nullable List<ZoneMappingResponse> zoneMappings) {
        this.aliases = aliases;
        this.apiProfiles = apiProfiles;
        this.apiVersions = apiVersions;
        this.capabilities = capabilities;
        this.defaultApiVersion = defaultApiVersion;
        this.locationMappings = locationMappings;
        this.locations = locations;
        this.properties = properties;
        this.resourceType = resourceType;
        this.zoneMappings = zoneMappings;
    }

    /**
     * The aliases that are supported by this resource type.
     * 
    */
    public List<AliasResponse> getAliases() {
        return this.aliases == null ? List.of() : this.aliases;
    }
    /**
     * The API profiles for the resource provider.
     * 
    */
    public List<ApiProfileResponse> getApiProfiles() {
        return this.apiProfiles;
    }
    /**
     * The API version.
     * 
    */
    public List<String> getApiVersions() {
        return this.apiVersions == null ? List.of() : this.apiVersions;
    }
    /**
     * The additional capabilities offered by this resource type.
     * 
    */
    public Optional<String> getCapabilities() {
        return Optional.ofNullable(this.capabilities);
    }
    /**
     * The default API version.
     * 
    */
    public String getDefaultApiVersion() {
        return this.defaultApiVersion;
    }
    /**
     * The location mappings that are supported by this resource type.
     * 
    */
    public List<ProviderExtendedLocationResponse> getLocationMappings() {
        return this.locationMappings == null ? List.of() : this.locationMappings;
    }
    /**
     * The collection of locations where this resource type can be created.
     * 
    */
    public List<String> getLocations() {
        return this.locations == null ? List.of() : this.locations;
    }
    /**
     * The properties.
     * 
    */
    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    /**
     * The resource type.
     * 
    */
    public Optional<String> getPropResourceType() {
        return Optional.ofNullable(this.resourceType);
    }
    public List<ZoneMappingResponse> getZoneMappings() {
        return this.zoneMappings == null ? List.of() : this.zoneMappings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderResourceTypeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AliasResponse> aliases;
        private List<ApiProfileResponse> apiProfiles;
        private @Nullable List<String> apiVersions;
        private @Nullable String capabilities;
        private String defaultApiVersion;
        private @Nullable List<ProviderExtendedLocationResponse> locationMappings;
        private @Nullable List<String> locations;
        private @Nullable Map<String,String> properties;
        private @Nullable String resourceType;
        private @Nullable List<ZoneMappingResponse> zoneMappings;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderResourceTypeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliases = defaults.aliases;
    	      this.apiProfiles = defaults.apiProfiles;
    	      this.apiVersions = defaults.apiVersions;
    	      this.capabilities = defaults.capabilities;
    	      this.defaultApiVersion = defaults.defaultApiVersion;
    	      this.locationMappings = defaults.locationMappings;
    	      this.locations = defaults.locations;
    	      this.properties = defaults.properties;
    	      this.resourceType = defaults.resourceType;
    	      this.zoneMappings = defaults.zoneMappings;
        }

        public Builder setAliases(@Nullable List<AliasResponse> aliases) {
            this.aliases = aliases;
            return this;
        }

        public Builder setApiProfiles(List<ApiProfileResponse> apiProfiles) {
            this.apiProfiles = Objects.requireNonNull(apiProfiles);
            return this;
        }

        public Builder setApiVersions(@Nullable List<String> apiVersions) {
            this.apiVersions = apiVersions;
            return this;
        }

        public Builder setCapabilities(@Nullable String capabilities) {
            this.capabilities = capabilities;
            return this;
        }

        public Builder setDefaultApiVersion(String defaultApiVersion) {
            this.defaultApiVersion = Objects.requireNonNull(defaultApiVersion);
            return this;
        }

        public Builder setLocationMappings(@Nullable List<ProviderExtendedLocationResponse> locationMappings) {
            this.locationMappings = locationMappings;
            return this;
        }

        public Builder setLocations(@Nullable List<String> locations) {
            this.locations = locations;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setResourceType(@Nullable String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder setZoneMappings(@Nullable List<ZoneMappingResponse> zoneMappings) {
            this.zoneMappings = zoneMappings;
            return this;
        }
        public ProviderResourceTypeResponse build() {
            return new ProviderResourceTypeResponse(aliases, apiProfiles, apiVersions, capabilities, defaultApiVersion, locationMappings, locations, properties, resourceType, zoneMappings);
        }
    }
}
