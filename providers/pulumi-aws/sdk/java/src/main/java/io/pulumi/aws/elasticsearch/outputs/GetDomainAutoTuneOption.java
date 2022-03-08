// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.outputs;

import io.pulumi.aws.elasticsearch.outputs.GetDomainAutoTuneOptionMaintenanceSchedule;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetDomainAutoTuneOption {
    /**
     * The Auto-Tune desired state for the domain.
     * 
     */
    private final String desiredState;
    /**
     * A list of the nested configurations for the Auto-Tune maintenance windows of the domain.
     * 
     */
    private final List<GetDomainAutoTuneOptionMaintenanceSchedule> maintenanceSchedules;
    /**
     * Whether the domain is set to roll back to default Auto-Tune settings when disabling Auto-Tune.
     * 
     */
    private final String rollbackOnDisable;

    @OutputCustomType.Constructor({"desiredState","maintenanceSchedules","rollbackOnDisable"})
    private GetDomainAutoTuneOption(
        String desiredState,
        List<GetDomainAutoTuneOptionMaintenanceSchedule> maintenanceSchedules,
        String rollbackOnDisable) {
        this.desiredState = desiredState;
        this.maintenanceSchedules = maintenanceSchedules;
        this.rollbackOnDisable = rollbackOnDisable;
    }

    /**
     * The Auto-Tune desired state for the domain.
     * 
    */
    public String getDesiredState() {
        return this.desiredState;
    }
    /**
     * A list of the nested configurations for the Auto-Tune maintenance windows of the domain.
     * 
    */
    public List<GetDomainAutoTuneOptionMaintenanceSchedule> getMaintenanceSchedules() {
        return this.maintenanceSchedules;
    }
    /**
     * Whether the domain is set to roll back to default Auto-Tune settings when disabling Auto-Tune.
     * 
    */
    public String getRollbackOnDisable() {
        return this.rollbackOnDisable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainAutoTuneOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String desiredState;
        private List<GetDomainAutoTuneOptionMaintenanceSchedule> maintenanceSchedules;
        private String rollbackOnDisable;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainAutoTuneOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.desiredState = defaults.desiredState;
    	      this.maintenanceSchedules = defaults.maintenanceSchedules;
    	      this.rollbackOnDisable = defaults.rollbackOnDisable;
        }

        public Builder setDesiredState(String desiredState) {
            this.desiredState = Objects.requireNonNull(desiredState);
            return this;
        }

        public Builder setMaintenanceSchedules(List<GetDomainAutoTuneOptionMaintenanceSchedule> maintenanceSchedules) {
            this.maintenanceSchedules = Objects.requireNonNull(maintenanceSchedules);
            return this;
        }

        public Builder setRollbackOnDisable(String rollbackOnDisable) {
            this.rollbackOnDisable = Objects.requireNonNull(rollbackOnDisable);
            return this;
        }
        public GetDomainAutoTuneOption build() {
            return new GetDomainAutoTuneOption(desiredState, maintenanceSchedules, rollbackOnDisable);
        }
    }
}
