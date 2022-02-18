// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.RegionPerInstanceConfigPreservedStateDisk;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class RegionPerInstanceConfigPreservedState {
    /**
     * Stateful disks for the instance.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<RegionPerInstanceConfigPreservedStateDisk> disks;
    /**
     * Preserved metadata defined for this instance. This is a list of key->value pairs.
     * 
     */
    private final @Nullable Map<String,String> metadata;

    @OutputCustomType.Constructor({"disks","metadata"})
    private RegionPerInstanceConfigPreservedState(
        @Nullable List<RegionPerInstanceConfigPreservedStateDisk> disks,
        @Nullable Map<String,String> metadata) {
        this.disks = disks;
        this.metadata = metadata;
    }

    /**
     * Stateful disks for the instance.
     * Structure is documented below.
     * 
     */
    public List<RegionPerInstanceConfigPreservedStateDisk> getDisks() {
        return this.disks == null ? List.of() : this.disks;
    }
    /**
     * Preserved metadata defined for this instance. This is a list of key->value pairs.
     * 
     */
    public Map<String,String> getMetadata() {
        return this.metadata == null ? Map.of() : this.metadata;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionPerInstanceConfigPreservedState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<RegionPerInstanceConfigPreservedStateDisk> disks;
        private @Nullable Map<String,String> metadata;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionPerInstanceConfigPreservedState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disks = defaults.disks;
    	      this.metadata = defaults.metadata;
        }

        public Builder setDisks(@Nullable List<RegionPerInstanceConfigPreservedStateDisk> disks) {
            this.disks = disks;
            return this;
        }

        public Builder setMetadata(@Nullable Map<String,String> metadata) {
            this.metadata = metadata;
            return this;
        }

        public RegionPerInstanceConfigPreservedState build() {
            return new RegionPerInstanceConfigPreservedState(disks, metadata);
        }
    }
}
