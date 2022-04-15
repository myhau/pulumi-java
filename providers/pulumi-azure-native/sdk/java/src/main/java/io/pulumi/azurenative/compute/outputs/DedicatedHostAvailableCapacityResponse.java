// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.DedicatedHostAllocatableVMResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DedicatedHostAvailableCapacityResponse {
    /**
     * The unutilized capacity of the dedicated host represented in terms of each VM size that is allowed to be deployed to the dedicated host.
     * 
     */
    private final @Nullable List<DedicatedHostAllocatableVMResponse> allocatableVMs;

    @CustomType.Constructor
    private DedicatedHostAvailableCapacityResponse(@CustomType.Parameter("allocatableVMs") @Nullable List<DedicatedHostAllocatableVMResponse> allocatableVMs) {
        this.allocatableVMs = allocatableVMs;
    }

    /**
     * The unutilized capacity of the dedicated host represented in terms of each VM size that is allowed to be deployed to the dedicated host.
     * 
    */
    public List<DedicatedHostAllocatableVMResponse> allocatableVMs() {
        return this.allocatableVMs == null ? List.of() : this.allocatableVMs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DedicatedHostAvailableCapacityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DedicatedHostAllocatableVMResponse> allocatableVMs;

        public Builder() {
    	      // Empty
        }

        public Builder(DedicatedHostAvailableCapacityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocatableVMs = defaults.allocatableVMs;
        }

        public Builder allocatableVMs(@Nullable List<DedicatedHostAllocatableVMResponse> allocatableVMs) {
            this.allocatableVMs = allocatableVMs;
            return this;
        }
        public Builder allocatableVMs(DedicatedHostAllocatableVMResponse... allocatableVMs) {
            return allocatableVMs(List.of(allocatableVMs));
        }        public DedicatedHostAvailableCapacityResponse build() {
            return new DedicatedHostAvailableCapacityResponse(allocatableVMs);
        }
    }
}
