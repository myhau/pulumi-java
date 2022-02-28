// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elastictranscoder;

import io.pulumi.aws.elastictranscoder.inputs.PipelineContentConfigArgs;
import io.pulumi.aws.elastictranscoder.inputs.PipelineContentConfigPermissionArgs;
import io.pulumi.aws.elastictranscoder.inputs.PipelineNotificationsArgs;
import io.pulumi.aws.elastictranscoder.inputs.PipelineThumbnailConfigArgs;
import io.pulumi.aws.elastictranscoder.inputs.PipelineThumbnailConfigPermissionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineArgs Empty = new PipelineArgs();

    /**
     * The AWS Key Management Service (AWS KMS) key that you want to use with this pipeline.
     * 
     */
    @InputImport(name="awsKmsKeyArn")
      private final @Nullable Input<String> awsKmsKeyArn;

    public Input<String> getAwsKmsKeyArn() {
        return this.awsKmsKeyArn == null ? Input.empty() : this.awsKmsKeyArn;
    }

    /**
     * The ContentConfig object specifies information about the Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and playlists. (documented below)
     * 
     */
    @InputImport(name="contentConfig")
      private final @Nullable Input<PipelineContentConfigArgs> contentConfig;

    public Input<PipelineContentConfigArgs> getContentConfig() {
        return this.contentConfig == null ? Input.empty() : this.contentConfig;
    }

    /**
     * The permissions for the `content_config` object. (documented below)
     * 
     */
    @InputImport(name="contentConfigPermissions")
      private final @Nullable Input<List<PipelineContentConfigPermissionArgs>> contentConfigPermissions;

    public Input<List<PipelineContentConfigPermissionArgs>> getContentConfigPermissions() {
        return this.contentConfigPermissions == null ? Input.empty() : this.contentConfigPermissions;
    }

    /**
     * The Amazon S3 bucket in which you saved the media files that you want to transcode and the graphics that you want to use as watermarks.
     * 
     */
    @InputImport(name="inputBucket", required=true)
      private final Input<String> inputBucket;

    public Input<String> getInputBucket() {
        return this.inputBucket;
    }

    /**
     * The name of the pipeline. Maximum 40 characters
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify to report job status. (documented below)
     * 
     */
    @InputImport(name="notifications")
      private final @Nullable Input<PipelineNotificationsArgs> notifications;

    public Input<PipelineNotificationsArgs> getNotifications() {
        return this.notifications == null ? Input.empty() : this.notifications;
    }

    /**
     * The Amazon S3 bucket in which you want Elastic Transcoder to save the transcoded files.
     * 
     */
    @InputImport(name="outputBucket")
      private final @Nullable Input<String> outputBucket;

    public Input<String> getOutputBucket() {
        return this.outputBucket == null ? Input.empty() : this.outputBucket;
    }

    /**
     * The IAM Amazon Resource Name (ARN) for the role that you want Elastic Transcoder to use to transcode jobs for this pipeline.
     * 
     */
    @InputImport(name="role", required=true)
      private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    /**
     * The ThumbnailConfig object specifies information about the Amazon S3 bucket in which you want Elastic Transcoder to save thumbnail files. (documented below)
     * 
     */
    @InputImport(name="thumbnailConfig")
      private final @Nullable Input<PipelineThumbnailConfigArgs> thumbnailConfig;

    public Input<PipelineThumbnailConfigArgs> getThumbnailConfig() {
        return this.thumbnailConfig == null ? Input.empty() : this.thumbnailConfig;
    }

    /**
     * The permissions for the `thumbnail_config` object. (documented below)
     * 
     */
    @InputImport(name="thumbnailConfigPermissions")
      private final @Nullable Input<List<PipelineThumbnailConfigPermissionArgs>> thumbnailConfigPermissions;

    public Input<List<PipelineThumbnailConfigPermissionArgs>> getThumbnailConfigPermissions() {
        return this.thumbnailConfigPermissions == null ? Input.empty() : this.thumbnailConfigPermissions;
    }

    public PipelineArgs(
        @Nullable Input<String> awsKmsKeyArn,
        @Nullable Input<PipelineContentConfigArgs> contentConfig,
        @Nullable Input<List<PipelineContentConfigPermissionArgs>> contentConfigPermissions,
        Input<String> inputBucket,
        @Nullable Input<String> name,
        @Nullable Input<PipelineNotificationsArgs> notifications,
        @Nullable Input<String> outputBucket,
        Input<String> role,
        @Nullable Input<PipelineThumbnailConfigArgs> thumbnailConfig,
        @Nullable Input<List<PipelineThumbnailConfigPermissionArgs>> thumbnailConfigPermissions) {
        this.awsKmsKeyArn = awsKmsKeyArn;
        this.contentConfig = contentConfig;
        this.contentConfigPermissions = contentConfigPermissions;
        this.inputBucket = Objects.requireNonNull(inputBucket, "expected parameter 'inputBucket' to be non-null");
        this.name = name;
        this.notifications = notifications;
        this.outputBucket = outputBucket;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.thumbnailConfig = thumbnailConfig;
        this.thumbnailConfigPermissions = thumbnailConfigPermissions;
    }

    private PipelineArgs() {
        this.awsKmsKeyArn = Input.empty();
        this.contentConfig = Input.empty();
        this.contentConfigPermissions = Input.empty();
        this.inputBucket = Input.empty();
        this.name = Input.empty();
        this.notifications = Input.empty();
        this.outputBucket = Input.empty();
        this.role = Input.empty();
        this.thumbnailConfig = Input.empty();
        this.thumbnailConfigPermissions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> awsKmsKeyArn;
        private @Nullable Input<PipelineContentConfigArgs> contentConfig;
        private @Nullable Input<List<PipelineContentConfigPermissionArgs>> contentConfigPermissions;
        private Input<String> inputBucket;
        private @Nullable Input<String> name;
        private @Nullable Input<PipelineNotificationsArgs> notifications;
        private @Nullable Input<String> outputBucket;
        private Input<String> role;
        private @Nullable Input<PipelineThumbnailConfigArgs> thumbnailConfig;
        private @Nullable Input<List<PipelineThumbnailConfigPermissionArgs>> thumbnailConfigPermissions;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsKmsKeyArn = defaults.awsKmsKeyArn;
    	      this.contentConfig = defaults.contentConfig;
    	      this.contentConfigPermissions = defaults.contentConfigPermissions;
    	      this.inputBucket = defaults.inputBucket;
    	      this.name = defaults.name;
    	      this.notifications = defaults.notifications;
    	      this.outputBucket = defaults.outputBucket;
    	      this.role = defaults.role;
    	      this.thumbnailConfig = defaults.thumbnailConfig;
    	      this.thumbnailConfigPermissions = defaults.thumbnailConfigPermissions;
        }

        public Builder setAwsKmsKeyArn(@Nullable Input<String> awsKmsKeyArn) {
            this.awsKmsKeyArn = awsKmsKeyArn;
            return this;
        }

        public Builder setAwsKmsKeyArn(@Nullable String awsKmsKeyArn) {
            this.awsKmsKeyArn = Input.ofNullable(awsKmsKeyArn);
            return this;
        }

        public Builder setContentConfig(@Nullable Input<PipelineContentConfigArgs> contentConfig) {
            this.contentConfig = contentConfig;
            return this;
        }

        public Builder setContentConfig(@Nullable PipelineContentConfigArgs contentConfig) {
            this.contentConfig = Input.ofNullable(contentConfig);
            return this;
        }

        public Builder setContentConfigPermissions(@Nullable Input<List<PipelineContentConfigPermissionArgs>> contentConfigPermissions) {
            this.contentConfigPermissions = contentConfigPermissions;
            return this;
        }

        public Builder setContentConfigPermissions(@Nullable List<PipelineContentConfigPermissionArgs> contentConfigPermissions) {
            this.contentConfigPermissions = Input.ofNullable(contentConfigPermissions);
            return this;
        }

        public Builder setInputBucket(Input<String> inputBucket) {
            this.inputBucket = Objects.requireNonNull(inputBucket);
            return this;
        }

        public Builder setInputBucket(String inputBucket) {
            this.inputBucket = Input.of(Objects.requireNonNull(inputBucket));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNotifications(@Nullable Input<PipelineNotificationsArgs> notifications) {
            this.notifications = notifications;
            return this;
        }

        public Builder setNotifications(@Nullable PipelineNotificationsArgs notifications) {
            this.notifications = Input.ofNullable(notifications);
            return this;
        }

        public Builder setOutputBucket(@Nullable Input<String> outputBucket) {
            this.outputBucket = outputBucket;
            return this;
        }

        public Builder setOutputBucket(@Nullable String outputBucket) {
            this.outputBucket = Input.ofNullable(outputBucket);
            return this;
        }

        public Builder setRole(Input<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder setRole(String role) {
            this.role = Input.of(Objects.requireNonNull(role));
            return this;
        }

        public Builder setThumbnailConfig(@Nullable Input<PipelineThumbnailConfigArgs> thumbnailConfig) {
            this.thumbnailConfig = thumbnailConfig;
            return this;
        }

        public Builder setThumbnailConfig(@Nullable PipelineThumbnailConfigArgs thumbnailConfig) {
            this.thumbnailConfig = Input.ofNullable(thumbnailConfig);
            return this;
        }

        public Builder setThumbnailConfigPermissions(@Nullable Input<List<PipelineThumbnailConfigPermissionArgs>> thumbnailConfigPermissions) {
            this.thumbnailConfigPermissions = thumbnailConfigPermissions;
            return this;
        }

        public Builder setThumbnailConfigPermissions(@Nullable List<PipelineThumbnailConfigPermissionArgs> thumbnailConfigPermissions) {
            this.thumbnailConfigPermissions = Input.ofNullable(thumbnailConfigPermissions);
            return this;
        }
        public PipelineArgs build() {
            return new PipelineArgs(awsKmsKeyArn, contentConfig, contentConfigPermissions, inputBucket, name, notifications, outputBucket, role, thumbnailConfig, thumbnailConfigPermissions);
        }
    }
}
