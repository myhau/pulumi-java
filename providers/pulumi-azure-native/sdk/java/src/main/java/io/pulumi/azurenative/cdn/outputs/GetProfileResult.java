// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.SkuResponse;
import io.pulumi.azurenative.cdn.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetProfileResult {
    /**
     * The Id of the frontdoor.
     * 
     */
    private final String frontdoorId;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource location.
     * 
     */
    private final String location;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Provisioning status of the profile.
     * 
     */
    private final String provisioningState;
    /**
     * Resource status of the profile.
     * 
     */
    private final String resourceState;
    /**
     * The pricing tier (defines a CDN provider, feature list and rate) of the CDN profile.
     * 
     */
    private final SkuResponse sku;
    /**
     * Read only system data
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"frontdoorId","id","location","name","provisioningState","resourceState","sku","systemData","tags","type"})
    private GetProfileResult(
        String frontdoorId,
        String id,
        String location,
        String name,
        String provisioningState,
        String resourceState,
        SkuResponse sku,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        String type) {
        this.frontdoorId = frontdoorId;
        this.id = id;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.resourceState = resourceState;
        this.sku = sku;
        this.systemData = systemData;
        this.tags = tags;
        this.type = type;
    }

    /**
     * The Id of the frontdoor.
     * 
    */
    public String getFrontdoorId() {
        return this.frontdoorId;
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource location.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Provisioning status of the profile.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource status of the profile.
     * 
    */
    public String getResourceState() {
        return this.resourceState;
    }
    /**
     * The pricing tier (defines a CDN provider, feature list and rate) of the CDN profile.
     * 
    */
    public SkuResponse getSku() {
        return this.sku;
    }
    /**
     * Read only system data
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProfileResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String frontdoorId;
        private String id;
        private String location;
        private String name;
        private String provisioningState;
        private String resourceState;
        private SkuResponse sku;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProfileResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frontdoorId = defaults.frontdoorId;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceState = defaults.resourceState;
    	      this.sku = defaults.sku;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setFrontdoorId(String frontdoorId) {
            this.frontdoorId = Objects.requireNonNull(frontdoorId);
            return this;
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

        public Builder setResourceState(String resourceState) {
            this.resourceState = Objects.requireNonNull(resourceState);
            return this;
        }

        public Builder setSku(SkuResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
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
        public GetProfileResult build() {
            return new GetProfileResult(frontdoorId, id, location, name, provisioningState, resourceState, sku, systemData, tags, type);
        }
    }
}
