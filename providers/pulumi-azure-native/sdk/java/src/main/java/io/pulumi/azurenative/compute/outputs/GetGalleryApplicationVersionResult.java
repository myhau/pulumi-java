// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.GalleryApplicationVersionPublishingProfileResponse;
import io.pulumi.azurenative.compute.outputs.ReplicationStatusResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetGalleryApplicationVersionResult {
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
     * The provisioning state, which only appears in the response.
     * 
     */
    private final String provisioningState;
    /**
     * The publishing profile of a gallery image version.
     * 
     */
    private final GalleryApplicationVersionPublishingProfileResponse publishingProfile;
    /**
     * This is the replication status of the gallery image version.
     * 
     */
    private final ReplicationStatusResponse replicationStatus;
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

    @CustomType.Constructor
    private GetGalleryApplicationVersionResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("publishingProfile") GalleryApplicationVersionPublishingProfileResponse publishingProfile,
        @CustomType.Parameter("replicationStatus") ReplicationStatusResponse replicationStatus,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.publishingProfile = publishingProfile;
        this.replicationStatus = replicationStatus;
        this.tags = tags;
        this.type = type;
    }

    /**
     * Resource Id
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Resource location
     * 
    */
    public String location() {
        return this.location;
    }
    /**
     * Resource name
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The provisioning state, which only appears in the response.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * The publishing profile of a gallery image version.
     * 
    */
    public GalleryApplicationVersionPublishingProfileResponse publishingProfile() {
        return this.publishingProfile;
    }
    /**
     * This is the replication status of the gallery image version.
     * 
    */
    public ReplicationStatusResponse replicationStatus() {
        return this.replicationStatus;
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGalleryApplicationVersionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String location;
        private String name;
        private String provisioningState;
        private GalleryApplicationVersionPublishingProfileResponse publishingProfile;
        private ReplicationStatusResponse replicationStatus;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGalleryApplicationVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publishingProfile = defaults.publishingProfile;
    	      this.replicationStatus = defaults.replicationStatus;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
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
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder publishingProfile(GalleryApplicationVersionPublishingProfileResponse publishingProfile) {
            this.publishingProfile = Objects.requireNonNull(publishingProfile);
            return this;
        }
        public Builder replicationStatus(ReplicationStatusResponse replicationStatus) {
            this.replicationStatus = Objects.requireNonNull(replicationStatus);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetGalleryApplicationVersionResult build() {
            return new GetGalleryApplicationVersionResult(id, location, name, provisioningState, publishingProfile, replicationStatus, tags, type);
        }
    }
}
