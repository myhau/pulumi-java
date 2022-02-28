// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationOutputArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationSqlApplicationConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationSqlApplicationConfigurationArgs Empty = new ApplicationApplicationConfigurationSqlApplicationConfigurationArgs();

    /**
     * The input stream used by the application.
     * 
     */
    @InputImport(name="input")
      private final @Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationInputArgs> input;

    public Input<ApplicationApplicationConfigurationSqlApplicationConfigurationInputArgs> getInput() {
        return this.input == null ? Input.empty() : this.input;
    }

    /**
     * The destination streams used by the application.
     * 
     */
    @InputImport(name="outputs")
      private final @Nullable Input<List<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputArgs>> outputs;

    public Input<List<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputArgs>> getOutputs() {
        return this.outputs == null ? Input.empty() : this.outputs;
    }

    /**
     * The reference data source used by the application.
     * 
     */
    @InputImport(name="referenceDataSource")
      private final @Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceArgs> referenceDataSource;

    public Input<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceArgs> getReferenceDataSource() {
        return this.referenceDataSource == null ? Input.empty() : this.referenceDataSource;
    }

    public ApplicationApplicationConfigurationSqlApplicationConfigurationArgs(
        @Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationInputArgs> input,
        @Nullable Input<List<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputArgs>> outputs,
        @Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceArgs> referenceDataSource) {
        this.input = input;
        this.outputs = outputs;
        this.referenceDataSource = referenceDataSource;
    }

    private ApplicationApplicationConfigurationSqlApplicationConfigurationArgs() {
        this.input = Input.empty();
        this.outputs = Input.empty();
        this.referenceDataSource = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationInputArgs> input;
        private @Nullable Input<List<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputArgs>> outputs;
        private @Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceArgs> referenceDataSource;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.input = defaults.input;
    	      this.outputs = defaults.outputs;
    	      this.referenceDataSource = defaults.referenceDataSource;
        }

        public Builder setInput(@Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationInputArgs> input) {
            this.input = input;
            return this;
        }

        public Builder setInput(@Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationInputArgs input) {
            this.input = Input.ofNullable(input);
            return this;
        }

        public Builder setOutputs(@Nullable Input<List<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputArgs>> outputs) {
            this.outputs = outputs;
            return this;
        }

        public Builder setOutputs(@Nullable List<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputArgs> outputs) {
            this.outputs = Input.ofNullable(outputs);
            return this;
        }

        public Builder setReferenceDataSource(@Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceArgs> referenceDataSource) {
            this.referenceDataSource = referenceDataSource;
            return this;
        }

        public Builder setReferenceDataSource(@Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceArgs referenceDataSource) {
            this.referenceDataSource = Input.ofNullable(referenceDataSource);
            return this;
        }
        public ApplicationApplicationConfigurationSqlApplicationConfigurationArgs build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationArgs(input, outputs, referenceDataSource);
        }
    }
}
