// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationAccessControlTranslationGetArgs;
import io.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationEncryptionConfigurationGetArgs;
import io.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationMetricsGetArgs;
import io.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationReplicationTimeGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketReplicationConfigRuleDestinationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigRuleDestinationGetArgs Empty = new BucketReplicationConfigRuleDestinationGetArgs();

    /**
     * A configuration block that specifies the overrides to use for object owners on replication documented below. Specify this only in a cross-account scenario (where source and destination bucket owners are not the same), and you want to change replica ownership to the AWS account that owns the destination bucket. If this is not specified in the replication configuration, the replicas are owned by same AWS account that owns the source object. Must be used in conjunction with `account` owner override configuration.
     * 
     */
    @InputImport(name="accessControlTranslation")
      private final @Nullable Input<BucketReplicationConfigRuleDestinationAccessControlTranslationGetArgs> accessControlTranslation;

    public Input<BucketReplicationConfigRuleDestinationAccessControlTranslationGetArgs> getAccessControlTranslation() {
        return this.accessControlTranslation == null ? Input.empty() : this.accessControlTranslation;
    }

    /**
     * The Account ID to specify the replica ownership. Must be used in conjunction with `access_control_translation` override configuration.
     * 
     */
    @InputImport(name="account")
      private final @Nullable Input<String> account;

    public Input<String> getAccount() {
        return this.account == null ? Input.empty() : this.account;
    }

    /**
     * The ARN of the S3 bucket where you want Amazon S3 to store replicas of the objects identified by the rule.
     * 
     */
    @InputImport(name="bucket", required=true)
      private final Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket;
    }

    /**
     * A configuration block that provides information about encryption documented below. If `source_selection_criteria` is specified, you must specify this element.
     * 
     */
    @InputImport(name="encryptionConfiguration")
      private final @Nullable Input<BucketReplicationConfigRuleDestinationEncryptionConfigurationGetArgs> encryptionConfiguration;

    public Input<BucketReplicationConfigRuleDestinationEncryptionConfigurationGetArgs> getEncryptionConfiguration() {
        return this.encryptionConfiguration == null ? Input.empty() : this.encryptionConfiguration;
    }

    /**
     * A configuration block that specifies replication metrics-related settings enabling replication metrics and events documented below.
     * 
     */
    @InputImport(name="metrics")
      private final @Nullable Input<BucketReplicationConfigRuleDestinationMetricsGetArgs> metrics;

    public Input<BucketReplicationConfigRuleDestinationMetricsGetArgs> getMetrics() {
        return this.metrics == null ? Input.empty() : this.metrics;
    }

    /**
     * A configuration block that specifies S3 Replication Time Control (S3 RTC), including whether S3 RTC is enabled and the time when all objects and operations on objects must be replicated documented below. Replication Time Control must be used in conjunction with `metrics`.
     * 
     */
    @InputImport(name="replicationTime")
      private final @Nullable Input<BucketReplicationConfigRuleDestinationReplicationTimeGetArgs> replicationTime;

    public Input<BucketReplicationConfigRuleDestinationReplicationTimeGetArgs> getReplicationTime() {
        return this.replicationTime == null ? Input.empty() : this.replicationTime;
    }

    /**
     * The [storage class](https://docs.aws.amazon.com/AmazonS3/latest/API/API_Destination.html#AmazonS3-Type-Destination-StorageClass) used to store the object. By default, Amazon S3 uses the storage class of the source object to create the object replica.
     * 
     */
    @InputImport(name="storageClass")
      private final @Nullable Input<String> storageClass;

    public Input<String> getStorageClass() {
        return this.storageClass == null ? Input.empty() : this.storageClass;
    }

    public BucketReplicationConfigRuleDestinationGetArgs(
        @Nullable Input<BucketReplicationConfigRuleDestinationAccessControlTranslationGetArgs> accessControlTranslation,
        @Nullable Input<String> account,
        Input<String> bucket,
        @Nullable Input<BucketReplicationConfigRuleDestinationEncryptionConfigurationGetArgs> encryptionConfiguration,
        @Nullable Input<BucketReplicationConfigRuleDestinationMetricsGetArgs> metrics,
        @Nullable Input<BucketReplicationConfigRuleDestinationReplicationTimeGetArgs> replicationTime,
        @Nullable Input<String> storageClass) {
        this.accessControlTranslation = accessControlTranslation;
        this.account = account;
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.encryptionConfiguration = encryptionConfiguration;
        this.metrics = metrics;
        this.replicationTime = replicationTime;
        this.storageClass = storageClass;
    }

    private BucketReplicationConfigRuleDestinationGetArgs() {
        this.accessControlTranslation = Input.empty();
        this.account = Input.empty();
        this.bucket = Input.empty();
        this.encryptionConfiguration = Input.empty();
        this.metrics = Input.empty();
        this.replicationTime = Input.empty();
        this.storageClass = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigRuleDestinationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BucketReplicationConfigRuleDestinationAccessControlTranslationGetArgs> accessControlTranslation;
        private @Nullable Input<String> account;
        private Input<String> bucket;
        private @Nullable Input<BucketReplicationConfigRuleDestinationEncryptionConfigurationGetArgs> encryptionConfiguration;
        private @Nullable Input<BucketReplicationConfigRuleDestinationMetricsGetArgs> metrics;
        private @Nullable Input<BucketReplicationConfigRuleDestinationReplicationTimeGetArgs> replicationTime;
        private @Nullable Input<String> storageClass;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigRuleDestinationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessControlTranslation = defaults.accessControlTranslation;
    	      this.account = defaults.account;
    	      this.bucket = defaults.bucket;
    	      this.encryptionConfiguration = defaults.encryptionConfiguration;
    	      this.metrics = defaults.metrics;
    	      this.replicationTime = defaults.replicationTime;
    	      this.storageClass = defaults.storageClass;
        }

        public Builder setAccessControlTranslation(@Nullable Input<BucketReplicationConfigRuleDestinationAccessControlTranslationGetArgs> accessControlTranslation) {
            this.accessControlTranslation = accessControlTranslation;
            return this;
        }

        public Builder setAccessControlTranslation(@Nullable BucketReplicationConfigRuleDestinationAccessControlTranslationGetArgs accessControlTranslation) {
            this.accessControlTranslation = Input.ofNullable(accessControlTranslation);
            return this;
        }

        public Builder setAccount(@Nullable Input<String> account) {
            this.account = account;
            return this;
        }

        public Builder setAccount(@Nullable String account) {
            this.account = Input.ofNullable(account);
            return this;
        }

        public Builder setBucket(Input<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Input.of(Objects.requireNonNull(bucket));
            return this;
        }

        public Builder setEncryptionConfiguration(@Nullable Input<BucketReplicationConfigRuleDestinationEncryptionConfigurationGetArgs> encryptionConfiguration) {
            this.encryptionConfiguration = encryptionConfiguration;
            return this;
        }

        public Builder setEncryptionConfiguration(@Nullable BucketReplicationConfigRuleDestinationEncryptionConfigurationGetArgs encryptionConfiguration) {
            this.encryptionConfiguration = Input.ofNullable(encryptionConfiguration);
            return this;
        }

        public Builder setMetrics(@Nullable Input<BucketReplicationConfigRuleDestinationMetricsGetArgs> metrics) {
            this.metrics = metrics;
            return this;
        }

        public Builder setMetrics(@Nullable BucketReplicationConfigRuleDestinationMetricsGetArgs metrics) {
            this.metrics = Input.ofNullable(metrics);
            return this;
        }

        public Builder setReplicationTime(@Nullable Input<BucketReplicationConfigRuleDestinationReplicationTimeGetArgs> replicationTime) {
            this.replicationTime = replicationTime;
            return this;
        }

        public Builder setReplicationTime(@Nullable BucketReplicationConfigRuleDestinationReplicationTimeGetArgs replicationTime) {
            this.replicationTime = Input.ofNullable(replicationTime);
            return this;
        }

        public Builder setStorageClass(@Nullable Input<String> storageClass) {
            this.storageClass = storageClass;
            return this;
        }

        public Builder setStorageClass(@Nullable String storageClass) {
            this.storageClass = Input.ofNullable(storageClass);
            return this;
        }
        public BucketReplicationConfigRuleDestinationGetArgs build() {
            return new BucketReplicationConfigRuleDestinationGetArgs(accessControlTranslation, account, bucket, encryptionConfiguration, metrics, replicationTime, storageClass);
        }
    }
}
