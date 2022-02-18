// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InstanceAdvancedMachineFeatures {
    /**
     * Defines whether the instance should have nested virtualization  enabled. Defaults to false.
     * 
     */
    private final @Nullable Boolean enableNestedVirtualization;
    /**
     * he number of threads per physical core. To disable [simultaneous multithreading (SMT)](https://cloud.google.com/compute/docs/instances/disabling-smt) set this to 1.
     * 
     */
    private final @Nullable Integer threadsPerCore;

    @OutputCustomType.Constructor({"enableNestedVirtualization","threadsPerCore"})
    private InstanceAdvancedMachineFeatures(
        @Nullable Boolean enableNestedVirtualization,
        @Nullable Integer threadsPerCore) {
        this.enableNestedVirtualization = enableNestedVirtualization;
        this.threadsPerCore = threadsPerCore;
    }

    /**
     * Defines whether the instance should have nested virtualization  enabled. Defaults to false.
     * 
     */
    public Optional<Boolean> getEnableNestedVirtualization() {
        return Optional.ofNullable(this.enableNestedVirtualization);
    }
    /**
     * he number of threads per physical core. To disable [simultaneous multithreading (SMT)](https://cloud.google.com/compute/docs/instances/disabling-smt) set this to 1.
     * 
     */
    public Optional<Integer> getThreadsPerCore() {
        return Optional.ofNullable(this.threadsPerCore);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceAdvancedMachineFeatures defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableNestedVirtualization;
        private @Nullable Integer threadsPerCore;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceAdvancedMachineFeatures defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableNestedVirtualization = defaults.enableNestedVirtualization;
    	      this.threadsPerCore = defaults.threadsPerCore;
        }

        public Builder setEnableNestedVirtualization(@Nullable Boolean enableNestedVirtualization) {
            this.enableNestedVirtualization = enableNestedVirtualization;
            return this;
        }

        public Builder setThreadsPerCore(@Nullable Integer threadsPerCore) {
            this.threadsPerCore = threadsPerCore;
            return this;
        }

        public InstanceAdvancedMachineFeatures build() {
            return new InstanceAdvancedMachineFeatures(enableNestedVirtualization, threadsPerCore);
        }
    }
}
