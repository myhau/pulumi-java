// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.outputs;

import io.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptions;
import io.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration;
import io.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfiguration;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FirehoseDeliveryStreamRedshiftConfiguration {
    /**
     * The CloudWatch Logging Options for the delivery stream. More details are given below
     * 
     */
    private final @Nullable FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions;
    /**
     * The jdbcurl of the redshift cluster.
     * 
     */
    private final String clusterJdbcurl;
    /**
     * Copy options for copying the data from the s3 intermediate bucket into redshift, for example to change the default delimiter. For valid values, see the [AWS documentation](http://docs.aws.amazon.com/firehose/latest/APIReference/API_CopyCommand.html)
     * 
     */
    private final @Nullable String copyOptions;
    /**
     * The data table columns that will be targeted by the copy command.
     * 
     */
    private final @Nullable String dataTableColumns;
    /**
     * The name of the table in the redshift cluster that the s3 bucket will copy to.
     * 
     */
    private final String dataTableName;
    /**
     * The password for the username above.
     * 
     */
    private final String password;
    /**
     * The data processing configuration.  More details are given below.
     * 
     */
    private final @Nullable FirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration processingConfiguration;
    /**
     * The length of time during which Firehose retries delivery after a failure, starting from the initial request and including the first attempt. The default value is 3600 seconds (60 minutes). Firehose does not retry if the value of DurationInSeconds is 0 (zero) or if the first delivery attempt takes longer than the current value.
     * 
     */
    private final @Nullable Integer retryDuration;
    /**
     * The arn of the role the stream assumes.
     * 
     */
    private final String roleArn;
    /**
     * The configuration for backup in Amazon S3. Required if `s3_backup_mode` is `Enabled`. Supports the same fields as `s3_configuration` object.
     * 
     */
    private final @Nullable FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfiguration s3BackupConfiguration;
    /**
     * The Amazon S3 backup mode.  Valid values are `Disabled` and `Enabled`.  Default value is `Disabled`.
     * 
     */
    private final @Nullable String s3BackupMode;
    /**
     * The username that the firehose delivery stream will assume. It is strongly recommended that the username and password provided is used exclusively for Amazon Kinesis Firehose purposes, and that the permissions for the account are restricted for Amazon Redshift INSERT permissions.
     * 
     */
    private final String username;

    @OutputCustomType.Constructor({"cloudwatchLoggingOptions","clusterJdbcurl","copyOptions","dataTableColumns","dataTableName","password","processingConfiguration","retryDuration","roleArn","s3BackupConfiguration","s3BackupMode","username"})
    private FirehoseDeliveryStreamRedshiftConfiguration(
        @Nullable FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions,
        String clusterJdbcurl,
        @Nullable String copyOptions,
        @Nullable String dataTableColumns,
        String dataTableName,
        String password,
        @Nullable FirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration processingConfiguration,
        @Nullable Integer retryDuration,
        String roleArn,
        @Nullable FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfiguration s3BackupConfiguration,
        @Nullable String s3BackupMode,
        String username) {
        this.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
        this.clusterJdbcurl = clusterJdbcurl;
        this.copyOptions = copyOptions;
        this.dataTableColumns = dataTableColumns;
        this.dataTableName = dataTableName;
        this.password = password;
        this.processingConfiguration = processingConfiguration;
        this.retryDuration = retryDuration;
        this.roleArn = roleArn;
        this.s3BackupConfiguration = s3BackupConfiguration;
        this.s3BackupMode = s3BackupMode;
        this.username = username;
    }

    /**
     * The CloudWatch Logging Options for the delivery stream. More details are given below
     * 
    */
    public Optional<FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptions> getCloudwatchLoggingOptions() {
        return Optional.ofNullable(this.cloudwatchLoggingOptions);
    }
    /**
     * The jdbcurl of the redshift cluster.
     * 
    */
    public String getClusterJdbcurl() {
        return this.clusterJdbcurl;
    }
    /**
     * Copy options for copying the data from the s3 intermediate bucket into redshift, for example to change the default delimiter. For valid values, see the [AWS documentation](http://docs.aws.amazon.com/firehose/latest/APIReference/API_CopyCommand.html)
     * 
    */
    public Optional<String> getCopyOptions() {
        return Optional.ofNullable(this.copyOptions);
    }
    /**
     * The data table columns that will be targeted by the copy command.
     * 
    */
    public Optional<String> getDataTableColumns() {
        return Optional.ofNullable(this.dataTableColumns);
    }
    /**
     * The name of the table in the redshift cluster that the s3 bucket will copy to.
     * 
    */
    public String getDataTableName() {
        return this.dataTableName;
    }
    /**
     * The password for the username above.
     * 
    */
    public String getPassword() {
        return this.password;
    }
    /**
     * The data processing configuration.  More details are given below.
     * 
    */
    public Optional<FirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration> getProcessingConfiguration() {
        return Optional.ofNullable(this.processingConfiguration);
    }
    /**
     * The length of time during which Firehose retries delivery after a failure, starting from the initial request and including the first attempt. The default value is 3600 seconds (60 minutes). Firehose does not retry if the value of DurationInSeconds is 0 (zero) or if the first delivery attempt takes longer than the current value.
     * 
    */
    public Optional<Integer> getRetryDuration() {
        return Optional.ofNullable(this.retryDuration);
    }
    /**
     * The arn of the role the stream assumes.
     * 
    */
    public String getRoleArn() {
        return this.roleArn;
    }
    /**
     * The configuration for backup in Amazon S3. Required if `s3_backup_mode` is `Enabled`. Supports the same fields as `s3_configuration` object.
     * 
    */
    public Optional<FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfiguration> getS3BackupConfiguration() {
        return Optional.ofNullable(this.s3BackupConfiguration);
    }
    /**
     * The Amazon S3 backup mode.  Valid values are `Disabled` and `Enabled`.  Default value is `Disabled`.
     * 
    */
    public Optional<String> getS3BackupMode() {
        return Optional.ofNullable(this.s3BackupMode);
    }
    /**
     * The username that the firehose delivery stream will assume. It is strongly recommended that the username and password provided is used exclusively for Amazon Kinesis Firehose purposes, and that the permissions for the account are restricted for Amazon Redshift INSERT permissions.
     * 
    */
    public String getUsername() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamRedshiftConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions;
        private String clusterJdbcurl;
        private @Nullable String copyOptions;
        private @Nullable String dataTableColumns;
        private String dataTableName;
        private String password;
        private @Nullable FirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration processingConfiguration;
        private @Nullable Integer retryDuration;
        private String roleArn;
        private @Nullable FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfiguration s3BackupConfiguration;
        private @Nullable String s3BackupMode;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamRedshiftConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchLoggingOptions = defaults.cloudwatchLoggingOptions;
    	      this.clusterJdbcurl = defaults.clusterJdbcurl;
    	      this.copyOptions = defaults.copyOptions;
    	      this.dataTableColumns = defaults.dataTableColumns;
    	      this.dataTableName = defaults.dataTableName;
    	      this.password = defaults.password;
    	      this.processingConfiguration = defaults.processingConfiguration;
    	      this.retryDuration = defaults.retryDuration;
    	      this.roleArn = defaults.roleArn;
    	      this.s3BackupConfiguration = defaults.s3BackupConfiguration;
    	      this.s3BackupMode = defaults.s3BackupMode;
    	      this.username = defaults.username;
        }

        public Builder setCloudwatchLoggingOptions(@Nullable FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions) {
            this.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
            return this;
        }

        public Builder setClusterJdbcurl(String clusterJdbcurl) {
            this.clusterJdbcurl = Objects.requireNonNull(clusterJdbcurl);
            return this;
        }

        public Builder setCopyOptions(@Nullable String copyOptions) {
            this.copyOptions = copyOptions;
            return this;
        }

        public Builder setDataTableColumns(@Nullable String dataTableColumns) {
            this.dataTableColumns = dataTableColumns;
            return this;
        }

        public Builder setDataTableName(String dataTableName) {
            this.dataTableName = Objects.requireNonNull(dataTableName);
            return this;
        }

        public Builder setPassword(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setProcessingConfiguration(@Nullable FirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration processingConfiguration) {
            this.processingConfiguration = processingConfiguration;
            return this;
        }

        public Builder setRetryDuration(@Nullable Integer retryDuration) {
            this.retryDuration = retryDuration;
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setS3BackupConfiguration(@Nullable FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfiguration s3BackupConfiguration) {
            this.s3BackupConfiguration = s3BackupConfiguration;
            return this;
        }

        public Builder setS3BackupMode(@Nullable String s3BackupMode) {
            this.s3BackupMode = s3BackupMode;
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public FirehoseDeliveryStreamRedshiftConfiguration build() {
            return new FirehoseDeliveryStreamRedshiftConfiguration(cloudwatchLoggingOptions, clusterJdbcurl, copyOptions, dataTableColumns, dataTableName, password, processingConfiguration, retryDuration, roleArn, s3BackupConfiguration, s3BackupMode, username);
        }
    }
}
