// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1.outputs.StatusResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DiscoveryOccurrenceResponse {
    /**
     * The status of discovery for the resource.
     * 
     */
    private final String analysisStatus;
    /**
     * When an error is encountered this will contain a LocalizedMessage under details to show to the user. The LocalizedMessage is output only and populated by the API.
     * 
     */
    private final StatusResponse analysisStatusError;
    /**
     * Whether the resource is continuously analyzed.
     * 
     */
    private final String continuousAnalysis;
    /**
     * The CPE of the resource being scanned.
     * 
     */
    private final String cpe;
    /**
     * The last time this resource was scanned.
     * 
     */
    private final String lastScanTime;

    @OutputCustomType.Constructor({"analysisStatus","analysisStatusError","continuousAnalysis","cpe","lastScanTime"})
    private DiscoveryOccurrenceResponse(
        String analysisStatus,
        StatusResponse analysisStatusError,
        String continuousAnalysis,
        String cpe,
        String lastScanTime) {
        this.analysisStatus = analysisStatus;
        this.analysisStatusError = analysisStatusError;
        this.continuousAnalysis = continuousAnalysis;
        this.cpe = cpe;
        this.lastScanTime = lastScanTime;
    }

    /**
     * The status of discovery for the resource.
     * 
    */
    public String getAnalysisStatus() {
        return this.analysisStatus;
    }
    /**
     * When an error is encountered this will contain a LocalizedMessage under details to show to the user. The LocalizedMessage is output only and populated by the API.
     * 
    */
    public StatusResponse getAnalysisStatusError() {
        return this.analysisStatusError;
    }
    /**
     * Whether the resource is continuously analyzed.
     * 
    */
    public String getContinuousAnalysis() {
        return this.continuousAnalysis;
    }
    /**
     * The CPE of the resource being scanned.
     * 
    */
    public String getCpe() {
        return this.cpe;
    }
    /**
     * The last time this resource was scanned.
     * 
    */
    public String getLastScanTime() {
        return this.lastScanTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiscoveryOccurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String analysisStatus;
        private StatusResponse analysisStatusError;
        private String continuousAnalysis;
        private String cpe;
        private String lastScanTime;

        public Builder() {
    	      // Empty
        }

        public Builder(DiscoveryOccurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analysisStatus = defaults.analysisStatus;
    	      this.analysisStatusError = defaults.analysisStatusError;
    	      this.continuousAnalysis = defaults.continuousAnalysis;
    	      this.cpe = defaults.cpe;
    	      this.lastScanTime = defaults.lastScanTime;
        }

        public Builder setAnalysisStatus(String analysisStatus) {
            this.analysisStatus = Objects.requireNonNull(analysisStatus);
            return this;
        }

        public Builder setAnalysisStatusError(StatusResponse analysisStatusError) {
            this.analysisStatusError = Objects.requireNonNull(analysisStatusError);
            return this;
        }

        public Builder setContinuousAnalysis(String continuousAnalysis) {
            this.continuousAnalysis = Objects.requireNonNull(continuousAnalysis);
            return this;
        }

        public Builder setCpe(String cpe) {
            this.cpe = Objects.requireNonNull(cpe);
            return this;
        }

        public Builder setLastScanTime(String lastScanTime) {
            this.lastScanTime = Objects.requireNonNull(lastScanTime);
            return this;
        }
        public DiscoveryOccurrenceResponse build() {
            return new DiscoveryOccurrenceResponse(analysisStatus, analysisStatusError, continuousAnalysis, cpe, lastScanTime);
        }
    }
}
