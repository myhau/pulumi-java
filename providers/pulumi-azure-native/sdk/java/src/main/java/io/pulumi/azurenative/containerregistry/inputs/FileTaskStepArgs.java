// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.inputs.SetValueArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties of a task step.
 * 
 */
public final class FileTaskStepArgs extends io.pulumi.resources.ResourceArgs {

    public static final FileTaskStepArgs Empty = new FileTaskStepArgs();

    /**
     * The token (git PAT or SAS token of storage account blob) associated with the context for a step.
     * 
     */
    @Import(name="contextAccessToken")
      private final @Nullable Output<String> contextAccessToken;

    public Output<String> contextAccessToken() {
        return this.contextAccessToken == null ? Codegen.empty() : this.contextAccessToken;
    }

    /**
     * The URL(absolute or relative) of the source context for the task step.
     * 
     */
    @Import(name="contextPath")
      private final @Nullable Output<String> contextPath;

    public Output<String> contextPath() {
        return this.contextPath == null ? Codegen.empty() : this.contextPath;
    }

    /**
     * The task template/definition file path relative to the source context.
     * 
     */
    @Import(name="taskFilePath", required=true)
      private final Output<String> taskFilePath;

    public Output<String> taskFilePath() {
        return this.taskFilePath;
    }

    /**
     * The type of the step.
     * Expected value is 'FileTask'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * The collection of overridable values that can be passed when running a task.
     * 
     */
    @Import(name="values")
      private final @Nullable Output<List<SetValueArgs>> values;

    public Output<List<SetValueArgs>> values() {
        return this.values == null ? Codegen.empty() : this.values;
    }

    /**
     * The task values/parameters file path relative to the source context.
     * 
     */
    @Import(name="valuesFilePath")
      private final @Nullable Output<String> valuesFilePath;

    public Output<String> valuesFilePath() {
        return this.valuesFilePath == null ? Codegen.empty() : this.valuesFilePath;
    }

    public FileTaskStepArgs(
        @Nullable Output<String> contextAccessToken,
        @Nullable Output<String> contextPath,
        Output<String> taskFilePath,
        Output<String> type,
        @Nullable Output<List<SetValueArgs>> values,
        @Nullable Output<String> valuesFilePath) {
        this.contextAccessToken = contextAccessToken;
        this.contextPath = contextPath;
        this.taskFilePath = Objects.requireNonNull(taskFilePath, "expected parameter 'taskFilePath' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.values = values;
        this.valuesFilePath = valuesFilePath;
    }

    private FileTaskStepArgs() {
        this.contextAccessToken = Codegen.empty();
        this.contextPath = Codegen.empty();
        this.taskFilePath = Codegen.empty();
        this.type = Codegen.empty();
        this.values = Codegen.empty();
        this.valuesFilePath = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileTaskStepArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> contextAccessToken;
        private @Nullable Output<String> contextPath;
        private Output<String> taskFilePath;
        private Output<String> type;
        private @Nullable Output<List<SetValueArgs>> values;
        private @Nullable Output<String> valuesFilePath;

        public Builder() {
    	      // Empty
        }

        public Builder(FileTaskStepArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contextAccessToken = defaults.contextAccessToken;
    	      this.contextPath = defaults.contextPath;
    	      this.taskFilePath = defaults.taskFilePath;
    	      this.type = defaults.type;
    	      this.values = defaults.values;
    	      this.valuesFilePath = defaults.valuesFilePath;
        }

        public Builder contextAccessToken(@Nullable Output<String> contextAccessToken) {
            this.contextAccessToken = contextAccessToken;
            return this;
        }
        public Builder contextAccessToken(@Nullable String contextAccessToken) {
            this.contextAccessToken = Codegen.ofNullable(contextAccessToken);
            return this;
        }
        public Builder contextPath(@Nullable Output<String> contextPath) {
            this.contextPath = contextPath;
            return this;
        }
        public Builder contextPath(@Nullable String contextPath) {
            this.contextPath = Codegen.ofNullable(contextPath);
            return this;
        }
        public Builder taskFilePath(Output<String> taskFilePath) {
            this.taskFilePath = Objects.requireNonNull(taskFilePath);
            return this;
        }
        public Builder taskFilePath(String taskFilePath) {
            this.taskFilePath = Output.of(Objects.requireNonNull(taskFilePath));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder values(@Nullable Output<List<SetValueArgs>> values) {
            this.values = values;
            return this;
        }
        public Builder values(@Nullable List<SetValueArgs> values) {
            this.values = Codegen.ofNullable(values);
            return this;
        }
        public Builder values(SetValueArgs... values) {
            return values(List.of(values));
        }
        public Builder valuesFilePath(@Nullable Output<String> valuesFilePath) {
            this.valuesFilePath = valuesFilePath;
            return this;
        }
        public Builder valuesFilePath(@Nullable String valuesFilePath) {
            this.valuesFilePath = Codegen.ofNullable(valuesFilePath);
            return this;
        }        public FileTaskStepArgs build() {
            return new FileTaskStepArgs(contextAccessToken, contextPath, taskFilePath, type, values, valuesFilePath);
        }
    }
}
