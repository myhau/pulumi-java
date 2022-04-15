// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RerunTumblingWindowTriggerResponse {
    /**
     * List of tags that can be used for describing the trigger.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * Trigger description.
     * 
     */
    private final @Nullable String description;
    /**
     * The parent trigger reference.
     * 
     */
    private final Object parentTrigger;
    /**
     * The end time for the time period for which restatement is initiated. Only UTC time is currently supported.
     * 
     */
    private final String requestedEndTime;
    /**
     * The start time for the time period for which restatement is initiated. Only UTC time is currently supported.
     * 
     */
    private final String requestedStartTime;
    /**
     * The max number of parallel time windows (ready for execution) for which a rerun is triggered.
     * 
     */
    private final Integer rerunConcurrency;
    /**
     * Indicates if trigger is running or not. Updated when Start/Stop APIs are called on the Trigger.
     * 
     */
    private final String runtimeState;
    /**
     * Trigger type.
     * Expected value is 'RerunTumblingWindowTrigger'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private RerunTumblingWindowTriggerResponse(
        @CustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("parentTrigger") Object parentTrigger,
        @CustomType.Parameter("requestedEndTime") String requestedEndTime,
        @CustomType.Parameter("requestedStartTime") String requestedStartTime,
        @CustomType.Parameter("rerunConcurrency") Integer rerunConcurrency,
        @CustomType.Parameter("runtimeState") String runtimeState,
        @CustomType.Parameter("type") String type) {
        this.annotations = annotations;
        this.description = description;
        this.parentTrigger = parentTrigger;
        this.requestedEndTime = requestedEndTime;
        this.requestedStartTime = requestedStartTime;
        this.rerunConcurrency = rerunConcurrency;
        this.runtimeState = runtimeState;
        this.type = type;
    }

    /**
     * List of tags that can be used for describing the trigger.
     * 
    */
    public List<Object> annotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * Trigger description.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The parent trigger reference.
     * 
    */
    public Object parentTrigger() {
        return this.parentTrigger;
    }
    /**
     * The end time for the time period for which restatement is initiated. Only UTC time is currently supported.
     * 
    */
    public String requestedEndTime() {
        return this.requestedEndTime;
    }
    /**
     * The start time for the time period for which restatement is initiated. Only UTC time is currently supported.
     * 
    */
    public String requestedStartTime() {
        return this.requestedStartTime;
    }
    /**
     * The max number of parallel time windows (ready for execution) for which a rerun is triggered.
     * 
    */
    public Integer rerunConcurrency() {
        return this.rerunConcurrency;
    }
    /**
     * Indicates if trigger is running or not. Updated when Start/Stop APIs are called on the Trigger.
     * 
    */
    public String runtimeState() {
        return this.runtimeState;
    }
    /**
     * Trigger type.
     * Expected value is 'RerunTumblingWindowTrigger'.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RerunTumblingWindowTriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable String description;
        private Object parentTrigger;
        private String requestedEndTime;
        private String requestedStartTime;
        private Integer rerunConcurrency;
        private String runtimeState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(RerunTumblingWindowTriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.description = defaults.description;
    	      this.parentTrigger = defaults.parentTrigger;
    	      this.requestedEndTime = defaults.requestedEndTime;
    	      this.requestedStartTime = defaults.requestedStartTime;
    	      this.rerunConcurrency = defaults.rerunConcurrency;
    	      this.runtimeState = defaults.runtimeState;
    	      this.type = defaults.type;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder parentTrigger(Object parentTrigger) {
            this.parentTrigger = Objects.requireNonNull(parentTrigger);
            return this;
        }
        public Builder requestedEndTime(String requestedEndTime) {
            this.requestedEndTime = Objects.requireNonNull(requestedEndTime);
            return this;
        }
        public Builder requestedStartTime(String requestedStartTime) {
            this.requestedStartTime = Objects.requireNonNull(requestedStartTime);
            return this;
        }
        public Builder rerunConcurrency(Integer rerunConcurrency) {
            this.rerunConcurrency = Objects.requireNonNull(rerunConcurrency);
            return this;
        }
        public Builder runtimeState(String runtimeState) {
            this.runtimeState = Objects.requireNonNull(runtimeState);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public RerunTumblingWindowTriggerResponse build() {
            return new RerunTumblingWindowTriggerResponse(annotations, description, parentTrigger, requestedEndTime, requestedStartTime, rerunConcurrency, runtimeState, type);
        }
    }
}
