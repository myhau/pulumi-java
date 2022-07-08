// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.bigquery.v2.outputs.BqmlTrainingRunResponse;
import com.pulumi.googlenative.bigquery.v2.outputs.ModelDefinitionModelOptionsResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ModelDefinitionResponse {
    /**
     * @return [Output-only, Beta] Model options used for the first training run. These options are immutable for subsequent training runs. Default values are used for any options not specified in the input query.
     * 
     */
    private final ModelDefinitionModelOptionsResponse modelOptions;
    /**
     * @return [Output-only, Beta] Information about ml training runs, each training run comprises of multiple iterations and there may be multiple training runs for the model if warm start is used or if a user decides to continue a previously cancelled query.
     * 
     */
    private final List<BqmlTrainingRunResponse> trainingRuns;

    @CustomType.Constructor
    private ModelDefinitionResponse(
        @CustomType.Parameter("modelOptions") ModelDefinitionModelOptionsResponse modelOptions,
        @CustomType.Parameter("trainingRuns") List<BqmlTrainingRunResponse> trainingRuns) {
        this.modelOptions = modelOptions;
        this.trainingRuns = trainingRuns;
    }

    /**
     * @return [Output-only, Beta] Model options used for the first training run. These options are immutable for subsequent training runs. Default values are used for any options not specified in the input query.
     * 
     */
    public ModelDefinitionModelOptionsResponse modelOptions() {
        return this.modelOptions;
    }
    /**
     * @return [Output-only, Beta] Information about ml training runs, each training run comprises of multiple iterations and there may be multiple training runs for the model if warm start is used or if a user decides to continue a previously cancelled query.
     * 
     */
    public List<BqmlTrainingRunResponse> trainingRuns() {
        return this.trainingRuns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelDefinitionModelOptionsResponse modelOptions;
        private List<BqmlTrainingRunResponse> trainingRuns;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.modelOptions = defaults.modelOptions;
    	      this.trainingRuns = defaults.trainingRuns;
        }

        public Builder modelOptions(ModelDefinitionModelOptionsResponse modelOptions) {
            this.modelOptions = Objects.requireNonNull(modelOptions);
            return this;
        }
        public Builder trainingRuns(List<BqmlTrainingRunResponse> trainingRuns) {
            this.trainingRuns = Objects.requireNonNull(trainingRuns);
            return this;
        }
        public Builder trainingRuns(BqmlTrainingRunResponse... trainingRuns) {
            return trainingRuns(List.of(trainingRuns));
        }        public ModelDefinitionResponse build() {
            return new ModelDefinitionResponse(modelOptions, trainingRuns);
        }
    }
}
