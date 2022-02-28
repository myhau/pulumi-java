// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class BucketPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketPolicyArgs Empty = new BucketPolicyArgs();

    /**
     * The name of the bucket to which to apply the policy.
     * 
     */
    @InputImport(name="bucket", required=true)
      private final Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket;
    }

    /**
     * The text of the policy. Although this is a bucket policy rather than an IAM policy, the `aws.iam.getPolicyDocument` data source may be used, so long as it specifies a principal. Note: Bucket policies are limited to 20 KB in size.
     * 
     */
    @InputImport(name="policy", required=true)
      private final Input<String> policy;

    public Input<String> getPolicy() {
        return this.policy;
    }

    public BucketPolicyArgs(
        Input<String> bucket,
        Input<String> policy) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.policy = Objects.requireNonNull(policy, "expected parameter 'policy' to be non-null");
    }

    private BucketPolicyArgs() {
        this.bucket = Input.empty();
        this.policy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bucket;
        private Input<String> policy;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.policy = defaults.policy;
        }

        public Builder setBucket(Input<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Input.of(Objects.requireNonNull(bucket));
            return this;
        }

        public Builder setPolicy(Input<String> policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }
        public BucketPolicyArgs build() {
            return new BucketPolicyArgs(bucket, policy);
        }
    }
}
