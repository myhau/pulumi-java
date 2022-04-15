// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;


/**
 * Job stages.
 * 
 */
public final class JobStagesResponse extends io.pulumi.resources.InvokeArgs {

    public static final JobStagesResponse Empty = new JobStagesResponse();

    /**
     * Display name of the job stage.
     * 
     */
    @Import(name="displayName", required=true)
      private final String displayName;

    public String displayName() {
        return this.displayName;
    }

    /**
     * Job Stage Details
     * 
     */
    @Import(name="jobStageDetails", required=true)
      private final Object jobStageDetails;

    public Object jobStageDetails() {
        return this.jobStageDetails;
    }

    /**
     * Name of the job stage.
     * 
     */
    @Import(name="stageName", required=true)
      private final String stageName;

    public String stageName() {
        return this.stageName;
    }

    /**
     * Status of the job stage.
     * 
     */
    @Import(name="stageStatus", required=true)
      private final String stageStatus;

    public String stageStatus() {
        return this.stageStatus;
    }

    /**
     * Time for the job stage in UTC ISO 8601 format.
     * 
     */
    @Import(name="stageTime", required=true)
      private final String stageTime;

    public String stageTime() {
        return this.stageTime;
    }

    public JobStagesResponse(
        String displayName,
        Object jobStageDetails,
        String stageName,
        String stageStatus,
        String stageTime) {
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.jobStageDetails = Objects.requireNonNull(jobStageDetails, "expected parameter 'jobStageDetails' to be non-null");
        this.stageName = Objects.requireNonNull(stageName, "expected parameter 'stageName' to be non-null");
        this.stageStatus = Objects.requireNonNull(stageStatus, "expected parameter 'stageStatus' to be non-null");
        this.stageTime = Objects.requireNonNull(stageTime, "expected parameter 'stageTime' to be non-null");
    }

    private JobStagesResponse() {
        this.displayName = null;
        this.jobStageDetails = null;
        this.stageName = null;
        this.stageStatus = null;
        this.stageTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStagesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private Object jobStageDetails;
        private String stageName;
        private String stageStatus;
        private String stageTime;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStagesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.jobStageDetails = defaults.jobStageDetails;
    	      this.stageName = defaults.stageName;
    	      this.stageStatus = defaults.stageStatus;
    	      this.stageTime = defaults.stageTime;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder jobStageDetails(Object jobStageDetails) {
            this.jobStageDetails = Objects.requireNonNull(jobStageDetails);
            return this;
        }
        public Builder stageName(String stageName) {
            this.stageName = Objects.requireNonNull(stageName);
            return this;
        }
        public Builder stageStatus(String stageStatus) {
            this.stageStatus = Objects.requireNonNull(stageStatus);
            return this;
        }
        public Builder stageTime(String stageTime) {
            this.stageTime = Objects.requireNonNull(stageTime);
            return this;
        }        public JobStagesResponse build() {
            return new JobStagesResponse(displayName, jobStageDetails, stageName, stageStatus, stageTime);
        }
    }
}
