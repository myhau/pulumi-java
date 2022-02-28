// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue;

import io.pulumi.aws.glue.inputs.MLTransformInputRecordTableArgs;
import io.pulumi.aws.glue.inputs.MLTransformParametersArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MLTransformArgs extends io.pulumi.resources.ResourceArgs {

    public static final MLTransformArgs Empty = new MLTransformArgs();

    /**
     * Description of the ML Transform.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The version of glue to use, for example "1.0". For information about available versions, see the [AWS Glue Release Notes](https://docs.aws.amazon.com/glue/latest/dg/release-notes.html).
     * 
     */
    @InputImport(name="glueVersion")
      private final @Nullable Input<String> glueVersion;

    public Input<String> getGlueVersion() {
        return this.glueVersion == null ? Input.empty() : this.glueVersion;
    }

    /**
     * A list of AWS Glue table definitions used by the transform. see Input Record Tables.
     * 
     */
    @InputImport(name="inputRecordTables", required=true)
      private final Input<List<MLTransformInputRecordTableArgs>> inputRecordTables;

    public Input<List<MLTransformInputRecordTableArgs>> getInputRecordTables() {
        return this.inputRecordTables;
    }

    /**
     * The number of AWS Glue data processing units (DPUs) that are allocated to task runs for this transform. You can allocate from `2` to `100` DPUs; the default is `10`. `max_capacity` is a mutually exclusive option with `number_of_workers` and `worker_type`.
     * 
     */
    @InputImport(name="maxCapacity")
      private final @Nullable Input<Double> maxCapacity;

    public Input<Double> getMaxCapacity() {
        return this.maxCapacity == null ? Input.empty() : this.maxCapacity;
    }

    /**
     * The maximum number of times to retry this ML Transform if it fails.
     * 
     */
    @InputImport(name="maxRetries")
      private final @Nullable Input<Integer> maxRetries;

    public Input<Integer> getMaxRetries() {
        return this.maxRetries == null ? Input.empty() : this.maxRetries;
    }

    /**
     * The name you assign to this ML Transform. It must be unique in your account.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The number of workers of a defined `worker_type` that are allocated when an ML Transform runs. Required with `worker_type`.
     * 
     */
    @InputImport(name="numberOfWorkers")
      private final @Nullable Input<Integer> numberOfWorkers;

    public Input<Integer> getNumberOfWorkers() {
        return this.numberOfWorkers == null ? Input.empty() : this.numberOfWorkers;
    }

    /**
     * The algorithmic parameters that are specific to the transform type used. Conditionally dependent on the transform type. see Parameters.
     * 
     */
    @InputImport(name="parameters", required=true)
      private final Input<MLTransformParametersArgs> parameters;

    public Input<MLTransformParametersArgs> getParameters() {
        return this.parameters;
    }

    /**
     * The ARN of the IAM role associated with this ML Transform.
     * 
     */
    @InputImport(name="roleArn", required=true)
      private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The ML Transform timeout in minutes. The default is 2880 minutes (48 hours).
     * 
     */
    @InputImport(name="timeout")
      private final @Nullable Input<Integer> timeout;

    public Input<Integer> getTimeout() {
        return this.timeout == null ? Input.empty() : this.timeout;
    }

    /**
     * The type of predefined worker that is allocated when an ML Transform runs. Accepts a value of `Standard`, `G.1X`, or `G.2X`. Required with `number_of_workers`.
     * 
     */
    @InputImport(name="workerType")
      private final @Nullable Input<String> workerType;

    public Input<String> getWorkerType() {
        return this.workerType == null ? Input.empty() : this.workerType;
    }

    public MLTransformArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> glueVersion,
        Input<List<MLTransformInputRecordTableArgs>> inputRecordTables,
        @Nullable Input<Double> maxCapacity,
        @Nullable Input<Integer> maxRetries,
        @Nullable Input<String> name,
        @Nullable Input<Integer> numberOfWorkers,
        Input<MLTransformParametersArgs> parameters,
        Input<String> roleArn,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Integer> timeout,
        @Nullable Input<String> workerType) {
        this.description = description;
        this.glueVersion = glueVersion;
        this.inputRecordTables = Objects.requireNonNull(inputRecordTables, "expected parameter 'inputRecordTables' to be non-null");
        this.maxCapacity = maxCapacity;
        this.maxRetries = maxRetries;
        this.name = name;
        this.numberOfWorkers = numberOfWorkers;
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.tags = tags;
        this.timeout = timeout;
        this.workerType = workerType;
    }

    private MLTransformArgs() {
        this.description = Input.empty();
        this.glueVersion = Input.empty();
        this.inputRecordTables = Input.empty();
        this.maxCapacity = Input.empty();
        this.maxRetries = Input.empty();
        this.name = Input.empty();
        this.numberOfWorkers = Input.empty();
        this.parameters = Input.empty();
        this.roleArn = Input.empty();
        this.tags = Input.empty();
        this.timeout = Input.empty();
        this.workerType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MLTransformArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> glueVersion;
        private Input<List<MLTransformInputRecordTableArgs>> inputRecordTables;
        private @Nullable Input<Double> maxCapacity;
        private @Nullable Input<Integer> maxRetries;
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> numberOfWorkers;
        private Input<MLTransformParametersArgs> parameters;
        private Input<String> roleArn;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Integer> timeout;
        private @Nullable Input<String> workerType;

        public Builder() {
    	      // Empty
        }

        public Builder(MLTransformArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.glueVersion = defaults.glueVersion;
    	      this.inputRecordTables = defaults.inputRecordTables;
    	      this.maxCapacity = defaults.maxCapacity;
    	      this.maxRetries = defaults.maxRetries;
    	      this.name = defaults.name;
    	      this.numberOfWorkers = defaults.numberOfWorkers;
    	      this.parameters = defaults.parameters;
    	      this.roleArn = defaults.roleArn;
    	      this.tags = defaults.tags;
    	      this.timeout = defaults.timeout;
    	      this.workerType = defaults.workerType;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setGlueVersion(@Nullable Input<String> glueVersion) {
            this.glueVersion = glueVersion;
            return this;
        }

        public Builder setGlueVersion(@Nullable String glueVersion) {
            this.glueVersion = Input.ofNullable(glueVersion);
            return this;
        }

        public Builder setInputRecordTables(Input<List<MLTransformInputRecordTableArgs>> inputRecordTables) {
            this.inputRecordTables = Objects.requireNonNull(inputRecordTables);
            return this;
        }

        public Builder setInputRecordTables(List<MLTransformInputRecordTableArgs> inputRecordTables) {
            this.inputRecordTables = Input.of(Objects.requireNonNull(inputRecordTables));
            return this;
        }

        public Builder setMaxCapacity(@Nullable Input<Double> maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }

        public Builder setMaxCapacity(@Nullable Double maxCapacity) {
            this.maxCapacity = Input.ofNullable(maxCapacity);
            return this;
        }

        public Builder setMaxRetries(@Nullable Input<Integer> maxRetries) {
            this.maxRetries = maxRetries;
            return this;
        }

        public Builder setMaxRetries(@Nullable Integer maxRetries) {
            this.maxRetries = Input.ofNullable(maxRetries);
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

        public Builder setNumberOfWorkers(@Nullable Input<Integer> numberOfWorkers) {
            this.numberOfWorkers = numberOfWorkers;
            return this;
        }

        public Builder setNumberOfWorkers(@Nullable Integer numberOfWorkers) {
            this.numberOfWorkers = Input.ofNullable(numberOfWorkers);
            return this;
        }

        public Builder setParameters(Input<MLTransformParametersArgs> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder setParameters(MLTransformParametersArgs parameters) {
            this.parameters = Input.of(Objects.requireNonNull(parameters));
            return this;
        }

        public Builder setRoleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
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

        public Builder setTimeout(@Nullable Input<Integer> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setTimeout(@Nullable Integer timeout) {
            this.timeout = Input.ofNullable(timeout);
            return this;
        }

        public Builder setWorkerType(@Nullable Input<String> workerType) {
            this.workerType = workerType;
            return this;
        }

        public Builder setWorkerType(@Nullable String workerType) {
            this.workerType = Input.ofNullable(workerType);
            return this;
        }
        public MLTransformArgs build() {
            return new MLTransformArgs(description, glueVersion, inputRecordTables, maxCapacity, maxRetries, name, numberOfWorkers, parameters, roleArn, tags, timeout, workerType);
        }
    }
}
