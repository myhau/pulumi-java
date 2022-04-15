// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Filter details to transfer Azure Blobs
 * 
 */
public final class BlobFilterDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final BlobFilterDetailsResponse Empty = new BlobFilterDetailsResponse();

    /**
     * List of full path of the blobs to be transferred.
     * 
     */
    @Import(name="blobPathList")
      private final @Nullable List<String> blobPathList;

    public List<String> blobPathList() {
        return this.blobPathList == null ? List.of() : this.blobPathList;
    }

    /**
     * Prefix list of the Azure blobs to be transferred.
     * 
     */
    @Import(name="blobPrefixList")
      private final @Nullable List<String> blobPrefixList;

    public List<String> blobPrefixList() {
        return this.blobPrefixList == null ? List.of() : this.blobPrefixList;
    }

    /**
     * List of blob containers to be transferred.
     * 
     */
    @Import(name="containerList")
      private final @Nullable List<String> containerList;

    public List<String> containerList() {
        return this.containerList == null ? List.of() : this.containerList;
    }

    public BlobFilterDetailsResponse(
        @Nullable List<String> blobPathList,
        @Nullable List<String> blobPrefixList,
        @Nullable List<String> containerList) {
        this.blobPathList = blobPathList;
        this.blobPrefixList = blobPrefixList;
        this.containerList = containerList;
    }

    private BlobFilterDetailsResponse() {
        this.blobPathList = List.of();
        this.blobPrefixList = List.of();
        this.containerList = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobFilterDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> blobPathList;
        private @Nullable List<String> blobPrefixList;
        private @Nullable List<String> containerList;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobFilterDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobPathList = defaults.blobPathList;
    	      this.blobPrefixList = defaults.blobPrefixList;
    	      this.containerList = defaults.containerList;
        }

        public Builder blobPathList(@Nullable List<String> blobPathList) {
            this.blobPathList = blobPathList;
            return this;
        }
        public Builder blobPathList(String... blobPathList) {
            return blobPathList(List.of(blobPathList));
        }
        public Builder blobPrefixList(@Nullable List<String> blobPrefixList) {
            this.blobPrefixList = blobPrefixList;
            return this;
        }
        public Builder blobPrefixList(String... blobPrefixList) {
            return blobPrefixList(List.of(blobPrefixList));
        }
        public Builder containerList(@Nullable List<String> containerList) {
            this.containerList = containerList;
            return this;
        }
        public Builder containerList(String... containerList) {
            return containerList(List.of(containerList));
        }        public BlobFilterDetailsResponse build() {
            return new BlobFilterDetailsResponse(blobPathList, blobPrefixList, containerList);
        }
    }
}
