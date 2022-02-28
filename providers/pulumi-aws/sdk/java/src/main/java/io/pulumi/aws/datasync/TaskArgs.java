// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datasync;

import io.pulumi.aws.datasync.inputs.TaskExcludesArgs;
import io.pulumi.aws.datasync.inputs.TaskOptionsArgs;
import io.pulumi.aws.datasync.inputs.TaskScheduleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskArgs Empty = new TaskArgs();

    /**
     * Amazon Resource Name (ARN) of the CloudWatch Log Group that is used to monitor and log events in the sync task.
     * 
     */
    @InputImport(name="cloudwatchLogGroupArn")
      private final @Nullable Input<String> cloudwatchLogGroupArn;

    public Input<String> getCloudwatchLogGroupArn() {
        return this.cloudwatchLogGroupArn == null ? Input.empty() : this.cloudwatchLogGroupArn;
    }

    /**
     * Amazon Resource Name (ARN) of destination DataSync Location.
     * 
     */
    @InputImport(name="destinationLocationArn", required=true)
      private final Input<String> destinationLocationArn;

    public Input<String> getDestinationLocationArn() {
        return this.destinationLocationArn;
    }

    /**
     * Filter rules that determines which files to exclude from a task.
     * 
     */
    @InputImport(name="excludes")
      private final @Nullable Input<TaskExcludesArgs> excludes;

    public Input<TaskExcludesArgs> getExcludes() {
        return this.excludes == null ? Input.empty() : this.excludes;
    }

    /**
     * Name of the DataSync Task.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Configuration block containing option that controls the default behavior when you start an execution of this DataSync Task. For each individual task execution, you can override these options by specifying an overriding configuration in those executions.
     * 
     */
    @InputImport(name="options")
      private final @Nullable Input<TaskOptionsArgs> options;

    public Input<TaskOptionsArgs> getOptions() {
        return this.options == null ? Input.empty() : this.options;
    }

    /**
     * Specifies a schedule used to periodically transfer files from a source to a destination location.
     * 
     */
    @InputImport(name="schedule")
      private final @Nullable Input<TaskScheduleArgs> schedule;

    public Input<TaskScheduleArgs> getSchedule() {
        return this.schedule == null ? Input.empty() : this.schedule;
    }

    /**
     * Amazon Resource Name (ARN) of source DataSync Location.
     * 
     */
    @InputImport(name="sourceLocationArn", required=true)
      private final Input<String> sourceLocationArn;

    public Input<String> getSourceLocationArn() {
        return this.sourceLocationArn;
    }

    /**
     * Key-value pairs of resource tags to assign to the DataSync Task. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public TaskArgs(
        @Nullable Input<String> cloudwatchLogGroupArn,
        Input<String> destinationLocationArn,
        @Nullable Input<TaskExcludesArgs> excludes,
        @Nullable Input<String> name,
        @Nullable Input<TaskOptionsArgs> options,
        @Nullable Input<TaskScheduleArgs> schedule,
        Input<String> sourceLocationArn,
        @Nullable Input<Map<String,String>> tags) {
        this.cloudwatchLogGroupArn = cloudwatchLogGroupArn;
        this.destinationLocationArn = Objects.requireNonNull(destinationLocationArn, "expected parameter 'destinationLocationArn' to be non-null");
        this.excludes = excludes;
        this.name = name;
        this.options = options;
        this.schedule = schedule;
        this.sourceLocationArn = Objects.requireNonNull(sourceLocationArn, "expected parameter 'sourceLocationArn' to be non-null");
        this.tags = tags;
    }

    private TaskArgs() {
        this.cloudwatchLogGroupArn = Input.empty();
        this.destinationLocationArn = Input.empty();
        this.excludes = Input.empty();
        this.name = Input.empty();
        this.options = Input.empty();
        this.schedule = Input.empty();
        this.sourceLocationArn = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cloudwatchLogGroupArn;
        private Input<String> destinationLocationArn;
        private @Nullable Input<TaskExcludesArgs> excludes;
        private @Nullable Input<String> name;
        private @Nullable Input<TaskOptionsArgs> options;
        private @Nullable Input<TaskScheduleArgs> schedule;
        private Input<String> sourceLocationArn;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchLogGroupArn = defaults.cloudwatchLogGroupArn;
    	      this.destinationLocationArn = defaults.destinationLocationArn;
    	      this.excludes = defaults.excludes;
    	      this.name = defaults.name;
    	      this.options = defaults.options;
    	      this.schedule = defaults.schedule;
    	      this.sourceLocationArn = defaults.sourceLocationArn;
    	      this.tags = defaults.tags;
        }

        public Builder setCloudwatchLogGroupArn(@Nullable Input<String> cloudwatchLogGroupArn) {
            this.cloudwatchLogGroupArn = cloudwatchLogGroupArn;
            return this;
        }

        public Builder setCloudwatchLogGroupArn(@Nullable String cloudwatchLogGroupArn) {
            this.cloudwatchLogGroupArn = Input.ofNullable(cloudwatchLogGroupArn);
            return this;
        }

        public Builder setDestinationLocationArn(Input<String> destinationLocationArn) {
            this.destinationLocationArn = Objects.requireNonNull(destinationLocationArn);
            return this;
        }

        public Builder setDestinationLocationArn(String destinationLocationArn) {
            this.destinationLocationArn = Input.of(Objects.requireNonNull(destinationLocationArn));
            return this;
        }

        public Builder setExcludes(@Nullable Input<TaskExcludesArgs> excludes) {
            this.excludes = excludes;
            return this;
        }

        public Builder setExcludes(@Nullable TaskExcludesArgs excludes) {
            this.excludes = Input.ofNullable(excludes);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setOptions(@Nullable Input<TaskOptionsArgs> options) {
            this.options = options;
            return this;
        }

        public Builder setOptions(@Nullable TaskOptionsArgs options) {
            this.options = Input.ofNullable(options);
            return this;
        }

        public Builder setSchedule(@Nullable Input<TaskScheduleArgs> schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder setSchedule(@Nullable TaskScheduleArgs schedule) {
            this.schedule = Input.ofNullable(schedule);
            return this;
        }

        public Builder setSourceLocationArn(Input<String> sourceLocationArn) {
            this.sourceLocationArn = Objects.requireNonNull(sourceLocationArn);
            return this;
        }

        public Builder setSourceLocationArn(String sourceLocationArn) {
            this.sourceLocationArn = Input.of(Objects.requireNonNull(sourceLocationArn));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public TaskArgs build() {
            return new TaskArgs(cloudwatchLogGroupArn, destinationLocationArn, excludes, name, options, schedule, sourceLocationArn, tags);
        }
    }
}
