// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dlp.v2.outputs.GooglePrivacyDlpV2HybridInspectStatisticsResponse;
import com.pulumi.googlenative.dlp.v2.outputs.GooglePrivacyDlpV2InfoTypeStatsResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2ResultResponse {
    /**
     * @return Statistics related to the processing of hybrid inspect.
     * 
     */
    private final GooglePrivacyDlpV2HybridInspectStatisticsResponse hybridStats;
    /**
     * @return Statistics of how many instances of each info type were found during inspect job.
     * 
     */
    private final List<GooglePrivacyDlpV2InfoTypeStatsResponse> infoTypeStats;
    /**
     * @return Total size in bytes that were processed.
     * 
     */
    private final String processedBytes;
    /**
     * @return Estimate of the number of bytes to process.
     * 
     */
    private final String totalEstimatedBytes;

    @CustomType.Constructor
    private GooglePrivacyDlpV2ResultResponse(
        @CustomType.Parameter("hybridStats") GooglePrivacyDlpV2HybridInspectStatisticsResponse hybridStats,
        @CustomType.Parameter("infoTypeStats") List<GooglePrivacyDlpV2InfoTypeStatsResponse> infoTypeStats,
        @CustomType.Parameter("processedBytes") String processedBytes,
        @CustomType.Parameter("totalEstimatedBytes") String totalEstimatedBytes) {
        this.hybridStats = hybridStats;
        this.infoTypeStats = infoTypeStats;
        this.processedBytes = processedBytes;
        this.totalEstimatedBytes = totalEstimatedBytes;
    }

    /**
     * @return Statistics related to the processing of hybrid inspect.
     * 
     */
    public GooglePrivacyDlpV2HybridInspectStatisticsResponse hybridStats() {
        return this.hybridStats;
    }
    /**
     * @return Statistics of how many instances of each info type were found during inspect job.
     * 
     */
    public List<GooglePrivacyDlpV2InfoTypeStatsResponse> infoTypeStats() {
        return this.infoTypeStats;
    }
    /**
     * @return Total size in bytes that were processed.
     * 
     */
    public String processedBytes() {
        return this.processedBytes;
    }
    /**
     * @return Estimate of the number of bytes to process.
     * 
     */
    public String totalEstimatedBytes() {
        return this.totalEstimatedBytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2ResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2HybridInspectStatisticsResponse hybridStats;
        private List<GooglePrivacyDlpV2InfoTypeStatsResponse> infoTypeStats;
        private String processedBytes;
        private String totalEstimatedBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2ResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hybridStats = defaults.hybridStats;
    	      this.infoTypeStats = defaults.infoTypeStats;
    	      this.processedBytes = defaults.processedBytes;
    	      this.totalEstimatedBytes = defaults.totalEstimatedBytes;
        }

        public Builder hybridStats(GooglePrivacyDlpV2HybridInspectStatisticsResponse hybridStats) {
            this.hybridStats = Objects.requireNonNull(hybridStats);
            return this;
        }
        public Builder infoTypeStats(List<GooglePrivacyDlpV2InfoTypeStatsResponse> infoTypeStats) {
            this.infoTypeStats = Objects.requireNonNull(infoTypeStats);
            return this;
        }
        public Builder infoTypeStats(GooglePrivacyDlpV2InfoTypeStatsResponse... infoTypeStats) {
            return infoTypeStats(List.of(infoTypeStats));
        }
        public Builder processedBytes(String processedBytes) {
            this.processedBytes = Objects.requireNonNull(processedBytes);
            return this;
        }
        public Builder totalEstimatedBytes(String totalEstimatedBytes) {
            this.totalEstimatedBytes = Objects.requireNonNull(totalEstimatedBytes);
            return this;
        }        public GooglePrivacyDlpV2ResultResponse build() {
            return new GooglePrivacyDlpV2ResultResponse(hybridStats, infoTypeStats, processedBytes, totalEstimatedBytes);
        }
    }
}
