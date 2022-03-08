// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dataproc_v1.outputs.EnvironmentConfigResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.PySparkBatchResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.RuntimeConfigResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.RuntimeInfoResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.SparkBatchResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.SparkRBatchResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.SparkSqlBatchResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.StateHistoryResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetBatchResult {
    /**
     * The time when the batch was created.
     * 
     */
    private final String createTime;
    /**
     * The email address of the user who created the batch.
     * 
     */
    private final String creator;
    /**
     * Optional. Environment configuration for the batch execution.
     * 
     */
    private final EnvironmentConfigResponse environmentConfig;
    /**
     * Optional. The labels to associate with this batch. Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a batch.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The resource name of the batch.
     * 
     */
    private final String name;
    /**
     * The resource name of the operation associated with this batch.
     * 
     */
    private final String operation;
    /**
     * Optional. PySpark batch config.
     * 
     */
    private final PySparkBatchResponse pysparkBatch;
    /**
     * Optional. Runtime configuration for the batch execution.
     * 
     */
    private final RuntimeConfigResponse runtimeConfig;
    /**
     * Runtime information about batch execution.
     * 
     */
    private final RuntimeInfoResponse runtimeInfo;
    /**
     * Optional. Spark batch config.
     * 
     */
    private final SparkBatchResponse sparkBatch;
    /**
     * Optional. SparkR batch config.
     * 
     */
    private final SparkRBatchResponse sparkRBatch;
    /**
     * Optional. SparkSql batch config.
     * 
     */
    private final SparkSqlBatchResponse sparkSqlBatch;
    /**
     * The state of the batch.
     * 
     */
    private final String state;
    /**
     * Historical state information for the batch.
     * 
     */
    private final List<StateHistoryResponse> stateHistory;
    /**
     * Batch state details, such as a failure description if the state is FAILED.
     * 
     */
    private final String stateMessage;
    /**
     * The time when the batch entered a current state.
     * 
     */
    private final String stateTime;
    /**
     * A batch UUID (Unique Universal Identifier). The service generates this value when it creates the batch.
     * 
     */
    private final String uuid;

    @OutputCustomType.Constructor({"createTime","creator","environmentConfig","labels","name","operation","pysparkBatch","runtimeConfig","runtimeInfo","sparkBatch","sparkRBatch","sparkSqlBatch","state","stateHistory","stateMessage","stateTime","uuid"})
    private GetBatchResult(
        String createTime,
        String creator,
        EnvironmentConfigResponse environmentConfig,
        Map<String,String> labels,
        String name,
        String operation,
        PySparkBatchResponse pysparkBatch,
        RuntimeConfigResponse runtimeConfig,
        RuntimeInfoResponse runtimeInfo,
        SparkBatchResponse sparkBatch,
        SparkRBatchResponse sparkRBatch,
        SparkSqlBatchResponse sparkSqlBatch,
        String state,
        List<StateHistoryResponse> stateHistory,
        String stateMessage,
        String stateTime,
        String uuid) {
        this.createTime = createTime;
        this.creator = creator;
        this.environmentConfig = environmentConfig;
        this.labels = labels;
        this.name = name;
        this.operation = operation;
        this.pysparkBatch = pysparkBatch;
        this.runtimeConfig = runtimeConfig;
        this.runtimeInfo = runtimeInfo;
        this.sparkBatch = sparkBatch;
        this.sparkRBatch = sparkRBatch;
        this.sparkSqlBatch = sparkSqlBatch;
        this.state = state;
        this.stateHistory = stateHistory;
        this.stateMessage = stateMessage;
        this.stateTime = stateTime;
        this.uuid = uuid;
    }

    /**
     * The time when the batch was created.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The email address of the user who created the batch.
     * 
    */
    public String getCreator() {
        return this.creator;
    }
    /**
     * Optional. Environment configuration for the batch execution.
     * 
    */
    public EnvironmentConfigResponse getEnvironmentConfig() {
        return this.environmentConfig;
    }
    /**
     * Optional. The labels to associate with this batch. Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a batch.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * The resource name of the batch.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The resource name of the operation associated with this batch.
     * 
    */
    public String getOperation() {
        return this.operation;
    }
    /**
     * Optional. PySpark batch config.
     * 
    */
    public PySparkBatchResponse getPysparkBatch() {
        return this.pysparkBatch;
    }
    /**
     * Optional. Runtime configuration for the batch execution.
     * 
    */
    public RuntimeConfigResponse getRuntimeConfig() {
        return this.runtimeConfig;
    }
    /**
     * Runtime information about batch execution.
     * 
    */
    public RuntimeInfoResponse getRuntimeInfo() {
        return this.runtimeInfo;
    }
    /**
     * Optional. Spark batch config.
     * 
    */
    public SparkBatchResponse getSparkBatch() {
        return this.sparkBatch;
    }
    /**
     * Optional. SparkR batch config.
     * 
    */
    public SparkRBatchResponse getSparkRBatch() {
        return this.sparkRBatch;
    }
    /**
     * Optional. SparkSql batch config.
     * 
    */
    public SparkSqlBatchResponse getSparkSqlBatch() {
        return this.sparkSqlBatch;
    }
    /**
     * The state of the batch.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * Historical state information for the batch.
     * 
    */
    public List<StateHistoryResponse> getStateHistory() {
        return this.stateHistory;
    }
    /**
     * Batch state details, such as a failure description if the state is FAILED.
     * 
    */
    public String getStateMessage() {
        return this.stateMessage;
    }
    /**
     * The time when the batch entered a current state.
     * 
    */
    public String getStateTime() {
        return this.stateTime;
    }
    /**
     * A batch UUID (Unique Universal Identifier). The service generates this value when it creates the batch.
     * 
    */
    public String getUuid() {
        return this.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBatchResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String creator;
        private EnvironmentConfigResponse environmentConfig;
        private Map<String,String> labels;
        private String name;
        private String operation;
        private PySparkBatchResponse pysparkBatch;
        private RuntimeConfigResponse runtimeConfig;
        private RuntimeInfoResponse runtimeInfo;
        private SparkBatchResponse sparkBatch;
        private SparkRBatchResponse sparkRBatch;
        private SparkSqlBatchResponse sparkSqlBatch;
        private String state;
        private List<StateHistoryResponse> stateHistory;
        private String stateMessage;
        private String stateTime;
        private String uuid;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBatchResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.creator = defaults.creator;
    	      this.environmentConfig = defaults.environmentConfig;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.operation = defaults.operation;
    	      this.pysparkBatch = defaults.pysparkBatch;
    	      this.runtimeConfig = defaults.runtimeConfig;
    	      this.runtimeInfo = defaults.runtimeInfo;
    	      this.sparkBatch = defaults.sparkBatch;
    	      this.sparkRBatch = defaults.sparkRBatch;
    	      this.sparkSqlBatch = defaults.sparkSqlBatch;
    	      this.state = defaults.state;
    	      this.stateHistory = defaults.stateHistory;
    	      this.stateMessage = defaults.stateMessage;
    	      this.stateTime = defaults.stateTime;
    	      this.uuid = defaults.uuid;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setCreator(String creator) {
            this.creator = Objects.requireNonNull(creator);
            return this;
        }

        public Builder setEnvironmentConfig(EnvironmentConfigResponse environmentConfig) {
            this.environmentConfig = Objects.requireNonNull(environmentConfig);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOperation(String operation) {
            this.operation = Objects.requireNonNull(operation);
            return this;
        }

        public Builder setPysparkBatch(PySparkBatchResponse pysparkBatch) {
            this.pysparkBatch = Objects.requireNonNull(pysparkBatch);
            return this;
        }

        public Builder setRuntimeConfig(RuntimeConfigResponse runtimeConfig) {
            this.runtimeConfig = Objects.requireNonNull(runtimeConfig);
            return this;
        }

        public Builder setRuntimeInfo(RuntimeInfoResponse runtimeInfo) {
            this.runtimeInfo = Objects.requireNonNull(runtimeInfo);
            return this;
        }

        public Builder setSparkBatch(SparkBatchResponse sparkBatch) {
            this.sparkBatch = Objects.requireNonNull(sparkBatch);
            return this;
        }

        public Builder setSparkRBatch(SparkRBatchResponse sparkRBatch) {
            this.sparkRBatch = Objects.requireNonNull(sparkRBatch);
            return this;
        }

        public Builder setSparkSqlBatch(SparkSqlBatchResponse sparkSqlBatch) {
            this.sparkSqlBatch = Objects.requireNonNull(sparkSqlBatch);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setStateHistory(List<StateHistoryResponse> stateHistory) {
            this.stateHistory = Objects.requireNonNull(stateHistory);
            return this;
        }

        public Builder setStateMessage(String stateMessage) {
            this.stateMessage = Objects.requireNonNull(stateMessage);
            return this;
        }

        public Builder setStateTime(String stateTime) {
            this.stateTime = Objects.requireNonNull(stateTime);
            return this;
        }

        public Builder setUuid(String uuid) {
            this.uuid = Objects.requireNonNull(uuid);
            return this;
        }
        public GetBatchResult build() {
            return new GetBatchResult(createTime, creator, environmentConfig, labels, name, operation, pysparkBatch, runtimeConfig, runtimeInfo, sparkBatch, sparkRBatch, sparkSqlBatch, state, stateHistory, stateMessage, stateTime, uuid);
        }
    }
}
