// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ebs.inputs;

import io.pulumi.aws.ebs.inputs.SnapshotImportDiskContainerUserBucketArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SnapshotImportDiskContainerArgs extends io.pulumi.resources.ResourceArgs {

    public static final SnapshotImportDiskContainerArgs Empty = new SnapshotImportDiskContainerArgs();

    /**
     * The description of the disk image being imported.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The format of the disk image being imported. One of `VHD` or `VMDK`.
     * 
     */
    @InputImport(name="format", required=true)
      private final Input<String> format;

    public Input<String> getFormat() {
        return this.format;
    }

    /**
     * The URL to the Amazon S3-based disk image being imported. It can either be a https URL (https://..) or an Amazon S3 URL (s3://..). One of `url` or `user_bucket` must be set.
     * 
     */
    @InputImport(name="url")
      private final @Nullable Input<String> url;

    public Input<String> getUrl() {
        return this.url == null ? Input.empty() : this.url;
    }

    /**
     * The Amazon S3 bucket for the disk image. One of `url` or `user_bucket` must be set. Detailed below.
     * 
     */
    @InputImport(name="userBucket")
      private final @Nullable Input<SnapshotImportDiskContainerUserBucketArgs> userBucket;

    public Input<SnapshotImportDiskContainerUserBucketArgs> getUserBucket() {
        return this.userBucket == null ? Input.empty() : this.userBucket;
    }

    public SnapshotImportDiskContainerArgs(
        @Nullable Input<String> description,
        Input<String> format,
        @Nullable Input<String> url,
        @Nullable Input<SnapshotImportDiskContainerUserBucketArgs> userBucket) {
        this.description = description;
        this.format = Objects.requireNonNull(format, "expected parameter 'format' to be non-null");
        this.url = url;
        this.userBucket = userBucket;
    }

    private SnapshotImportDiskContainerArgs() {
        this.description = Input.empty();
        this.format = Input.empty();
        this.url = Input.empty();
        this.userBucket = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotImportDiskContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> format;
        private @Nullable Input<String> url;
        private @Nullable Input<SnapshotImportDiskContainerUserBucketArgs> userBucket;

        public Builder() {
    	      // Empty
        }

        public Builder(SnapshotImportDiskContainerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.format = defaults.format;
    	      this.url = defaults.url;
    	      this.userBucket = defaults.userBucket;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setFormat(Input<String> format) {
            this.format = Objects.requireNonNull(format);
            return this;
        }

        public Builder setFormat(String format) {
            this.format = Input.of(Objects.requireNonNull(format));
            return this;
        }

        public Builder setUrl(@Nullable Input<String> url) {
            this.url = url;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = Input.ofNullable(url);
            return this;
        }

        public Builder setUserBucket(@Nullable Input<SnapshotImportDiskContainerUserBucketArgs> userBucket) {
            this.userBucket = userBucket;
            return this;
        }

        public Builder setUserBucket(@Nullable SnapshotImportDiskContainerUserBucketArgs userBucket) {
            this.userBucket = Input.ofNullable(userBucket);
            return this;
        }
        public SnapshotImportDiskContainerArgs build() {
            return new SnapshotImportDiskContainerArgs(description, format, url, userBucket);
        }
    }
}
