// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventTargetBatchTargetGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventTargetBatchTargetGetArgs Empty = new EventTargetBatchTargetGetArgs();

    /**
     * The size of the array, if this is an array batch job. Valid values are integers between 2 and 10,000.
     * 
     */
    @InputImport(name="arraySize")
      private final @Nullable Input<Integer> arraySize;

    public Input<Integer> getArraySize() {
        return this.arraySize == null ? Input.empty() : this.arraySize;
    }

    /**
     * The number of times to attempt to retry, if the job fails. Valid values are 1 to 10.
     * 
     */
    @InputImport(name="jobAttempts")
      private final @Nullable Input<Integer> jobAttempts;

    public Input<Integer> getJobAttempts() {
        return this.jobAttempts == null ? Input.empty() : this.jobAttempts;
    }

    /**
     * The ARN or name of the job definition to use if the event target is an AWS Batch job. This job definition must already exist.
     * 
     */
    @InputImport(name="jobDefinition", required=true)
      private final Input<String> jobDefinition;

    public Input<String> getJobDefinition() {
        return this.jobDefinition;
    }

    /**
     * The name to use for this execution of the job, if the target is an AWS Batch job.
     * 
     */
    @InputImport(name="jobName", required=true)
      private final Input<String> jobName;

    public Input<String> getJobName() {
        return this.jobName;
    }

    public EventTargetBatchTargetGetArgs(
        @Nullable Input<Integer> arraySize,
        @Nullable Input<Integer> jobAttempts,
        Input<String> jobDefinition,
        Input<String> jobName) {
        this.arraySize = arraySize;
        this.jobAttempts = jobAttempts;
        this.jobDefinition = Objects.requireNonNull(jobDefinition, "expected parameter 'jobDefinition' to be non-null");
        this.jobName = Objects.requireNonNull(jobName, "expected parameter 'jobName' to be non-null");
    }

    private EventTargetBatchTargetGetArgs() {
        this.arraySize = Input.empty();
        this.jobAttempts = Input.empty();
        this.jobDefinition = Input.empty();
        this.jobName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventTargetBatchTargetGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> arraySize;
        private @Nullable Input<Integer> jobAttempts;
        private Input<String> jobDefinition;
        private Input<String> jobName;

        public Builder() {
    	      // Empty
        }

        public Builder(EventTargetBatchTargetGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arraySize = defaults.arraySize;
    	      this.jobAttempts = defaults.jobAttempts;
    	      this.jobDefinition = defaults.jobDefinition;
    	      this.jobName = defaults.jobName;
        }

        public Builder setArraySize(@Nullable Input<Integer> arraySize) {
            this.arraySize = arraySize;
            return this;
        }

        public Builder setArraySize(@Nullable Integer arraySize) {
            this.arraySize = Input.ofNullable(arraySize);
            return this;
        }

        public Builder setJobAttempts(@Nullable Input<Integer> jobAttempts) {
            this.jobAttempts = jobAttempts;
            return this;
        }

        public Builder setJobAttempts(@Nullable Integer jobAttempts) {
            this.jobAttempts = Input.ofNullable(jobAttempts);
            return this;
        }

        public Builder setJobDefinition(Input<String> jobDefinition) {
            this.jobDefinition = Objects.requireNonNull(jobDefinition);
            return this;
        }

        public Builder setJobDefinition(String jobDefinition) {
            this.jobDefinition = Input.of(Objects.requireNonNull(jobDefinition));
            return this;
        }

        public Builder setJobName(Input<String> jobName) {
            this.jobName = Objects.requireNonNull(jobName);
            return this;
        }

        public Builder setJobName(String jobName) {
            this.jobName = Input.of(Objects.requireNonNull(jobName));
            return this;
        }
        public EventTargetBatchTargetGetArgs build() {
            return new EventTargetBatchTargetGetArgs(arraySize, jobAttempts, jobDefinition, jobName);
        }
    }
}
