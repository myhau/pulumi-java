// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.RestorePointCollectionSourcePropertiesResponse;
import io.pulumi.azurenative.compute.outputs.RestorePointResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetRestorePointCollectionResult {
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * Resource location
     * 
     */
    private final String location;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * The provisioning state of the restore point collection.
     * 
     */
    private final String provisioningState;
    /**
     * The unique id of the restore point collection.
     * 
     */
    private final String restorePointCollectionId;
    /**
     * A list containing all restore points created under this restore point collection.
     * 
     */
    private final List<RestorePointResponse> restorePoints;
    /**
     * The properties of the source resource that this restore point collection is created from.
     * 
     */
    private final @Nullable RestorePointCollectionSourcePropertiesResponse source;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","location","name","provisioningState","restorePointCollectionId","restorePoints","source","tags","type"})
    private GetRestorePointCollectionResult(
        String id,
        String location,
        String name,
        String provisioningState,
        String restorePointCollectionId,
        List<RestorePointResponse> restorePoints,
        @Nullable RestorePointCollectionSourcePropertiesResponse source,
        @Nullable Map<String,String> tags,
        String type) {
        this.id = id;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.restorePointCollectionId = restorePointCollectionId;
        this.restorePoints = restorePoints;
        this.source = source;
        this.tags = tags;
        this.type = type;
    }

    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource location
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The provisioning state of the restore point collection.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The unique id of the restore point collection.
     * 
    */
    public String getRestorePointCollectionId() {
        return this.restorePointCollectionId;
    }
    /**
     * A list containing all restore points created under this restore point collection.
     * 
    */
    public List<RestorePointResponse> getRestorePoints() {
        return this.restorePoints;
    }
    /**
     * The properties of the source resource that this restore point collection is created from.
     * 
    */
    public Optional<RestorePointCollectionSourcePropertiesResponse> getSource() {
        return Optional.ofNullable(this.source);
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRestorePointCollectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String location;
        private String name;
        private String provisioningState;
        private String restorePointCollectionId;
        private List<RestorePointResponse> restorePoints;
        private @Nullable RestorePointCollectionSourcePropertiesResponse source;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRestorePointCollectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.restorePointCollectionId = defaults.restorePointCollectionId;
    	      this.restorePoints = defaults.restorePoints;
    	      this.source = defaults.source;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRestorePointCollectionId(String restorePointCollectionId) {
            this.restorePointCollectionId = Objects.requireNonNull(restorePointCollectionId);
            return this;
        }

        public Builder setRestorePoints(List<RestorePointResponse> restorePoints) {
            this.restorePoints = Objects.requireNonNull(restorePoints);
            return this;
        }

        public Builder setSource(@Nullable RestorePointCollectionSourcePropertiesResponse source) {
            this.source = source;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetRestorePointCollectionResult build() {
            return new GetRestorePointCollectionResult(id, location, name, provisioningState, restorePointCollectionId, restorePoints, source, tags, type);
        }
    }
}
