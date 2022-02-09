// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AssetStreamingLocatorResponse {
    private final String assetName;
    private final String created;
    private final String defaultContentKeyPolicyName;
    private final String endTime;
    private final String name;
    private final String startTime;
    private final String streamingLocatorId;
    private final String streamingPolicyName;

    @OutputCustomType.Constructor({"assetName","created","defaultContentKeyPolicyName","endTime","name","startTime","streamingLocatorId","streamingPolicyName"})
    private AssetStreamingLocatorResponse(
        String assetName,
        String created,
        String defaultContentKeyPolicyName,
        String endTime,
        String name,
        String startTime,
        String streamingLocatorId,
        String streamingPolicyName) {
        this.assetName = Objects.requireNonNull(assetName);
        this.created = Objects.requireNonNull(created);
        this.defaultContentKeyPolicyName = Objects.requireNonNull(defaultContentKeyPolicyName);
        this.endTime = Objects.requireNonNull(endTime);
        this.name = Objects.requireNonNull(name);
        this.startTime = Objects.requireNonNull(startTime);
        this.streamingLocatorId = Objects.requireNonNull(streamingLocatorId);
        this.streamingPolicyName = Objects.requireNonNull(streamingPolicyName);
    }

    public String getAssetName() {
        return this.assetName;
    }
    public String getCreated() {
        return this.created;
    }
    public String getDefaultContentKeyPolicyName() {
        return this.defaultContentKeyPolicyName;
    }
    public String getEndTime() {
        return this.endTime;
    }
    public String getName() {
        return this.name;
    }
    public String getStartTime() {
        return this.startTime;
    }
    public String getStreamingLocatorId() {
        return this.streamingLocatorId;
    }
    public String getStreamingPolicyName() {
        return this.streamingPolicyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetStreamingLocatorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assetName;
        private String created;
        private String defaultContentKeyPolicyName;
        private String endTime;
        private String name;
        private String startTime;
        private String streamingLocatorId;
        private String streamingPolicyName;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetStreamingLocatorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetName = defaults.assetName;
    	      this.created = defaults.created;
    	      this.defaultContentKeyPolicyName = defaults.defaultContentKeyPolicyName;
    	      this.endTime = defaults.endTime;
    	      this.name = defaults.name;
    	      this.startTime = defaults.startTime;
    	      this.streamingLocatorId = defaults.streamingLocatorId;
    	      this.streamingPolicyName = defaults.streamingPolicyName;
        }

        public Builder setAssetName(String assetName) {
            this.assetName = Objects.requireNonNull(assetName);
            return this;
        }

        public Builder setCreated(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }

        public Builder setDefaultContentKeyPolicyName(String defaultContentKeyPolicyName) {
            this.defaultContentKeyPolicyName = Objects.requireNonNull(defaultContentKeyPolicyName);
            return this;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setStreamingLocatorId(String streamingLocatorId) {
            this.streamingLocatorId = Objects.requireNonNull(streamingLocatorId);
            return this;
        }

        public Builder setStreamingPolicyName(String streamingPolicyName) {
            this.streamingPolicyName = Objects.requireNonNull(streamingPolicyName);
            return this;
        }

        public AssetStreamingLocatorResponse build() {
            return new AssetStreamingLocatorResponse(assetName, created, defaultContentKeyPolicyName, endTime, name, startTime, streamingLocatorId, streamingPolicyName);
        }
    }
}