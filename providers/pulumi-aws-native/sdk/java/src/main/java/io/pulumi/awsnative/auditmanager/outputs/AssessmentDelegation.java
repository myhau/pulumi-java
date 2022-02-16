// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.auditmanager.outputs;

import io.pulumi.awsnative.auditmanager.enums.AssessmentDelegationStatus;
import io.pulumi.awsnative.auditmanager.enums.AssessmentRoleType;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AssessmentDelegation {
    private final @Nullable String assessmentId;
    private final @Nullable String assessmentName;
    private final @Nullable String comment;
    private final @Nullable String controlSetId;
    private final @Nullable String createdBy;
    private final @Nullable Double creationTime;
    private final @Nullable String id;
    private final @Nullable Double lastUpdated;
    private final @Nullable String roleArn;
    private final @Nullable AssessmentRoleType roleType;
    private final @Nullable AssessmentDelegationStatus status;

    @OutputCustomType.Constructor({"assessmentId","assessmentName","comment","controlSetId","createdBy","creationTime","id","lastUpdated","roleArn","roleType","status"})
    private AssessmentDelegation(
        @Nullable String assessmentId,
        @Nullable String assessmentName,
        @Nullable String comment,
        @Nullable String controlSetId,
        @Nullable String createdBy,
        @Nullable Double creationTime,
        @Nullable String id,
        @Nullable Double lastUpdated,
        @Nullable String roleArn,
        @Nullable AssessmentRoleType roleType,
        @Nullable AssessmentDelegationStatus status) {
        this.assessmentId = assessmentId;
        this.assessmentName = assessmentName;
        this.comment = comment;
        this.controlSetId = controlSetId;
        this.createdBy = createdBy;
        this.creationTime = creationTime;
        this.id = id;
        this.lastUpdated = lastUpdated;
        this.roleArn = roleArn;
        this.roleType = roleType;
        this.status = status;
    }

    public Optional<String> getAssessmentId() {
        return Optional.ofNullable(this.assessmentId);
    }
    public Optional<String> getAssessmentName() {
        return Optional.ofNullable(this.assessmentName);
    }
    public Optional<String> getComment() {
        return Optional.ofNullable(this.comment);
    }
    public Optional<String> getControlSetId() {
        return Optional.ofNullable(this.controlSetId);
    }
    public Optional<String> getCreatedBy() {
        return Optional.ofNullable(this.createdBy);
    }
    public Optional<Double> getCreationTime() {
        return Optional.ofNullable(this.creationTime);
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<Double> getLastUpdated() {
        return Optional.ofNullable(this.lastUpdated);
    }
    public Optional<String> getRoleArn() {
        return Optional.ofNullable(this.roleArn);
    }
    public Optional<AssessmentRoleType> getRoleType() {
        return Optional.ofNullable(this.roleType);
    }
    public Optional<AssessmentDelegationStatus> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssessmentDelegation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String assessmentId;
        private @Nullable String assessmentName;
        private @Nullable String comment;
        private @Nullable String controlSetId;
        private @Nullable String createdBy;
        private @Nullable Double creationTime;
        private @Nullable String id;
        private @Nullable Double lastUpdated;
        private @Nullable String roleArn;
        private @Nullable AssessmentRoleType roleType;
        private @Nullable AssessmentDelegationStatus status;

        public Builder() {
    	      // Empty
        }

        public Builder(AssessmentDelegation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assessmentId = defaults.assessmentId;
    	      this.assessmentName = defaults.assessmentName;
    	      this.comment = defaults.comment;
    	      this.controlSetId = defaults.controlSetId;
    	      this.createdBy = defaults.createdBy;
    	      this.creationTime = defaults.creationTime;
    	      this.id = defaults.id;
    	      this.lastUpdated = defaults.lastUpdated;
    	      this.roleArn = defaults.roleArn;
    	      this.roleType = defaults.roleType;
    	      this.status = defaults.status;
        }

        public Builder setAssessmentId(@Nullable String assessmentId) {
            this.assessmentId = assessmentId;
            return this;
        }

        public Builder setAssessmentName(@Nullable String assessmentName) {
            this.assessmentName = assessmentName;
            return this;
        }

        public Builder setComment(@Nullable String comment) {
            this.comment = comment;
            return this;
        }

        public Builder setControlSetId(@Nullable String controlSetId) {
            this.controlSetId = controlSetId;
            return this;
        }

        public Builder setCreatedBy(@Nullable String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public Builder setCreationTime(@Nullable Double creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setLastUpdated(@Nullable Double lastUpdated) {
            this.lastUpdated = lastUpdated;
            return this;
        }

        public Builder setRoleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder setRoleType(@Nullable AssessmentRoleType roleType) {
            this.roleType = roleType;
            return this;
        }

        public Builder setStatus(@Nullable AssessmentDelegationStatus status) {
            this.status = status;
            return this;
        }

        public AssessmentDelegation build() {
            return new AssessmentDelegation(assessmentId, assessmentName, comment, controlSetId, createdBy, creationTime, id, lastUpdated, roleArn, roleType, status);
        }
    }
}