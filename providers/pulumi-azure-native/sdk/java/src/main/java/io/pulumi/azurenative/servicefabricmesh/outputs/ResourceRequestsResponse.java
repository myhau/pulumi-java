// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class ResourceRequestsResponse {
    /**
     * Requested number of CPU cores. At present, only full cores are supported.
     * 
     */
    private final Double cpu;
    /**
     * The memory request in GB for this container.
     * 
     */
    private final Double memoryInGB;

    @CustomType.Constructor
    private ResourceRequestsResponse(
        @CustomType.Parameter("cpu") Double cpu,
        @CustomType.Parameter("memoryInGB") Double memoryInGB) {
        this.cpu = cpu;
        this.memoryInGB = memoryInGB;
    }

    /**
     * Requested number of CPU cores. At present, only full cores are supported.
     * 
    */
    public Double cpu() {
        return this.cpu;
    }
    /**
     * The memory request in GB for this container.
     * 
    */
    public Double memoryInGB() {
        return this.memoryInGB;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceRequestsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double cpu;
        private Double memoryInGB;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceRequestsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.memoryInGB = defaults.memoryInGB;
        }

        public Builder cpu(Double cpu) {
            this.cpu = Objects.requireNonNull(cpu);
            return this;
        }
        public Builder memoryInGB(Double memoryInGB) {
            this.memoryInGB = Objects.requireNonNull(memoryInGB);
            return this;
        }        public ResourceRequestsResponse build() {
            return new ResourceRequestsResponse(cpu, memoryInGB);
        }
    }
}
