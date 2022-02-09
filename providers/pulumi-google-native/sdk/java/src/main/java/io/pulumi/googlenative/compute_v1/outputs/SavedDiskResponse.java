// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SavedDiskResponse {
    private final String kind;
    private final String sourceDisk;
    private final String storageBytes;
    private final String storageBytesStatus;

    @OutputCustomType.Constructor({"kind","sourceDisk","storageBytes","storageBytesStatus"})
    private SavedDiskResponse(
        String kind,
        String sourceDisk,
        String storageBytes,
        String storageBytesStatus) {
        this.kind = Objects.requireNonNull(kind);
        this.sourceDisk = Objects.requireNonNull(sourceDisk);
        this.storageBytes = Objects.requireNonNull(storageBytes);
        this.storageBytesStatus = Objects.requireNonNull(storageBytesStatus);
    }

    public String getKind() {
        return this.kind;
    }
    public String getSourceDisk() {
        return this.sourceDisk;
    }
    public String getStorageBytes() {
        return this.storageBytes;
    }
    public String getStorageBytesStatus() {
        return this.storageBytesStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SavedDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private String sourceDisk;
        private String storageBytes;
        private String storageBytesStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(SavedDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.sourceDisk = defaults.sourceDisk;
    	      this.storageBytes = defaults.storageBytes;
    	      this.storageBytesStatus = defaults.storageBytesStatus;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setSourceDisk(String sourceDisk) {
            this.sourceDisk = Objects.requireNonNull(sourceDisk);
            return this;
        }

        public Builder setStorageBytes(String storageBytes) {
            this.storageBytes = Objects.requireNonNull(storageBytes);
            return this;
        }

        public Builder setStorageBytesStatus(String storageBytesStatus) {
            this.storageBytesStatus = Objects.requireNonNull(storageBytesStatus);
            return this;
        }

        public SavedDiskResponse build() {
            return new SavedDiskResponse(kind, sourceDisk, storageBytes, storageBytesStatus);
        }
    }
}