// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.OraclePartitionSettingsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A copy activity Oracle source.
 * 
 */
public final class OracleSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final OracleSourceArgs Empty = new OracleSourceArgs();

    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    @Import(name="additionalColumns")
      private final @Nullable Output<Object> additionalColumns;

    public Output<Object> additionalColumns() {
        return this.additionalColumns == null ? Codegen.empty() : this.additionalColumns;
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
      private final @Nullable Output<Object> disableMetricsCollection;

    public Output<Object> disableMetricsCollection() {
        return this.disableMetricsCollection == null ? Codegen.empty() : this.disableMetricsCollection;
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
      private final @Nullable Output<Object> maxConcurrentConnections;

    public Output<Object> maxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Codegen.empty() : this.maxConcurrentConnections;
    }

    /**
     * Oracle reader query. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="oracleReaderQuery")
      private final @Nullable Output<Object> oracleReaderQuery;

    public Output<Object> oracleReaderQuery() {
        return this.oracleReaderQuery == null ? Codegen.empty() : this.oracleReaderQuery;
    }

    /**
     * The partition mechanism that will be used for Oracle read in parallel. Possible values include: "None", "PhysicalPartitionsOfTable", "DynamicRange".
     * 
     */
    @Import(name="partitionOption")
      private final @Nullable Output<Object> partitionOption;

    public Output<Object> partitionOption() {
        return this.partitionOption == null ? Codegen.empty() : this.partitionOption;
    }

    /**
     * The settings that will be leveraged for Oracle source partitioning.
     * 
     */
    @Import(name="partitionSettings")
      private final @Nullable Output<OraclePartitionSettingsArgs> partitionSettings;

    public Output<OraclePartitionSettingsArgs> partitionSettings() {
        return this.partitionSettings == null ? Codegen.empty() : this.partitionSettings;
    }

    /**
     * Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="queryTimeout")
      private final @Nullable Output<Object> queryTimeout;

    public Output<Object> queryTimeout() {
        return this.queryTimeout == null ? Codegen.empty() : this.queryTimeout;
    }

    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sourceRetryCount")
      private final @Nullable Output<Object> sourceRetryCount;

    public Output<Object> sourceRetryCount() {
        return this.sourceRetryCount == null ? Codegen.empty() : this.sourceRetryCount;
    }

    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sourceRetryWait")
      private final @Nullable Output<Object> sourceRetryWait;

    public Output<Object> sourceRetryWait() {
        return this.sourceRetryWait == null ? Codegen.empty() : this.sourceRetryWait;
    }

    /**
     * Copy source type.
     * Expected value is 'OracleSource'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public OracleSourceArgs(
        @Nullable Output<Object> additionalColumns,
        @Nullable Output<Object> disableMetricsCollection,
        @Nullable Output<Object> maxConcurrentConnections,
        @Nullable Output<Object> oracleReaderQuery,
        @Nullable Output<Object> partitionOption,
        @Nullable Output<OraclePartitionSettingsArgs> partitionSettings,
        @Nullable Output<Object> queryTimeout,
        @Nullable Output<Object> sourceRetryCount,
        @Nullable Output<Object> sourceRetryWait,
        Output<String> type) {
        this.additionalColumns = additionalColumns;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.oracleReaderQuery = oracleReaderQuery;
        this.partitionOption = partitionOption;
        this.partitionSettings = partitionSettings;
        this.queryTimeout = queryTimeout;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private OracleSourceArgs() {
        this.additionalColumns = Codegen.empty();
        this.disableMetricsCollection = Codegen.empty();
        this.maxConcurrentConnections = Codegen.empty();
        this.oracleReaderQuery = Codegen.empty();
        this.partitionOption = Codegen.empty();
        this.partitionSettings = Codegen.empty();
        this.queryTimeout = Codegen.empty();
        this.sourceRetryCount = Codegen.empty();
        this.sourceRetryWait = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OracleSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> additionalColumns;
        private @Nullable Output<Object> disableMetricsCollection;
        private @Nullable Output<Object> maxConcurrentConnections;
        private @Nullable Output<Object> oracleReaderQuery;
        private @Nullable Output<Object> partitionOption;
        private @Nullable Output<OraclePartitionSettingsArgs> partitionSettings;
        private @Nullable Output<Object> queryTimeout;
        private @Nullable Output<Object> sourceRetryCount;
        private @Nullable Output<Object> sourceRetryWait;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(OracleSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalColumns = defaults.additionalColumns;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.oracleReaderQuery = defaults.oracleReaderQuery;
    	      this.partitionOption = defaults.partitionOption;
    	      this.partitionSettings = defaults.partitionSettings;
    	      this.queryTimeout = defaults.queryTimeout;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.type = defaults.type;
        }

        public Builder additionalColumns(@Nullable Output<Object> additionalColumns) {
            this.additionalColumns = additionalColumns;
            return this;
        }
        public Builder additionalColumns(@Nullable Object additionalColumns) {
            this.additionalColumns = Codegen.ofNullable(additionalColumns);
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Output<Object> disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = Codegen.ofNullable(disableMetricsCollection);
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Output<Object> maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = Codegen.ofNullable(maxConcurrentConnections);
            return this;
        }
        public Builder oracleReaderQuery(@Nullable Output<Object> oracleReaderQuery) {
            this.oracleReaderQuery = oracleReaderQuery;
            return this;
        }
        public Builder oracleReaderQuery(@Nullable Object oracleReaderQuery) {
            this.oracleReaderQuery = Codegen.ofNullable(oracleReaderQuery);
            return this;
        }
        public Builder partitionOption(@Nullable Output<Object> partitionOption) {
            this.partitionOption = partitionOption;
            return this;
        }
        public Builder partitionOption(@Nullable Object partitionOption) {
            this.partitionOption = Codegen.ofNullable(partitionOption);
            return this;
        }
        public Builder partitionSettings(@Nullable Output<OraclePartitionSettingsArgs> partitionSettings) {
            this.partitionSettings = partitionSettings;
            return this;
        }
        public Builder partitionSettings(@Nullable OraclePartitionSettingsArgs partitionSettings) {
            this.partitionSettings = Codegen.ofNullable(partitionSettings);
            return this;
        }
        public Builder queryTimeout(@Nullable Output<Object> queryTimeout) {
            this.queryTimeout = queryTimeout;
            return this;
        }
        public Builder queryTimeout(@Nullable Object queryTimeout) {
            this.queryTimeout = Codegen.ofNullable(queryTimeout);
            return this;
        }
        public Builder sourceRetryCount(@Nullable Output<Object> sourceRetryCount) {
            this.sourceRetryCount = sourceRetryCount;
            return this;
        }
        public Builder sourceRetryCount(@Nullable Object sourceRetryCount) {
            this.sourceRetryCount = Codegen.ofNullable(sourceRetryCount);
            return this;
        }
        public Builder sourceRetryWait(@Nullable Output<Object> sourceRetryWait) {
            this.sourceRetryWait = sourceRetryWait;
            return this;
        }
        public Builder sourceRetryWait(@Nullable Object sourceRetryWait) {
            this.sourceRetryWait = Codegen.ofNullable(sourceRetryWait);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public OracleSourceArgs build() {
            return new OracleSourceArgs(additionalColumns, disableMetricsCollection, maxConcurrentConnections, oracleReaderQuery, partitionOption, partitionSettings, queryTimeout, sourceRetryCount, sourceRetryWait, type);
        }
    }
}
