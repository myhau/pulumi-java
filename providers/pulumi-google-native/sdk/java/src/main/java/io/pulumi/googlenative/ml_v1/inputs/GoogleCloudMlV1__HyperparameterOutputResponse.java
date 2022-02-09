// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__BuiltInAlgorithmOutputResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public final class GoogleCloudMlV1__HyperparameterOutputResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudMlV1__HyperparameterOutputResponse Empty = new GoogleCloudMlV1__HyperparameterOutputResponse();

    @InputImport(name="allMetrics", required=true)
    private final List<GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse> allMetrics;

    public List<GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse> getAllMetrics() {
        return this.allMetrics;
    }

    @InputImport(name="builtInAlgorithmOutput", required=true)
    private final GoogleCloudMlV1__BuiltInAlgorithmOutputResponse builtInAlgorithmOutput;

    public GoogleCloudMlV1__BuiltInAlgorithmOutputResponse getBuiltInAlgorithmOutput() {
        return this.builtInAlgorithmOutput;
    }

    @InputImport(name="endTime", required=true)
    private final String endTime;

    public String getEndTime() {
        return this.endTime;
    }

    @InputImport(name="finalMetric", required=true)
    private final GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse finalMetric;

    public GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse getFinalMetric() {
        return this.finalMetric;
    }

    @InputImport(name="hyperparameters", required=true)
    private final Map<String,String> hyperparameters;

    public Map<String,String> getHyperparameters() {
        return this.hyperparameters;
    }

    @InputImport(name="isTrialStoppedEarly", required=true)
    private final Boolean isTrialStoppedEarly;

    public Boolean getIsTrialStoppedEarly() {
        return this.isTrialStoppedEarly;
    }

    @InputImport(name="startTime", required=true)
    private final String startTime;

    public String getStartTime() {
        return this.startTime;
    }

    @InputImport(name="state", required=true)
    private final String state;

    public String getState() {
        return this.state;
    }

    @InputImport(name="trialId", required=true)
    private final String trialId;

    public String getTrialId() {
        return this.trialId;
    }

    @InputImport(name="webAccessUris", required=true)
    private final Map<String,String> webAccessUris;

    public Map<String,String> getWebAccessUris() {
        return this.webAccessUris;
    }

    public GoogleCloudMlV1__HyperparameterOutputResponse(
        List<GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse> allMetrics,
        GoogleCloudMlV1__BuiltInAlgorithmOutputResponse builtInAlgorithmOutput,
        String endTime,
        GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse finalMetric,
        Map<String,String> hyperparameters,
        Boolean isTrialStoppedEarly,
        String startTime,
        String state,
        String trialId,
        Map<String,String> webAccessUris) {
        this.allMetrics = Objects.requireNonNull(allMetrics, "expected parameter 'allMetrics' to be non-null");
        this.builtInAlgorithmOutput = Objects.requireNonNull(builtInAlgorithmOutput, "expected parameter 'builtInAlgorithmOutput' to be non-null");
        this.endTime = Objects.requireNonNull(endTime, "expected parameter 'endTime' to be non-null");
        this.finalMetric = Objects.requireNonNull(finalMetric, "expected parameter 'finalMetric' to be non-null");
        this.hyperparameters = Objects.requireNonNull(hyperparameters, "expected parameter 'hyperparameters' to be non-null");
        this.isTrialStoppedEarly = Objects.requireNonNull(isTrialStoppedEarly, "expected parameter 'isTrialStoppedEarly' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.trialId = Objects.requireNonNull(trialId, "expected parameter 'trialId' to be non-null");
        this.webAccessUris = Objects.requireNonNull(webAccessUris, "expected parameter 'webAccessUris' to be non-null");
    }

    private GoogleCloudMlV1__HyperparameterOutputResponse() {
        this.allMetrics = List.of();
        this.builtInAlgorithmOutput = null;
        this.endTime = null;
        this.finalMetric = null;
        this.hyperparameters = Map.of();
        this.isTrialStoppedEarly = null;
        this.startTime = null;
        this.state = null;
        this.trialId = null;
        this.webAccessUris = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__HyperparameterOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse> allMetrics;
        private GoogleCloudMlV1__BuiltInAlgorithmOutputResponse builtInAlgorithmOutput;
        private String endTime;
        private GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse finalMetric;
        private Map<String,String> hyperparameters;
        private Boolean isTrialStoppedEarly;
        private String startTime;
        private String state;
        private String trialId;
        private Map<String,String> webAccessUris;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__HyperparameterOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allMetrics = defaults.allMetrics;
    	      this.builtInAlgorithmOutput = defaults.builtInAlgorithmOutput;
    	      this.endTime = defaults.endTime;
    	      this.finalMetric = defaults.finalMetric;
    	      this.hyperparameters = defaults.hyperparameters;
    	      this.isTrialStoppedEarly = defaults.isTrialStoppedEarly;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
    	      this.trialId = defaults.trialId;
    	      this.webAccessUris = defaults.webAccessUris;
        }

        public Builder setAllMetrics(List<GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse> allMetrics) {
            this.allMetrics = Objects.requireNonNull(allMetrics);
            return this;
        }

        public Builder setBuiltInAlgorithmOutput(GoogleCloudMlV1__BuiltInAlgorithmOutputResponse builtInAlgorithmOutput) {
            this.builtInAlgorithmOutput = Objects.requireNonNull(builtInAlgorithmOutput);
            return this;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setFinalMetric(GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse finalMetric) {
            this.finalMetric = Objects.requireNonNull(finalMetric);
            return this;
        }

        public Builder setHyperparameters(Map<String,String> hyperparameters) {
            this.hyperparameters = Objects.requireNonNull(hyperparameters);
            return this;
        }

        public Builder setIsTrialStoppedEarly(Boolean isTrialStoppedEarly) {
            this.isTrialStoppedEarly = Objects.requireNonNull(isTrialStoppedEarly);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setTrialId(String trialId) {
            this.trialId = Objects.requireNonNull(trialId);
            return this;
        }

        public Builder setWebAccessUris(Map<String,String> webAccessUris) {
            this.webAccessUris = Objects.requireNonNull(webAccessUris);
            return this;
        }

        public GoogleCloudMlV1__HyperparameterOutputResponse build() {
            return new GoogleCloudMlV1__HyperparameterOutputResponse(allMetrics, builtInAlgorithmOutput, endTime, finalMetric, hyperparameters, isTrialStoppedEarly, startTime, state, trialId, webAccessUris);
        }
    }
}