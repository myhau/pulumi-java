// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.ApiErrorResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class AvailablePatchSummaryResponse extends io.pulumi.resources.InvokeArgs {

    public static final AvailablePatchSummaryResponse Empty = new AvailablePatchSummaryResponse();

    @InputImport(name="assessmentActivityId", required=true)
    private final String assessmentActivityId;

    public String getAssessmentActivityId() {
        return this.assessmentActivityId;
    }

    @InputImport(name="criticalAndSecurityPatchCount", required=true)
    private final Integer criticalAndSecurityPatchCount;

    public Integer getCriticalAndSecurityPatchCount() {
        return this.criticalAndSecurityPatchCount;
    }

    @InputImport(name="error", required=true)
    private final ApiErrorResponse error;

    public ApiErrorResponse getError() {
        return this.error;
    }

    @InputImport(name="lastModifiedTime", required=true)
    private final String lastModifiedTime;

    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    @InputImport(name="otherPatchCount", required=true)
    private final Integer otherPatchCount;

    public Integer getOtherPatchCount() {
        return this.otherPatchCount;
    }

    @InputImport(name="rebootPending", required=true)
    private final Boolean rebootPending;

    public Boolean getRebootPending() {
        return this.rebootPending;
    }

    @InputImport(name="startTime", required=true)
    private final String startTime;

    public String getStartTime() {
        return this.startTime;
    }

    @InputImport(name="status", required=true)
    private final String status;

    public String getStatus() {
        return this.status;
    }

    public AvailablePatchSummaryResponse(
        String assessmentActivityId,
        Integer criticalAndSecurityPatchCount,
        ApiErrorResponse error,
        String lastModifiedTime,
        Integer otherPatchCount,
        Boolean rebootPending,
        String startTime,
        String status) {
        this.assessmentActivityId = Objects.requireNonNull(assessmentActivityId, "expected parameter 'assessmentActivityId' to be non-null");
        this.criticalAndSecurityPatchCount = Objects.requireNonNull(criticalAndSecurityPatchCount, "expected parameter 'criticalAndSecurityPatchCount' to be non-null");
        this.error = Objects.requireNonNull(error, "expected parameter 'error' to be non-null");
        this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime, "expected parameter 'lastModifiedTime' to be non-null");
        this.otherPatchCount = Objects.requireNonNull(otherPatchCount, "expected parameter 'otherPatchCount' to be non-null");
        this.rebootPending = Objects.requireNonNull(rebootPending, "expected parameter 'rebootPending' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private AvailablePatchSummaryResponse() {
        this.assessmentActivityId = null;
        this.criticalAndSecurityPatchCount = null;
        this.error = null;
        this.lastModifiedTime = null;
        this.otherPatchCount = null;
        this.rebootPending = null;
        this.startTime = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AvailablePatchSummaryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assessmentActivityId;
        private Integer criticalAndSecurityPatchCount;
        private ApiErrorResponse error;
        private String lastModifiedTime;
        private Integer otherPatchCount;
        private Boolean rebootPending;
        private String startTime;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(AvailablePatchSummaryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assessmentActivityId = defaults.assessmentActivityId;
    	      this.criticalAndSecurityPatchCount = defaults.criticalAndSecurityPatchCount;
    	      this.error = defaults.error;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.otherPatchCount = defaults.otherPatchCount;
    	      this.rebootPending = defaults.rebootPending;
    	      this.startTime = defaults.startTime;
    	      this.status = defaults.status;
        }

        public Builder setAssessmentActivityId(String assessmentActivityId) {
            this.assessmentActivityId = Objects.requireNonNull(assessmentActivityId);
            return this;
        }

        public Builder setCriticalAndSecurityPatchCount(Integer criticalAndSecurityPatchCount) {
            this.criticalAndSecurityPatchCount = Objects.requireNonNull(criticalAndSecurityPatchCount);
            return this;
        }

        public Builder setError(ApiErrorResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }

        public Builder setLastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
            return this;
        }

        public Builder setOtherPatchCount(Integer otherPatchCount) {
            this.otherPatchCount = Objects.requireNonNull(otherPatchCount);
            return this;
        }

        public Builder setRebootPending(Boolean rebootPending) {
            this.rebootPending = Objects.requireNonNull(rebootPending);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public AvailablePatchSummaryResponse build() {
            return new AvailablePatchSummaryResponse(assessmentActivityId, criticalAndSecurityPatchCount, error, lastModifiedTime, otherPatchCount, rebootPending, startTime, status);
        }
    }
}