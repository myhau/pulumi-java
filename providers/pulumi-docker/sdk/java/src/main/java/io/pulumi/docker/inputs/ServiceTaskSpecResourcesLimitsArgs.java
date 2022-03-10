// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTaskSpecResourcesLimitsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTaskSpecResourcesLimitsArgs Empty = new ServiceTaskSpecResourcesLimitsArgs();

    @InputImport(name="memoryBytes")
      private final @Nullable Input<Integer> memoryBytes;

    public Input<Integer> getMemoryBytes() {
        return this.memoryBytes == null ? Input.empty() : this.memoryBytes;
    }

    @InputImport(name="nanoCpus")
      private final @Nullable Input<Integer> nanoCpus;

    public Input<Integer> getNanoCpus() {
        return this.nanoCpus == null ? Input.empty() : this.nanoCpus;
    }

    public ServiceTaskSpecResourcesLimitsArgs(
        @Nullable Input<Integer> memoryBytes,
        @Nullable Input<Integer> nanoCpus) {
        this.memoryBytes = memoryBytes;
        this.nanoCpus = nanoCpus;
    }

    private ServiceTaskSpecResourcesLimitsArgs() {
        this.memoryBytes = Input.empty();
        this.nanoCpus = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecResourcesLimitsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> memoryBytes;
        private @Nullable Input<Integer> nanoCpus;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecResourcesLimitsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.memoryBytes = defaults.memoryBytes;
    	      this.nanoCpus = defaults.nanoCpus;
        }

        public Builder setMemoryBytes(@Nullable Input<Integer> memoryBytes) {
            this.memoryBytes = memoryBytes;
            return this;
        }

        public Builder setMemoryBytes(@Nullable Integer memoryBytes) {
            this.memoryBytes = Input.ofNullable(memoryBytes);
            return this;
        }

        public Builder setNanoCpus(@Nullable Input<Integer> nanoCpus) {
            this.nanoCpus = nanoCpus;
            return this;
        }

        public Builder setNanoCpus(@Nullable Integer nanoCpus) {
            this.nanoCpus = Input.ofNullable(nanoCpus);
            return this;
        }
        public ServiceTaskSpecResourcesLimitsArgs build() {
            return new ServiceTaskSpecResourcesLimitsArgs(memoryBytes, nanoCpus);
        }
    }
}