// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow.v2.outputs.GoogleCloudDialogflowV2SmartReplyMetricsTopNMetricsResponse;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2SmartReplyMetricsResponse {
    /**
     * @return Percentage of target participant messages in the evaluation dataset for which similar messages have appeared at least once in the allowlist. Should be [0, 1].
     * 
     */
    private final Double allowlistCoverage;
    /**
     * @return Total number of conversations used to generate this metric.
     * 
     */
    private final String conversationCount;
    /**
     * @return Metrics of top n smart replies, sorted by TopNMetric.n.
     * 
     */
    private final List<GoogleCloudDialogflowV2SmartReplyMetricsTopNMetricsResponse> topNMetrics;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2SmartReplyMetricsResponse(
        @CustomType.Parameter("allowlistCoverage") Double allowlistCoverage,
        @CustomType.Parameter("conversationCount") String conversationCount,
        @CustomType.Parameter("topNMetrics") List<GoogleCloudDialogflowV2SmartReplyMetricsTopNMetricsResponse> topNMetrics) {
        this.allowlistCoverage = allowlistCoverage;
        this.conversationCount = conversationCount;
        this.topNMetrics = topNMetrics;
    }

    /**
     * @return Percentage of target participant messages in the evaluation dataset for which similar messages have appeared at least once in the allowlist. Should be [0, 1].
     * 
     */
    public Double allowlistCoverage() {
        return this.allowlistCoverage;
    }
    /**
     * @return Total number of conversations used to generate this metric.
     * 
     */
    public String conversationCount() {
        return this.conversationCount;
    }
    /**
     * @return Metrics of top n smart replies, sorted by TopNMetric.n.
     * 
     */
    public List<GoogleCloudDialogflowV2SmartReplyMetricsTopNMetricsResponse> topNMetrics() {
        return this.topNMetrics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2SmartReplyMetricsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double allowlistCoverage;
        private String conversationCount;
        private List<GoogleCloudDialogflowV2SmartReplyMetricsTopNMetricsResponse> topNMetrics;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2SmartReplyMetricsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowlistCoverage = defaults.allowlistCoverage;
    	      this.conversationCount = defaults.conversationCount;
    	      this.topNMetrics = defaults.topNMetrics;
        }

        public Builder allowlistCoverage(Double allowlistCoverage) {
            this.allowlistCoverage = Objects.requireNonNull(allowlistCoverage);
            return this;
        }
        public Builder conversationCount(String conversationCount) {
            this.conversationCount = Objects.requireNonNull(conversationCount);
            return this;
        }
        public Builder topNMetrics(List<GoogleCloudDialogflowV2SmartReplyMetricsTopNMetricsResponse> topNMetrics) {
            this.topNMetrics = Objects.requireNonNull(topNMetrics);
            return this;
        }
        public Builder topNMetrics(GoogleCloudDialogflowV2SmartReplyMetricsTopNMetricsResponse... topNMetrics) {
            return topNMetrics(List.of(topNMetrics));
        }        public GoogleCloudDialogflowV2SmartReplyMetricsResponse build() {
            return new GoogleCloudDialogflowV2SmartReplyMetricsResponse(allowlistCoverage, conversationCount, topNMetrics);
        }
    }
}
