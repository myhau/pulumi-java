// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudRunOpV2ConditionResponse {
    /**
     * A reason for the domain mapping condition.
     * 
     */
    private final String domainMappingReason;
    /**
     * A reason for the execution condition.
     * 
     */
    private final String executionReason;
    /**
     * A reason for the internal condition.
     * 
     */
    private final String internalReason;
    /**
     * Last time the condition transitioned from one status to another.
     * 
     */
    private final String lastTransitionTime;
    /**
     * Human readable message indicating details about the current status.
     * 
     */
    private final String message;
    /**
     * A common (service-level) reason for this condition.
     * 
     */
    private final String reason;
    /**
     * A reason for the revision condition.
     * 
     */
    private final String revisionReason;
    /**
     * How to interpret failures of this condition, one of Error, Warning, Info
     * 
     */
    private final String severity;
    /**
     * State of the condition.
     * 
     */
    private final String state;
    /**
     * type is used to communicate the status of the reconciliation process. See also: https://github.com/knative/serving/blob/main/docs/spec/errors.md#error-conditions-and-reporting Types common to all resources include: * "Ready": True when the Resource is ready.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"domainMappingReason","executionReason","internalReason","lastTransitionTime","message","reason","revisionReason","severity","state","type"})
    private GoogleCloudRunOpV2ConditionResponse(
        String domainMappingReason,
        String executionReason,
        String internalReason,
        String lastTransitionTime,
        String message,
        String reason,
        String revisionReason,
        String severity,
        String state,
        String type) {
        this.domainMappingReason = domainMappingReason;
        this.executionReason = executionReason;
        this.internalReason = internalReason;
        this.lastTransitionTime = lastTransitionTime;
        this.message = message;
        this.reason = reason;
        this.revisionReason = revisionReason;
        this.severity = severity;
        this.state = state;
        this.type = type;
    }

    /**
     * A reason for the domain mapping condition.
     * 
    */
    public String getDomainMappingReason() {
        return this.domainMappingReason;
    }
    /**
     * A reason for the execution condition.
     * 
    */
    public String getExecutionReason() {
        return this.executionReason;
    }
    /**
     * A reason for the internal condition.
     * 
    */
    public String getInternalReason() {
        return this.internalReason;
    }
    /**
     * Last time the condition transitioned from one status to another.
     * 
    */
    public String getLastTransitionTime() {
        return this.lastTransitionTime;
    }
    /**
     * Human readable message indicating details about the current status.
     * 
    */
    public String getMessage() {
        return this.message;
    }
    /**
     * A common (service-level) reason for this condition.
     * 
    */
    public String getReason() {
        return this.reason;
    }
    /**
     * A reason for the revision condition.
     * 
    */
    public String getRevisionReason() {
        return this.revisionReason;
    }
    /**
     * How to interpret failures of this condition, one of Error, Warning, Info
     * 
    */
    public String getSeverity() {
        return this.severity;
    }
    /**
     * State of the condition.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * type is used to communicate the status of the reconciliation process. See also: https://github.com/knative/serving/blob/main/docs/spec/errors.md#error-conditions-and-reporting Types common to all resources include: * "Ready": True when the Resource is ready.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRunOpV2ConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domainMappingReason;
        private String executionReason;
        private String internalReason;
        private String lastTransitionTime;
        private String message;
        private String reason;
        private String revisionReason;
        private String severity;
        private String state;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRunOpV2ConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainMappingReason = defaults.domainMappingReason;
    	      this.executionReason = defaults.executionReason;
    	      this.internalReason = defaults.internalReason;
    	      this.lastTransitionTime = defaults.lastTransitionTime;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
    	      this.revisionReason = defaults.revisionReason;
    	      this.severity = defaults.severity;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
        }

        public Builder setDomainMappingReason(String domainMappingReason) {
            this.domainMappingReason = Objects.requireNonNull(domainMappingReason);
            return this;
        }

        public Builder setExecutionReason(String executionReason) {
            this.executionReason = Objects.requireNonNull(executionReason);
            return this;
        }

        public Builder setInternalReason(String internalReason) {
            this.internalReason = Objects.requireNonNull(internalReason);
            return this;
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

        public Builder setRevisionReason(String revisionReason) {
            this.revisionReason = Objects.requireNonNull(revisionReason);
            return this;
        }

        public Builder setSeverity(String severity) {
            this.severity = Objects.requireNonNull(severity);
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
        public GoogleCloudRunOpV2ConditionResponse build() {
            return new GoogleCloudRunOpV2ConditionResponse(domainMappingReason, executionReason, internalReason, lastTransitionTime, message, reason, revisionReason, severity, state, type);
        }
    }
}
