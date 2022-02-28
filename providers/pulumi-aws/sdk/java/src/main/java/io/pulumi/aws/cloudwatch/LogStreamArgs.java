// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LogStreamArgs extends io.pulumi.resources.ResourceArgs {

    public static final LogStreamArgs Empty = new LogStreamArgs();

    /**
     * The name of the log group under which the log stream is to be created.
     * 
     */
    @InputImport(name="logGroupName", required=true)
      private final Input<String> logGroupName;

    public Input<String> getLogGroupName() {
        return this.logGroupName;
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

    public LogStreamArgs(
        Input<String> logGroupName,
        @Nullable Input<String> name) {
        this.logGroupName = Objects.requireNonNull(logGroupName, "expected parameter 'logGroupName' to be non-null");
        this.name = name;
    }

    private LogStreamArgs() {
        this.logGroupName = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogStreamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> logGroupName;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(LogStreamArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logGroupName = defaults.logGroupName;
    	      this.name = defaults.name;
        }

        public Builder setLogGroupName(Input<String> logGroupName) {
            this.logGroupName = Objects.requireNonNull(logGroupName);
            return this;
        }

        public Builder setLogGroupName(String logGroupName) {
            this.logGroupName = Input.of(Objects.requireNonNull(logGroupName));
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
        public LogStreamArgs build() {
            return new LogStreamArgs(logGroupName, name);
        }
    }
}
