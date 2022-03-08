// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1AsyncQueryResultResponse;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1QueryMetadataResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetQueryResult {
    /**
     * Creation time of the query.
     * 
     */
    private final String created;
    /**
     * Hostname is available only when query is executed at host level.
     * 
     */
    private final String envgroupHostname;
    /**
     * Error is set when query fails.
     * 
     */
    private final String error;
    /**
     * ExecutionTime is available only after the query is completed.
     * 
     */
    private final String executionTime;
    /**
     * Asynchronous Query Name.
     * 
     */
    private final String name;
    /**
     * Contains information like metrics, dimenstions etc of the AsyncQuery.
     * 
     */
    private final GoogleCloudApigeeV1QueryMetadataResponse queryParams;
    /**
     * Asynchronous Report ID.
     * 
     */
    private final String reportDefinitionId;
    /**
     * Result is available only after the query is completed.
     * 
     */
    private final GoogleCloudApigeeV1AsyncQueryResultResponse result;
    /**
     * ResultFileSize is available only after the query is completed.
     * 
     */
    private final String resultFileSize;
    /**
     * ResultRows is available only after the query is completed.
     * 
     */
    private final String resultRows;
    /**
     * Self link of the query. Example: `/organizations/myorg/environments/myenv/queries/9cfc0d85-0f30-46d6-ae6f-318d0cb961bd` or following format if query is running at host level: `/organizations/myorg/hostQueries/9cfc0d85-0f30-46d6-ae6f-318d0cb961bd`
     * 
     */
    private final String self;
    /**
     * Query state could be "enqueued", "running", "completed", "failed".
     * 
     */
    private final String state;
    /**
     * Last updated timestamp for the query.
     * 
     */
    private final String updated;

    @OutputCustomType.Constructor({"created","envgroupHostname","error","executionTime","name","queryParams","reportDefinitionId","result","resultFileSize","resultRows","self","state","updated"})
    private GetQueryResult(
        String created,
        String envgroupHostname,
        String error,
        String executionTime,
        String name,
        GoogleCloudApigeeV1QueryMetadataResponse queryParams,
        String reportDefinitionId,
        GoogleCloudApigeeV1AsyncQueryResultResponse result,
        String resultFileSize,
        String resultRows,
        String self,
        String state,
        String updated) {
        this.created = created;
        this.envgroupHostname = envgroupHostname;
        this.error = error;
        this.executionTime = executionTime;
        this.name = name;
        this.queryParams = queryParams;
        this.reportDefinitionId = reportDefinitionId;
        this.result = result;
        this.resultFileSize = resultFileSize;
        this.resultRows = resultRows;
        this.self = self;
        this.state = state;
        this.updated = updated;
    }

    /**
     * Creation time of the query.
     * 
    */
    public String getCreated() {
        return this.created;
    }
    /**
     * Hostname is available only when query is executed at host level.
     * 
    */
    public String getEnvgroupHostname() {
        return this.envgroupHostname;
    }
    /**
     * Error is set when query fails.
     * 
    */
    public String getError() {
        return this.error;
    }
    /**
     * ExecutionTime is available only after the query is completed.
     * 
    */
    public String getExecutionTime() {
        return this.executionTime;
    }
    /**
     * Asynchronous Query Name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Contains information like metrics, dimenstions etc of the AsyncQuery.
     * 
    */
    public GoogleCloudApigeeV1QueryMetadataResponse getQueryParams() {
        return this.queryParams;
    }
    /**
     * Asynchronous Report ID.
     * 
    */
    public String getReportDefinitionId() {
        return this.reportDefinitionId;
    }
    /**
     * Result is available only after the query is completed.
     * 
    */
    public GoogleCloudApigeeV1AsyncQueryResultResponse getResult() {
        return this.result;
    }
    /**
     * ResultFileSize is available only after the query is completed.
     * 
    */
    public String getResultFileSize() {
        return this.resultFileSize;
    }
    /**
     * ResultRows is available only after the query is completed.
     * 
    */
    public String getResultRows() {
        return this.resultRows;
    }
    /**
     * Self link of the query. Example: `/organizations/myorg/environments/myenv/queries/9cfc0d85-0f30-46d6-ae6f-318d0cb961bd` or following format if query is running at host level: `/organizations/myorg/hostQueries/9cfc0d85-0f30-46d6-ae6f-318d0cb961bd`
     * 
    */
    public String getSelf() {
        return this.self;
    }
    /**
     * Query state could be "enqueued", "running", "completed", "failed".
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * Last updated timestamp for the query.
     * 
    */
    public String getUpdated() {
        return this.updated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQueryResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String created;
        private String envgroupHostname;
        private String error;
        private String executionTime;
        private String name;
        private GoogleCloudApigeeV1QueryMetadataResponse queryParams;
        private String reportDefinitionId;
        private GoogleCloudApigeeV1AsyncQueryResultResponse result;
        private String resultFileSize;
        private String resultRows;
        private String self;
        private String state;
        private String updated;

        public Builder() {
    	      // Empty
        }

        public Builder(GetQueryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.created = defaults.created;
    	      this.envgroupHostname = defaults.envgroupHostname;
    	      this.error = defaults.error;
    	      this.executionTime = defaults.executionTime;
    	      this.name = defaults.name;
    	      this.queryParams = defaults.queryParams;
    	      this.reportDefinitionId = defaults.reportDefinitionId;
    	      this.result = defaults.result;
    	      this.resultFileSize = defaults.resultFileSize;
    	      this.resultRows = defaults.resultRows;
    	      this.self = defaults.self;
    	      this.state = defaults.state;
    	      this.updated = defaults.updated;
        }

        public Builder setCreated(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }

        public Builder setEnvgroupHostname(String envgroupHostname) {
            this.envgroupHostname = Objects.requireNonNull(envgroupHostname);
            return this;
        }

        public Builder setError(String error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }

        public Builder setExecutionTime(String executionTime) {
            this.executionTime = Objects.requireNonNull(executionTime);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setQueryParams(GoogleCloudApigeeV1QueryMetadataResponse queryParams) {
            this.queryParams = Objects.requireNonNull(queryParams);
            return this;
        }

        public Builder setReportDefinitionId(String reportDefinitionId) {
            this.reportDefinitionId = Objects.requireNonNull(reportDefinitionId);
            return this;
        }

        public Builder setResult(GoogleCloudApigeeV1AsyncQueryResultResponse result) {
            this.result = Objects.requireNonNull(result);
            return this;
        }

        public Builder setResultFileSize(String resultFileSize) {
            this.resultFileSize = Objects.requireNonNull(resultFileSize);
            return this;
        }

        public Builder setResultRows(String resultRows) {
            this.resultRows = Objects.requireNonNull(resultRows);
            return this;
        }

        public Builder setSelf(String self) {
            this.self = Objects.requireNonNull(self);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setUpdated(String updated) {
            this.updated = Objects.requireNonNull(updated);
            return this;
        }
        public GetQueryResult build() {
            return new GetQueryResult(created, envgroupHostname, error, executionTime, name, queryParams, reportDefinitionId, result, resultFileSize, resultRows, self, state, updated);
        }
    }
}
