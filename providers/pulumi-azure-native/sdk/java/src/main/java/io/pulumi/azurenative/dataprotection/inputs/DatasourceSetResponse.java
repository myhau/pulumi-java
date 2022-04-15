// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * DatasourceSet details of datasource to be backed up
 * 
 */
public final class DatasourceSetResponse extends io.pulumi.resources.InvokeArgs {

    public static final DatasourceSetResponse Empty = new DatasourceSetResponse();

    /**
     * DatasourceType of the resource.
     * 
     */
    @Import(name="datasourceType")
      private final @Nullable String datasourceType;

    public Optional<String> datasourceType() {
        return this.datasourceType == null ? Optional.empty() : Optional.ofNullable(this.datasourceType);
    }

    /**
     * Type of Datasource object, used to initialize the right inherited type
     * 
     */
    @Import(name="objectType")
      private final @Nullable String objectType;

    public Optional<String> objectType() {
        return this.objectType == null ? Optional.empty() : Optional.ofNullable(this.objectType);
    }

    /**
     * Full ARM ID of the resource. For azure resources, this is ARM ID. For non azure resources, this will be the ID created by backup service via Fabric/Vault.
     * 
     */
    @Import(name="resourceID", required=true)
      private final String resourceID;

    public String resourceID() {
        return this.resourceID;
    }

    /**
     * Location of datasource.
     * 
     */
    @Import(name="resourceLocation")
      private final @Nullable String resourceLocation;

    public Optional<String> resourceLocation() {
        return this.resourceLocation == null ? Optional.empty() : Optional.ofNullable(this.resourceLocation);
    }

    /**
     * Unique identifier of the resource in the context of parent.
     * 
     */
    @Import(name="resourceName")
      private final @Nullable String resourceName;

    public Optional<String> resourceName() {
        return this.resourceName == null ? Optional.empty() : Optional.ofNullable(this.resourceName);
    }

    /**
     * Resource Type of Datasource.
     * 
     */
    @Import(name="resourceType")
      private final @Nullable String resourceType;

    public Optional<String> resourceType() {
        return this.resourceType == null ? Optional.empty() : Optional.ofNullable(this.resourceType);
    }

    /**
     * Uri of the resource.
     * 
     */
    @Import(name="resourceUri")
      private final @Nullable String resourceUri;

    public Optional<String> resourceUri() {
        return this.resourceUri == null ? Optional.empty() : Optional.ofNullable(this.resourceUri);
    }

    public DatasourceSetResponse(
        @Nullable String datasourceType,
        @Nullable String objectType,
        String resourceID,
        @Nullable String resourceLocation,
        @Nullable String resourceName,
        @Nullable String resourceType,
        @Nullable String resourceUri) {
        this.datasourceType = datasourceType;
        this.objectType = objectType;
        this.resourceID = Objects.requireNonNull(resourceID, "expected parameter 'resourceID' to be non-null");
        this.resourceLocation = resourceLocation;
        this.resourceName = resourceName;
        this.resourceType = resourceType;
        this.resourceUri = resourceUri;
    }

    private DatasourceSetResponse() {
        this.datasourceType = null;
        this.objectType = null;
        this.resourceID = null;
        this.resourceLocation = null;
        this.resourceName = null;
        this.resourceType = null;
        this.resourceUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasourceSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String datasourceType;
        private @Nullable String objectType;
        private String resourceID;
        private @Nullable String resourceLocation;
        private @Nullable String resourceName;
        private @Nullable String resourceType;
        private @Nullable String resourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasourceSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasourceType = defaults.datasourceType;
    	      this.objectType = defaults.objectType;
    	      this.resourceID = defaults.resourceID;
    	      this.resourceLocation = defaults.resourceLocation;
    	      this.resourceName = defaults.resourceName;
    	      this.resourceType = defaults.resourceType;
    	      this.resourceUri = defaults.resourceUri;
        }

        public Builder datasourceType(@Nullable String datasourceType) {
            this.datasourceType = datasourceType;
            return this;
        }
        public Builder objectType(@Nullable String objectType) {
            this.objectType = objectType;
            return this;
        }
        public Builder resourceID(String resourceID) {
            this.resourceID = Objects.requireNonNull(resourceID);
            return this;
        }
        public Builder resourceLocation(@Nullable String resourceLocation) {
            this.resourceLocation = resourceLocation;
            return this;
        }
        public Builder resourceName(@Nullable String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public Builder resourceType(@Nullable String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public Builder resourceUri(@Nullable String resourceUri) {
            this.resourceUri = resourceUri;
            return this;
        }        public DatasourceSetResponse build() {
            return new DatasourceSetResponse(datasourceType, objectType, resourceID, resourceLocation, resourceName, resourceType, resourceUri);
        }
    }
}
