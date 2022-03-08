// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagesync.outputs;

import io.pulumi.azurenative.storagesync.outputs.ServerEndpointRecallErrorResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ServerEndpointRecallStatusResponse {
    /**
     * Last updated timestamp
     * 
     */
    private final String lastUpdatedTimestamp;
    /**
     * Array of recall errors
     * 
     */
    private final List<ServerEndpointRecallErrorResponse> recallErrors;
    /**
     * Total count of recall errors.
     * 
     */
    private final Double totalRecallErrorsCount;

    @OutputCustomType.Constructor({"lastUpdatedTimestamp","recallErrors","totalRecallErrorsCount"})
    private ServerEndpointRecallStatusResponse(
        String lastUpdatedTimestamp,
        List<ServerEndpointRecallErrorResponse> recallErrors,
        Double totalRecallErrorsCount) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        this.recallErrors = recallErrors;
        this.totalRecallErrorsCount = totalRecallErrorsCount;
    }

    /**
     * Last updated timestamp
     * 
    */
    public String getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }
    /**
     * Array of recall errors
     * 
    */
    public List<ServerEndpointRecallErrorResponse> getRecallErrors() {
        return this.recallErrors;
    }
    /**
     * Total count of recall errors.
     * 
    */
    public Double getTotalRecallErrorsCount() {
        return this.totalRecallErrorsCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerEndpointRecallStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String lastUpdatedTimestamp;
        private List<ServerEndpointRecallErrorResponse> recallErrors;
        private Double totalRecallErrorsCount;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerEndpointRecallStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastUpdatedTimestamp = defaults.lastUpdatedTimestamp;
    	      this.recallErrors = defaults.recallErrors;
    	      this.totalRecallErrorsCount = defaults.totalRecallErrorsCount;
        }

        public Builder setLastUpdatedTimestamp(String lastUpdatedTimestamp) {
            this.lastUpdatedTimestamp = Objects.requireNonNull(lastUpdatedTimestamp);
            return this;
        }

        public Builder setRecallErrors(List<ServerEndpointRecallErrorResponse> recallErrors) {
            this.recallErrors = Objects.requireNonNull(recallErrors);
            return this;
        }

        public Builder setTotalRecallErrorsCount(Double totalRecallErrorsCount) {
            this.totalRecallErrorsCount = Objects.requireNonNull(totalRecallErrorsCount);
            return this;
        }
        public ServerEndpointRecallStatusResponse build() {
            return new ServerEndpointRecallStatusResponse(lastUpdatedTimestamp, recallErrors, totalRecallErrorsCount);
        }
    }
}
