// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute.v1.outputs.AcceleratorConfigResponse;
import com.pulumi.googlenative.compute.v1.outputs.AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class AllocationSpecificSKUAllocationReservedInstancePropertiesResponse {
    /**
     * @return Specifies accelerator type and count.
     * 
     */
    private final List<AcceleratorConfigResponse> guestAccelerators;
    /**
     * @return Specifies amount of local ssd to reserve with each instance. The type of disk is local-ssd.
     * 
     */
    private final List<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskResponse> localSsds;
    /**
     * @return An opaque location hint used to place the allocation close to other resources. This field is for use by internal tools that use the public API.
     * 
     */
    private final String locationHint;
    /**
     * @return Specifies type of machine (name only) which has fixed number of vCPUs and fixed amount of memory. This also includes specifying custom machine type following custom-NUMBER_OF_CPUS-AMOUNT_OF_MEMORY pattern.
     * 
     */
    private final String machineType;
    /**
     * @return Minimum cpu platform the reservation.
     * 
     */
    private final String minCpuPlatform;

    @CustomType.Constructor
    private AllocationSpecificSKUAllocationReservedInstancePropertiesResponse(
        @CustomType.Parameter("guestAccelerators") List<AcceleratorConfigResponse> guestAccelerators,
        @CustomType.Parameter("localSsds") List<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskResponse> localSsds,
        @CustomType.Parameter("locationHint") String locationHint,
        @CustomType.Parameter("machineType") String machineType,
        @CustomType.Parameter("minCpuPlatform") String minCpuPlatform) {
        this.guestAccelerators = guestAccelerators;
        this.localSsds = localSsds;
        this.locationHint = locationHint;
        this.machineType = machineType;
        this.minCpuPlatform = minCpuPlatform;
    }

    /**
     * @return Specifies accelerator type and count.
     * 
     */
    public List<AcceleratorConfigResponse> guestAccelerators() {
        return this.guestAccelerators;
    }
    /**
     * @return Specifies amount of local ssd to reserve with each instance. The type of disk is local-ssd.
     * 
     */
    public List<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskResponse> localSsds() {
        return this.localSsds;
    }
    /**
     * @return An opaque location hint used to place the allocation close to other resources. This field is for use by internal tools that use the public API.
     * 
     */
    public String locationHint() {
        return this.locationHint;
    }
    /**
     * @return Specifies type of machine (name only) which has fixed number of vCPUs and fixed amount of memory. This also includes specifying custom machine type following custom-NUMBER_OF_CPUS-AMOUNT_OF_MEMORY pattern.
     * 
     */
    public String machineType() {
        return this.machineType;
    }
    /**
     * @return Minimum cpu platform the reservation.
     * 
     */
    public String minCpuPlatform() {
        return this.minCpuPlatform;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AllocationSpecificSKUAllocationReservedInstancePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AcceleratorConfigResponse> guestAccelerators;
        private List<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskResponse> localSsds;
        private String locationHint;
        private String machineType;
        private String minCpuPlatform;

        public Builder() {
    	      // Empty
        }

        public Builder(AllocationSpecificSKUAllocationReservedInstancePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.guestAccelerators = defaults.guestAccelerators;
    	      this.localSsds = defaults.localSsds;
    	      this.locationHint = defaults.locationHint;
    	      this.machineType = defaults.machineType;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
        }

        public Builder guestAccelerators(List<AcceleratorConfigResponse> guestAccelerators) {
            this.guestAccelerators = Objects.requireNonNull(guestAccelerators);
            return this;
        }
        public Builder guestAccelerators(AcceleratorConfigResponse... guestAccelerators) {
            return guestAccelerators(List.of(guestAccelerators));
        }
        public Builder localSsds(List<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskResponse> localSsds) {
            this.localSsds = Objects.requireNonNull(localSsds);
            return this;
        }
        public Builder localSsds(AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskResponse... localSsds) {
            return localSsds(List.of(localSsds));
        }
        public Builder locationHint(String locationHint) {
            this.locationHint = Objects.requireNonNull(locationHint);
            return this;
        }
        public Builder machineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }
        public Builder minCpuPlatform(String minCpuPlatform) {
            this.minCpuPlatform = Objects.requireNonNull(minCpuPlatform);
            return this;
        }        public AllocationSpecificSKUAllocationReservedInstancePropertiesResponse build() {
            return new AllocationSpecificSKUAllocationReservedInstancePropertiesResponse(guestAccelerators, localSsds, locationHint, machineType, minCpuPlatform);
        }
    }
}
