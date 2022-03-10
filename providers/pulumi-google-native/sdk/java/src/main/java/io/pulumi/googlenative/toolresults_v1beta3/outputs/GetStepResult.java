// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.DurationResponse;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.MultiStepResponse;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.OutcomeResponse;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.StepDimensionValueEntryResponse;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.StepLabelsEntryResponse;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.TestExecutionStepResponse;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.TimestampResponse;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.ToolExecutionStepResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetStepResult {
    /**
     * The time when the step status was set to complete. This value will be set automatically when state transitions to COMPLETE. - In response: set if the execution state is COMPLETE. - In create/update request: never set
     * 
     */
    private final TimestampResponse completionTime;
    /**
     * The time when the step was created. - In response: always set - In create/update request: never set
     * 
     */
    private final TimestampResponse creationTime;
    /**
     * A description of this tool For example: mvn clean package -D skipTests=true - In response: present if set by create/update request - In create/update request: optional
     * 
     */
    private final String description;
    /**
     * How much the device resource is used to perform the test. This is the device usage used for billing purpose, which is different from the run_duration, for example, infrastructure failure won't be charged for device usage. PRECONDITION_FAILED will be returned if one attempts to set a device_usage on a step which already has this field set. - In response: present if previously set. - In create request: optional - In update request: optional
     * 
     */
    private final DurationResponse deviceUsageDuration;
    /**
     * If the execution containing this step has any dimension_definition set, then this field allows the child to specify the values of the dimensions. The keys must exactly match the dimension_definition of the execution. For example, if the execution has `dimension_definition = ['attempt', 'device']` then a step must define values for those dimensions, eg. `dimension_value = ['attempt': '1', 'device': 'Nexus 6']` If a step does not participate in one dimension of the matrix, the value for that dimension should be empty string. For example, if one of the tests is executed by a runner which does not support retries, the step could have `dimension_value = ['attempt': '', 'device': 'Nexus 6']` If the step does not participate in any dimensions of the matrix, it may leave dimension_value unset. A PRECONDITION_FAILED will be returned if any of the keys do not exist in the dimension_definition of the execution. A PRECONDITION_FAILED will be returned if another step in this execution already has the same name and dimension_value, but differs on other data fields, for example, step field is different. A PRECONDITION_FAILED will be returned if dimension_value is set, and there is a dimension_definition in the execution which is not specified as one of the keys. - In response: present if set by create - In create request: optional - In update request: never set
     * 
     */
    private final List<StepDimensionValueEntryResponse> dimensionValue;
    /**
     * Whether any of the outputs of this step are images whose thumbnails can be fetched with ListThumbnails. - In response: always set - In create/update request: never set
     * 
     */
    private final Boolean hasImages;
    /**
     * Arbitrary user-supplied key/value pairs that are associated with the step. Users are responsible for managing the key namespace such that keys don't accidentally collide. An INVALID_ARGUMENT will be returned if the number of labels exceeds 100 or if the length of any of the keys or values exceeds 100 characters. - In response: always set - In create request: optional - In update request: optional; any new key/value pair will be added to the map, and any new value for an existing key will update that key's value
     * 
     */
    private final List<StepLabelsEntryResponse> labels;
    /**
     * Details when multiple steps are run with the same configuration as a group. These details can be used identify which group this step is part of. It also identifies the groups 'primary step' which indexes all the group members. - In response: present if previously set. - In create request: optional, set iff this step was performed more than once. - In update request: optional
     * 
     */
    private final MultiStepResponse multiStep;
    /**
     * A short human-readable name to display in the UI. Maximum of 100 characters. For example: Clean build A PRECONDITION_FAILED will be returned upon creating a new step if it shares its name and dimension_value with an existing step. If two steps represent a similar action, but have different dimension values, they should share the same name. For instance, if the same set of tests is run on two different platforms, the two steps should have the same name. - In response: always set - In create request: always set - In update request: never set
     * 
     */
    private final String name;
    /**
     * Classification of the result, for example into SUCCESS or FAILURE - In response: present if set by create/update request - In create/update request: optional
     * 
     */
    private final OutcomeResponse outcome;
    /**
     * How long it took for this step to run. If unset, this is set to the difference between creation_time and completion_time when the step is set to the COMPLETE state. In some cases, it is appropriate to set this value separately: For instance, if a step is created, but the operation it represents is queued for a few minutes before it executes, it would be appropriate not to include the time spent queued in its run_duration. PRECONDITION_FAILED will be returned if one attempts to set a run_duration on a step which already has this field set. - In response: present if previously set; always present on COMPLETE step - In create request: optional - In update request: optional
     * 
     */
    private final DurationResponse runDuration;
    /**
     * The initial state is IN_PROGRESS. The only legal state transitions are * IN_PROGRESS -> COMPLETE A PRECONDITION_FAILED will be returned if an invalid transition is requested. It is valid to create Step with a state set to COMPLETE. The state can only be set to COMPLETE once. A PRECONDITION_FAILED will be returned if the state is set to COMPLETE multiple times. - In response: always set - In create/update request: optional
     * 
     */
    private final String state;
    /**
     * A unique identifier within a Execution for this Step. Returns INVALID_ARGUMENT if this field is set or overwritten by the caller. - In response: always set - In create/update request: never set
     * 
     */
    private final String stepId;
    /**
     * An execution of a test runner.
     * 
     */
    private final TestExecutionStepResponse testExecutionStep;
    /**
     * An execution of a tool (used for steps we don't explicitly support).
     * 
     */
    private final ToolExecutionStepResponse toolExecutionStep;

    @OutputCustomType.Constructor
    private GetStepResult(
        @OutputCustomType.Parameter("completionTime") TimestampResponse completionTime,
        @OutputCustomType.Parameter("creationTime") TimestampResponse creationTime,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("deviceUsageDuration") DurationResponse deviceUsageDuration,
        @OutputCustomType.Parameter("dimensionValue") List<StepDimensionValueEntryResponse> dimensionValue,
        @OutputCustomType.Parameter("hasImages") Boolean hasImages,
        @OutputCustomType.Parameter("labels") List<StepLabelsEntryResponse> labels,
        @OutputCustomType.Parameter("multiStep") MultiStepResponse multiStep,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("outcome") OutcomeResponse outcome,
        @OutputCustomType.Parameter("runDuration") DurationResponse runDuration,
        @OutputCustomType.Parameter("state") String state,
        @OutputCustomType.Parameter("stepId") String stepId,
        @OutputCustomType.Parameter("testExecutionStep") TestExecutionStepResponse testExecutionStep,
        @OutputCustomType.Parameter("toolExecutionStep") ToolExecutionStepResponse toolExecutionStep) {
        this.completionTime = completionTime;
        this.creationTime = creationTime;
        this.description = description;
        this.deviceUsageDuration = deviceUsageDuration;
        this.dimensionValue = dimensionValue;
        this.hasImages = hasImages;
        this.labels = labels;
        this.multiStep = multiStep;
        this.name = name;
        this.outcome = outcome;
        this.runDuration = runDuration;
        this.state = state;
        this.stepId = stepId;
        this.testExecutionStep = testExecutionStep;
        this.toolExecutionStep = toolExecutionStep;
    }

    /**
     * The time when the step status was set to complete. This value will be set automatically when state transitions to COMPLETE. - In response: set if the execution state is COMPLETE. - In create/update request: never set
     * 
    */
    public TimestampResponse getCompletionTime() {
        return this.completionTime;
    }
    /**
     * The time when the step was created. - In response: always set - In create/update request: never set
     * 
    */
    public TimestampResponse getCreationTime() {
        return this.creationTime;
    }
    /**
     * A description of this tool For example: mvn clean package -D skipTests=true - In response: present if set by create/update request - In create/update request: optional
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * How much the device resource is used to perform the test. This is the device usage used for billing purpose, which is different from the run_duration, for example, infrastructure failure won't be charged for device usage. PRECONDITION_FAILED will be returned if one attempts to set a device_usage on a step which already has this field set. - In response: present if previously set. - In create request: optional - In update request: optional
     * 
    */
    public DurationResponse getDeviceUsageDuration() {
        return this.deviceUsageDuration;
    }
    /**
     * If the execution containing this step has any dimension_definition set, then this field allows the child to specify the values of the dimensions. The keys must exactly match the dimension_definition of the execution. For example, if the execution has `dimension_definition = ['attempt', 'device']` then a step must define values for those dimensions, eg. `dimension_value = ['attempt': '1', 'device': 'Nexus 6']` If a step does not participate in one dimension of the matrix, the value for that dimension should be empty string. For example, if one of the tests is executed by a runner which does not support retries, the step could have `dimension_value = ['attempt': '', 'device': 'Nexus 6']` If the step does not participate in any dimensions of the matrix, it may leave dimension_value unset. A PRECONDITION_FAILED will be returned if any of the keys do not exist in the dimension_definition of the execution. A PRECONDITION_FAILED will be returned if another step in this execution already has the same name and dimension_value, but differs on other data fields, for example, step field is different. A PRECONDITION_FAILED will be returned if dimension_value is set, and there is a dimension_definition in the execution which is not specified as one of the keys. - In response: present if set by create - In create request: optional - In update request: never set
     * 
    */
    public List<StepDimensionValueEntryResponse> getDimensionValue() {
        return this.dimensionValue;
    }
    /**
     * Whether any of the outputs of this step are images whose thumbnails can be fetched with ListThumbnails. - In response: always set - In create/update request: never set
     * 
    */
    public Boolean getHasImages() {
        return this.hasImages;
    }
    /**
     * Arbitrary user-supplied key/value pairs that are associated with the step. Users are responsible for managing the key namespace such that keys don't accidentally collide. An INVALID_ARGUMENT will be returned if the number of labels exceeds 100 or if the length of any of the keys or values exceeds 100 characters. - In response: always set - In create request: optional - In update request: optional; any new key/value pair will be added to the map, and any new value for an existing key will update that key's value
     * 
    */
    public List<StepLabelsEntryResponse> getLabels() {
        return this.labels;
    }
    /**
     * Details when multiple steps are run with the same configuration as a group. These details can be used identify which group this step is part of. It also identifies the groups 'primary step' which indexes all the group members. - In response: present if previously set. - In create request: optional, set iff this step was performed more than once. - In update request: optional
     * 
    */
    public MultiStepResponse getMultiStep() {
        return this.multiStep;
    }
    /**
     * A short human-readable name to display in the UI. Maximum of 100 characters. For example: Clean build A PRECONDITION_FAILED will be returned upon creating a new step if it shares its name and dimension_value with an existing step. If two steps represent a similar action, but have different dimension values, they should share the same name. For instance, if the same set of tests is run on two different platforms, the two steps should have the same name. - In response: always set - In create request: always set - In update request: never set
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Classification of the result, for example into SUCCESS or FAILURE - In response: present if set by create/update request - In create/update request: optional
     * 
    */
    public OutcomeResponse getOutcome() {
        return this.outcome;
    }
    /**
     * How long it took for this step to run. If unset, this is set to the difference between creation_time and completion_time when the step is set to the COMPLETE state. In some cases, it is appropriate to set this value separately: For instance, if a step is created, but the operation it represents is queued for a few minutes before it executes, it would be appropriate not to include the time spent queued in its run_duration. PRECONDITION_FAILED will be returned if one attempts to set a run_duration on a step which already has this field set. - In response: present if previously set; always present on COMPLETE step - In create request: optional - In update request: optional
     * 
    */
    public DurationResponse getRunDuration() {
        return this.runDuration;
    }
    /**
     * The initial state is IN_PROGRESS. The only legal state transitions are * IN_PROGRESS -> COMPLETE A PRECONDITION_FAILED will be returned if an invalid transition is requested. It is valid to create Step with a state set to COMPLETE. The state can only be set to COMPLETE once. A PRECONDITION_FAILED will be returned if the state is set to COMPLETE multiple times. - In response: always set - In create/update request: optional
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * A unique identifier within a Execution for this Step. Returns INVALID_ARGUMENT if this field is set or overwritten by the caller. - In response: always set - In create/update request: never set
     * 
    */
    public String getStepId() {
        return this.stepId;
    }
    /**
     * An execution of a test runner.
     * 
    */
    public TestExecutionStepResponse getTestExecutionStep() {
        return this.testExecutionStep;
    }
    /**
     * An execution of a tool (used for steps we don't explicitly support).
     * 
    */
    public ToolExecutionStepResponse getToolExecutionStep() {
        return this.toolExecutionStep;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStepResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TimestampResponse completionTime;
        private TimestampResponse creationTime;
        private String description;
        private DurationResponse deviceUsageDuration;
        private List<StepDimensionValueEntryResponse> dimensionValue;
        private Boolean hasImages;
        private List<StepLabelsEntryResponse> labels;
        private MultiStepResponse multiStep;
        private String name;
        private OutcomeResponse outcome;
        private DurationResponse runDuration;
        private String state;
        private String stepId;
        private TestExecutionStepResponse testExecutionStep;
        private ToolExecutionStepResponse toolExecutionStep;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStepResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.completionTime = defaults.completionTime;
    	      this.creationTime = defaults.creationTime;
    	      this.description = defaults.description;
    	      this.deviceUsageDuration = defaults.deviceUsageDuration;
    	      this.dimensionValue = defaults.dimensionValue;
    	      this.hasImages = defaults.hasImages;
    	      this.labels = defaults.labels;
    	      this.multiStep = defaults.multiStep;
    	      this.name = defaults.name;
    	      this.outcome = defaults.outcome;
    	      this.runDuration = defaults.runDuration;
    	      this.state = defaults.state;
    	      this.stepId = defaults.stepId;
    	      this.testExecutionStep = defaults.testExecutionStep;
    	      this.toolExecutionStep = defaults.toolExecutionStep;
        }

        public Builder setCompletionTime(TimestampResponse completionTime) {
            this.completionTime = Objects.requireNonNull(completionTime);
            return this;
        }

        public Builder setCreationTime(TimestampResponse creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDeviceUsageDuration(DurationResponse deviceUsageDuration) {
            this.deviceUsageDuration = Objects.requireNonNull(deviceUsageDuration);
            return this;
        }

        public Builder setDimensionValue(List<StepDimensionValueEntryResponse> dimensionValue) {
            this.dimensionValue = Objects.requireNonNull(dimensionValue);
            return this;
        }

        public Builder setHasImages(Boolean hasImages) {
            this.hasImages = Objects.requireNonNull(hasImages);
            return this;
        }

        public Builder setLabels(List<StepLabelsEntryResponse> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setMultiStep(MultiStepResponse multiStep) {
            this.multiStep = Objects.requireNonNull(multiStep);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOutcome(OutcomeResponse outcome) {
            this.outcome = Objects.requireNonNull(outcome);
            return this;
        }

        public Builder setRunDuration(DurationResponse runDuration) {
            this.runDuration = Objects.requireNonNull(runDuration);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setStepId(String stepId) {
            this.stepId = Objects.requireNonNull(stepId);
            return this;
        }

        public Builder setTestExecutionStep(TestExecutionStepResponse testExecutionStep) {
            this.testExecutionStep = Objects.requireNonNull(testExecutionStep);
            return this;
        }

        public Builder setToolExecutionStep(ToolExecutionStepResponse toolExecutionStep) {
            this.toolExecutionStep = Objects.requireNonNull(toolExecutionStep);
            return this;
        }
        public GetStepResult build() {
            return new GetStepResult(completionTime, creationTime, description, deviceUsageDuration, dimensionValue, hasImages, labels, multiStep, name, outcome, runDuration, state, stepId, testExecutionStep, toolExecutionStep);
        }
    }
}
