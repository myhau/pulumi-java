// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.aws.glue.inputs.SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionArgs;
import io.pulumi.aws.glue.inputs.SecurityConfigurationEncryptionConfigurationJobBookmarksEncryptionArgs;
import io.pulumi.aws.glue.inputs.SecurityConfigurationEncryptionConfigurationS3EncryptionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


public final class SecurityConfigurationEncryptionConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityConfigurationEncryptionConfigurationArgs Empty = new SecurityConfigurationEncryptionConfigurationArgs();

    @InputImport(name="cloudwatchEncryption", required=true)
      private final Input<SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionArgs> cloudwatchEncryption;

    public Input<SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionArgs> getCloudwatchEncryption() {
        return this.cloudwatchEncryption;
    }

    @InputImport(name="jobBookmarksEncryption", required=true)
      private final Input<SecurityConfigurationEncryptionConfigurationJobBookmarksEncryptionArgs> jobBookmarksEncryption;

    public Input<SecurityConfigurationEncryptionConfigurationJobBookmarksEncryptionArgs> getJobBookmarksEncryption() {
        return this.jobBookmarksEncryption;
    }

    /**
     * A ` s3_encryption  ` block as described below, which contains encryption configuration for S3 data.
     * 
     */
    @InputImport(name="s3Encryption", required=true)
      private final Input<SecurityConfigurationEncryptionConfigurationS3EncryptionArgs> s3Encryption;

    public Input<SecurityConfigurationEncryptionConfigurationS3EncryptionArgs> getS3Encryption() {
        return this.s3Encryption;
    }

    public SecurityConfigurationEncryptionConfigurationArgs(
        Input<SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionArgs> cloudwatchEncryption,
        Input<SecurityConfigurationEncryptionConfigurationJobBookmarksEncryptionArgs> jobBookmarksEncryption,
        Input<SecurityConfigurationEncryptionConfigurationS3EncryptionArgs> s3Encryption) {
        this.cloudwatchEncryption = Objects.requireNonNull(cloudwatchEncryption, "expected parameter 'cloudwatchEncryption' to be non-null");
        this.jobBookmarksEncryption = Objects.requireNonNull(jobBookmarksEncryption, "expected parameter 'jobBookmarksEncryption' to be non-null");
        this.s3Encryption = Objects.requireNonNull(s3Encryption, "expected parameter 's3Encryption' to be non-null");
    }

    private SecurityConfigurationEncryptionConfigurationArgs() {
        this.cloudwatchEncryption = Input.empty();
        this.jobBookmarksEncryption = Input.empty();
        this.s3Encryption = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityConfigurationEncryptionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionArgs> cloudwatchEncryption;
        private Input<SecurityConfigurationEncryptionConfigurationJobBookmarksEncryptionArgs> jobBookmarksEncryption;
        private Input<SecurityConfigurationEncryptionConfigurationS3EncryptionArgs> s3Encryption;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityConfigurationEncryptionConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchEncryption = defaults.cloudwatchEncryption;
    	      this.jobBookmarksEncryption = defaults.jobBookmarksEncryption;
    	      this.s3Encryption = defaults.s3Encryption;
        }

        public Builder setCloudwatchEncryption(Input<SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionArgs> cloudwatchEncryption) {
            this.cloudwatchEncryption = Objects.requireNonNull(cloudwatchEncryption);
            return this;
        }

        public Builder setCloudwatchEncryption(SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionArgs cloudwatchEncryption) {
            this.cloudwatchEncryption = Input.of(Objects.requireNonNull(cloudwatchEncryption));
            return this;
        }

        public Builder setJobBookmarksEncryption(Input<SecurityConfigurationEncryptionConfigurationJobBookmarksEncryptionArgs> jobBookmarksEncryption) {
            this.jobBookmarksEncryption = Objects.requireNonNull(jobBookmarksEncryption);
            return this;
        }

        public Builder setJobBookmarksEncryption(SecurityConfigurationEncryptionConfigurationJobBookmarksEncryptionArgs jobBookmarksEncryption) {
            this.jobBookmarksEncryption = Input.of(Objects.requireNonNull(jobBookmarksEncryption));
            return this;
        }

        public Builder setS3Encryption(Input<SecurityConfigurationEncryptionConfigurationS3EncryptionArgs> s3Encryption) {
            this.s3Encryption = Objects.requireNonNull(s3Encryption);
            return this;
        }

        public Builder setS3Encryption(SecurityConfigurationEncryptionConfigurationS3EncryptionArgs s3Encryption) {
            this.s3Encryption = Input.of(Objects.requireNonNull(s3Encryption));
            return this;
        }
        public SecurityConfigurationEncryptionConfigurationArgs build() {
            return new SecurityConfigurationEncryptionConfigurationArgs(cloudwatchEncryption, jobBookmarksEncryption, s3Encryption);
        }
    }
}
