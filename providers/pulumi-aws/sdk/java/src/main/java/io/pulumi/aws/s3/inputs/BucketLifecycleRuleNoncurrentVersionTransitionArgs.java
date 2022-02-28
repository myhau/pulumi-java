// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketLifecycleRuleNoncurrentVersionTransitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketLifecycleRuleNoncurrentVersionTransitionArgs Empty = new BucketLifecycleRuleNoncurrentVersionTransitionArgs();

    /**
     * Specifies the number of days noncurrent object versions transition.
     * 
     */
    @InputImport(name="days")
      private final @Nullable Input<Integer> days;

    public Input<Integer> getDays() {
        return this.days == null ? Input.empty() : this.days;
    }

    /**
     * Specifies the Amazon S3 [storage class](https://docs.aws.amazon.com/AmazonS3/latest/API/API_Transition.html#AmazonS3-Type-Transition-StorageClass) to which you want the object to transition.
     * 
     */
    @InputImport(name="storageClass", required=true)
      private final Input<String> storageClass;

    public Input<String> getStorageClass() {
        return this.storageClass;
    }

    public BucketLifecycleRuleNoncurrentVersionTransitionArgs(
        @Nullable Input<Integer> days,
        Input<String> storageClass) {
        this.days = days;
        this.storageClass = Objects.requireNonNull(storageClass, "expected parameter 'storageClass' to be non-null");
    }

    private BucketLifecycleRuleNoncurrentVersionTransitionArgs() {
        this.days = Input.empty();
        this.storageClass = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleRuleNoncurrentVersionTransitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> days;
        private Input<String> storageClass;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleRuleNoncurrentVersionTransitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.storageClass = defaults.storageClass;
        }

        public Builder setDays(@Nullable Input<Integer> days) {
            this.days = days;
            return this;
        }

        public Builder setDays(@Nullable Integer days) {
            this.days = Input.ofNullable(days);
            return this;
        }

        public Builder setStorageClass(Input<String> storageClass) {
            this.storageClass = Objects.requireNonNull(storageClass);
            return this;
        }

        public Builder setStorageClass(String storageClass) {
            this.storageClass = Input.of(Objects.requireNonNull(storageClass));
            return this;
        }
        public BucketLifecycleRuleNoncurrentVersionTransitionArgs build() {
            return new BucketLifecycleRuleNoncurrentVersionTransitionArgs(days, storageClass);
        }
    }
}
