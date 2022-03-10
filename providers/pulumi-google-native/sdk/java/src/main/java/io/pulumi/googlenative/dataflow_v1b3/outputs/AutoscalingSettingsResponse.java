// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AutoscalingSettingsResponse {
    /**
     * The algorithm to use for autoscaling.
     * 
     */
    private final String algorithm;
    /**
     * The maximum number of workers to cap scaling at.
     * 
     */
    private final Integer maxNumWorkers;

    @OutputCustomType.Constructor
    private AutoscalingSettingsResponse(
        @OutputCustomType.Parameter("algorithm") String algorithm,
        @OutputCustomType.Parameter("maxNumWorkers") Integer maxNumWorkers) {
        this.algorithm = algorithm;
        this.maxNumWorkers = maxNumWorkers;
    }

    /**
     * The algorithm to use for autoscaling.
     * 
    */
    public String getAlgorithm() {
        return this.algorithm;
    }
    /**
     * The maximum number of workers to cap scaling at.
     * 
    */
    public Integer getMaxNumWorkers() {
        return this.maxNumWorkers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalingSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String algorithm;
        private Integer maxNumWorkers;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalingSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.maxNumWorkers = defaults.maxNumWorkers;
        }

        public Builder setAlgorithm(String algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }

        public Builder setMaxNumWorkers(Integer maxNumWorkers) {
            this.maxNumWorkers = Objects.requireNonNull(maxNumWorkers);
            return this;
        }
        public AutoscalingSettingsResponse build() {
            return new AutoscalingSettingsResponse(algorithm, maxNumWorkers);
        }
    }
}
