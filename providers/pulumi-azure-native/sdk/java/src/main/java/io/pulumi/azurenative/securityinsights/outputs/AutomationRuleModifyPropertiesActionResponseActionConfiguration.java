// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.azurenative.securityinsights.outputs.IncidentLabelResponse;
import io.pulumi.azurenative.securityinsights.outputs.IncidentOwnerInfoResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutomationRuleModifyPropertiesActionResponseActionConfiguration {
    /**
     * The reason the incident was closed
     * 
     */
    private final @Nullable String classification;
    /**
     * Describes the reason the incident was closed
     * 
     */
    private final @Nullable String classificationComment;
    /**
     * The classification reason to close the incident with
     * 
     */
    private final @Nullable String classificationReason;
    /**
     * List of labels to add to the incident
     * 
     */
    private final @Nullable List<IncidentLabelResponse> labels;
    /**
     * Describes a user that the incident is assigned to
     * 
     */
    private final @Nullable IncidentOwnerInfoResponse owner;
    /**
     * The severity of the incident
     * 
     */
    private final @Nullable String severity;
    /**
     * The status of the incident
     * 
     */
    private final @Nullable String status;

    @CustomType.Constructor
    private AutomationRuleModifyPropertiesActionResponseActionConfiguration(
        @CustomType.Parameter("classification") @Nullable String classification,
        @CustomType.Parameter("classificationComment") @Nullable String classificationComment,
        @CustomType.Parameter("classificationReason") @Nullable String classificationReason,
        @CustomType.Parameter("labels") @Nullable List<IncidentLabelResponse> labels,
        @CustomType.Parameter("owner") @Nullable IncidentOwnerInfoResponse owner,
        @CustomType.Parameter("severity") @Nullable String severity,
        @CustomType.Parameter("status") @Nullable String status) {
        this.classification = classification;
        this.classificationComment = classificationComment;
        this.classificationReason = classificationReason;
        this.labels = labels;
        this.owner = owner;
        this.severity = severity;
        this.status = status;
    }

    /**
     * The reason the incident was closed
     * 
    */
    public Optional<String> classification() {
        return Optional.ofNullable(this.classification);
    }
    /**
     * Describes the reason the incident was closed
     * 
    */
    public Optional<String> classificationComment() {
        return Optional.ofNullable(this.classificationComment);
    }
    /**
     * The classification reason to close the incident with
     * 
    */
    public Optional<String> classificationReason() {
        return Optional.ofNullable(this.classificationReason);
    }
    /**
     * List of labels to add to the incident
     * 
    */
    public List<IncidentLabelResponse> labels() {
        return this.labels == null ? List.of() : this.labels;
    }
    /**
     * Describes a user that the incident is assigned to
     * 
    */
    public Optional<IncidentOwnerInfoResponse> owner() {
        return Optional.ofNullable(this.owner);
    }
    /**
     * The severity of the incident
     * 
    */
    public Optional<String> severity() {
        return Optional.ofNullable(this.severity);
    }
    /**
     * The status of the incident
     * 
    */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationRuleModifyPropertiesActionResponseActionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String classification;
        private @Nullable String classificationComment;
        private @Nullable String classificationReason;
        private @Nullable List<IncidentLabelResponse> labels;
        private @Nullable IncidentOwnerInfoResponse owner;
        private @Nullable String severity;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationRuleModifyPropertiesActionResponseActionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classification = defaults.classification;
    	      this.classificationComment = defaults.classificationComment;
    	      this.classificationReason = defaults.classificationReason;
    	      this.labels = defaults.labels;
    	      this.owner = defaults.owner;
    	      this.severity = defaults.severity;
    	      this.status = defaults.status;
        }

        public Builder classification(@Nullable String classification) {
            this.classification = classification;
            return this;
        }
        public Builder classificationComment(@Nullable String classificationComment) {
            this.classificationComment = classificationComment;
            return this;
        }
        public Builder classificationReason(@Nullable String classificationReason) {
            this.classificationReason = classificationReason;
            return this;
        }
        public Builder labels(@Nullable List<IncidentLabelResponse> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(IncidentLabelResponse... labels) {
            return labels(List.of(labels));
        }
        public Builder owner(@Nullable IncidentOwnerInfoResponse owner) {
            this.owner = owner;
            return this;
        }
        public Builder severity(@Nullable String severity) {
            this.severity = severity;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }        public AutomationRuleModifyPropertiesActionResponseActionConfiguration build() {
            return new AutomationRuleModifyPropertiesActionResponseActionConfiguration(classification, classificationComment, classificationReason, labels, owner, severity, status);
        }
    }
}
