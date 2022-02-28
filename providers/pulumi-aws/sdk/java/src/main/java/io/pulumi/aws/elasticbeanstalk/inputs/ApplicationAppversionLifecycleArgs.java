// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticbeanstalk.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationAppversionLifecycleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationAppversionLifecycleArgs Empty = new ApplicationAppversionLifecycleArgs();

    /**
     * Set to `true` to delete a version's source bundle from S3 when the application version is deleted.
     * 
     */
    @InputImport(name="deleteSourceFromS3")
      private final @Nullable Input<Boolean> deleteSourceFromS3;

    public Input<Boolean> getDeleteSourceFromS3() {
        return this.deleteSourceFromS3 == null ? Input.empty() : this.deleteSourceFromS3;
    }

    /**
     * The number of days to retain an application version ('max_age_in_days' and 'max_count' cannot be enabled simultaneously.).
     * 
     */
    @InputImport(name="maxAgeInDays")
      private final @Nullable Input<Integer> maxAgeInDays;

    public Input<Integer> getMaxAgeInDays() {
        return this.maxAgeInDays == null ? Input.empty() : this.maxAgeInDays;
    }

    /**
     * The maximum number of application versions to retain ('max_age_in_days' and 'max_count' cannot be enabled simultaneously.).
     * 
     */
    @InputImport(name="maxCount")
      private final @Nullable Input<Integer> maxCount;

    public Input<Integer> getMaxCount() {
        return this.maxCount == null ? Input.empty() : this.maxCount;
    }

    /**
     * The ARN of an IAM service role under which the application version is deleted.  Elastic Beanstalk must have permission to assume this role.
     * 
     */
    @InputImport(name="serviceRole", required=true)
      private final Input<String> serviceRole;

    public Input<String> getServiceRole() {
        return this.serviceRole;
    }

    public ApplicationAppversionLifecycleArgs(
        @Nullable Input<Boolean> deleteSourceFromS3,
        @Nullable Input<Integer> maxAgeInDays,
        @Nullable Input<Integer> maxCount,
        Input<String> serviceRole) {
        this.deleteSourceFromS3 = deleteSourceFromS3;
        this.maxAgeInDays = maxAgeInDays;
        this.maxCount = maxCount;
        this.serviceRole = Objects.requireNonNull(serviceRole, "expected parameter 'serviceRole' to be non-null");
    }

    private ApplicationAppversionLifecycleArgs() {
        this.deleteSourceFromS3 = Input.empty();
        this.maxAgeInDays = Input.empty();
        this.maxCount = Input.empty();
        this.serviceRole = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationAppversionLifecycleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> deleteSourceFromS3;
        private @Nullable Input<Integer> maxAgeInDays;
        private @Nullable Input<Integer> maxCount;
        private Input<String> serviceRole;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationAppversionLifecycleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteSourceFromS3 = defaults.deleteSourceFromS3;
    	      this.maxAgeInDays = defaults.maxAgeInDays;
    	      this.maxCount = defaults.maxCount;
    	      this.serviceRole = defaults.serviceRole;
        }

        public Builder setDeleteSourceFromS3(@Nullable Input<Boolean> deleteSourceFromS3) {
            this.deleteSourceFromS3 = deleteSourceFromS3;
            return this;
        }

        public Builder setDeleteSourceFromS3(@Nullable Boolean deleteSourceFromS3) {
            this.deleteSourceFromS3 = Input.ofNullable(deleteSourceFromS3);
            return this;
        }

        public Builder setMaxAgeInDays(@Nullable Input<Integer> maxAgeInDays) {
            this.maxAgeInDays = maxAgeInDays;
            return this;
        }

        public Builder setMaxAgeInDays(@Nullable Integer maxAgeInDays) {
            this.maxAgeInDays = Input.ofNullable(maxAgeInDays);
            return this;
        }

        public Builder setMaxCount(@Nullable Input<Integer> maxCount) {
            this.maxCount = maxCount;
            return this;
        }

        public Builder setMaxCount(@Nullable Integer maxCount) {
            this.maxCount = Input.ofNullable(maxCount);
            return this;
        }

        public Builder setServiceRole(Input<String> serviceRole) {
            this.serviceRole = Objects.requireNonNull(serviceRole);
            return this;
        }

        public Builder setServiceRole(String serviceRole) {
            this.serviceRole = Input.of(Objects.requireNonNull(serviceRole));
            return this;
        }
        public ApplicationAppversionLifecycleArgs build() {
            return new ApplicationAppversionLifecycleArgs(deleteSourceFromS3, maxAgeInDays, maxCount, serviceRole);
        }
    }
}
