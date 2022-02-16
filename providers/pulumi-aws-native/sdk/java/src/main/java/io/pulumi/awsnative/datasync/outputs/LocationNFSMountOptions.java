// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.outputs;

import io.pulumi.awsnative.datasync.enums.LocationNFSMountOptionsVersion;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LocationNFSMountOptions {
    private final @Nullable LocationNFSMountOptionsVersion version;

    @OutputCustomType.Constructor({"version"})
    private LocationNFSMountOptions(@Nullable LocationNFSMountOptionsVersion version) {
        this.version = version;
    }

    public Optional<LocationNFSMountOptionsVersion> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationNFSMountOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LocationNFSMountOptionsVersion version;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationNFSMountOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.version = defaults.version;
        }

        public Builder setVersion(@Nullable LocationNFSMountOptionsVersion version) {
            this.version = version;
            return this;
        }

        public LocationNFSMountOptions build() {
            return new LocationNFSMountOptions(version);
        }
    }
}