// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptionsArgs;
import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationArgs;
import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationVpcConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamElasticsearchConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamElasticsearchConfigurationArgs Empty = new FirehoseDeliveryStreamElasticsearchConfigurationArgs();

    /**
     * Buffer incoming data for the specified period of time, in seconds between 60 to 900, before delivering it to the destination.  The default value is 300s.
     * 
     */
    @InputImport(name="bufferingInterval")
      private final @Nullable Input<Integer> bufferingInterval;

    public Input<Integer> getBufferingInterval() {
        return this.bufferingInterval == null ? Input.empty() : this.bufferingInterval;
    }

    /**
     * Buffer incoming data to the specified size, in MBs between 1 to 100, before delivering it to the destination.  The default value is 5MB.
     * 
     */
    @InputImport(name="bufferingSize")
      private final @Nullable Input<Integer> bufferingSize;

    public Input<Integer> getBufferingSize() {
        return this.bufferingSize == null ? Input.empty() : this.bufferingSize;
    }

    /**
     * The CloudWatch Logging Options for the delivery stream. More details are given below
     * 
     */
    @InputImport(name="cloudwatchLoggingOptions")
      private final @Nullable Input<FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptionsArgs> cloudwatchLoggingOptions;

    public Input<FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptionsArgs> getCloudwatchLoggingOptions() {
        return this.cloudwatchLoggingOptions == null ? Input.empty() : this.cloudwatchLoggingOptions;
    }

    /**
     * The endpoint to use when communicating with the cluster. Conflicts with `domain_arn`.
     * 
     */
    @InputImport(name="clusterEndpoint")
      private final @Nullable Input<String> clusterEndpoint;

    public Input<String> getClusterEndpoint() {
        return this.clusterEndpoint == null ? Input.empty() : this.clusterEndpoint;
    }

    /**
     * The ARN of the Amazon ES domain.  The IAM role must have permission for `DescribeElasticsearchDomain`, `DescribeElasticsearchDomains`, and `DescribeElasticsearchDomainConfig` after assuming `RoleARN`.  The pattern needs to be `arn:.*`. Conflicts with `cluster_endpoint`.
     * 
     */
    @InputImport(name="domainArn")
      private final @Nullable Input<String> domainArn;

    public Input<String> getDomainArn() {
        return this.domainArn == null ? Input.empty() : this.domainArn;
    }

    /**
     * The Elasticsearch index name.
     * 
     */
    @InputImport(name="indexName", required=true)
      private final Input<String> indexName;

    public Input<String> getIndexName() {
        return this.indexName;
    }

    /**
     * The Elasticsearch index rotation period.  Index rotation appends a timestamp to the IndexName to facilitate expiration of old data.  Valid values are `NoRotation`, `OneHour`, `OneDay`, `OneWeek`, and `OneMonth`.  The default value is `OneDay`.
     * 
     */
    @InputImport(name="indexRotationPeriod")
      private final @Nullable Input<String> indexRotationPeriod;

    public Input<String> getIndexRotationPeriod() {
        return this.indexRotationPeriod == null ? Input.empty() : this.indexRotationPeriod;
    }

    /**
     * The data processing configuration.  More details are given below.
     * 
     */
    @InputImport(name="processingConfiguration")
      private final @Nullable Input<FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationArgs> processingConfiguration;

    public Input<FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationArgs> getProcessingConfiguration() {
        return this.processingConfiguration == null ? Input.empty() : this.processingConfiguration;
    }

    /**
     * After an initial failure to deliver to Amazon Elasticsearch, the total amount of time, in seconds between 0 to 7200, during which Firehose re-attempts delivery (including the first attempt).  After this time has elapsed, the failed documents are written to Amazon S3.  The default value is 300s.  There will be no retry if the value is 0.
     * 
     */
    @InputImport(name="retryDuration")
      private final @Nullable Input<Integer> retryDuration;

    public Input<Integer> getRetryDuration() {
        return this.retryDuration == null ? Input.empty() : this.retryDuration;
    }

    /**
     * The ARN of the IAM role to be assumed by Firehose for calling the Amazon ES Configuration API and for indexing documents.  The pattern needs to be `arn:.*`.
     * 
     */
    @InputImport(name="roleArn", required=true)
      private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * Defines how documents should be delivered to Amazon S3.  Valid values are `FailedDocumentsOnly` and `AllDocuments`.  Default value is `FailedDocumentsOnly`.
     * 
     */
    @InputImport(name="s3BackupMode")
      private final @Nullable Input<String> s3BackupMode;

    public Input<String> getS3BackupMode() {
        return this.s3BackupMode == null ? Input.empty() : this.s3BackupMode;
    }

    /**
     * The Elasticsearch type name with maximum length of 100 characters.
     * 
     */
    @InputImport(name="typeName")
      private final @Nullable Input<String> typeName;

    public Input<String> getTypeName() {
        return this.typeName == null ? Input.empty() : this.typeName;
    }

    /**
     * The VPC configuration for the delivery stream to connect to Elastic Search associated with the VPC. More details are given below
     * 
     */
    @InputImport(name="vpcConfig")
      private final @Nullable Input<FirehoseDeliveryStreamElasticsearchConfigurationVpcConfigArgs> vpcConfig;

    public Input<FirehoseDeliveryStreamElasticsearchConfigurationVpcConfigArgs> getVpcConfig() {
        return this.vpcConfig == null ? Input.empty() : this.vpcConfig;
    }

    public FirehoseDeliveryStreamElasticsearchConfigurationArgs(
        @Nullable Input<Integer> bufferingInterval,
        @Nullable Input<Integer> bufferingSize,
        @Nullable Input<FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptionsArgs> cloudwatchLoggingOptions,
        @Nullable Input<String> clusterEndpoint,
        @Nullable Input<String> domainArn,
        Input<String> indexName,
        @Nullable Input<String> indexRotationPeriod,
        @Nullable Input<FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationArgs> processingConfiguration,
        @Nullable Input<Integer> retryDuration,
        Input<String> roleArn,
        @Nullable Input<String> s3BackupMode,
        @Nullable Input<String> typeName,
        @Nullable Input<FirehoseDeliveryStreamElasticsearchConfigurationVpcConfigArgs> vpcConfig) {
        this.bufferingInterval = bufferingInterval;
        this.bufferingSize = bufferingSize;
        this.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
        this.clusterEndpoint = clusterEndpoint;
        this.domainArn = domainArn;
        this.indexName = Objects.requireNonNull(indexName, "expected parameter 'indexName' to be non-null");
        this.indexRotationPeriod = indexRotationPeriod;
        this.processingConfiguration = processingConfiguration;
        this.retryDuration = retryDuration;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.s3BackupMode = s3BackupMode;
        this.typeName = typeName;
        this.vpcConfig = vpcConfig;
    }

    private FirehoseDeliveryStreamElasticsearchConfigurationArgs() {
        this.bufferingInterval = Input.empty();
        this.bufferingSize = Input.empty();
        this.cloudwatchLoggingOptions = Input.empty();
        this.clusterEndpoint = Input.empty();
        this.domainArn = Input.empty();
        this.indexName = Input.empty();
        this.indexRotationPeriod = Input.empty();
        this.processingConfiguration = Input.empty();
        this.retryDuration = Input.empty();
        this.roleArn = Input.empty();
        this.s3BackupMode = Input.empty();
        this.typeName = Input.empty();
        this.vpcConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamElasticsearchConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> bufferingInterval;
        private @Nullable Input<Integer> bufferingSize;
        private @Nullable Input<FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptionsArgs> cloudwatchLoggingOptions;
        private @Nullable Input<String> clusterEndpoint;
        private @Nullable Input<String> domainArn;
        private Input<String> indexName;
        private @Nullable Input<String> indexRotationPeriod;
        private @Nullable Input<FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationArgs> processingConfiguration;
        private @Nullable Input<Integer> retryDuration;
        private Input<String> roleArn;
        private @Nullable Input<String> s3BackupMode;
        private @Nullable Input<String> typeName;
        private @Nullable Input<FirehoseDeliveryStreamElasticsearchConfigurationVpcConfigArgs> vpcConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamElasticsearchConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bufferingInterval = defaults.bufferingInterval;
    	      this.bufferingSize = defaults.bufferingSize;
    	      this.cloudwatchLoggingOptions = defaults.cloudwatchLoggingOptions;
    	      this.clusterEndpoint = defaults.clusterEndpoint;
    	      this.domainArn = defaults.domainArn;
    	      this.indexName = defaults.indexName;
    	      this.indexRotationPeriod = defaults.indexRotationPeriod;
    	      this.processingConfiguration = defaults.processingConfiguration;
    	      this.retryDuration = defaults.retryDuration;
    	      this.roleArn = defaults.roleArn;
    	      this.s3BackupMode = defaults.s3BackupMode;
    	      this.typeName = defaults.typeName;
    	      this.vpcConfig = defaults.vpcConfig;
        }

        public Builder setBufferingInterval(@Nullable Input<Integer> bufferingInterval) {
            this.bufferingInterval = bufferingInterval;
            return this;
        }

        public Builder setBufferingInterval(@Nullable Integer bufferingInterval) {
            this.bufferingInterval = Input.ofNullable(bufferingInterval);
            return this;
        }

        public Builder setBufferingSize(@Nullable Input<Integer> bufferingSize) {
            this.bufferingSize = bufferingSize;
            return this;
        }

        public Builder setBufferingSize(@Nullable Integer bufferingSize) {
            this.bufferingSize = Input.ofNullable(bufferingSize);
            return this;
        }

        public Builder setCloudwatchLoggingOptions(@Nullable Input<FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptionsArgs> cloudwatchLoggingOptions) {
            this.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
            return this;
        }

        public Builder setCloudwatchLoggingOptions(@Nullable FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptionsArgs cloudwatchLoggingOptions) {
            this.cloudwatchLoggingOptions = Input.ofNullable(cloudwatchLoggingOptions);
            return this;
        }

        public Builder setClusterEndpoint(@Nullable Input<String> clusterEndpoint) {
            this.clusterEndpoint = clusterEndpoint;
            return this;
        }

        public Builder setClusterEndpoint(@Nullable String clusterEndpoint) {
            this.clusterEndpoint = Input.ofNullable(clusterEndpoint);
            return this;
        }

        public Builder setDomainArn(@Nullable Input<String> domainArn) {
            this.domainArn = domainArn;
            return this;
        }

        public Builder setDomainArn(@Nullable String domainArn) {
            this.domainArn = Input.ofNullable(domainArn);
            return this;
        }

        public Builder setIndexName(Input<String> indexName) {
            this.indexName = Objects.requireNonNull(indexName);
            return this;
        }

        public Builder setIndexName(String indexName) {
            this.indexName = Input.of(Objects.requireNonNull(indexName));
            return this;
        }

        public Builder setIndexRotationPeriod(@Nullable Input<String> indexRotationPeriod) {
            this.indexRotationPeriod = indexRotationPeriod;
            return this;
        }

        public Builder setIndexRotationPeriod(@Nullable String indexRotationPeriod) {
            this.indexRotationPeriod = Input.ofNullable(indexRotationPeriod);
            return this;
        }

        public Builder setProcessingConfiguration(@Nullable Input<FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationArgs> processingConfiguration) {
            this.processingConfiguration = processingConfiguration;
            return this;
        }

        public Builder setProcessingConfiguration(@Nullable FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationArgs processingConfiguration) {
            this.processingConfiguration = Input.ofNullable(processingConfiguration);
            return this;
        }

        public Builder setRetryDuration(@Nullable Input<Integer> retryDuration) {
            this.retryDuration = retryDuration;
            return this;
        }

        public Builder setRetryDuration(@Nullable Integer retryDuration) {
            this.retryDuration = Input.ofNullable(retryDuration);
            return this;
        }

        public Builder setRoleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public Builder setS3BackupMode(@Nullable Input<String> s3BackupMode) {
            this.s3BackupMode = s3BackupMode;
            return this;
        }

        public Builder setS3BackupMode(@Nullable String s3BackupMode) {
            this.s3BackupMode = Input.ofNullable(s3BackupMode);
            return this;
        }

        public Builder setTypeName(@Nullable Input<String> typeName) {
            this.typeName = typeName;
            return this;
        }

        public Builder setTypeName(@Nullable String typeName) {
            this.typeName = Input.ofNullable(typeName);
            return this;
        }

        public Builder setVpcConfig(@Nullable Input<FirehoseDeliveryStreamElasticsearchConfigurationVpcConfigArgs> vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }

        public Builder setVpcConfig(@Nullable FirehoseDeliveryStreamElasticsearchConfigurationVpcConfigArgs vpcConfig) {
            this.vpcConfig = Input.ofNullable(vpcConfig);
            return this;
        }
        public FirehoseDeliveryStreamElasticsearchConfigurationArgs build() {
            return new FirehoseDeliveryStreamElasticsearchConfigurationArgs(bufferingInterval, bufferingSize, cloudwatchLoggingOptions, clusterEndpoint, domainArn, indexName, indexRotationPeriod, processingConfiguration, retryDuration, roleArn, s3BackupMode, typeName, vpcConfig);
        }
    }
}
