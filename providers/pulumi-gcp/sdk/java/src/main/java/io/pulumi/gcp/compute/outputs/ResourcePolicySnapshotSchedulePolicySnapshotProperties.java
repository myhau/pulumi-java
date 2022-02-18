// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResourcePolicySnapshotSchedulePolicySnapshotProperties {
    /**
     * Whether to perform a 'guest aware' snapshot.
     * 
     */
    private final @Nullable Boolean guestFlush;
    /**
     * A set of key-value pairs.
     * 
     */
    private final @Nullable Map<String,String> labels;
    /**
     * Cloud Storage bucket location to store the auto snapshot
     * (regional or multi-regional)
     * 
     */
    private final @Nullable String storageLocations;

    @OutputCustomType.Constructor({"guestFlush","labels","storageLocations"})
    private ResourcePolicySnapshotSchedulePolicySnapshotProperties(
        @Nullable Boolean guestFlush,
        @Nullable Map<String,String> labels,
        @Nullable String storageLocations) {
        this.guestFlush = guestFlush;
        this.labels = labels;
        this.storageLocations = storageLocations;
    }

    /**
     * Whether to perform a 'guest aware' snapshot.
     * 
     */
    public Optional<Boolean> getGuestFlush() {
        return Optional.ofNullable(this.guestFlush);
    }
    /**
     * A set of key-value pairs.
     * 
     */
    public Map<String,String> getLabels() {
        return this.labels == null ? Map.of() : this.labels;
    }
    /**
     * Cloud Storage bucket location to store the auto snapshot
     * (regional or multi-regional)
     * 
     */
    public Optional<String> getStorageLocations() {
        return Optional.ofNullable(this.storageLocations);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicySnapshotSchedulePolicySnapshotProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean guestFlush;
        private @Nullable Map<String,String> labels;
        private @Nullable String storageLocations;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicySnapshotSchedulePolicySnapshotProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.guestFlush = defaults.guestFlush;
    	      this.labels = defaults.labels;
    	      this.storageLocations = defaults.storageLocations;
        }

        public Builder setGuestFlush(@Nullable Boolean guestFlush) {
            this.guestFlush = guestFlush;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setStorageLocations(@Nullable String storageLocations) {
            this.storageLocations = storageLocations;
            return this;
        }

        public ResourcePolicySnapshotSchedulePolicySnapshotProperties build() {
            return new ResourcePolicySnapshotSchedulePolicySnapshotProperties(guestFlush, labels, storageLocations);
        }
    }
}
