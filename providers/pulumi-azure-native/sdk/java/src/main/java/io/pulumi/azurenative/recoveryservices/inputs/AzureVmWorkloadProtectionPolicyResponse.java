// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.SettingsResponse;
import io.pulumi.azurenative.recoveryservices.inputs.SubProtectionPolicyResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Azure VM (Mercury) workload-specific backup policy.
 * 
 */
public final class AzureVmWorkloadProtectionPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureVmWorkloadProtectionPolicyResponse Empty = new AzureVmWorkloadProtectionPolicyResponse();

    /**
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is 'AzureWorkload'.
     * 
     */
    @Import(name="backupManagementType", required=true)
      private final String backupManagementType;

    public String backupManagementType() {
        return this.backupManagementType;
    }

    /**
     * Fix the policy inconsistency
     * 
     */
    @Import(name="makePolicyConsistent")
      private final @Nullable Boolean makePolicyConsistent;

    public Optional<Boolean> makePolicyConsistent() {
        return this.makePolicyConsistent == null ? Optional.empty() : Optional.ofNullable(this.makePolicyConsistent);
    }

    /**
     * Number of items associated with this policy.
     * 
     */
    @Import(name="protectedItemsCount")
      private final @Nullable Integer protectedItemsCount;

    public Optional<Integer> protectedItemsCount() {
        return this.protectedItemsCount == null ? Optional.empty() : Optional.ofNullable(this.protectedItemsCount);
    }

    /**
     * Common settings for the backup management
     * 
     */
    @Import(name="settings")
      private final @Nullable SettingsResponse settings;

    public Optional<SettingsResponse> settings() {
        return this.settings == null ? Optional.empty() : Optional.ofNullable(this.settings);
    }

    /**
     * List of sub-protection policies which includes schedule and retention
     * 
     */
    @Import(name="subProtectionPolicy")
      private final @Nullable List<SubProtectionPolicyResponse> subProtectionPolicy;

    public List<SubProtectionPolicyResponse> subProtectionPolicy() {
        return this.subProtectionPolicy == null ? List.of() : this.subProtectionPolicy;
    }

    /**
     * Type of workload for the backup management
     * 
     */
    @Import(name="workLoadType")
      private final @Nullable String workLoadType;

    public Optional<String> workLoadType() {
        return this.workLoadType == null ? Optional.empty() : Optional.ofNullable(this.workLoadType);
    }

    public AzureVmWorkloadProtectionPolicyResponse(
        String backupManagementType,
        @Nullable Boolean makePolicyConsistent,
        @Nullable Integer protectedItemsCount,
        @Nullable SettingsResponse settings,
        @Nullable List<SubProtectionPolicyResponse> subProtectionPolicy,
        @Nullable String workLoadType) {
        this.backupManagementType = Objects.requireNonNull(backupManagementType, "expected parameter 'backupManagementType' to be non-null");
        this.makePolicyConsistent = makePolicyConsistent;
        this.protectedItemsCount = protectedItemsCount;
        this.settings = settings;
        this.subProtectionPolicy = subProtectionPolicy;
        this.workLoadType = workLoadType;
    }

    private AzureVmWorkloadProtectionPolicyResponse() {
        this.backupManagementType = null;
        this.makePolicyConsistent = null;
        this.protectedItemsCount = null;
        this.settings = null;
        this.subProtectionPolicy = List.of();
        this.workLoadType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureVmWorkloadProtectionPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backupManagementType;
        private @Nullable Boolean makePolicyConsistent;
        private @Nullable Integer protectedItemsCount;
        private @Nullable SettingsResponse settings;
        private @Nullable List<SubProtectionPolicyResponse> subProtectionPolicy;
        private @Nullable String workLoadType;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureVmWorkloadProtectionPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.makePolicyConsistent = defaults.makePolicyConsistent;
    	      this.protectedItemsCount = defaults.protectedItemsCount;
    	      this.settings = defaults.settings;
    	      this.subProtectionPolicy = defaults.subProtectionPolicy;
    	      this.workLoadType = defaults.workLoadType;
        }

        public Builder backupManagementType(String backupManagementType) {
            this.backupManagementType = Objects.requireNonNull(backupManagementType);
            return this;
        }
        public Builder makePolicyConsistent(@Nullable Boolean makePolicyConsistent) {
            this.makePolicyConsistent = makePolicyConsistent;
            return this;
        }
        public Builder protectedItemsCount(@Nullable Integer protectedItemsCount) {
            this.protectedItemsCount = protectedItemsCount;
            return this;
        }
        public Builder settings(@Nullable SettingsResponse settings) {
            this.settings = settings;
            return this;
        }
        public Builder subProtectionPolicy(@Nullable List<SubProtectionPolicyResponse> subProtectionPolicy) {
            this.subProtectionPolicy = subProtectionPolicy;
            return this;
        }
        public Builder subProtectionPolicy(SubProtectionPolicyResponse... subProtectionPolicy) {
            return subProtectionPolicy(List.of(subProtectionPolicy));
        }
        public Builder workLoadType(@Nullable String workLoadType) {
            this.workLoadType = workLoadType;
            return this;
        }        public AzureVmWorkloadProtectionPolicyResponse build() {
            return new AzureVmWorkloadProtectionPolicyResponse(backupManagementType, makePolicyConsistent, protectedItemsCount, settings, subProtectionPolicy, workLoadType);
        }
    }
}
