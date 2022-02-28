// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.aws.kinesis.inputs.AnalyticsApplicationOutputKinesisFirehoseArgs;
import io.pulumi.aws.kinesis.inputs.AnalyticsApplicationOutputKinesisStreamArgs;
import io.pulumi.aws.kinesis.inputs.AnalyticsApplicationOutputLambdaArgs;
import io.pulumi.aws.kinesis.inputs.AnalyticsApplicationOutputSchemaArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnalyticsApplicationOutputArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationOutputArgs Empty = new AnalyticsApplicationOutputArgs();

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
     * The Kinesis Firehose configuration for the destination stream. Conflicts with `kinesis_stream`.
     * See Kinesis Firehose below for more details.
     * 
     */
    @InputImport(name="kinesisFirehose")
      private final @Nullable Input<AnalyticsApplicationOutputKinesisFirehoseArgs> kinesisFirehose;

    public Input<AnalyticsApplicationOutputKinesisFirehoseArgs> getKinesisFirehose() {
        return this.kinesisFirehose == null ? Input.empty() : this.kinesisFirehose;
    }

    /**
     * The Kinesis Stream configuration for the destination stream. Conflicts with `kinesis_firehose`.
     * See Kinesis Stream below for more details.
     * 
     */
    @InputImport(name="kinesisStream")
      private final @Nullable Input<AnalyticsApplicationOutputKinesisStreamArgs> kinesisStream;

    public Input<AnalyticsApplicationOutputKinesisStreamArgs> getKinesisStream() {
        return this.kinesisStream == null ? Input.empty() : this.kinesisStream;
    }

    /**
     * The Lambda function destination. See Lambda below for more details.
     * 
     */
    @InputImport(name="lambda")
      private final @Nullable Input<AnalyticsApplicationOutputLambdaArgs> lambda;

    public Input<AnalyticsApplicationOutputLambdaArgs> getLambda() {
        return this.lambda == null ? Input.empty() : this.lambda;
    }

    /**
     * The Name of the in-application stream.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The Schema format of the data written to the destination. See Destination Schema below for more details.
     * 
     */
    @InputImport(name="schema", required=true)
      private final Input<AnalyticsApplicationOutputSchemaArgs> schema;

    public Input<AnalyticsApplicationOutputSchemaArgs> getSchema() {
        return this.schema;
    }

    public AnalyticsApplicationOutputArgs(
        @Nullable Input<String> id,
        @Nullable Input<AnalyticsApplicationOutputKinesisFirehoseArgs> kinesisFirehose,
        @Nullable Input<AnalyticsApplicationOutputKinesisStreamArgs> kinesisStream,
        @Nullable Input<AnalyticsApplicationOutputLambdaArgs> lambda,
        Input<String> name,
        Input<AnalyticsApplicationOutputSchemaArgs> schema) {
        this.id = id;
        this.kinesisFirehose = kinesisFirehose;
        this.kinesisStream = kinesisStream;
        this.lambda = lambda;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.schema = Objects.requireNonNull(schema, "expected parameter 'schema' to be non-null");
    }

    private AnalyticsApplicationOutputArgs() {
        this.id = Input.empty();
        this.kinesisFirehose = Input.empty();
        this.kinesisStream = Input.empty();
        this.lambda = Input.empty();
        this.name = Input.empty();
        this.schema = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationOutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;
        private @Nullable Input<AnalyticsApplicationOutputKinesisFirehoseArgs> kinesisFirehose;
        private @Nullable Input<AnalyticsApplicationOutputKinesisStreamArgs> kinesisStream;
        private @Nullable Input<AnalyticsApplicationOutputLambdaArgs> lambda;
        private Input<String> name;
        private Input<AnalyticsApplicationOutputSchemaArgs> schema;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationOutputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.kinesisFirehose = defaults.kinesisFirehose;
    	      this.kinesisStream = defaults.kinesisStream;
    	      this.lambda = defaults.lambda;
    	      this.name = defaults.name;
    	      this.schema = defaults.schema;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setKinesisFirehose(@Nullable Input<AnalyticsApplicationOutputKinesisFirehoseArgs> kinesisFirehose) {
            this.kinesisFirehose = kinesisFirehose;
            return this;
        }

        public Builder setKinesisFirehose(@Nullable AnalyticsApplicationOutputKinesisFirehoseArgs kinesisFirehose) {
            this.kinesisFirehose = Input.ofNullable(kinesisFirehose);
            return this;
        }

        public Builder setKinesisStream(@Nullable Input<AnalyticsApplicationOutputKinesisStreamArgs> kinesisStream) {
            this.kinesisStream = kinesisStream;
            return this;
        }

        public Builder setKinesisStream(@Nullable AnalyticsApplicationOutputKinesisStreamArgs kinesisStream) {
            this.kinesisStream = Input.ofNullable(kinesisStream);
            return this;
        }

        public Builder setLambda(@Nullable Input<AnalyticsApplicationOutputLambdaArgs> lambda) {
            this.lambda = lambda;
            return this;
        }

        public Builder setLambda(@Nullable AnalyticsApplicationOutputLambdaArgs lambda) {
            this.lambda = Input.ofNullable(lambda);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setSchema(Input<AnalyticsApplicationOutputSchemaArgs> schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }

        public Builder setSchema(AnalyticsApplicationOutputSchemaArgs schema) {
            this.schema = Input.of(Objects.requireNonNull(schema));
            return this;
        }
        public AnalyticsApplicationOutputArgs build() {
            return new AnalyticsApplicationOutputArgs(id, kinesisFirehose, kinesisStream, lambda, name, schema);
        }
    }
}
