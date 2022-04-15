// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.LabelCategoryArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.LabelingDatasetConfigurationArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.LabelingJobImagePropertiesArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.LabelingJobInstructionsArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.MLAssistConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Definition of a labeling job.
 * 
 */
public final class LabelingJobPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final LabelingJobPropertiesArgs Empty = new LabelingJobPropertiesArgs();

    /**
     * Dataset configuration for the job.
     * 
     */
    @Import(name="datasetConfiguration", required=true)
      private final Output<LabelingDatasetConfigurationArgs> datasetConfiguration;

    public Output<LabelingDatasetConfigurationArgs> datasetConfiguration() {
        return this.datasetConfiguration;
    }

    /**
     * Instructions for the job.
     * 
     */
    @Import(name="jobInstructions", required=true)
      private final Output<LabelingJobInstructionsArgs> jobInstructions;

    public Output<LabelingJobInstructionsArgs> jobInstructions() {
        return this.jobInstructions;
    }

    /**
     * Label categories of the job.
     * 
     */
    @Import(name="labelCategories", required=true)
      private final Output<Map<String,LabelCategoryArgs>> labelCategories;

    public Output<Map<String,LabelCategoryArgs>> labelCategories() {
        return this.labelCategories;
    }

    /**
     * Media specific properties in a labeling job.
     * 
     */
    @Import(name="labelingJobMediaProperties", required=true)
      private final Output<LabelingJobImagePropertiesArgs> labelingJobMediaProperties;

    public Output<LabelingJobImagePropertiesArgs> labelingJobMediaProperties() {
        return this.labelingJobMediaProperties;
    }

    /**
     * Machine learning assisted configuration for the job.
     * 
     */
    @Import(name="mlAssistConfiguration")
      private final @Nullable Output<MLAssistConfigurationArgs> mlAssistConfiguration;

    public Output<MLAssistConfigurationArgs> mlAssistConfiguration() {
        return this.mlAssistConfiguration == null ? Codegen.empty() : this.mlAssistConfiguration;
    }

    /**
     * The job property dictionary. Properties can be added, but not removed or altered.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<Map<String,String>> properties;

    public Output<Map<String,String>> properties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    /**
     * The job tag dictionary. Tags can be added, removed, and updated.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public LabelingJobPropertiesArgs(
        Output<LabelingDatasetConfigurationArgs> datasetConfiguration,
        Output<LabelingJobInstructionsArgs> jobInstructions,
        Output<Map<String,LabelCategoryArgs>> labelCategories,
        Output<LabelingJobImagePropertiesArgs> labelingJobMediaProperties,
        @Nullable Output<MLAssistConfigurationArgs> mlAssistConfiguration,
        @Nullable Output<Map<String,String>> properties,
        @Nullable Output<Map<String,String>> tags) {
        this.datasetConfiguration = Objects.requireNonNull(datasetConfiguration, "expected parameter 'datasetConfiguration' to be non-null");
        this.jobInstructions = Objects.requireNonNull(jobInstructions, "expected parameter 'jobInstructions' to be non-null");
        this.labelCategories = Objects.requireNonNull(labelCategories, "expected parameter 'labelCategories' to be non-null");
        this.labelingJobMediaProperties = Objects.requireNonNull(labelingJobMediaProperties, "expected parameter 'labelingJobMediaProperties' to be non-null");
        this.mlAssistConfiguration = mlAssistConfiguration;
        this.properties = properties;
        this.tags = tags;
    }

    private LabelingJobPropertiesArgs() {
        this.datasetConfiguration = Codegen.empty();
        this.jobInstructions = Codegen.empty();
        this.labelCategories = Codegen.empty();
        this.labelingJobMediaProperties = Codegen.empty();
        this.mlAssistConfiguration = Codegen.empty();
        this.properties = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabelingJobPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<LabelingDatasetConfigurationArgs> datasetConfiguration;
        private Output<LabelingJobInstructionsArgs> jobInstructions;
        private Output<Map<String,LabelCategoryArgs>> labelCategories;
        private Output<LabelingJobImagePropertiesArgs> labelingJobMediaProperties;
        private @Nullable Output<MLAssistConfigurationArgs> mlAssistConfiguration;
        private @Nullable Output<Map<String,String>> properties;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(LabelingJobPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetConfiguration = defaults.datasetConfiguration;
    	      this.jobInstructions = defaults.jobInstructions;
    	      this.labelCategories = defaults.labelCategories;
    	      this.labelingJobMediaProperties = defaults.labelingJobMediaProperties;
    	      this.mlAssistConfiguration = defaults.mlAssistConfiguration;
    	      this.properties = defaults.properties;
    	      this.tags = defaults.tags;
        }

        public Builder datasetConfiguration(Output<LabelingDatasetConfigurationArgs> datasetConfiguration) {
            this.datasetConfiguration = Objects.requireNonNull(datasetConfiguration);
            return this;
        }
        public Builder datasetConfiguration(LabelingDatasetConfigurationArgs datasetConfiguration) {
            this.datasetConfiguration = Output.of(Objects.requireNonNull(datasetConfiguration));
            return this;
        }
        public Builder jobInstructions(Output<LabelingJobInstructionsArgs> jobInstructions) {
            this.jobInstructions = Objects.requireNonNull(jobInstructions);
            return this;
        }
        public Builder jobInstructions(LabelingJobInstructionsArgs jobInstructions) {
            this.jobInstructions = Output.of(Objects.requireNonNull(jobInstructions));
            return this;
        }
        public Builder labelCategories(Output<Map<String,LabelCategoryArgs>> labelCategories) {
            this.labelCategories = Objects.requireNonNull(labelCategories);
            return this;
        }
        public Builder labelCategories(Map<String,LabelCategoryArgs> labelCategories) {
            this.labelCategories = Output.of(Objects.requireNonNull(labelCategories));
            return this;
        }
        public Builder labelingJobMediaProperties(Output<LabelingJobImagePropertiesArgs> labelingJobMediaProperties) {
            this.labelingJobMediaProperties = Objects.requireNonNull(labelingJobMediaProperties);
            return this;
        }
        public Builder labelingJobMediaProperties(LabelingJobImagePropertiesArgs labelingJobMediaProperties) {
            this.labelingJobMediaProperties = Output.of(Objects.requireNonNull(labelingJobMediaProperties));
            return this;
        }
        public Builder mlAssistConfiguration(@Nullable Output<MLAssistConfigurationArgs> mlAssistConfiguration) {
            this.mlAssistConfiguration = mlAssistConfiguration;
            return this;
        }
        public Builder mlAssistConfiguration(@Nullable MLAssistConfigurationArgs mlAssistConfiguration) {
            this.mlAssistConfiguration = Codegen.ofNullable(mlAssistConfiguration);
            return this;
        }
        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = Codegen.ofNullable(properties);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public LabelingJobPropertiesArgs build() {
            return new LabelingJobPropertiesArgs(datasetConfiguration, jobInstructions, labelCategories, labelingJobMediaProperties, mlAssistConfiguration, properties, tags);
        }
    }
}
