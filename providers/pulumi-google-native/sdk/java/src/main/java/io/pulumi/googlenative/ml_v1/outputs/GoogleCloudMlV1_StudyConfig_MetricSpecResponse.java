// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudMlV1_StudyConfig_MetricSpecResponse {
    /**
     * The optimization goal of the metric.
     * 
     */
    private final String goal;
    /**
     * The name of the metric.
     * 
     */
    private final String metric;

    @OutputCustomType.Constructor
    private GoogleCloudMlV1_StudyConfig_MetricSpecResponse(
        @OutputCustomType.Parameter("goal") String goal,
        @OutputCustomType.Parameter("metric") String metric) {
        this.goal = goal;
        this.metric = metric;
    }

    /**
     * The optimization goal of the metric.
     * 
    */
    public String getGoal() {
        return this.goal;
    }
    /**
     * The name of the metric.
     * 
    */
    public String getMetric() {
        return this.metric;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1_StudyConfig_MetricSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String goal;
        private String metric;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1_StudyConfig_MetricSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.goal = defaults.goal;
    	      this.metric = defaults.metric;
        }

        public Builder setGoal(String goal) {
            this.goal = Objects.requireNonNull(goal);
            return this;
        }

        public Builder setMetric(String metric) {
            this.metric = Objects.requireNonNull(metric);
            return this;
        }
        public GoogleCloudMlV1_StudyConfig_MetricSpecResponse build() {
            return new GoogleCloudMlV1_StudyConfig_MetricSpecResponse(goal, metric);
        }
    }
}
