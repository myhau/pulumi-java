// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elastictranscoder.inputs;

import io.pulumi.aws.elastictranscoder.inputs.PipelineContentConfigGetArgs;
import io.pulumi.aws.elastictranscoder.inputs.PipelineContentConfigPermissionGetArgs;
import io.pulumi.aws.elastictranscoder.inputs.PipelineNotificationsGetArgs;
import io.pulumi.aws.elastictranscoder.inputs.PipelineThumbnailConfigGetArgs;
import io.pulumi.aws.elastictranscoder.inputs.PipelineThumbnailConfigPermissionGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineState extends io.pulumi.resources.ResourceArgs {

    public static final PipelineState Empty = new PipelineState();

    /**
     * The ARN of the Elastictranscoder pipeline.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

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
      private final @Nullable Input<PipelineContentConfigGetArgs> contentConfig;

    public Input<PipelineContentConfigGetArgs> getContentConfig() {
        return this.contentConfig == null ? Input.empty() : this.contentConfig;
    }

    /**
     * The permissions for the `content_config` object. (documented below)
     * 
     */
    @InputImport(name="contentConfigPermissions")
      private final @Nullable Input<List<PipelineContentConfigPermissionGetArgs>> contentConfigPermissions;

    public Input<List<PipelineContentConfigPermissionGetArgs>> getContentConfigPermissions() {
        return this.contentConfigPermissions == null ? Input.empty() : this.contentConfigPermissions;
    }

    /**
     * The Amazon S3 bucket in which you saved the media files that you want to transcode and the graphics that you want to use as watermarks.
     * 
     */
    @InputImport(name="inputBucket")
      private final @Nullable Input<String> inputBucket;

    public Input<String> getInputBucket() {
        return this.inputBucket == null ? Input.empty() : this.inputBucket;
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
      private final @Nullable Input<PipelineNotificationsGetArgs> notifications;

    public Input<PipelineNotificationsGetArgs> getNotifications() {
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
    @InputImport(name="role")
      private final @Nullable Input<String> role;

    public Input<String> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    /**
     * The ThumbnailConfig object specifies information about the Amazon S3 bucket in which you want Elastic Transcoder to save thumbnail files. (documented below)
     * 
     */
    @InputImport(name="thumbnailConfig")
      private final @Nullable Input<PipelineThumbnailConfigGetArgs> thumbnailConfig;

    public Input<PipelineThumbnailConfigGetArgs> getThumbnailConfig() {
        return this.thumbnailConfig == null ? Input.empty() : this.thumbnailConfig;
    }

    /**
     * The permissions for the `thumbnail_config` object. (documented below)
     * 
     */
    @InputImport(name="thumbnailConfigPermissions")
      private final @Nullable Input<List<PipelineThumbnailConfigPermissionGetArgs>> thumbnailConfigPermissions;

    public Input<List<PipelineThumbnailConfigPermissionGetArgs>> getThumbnailConfigPermissions() {
        return this.thumbnailConfigPermissions == null ? Input.empty() : this.thumbnailConfigPermissions;
    }

    public PipelineState(
        @Nullable Input<String> arn,
        @Nullable Input<String> awsKmsKeyArn,
        @Nullable Input<PipelineContentConfigGetArgs> contentConfig,
        @Nullable Input<List<PipelineContentConfigPermissionGetArgs>> contentConfigPermissions,
        @Nullable Input<String> inputBucket,
        @Nullable Input<String> name,
        @Nullable Input<PipelineNotificationsGetArgs> notifications,
        @Nullable Input<String> outputBucket,
        @Nullable Input<String> role,
        @Nullable Input<PipelineThumbnailConfigGetArgs> thumbnailConfig,
        @Nullable Input<List<PipelineThumbnailConfigPermissionGetArgs>> thumbnailConfigPermissions) {
        this.arn = arn;
        this.awsKmsKeyArn = awsKmsKeyArn;
        this.contentConfig = contentConfig;
        this.contentConfigPermissions = contentConfigPermissions;
        this.inputBucket = inputBucket;
        this.name = name;
        this.notifications = notifications;
        this.outputBucket = outputBucket;
        this.role = role;
        this.thumbnailConfig = thumbnailConfig;
        this.thumbnailConfigPermissions = thumbnailConfigPermissions;
    }

    private PipelineState() {
        this.arn = Input.empty();
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

    public static Builder builder(PipelineState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> awsKmsKeyArn;
        private @Nullable Input<PipelineContentConfigGetArgs> contentConfig;
        private @Nullable Input<List<PipelineContentConfigPermissionGetArgs>> contentConfigPermissions;
        private @Nullable Input<String> inputBucket;
        private @Nullable Input<String> name;
        private @Nullable Input<PipelineNotificationsGetArgs> notifications;
        private @Nullable Input<String> outputBucket;
        private @Nullable Input<String> role;
        private @Nullable Input<PipelineThumbnailConfigGetArgs> thumbnailConfig;
        private @Nullable Input<List<PipelineThumbnailConfigPermissionGetArgs>> thumbnailConfigPermissions;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
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

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setAwsKmsKeyArn(@Nullable Input<String> awsKmsKeyArn) {
            this.awsKmsKeyArn = awsKmsKeyArn;
            return this;
        }

        public Builder setAwsKmsKeyArn(@Nullable String awsKmsKeyArn) {
            this.awsKmsKeyArn = Input.ofNullable(awsKmsKeyArn);
            return this;
        }

        public Builder setContentConfig(@Nullable Input<PipelineContentConfigGetArgs> contentConfig) {
            this.contentConfig = contentConfig;
            return this;
        }

        public Builder setContentConfig(@Nullable PipelineContentConfigGetArgs contentConfig) {
            this.contentConfig = Input.ofNullable(contentConfig);
            return this;
        }

        public Builder setContentConfigPermissions(@Nullable Input<List<PipelineContentConfigPermissionGetArgs>> contentConfigPermissions) {
            this.contentConfigPermissions = contentConfigPermissions;
            return this;
        }

        public Builder setContentConfigPermissions(@Nullable List<PipelineContentConfigPermissionGetArgs> contentConfigPermissions) {
            this.contentConfigPermissions = Input.ofNullable(contentConfigPermissions);
            return this;
        }

        public Builder setInputBucket(@Nullable Input<String> inputBucket) {
            this.inputBucket = inputBucket;
            return this;
        }

        public Builder setInputBucket(@Nullable String inputBucket) {
            this.inputBucket = Input.ofNullable(inputBucket);
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

        public Builder setNotifications(@Nullable Input<PipelineNotificationsGetArgs> notifications) {
            this.notifications = notifications;
            return this;
        }

        public Builder setNotifications(@Nullable PipelineNotificationsGetArgs notifications) {
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

        public Builder setRole(@Nullable Input<String> role) {
            this.role = role;
            return this;
        }

        public Builder setRole(@Nullable String role) {
            this.role = Input.ofNullable(role);
            return this;
        }

        public Builder setThumbnailConfig(@Nullable Input<PipelineThumbnailConfigGetArgs> thumbnailConfig) {
            this.thumbnailConfig = thumbnailConfig;
            return this;
        }

        public Builder setThumbnailConfig(@Nullable PipelineThumbnailConfigGetArgs thumbnailConfig) {
            this.thumbnailConfig = Input.ofNullable(thumbnailConfig);
            return this;
        }

        public Builder setThumbnailConfigPermissions(@Nullable Input<List<PipelineThumbnailConfigPermissionGetArgs>> thumbnailConfigPermissions) {
            this.thumbnailConfigPermissions = thumbnailConfigPermissions;
            return this;
        }

        public Builder setThumbnailConfigPermissions(@Nullable List<PipelineThumbnailConfigPermissionGetArgs> thumbnailConfigPermissions) {
            this.thumbnailConfigPermissions = Input.ofNullable(thumbnailConfigPermissions);
            return this;
        }
        public PipelineState build() {
            return new PipelineState(arn, awsKmsKeyArn, contentConfig, contentConfigPermissions, inputBucket, name, notifications, outputBucket, role, thumbnailConfig, thumbnailConfigPermissions);
        }
    }
}
