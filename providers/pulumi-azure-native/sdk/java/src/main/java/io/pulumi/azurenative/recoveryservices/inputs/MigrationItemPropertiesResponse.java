// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.CurrentJobDetailsResponse;
import io.pulumi.azurenative.recoveryservices.inputs.HealthErrorResponse;
import io.pulumi.azurenative.recoveryservices.inputs.VMwareCbtMigrationDetailsResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MigrationItemPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final MigrationItemPropertiesResponse Empty = new MigrationItemPropertiesResponse();

    @InputImport(name="allowedOperations", required=true)
    private final List<String> allowedOperations;

    public List<String> getAllowedOperations() {
        return this.allowedOperations;
    }

    @InputImport(name="currentJob", required=true)
    private final CurrentJobDetailsResponse currentJob;

    public CurrentJobDetailsResponse getCurrentJob() {
        return this.currentJob;
    }

    @InputImport(name="health", required=true)
    private final String health;

    public String getHealth() {
        return this.health;
    }

    @InputImport(name="healthErrors", required=true)
    private final List<HealthErrorResponse> healthErrors;

    public List<HealthErrorResponse> getHealthErrors() {
        return this.healthErrors;
    }

    @InputImport(name="machineName", required=true)
    private final String machineName;

    public String getMachineName() {
        return this.machineName;
    }

    @InputImport(name="migrationState", required=true)
    private final String migrationState;

    public String getMigrationState() {
        return this.migrationState;
    }

    @InputImport(name="migrationStateDescription", required=true)
    private final String migrationStateDescription;

    public String getMigrationStateDescription() {
        return this.migrationStateDescription;
    }

    @InputImport(name="policyFriendlyName", required=true)
    private final String policyFriendlyName;

    public String getPolicyFriendlyName() {
        return this.policyFriendlyName;
    }

    @InputImport(name="policyId", required=true)
    private final String policyId;

    public String getPolicyId() {
        return this.policyId;
    }

    @InputImport(name="providerSpecificDetails")
    private final @Nullable VMwareCbtMigrationDetailsResponse providerSpecificDetails;

    public Optional<VMwareCbtMigrationDetailsResponse> getProviderSpecificDetails() {
        return this.providerSpecificDetails == null ? Optional.empty() : Optional.ofNullable(this.providerSpecificDetails);
    }

    @InputImport(name="recoveryServicesProviderId", required=true)
    private final String recoveryServicesProviderId;

    public String getRecoveryServicesProviderId() {
        return this.recoveryServicesProviderId;
    }

    @InputImport(name="testMigrateState", required=true)
    private final String testMigrateState;

    public String getTestMigrateState() {
        return this.testMigrateState;
    }

    @InputImport(name="testMigrateStateDescription", required=true)
    private final String testMigrateStateDescription;

    public String getTestMigrateStateDescription() {
        return this.testMigrateStateDescription;
    }

    public MigrationItemPropertiesResponse(
        List<String> allowedOperations,
        CurrentJobDetailsResponse currentJob,
        String health,
        List<HealthErrorResponse> healthErrors,
        String machineName,
        String migrationState,
        String migrationStateDescription,
        String policyFriendlyName,
        String policyId,
        @Nullable VMwareCbtMigrationDetailsResponse providerSpecificDetails,
        String recoveryServicesProviderId,
        String testMigrateState,
        String testMigrateStateDescription) {
        this.allowedOperations = Objects.requireNonNull(allowedOperations, "expected parameter 'allowedOperations' to be non-null");
        this.currentJob = Objects.requireNonNull(currentJob, "expected parameter 'currentJob' to be non-null");
        this.health = Objects.requireNonNull(health, "expected parameter 'health' to be non-null");
        this.healthErrors = Objects.requireNonNull(healthErrors, "expected parameter 'healthErrors' to be non-null");
        this.machineName = Objects.requireNonNull(machineName, "expected parameter 'machineName' to be non-null");
        this.migrationState = Objects.requireNonNull(migrationState, "expected parameter 'migrationState' to be non-null");
        this.migrationStateDescription = Objects.requireNonNull(migrationStateDescription, "expected parameter 'migrationStateDescription' to be non-null");
        this.policyFriendlyName = Objects.requireNonNull(policyFriendlyName, "expected parameter 'policyFriendlyName' to be non-null");
        this.policyId = Objects.requireNonNull(policyId, "expected parameter 'policyId' to be non-null");
        this.providerSpecificDetails = providerSpecificDetails;
        this.recoveryServicesProviderId = Objects.requireNonNull(recoveryServicesProviderId, "expected parameter 'recoveryServicesProviderId' to be non-null");
        this.testMigrateState = Objects.requireNonNull(testMigrateState, "expected parameter 'testMigrateState' to be non-null");
        this.testMigrateStateDescription = Objects.requireNonNull(testMigrateStateDescription, "expected parameter 'testMigrateStateDescription' to be non-null");
    }

    private MigrationItemPropertiesResponse() {
        this.allowedOperations = List.of();
        this.currentJob = null;
        this.health = null;
        this.healthErrors = List.of();
        this.machineName = null;
        this.migrationState = null;
        this.migrationStateDescription = null;
        this.policyFriendlyName = null;
        this.policyId = null;
        this.providerSpecificDetails = null;
        this.recoveryServicesProviderId = null;
        this.testMigrateState = null;
        this.testMigrateStateDescription = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrationItemPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedOperations;
        private CurrentJobDetailsResponse currentJob;
        private String health;
        private List<HealthErrorResponse> healthErrors;
        private String machineName;
        private String migrationState;
        private String migrationStateDescription;
        private String policyFriendlyName;
        private String policyId;
        private @Nullable VMwareCbtMigrationDetailsResponse providerSpecificDetails;
        private String recoveryServicesProviderId;
        private String testMigrateState;
        private String testMigrateStateDescription;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrationItemPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedOperations = defaults.allowedOperations;
    	      this.currentJob = defaults.currentJob;
    	      this.health = defaults.health;
    	      this.healthErrors = defaults.healthErrors;
    	      this.machineName = defaults.machineName;
    	      this.migrationState = defaults.migrationState;
    	      this.migrationStateDescription = defaults.migrationStateDescription;
    	      this.policyFriendlyName = defaults.policyFriendlyName;
    	      this.policyId = defaults.policyId;
    	      this.providerSpecificDetails = defaults.providerSpecificDetails;
    	      this.recoveryServicesProviderId = defaults.recoveryServicesProviderId;
    	      this.testMigrateState = defaults.testMigrateState;
    	      this.testMigrateStateDescription = defaults.testMigrateStateDescription;
        }

        public Builder setAllowedOperations(List<String> allowedOperations) {
            this.allowedOperations = Objects.requireNonNull(allowedOperations);
            return this;
        }

        public Builder setCurrentJob(CurrentJobDetailsResponse currentJob) {
            this.currentJob = Objects.requireNonNull(currentJob);
            return this;
        }

        public Builder setHealth(String health) {
            this.health = Objects.requireNonNull(health);
            return this;
        }

        public Builder setHealthErrors(List<HealthErrorResponse> healthErrors) {
            this.healthErrors = Objects.requireNonNull(healthErrors);
            return this;
        }

        public Builder setMachineName(String machineName) {
            this.machineName = Objects.requireNonNull(machineName);
            return this;
        }

        public Builder setMigrationState(String migrationState) {
            this.migrationState = Objects.requireNonNull(migrationState);
            return this;
        }

        public Builder setMigrationStateDescription(String migrationStateDescription) {
            this.migrationStateDescription = Objects.requireNonNull(migrationStateDescription);
            return this;
        }

        public Builder setPolicyFriendlyName(String policyFriendlyName) {
            this.policyFriendlyName = Objects.requireNonNull(policyFriendlyName);
            return this;
        }

        public Builder setPolicyId(String policyId) {
            this.policyId = Objects.requireNonNull(policyId);
            return this;
        }

        public Builder setProviderSpecificDetails(@Nullable VMwareCbtMigrationDetailsResponse providerSpecificDetails) {
            this.providerSpecificDetails = providerSpecificDetails;
            return this;
        }

        public Builder setRecoveryServicesProviderId(String recoveryServicesProviderId) {
            this.recoveryServicesProviderId = Objects.requireNonNull(recoveryServicesProviderId);
            return this;
        }

        public Builder setTestMigrateState(String testMigrateState) {
            this.testMigrateState = Objects.requireNonNull(testMigrateState);
            return this;
        }

        public Builder setTestMigrateStateDescription(String testMigrateStateDescription) {
            this.testMigrateStateDescription = Objects.requireNonNull(testMigrateStateDescription);
            return this;
        }

        public MigrationItemPropertiesResponse build() {
            return new MigrationItemPropertiesResponse(allowedOperations, currentJob, health, healthErrors, machineName, migrationState, migrationStateDescription, policyFriendlyName, policyId, providerSpecificDetails, recoveryServicesProviderId, testMigrateState, testMigrateStateDescription);
        }
    }
}