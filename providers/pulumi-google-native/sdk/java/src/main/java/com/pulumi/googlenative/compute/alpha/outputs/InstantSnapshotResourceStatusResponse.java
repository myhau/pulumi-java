// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InstantSnapshotResourceStatusResponse {
    /**
     * @return The storage size of this instant snapshot.
     * 
     */
    private final String storageSizeBytes;

    @CustomType.Constructor
    private InstantSnapshotResourceStatusResponse(@CustomType.Parameter("storageSizeBytes") String storageSizeBytes) {
        this.storageSizeBytes = storageSizeBytes;
    }

    /**
     * @return The storage size of this instant snapshot.
     * 
     */
    public String storageSizeBytes() {
        return this.storageSizeBytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstantSnapshotResourceStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String storageSizeBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(InstantSnapshotResourceStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.storageSizeBytes = defaults.storageSizeBytes;
        }

        public Builder storageSizeBytes(String storageSizeBytes) {
            this.storageSizeBytes = Objects.requireNonNull(storageSizeBytes);
            return this;
        }        public InstantSnapshotResourceStatusResponse build() {
            return new InstantSnapshotResourceStatusResponse(storageSizeBytes);
        }
    }
}
