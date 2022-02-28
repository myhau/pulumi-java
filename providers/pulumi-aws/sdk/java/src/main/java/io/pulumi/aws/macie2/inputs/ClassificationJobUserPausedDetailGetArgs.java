// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClassificationJobUserPausedDetailGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClassificationJobUserPausedDetailGetArgs Empty = new ClassificationJobUserPausedDetailGetArgs();

    @InputImport(name="jobExpiresAt")
      private final @Nullable Input<String> jobExpiresAt;

    public Input<String> getJobExpiresAt() {
        return this.jobExpiresAt == null ? Input.empty() : this.jobExpiresAt;
    }

    @InputImport(name="jobImminentExpirationHealthEventArn")
      private final @Nullable Input<String> jobImminentExpirationHealthEventArn;

    public Input<String> getJobImminentExpirationHealthEventArn() {
        return this.jobImminentExpirationHealthEventArn == null ? Input.empty() : this.jobImminentExpirationHealthEventArn;
    }

    @InputImport(name="jobPausedAt")
      private final @Nullable Input<String> jobPausedAt;

    public Input<String> getJobPausedAt() {
        return this.jobPausedAt == null ? Input.empty() : this.jobPausedAt;
    }

    public ClassificationJobUserPausedDetailGetArgs(
        @Nullable Input<String> jobExpiresAt,
        @Nullable Input<String> jobImminentExpirationHealthEventArn,
        @Nullable Input<String> jobPausedAt) {
        this.jobExpiresAt = jobExpiresAt;
        this.jobImminentExpirationHealthEventArn = jobImminentExpirationHealthEventArn;
        this.jobPausedAt = jobPausedAt;
    }

    private ClassificationJobUserPausedDetailGetArgs() {
        this.jobExpiresAt = Input.empty();
        this.jobImminentExpirationHealthEventArn = Input.empty();
        this.jobPausedAt = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassificationJobUserPausedDetailGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> jobExpiresAt;
        private @Nullable Input<String> jobImminentExpirationHealthEventArn;
        private @Nullable Input<String> jobPausedAt;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassificationJobUserPausedDetailGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobExpiresAt = defaults.jobExpiresAt;
    	      this.jobImminentExpirationHealthEventArn = defaults.jobImminentExpirationHealthEventArn;
    	      this.jobPausedAt = defaults.jobPausedAt;
        }

        public Builder setJobExpiresAt(@Nullable Input<String> jobExpiresAt) {
            this.jobExpiresAt = jobExpiresAt;
            return this;
        }

        public Builder setJobExpiresAt(@Nullable String jobExpiresAt) {
            this.jobExpiresAt = Input.ofNullable(jobExpiresAt);
            return this;
        }

        public Builder setJobImminentExpirationHealthEventArn(@Nullable Input<String> jobImminentExpirationHealthEventArn) {
            this.jobImminentExpirationHealthEventArn = jobImminentExpirationHealthEventArn;
            return this;
        }

        public Builder setJobImminentExpirationHealthEventArn(@Nullable String jobImminentExpirationHealthEventArn) {
            this.jobImminentExpirationHealthEventArn = Input.ofNullable(jobImminentExpirationHealthEventArn);
            return this;
        }

        public Builder setJobPausedAt(@Nullable Input<String> jobPausedAt) {
            this.jobPausedAt = jobPausedAt;
            return this;
        }

        public Builder setJobPausedAt(@Nullable String jobPausedAt) {
            this.jobPausedAt = Input.ofNullable(jobPausedAt);
            return this;
        }
        public ClassificationJobUserPausedDetailGetArgs build() {
            return new ClassificationJobUserPausedDetailGetArgs(jobExpiresAt, jobImminentExpirationHealthEventArn, jobPausedAt);
        }
    }
}
