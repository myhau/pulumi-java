// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.bigquery.v2.inputs.BqmlIterationResultArgs;
import com.pulumi.googlenative.bigquery.v2.inputs.BqmlTrainingRunTrainingOptionsArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BqmlTrainingRunArgs extends com.pulumi.resources.ResourceArgs {

    public static final BqmlTrainingRunArgs Empty = new BqmlTrainingRunArgs();

    /**
     * [Output-only, Beta] List of each iteration results.
     * 
     */
    @Import(name="iterationResults")
    private @Nullable Output<List<BqmlIterationResultArgs>> iterationResults;

    /**
     * @return [Output-only, Beta] List of each iteration results.
     * 
     */
    public Optional<Output<List<BqmlIterationResultArgs>>> iterationResults() {
        return Optional.ofNullable(this.iterationResults);
    }

    /**
     * [Output-only, Beta] Training run start time in milliseconds since the epoch.
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    /**
     * @return [Output-only, Beta] Training run start time in milliseconds since the epoch.
     * 
     */
    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    /**
     * [Output-only, Beta] Different state applicable for a training run. IN PROGRESS: Training run is in progress. FAILED: Training run ended due to a non-retryable failure. SUCCEEDED: Training run successfully completed. CANCELLED: Training run cancelled by the user.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return [Output-only, Beta] Different state applicable for a training run. IN PROGRESS: Training run is in progress. FAILED: Training run ended due to a non-retryable failure. SUCCEEDED: Training run successfully completed. CANCELLED: Training run cancelled by the user.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * [Output-only, Beta] Training options used by this training run. These options are mutable for subsequent training runs. Default values are explicitly stored for options not specified in the input query of the first training run. For subsequent training runs, any option not explicitly specified in the input query will be copied from the previous training run.
     * 
     */
    @Import(name="trainingOptions")
    private @Nullable Output<BqmlTrainingRunTrainingOptionsArgs> trainingOptions;

    /**
     * @return [Output-only, Beta] Training options used by this training run. These options are mutable for subsequent training runs. Default values are explicitly stored for options not specified in the input query of the first training run. For subsequent training runs, any option not explicitly specified in the input query will be copied from the previous training run.
     * 
     */
    public Optional<Output<BqmlTrainingRunTrainingOptionsArgs>> trainingOptions() {
        return Optional.ofNullable(this.trainingOptions);
    }

    private BqmlTrainingRunArgs() {}

    private BqmlTrainingRunArgs(BqmlTrainingRunArgs $) {
        this.iterationResults = $.iterationResults;
        this.startTime = $.startTime;
        this.state = $.state;
        this.trainingOptions = $.trainingOptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BqmlTrainingRunArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BqmlTrainingRunArgs $;

        public Builder() {
            $ = new BqmlTrainingRunArgs();
        }

        public Builder(BqmlTrainingRunArgs defaults) {
            $ = new BqmlTrainingRunArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param iterationResults [Output-only, Beta] List of each iteration results.
         * 
         * @return builder
         * 
         */
        public Builder iterationResults(@Nullable Output<List<BqmlIterationResultArgs>> iterationResults) {
            $.iterationResults = iterationResults;
            return this;
        }

        /**
         * @param iterationResults [Output-only, Beta] List of each iteration results.
         * 
         * @return builder
         * 
         */
        public Builder iterationResults(List<BqmlIterationResultArgs> iterationResults) {
            return iterationResults(Output.of(iterationResults));
        }

        /**
         * @param iterationResults [Output-only, Beta] List of each iteration results.
         * 
         * @return builder
         * 
         */
        public Builder iterationResults(BqmlIterationResultArgs... iterationResults) {
            return iterationResults(List.of(iterationResults));
        }

        /**
         * @param startTime [Output-only, Beta] Training run start time in milliseconds since the epoch.
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime [Output-only, Beta] Training run start time in milliseconds since the epoch.
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        /**
         * @param state [Output-only, Beta] Different state applicable for a training run. IN PROGRESS: Training run is in progress. FAILED: Training run ended due to a non-retryable failure. SUCCEEDED: Training run successfully completed. CANCELLED: Training run cancelled by the user.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state [Output-only, Beta] Different state applicable for a training run. IN PROGRESS: Training run is in progress. FAILED: Training run ended due to a non-retryable failure. SUCCEEDED: Training run successfully completed. CANCELLED: Training run cancelled by the user.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param trainingOptions [Output-only, Beta] Training options used by this training run. These options are mutable for subsequent training runs. Default values are explicitly stored for options not specified in the input query of the first training run. For subsequent training runs, any option not explicitly specified in the input query will be copied from the previous training run.
         * 
         * @return builder
         * 
         */
        public Builder trainingOptions(@Nullable Output<BqmlTrainingRunTrainingOptionsArgs> trainingOptions) {
            $.trainingOptions = trainingOptions;
            return this;
        }

        /**
         * @param trainingOptions [Output-only, Beta] Training options used by this training run. These options are mutable for subsequent training runs. Default values are explicitly stored for options not specified in the input query of the first training run. For subsequent training runs, any option not explicitly specified in the input query will be copied from the previous training run.
         * 
         * @return builder
         * 
         */
        public Builder trainingOptions(BqmlTrainingRunTrainingOptionsArgs trainingOptions) {
            return trainingOptions(Output.of(trainingOptions));
        }

        public BqmlTrainingRunArgs build() {
            return $;
        }
    }

}
