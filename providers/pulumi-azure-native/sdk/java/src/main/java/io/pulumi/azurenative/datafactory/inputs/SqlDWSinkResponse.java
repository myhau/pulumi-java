// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.DWCopyCommandSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.PolybaseSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.SqlDWUpsertSettingsResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity SQL Data Warehouse sink.
 * 
 */
public final class SqlDWSinkResponse extends io.pulumi.resources.InvokeArgs {

    public static final SqlDWSinkResponse Empty = new SqlDWSinkResponse();

    /**
     * Indicates to use Copy Command to copy data into SQL Data Warehouse. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="allowCopyCommand")
      private final @Nullable Object allowCopyCommand;

    public Optional<Object> allowCopyCommand() {
        return this.allowCopyCommand == null ? Optional.empty() : Optional.ofNullable(this.allowCopyCommand);
    }

    /**
     * Indicates to use PolyBase to copy data into SQL Data Warehouse when applicable. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="allowPolyBase")
      private final @Nullable Object allowPolyBase;

    public Optional<Object> allowPolyBase() {
        return this.allowPolyBase == null ? Optional.empty() : Optional.ofNullable(this.allowPolyBase);
    }

    /**
     * Specifies Copy Command related settings when allowCopyCommand is true.
     * 
     */
    @Import(name="copyCommandSettings")
      private final @Nullable DWCopyCommandSettingsResponse copyCommandSettings;

