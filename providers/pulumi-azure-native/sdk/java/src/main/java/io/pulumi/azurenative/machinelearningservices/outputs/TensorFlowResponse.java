// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TensorFlowResponse {
    /**
     * Enum to determine the job distribution type.
     * Expected value is 'TensorFlow'.
     * 
     */
    private final String distributionType;
    /**
     * Number of parameter server tasks.
     * 
     */
    private final @Nullable Integer parameterServerCount;
    /**
     * Number of workers. Overwrites the node count in compute binding.
     * 
     */
    private final @Nullable Integer workerCount;

    @CustomType.Constructor
    private TensorFlowResponse(
        @CustomType.Parameter("distributionType") String distributionType,
        @CustomType.Parameter("parameterServerCount") @Nullable Integer parameterServerCount,
        @CustomType.Parameter("workerCount") @Nullable Integer workerCount) {
        this.distributionType = distributionType;
        this.parameterServerCount = parameterServerCount;
        this.workerCount = workerCount;
    }

    /**
     * Enum to determine the job distribution type.
     * Expected value is 'TensorFlow'.
     * 
    */
    public String distributionType() {
        return this.distributionType;
    }
    /**
     * Number of parameter server tasks.
     * 
    */
    public Optional<Integer> parameterServerCount() {
        return Optional.ofNullable(this.parameterServerCount);
    }
    /**
     * Number of workers. Overwrites the node count in compute binding.
     * 
    */
    public Optional<Integer> workerCount() {
        return Optional.ofNullable(this.workerCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TensorFlowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String distributionType;
        private @Nullable Integer parameterServerCount;
        private @Nullable Integer workerCount;

        public Builder() {
    	      // Empty
        }

        public Builder(TensorFlowResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distributionType = defaults.distributionType;
    	      this.parameterServerCount = defaults.parameterServerCount;
    	      this.workerCount = defaults.workerCount;
        }

        public Builder distributionType(String distributionType) {
            this.distributionType = Objects.requireNonNull(distributionType);
            return this;
        }
        public Builder parameterServerCount(@Nullable Integer parameterServerCount) {
            this.parameterServerCount = parameterServerCount;
            return this;
        }
        public Builder workerCount(@Nullable Integer workerCount) {
            this.workerCount = workerCount;
            return this;
        }        public TensorFlowResponse build() {
            return new TensorFlowResponse(distributionType, parameterServerCount, workerCount);
        }
    }
}
