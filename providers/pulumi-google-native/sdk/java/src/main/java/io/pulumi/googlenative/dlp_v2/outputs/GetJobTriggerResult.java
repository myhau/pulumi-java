// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2ErrorResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2InspectJobConfigResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2TriggerResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetJobTriggerResult {
    /**
     * The creation timestamp of a triggeredJob.
     * 
     */
    private final String createTime;
    /**
     * User provided description (max 256 chars)
     * 
     */
    private final String description;
    /**
     * Display name (max 100 chars)
     * 
     */
    private final String displayName;
    /**
     * A stream of errors encountered when the trigger was activated. Repeated errors may result in the JobTrigger automatically being paused. Will return the last 100 errors. Whenever the JobTrigger is modified this list will be cleared.
     * 
     */
    private final List<GooglePrivacyDlpV2ErrorResponse> errors;
    /**
     * For inspect jobs, a snapshot of the configuration.
     * 
     */
    private final GooglePrivacyDlpV2InspectJobConfigResponse inspectJob;
    /**
     * The timestamp of the last time this trigger executed.
     * 
     */
    private final String lastRunTime;
    /**
     * Unique resource name for the triggeredJob, assigned by the service when the triggeredJob is created, for example `projects/dlp-test-project/jobTriggers/53234423`.
     * 
     */
    private final String name;
    /**
     * A status for this trigger.
     * 
     */
    private final String status;
    /**
     * A list of triggers which will be OR'ed together. Only one in the list needs to trigger for a job to be started. The list may contain only a single Schedule trigger and must have at least one object.
     * 
     */
    private final List<GooglePrivacyDlpV2TriggerResponse> triggers;
    /**
     * The last update timestamp of a triggeredJob.
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor
    private GetJobTriggerResult(
        @OutputCustomType.Parameter("createTime") String createTime,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("displayName") String displayName,
        @OutputCustomType.Parameter("errors") List<GooglePrivacyDlpV2ErrorResponse> errors,
        @OutputCustomType.Parameter("inspectJob") GooglePrivacyDlpV2InspectJobConfigResponse inspectJob,
        @OutputCustomType.Parameter("lastRunTime") String lastRunTime,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("status") String status,
        @OutputCustomType.Parameter("triggers") List<GooglePrivacyDlpV2TriggerResponse> triggers,
        @OutputCustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.description = description;
        this.displayName = displayName;
        this.errors = errors;
        this.inspectJob = inspectJob;
        this.lastRunTime = lastRunTime;
        this.name = name;
        this.status = status;
        this.triggers = triggers;
        this.updateTime = updateTime;
    }

    /**
     * The creation timestamp of a triggeredJob.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * User provided description (max 256 chars)
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Display name (max 100 chars)
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * A stream of errors encountered when the trigger was activated. Repeated errors may result in the JobTrigger automatically being paused. Will return the last 100 errors. Whenever the JobTrigger is modified this list will be cleared.
     * 
    */
    public List<GooglePrivacyDlpV2ErrorResponse> getErrors() {
        return this.errors;
    }
    /**
     * For inspect jobs, a snapshot of the configuration.
     * 
    */
    public GooglePrivacyDlpV2InspectJobConfigResponse getInspectJob() {
        return this.inspectJob;
    }
    /**
     * The timestamp of the last time this trigger executed.
     * 
    */
    public String getLastRunTime() {
        return this.lastRunTime;
    }
    /**
     * Unique resource name for the triggeredJob, assigned by the service when the triggeredJob is created, for example `projects/dlp-test-project/jobTriggers/53234423`.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * A status for this trigger.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * A list of triggers which will be OR'ed together. Only one in the list needs to trigger for a job to be started. The list may contain only a single Schedule trigger and must have at least one object.
     * 
    */
    public List<GooglePrivacyDlpV2TriggerResponse> getTriggers() {
        return this.triggers;
    }
    /**
     * The last update timestamp of a triggeredJob.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobTriggerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private String displayName;
        private List<GooglePrivacyDlpV2ErrorResponse> errors;
        private GooglePrivacyDlpV2InspectJobConfigResponse inspectJob;
        private String lastRunTime;
        private String name;
        private String status;
        private List<GooglePrivacyDlpV2TriggerResponse> triggers;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJobTriggerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.errors = defaults.errors;
    	      this.inspectJob = defaults.inspectJob;
    	      this.lastRunTime = defaults.lastRunTime;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
    	      this.triggers = defaults.triggers;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setErrors(List<GooglePrivacyDlpV2ErrorResponse> errors) {
            this.errors = Objects.requireNonNull(errors);
            return this;
        }

        public Builder setInspectJob(GooglePrivacyDlpV2InspectJobConfigResponse inspectJob) {
            this.inspectJob = Objects.requireNonNull(inspectJob);
            return this;
        }

        public Builder setLastRunTime(String lastRunTime) {
            this.lastRunTime = Objects.requireNonNull(lastRunTime);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setTriggers(List<GooglePrivacyDlpV2TriggerResponse> triggers) {
            this.triggers = Objects.requireNonNull(triggers);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetJobTriggerResult build() {
            return new GetJobTriggerResult(createTime, description, displayName, errors, inspectJob, lastRunTime, name, status, triggers, updateTime);
        }
    }
}
