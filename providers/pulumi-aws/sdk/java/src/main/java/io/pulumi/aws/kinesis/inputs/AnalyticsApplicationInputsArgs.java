// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsKinesisFirehoseArgs;
import io.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsKinesisStreamArgs;
import io.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsParallelismArgs;
import io.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsProcessingConfigurationArgs;
import io.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsSchemaArgs;
import io.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsStartingPositionConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnalyticsApplicationInputsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationInputsArgs Empty = new AnalyticsApplicationInputsArgs();

    /**
     * The ARN of the Kinesis Analytics Application.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * The Kinesis Firehose configuration for the streaming source. Conflicts with `kinesis_stream`.
     * See Kinesis Firehose below for more details.
     * 
     */
    @InputImport(name="kinesisFirehose")
      private final @Nullable Input<AnalyticsApplicationInputsKinesisFirehoseArgs> kinesisFirehose;

    public Input<AnalyticsApplicationInputsKinesisFirehoseArgs> getKinesisFirehose() {
        return this.kinesisFirehose == null ? Input.empty() : this.kinesisFirehose;
    }

    /**
     * The Kinesis Stream configuration for the streaming source. Conflicts with `kinesis_firehose`.
     * See Kinesis Stream below for more details.
     * 
     */
    @InputImport(name="kinesisStream")
      private final @Nullable Input<AnalyticsApplicationInputsKinesisStreamArgs> kinesisStream;

    public Input<AnalyticsApplicationInputsKinesisStreamArgs> getKinesisStream() {
        return this.kinesisStream == null ? Input.empty() : this.kinesisStream;
    }

    /**
     * The Name Prefix to use when creating an in-application stream.
     * 
     */
    @InputImport(name="namePrefix", required=true)
      private final Input<String> namePrefix;

    public Input<String> getNamePrefix() {
        return this.namePrefix;
    }

    /**
     * The number of Parallel in-application streams to create.
     * See Parallelism below for more details.
     * 
     */
    @InputImport(name="parallelism")
      private final @Nullable Input<AnalyticsApplicationInputsParallelismArgs> parallelism;

    public Input<AnalyticsApplicationInputsParallelismArgs> getParallelism() {
        return this.parallelism == null ? Input.empty() : this.parallelism;
    }

    /**
     * The Processing Configuration to transform records as they are received from the stream.
     * See Processing Configuration below for more details.
     * 
     */
    @InputImport(name="processingConfiguration")
      private final @Nullable Input<AnalyticsApplicationInputsProcessingConfigurationArgs> processingConfiguration;

    public Input<AnalyticsApplicationInputsProcessingConfigurationArgs> getProcessingConfiguration() {
        return this.processingConfiguration == null ? Input.empty() : this.processingConfiguration;
    }

    /**
     * The Schema format of the data in the streaming source. See Source Schema below for more details.
     * 
     */
    @InputImport(name="schema", required=true)
      private final Input<AnalyticsApplicationInputsSchemaArgs> schema;

    public Input<AnalyticsApplicationInputsSchemaArgs> getSchema() {
        return this.schema;
    }

    /**
     * The point at which the application starts processing records from the streaming source.
     * See Starting Position Configuration below for more details.
     * 
     */
    @InputImport(name="startingPositionConfigurations")
      private final @Nullable Input<List<AnalyticsApplicationInputsStartingPositionConfigurationArgs>> startingPositionConfigurations;

    public Input<List<AnalyticsApplicationInputsStartingPositionConfigurationArgs>> getStartingPositionConfigurations() {
        return this.startingPositionConfigurations == null ? Input.empty() : this.startingPositionConfigurations;
    }

    @InputImport(name="streamNames")
      private final @Nullable Input<List<String>> streamNames;

    public Input<List<String>> getStreamNames() {
        return this.streamNames == null ? Input.empty() : this.streamNames;
    }

    public AnalyticsApplicationInputsArgs(
        @Nullable Input<String> id,
        @Nullable Input<AnalyticsApplicationInputsKinesisFirehoseArgs> kinesisFirehose,
        @Nullable Input<AnalyticsApplicationInputsKinesisStreamArgs> kinesisStream,
        Input<String> namePrefix,
        @Nullable Input<AnalyticsApplicationInputsParallelismArgs> parallelism,
        @Nullable Input<AnalyticsApplicationInputsProcessingConfigurationArgs> processingConfiguration,
        Input<AnalyticsApplicationInputsSchemaArgs> schema,
        @Nullable Input<List<AnalyticsApplicationInputsStartingPositionConfigurationArgs>> startingPositionConfigurations,
        @Nullable Input<List<String>> streamNames) {
        this.id = id;
        this.kinesisFirehose = kinesisFirehose;
        this.kinesisStream = kinesisStream;
        this.namePrefix = Objects.requireNonNull(namePrefix, "expected parameter 'namePrefix' to be non-null");
        this.parallelism = parallelism;
        this.processingConfiguration = processingConfiguration;
        this.schema = Objects.requireNonNull(schema, "expected parameter 'schema' to be non-null");
        this.startingPositionConfigurations = startingPositionConfigurations;
        this.streamNames = streamNames;
    }

    private AnalyticsApplicationInputsArgs() {
        this.id = Input.empty();
        this.kinesisFirehose = Input.empty();
        this.kinesisStream = Input.empty();
        this.namePrefix = Input.empty();
        this.parallelism = Input.empty();
        this.processingConfiguration = Input.empty();
        this.schema = Input.empty();
        this.startingPositionConfigurations = Input.empty();
        this.streamNames = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationInputsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;
        private @Nullable Input<AnalyticsApplicationInputsKinesisFirehoseArgs> kinesisFirehose;
        private @Nullable Input<AnalyticsApplicationInputsKinesisStreamArgs> kinesisStream;
        private Input<String> namePrefix;
        private @Nullable Input<AnalyticsApplicationInputsParallelismArgs> parallelism;
        private @Nullable Input<AnalyticsApplicationInputsProcessingConfigurationArgs> processingConfiguration;
        private Input<AnalyticsApplicationInputsSchemaArgs> schema;
        private @Nullable Input<List<AnalyticsApplicationInputsStartingPositionConfigurationArgs>> startingPositionConfigurations;
        private @Nullable Input<List<String>> streamNames;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationInputsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.kinesisFirehose = defaults.kinesisFirehose;
    	      this.kinesisStream = defaults.kinesisStream;
    	      this.namePrefix = defaults.namePrefix;
    	      this.parallelism = defaults.parallelism;
    	      this.processingConfiguration = defaults.processingConfiguration;
    	      this.schema = defaults.schema;
    	      this.startingPositionConfigurations = defaults.startingPositionConfigurations;
    	      this.streamNames = defaults.streamNames;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setKinesisFirehose(@Nullable Input<AnalyticsApplicationInputsKinesisFirehoseArgs> kinesisFirehose) {
            this.kinesisFirehose = kinesisFirehose;
            return this;
        }

        public Builder setKinesisFirehose(@Nullable AnalyticsApplicationInputsKinesisFirehoseArgs kinesisFirehose) {
            this.kinesisFirehose = Input.ofNullable(kinesisFirehose);
            return this;
        }

        public Builder setKinesisStream(@Nullable Input<AnalyticsApplicationInputsKinesisStreamArgs> kinesisStream) {
            this.kinesisStream = kinesisStream;
            return this;
        }

        public Builder setKinesisStream(@Nullable AnalyticsApplicationInputsKinesisStreamArgs kinesisStream) {
            this.kinesisStream = Input.ofNullable(kinesisStream);
            return this;
        }

        public Builder setNamePrefix(Input<String> namePrefix) {
            this.namePrefix = Objects.requireNonNull(namePrefix);
            return this;
        }

        public Builder setNamePrefix(String namePrefix) {
            this.namePrefix = Input.of(Objects.requireNonNull(namePrefix));
            return this;
        }

        public Builder setParallelism(@Nullable Input<AnalyticsApplicationInputsParallelismArgs> parallelism) {
            this.parallelism = parallelism;
            return this;
        }

        public Builder setParallelism(@Nullable AnalyticsApplicationInputsParallelismArgs parallelism) {
            this.parallelism = Input.ofNullable(parallelism);
            return this;
        }

        public Builder setProcessingConfiguration(@Nullable Input<AnalyticsApplicationInputsProcessingConfigurationArgs> processingConfiguration) {
            this.processingConfiguration = processingConfiguration;
            return this;
        }

        public Builder setProcessingConfiguration(@Nullable AnalyticsApplicationInputsProcessingConfigurationArgs processingConfiguration) {
            this.processingConfiguration = Input.ofNullable(processingConfiguration);
            return this;
        }

        public Builder setSchema(Input<AnalyticsApplicationInputsSchemaArgs> schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }

        public Builder setSchema(AnalyticsApplicationInputsSchemaArgs schema) {
            this.schema = Input.of(Objects.requireNonNull(schema));
            return this;
        }

        public Builder setStartingPositionConfigurations(@Nullable Input<List<AnalyticsApplicationInputsStartingPositionConfigurationArgs>> startingPositionConfigurations) {
            this.startingPositionConfigurations = startingPositionConfigurations;
            return this;
        }

        public Builder setStartingPositionConfigurations(@Nullable List<AnalyticsApplicationInputsStartingPositionConfigurationArgs> startingPositionConfigurations) {
            this.startingPositionConfigurations = Input.ofNullable(startingPositionConfigurations);
            return this;
        }

        public Builder setStreamNames(@Nullable Input<List<String>> streamNames) {
            this.streamNames = streamNames;
            return this;
        }

        public Builder setStreamNames(@Nullable List<String> streamNames) {
            this.streamNames = Input.ofNullable(streamNames);
            return this;
        }
        public AnalyticsApplicationInputsArgs build() {
            return new AnalyticsApplicationInputsArgs(id, kinesisFirehose, kinesisStream, namePrefix, parallelism, processingConfiguration, schema, startingPositionConfigurations, streamNames);
        }
    }
}
