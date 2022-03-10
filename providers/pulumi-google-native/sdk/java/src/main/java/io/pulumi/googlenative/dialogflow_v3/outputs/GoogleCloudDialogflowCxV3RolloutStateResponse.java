// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3RolloutStateResponse {
    /**
     * Start time of the current step.
     * 
     */
    private final String startTime;
    /**
     * Display name of the current auto rollout step.
     * 
     */
    private final String step;
    /**
     * Index of the current step in the auto rollout steps list.
     * 
     */
    private final Integer stepIndex;

    @OutputCustomType.Constructor
    private GoogleCloudDialogflowCxV3RolloutStateResponse(
        @OutputCustomType.Parameter("startTime") String startTime,
        @OutputCustomType.Parameter("step") String step,
        @OutputCustomType.Parameter("stepIndex") Integer stepIndex) {
        this.startTime = startTime;
        this.step = step;
        this.stepIndex = stepIndex;
    }

    /**
     * Start time of the current step.
     * 
    */
    public String getStartTime() {
        return this.startTime;
    }
    /**
     * Display name of the current auto rollout step.
     * 
    */
    public String getStep() {
        return this.step;
    }
    /**
     * Index of the current step in the auto rollout steps list.
     * 
    */
    public Integer getStepIndex() {
        return this.stepIndex;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3RolloutStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String startTime;
        private String step;
        private Integer stepIndex;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3RolloutStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.startTime = defaults.startTime;
    	      this.step = defaults.step;
    	      this.stepIndex = defaults.stepIndex;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setStep(String step) {
            this.step = Objects.requireNonNull(step);
            return this;
        }

        public Builder setStepIndex(Integer stepIndex) {
            this.stepIndex = Objects.requireNonNull(stepIndex);
            return this;
        }
        public GoogleCloudDialogflowCxV3RolloutStateResponse build() {
            return new GoogleCloudDialogflowCxV3RolloutStateResponse(startTime, step, stepIndex);
        }
    }
}
