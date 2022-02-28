// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cfg.inputs;

import io.pulumi.aws.cfg.inputs.DeliveryChannelSnapshotDeliveryPropertiesGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeliveryChannelState extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryChannelState Empty = new DeliveryChannelState();

    /**
     * The name of the delivery channel. Defaults to `default`. Changing it recreates the resource.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The name of the S3 bucket used to store the configuration history.
     * 
     */
    @InputImport(name="s3BucketName")
      private final @Nullable Input<String> s3BucketName;

    public Input<String> getS3BucketName() {
        return this.s3BucketName == null ? Input.empty() : this.s3BucketName;
    }

    /**
     * The prefix for the specified S3 bucket.
     * 
     */
    @InputImport(name="s3KeyPrefix")
      private final @Nullable Input<String> s3KeyPrefix;

    public Input<String> getS3KeyPrefix() {
        return this.s3KeyPrefix == null ? Input.empty() : this.s3KeyPrefix;
    }

    /**
     * The ARN of the AWS KMS key used to encrypt objects delivered by AWS Config. Must belong to the same Region as the destination S3 bucket.
     * 
     */
    @InputImport(name="s3KmsKeyArn")
      private final @Nullable Input<String> s3KmsKeyArn;

    public Input<String> getS3KmsKeyArn() {
        return this.s3KmsKeyArn == null ? Input.empty() : this.s3KmsKeyArn;
    }

    /**
     * Options for how AWS Config delivers configuration snapshots. See below
     * 
     */
    @InputImport(name="snapshotDeliveryProperties")
      private final @Nullable Input<DeliveryChannelSnapshotDeliveryPropertiesGetArgs> snapshotDeliveryProperties;

    public Input<DeliveryChannelSnapshotDeliveryPropertiesGetArgs> getSnapshotDeliveryProperties() {
        return this.snapshotDeliveryProperties == null ? Input.empty() : this.snapshotDeliveryProperties;
    }

    /**
     * The ARN of the SNS topic that AWS Config delivers notifications to.
     * 
     */
    @InputImport(name="snsTopicArn")
      private final @Nullable Input<String> snsTopicArn;

    public Input<String> getSnsTopicArn() {
        return this.snsTopicArn == null ? Input.empty() : this.snsTopicArn;
    }

    public DeliveryChannelState(
        @Nullable Input<String> name,
        @Nullable Input<String> s3BucketName,
        @Nullable Input<String> s3KeyPrefix,
        @Nullable Input<String> s3KmsKeyArn,
        @Nullable Input<DeliveryChannelSnapshotDeliveryPropertiesGetArgs> snapshotDeliveryProperties,
        @Nullable Input<String> snsTopicArn) {
        this.name = name;
        this.s3BucketName = s3BucketName;
        this.s3KeyPrefix = s3KeyPrefix;
        this.s3KmsKeyArn = s3KmsKeyArn;
        this.snapshotDeliveryProperties = snapshotDeliveryProperties;
        this.snsTopicArn = snsTopicArn;
    }

    private DeliveryChannelState() {
        this.name = Input.empty();
        this.s3BucketName = Input.empty();
        this.s3KeyPrefix = Input.empty();
        this.s3KmsKeyArn = Input.empty();
        this.snapshotDeliveryProperties = Input.empty();
        this.snsTopicArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryChannelState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<String> s3BucketName;
        private @Nullable Input<String> s3KeyPrefix;
        private @Nullable Input<String> s3KmsKeyArn;
        private @Nullable Input<DeliveryChannelSnapshotDeliveryPropertiesGetArgs> snapshotDeliveryProperties;
        private @Nullable Input<String> snsTopicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryChannelState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.s3BucketName = defaults.s3BucketName;
    	      this.s3KeyPrefix = defaults.s3KeyPrefix;
    	      this.s3KmsKeyArn = defaults.s3KmsKeyArn;
    	      this.snapshotDeliveryProperties = defaults.snapshotDeliveryProperties;
    	      this.snsTopicArn = defaults.snsTopicArn;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setS3BucketName(@Nullable Input<String> s3BucketName) {
            this.s3BucketName = s3BucketName;
            return this;
        }

        public Builder setS3BucketName(@Nullable String s3BucketName) {
            this.s3BucketName = Input.ofNullable(s3BucketName);
            return this;
        }

        public Builder setS3KeyPrefix(@Nullable Input<String> s3KeyPrefix) {
            this.s3KeyPrefix = s3KeyPrefix;
            return this;
        }

        public Builder setS3KeyPrefix(@Nullable String s3KeyPrefix) {
            this.s3KeyPrefix = Input.ofNullable(s3KeyPrefix);
            return this;
        }

        public Builder setS3KmsKeyArn(@Nullable Input<String> s3KmsKeyArn) {
            this.s3KmsKeyArn = s3KmsKeyArn;
            return this;
        }

        public Builder setS3KmsKeyArn(@Nullable String s3KmsKeyArn) {
            this.s3KmsKeyArn = Input.ofNullable(s3KmsKeyArn);
            return this;
        }

        public Builder setSnapshotDeliveryProperties(@Nullable Input<DeliveryChannelSnapshotDeliveryPropertiesGetArgs> snapshotDeliveryProperties) {
            this.snapshotDeliveryProperties = snapshotDeliveryProperties;
            return this;
        }

        public Builder setSnapshotDeliveryProperties(@Nullable DeliveryChannelSnapshotDeliveryPropertiesGetArgs snapshotDeliveryProperties) {
            this.snapshotDeliveryProperties = Input.ofNullable(snapshotDeliveryProperties);
            return this;
        }

        public Builder setSnsTopicArn(@Nullable Input<String> snsTopicArn) {
            this.snsTopicArn = snsTopicArn;
            return this;
        }

        public Builder setSnsTopicArn(@Nullable String snsTopicArn) {
            this.snsTopicArn = Input.ofNullable(snsTopicArn);
            return this;
        }
        public DeliveryChannelState build() {
            return new DeliveryChannelState(name, s3BucketName, s3KeyPrefix, s3KmsKeyArn, snapshotDeliveryProperties, snsTopicArn);
        }
    }
}
