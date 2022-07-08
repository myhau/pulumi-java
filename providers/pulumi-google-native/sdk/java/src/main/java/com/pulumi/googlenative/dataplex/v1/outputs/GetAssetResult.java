// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dataplex.v1.outputs.GoogleCloudDataplexV1AssetDiscoverySpecResponse;
import com.pulumi.googlenative.dataplex.v1.outputs.GoogleCloudDataplexV1AssetDiscoveryStatusResponse;
import com.pulumi.googlenative.dataplex.v1.outputs.GoogleCloudDataplexV1AssetResourceSpecResponse;
import com.pulumi.googlenative.dataplex.v1.outputs.GoogleCloudDataplexV1AssetResourceStatusResponse;
import com.pulumi.googlenative.dataplex.v1.outputs.GoogleCloudDataplexV1AssetSecurityStatusResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetAssetResult {
    /**
     * @return The time when the asset was created.
     * 
     */
    private final String createTime;
    /**
     * @return Optional. Description of the asset.
     * 
     */
    private final String description;
    /**
     * @return Optional. Specification of the discovery feature applied to data referenced by this asset. When this spec is left unset, the asset will use the spec set on the parent zone.
     * 
     */
    private final GoogleCloudDataplexV1AssetDiscoverySpecResponse discoverySpec;
    /**
     * @return Status of the discovery feature applied to data referenced by this asset.
     * 
     */
    private final GoogleCloudDataplexV1AssetDiscoveryStatusResponse discoveryStatus;
    /**
     * @return Optional. User friendly display name.
     * 
     */
    private final String displayName;
    /**
     * @return Optional. User defined labels for the asset.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return The relative resource name of the asset, of the form: projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}/assets/{asset_id}.
     * 
     */
    private final String name;
    /**
     * @return Specification of the resource that is referenced by this asset.
     * 
     */
    private final GoogleCloudDataplexV1AssetResourceSpecResponse resourceSpec;
    /**
     * @return Status of the resource referenced by this asset.
     * 
     */
    private final GoogleCloudDataplexV1AssetResourceStatusResponse resourceStatus;
    /**
     * @return Status of the security policy applied to resource referenced by this asset.
     * 
     */
    private final GoogleCloudDataplexV1AssetSecurityStatusResponse securityStatus;
    /**
     * @return Current state of the asset.
     * 
     */
    private final String state;
    /**
     * @return System generated globally unique ID for the asset. This ID will be different if the asset is deleted and re-created with the same name.
     * 
     */
    private final String uid;
    /**
     * @return The time when the asset was last updated.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetAssetResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("discoverySpec") GoogleCloudDataplexV1AssetDiscoverySpecResponse discoverySpec,
        @CustomType.Parameter("discoveryStatus") GoogleCloudDataplexV1AssetDiscoveryStatusResponse discoveryStatus,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceSpec") GoogleCloudDataplexV1AssetResourceSpecResponse resourceSpec,
        @CustomType.Parameter("resourceStatus") GoogleCloudDataplexV1AssetResourceStatusResponse resourceStatus,
        @CustomType.Parameter("securityStatus") GoogleCloudDataplexV1AssetSecurityStatusResponse securityStatus,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("uid") String uid,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.description = description;
        this.discoverySpec = discoverySpec;
        this.discoveryStatus = discoveryStatus;
        this.displayName = displayName;
        this.labels = labels;
        this.name = name;
        this.resourceSpec = resourceSpec;
        this.resourceStatus = resourceStatus;
        this.securityStatus = securityStatus;
        this.state = state;
        this.uid = uid;
        this.updateTime = updateTime;
    }

    /**
     * @return The time when the asset was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Optional. Description of the asset.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Optional. Specification of the discovery feature applied to data referenced by this asset. When this spec is left unset, the asset will use the spec set on the parent zone.
     * 
     */
    public GoogleCloudDataplexV1AssetDiscoverySpecResponse discoverySpec() {
        return this.discoverySpec;
    }
    /**
     * @return Status of the discovery feature applied to data referenced by this asset.
     * 
     */
    public GoogleCloudDataplexV1AssetDiscoveryStatusResponse discoveryStatus() {
        return this.discoveryStatus;
    }
    /**
     * @return Optional. User friendly display name.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Optional. User defined labels for the asset.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return The relative resource name of the asset, of the form: projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}/assets/{asset_id}.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Specification of the resource that is referenced by this asset.
     * 
     */
    public GoogleCloudDataplexV1AssetResourceSpecResponse resourceSpec() {
        return this.resourceSpec;
    }
    /**
     * @return Status of the resource referenced by this asset.
     * 
     */
    public GoogleCloudDataplexV1AssetResourceStatusResponse resourceStatus() {
        return this.resourceStatus;
    }
    /**
     * @return Status of the security policy applied to resource referenced by this asset.
     * 
     */
    public GoogleCloudDataplexV1AssetSecurityStatusResponse securityStatus() {
        return this.securityStatus;
    }
    /**
     * @return Current state of the asset.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return System generated globally unique ID for the asset. This ID will be different if the asset is deleted and re-created with the same name.
     * 
     */
    public String uid() {
        return this.uid;
    }
    /**
     * @return The time when the asset was last updated.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAssetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private GoogleCloudDataplexV1AssetDiscoverySpecResponse discoverySpec;
        private GoogleCloudDataplexV1AssetDiscoveryStatusResponse discoveryStatus;
        private String displayName;
        private Map<String,String> labels;
        private String name;
        private GoogleCloudDataplexV1AssetResourceSpecResponse resourceSpec;
        private GoogleCloudDataplexV1AssetResourceStatusResponse resourceStatus;
        private GoogleCloudDataplexV1AssetSecurityStatusResponse securityStatus;
        private String state;
        private String uid;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAssetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.discoverySpec = defaults.discoverySpec;
    	      this.discoveryStatus = defaults.discoveryStatus;
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.resourceSpec = defaults.resourceSpec;
    	      this.resourceStatus = defaults.resourceStatus;
    	      this.securityStatus = defaults.securityStatus;
    	      this.state = defaults.state;
    	      this.uid = defaults.uid;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder discoverySpec(GoogleCloudDataplexV1AssetDiscoverySpecResponse discoverySpec) {
            this.discoverySpec = Objects.requireNonNull(discoverySpec);
            return this;
        }
        public Builder discoveryStatus(GoogleCloudDataplexV1AssetDiscoveryStatusResponse discoveryStatus) {
            this.discoveryStatus = Objects.requireNonNull(discoveryStatus);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceSpec(GoogleCloudDataplexV1AssetResourceSpecResponse resourceSpec) {
            this.resourceSpec = Objects.requireNonNull(resourceSpec);
            return this;
        }
        public Builder resourceStatus(GoogleCloudDataplexV1AssetResourceStatusResponse resourceStatus) {
            this.resourceStatus = Objects.requireNonNull(resourceStatus);
            return this;
        }
        public Builder securityStatus(GoogleCloudDataplexV1AssetSecurityStatusResponse securityStatus) {
            this.securityStatus = Objects.requireNonNull(securityStatus);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder uid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetAssetResult build() {
            return new GetAssetResult(createTime, description, discoverySpec, discoveryStatus, displayName, labels, name, resourceSpec, resourceStatus, securityStatus, state, uid, updateTime);
        }
    }
}
