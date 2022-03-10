// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2AnalyzeDataSourceRiskDetailsResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2ErrorResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2InspectDataSourceDetailsResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetDlpJobResult {
    /**
     * Time when the job was created.
     * 
     */
    private final String createTime;
    /**
     * Time when the job finished.
     * 
     */
    private final String endTime;
    /**
     * A stream of errors encountered running the job.
     * 
     */
    private final List<GooglePrivacyDlpV2ErrorResponse> errors;
    /**
     * Results from inspecting a data source.
     * 
     */
    private final GooglePrivacyDlpV2InspectDataSourceDetailsResponse inspectDetails;
    /**
     * If created by a job trigger, the resource name of the trigger that instantiated the job.
     * 
     */
    private final String jobTriggerName;
    /**
     * The server-assigned name.
     * 
     */
    private final String name;
    /**
     * Results from analyzing risk of a data source.
     * 
     */
    private final GooglePrivacyDlpV2AnalyzeDataSourceRiskDetailsResponse riskDetails;
    /**
     * Time when the job started.
     * 
     */
    private final String startTime;
    /**
     * State of a job.
     * 
     */
    private final String state;
    /**
     * The type of job.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetDlpJobResult(
        @OutputCustomType.Parameter("createTime") String createTime,
        @OutputCustomType.Parameter("endTime") String endTime,
        @OutputCustomType.Parameter("errors") List<GooglePrivacyDlpV2ErrorResponse> errors,
        @OutputCustomType.Parameter("inspectDetails") GooglePrivacyDlpV2InspectDataSourceDetailsResponse inspectDetails,
        @OutputCustomType.Parameter("jobTriggerName") String jobTriggerName,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("riskDetails") GooglePrivacyDlpV2AnalyzeDataSourceRiskDetailsResponse riskDetails,
        @OutputCustomType.Parameter("startTime") String startTime,
        @OutputCustomType.Parameter("state") String state,
        @OutputCustomType.Parameter("type") String type) {
        this.createTime = createTime;
        this.endTime = endTime;
        this.errors = errors;
        this.inspectDetails = inspectDetails;
        this.jobTriggerName = jobTriggerName;
        this.name = name;
        this.riskDetails = riskDetails;
        this.startTime = startTime;
        this.state = state;
        this.type = type;
    }

    /**
     * Time when the job was created.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Time when the job finished.
     * 
    */
    public String getEndTime() {
        return this.endTime;
    }
    /**
     * A stream of errors encountered running the job.
     * 
    */
    public List<GooglePrivacyDlpV2ErrorResponse> getErrors() {
        return this.errors;
    }
    /**
     * Results from inspecting a data source.
     * 
    */
    public GooglePrivacyDlpV2InspectDataSourceDetailsResponse getInspectDetails() {
        return this.inspectDetails;
    }
    /**
     * If created by a job trigger, the resource name of the trigger that instantiated the job.
     * 
    */
    public String getJobTriggerName() {
        return this.jobTriggerName;
    }
    /**
     * The server-assigned name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Results from analyzing risk of a data source.
     * 
    */
    public GooglePrivacyDlpV2AnalyzeDataSourceRiskDetailsResponse getRiskDetails() {
        return this.riskDetails;
    }
    /**
     * Time when the job started.
     * 
    */
    public String getStartTime() {
        return this.startTime;
    }
    /**
     * State of a job.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * The type of job.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDlpJobResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String endTime;
        private List<GooglePrivacyDlpV2ErrorResponse> errors;
        private GooglePrivacyDlpV2InspectDataSourceDetailsResponse inspectDetails;
        private String jobTriggerName;
        private String name;
        private GooglePrivacyDlpV2AnalyzeDataSourceRiskDetailsResponse riskDetails;
        private String startTime;
        private String state;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDlpJobResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.endTime = defaults.endTime;
    	      this.errors = defaults.errors;
    	      this.inspectDetails = defaults.inspectDetails;
    	      this.jobTriggerName = defaults.jobTriggerName;
    	      this.name = defaults.name;
    	      this.riskDetails = defaults.riskDetails;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setErrors(List<GooglePrivacyDlpV2ErrorResponse> errors) {
            this.errors = Objects.requireNonNull(errors);
            return this;
        }

        public Builder setInspectDetails(GooglePrivacyDlpV2InspectDataSourceDetailsResponse inspectDetails) {
            this.inspectDetails = Objects.requireNonNull(inspectDetails);
            return this;
        }

        public Builder setJobTriggerName(String jobTriggerName) {
            this.jobTriggerName = Objects.requireNonNull(jobTriggerName);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRiskDetails(GooglePrivacyDlpV2AnalyzeDataSourceRiskDetailsResponse riskDetails) {
            this.riskDetails = Objects.requireNonNull(riskDetails);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetDlpJobResult build() {
            return new GetDlpJobResult(createTime, endTime, errors, inspectDetails, jobTriggerName, name, riskDetails, startTime, state, type);
        }
    }
}
