// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.WaitStatisticsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ExecutionStatisticsResponse {
    /**
     * CPU Time in millisecond(s) for the query execution
     * 
     */
    private final Double cpuTimeMs;
    /**
     * Time taken in millisecond(s) for executing the query
     * 
     */
    private final Double elapsedTimeMs;
    /**
     * No. of query executions
     * 
     */
    private final Double executionCount;
    /**
     * Indicates whether the query resulted in an error
     * 
     */
    private final Boolean hasErrors;
    /**
     * List of sql Errors
     * 
     */
    private final List<String> sqlErrors;
    /**
     * Dictionary of sql query execution wait types and the respective statistics
     * 
     */
    private final @Nullable Map<String,WaitStatisticsResponse> waitStats;

    @OutputCustomType.Constructor({"cpuTimeMs","elapsedTimeMs","executionCount","hasErrors","sqlErrors","waitStats"})
    private ExecutionStatisticsResponse(
        Double cpuTimeMs,
        Double elapsedTimeMs,
        Double executionCount,
        Boolean hasErrors,
        List<String> sqlErrors,
        @Nullable Map<String,WaitStatisticsResponse> waitStats) {
        this.cpuTimeMs = cpuTimeMs;
        this.elapsedTimeMs = elapsedTimeMs;
        this.executionCount = executionCount;
        this.hasErrors = hasErrors;
        this.sqlErrors = sqlErrors;
        this.waitStats = waitStats;
    }

    /**
     * CPU Time in millisecond(s) for the query execution
     * 
    */
    public Double getCpuTimeMs() {
        return this.cpuTimeMs;
    }
    /**
     * Time taken in millisecond(s) for executing the query
     * 
    */
    public Double getElapsedTimeMs() {
        return this.elapsedTimeMs;
    }
    /**
     * No. of query executions
     * 
    */
    public Double getExecutionCount() {
        return this.executionCount;
    }
    /**
     * Indicates whether the query resulted in an error
     * 
    */
    public Boolean getHasErrors() {
        return this.hasErrors;
    }
    /**
     * List of sql Errors
     * 
    */
    public List<String> getSqlErrors() {
        return this.sqlErrors;
    }
    /**
     * Dictionary of sql query execution wait types and the respective statistics
     * 
    */
    public Map<String,WaitStatisticsResponse> getWaitStats() {
        return this.waitStats == null ? Map.of() : this.waitStats;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecutionStatisticsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double cpuTimeMs;
        private Double elapsedTimeMs;
        private Double executionCount;
        private Boolean hasErrors;
        private List<String> sqlErrors;
        private @Nullable Map<String,WaitStatisticsResponse> waitStats;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecutionStatisticsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuTimeMs = defaults.cpuTimeMs;
    	      this.elapsedTimeMs = defaults.elapsedTimeMs;
    	      this.executionCount = defaults.executionCount;
    	      this.hasErrors = defaults.hasErrors;
    	      this.sqlErrors = defaults.sqlErrors;
    	      this.waitStats = defaults.waitStats;
        }

        public Builder setCpuTimeMs(Double cpuTimeMs) {
            this.cpuTimeMs = Objects.requireNonNull(cpuTimeMs);
            return this;
        }

        public Builder setElapsedTimeMs(Double elapsedTimeMs) {
            this.elapsedTimeMs = Objects.requireNonNull(elapsedTimeMs);
            return this;
        }

        public Builder setExecutionCount(Double executionCount) {
            this.executionCount = Objects.requireNonNull(executionCount);
            return this;
        }

        public Builder setHasErrors(Boolean hasErrors) {
            this.hasErrors = Objects.requireNonNull(hasErrors);
            return this;
        }

        public Builder setSqlErrors(List<String> sqlErrors) {
            this.sqlErrors = Objects.requireNonNull(sqlErrors);
            return this;
        }

        public Builder setWaitStats(@Nullable Map<String,WaitStatisticsResponse> waitStats) {
            this.waitStats = waitStats;
            return this;
        }
        public ExecutionStatisticsResponse build() {
            return new ExecutionStatisticsResponse(cpuTimeMs, elapsedTimeMs, executionCount, hasErrors, sqlErrors, waitStats);
        }
    }
}
