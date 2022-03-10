// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3ExperimentResultMetricResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3ExperimentResultVersionMetricsResponse {
    /**
     * The metrics and corresponding confidence intervals in the inference result.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3ExperimentResultMetricResponse> metrics;
    /**
     * Number of sessions that were allocated to this version.
     * 
     */
    private final Integer sessionCount;
    /**
     * The name of the flow Version. Format: `projects//locations//agents//flows//versions/`.
     * 
     */
    private final String version;

    @OutputCustomType.Constructor
    private GoogleCloudDialogflowCxV3ExperimentResultVersionMetricsResponse(
        @OutputCustomType.Parameter("metrics") List<GoogleCloudDialogflowCxV3ExperimentResultMetricResponse> metrics,
        @OutputCustomType.Parameter("sessionCount") Integer sessionCount,
        @OutputCustomType.Parameter("version") String version) {
        this.metrics = metrics;
        this.sessionCount = sessionCount;
        this.version = version;
    }

    /**
     * The metrics and corresponding confidence intervals in the inference result.
     * 
    */
    public List<GoogleCloudDialogflowCxV3ExperimentResultMetricResponse> getMetrics() {
        return this.metrics;
    }
    /**
     * Number of sessions that were allocated to this version.
     * 
    */
    public Integer getSessionCount() {
        return this.sessionCount;
    }
    /**
     * The name of the flow Version. Format: `projects//locations//agents//flows//versions/`.
     * 
    */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3ExperimentResultVersionMetricsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowCxV3ExperimentResultMetricResponse> metrics;
        private Integer sessionCount;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3ExperimentResultVersionMetricsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metrics = defaults.metrics;
    	      this.sessionCount = defaults.sessionCount;
    	      this.version = defaults.version;
        }

        public Builder setMetrics(List<GoogleCloudDialogflowCxV3ExperimentResultMetricResponse> metrics) {
            this.metrics = Objects.requireNonNull(metrics);
            return this;
        }

        public Builder setSessionCount(Integer sessionCount) {
            this.sessionCount = Objects.requireNonNull(sessionCount);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GoogleCloudDialogflowCxV3ExperimentResultVersionMetricsResponse build() {
            return new GoogleCloudDialogflowCxV3ExperimentResultVersionMetricsResponse(metrics, sessionCount, version);
        }
    }
}
