// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputGetArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationOutputGetArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationSqlApplicationConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationSqlApplicationConfigurationGetArgs Empty = new ApplicationApplicationConfigurationSqlApplicationConfigurationGetArgs();

    /**
     * The input stream used by the application.
     * 
     */
    @InputImport(name="input")
      private final @Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationInputGetArgs> input;

    public Input<ApplicationApplicationConfigurationSqlApplicationConfigurationInputGetArgs> getInput() {
        return this.input == null ? Input.empty() : this.input;
    }

    /**
     * The destination streams used by the application.
     * 
     */
    @InputImport(name="outputs")
      private final @Nullable Input<List<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputGetArgs>> outputs;

    public Input<List<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputGetArgs>> getOutputs() {
        return this.outputs == null ? Input.empty() : this.outputs;
    }

    /**
     * The reference data source used by the application.
     * 
     */
    @InputImport(name="referenceDataSource")
      private final @Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceGetArgs> referenceDataSource;

    public Input<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceGetArgs> getReferenceDataSource() {
        return this.referenceDataSource == null ? Input.empty() : this.referenceDataSource;
    }

    public ApplicationApplicationConfigurationSqlApplicationConfigurationGetArgs(
        @Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationInputGetArgs> input,
        @Nullable Input<List<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputGetArgs>> outputs,
        @Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceGetArgs> referenceDataSource) {
        this.input = input;
        this.outputs = outputs;
        this.referenceDataSource = referenceDataSource;
    }

    private ApplicationApplicationConfigurationSqlApplicationConfigurationGetArgs() {
        this.input = Input.empty();
        this.outputs = Input.empty();
        this.referenceDataSource = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationInputGetArgs> input;
        private @Nullable Input<List<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputGetArgs>> outputs;
        private @Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceGetArgs> referenceDataSource;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.input = defaults.input;
    	      this.outputs = defaults.outputs;
    	      this.referenceDataSource = defaults.referenceDataSource;
        }

        public Builder setInput(@Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationInputGetArgs> input) {
            this.input = input;
            return this;
        }

        public Builder setInput(@Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationInputGetArgs input) {
            this.input = Input.ofNullable(input);
            return this;
        }

        public Builder setOutputs(@Nullable Input<List<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputGetArgs>> outputs) {
            this.outputs = outputs;
            return this;
        }

        public Builder setOutputs(@Nullable List<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputGetArgs> outputs) {
            this.outputs = Input.ofNullable(outputs);
            return this;
        }

        public Builder setReferenceDataSource(@Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceGetArgs> referenceDataSource) {
            this.referenceDataSource = referenceDataSource;
            return this;
        }

        public Builder setReferenceDataSource(@Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceGetArgs referenceDataSource) {
            this.referenceDataSource = Input.ofNullable(referenceDataSource);
            return this;
        }
        public ApplicationApplicationConfigurationSqlApplicationConfigurationGetArgs build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationGetArgs(input, outputs, referenceDataSource);
        }
    }
}
