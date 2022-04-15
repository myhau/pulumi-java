// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork.inputs;

import io.pulumi.azurenative.hybridnetwork.inputs.DataDiskResponse;
import io.pulumi.azurenative.hybridnetwork.inputs.ImageReferenceResponse;
import io.pulumi.azurenative.hybridnetwork.inputs.OsDiskResponse;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the storage settings for the virtual machine disks.
 * 
 */
public final class StorageProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final StorageProfileResponse Empty = new StorageProfileResponse();

    /**
     * Specifies the parameters that are used to add a data disk to a virtual machine.
     * 
     */
    @Import(name="dataDisks")
      private final @Nullable List<DataDiskResponse> dataDisks;

    public List<DataDiskResponse> dataDisks() {
        return this.dataDisks == null ? List.of() : this.dataDisks;
    }

    /**
     * The image reference properties.
     * 
     */
    @Import(name="imageReference")
      private final @Nullable ImageReferenceResponse imageReference;

    public Optional<ImageReferenceResponse> imageReference() {
        return this.imageReference == null ? Optional.empty() : Optional.ofNullable(this.imageReference);
    }

    /**
     * Specifies information about the operating system disk used by the virtual machine.
     * 
     */
    @Import(name="osDisk")
      private final @Nullable OsDiskResponse osDisk;

    public Optional<OsDiskResponse> osDisk() {
        return this.osDisk == null ? Optional.empty() : Optional.ofNullable(this.osDisk);
    }

    public StorageProfileResponse(
        @Nullable List<DataDiskResponse> dataDisks,
        @Nullable ImageReferenceResponse imageReference,
        @Nullable OsDiskResponse osDisk) {
        this.dataDisks = dataDisks;
        this.imageReference = imageReference;
        this.osDisk = osDisk;
    }

    private StorageProfileResponse() {
        this.dataDisks = List.of();
        this.imageReference = null;
        this.osDisk = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DataDiskResponse> dataDisks;
        private @Nullable ImageReferenceResponse imageReference;
        private @Nullable OsDiskResponse osDisk;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataDisks = defaults.dataDisks;
    	      this.imageReference = defaults.imageReference;
    	      this.osDisk = defaults.osDisk;
        }

        public Builder dataDisks(@Nullable List<DataDiskResponse> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public Builder dataDisks(DataDiskResponse... dataDisks) {
            return dataDisks(List.of(dataDisks));
        }
        public Builder imageReference(@Nullable ImageReferenceResponse imageReference) {
            this.imageReference = imageReference;
            return this;
        }
        public Builder osDisk(@Nullable OsDiskResponse osDisk) {
            this.osDisk = osDisk;
            return this;
        }        public StorageProfileResponse build() {
            return new StorageProfileResponse(dataDisks, imageReference, osDisk);
        }
    }
}
