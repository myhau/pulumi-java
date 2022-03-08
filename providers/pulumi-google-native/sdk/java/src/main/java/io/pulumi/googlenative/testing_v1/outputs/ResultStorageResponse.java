// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.testing_v1.outputs.GoogleCloudStorageResponse;
import io.pulumi.googlenative.testing_v1.outputs.ToolResultsExecutionResponse;
import io.pulumi.googlenative.testing_v1.outputs.ToolResultsHistoryResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ResultStorageResponse {
    /**
     * Required.
     * 
     */
    private final GoogleCloudStorageResponse googleCloudStorage;
    /**
     * URL to the results in the Firebase Web Console.
     * 
     */
    private final String resultsUrl;
    /**
     * The tool results execution that results are written to.
     * 
     */
    private final ToolResultsExecutionResponse toolResultsExecution;
    /**
     * The tool results history that contains the tool results execution that results are written to. If not provided, the service will choose an appropriate value.
     * 
     */
    private final ToolResultsHistoryResponse toolResultsHistory;

    @OutputCustomType.Constructor({"googleCloudStorage","resultsUrl","toolResultsExecution","toolResultsHistory"})
    private ResultStorageResponse(
        GoogleCloudStorageResponse googleCloudStorage,
        String resultsUrl,
        ToolResultsExecutionResponse toolResultsExecution,
        ToolResultsHistoryResponse toolResultsHistory) {
        this.googleCloudStorage = googleCloudStorage;
        this.resultsUrl = resultsUrl;
        this.toolResultsExecution = toolResultsExecution;
        this.toolResultsHistory = toolResultsHistory;
    }

    /**
     * Required.
     * 
    */
    public GoogleCloudStorageResponse getGoogleCloudStorage() {
        return this.googleCloudStorage;
    }
    /**
     * URL to the results in the Firebase Web Console.
     * 
    */
    public String getResultsUrl() {
        return this.resultsUrl;
    }
    /**
     * The tool results execution that results are written to.
     * 
    */
    public ToolResultsExecutionResponse getToolResultsExecution() {
        return this.toolResultsExecution;
    }
    /**
     * The tool results history that contains the tool results execution that results are written to. If not provided, the service will choose an appropriate value.
     * 
    */
    public ToolResultsHistoryResponse getToolResultsHistory() {
        return this.toolResultsHistory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResultStorageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudStorageResponse googleCloudStorage;
        private String resultsUrl;
        private ToolResultsExecutionResponse toolResultsExecution;
        private ToolResultsHistoryResponse toolResultsHistory;

        public Builder() {
    	      // Empty
        }

        public Builder(ResultStorageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.googleCloudStorage = defaults.googleCloudStorage;
    	      this.resultsUrl = defaults.resultsUrl;
    	      this.toolResultsExecution = defaults.toolResultsExecution;
    	      this.toolResultsHistory = defaults.toolResultsHistory;
        }

        public Builder setGoogleCloudStorage(GoogleCloudStorageResponse googleCloudStorage) {
            this.googleCloudStorage = Objects.requireNonNull(googleCloudStorage);
            return this;
        }

        public Builder setResultsUrl(String resultsUrl) {
            this.resultsUrl = Objects.requireNonNull(resultsUrl);
            return this;
        }

        public Builder setToolResultsExecution(ToolResultsExecutionResponse toolResultsExecution) {
            this.toolResultsExecution = Objects.requireNonNull(toolResultsExecution);
            return this;
        }

        public Builder setToolResultsHistory(ToolResultsHistoryResponse toolResultsHistory) {
            this.toolResultsHistory = Objects.requireNonNull(toolResultsHistory);
            return this;
        }
        public ResultStorageResponse build() {
            return new ResultStorageResponse(googleCloudStorage, resultsUrl, toolResultsExecution, toolResultsHistory);
        }
    }
}
