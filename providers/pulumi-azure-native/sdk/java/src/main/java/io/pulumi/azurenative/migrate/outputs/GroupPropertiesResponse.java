// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GroupPropertiesResponse {
    /**
     * If the assessments are in running state.
     * 
     */
    private final Boolean areAssessmentsRunning;
    /**
     * List of References to Assessments created on this group.
     * 
     */
    private final List<String> assessments;
    /**
     * Time when this group was created. Date-Time represented in ISO-8601 format.
     * 
     */
    private final String createdTimestamp;
    /**
     * Whether the group has been created and is valid.
     * 
     */
    private final String groupStatus;
    /**
     * The type of group.
     * 
     */
    private final @Nullable String groupType;
    /**
     * Number of machines part of this group.
     * 
     */
    private final Integer machineCount;
    /**
     * Time when this group was last updated. Date-Time represented in ISO-8601 format.
     * 
     */
    private final String updatedTimestamp;

    @OutputCustomType.Constructor({"areAssessmentsRunning","assessments","createdTimestamp","groupStatus","groupType","machineCount","updatedTimestamp"})
    private GroupPropertiesResponse(
        Boolean areAssessmentsRunning,
        List<String> assessments,
        String createdTimestamp,
        String groupStatus,
        @Nullable String groupType,
        Integer machineCount,
        String updatedTimestamp) {
        this.areAssessmentsRunning = areAssessmentsRunning;
        this.assessments = assessments;
        this.createdTimestamp = createdTimestamp;
        this.groupStatus = groupStatus;
        this.groupType = groupType;
        this.machineCount = machineCount;
        this.updatedTimestamp = updatedTimestamp;
    }

    /**
     * If the assessments are in running state.
     * 
    */
    public Boolean getAreAssessmentsRunning() {
        return this.areAssessmentsRunning;
    }
    /**
     * List of References to Assessments created on this group.
     * 
    */
    public List<String> getAssessments() {
        return this.assessments;
    }
    /**
     * Time when this group was created. Date-Time represented in ISO-8601 format.
     * 
    */
    public String getCreatedTimestamp() {
        return this.createdTimestamp;
    }
    /**
     * Whether the group has been created and is valid.
     * 
    */
    public String getGroupStatus() {
        return this.groupStatus;
    }
    /**
     * The type of group.
     * 
    */
    public Optional<String> getGroupType() {
        return Optional.ofNullable(this.groupType);
    }
    /**
     * Number of machines part of this group.
     * 
    */
    public Integer getMachineCount() {
        return this.machineCount;
    }
    /**
     * Time when this group was last updated. Date-Time represented in ISO-8601 format.
     * 
    */
    public String getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean areAssessmentsRunning;
        private List<String> assessments;
        private String createdTimestamp;
        private String groupStatus;
        private @Nullable String groupType;
        private Integer machineCount;
        private String updatedTimestamp;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.areAssessmentsRunning = defaults.areAssessmentsRunning;
    	      this.assessments = defaults.assessments;
    	      this.createdTimestamp = defaults.createdTimestamp;
    	      this.groupStatus = defaults.groupStatus;
    	      this.groupType = defaults.groupType;
    	      this.machineCount = defaults.machineCount;
    	      this.updatedTimestamp = defaults.updatedTimestamp;
        }

        public Builder setAreAssessmentsRunning(Boolean areAssessmentsRunning) {
            this.areAssessmentsRunning = Objects.requireNonNull(areAssessmentsRunning);
            return this;
        }

        public Builder setAssessments(List<String> assessments) {
            this.assessments = Objects.requireNonNull(assessments);
            return this;
        }

        public Builder setCreatedTimestamp(String createdTimestamp) {
            this.createdTimestamp = Objects.requireNonNull(createdTimestamp);
            return this;
        }

        public Builder setGroupStatus(String groupStatus) {
            this.groupStatus = Objects.requireNonNull(groupStatus);
            return this;
        }

        public Builder setGroupType(@Nullable String groupType) {
            this.groupType = groupType;
            return this;
        }

        public Builder setMachineCount(Integer machineCount) {
            this.machineCount = Objects.requireNonNull(machineCount);
            return this;
        }

        public Builder setUpdatedTimestamp(String updatedTimestamp) {
            this.updatedTimestamp = Objects.requireNonNull(updatedTimestamp);
            return this;
        }
        public GroupPropertiesResponse build() {
            return new GroupPropertiesResponse(areAssessmentsRunning, assessments, createdTimestamp, groupStatus, groupType, machineCount, updatedTimestamp);
        }
    }
}
