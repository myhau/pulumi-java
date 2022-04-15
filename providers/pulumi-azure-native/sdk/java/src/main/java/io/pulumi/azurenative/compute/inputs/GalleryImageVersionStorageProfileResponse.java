// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.GalleryArtifactVersionSourceResponse;
import io.pulumi.azurenative.compute.inputs.GalleryDataDiskImageResponse;
import io.pulumi.azurenative.compute.inputs.GalleryOSDiskImageResponse;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * This is the storage profile of a Gallery Image Version.
 * 
 */
public final class GalleryImageVersionStorageProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final GalleryImageVersionStorageProfileResponse Empty = new GalleryImageVersionStorageProfileResponse();

    /**
     * A list of data disk images.
     * 
     */
    @Import(name="dataDiskImages")
      private final @Nullable List<GalleryDataDiskImageResponse> dataDiskImages;

    public List<GalleryDataDiskImageResponse> dataDiskImages() {
        return this.dataDiskImages == null ? List.of() : this.dataDiskImages;
    }

    /**
     * This is the OS disk image.
     * 
     */
    @Import(name="osDiskImage")
      private final @Nullable GalleryOSDiskImageResponse osDiskImage;

    public Optional<GalleryOSDiskImageResponse> osDiskImage() {
        return this.osDiskImage == null ? Optional.empty() : Optional.ofNullable(this.osDiskImage);
    }

    /**
     * The gallery artifact version source.
     * 
     */
    @Import(name="source")
      private final @Nullable GalleryArtifactVersionSourceResponse source;

    public Optional<GalleryArtifactVersionSourceResponse> source() {
        return this.source == null ? Optional.empty() : Optional.ofNullable(this.source);
    }

    public GalleryImageVersionStorageProfileResponse(
        @Nullable List<GalleryDataDiskImageResponse> dataDiskImages,
        @Nullable GalleryOSDiskImageResponse osDiskImage,
        @Nullable GalleryArtifactVersionSourceResponse source) {
        this.dataDiskImages = dataDiskImages;
        this.osDiskImage = osDiskImage;
        this.source = source;
    }

    private GalleryImageVersionStorageProfileResponse() {
        this.dataDiskImages = List.of();
        this.osDiskImage = null;
        this.source = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GalleryImageVersionStorageProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GalleryDataDiskImageResponse> dataDiskImages;
        private @Nullable GalleryOSDiskImageResponse osDiskImage;
        private @Nullable GalleryArtifactVersionSourceResponse source;

        public Builder() {
    	      // Empty
        }

        public Builder(GalleryImageVersionStorageProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataDiskImages = defaults.dataDiskImages;
    	      this.osDiskImage = defaults.osDiskImage;
    	      this.source = defaults.source;
        }

        public Builder dataDiskImages(@Nullable List<GalleryDataDiskImageResponse> dataDiskImages) {
            this.dataDiskImages = dataDiskImages;
            return this;
        }
        public Builder dataDiskImages(GalleryDataDiskImageResponse... dataDiskImages) {
            return dataDiskImages(List.of(dataDiskImages));
        }
        public Builder osDiskImage(@Nullable GalleryOSDiskImageResponse osDiskImage) {
            this.osDiskImage = osDiskImage;
            return this;
        }
        public Builder source(@Nullable GalleryArtifactVersionSourceResponse source) {
            this.source = source;
            return this;
        }        public GalleryImageVersionStorageProfileResponse build() {
            return new GalleryImageVersionStorageProfileResponse(dataDiskImages, osDiskImage, source);
        }
    }
}
