// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerResourceRequirementsResponse {
    /**
     * The minimum amount of CPU cores to be used by the container. More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
     * 
     */
    private final @Nullable Double cpu;
    /**
     * The maximum amount of CPU cores allowed to be used by the container. More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
     * 
     */
    private final @Nullable Double cpuLimit;
    /**
     * The number of FPGA PCIE devices exposed to the container. Must be multiple of 2.
     * 
     */
    private final @Nullable Integer fpga;
    /**
     * The number of GPU cores in the container.
     * 
     */
    private final @Nullable Integer gpu;
    /**
     * The minimum amount of memory (in GB) to be used by the container. More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
     * 
     */
    private final @Nullable Double memoryInGB;
    /**
     * The maximum amount of memory (in GB) allowed to be used by the container. More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
     * 
     */
    private final @Nullable Double memoryInGBLimit;

    @CustomType.Constructor
    private ContainerResourceRequirementsResponse(
        @CustomType.Parameter("cpu") @Nullable Double cpu,
        @CustomType.Parameter("cpuLimit") @Nullable Double cpuLimit,
        @CustomType.Parameter("fpga") @Nullable Integer fpga,
        @CustomType.Parameter("gpu") @Nullable Integer gpu,
        @CustomType.Parameter("memoryInGB") @Nullable Double memoryInGB,
        @CustomType.Parameter("memoryInGBLimit") @Nullable Double memoryInGBLimit) {
        this.cpu = cpu;
        this.cpuLimit = cpuLimit;
        this.fpga = fpga;
        this.gpu = gpu;
        this.memoryInGB = memoryInGB;
        this.memoryInGBLimit = memoryInGBLimit;
    }

    /**
     * The minimum amount of CPU cores to be used by the container. More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
     * 
    */
    public Optional<Double> cpu() {
        return Optional.ofNullable(this.cpu);
    }
    /**
     * The maximum amount of CPU cores allowed to be used by the container. More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
     * 
    */
    public Optional<Double> cpuLimit() {
        return Optional.ofNullable(this.cpuLimit);
    }
    /**
     * The number of FPGA PCIE devices exposed to the container. Must be multiple of 2.
     * 
    */
    public Optional<Integer> fpga() {
        return Optional.ofNullable(this.fpga);
    }
    /**
     * The number of GPU cores in the container.
     * 
    */
    public Optional<Integer> gpu() {
        return Optional.ofNullable(this.gpu);
    }
    /**
     * The minimum amount of memory (in GB) to be used by the container. More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
     * 
    */
    public Optional<Double> memoryInGB() {
        return Optional.ofNullable(this.memoryInGB);
    }
    /**
     * The maximum amount of memory (in GB) allowed to be used by the container. More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
     * 
    */
    public Optional<Double> memoryInGBLimit() {
        return Optional.ofNullable(this.memoryInGBLimit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerResourceRequirementsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double cpu;
        private @Nullable Double cpuLimit;
        private @Nullable Integer fpga;
        private @Nullable Integer gpu;
        private @Nullable Double memoryInGB;
        private @Nullable Double memoryInGBLimit;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerResourceRequirementsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.cpuLimit = defaults.cpuLimit;
    	      this.fpga = defaults.fpga;
    	      this.gpu = defaults.gpu;
    	      this.memoryInGB = defaults.memoryInGB;
    	      this.memoryInGBLimit = defaults.memoryInGBLimit;
        }

        public Builder cpu(@Nullable Double cpu) {
            this.cpu = cpu;
            return this;
        }
        public Builder cpuLimit(@Nullable Double cpuLimit) {
            this.cpuLimit = cpuLimit;
            return this;
        }
        public Builder fpga(@Nullable Integer fpga) {
            this.fpga = fpga;
            return this;
        }
        public Builder gpu(@Nullable Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Builder memoryInGB(@Nullable Double memoryInGB) {
            this.memoryInGB = memoryInGB;
            return this;
        }
        public Builder memoryInGBLimit(@Nullable Double memoryInGBLimit) {
            this.memoryInGBLimit = memoryInGBLimit;
            return this;
        }        public ContainerResourceRequirementsResponse build() {
            return new ContainerResourceRequirementsResponse(cpu, cpuLimit, fpga, gpu, memoryInGB, memoryInGBLimit);
        }
    }
}
