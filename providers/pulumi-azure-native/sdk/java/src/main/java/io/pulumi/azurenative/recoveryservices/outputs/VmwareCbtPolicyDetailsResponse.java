// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VmwareCbtPolicyDetailsResponse {
    /**
     * The app consistent snapshot frequency in minutes.
     * 
     */
    private final @Nullable Integer appConsistentFrequencyInMinutes;
    /**
     * The crash consistent snapshot frequency in minutes.
     * 
     */
    private final @Nullable Integer crashConsistentFrequencyInMinutes;
    /**
     * Gets the class type. Overridden in derived classes.
     * Expected value is 'VMwareCbt'.
     * 
     */
    private final String instanceType;
    /**
     * The duration in minutes until which the recovery points need to be stored.
     * 
     */
    private final @Nullable Integer recoveryPointHistoryInMinutes;

    @OutputCustomType.Constructor({"appConsistentFrequencyInMinutes","crashConsistentFrequencyInMinutes","instanceType","recoveryPointHistoryInMinutes"})
    private VmwareCbtPolicyDetailsResponse(
        @Nullable Integer appConsistentFrequencyInMinutes,
        @Nullable Integer crashConsistentFrequencyInMinutes,
        String instanceType,
        @Nullable Integer recoveryPointHistoryInMinutes) {
        this.appConsistentFrequencyInMinutes = appConsistentFrequencyInMinutes;
        this.crashConsistentFrequencyInMinutes = crashConsistentFrequencyInMinutes;
        this.instanceType = instanceType;
        this.recoveryPointHistoryInMinutes = recoveryPointHistoryInMinutes;
    }

    /**
     * The app consistent snapshot frequency in minutes.
     * 
    */
    public Optional<Integer> getAppConsistentFrequencyInMinutes() {
        return Optional.ofNullable(this.appConsistentFrequencyInMinutes);
    }
    /**
     * The crash consistent snapshot frequency in minutes.
     * 
    */
    public Optional<Integer> getCrashConsistentFrequencyInMinutes() {
        return Optional.ofNullable(this.crashConsistentFrequencyInMinutes);
    }
    /**
     * Gets the class type. Overridden in derived classes.
     * Expected value is 'VMwareCbt'.
     * 
    */
    public String getInstanceType() {
        return this.instanceType;
    }
    /**
     * The duration in minutes until which the recovery points need to be stored.
     * 
    */
    public Optional<Integer> getRecoveryPointHistoryInMinutes() {
        return Optional.ofNullable(this.recoveryPointHistoryInMinutes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmwareCbtPolicyDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer appConsistentFrequencyInMinutes;
        private @Nullable Integer crashConsistentFrequencyInMinutes;
        private String instanceType;
        private @Nullable Integer recoveryPointHistoryInMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(VmwareCbtPolicyDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appConsistentFrequencyInMinutes = defaults.appConsistentFrequencyInMinutes;
    	      this.crashConsistentFrequencyInMinutes = defaults.crashConsistentFrequencyInMinutes;
    	      this.instanceType = defaults.instanceType;
    	      this.recoveryPointHistoryInMinutes = defaults.recoveryPointHistoryInMinutes;
        }

        public Builder setAppConsistentFrequencyInMinutes(@Nullable Integer appConsistentFrequencyInMinutes) {
            this.appConsistentFrequencyInMinutes = appConsistentFrequencyInMinutes;
            return this;
        }

        public Builder setCrashConsistentFrequencyInMinutes(@Nullable Integer crashConsistentFrequencyInMinutes) {
            this.crashConsistentFrequencyInMinutes = crashConsistentFrequencyInMinutes;
            return this;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setRecoveryPointHistoryInMinutes(@Nullable Integer recoveryPointHistoryInMinutes) {
            this.recoveryPointHistoryInMinutes = recoveryPointHistoryInMinutes;
            return this;
        }
        public VmwareCbtPolicyDetailsResponse build() {
            return new VmwareCbtPolicyDetailsResponse(appConsistentFrequencyInMinutes, crashConsistentFrequencyInMinutes, instanceType, recoveryPointHistoryInMinutes);
        }
    }
}
