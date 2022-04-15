// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.SqlPartitionSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.StoredProcedureParameterResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SqlMISourceResponse {
    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    private final @Nullable Object additionalColumns;
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object disableMetricsCollection;
    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object maxConcurrentConnections;
    /**
     * The partition mechanism that will be used for Sql read in parallel. Possible values include: "None", "PhysicalPartitionsOfTable", "DynamicRange".
     * 
     */
    private final @Nullable Object partitionOption;
    /**
     * The settings that will be leveraged for Sql source partitioning.
     * 
     */
    private final @Nullable SqlPartitionSettingsResponse partitionSettings;
    /**
     * Which additional types to produce.
     * 
     */
    private final @Nullable Object produceAdditionalTypes;
    /**
     * Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable Object queryTimeout;
    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object sourceRetryCount;
    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable Object sourceRetryWait;
    /**
     * SQL reader query. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object sqlReaderQuery;
    /**
     * Name of the stored procedure for a Azure SQL Managed Instance source. This cannot be used at the same time as SqlReaderQuery. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object sqlReaderStoredProcedureName;
    /**
     * Value and type setting for stored procedure parameters. Example: "{Parameter1: {value: "1", type: "int"}}".
     * 
     */
    private final @Nullable Map<String,StoredProcedureParameterResponse> storedProcedureParameters;
    /**
     * Copy source type.
     * Expected value is 'SqlMISource'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private SqlMISourceResponse(
        @CustomType.Parameter("additionalColumns") @Nullable Object additionalColumns,
        @CustomType.Parameter("disableMetricsCollection") @Nullable Object disableMetricsCollection,
        @CustomType.Parameter("maxConcurrentConnections") @Nullable Object maxConcurrentConnections,
        @CustomType.Parameter("partitionOption") @Nullable Object partitionOption,
        @CustomType.Parameter("partitionSettings") @Nullable SqlPartitionSettingsResponse partitionSettings,
        @CustomType.Parameter("produceAdditionalTypes") @Nullable Object produceAdditionalTypes,
        @CustomType.Parameter("queryTimeout") @Nullable Object queryTimeout,
        @CustomType.Parameter("sourceRetryCount") @Nullable Object sourceRetryCount,
        @CustomType.Parameter("sourceRetryWait") @Nullable Object sourceRetryWait,
        @CustomType.Parameter("sqlReaderQuery") @Nullable Object sqlReaderQuery,
        @CustomType.Parameter("sqlReaderStoredProcedureName") @Nullable Object sqlReaderStoredProcedureName,
        @CustomType.Parameter("storedProcedureParameters") @Nullable Map<String,StoredProcedureParameterResponse> storedProcedureParameters,
        @CustomType.Parameter("type") String type) {
        this.additionalColumns = additionalColumns;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.partitionOption = partitionOption;
        this.partitionSettings = partitionSettings;
        this.produceAdditionalTypes = produceAdditionalTypes;
        this.queryTimeout = queryTimeout;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.sqlReaderQuery = sqlReaderQuery;
        this.sqlReaderStoredProcedureName = sqlReaderStoredProcedureName;
        this.storedProcedureParameters = storedProcedureParameters;
        this.type = type;
    }

    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
    */
    public Optional<Object> additionalColumns() {
        return Optional.ofNullable(this.additionalColumns);
    }
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> disableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }
    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
    */
    public Optional<Object> maxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }
    /**
     * The partition mechanism that will be used for Sql read in parallel. Possible values include: "None", "PhysicalPartitionsOfTable", "DynamicRange".
     * 
    */
    public Optional<Object> partitionOption() {
        return Optional.ofNullable(this.partitionOption);
    }
    /**
     * The settings that will be leveraged for Sql source partitioning.
     * 
    */
    public Optional<SqlPartitionSettingsResponse> partitionSettings() {
        return Optional.ofNullable(this.partitionSettings);
    }
    /**
     * Which additional types to produce.
     * 
    */
    public Optional<Object> produceAdditionalTypes() {
        return Optional.ofNullable(this.produceAdditionalTypes);
    }
    /**
     * Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
    */
    public Optional<Object> queryTimeout() {
        return Optional.ofNullable(this.queryTimeout);
    }
    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
    */
    public Optional<Object> sourceRetryCount() {
        return Optional.ofNullable(this.sourceRetryCount);
    }
    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
    */
    public Optional<Object> sourceRetryWait() {
        return Optional.ofNullable(this.sourceRetryWait);
    }
    /**
     * SQL reader query. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> sqlReaderQuery() {
        return Optional.ofNullable(this.sqlReaderQuery);
    }
    /**
     * Name of the stored procedure for a Azure SQL Managed Instance source. This cannot be used at the same time as SqlReaderQuery. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> sqlReaderStoredProcedureName() {
        return Optional.ofNullable(this.sqlReaderStoredProcedureName);
    }
    /**
     * Value and type setting for stored procedure parameters. Example: "{Parameter1: {value: "1", type: "int"}}".
     * 
    */
    public Map<String,StoredProcedureParameterResponse> storedProcedureParameters() {
        return this.storedProcedureParameters == null ? Map.of() : this.storedProcedureParameters;
    }
    /**
     * Copy source type.
     * Expected value is 'SqlMISource'.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlMISourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object additionalColumns;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object partitionOption;
        private @Nullable SqlPartitionSettingsResponse partitionSettings;
        private @Nullable Object produceAdditionalTypes;
        private @Nullable Object queryTimeout;
        private @Nullable Object sourceRetryCount;
        private @Nullable Object sourceRetryWait;
        private @Nullable Object sqlReaderQuery;
        private @Nullable Object sqlReaderStoredProcedureName;
        private @Nullable Map<String,StoredProcedureParameterResponse> storedProcedureParameters;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlMISourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalColumns = defaults.additionalColumns;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.partitionOption = defaults.partitionOption;
    	      this.partitionSettings = defaults.partitionSettings;
    	      this.produceAdditionalTypes = defaults.produceAdditionalTypes;
    	      this.queryTimeout = defaults.queryTimeout;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.sqlReaderQuery = defaults.sqlReaderQuery;
    	      this.sqlReaderStoredProcedureName = defaults.sqlReaderStoredProcedureName;
    	      this.storedProcedureParameters = defaults.storedProcedureParameters;
    	      this.type = defaults.type;
        }

        public Builder additionalColumns(@Nullable Object additionalColumns) {
            this.additionalColumns = additionalColumns;
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }
        public Builder partitionOption(@Nullable Object partitionOption) {
            this.partitionOption = partitionOption;
            return this;
        }
        public Builder partitionSettings(@Nullable SqlPartitionSettingsResponse partitionSettings) {
            this.partitionSettings = partitionSettings;
            return this;
        }
        public Builder produceAdditionalTypes(@Nullable Object produceAdditionalTypes) {
            this.produceAdditionalTypes = produceAdditionalTypes;
            return this;
        }
        public Builder queryTimeout(@Nullable Object queryTimeout) {
            this.queryTimeout = queryTimeout;
            return this;
        }
        public Builder sourceRetryCount(@Nullable Object sourceRetryCount) {
            this.sourceRetryCount = sourceRetryCount;
            return this;
        }
        public Builder sourceRetryWait(@Nullable Object sourceRetryWait) {
            this.sourceRetryWait = sourceRetryWait;
            return this;
        }
        public Builder sqlReaderQuery(@Nullable Object sqlReaderQuery) {
            this.sqlReaderQuery = sqlReaderQuery;
            return this;
        }
        public Builder sqlReaderStoredProcedureName(@Nullable Object sqlReaderStoredProcedureName) {
            this.sqlReaderStoredProcedureName = sqlReaderStoredProcedureName;
            return this;
        }
        public Builder storedProcedureParameters(@Nullable Map<String,StoredProcedureParameterResponse> storedProcedureParameters) {
            this.storedProcedureParameters = storedProcedureParameters;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public SqlMISourceResponse build() {
            return new SqlMISourceResponse(additionalColumns, disableMetricsCollection, maxConcurrentConnections, partitionOption, partitionSettings, produceAdditionalTypes, queryTimeout, sourceRetryCount, sourceRetryWait, sqlReaderQuery, sqlReaderStoredProcedureName, storedProcedureParameters, type);
        }
    }
}
