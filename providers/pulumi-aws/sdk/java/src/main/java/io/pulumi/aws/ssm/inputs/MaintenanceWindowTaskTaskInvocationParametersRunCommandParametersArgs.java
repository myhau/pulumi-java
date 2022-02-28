// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.inputs;

import io.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfigArgs;
import io.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfigArgs;
import io.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs Empty = new MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs();

    /**
     * Configuration options for sending command output to CloudWatch Logs. Documented below.
     * 
     */
    @InputImport(name="cloudwatchConfig")
      private final @Nullable Input<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfigArgs> cloudwatchConfig;

    public Input<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfigArgs> getCloudwatchConfig() {
        return this.cloudwatchConfig == null ? Input.empty() : this.cloudwatchConfig;
    }

    /**
     * Information about the command(s) to execute.
     * 
     */
    @InputImport(name="comment")
      private final @Nullable Input<String> comment;

    public Input<String> getComment() {
        return this.comment == null ? Input.empty() : this.comment;
    }

    /**
     * The SHA-256 or SHA-1 hash created by the system when the document was created. SHA-1 hashes have been deprecated.
     * 
     */
    @InputImport(name="documentHash")
      private final @Nullable Input<String> documentHash;

    public Input<String> getDocumentHash() {
        return this.documentHash == null ? Input.empty() : this.documentHash;
    }

    /**
     * SHA-256 or SHA-1. SHA-1 hashes have been deprecated. Valid values: `Sha256` and `Sha1`
     * 
     */
    @InputImport(name="documentHashType")
      private final @Nullable Input<String> documentHashType;

    public Input<String> getDocumentHashType() {
        return this.documentHashType == null ? Input.empty() : this.documentHashType;
    }

    /**
     * The version of an Automation document to use during task execution.
     * 
     */
    @InputImport(name="documentVersion")
      private final @Nullable Input<String> documentVersion;

    public Input<String> getDocumentVersion() {
        return this.documentVersion == null ? Input.empty() : this.documentVersion;
    }

    /**
     * Configurations for sending notifications about command status changes on a per-instance basis. Documented below.
     * 
     */
    @InputImport(name="notificationConfig")
      private final @Nullable Input<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfigArgs> notificationConfig;

    public Input<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfigArgs> getNotificationConfig() {
        return this.notificationConfig == null ? Input.empty() : this.notificationConfig;
    }

    /**
     * The name of the Amazon S3 bucket.
     * 
     */
    @InputImport(name="outputS3Bucket")
      private final @Nullable Input<String> outputS3Bucket;

    public Input<String> getOutputS3Bucket() {
        return this.outputS3Bucket == null ? Input.empty() : this.outputS3Bucket;
    }

    /**
     * The Amazon S3 bucket subfolder.
     * 
     */
    @InputImport(name="outputS3KeyPrefix")
      private final @Nullable Input<String> outputS3KeyPrefix;

    public Input<String> getOutputS3KeyPrefix() {
        return this.outputS3KeyPrefix == null ? Input.empty() : this.outputS3KeyPrefix;
    }

    /**
     * The parameters for the RUN_COMMAND task execution. Documented below.
     * 
     */
    @InputImport(name="parameters")
      private final @Nullable Input<List<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterArgs>> parameters;

    public Input<List<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * The IAM service role to assume during task execution.
     * 
     */
    @InputImport(name="serviceRoleArn")
      private final @Nullable Input<String> serviceRoleArn;

    public Input<String> getServiceRoleArn() {
        return this.serviceRoleArn == null ? Input.empty() : this.serviceRoleArn;
    }

    /**
     * If this time is reached and the command has not already started executing, it doesn't run.
     * 
     */
    @InputImport(name="timeoutSeconds")
      private final @Nullable Input<Integer> timeoutSeconds;

    public Input<Integer> getTimeoutSeconds() {
        return this.timeoutSeconds == null ? Input.empty() : this.timeoutSeconds;
    }

    public MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs(
        @Nullable Input<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfigArgs> cloudwatchConfig,
        @Nullable Input<String> comment,
        @Nullable Input<String> documentHash,
        @Nullable Input<String> documentHashType,
        @Nullable Input<String> documentVersion,
        @Nullable Input<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfigArgs> notificationConfig,
        @Nullable Input<String> outputS3Bucket,
        @Nullable Input<String> outputS3KeyPrefix,
        @Nullable Input<List<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterArgs>> parameters,
        @Nullable Input<String> serviceRoleArn,
        @Nullable Input<Integer> timeoutSeconds) {
        this.cloudwatchConfig = cloudwatchConfig;
        this.comment = comment;
        this.documentHash = documentHash;
        this.documentHashType = documentHashType;
        this.documentVersion = documentVersion;
        this.notificationConfig = notificationConfig;
        this.outputS3Bucket = outputS3Bucket;
        this.outputS3KeyPrefix = outputS3KeyPrefix;
        this.parameters = parameters;
        this.serviceRoleArn = serviceRoleArn;
        this.timeoutSeconds = timeoutSeconds;
    }

    private MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs() {
        this.cloudwatchConfig = Input.empty();
        this.comment = Input.empty();
        this.documentHash = Input.empty();
        this.documentHashType = Input.empty();
        this.documentVersion = Input.empty();
        this.notificationConfig = Input.empty();
        this.outputS3Bucket = Input.empty();
        this.outputS3KeyPrefix = Input.empty();
        this.parameters = Input.empty();
        this.serviceRoleArn = Input.empty();
        this.timeoutSeconds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfigArgs> cloudwatchConfig;
        private @Nullable Input<String> comment;
        private @Nullable Input<String> documentHash;
        private @Nullable Input<String> documentHashType;
        private @Nullable Input<String> documentVersion;
        private @Nullable Input<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfigArgs> notificationConfig;
        private @Nullable Input<String> outputS3Bucket;
        private @Nullable Input<String> outputS3KeyPrefix;
        private @Nullable Input<List<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterArgs>> parameters;
        private @Nullable Input<String> serviceRoleArn;
        private @Nullable Input<Integer> timeoutSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchConfig = defaults.cloudwatchConfig;
    	      this.comment = defaults.comment;
    	      this.documentHash = defaults.documentHash;
    	      this.documentHashType = defaults.documentHashType;
    	      this.documentVersion = defaults.documentVersion;
    	      this.notificationConfig = defaults.notificationConfig;
    	      this.outputS3Bucket = defaults.outputS3Bucket;
    	      this.outputS3KeyPrefix = defaults.outputS3KeyPrefix;
    	      this.parameters = defaults.parameters;
    	      this.serviceRoleArn = defaults.serviceRoleArn;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
        }

        public Builder setCloudwatchConfig(@Nullable Input<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfigArgs> cloudwatchConfig) {
            this.cloudwatchConfig = cloudwatchConfig;
            return this;
        }

        public Builder setCloudwatchConfig(@Nullable MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfigArgs cloudwatchConfig) {
            this.cloudwatchConfig = Input.ofNullable(cloudwatchConfig);
            return this;
        }

        public Builder setComment(@Nullable Input<String> comment) {
            this.comment = comment;
            return this;
        }

        public Builder setComment(@Nullable String comment) {
            this.comment = Input.ofNullable(comment);
            return this;
        }

        public Builder setDocumentHash(@Nullable Input<String> documentHash) {
            this.documentHash = documentHash;
            return this;
        }

        public Builder setDocumentHash(@Nullable String documentHash) {
            this.documentHash = Input.ofNullable(documentHash);
            return this;
        }

        public Builder setDocumentHashType(@Nullable Input<String> documentHashType) {
            this.documentHashType = documentHashType;
            return this;
        }

        public Builder setDocumentHashType(@Nullable String documentHashType) {
            this.documentHashType = Input.ofNullable(documentHashType);
            return this;
        }

        public Builder setDocumentVersion(@Nullable Input<String> documentVersion) {
            this.documentVersion = documentVersion;
            return this;
        }

        public Builder setDocumentVersion(@Nullable String documentVersion) {
            this.documentVersion = Input.ofNullable(documentVersion);
            return this;
        }

        public Builder setNotificationConfig(@Nullable Input<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfigArgs> notificationConfig) {
            this.notificationConfig = notificationConfig;
            return this;
        }

        public Builder setNotificationConfig(@Nullable MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfigArgs notificationConfig) {
            this.notificationConfig = Input.ofNullable(notificationConfig);
            return this;
        }

        public Builder setOutputS3Bucket(@Nullable Input<String> outputS3Bucket) {
            this.outputS3Bucket = outputS3Bucket;
            return this;
        }

        public Builder setOutputS3Bucket(@Nullable String outputS3Bucket) {
            this.outputS3Bucket = Input.ofNullable(outputS3Bucket);
            return this;
        }

        public Builder setOutputS3KeyPrefix(@Nullable Input<String> outputS3KeyPrefix) {
            this.outputS3KeyPrefix = outputS3KeyPrefix;
            return this;
        }

        public Builder setOutputS3KeyPrefix(@Nullable String outputS3KeyPrefix) {
            this.outputS3KeyPrefix = Input.ofNullable(outputS3KeyPrefix);
            return this;
        }

        public Builder setParameters(@Nullable Input<List<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable List<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder setServiceRoleArn(@Nullable Input<String> serviceRoleArn) {
            this.serviceRoleArn = serviceRoleArn;
            return this;
        }

        public Builder setServiceRoleArn(@Nullable String serviceRoleArn) {
            this.serviceRoleArn = Input.ofNullable(serviceRoleArn);
            return this;
        }

        public Builder setTimeoutSeconds(@Nullable Input<Integer> timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        public Builder setTimeoutSeconds(@Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = Input.ofNullable(timeoutSeconds);
            return this;
        }
        public MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs build() {
            return new MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs(cloudwatchConfig, comment, documentHash, documentHashType, documentVersion, notificationConfig, outputS3Bucket, outputS3KeyPrefix, parameters, serviceRoleArn, timeoutSeconds);
        }
    }
}
