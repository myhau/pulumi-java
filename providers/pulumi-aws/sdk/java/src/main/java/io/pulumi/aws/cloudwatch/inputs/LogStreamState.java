// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LogStreamState extends io.pulumi.resources.ResourceArgs {

    public static final LogStreamState Empty = new LogStreamState();

    /**
     * The Amazon Resource Name (ARN) specifying the log stream.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The name of the log group under which the log stream is to be created.
     * 
     */
    @InputImport(name="logGroupName")
      private final @Nullable Input<String> logGroupName;

    public Input<String> getLogGroupName() {
        return this.logGroupName == null ? Input.empty() : this.logGroupName;
    }

    /**
     * The name of the log stream. Must not be longer than 512 characters and must not contain `:`
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public LogStreamState(
        @Nullable Input<String> arn,
        @Nullable Input<String> logGroupName,
        @Nullable Input<String> name) {
        this.arn = arn;
        this.logGroupName = logGroupName;
        this.name = name;
    }

    private LogStreamState() {
        this.arn = Input.empty();
        this.logGroupName = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogStreamState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> logGroupName;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(LogStreamState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.logGroupName = defaults.logGroupName;
    	      this.name = defaults.name;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setLogGroupName(@Nullable Input<String> logGroupName) {
            this.logGroupName = logGroupName;
            return this;
        }

        public Builder setLogGroupName(@Nullable String logGroupName) {
            this.logGroupName = Input.ofNullable(logGroupName);
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
        public LogStreamState build() {
            return new LogStreamState(arn, logGroupName, name);
        }
    }
}
