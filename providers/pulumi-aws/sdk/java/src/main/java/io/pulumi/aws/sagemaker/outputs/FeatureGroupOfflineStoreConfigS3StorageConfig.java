// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FeatureGroupOfflineStoreConfigS3StorageConfig {
    /**
     * The ID of the AWS Key Management Service (AWS KMS) key that SageMaker Feature Store uses to encrypt the Amazon S3 objects at rest using Amazon S3 server-side encryption.
     * 
     */
    private final @Nullable String kmsKeyId;
    /**
     * The S3 URI, or location in Amazon S3, of OfflineStore.
     * 
     */
    private final String s3Uri;

    @OutputCustomType.Constructor({"kmsKeyId","s3Uri"})
    private FeatureGroupOfflineStoreConfigS3StorageConfig(
        @Nullable String kmsKeyId,
        String s3Uri) {
        this.kmsKeyId = kmsKeyId;
        this.s3Uri = Objects.requireNonNull(s3Uri);
    }

    /**
     * The ID of the AWS Key Management Service (AWS KMS) key that SageMaker Feature Store uses to encrypt the Amazon S3 objects at rest using Amazon S3 server-side encryption.
     * 
     */
    public Optional<String> getKmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }
    /**
     * The S3 URI, or location in Amazon S3, of OfflineStore.
     * 
     */
    public String getS3Uri() {
        return this.s3Uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureGroupOfflineStoreConfigS3StorageConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kmsKeyId;
        private String s3Uri;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureGroupOfflineStoreConfigS3StorageConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.s3Uri = defaults.s3Uri;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setS3Uri(String s3Uri) {
            this.s3Uri = Objects.requireNonNull(s3Uri);
            return this;
        }
        public FeatureGroupOfflineStoreConfigS3StorageConfig build() {
            return new FeatureGroupOfflineStoreConfigS3StorageConfig(kmsKeyId, s3Uri);
        }
    }
}
