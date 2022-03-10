// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class JobConditionResponse {
    /**
     * Optional. Last time the condition transitioned from one status to another.
     * 
     */
    private final String lastTransitionTime;
    /**
     * Optional. Human readable message indicating details about the current status.
     * 
     */
    private final String message;
    /**
     * Optional. One-word CamelCase reason for the condition's last transition.
     * 
     */
    private final String reason;
    /**
     * Optional. How to interpret failures of this condition, one of Error, Warning, Info
     * 
     */
    private final String severity;
    /**
     * Status of the condition, one of True, False, Unknown.
     * 
     */
    private final String status;
    /**
     * Type is used to communicate the status of the reconciliation process. See also: https://github.com/knative/serving/blob/main/docs/spec/errors.md#error-conditions-and-reporting Types include: * "Completed": True when the Job has successfully completed. * "Started": True when the Job has successfully started running. * "ResourcesAvailable": True when underlying resources have been provisioned.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private JobConditionResponse(
        @OutputCustomType.Parameter("lastTransitionTime") String lastTransitionTime,
        @OutputCustomType.Parameter("message") String message,
        @OutputCustomType.Parameter("reason") String reason,
        @OutputCustomType.Parameter("severity") String severity,
        @OutputCustomType.Parameter("status") String status,
        @OutputCustomType.Parameter("type") String type) {
        this.lastTransitionTime = lastTransitionTime;
        this.message = message;
        this.reason = reason;
        this.severity = severity;
        this.status = status;
        this.type = type;
    }

    /**
     * Optional. Last time the condition transitioned from one status to another.
     * 
    */
    public String getLastTransitionTime() {
        return this.lastTransitionTime;
    }
    /**
     * Optional. Human readable message indicating details about the current status.
     * 
    */
    public String getMessage() {
        return this.message;
    }
    /**
     * Optional. One-word CamelCase reason for the condition's last transition.
     * 
    */
    public String getReason() {
        return this.reason;
    }
    /**
     * Optional. How to interpret failures of this condition, one of Error, Warning, Info
     * 
    */
    public String getSeverity() {
        return this.severity;
    }
    /**
     * Status of the condition, one of True, False, Unknown.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * Type is used to communicate the status of the reconciliation process. See also: https://github.com/knative/serving/blob/main/docs/spec/errors.md#error-conditions-and-reporting Types include: * "Completed": True when the Job has successfully completed. * "Started": True when the Job has successfully started running. * "ResourcesAvailable": True when underlying resources have been provisioned.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String lastTransitionTime;
        private String message;
        private String reason;
        private String severity;
        private String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(JobConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastTransitionTime = defaults.lastTransitionTime;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
    	      this.severity = defaults.severity;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder setLastTransitionTime(String lastTransitionTime) {
            this.lastTransitionTime = Objects.requireNonNull(lastTransitionTime);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder setReason(String reason) {
            this.reason = Objects.requireNonNull(reason);
            return this;
        }

        public Builder setSeverity(String severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public JobConditionResponse build() {
            return new JobConditionResponse(lastTransitionTime, message, reason, severity, status, type);
        }
    }
}
