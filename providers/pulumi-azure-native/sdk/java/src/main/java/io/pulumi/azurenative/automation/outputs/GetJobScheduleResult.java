// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.azurenative.automation.outputs.RunbookAssociationPropertyResponse;
import io.pulumi.azurenative.automation.outputs.ScheduleAssociationPropertyResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetJobScheduleResult {
    private final String id;
    private final @Nullable String jobScheduleId;
    private final String name;
    private final @Nullable Map<String,String> parameters;
    private final @Nullable String runOn;
    private final @Nullable RunbookAssociationPropertyResponse runbook;
    private final @Nullable ScheduleAssociationPropertyResponse schedule;
    private final String type;

    @OutputCustomType.Constructor({"id","jobScheduleId","name","parameters","runOn","runbook","schedule","type"})
    private GetJobScheduleResult(
        String id,
        @Nullable String jobScheduleId,
        String name,
        @Nullable Map<String,String> parameters,
        @Nullable String runOn,
        @Nullable RunbookAssociationPropertyResponse runbook,
        @Nullable ScheduleAssociationPropertyResponse schedule,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.jobScheduleId = jobScheduleId;
        this.name = Objects.requireNonNull(name);
        this.parameters = parameters;
        this.runOn = runOn;
        this.runbook = runbook;
        this.schedule = schedule;
        this.type = Objects.requireNonNull(type);
    }

    public String getId() {
        return this.id;
    }
    public Optional<String> getJobScheduleId() {
        return Optional.ofNullable(this.jobScheduleId);
    }
    public String getName() {
        return this.name;
    }
    public Map<String,String> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    public Optional<String> getRunOn() {
        return Optional.ofNullable(this.runOn);
    }
    public Optional<RunbookAssociationPropertyResponse> getRunbook() {
        return Optional.ofNullable(this.runbook);
    }
    public Optional<ScheduleAssociationPropertyResponse> getSchedule() {
        return Optional.ofNullable(this.schedule);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobScheduleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String jobScheduleId;
        private String name;
        private @Nullable Map<String,String> parameters;
        private @Nullable String runOn;
        private @Nullable RunbookAssociationPropertyResponse runbook;
        private @Nullable ScheduleAssociationPropertyResponse schedule;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJobScheduleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.jobScheduleId = defaults.jobScheduleId;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.runOn = defaults.runOn;
    	      this.runbook = defaults.runbook;
    	      this.schedule = defaults.schedule;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setJobScheduleId(@Nullable String jobScheduleId) {
            this.jobScheduleId = jobScheduleId;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParameters(@Nullable Map<String,String> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setRunOn(@Nullable String runOn) {
            this.runOn = runOn;
            return this;
        }

        public Builder setRunbook(@Nullable RunbookAssociationPropertyResponse runbook) {
            this.runbook = runbook;
            return this;
        }

        public Builder setSchedule(@Nullable ScheduleAssociationPropertyResponse schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetJobScheduleResult build() {
            return new GetJobScheduleResult(id, jobScheduleId, name, parameters, runOn, runbook, schedule, type);
        }
    }
}