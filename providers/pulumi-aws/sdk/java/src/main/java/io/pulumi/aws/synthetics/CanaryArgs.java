// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.synthetics;

import io.pulumi.aws.synthetics.inputs.CanaryArtifactConfigArgs;
import io.pulumi.aws.synthetics.inputs.CanaryRunConfigArgs;
import io.pulumi.aws.synthetics.inputs.CanaryScheduleArgs;
import io.pulumi.aws.synthetics.inputs.CanaryVpcConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CanaryArgs extends io.pulumi.resources.ResourceArgs {

    public static final CanaryArgs Empty = new CanaryArgs();

    /**
     * configuration for canary artifacts, including the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3. See Artifact Config.
     * 
     */
    @InputImport(name="artifactConfig")
      private final @Nullable Input<CanaryArtifactConfigArgs> artifactConfig;

    public Input<CanaryArtifactConfigArgs> getArtifactConfig() {
        return this.artifactConfig == null ? Input.empty() : this.artifactConfig;
    }

    /**
     * Location in Amazon S3 where Synthetics stores artifacts from the test runs of this canary.
     * 
     */
    @InputImport(name="artifactS3Location", required=true)
      private final Input<String> artifactS3Location;

    public Input<String> getArtifactS3Location() {
        return this.artifactS3Location;
    }

    /**
     * ARN of the IAM role to be used to run the canary. see [AWS Docs](https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_CreateCanary.html#API_CreateCanary_RequestSyntax) for permissions needs for IAM Role.
     * 
     */
    @InputImport(name="executionRoleArn", required=true)
      private final Input<String> executionRoleArn;

    public Input<String> getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * Number of days to retain data about failed runs of this canary. If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
     * 
     */
    @InputImport(name="failureRetentionPeriod")
      private final @Nullable Input<Integer> failureRetentionPeriod;

    public Input<Integer> getFailureRetentionPeriod() {
        return this.failureRetentionPeriod == null ? Input.empty() : this.failureRetentionPeriod;
    }

    /**
     * Entry point to use for the source code when running the canary. This value must end with the string `.handler` .
     * 
     */
    @InputImport(name="handler", required=true)
      private final Input<String> handler;

    public Input<String> getHandler() {
        return this.handler;
    }

    /**
     * Name for this canary. Has a maximum length of 21 characters. Valid characters are lowercase alphanumeric, hyphen, or underscore.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Configuration block for individual canary runs. Detailed below.
     * 
     */
    @InputImport(name="runConfig")
      private final @Nullable Input<CanaryRunConfigArgs> runConfig;

    public Input<CanaryRunConfigArgs> getRunConfig() {
        return this.runConfig == null ? Input.empty() : this.runConfig;
    }

    /**
     * Runtime version to use for the canary. Versions change often so consult the [Amazon CloudWatch documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html) for the latest valid versions. Values include `syn-python-selenium-1.0`, `syn-nodejs-puppeteer-3.0`, `syn-nodejs-2.2`, `syn-nodejs-2.1`, `syn-nodejs-2.0`, and `syn-1.0`.
     * 
     */
    @InputImport(name="runtimeVersion", required=true)
      private final Input<String> runtimeVersion;

    public Input<String> getRuntimeVersion() {
        return this.runtimeVersion;
    }

    /**
     * Full bucket name which is used if your canary script is located in S3. The bucket must already exist. Specify the full bucket name including s3:// as the start of the bucket name. **Conflicts with `zip_file`.**
     * 
     */
    @InputImport(name="s3Bucket")
      private final @Nullable Input<String> s3Bucket;

    public Input<String> getS3Bucket() {
        return this.s3Bucket == null ? Input.empty() : this.s3Bucket;
    }

    /**
     * S3 key of your script. **Conflicts with `zip_file`.**
     * 
     */
    @InputImport(name="s3Key")
      private final @Nullable Input<String> s3Key;

    public Input<String> getS3Key() {
        return this.s3Key == null ? Input.empty() : this.s3Key;
    }

    /**
     * S3 version ID of your script. **Conflicts with `zip_file`.**
     * 
     */
    @InputImport(name="s3Version")
      private final @Nullable Input<String> s3Version;

    public Input<String> getS3Version() {
        return this.s3Version == null ? Input.empty() : this.s3Version;
    }

    /**
     * Configuration block providing how often the canary is to run and when these test runs are to stop. Detailed below.
     * 
     */
    @InputImport(name="schedule", required=true)
      private final Input<CanaryScheduleArgs> schedule;

    public Input<CanaryScheduleArgs> getSchedule() {
        return this.schedule;
    }

    /**
     * Whether to run or stop the canary.
     * 
     */
    @InputImport(name="startCanary")
      private final @Nullable Input<Boolean> startCanary;

    public Input<Boolean> getStartCanary() {
        return this.startCanary == null ? Input.empty() : this.startCanary;
    }

    /**
     * Number of days to retain data about successful runs of this canary. If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
     * 
     */
    @InputImport(name="successRetentionPeriod")
      private final @Nullable Input<Integer> successRetentionPeriod;

    public Input<Integer> getSuccessRetentionPeriod() {
        return this.successRetentionPeriod == null ? Input.empty() : this.successRetentionPeriod;
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @InputImport(name="vpcConfig")
      private final @Nullable Input<CanaryVpcConfigArgs> vpcConfig;

    public Input<CanaryVpcConfigArgs> getVpcConfig() {
        return this.vpcConfig == null ? Input.empty() : this.vpcConfig;
    }

    /**
     * ZIP file that contains the script, if you input your canary script directly into the canary instead of referring to an S3 location. It can be up to 5 MB. **Conflicts with `s3_bucket`, `s3_key`, and `s3_version`.**
     * 
     */
    @InputImport(name="zipFile")
      private final @Nullable Input<String> zipFile;

    public Input<String> getZipFile() {
        return this.zipFile == null ? Input.empty() : this.zipFile;
    }

    public CanaryArgs(
        @Nullable Input<CanaryArtifactConfigArgs> artifactConfig,
        Input<String> artifactS3Location,
        Input<String> executionRoleArn,
        @Nullable Input<Integer> failureRetentionPeriod,
        Input<String> handler,
        @Nullable Input<String> name,
        @Nullable Input<CanaryRunConfigArgs> runConfig,
        Input<String> runtimeVersion,
        @Nullable Input<String> s3Bucket,
        @Nullable Input<String> s3Key,
        @Nullable Input<String> s3Version,
        Input<CanaryScheduleArgs> schedule,
        @Nullable Input<Boolean> startCanary,
        @Nullable Input<Integer> successRetentionPeriod,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<CanaryVpcConfigArgs> vpcConfig,
        @Nullable Input<String> zipFile) {
        this.artifactConfig = artifactConfig;
        this.artifactS3Location = Objects.requireNonNull(artifactS3Location, "expected parameter 'artifactS3Location' to be non-null");
        this.executionRoleArn = Objects.requireNonNull(executionRoleArn, "expected parameter 'executionRoleArn' to be non-null");
        this.failureRetentionPeriod = failureRetentionPeriod;
        this.handler = Objects.requireNonNull(handler, "expected parameter 'handler' to be non-null");
        this.name = name;
        this.runConfig = runConfig;
        this.runtimeVersion = Objects.requireNonNull(runtimeVersion, "expected parameter 'runtimeVersion' to be non-null");
        this.s3Bucket = s3Bucket;
        this.s3Key = s3Key;
        this.s3Version = s3Version;
        this.schedule = Objects.requireNonNull(schedule, "expected parameter 'schedule' to be non-null");
        this.startCanary = startCanary;
        this.successRetentionPeriod = successRetentionPeriod;
        this.tags = tags;
        this.vpcConfig = vpcConfig;
        this.zipFile = zipFile;
    }

    private CanaryArgs() {
        this.artifactConfig = Input.empty();
        this.artifactS3Location = Input.empty();
        this.executionRoleArn = Input.empty();
        this.failureRetentionPeriod = Input.empty();
        this.handler = Input.empty();
        this.name = Input.empty();
        this.runConfig = Input.empty();
        this.runtimeVersion = Input.empty();
        this.s3Bucket = Input.empty();
        this.s3Key = Input.empty();
        this.s3Version = Input.empty();
        this.schedule = Input.empty();
        this.startCanary = Input.empty();
        this.successRetentionPeriod = Input.empty();
        this.tags = Input.empty();
        this.vpcConfig = Input.empty();
        this.zipFile = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CanaryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CanaryArtifactConfigArgs> artifactConfig;
        private Input<String> artifactS3Location;
        private Input<String> executionRoleArn;
        private @Nullable Input<Integer> failureRetentionPeriod;
        private Input<String> handler;
        private @Nullable Input<String> name;
        private @Nullable Input<CanaryRunConfigArgs> runConfig;
        private Input<String> runtimeVersion;
        private @Nullable Input<String> s3Bucket;
        private @Nullable Input<String> s3Key;
        private @Nullable Input<String> s3Version;
        private Input<CanaryScheduleArgs> schedule;
        private @Nullable Input<Boolean> startCanary;
        private @Nullable Input<Integer> successRetentionPeriod;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<CanaryVpcConfigArgs> vpcConfig;
        private @Nullable Input<String> zipFile;

        public Builder() {
    	      // Empty
        }

        public Builder(CanaryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactConfig = defaults.artifactConfig;
    	      this.artifactS3Location = defaults.artifactS3Location;
    	      this.executionRoleArn = defaults.executionRoleArn;
    	      this.failureRetentionPeriod = defaults.failureRetentionPeriod;
    	      this.handler = defaults.handler;
    	      this.name = defaults.name;
    	      this.runConfig = defaults.runConfig;
    	      this.runtimeVersion = defaults.runtimeVersion;
    	      this.s3Bucket = defaults.s3Bucket;
    	      this.s3Key = defaults.s3Key;
    	      this.s3Version = defaults.s3Version;
    	      this.schedule = defaults.schedule;
    	      this.startCanary = defaults.startCanary;
    	      this.successRetentionPeriod = defaults.successRetentionPeriod;
    	      this.tags = defaults.tags;
    	      this.vpcConfig = defaults.vpcConfig;
    	      this.zipFile = defaults.zipFile;
        }

        public Builder setArtifactConfig(@Nullable Input<CanaryArtifactConfigArgs> artifactConfig) {
            this.artifactConfig = artifactConfig;
            return this;
        }

        public Builder setArtifactConfig(@Nullable CanaryArtifactConfigArgs artifactConfig) {
            this.artifactConfig = Input.ofNullable(artifactConfig);
            return this;
        }

        public Builder setArtifactS3Location(Input<String> artifactS3Location) {
            this.artifactS3Location = Objects.requireNonNull(artifactS3Location);
            return this;
        }

        public Builder setArtifactS3Location(String artifactS3Location) {
            this.artifactS3Location = Input.of(Objects.requireNonNull(artifactS3Location));
            return this;
        }

        public Builder setExecutionRoleArn(Input<String> executionRoleArn) {
            this.executionRoleArn = Objects.requireNonNull(executionRoleArn);
            return this;
        }

        public Builder setExecutionRoleArn(String executionRoleArn) {
            this.executionRoleArn = Input.of(Objects.requireNonNull(executionRoleArn));
            return this;
        }

        public Builder setFailureRetentionPeriod(@Nullable Input<Integer> failureRetentionPeriod) {
            this.failureRetentionPeriod = failureRetentionPeriod;
            return this;
        }

        public Builder setFailureRetentionPeriod(@Nullable Integer failureRetentionPeriod) {
            this.failureRetentionPeriod = Input.ofNullable(failureRetentionPeriod);
            return this;
        }

        public Builder setHandler(Input<String> handler) {
            this.handler = Objects.requireNonNull(handler);
            return this;
        }

        public Builder setHandler(String handler) {
            this.handler = Input.of(Objects.requireNonNull(handler));
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

        public Builder setRunConfig(@Nullable Input<CanaryRunConfigArgs> runConfig) {
            this.runConfig = runConfig;
            return this;
        }

        public Builder setRunConfig(@Nullable CanaryRunConfigArgs runConfig) {
            this.runConfig = Input.ofNullable(runConfig);
            return this;
        }

        public Builder setRuntimeVersion(Input<String> runtimeVersion) {
            this.runtimeVersion = Objects.requireNonNull(runtimeVersion);
            return this;
        }

        public Builder setRuntimeVersion(String runtimeVersion) {
            this.runtimeVersion = Input.of(Objects.requireNonNull(runtimeVersion));
            return this;
        }

        public Builder setS3Bucket(@Nullable Input<String> s3Bucket) {
            this.s3Bucket = s3Bucket;
            return this;
        }

        public Builder setS3Bucket(@Nullable String s3Bucket) {
            this.s3Bucket = Input.ofNullable(s3Bucket);
            return this;
        }

        public Builder setS3Key(@Nullable Input<String> s3Key) {
            this.s3Key = s3Key;
            return this;
        }

        public Builder setS3Key(@Nullable String s3Key) {
            this.s3Key = Input.ofNullable(s3Key);
            return this;
        }

        public Builder setS3Version(@Nullable Input<String> s3Version) {
            this.s3Version = s3Version;
            return this;
        }

        public Builder setS3Version(@Nullable String s3Version) {
            this.s3Version = Input.ofNullable(s3Version);
            return this;
        }

        public Builder setSchedule(Input<CanaryScheduleArgs> schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }

        public Builder setSchedule(CanaryScheduleArgs schedule) {
            this.schedule = Input.of(Objects.requireNonNull(schedule));
            return this;
        }

        public Builder setStartCanary(@Nullable Input<Boolean> startCanary) {
            this.startCanary = startCanary;
            return this;
        }

        public Builder setStartCanary(@Nullable Boolean startCanary) {
            this.startCanary = Input.ofNullable(startCanary);
            return this;
        }

        public Builder setSuccessRetentionPeriod(@Nullable Input<Integer> successRetentionPeriod) {
            this.successRetentionPeriod = successRetentionPeriod;
            return this;
        }

        public Builder setSuccessRetentionPeriod(@Nullable Integer successRetentionPeriod) {
            this.successRetentionPeriod = Input.ofNullable(successRetentionPeriod);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setVpcConfig(@Nullable Input<CanaryVpcConfigArgs> vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }

        public Builder setVpcConfig(@Nullable CanaryVpcConfigArgs vpcConfig) {
            this.vpcConfig = Input.ofNullable(vpcConfig);
            return this;
        }

        public Builder setZipFile(@Nullable Input<String> zipFile) {
            this.zipFile = zipFile;
            return this;
        }

        public Builder setZipFile(@Nullable String zipFile) {
            this.zipFile = Input.ofNullable(zipFile);
            return this;
        }
        public CanaryArgs build() {
            return new CanaryArgs(artifactConfig, artifactS3Location, executionRoleArn, failureRetentionPeriod, handler, name, runConfig, runtimeVersion, s3Bucket, s3Key, s3Version, schedule, startCanary, successRetentionPeriod, tags, vpcConfig, zipFile);
        }
    }
}
