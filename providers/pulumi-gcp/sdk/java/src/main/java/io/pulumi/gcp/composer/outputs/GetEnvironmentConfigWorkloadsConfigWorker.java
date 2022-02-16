// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class GetEnvironmentConfigWorkloadsConfigWorker {
    private final Double cpu;
    private final Integer maxCount;
    private final Double memoryGb;
    private final Integer minCount;
    private final Double storageGb;

    @OutputCustomType.Constructor({"cpu","maxCount","memoryGb","minCount","storageGb"})
    private GetEnvironmentConfigWorkloadsConfigWorker(
        Double cpu,
        Integer maxCount,
        Double memoryGb,
        Integer minCount,
        Double storageGb) {
        this.cpu = Objects.requireNonNull(cpu);
        this.maxCount = Objects.requireNonNull(maxCount);
        this.memoryGb = Objects.requireNonNull(memoryGb);
        this.minCount = Objects.requireNonNull(minCount);
        this.storageGb = Objects.requireNonNull(storageGb);
    }

    public Double getCpu() {
        return this.cpu;
    }
    public Integer getMaxCount() {
        return this.maxCount;
    }
    public Double getMemoryGb() {
        return this.memoryGb;
    }
    public Integer getMinCount() {
        return this.minCount;
    }
    public Double getStorageGb() {
        return this.storageGb;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentConfigWorkloadsConfigWorker defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double cpu;
        private Integer maxCount;
        private Double memoryGb;
        private Integer minCount;
        private Double storageGb;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentConfigWorkloadsConfigWorker defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.maxCount = defaults.maxCount;
    	      this.memoryGb = defaults.memoryGb;
    	      this.minCount = defaults.minCount;
    	      this.storageGb = defaults.storageGb;
        }

        public Builder setCpu(Double cpu) {
            this.cpu = Objects.requireNonNull(cpu);
            return this;
        }

        public Builder setMaxCount(Integer maxCount) {
            this.maxCount = Objects.requireNonNull(maxCount);
            return this;
        }

        public Builder setMemoryGb(Double memoryGb) {
            this.memoryGb = Objects.requireNonNull(memoryGb);
            return this;
        }

        public Builder setMinCount(Integer minCount) {
            this.minCount = Objects.requireNonNull(minCount);
            return this;
        }

        public Builder setStorageGb(Double storageGb) {
            this.storageGb = Objects.requireNonNull(storageGb);
            return this;
        }

        public GetEnvironmentConfigWorkloadsConfigWorker build() {
            return new GetEnvironmentConfigWorkloadsConfigWorker(cpu, maxCount, memoryGb, minCount, storageGb);
        }
    }
}