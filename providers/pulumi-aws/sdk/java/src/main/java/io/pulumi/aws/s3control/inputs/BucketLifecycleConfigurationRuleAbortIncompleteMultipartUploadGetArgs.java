// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3control.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadGetArgs Empty = new BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadGetArgs();

    /**
     * Number of days after which Amazon S3 aborts an incomplete multipart upload.
     * 
     */
    @InputImport(name="daysAfterInitiation", required=true)
      private final Input<Integer> daysAfterInitiation;

    public Input<Integer> getDaysAfterInitiation() {
        return this.daysAfterInitiation;
    }

    public BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadGetArgs(Input<Integer> daysAfterInitiation) {
        this.daysAfterInitiation = Objects.requireNonNull(daysAfterInitiation, "expected parameter 'daysAfterInitiation' to be non-null");
    }

    private BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadGetArgs() {
        this.daysAfterInitiation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> daysAfterInitiation;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysAfterInitiation = defaults.daysAfterInitiation;
        }

        public Builder setDaysAfterInitiation(Input<Integer> daysAfterInitiation) {
            this.daysAfterInitiation = Objects.requireNonNull(daysAfterInitiation);
            return this;
        }

        public Builder setDaysAfterInitiation(Integer daysAfterInitiation) {
            this.daysAfterInitiation = Input.of(Objects.requireNonNull(daysAfterInitiation));
            return this;
        }
        public BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadGetArgs build() {
            return new BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadGetArgs(daysAfterInitiation);
        }
    }
}
