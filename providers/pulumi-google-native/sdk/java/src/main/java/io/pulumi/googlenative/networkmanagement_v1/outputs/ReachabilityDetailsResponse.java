// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.networkmanagement_v1.outputs.StatusResponse;
import io.pulumi.googlenative.networkmanagement_v1.outputs.TraceResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ReachabilityDetailsResponse {
    /**
     * The details of a failure or a cancellation of reachability analysis.
     * 
     */
    private final StatusResponse error;
    /**
     * The overall result of the test's configuration analysis.
     * 
     */
    private final String result;
    /**
     * Result may contain a list of traces if a test has multiple possible paths in the network, such as when destination endpoint is a load balancer with multiple backends.
     * 
     */
    private final List<TraceResponse> traces;
    /**
     * The time of the configuration analysis.
     * 
     */
    private final String verifyTime;

    @OutputCustomType.Constructor({"error","result","traces","verifyTime"})
    private ReachabilityDetailsResponse(
        StatusResponse error,
        String result,
        List<TraceResponse> traces,
        String verifyTime) {
        this.error = error;
        this.result = result;
        this.traces = traces;
        this.verifyTime = verifyTime;
    }

    /**
     * The details of a failure or a cancellation of reachability analysis.
     * 
    */
    public StatusResponse getError() {
        return this.error;
    }
    /**
     * The overall result of the test's configuration analysis.
     * 
    */
    public String getResult() {
        return this.result;
    }
    /**
     * Result may contain a list of traces if a test has multiple possible paths in the network, such as when destination endpoint is a load balancer with multiple backends.
     * 
    */
    public List<TraceResponse> getTraces() {
        return this.traces;
    }
    /**
     * The time of the configuration analysis.
     * 
    */
    public String getVerifyTime() {
        return this.verifyTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReachabilityDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatusResponse error;
        private String result;
        private List<TraceResponse> traces;
        private String verifyTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ReachabilityDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.error = defaults.error;
    	      this.result = defaults.result;
    	      this.traces = defaults.traces;
    	      this.verifyTime = defaults.verifyTime;
        }

        public Builder setError(StatusResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }

        public Builder setResult(String result) {
            this.result = Objects.requireNonNull(result);
            return this;
        }

        public Builder setTraces(List<TraceResponse> traces) {
            this.traces = Objects.requireNonNull(traces);
            return this;
        }

        public Builder setVerifyTime(String verifyTime) {
            this.verifyTime = Objects.requireNonNull(verifyTime);
            return this;
        }
        public ReachabilityDetailsResponse build() {
            return new ReachabilityDetailsResponse(error, result, traces, verifyTime);
        }
    }
}
