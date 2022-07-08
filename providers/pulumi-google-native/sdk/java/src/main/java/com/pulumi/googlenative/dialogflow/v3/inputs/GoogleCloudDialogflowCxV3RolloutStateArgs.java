// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * State of the auto-rollout process.
 * 
 */
public final class GoogleCloudDialogflowCxV3RolloutStateArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3RolloutStateArgs Empty = new GoogleCloudDialogflowCxV3RolloutStateArgs();

    /**
     * Start time of the current step.
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    /**
     * @return Start time of the current step.
     * 
     */
    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    /**
     * Display name of the current auto rollout step.
     * 
     */
    @Import(name="step")
    private @Nullable Output<String> step;

    /**
     * @return Display name of the current auto rollout step.
     * 
     */
    public Optional<Output<String>> step() {
        return Optional.ofNullable(this.step);
    }

    /**
     * Index of the current step in the auto rollout steps list.
     * 
     */
    @Import(name="stepIndex")
    private @Nullable Output<Integer> stepIndex;

    /**
     * @return Index of the current step in the auto rollout steps list.
     * 
     */
    public Optional<Output<Integer>> stepIndex() {
        return Optional.ofNullable(this.stepIndex);
    }

    private GoogleCloudDialogflowCxV3RolloutStateArgs() {}

    private GoogleCloudDialogflowCxV3RolloutStateArgs(GoogleCloudDialogflowCxV3RolloutStateArgs $) {
        this.startTime = $.startTime;
        this.step = $.step;
        this.stepIndex = $.stepIndex;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3RolloutStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3RolloutStateArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3RolloutStateArgs();
        }

        public Builder(GoogleCloudDialogflowCxV3RolloutStateArgs defaults) {
            $ = new GoogleCloudDialogflowCxV3RolloutStateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param startTime Start time of the current step.
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime Start time of the current step.
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        /**
         * @param step Display name of the current auto rollout step.
         * 
         * @return builder
         * 
         */
        public Builder step(@Nullable Output<String> step) {
            $.step = step;
            return this;
        }

        /**
         * @param step Display name of the current auto rollout step.
         * 
         * @return builder
         * 
         */
        public Builder step(String step) {
            return step(Output.of(step));
        }

        /**
         * @param stepIndex Index of the current step in the auto rollout steps list.
         * 
         * @return builder
         * 
         */
        public Builder stepIndex(@Nullable Output<Integer> stepIndex) {
            $.stepIndex = stepIndex;
            return this;
        }

        /**
         * @param stepIndex Index of the current step in the auto rollout steps list.
         * 
         * @return builder
         * 
         */
        public Builder stepIndex(Integer stepIndex) {
            return stepIndex(Output.of(stepIndex));
        }

        public GoogleCloudDialogflowCxV3RolloutStateArgs build() {
            return $;
        }
    }

}