    public Optional<DWCopyCommandSettingsResponse> copyCommandSettings() {
        return this.copyCommandSettings == null ? Optional.empty() : Optional.ofNullable(this.copyCommandSettings);
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
      private final @Nullable Object disableMetricsCollection;

    public Optional<Object> disableMetricsCollection() {
        return this.disableMetricsCollection == null ? Optional.empty() : Optional.ofNullable(this.disableMetricsCollection);
    }

    /**
     * The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
      private final @Nullable Object maxConcurrentConnections;

    public Optional<Object> maxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Optional.empty() : Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * Specifies PolyBase-related settings when allowPolyBase is true.
     * 
     */
    @Import(name="polyBaseSettings")
      private final @Nullable PolybaseSettingsResponse polyBaseSettings;

    public Optional<PolybaseSettingsResponse> polyBaseSettings() {
        return this.polyBaseSettings == null ? Optional.empty() : Optional.ofNullable(this.polyBaseSettings);
    }

    /**
     * SQL pre-copy script. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="preCopyScript")
      private final @Nullable Object preCopyScript;

    public Optional<Object> preCopyScript() {
        return this.preCopyScript == null ? Optional.empty() : Optional.ofNullable(this.preCopyScript);
    }

    /**
     * Sink retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sinkRetryCount")
      private final @Nullable Object sinkRetryCount;

    public Optional<Object> sinkRetryCount() {
        return this.sinkRetryCount == null ? Optional.empty() : Optional.ofNullable(this.sinkRetryCount);
    }

    /**
     * Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sinkRetryWait")
      private final @Nullable Object sinkRetryWait;

    public Optional<Object> sinkRetryWait() {
        return this.sinkRetryWait == null ? Optional.empty() : Optional.ofNullable(this.sinkRetryWait);
    }

    /**
     * Whether to use table lock during bulk copy. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="sqlWriterUseTableLock")
      private final @Nullable Object sqlWriterUseTableLock;

    public Optional<Object> sqlWriterUseTableLock() {
        return this.sqlWriterUseTableLock == null ? Optional.empty() : Optional.ofNullable(this.sqlWriterUseTableLock);
    }

    /**
     * The option to handle sink table, such as autoCreate. For now only 'autoCreate' value is supported. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="tableOption")
      private final @Nullable Object tableOption;

    public Optional<Object> tableOption() {
        return this.tableOption == null ? Optional.empty() : Optional.ofNullable(this.tableOption);
    }

    /**
     * Copy sink type.
     * Expected value is 'SqlDWSink'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    /**
     * SQL DW upsert settings.
     * 
     */
    @Import(name="upsertSettings")
      private final @Nullable SqlDWUpsertSettingsResponse upsertSettings;

    public Optional<SqlDWUpsertSettingsResponse> upsertSettings() {
        return this.upsertSettings == null ? Optional.empty() : Optional.ofNullable(this.upsertSettings);
    }

    /**
     * Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @Import(name="writeBatchSize")
      private final @Nullable Object writeBatchSize;

    public Optional<Object> writeBatchSize() {
        return this.writeBatchSize == null ? Optional.empty() : Optional.ofNullable(this.writeBatchSize);
    }

    /**
     * Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="writeBatchTimeout")
      private final @Nullable Object writeBatchTimeout;

    public Optional<Object> writeBatchTimeout() {
        return this.writeBatchTimeout == null ? Optional.empty() : Optional.ofNullable(this.writeBatchTimeout);
    }

    /**
     * Write behavior when copying data into azure SQL DW. Type: SqlDWWriteBehaviorEnum (or Expression with resultType SqlDWWriteBehaviorEnum)
     * 
     */
    @Import(name="writeBehavior")
      private final @Nullable Object writeBehavior;

    public Optional<Object> writeBehavior() {
        return this.writeBehavior == null ? Optional.empty() : Optional.ofNullable(this.writeBehavior);
    }

    public SqlDWSinkResponse(
        @Nullable Object allowCopyCommand,
        @Nullable Object allowPolyBase,
        @Nullable DWCopyCommandSettingsResponse copyCommandSettings,
        @Nullable Object disableMetricsCollection,
        @Nullable Object maxConcurrentConnections,
        @Nullable PolybaseSettingsResponse polyBaseSettings,
        @Nullable Object preCopyScript,
        @Nullable Object sinkRetryCount,
        @Nullable Object sinkRetryWait,
        @Nullable Object sqlWriterUseTableLock,
        @Nullable Object tableOption,
        String type,
        @Nullable SqlDWUpsertSettingsResponse upsertSettings,
        @Nullable Object writeBatchSize,
        @Nullable Object writeBatchTimeout,
        @Nullable Object writeBehavior) {
        this.allowCopyCommand = allowCopyCommand;
        this.allowPolyBase = allowPolyBase;
        this.copyCommandSettings = copyCommandSettings;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.polyBaseSettings = polyBaseSettings;
        this.preCopyScript = preCopyScript;
        this.sinkRetryCount = sinkRetryCount;
        this.sinkRetryWait = sinkRetryWait;
        this.sqlWriterUseTableLock = sqlWriterUseTableLock;
        this.tableOption = tableOption;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.upsertSettings = upsertSettings;
        this.writeBatchSize = writeBatchSize;
        this.writeBatchTimeout = writeBatchTimeout;
        this.writeBehavior = writeBehavior;
    }

    private SqlDWSinkResponse() {
        this.allowCopyCommand = null;
        this.allowPolyBase = null;
        this.copyCommandSettings = null;
        this.disableMetricsCollection = null;
        this.maxConcurrentConnections = null;
        this.polyBaseSettings = null;
        this.preCopyScript = null;
        this.sinkRetryCount = null;
        this.sinkRetryWait = null;
        this.sqlWriterUseTableLock = null;
        this.tableOption = null;
        this.type = null;
        this.upsertSettings = null;
        this.writeBatchSize = null;
        this.writeBatchTimeout = null;
        this.writeBehavior = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlDWSinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object allowCopyCommand;
        private @Nullable Object allowPolyBase;
        private @Nullable DWCopyCommandSettingsResponse copyCommandSettings;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable PolybaseSettingsResponse polyBaseSettings;
        private @Nullable Object preCopyScript;
        private @Nullable Object sinkRetryCount;
        private @Nullable Object sinkRetryWait;
        private @Nullable Object sqlWriterUseTableLock;
        private @Nullable Object tableOption;
        private String type;
        private @Nullable SqlDWUpsertSettingsResponse upsertSettings;
        private @Nullable Object writeBatchSize;
        private @Nullable Object writeBatchTimeout;
        private @Nullable Object writeBehavior;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlDWSinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowCopyCommand = defaults.allowCopyCommand;
    	      this.allowPolyBase = defaults.allowPolyBase;
    	      this.copyCommandSettings = defaults.copyCommandSettings;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.polyBaseSettings = defaults.polyBaseSettings;
    	      this.preCopyScript = defaults.preCopyScript;
    	      this.sinkRetryCount = defaults.sinkRetryCount;
    	      this.sinkRetryWait = defaults.sinkRetryWait;
    	      this.sqlWriterUseTableLock = defaults.sqlWriterUseTableLock;
    	      this.tableOption = defaults.tableOption;
    	      this.type = defaults.type;
    	      this.upsertSettings = defaults.upsertSettings;
    	      this.writeBatchSize = defaults.writeBatchSize;
    	      this.writeBatchTimeout = defaults.writeBatchTimeout;
    	      this.writeBehavior = defaults.writeBehavior;
        }

        public Builder allowCopyCommand(@Nullable Object allowCopyCommand) {
            this.allowCopyCommand = allowCopyCommand;
            return this;
        }
        public Builder allowPolyBase(@Nullable Object allowPolyBase) {
            this.allowPolyBase = allowPolyBase;
            return this;
        }
        public Builder copyCommandSettings(@Nullable DWCopyCommandSettingsResponse copyCommandSettings) {
            this.copyCommandSettings = copyCommandSettings;
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
        public Builder polyBaseSettings(@Nullable PolybaseSettingsResponse polyBaseSettings) {
            this.polyBaseSettings = polyBaseSettings;
            return this;
        }
        public Builder preCopyScript(@Nullable Object preCopyScript) {
            this.preCopyScript = preCopyScript;
            return this;
        }
        public Builder sinkRetryCount(@Nullable Object sinkRetryCount) {
            this.sinkRetryCount = sinkRetryCount;
            return this;
        }
        public Builder sinkRetryWait(@Nullable Object sinkRetryWait) {
            this.sinkRetryWait = sinkRetryWait;
            return this;
        }
        public Builder sqlWriterUseTableLock(@Nullable Object sqlWriterUseTableLock) {
            this.sqlWriterUseTableLock = sqlWriterUseTableLock;
            return this;
        }
        public Builder tableOption(@Nullable Object tableOption) {
            this.tableOption = tableOption;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder upsertSettings(@Nullable SqlDWUpsertSettingsResponse upsertSettings) {
            this.upsertSettings = upsertSettings;
            return this;
        }
        public Builder writeBatchSize(@Nullable Object writeBatchSize) {
            this.writeBatchSize = writeBatchSize;
            return this;
        }
        public Builder writeBatchTimeout(@Nullable Object writeBatchTimeout) {
            this.writeBatchTimeout = writeBatchTimeout;
            return this;
        }
        public Builder writeBehavior(@Nullable Object writeBehavior) {
            this.writeBehavior = writeBehavior;
            return this;
        }        public SqlDWSinkResponse build() {
            return new SqlDWSinkResponse(allowCopyCommand, allowPolyBase, copyCommandSettings, disableMetricsCollection, maxConcurrentConnections, polyBaseSettings, preCopyScript, sinkRetryCount, sinkRetryWait, sqlWriterUseTableLock, tableOption, type, upsertSettings, writeBatchSize, writeBatchTimeout, writeBehavior);
        }
    }
}
