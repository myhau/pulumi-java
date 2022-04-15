// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.DWCopyCommandSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.PolybaseSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.SqlDWUpsertSettingsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A copy activity SQL Data Warehouse sink.
 * 
 */
public final class SqlDWSinkArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlDWSinkArgs Empty = new SqlDWSinkArgs();

    /**
     * Indicates to use Copy Command to copy data into SQL Data Warehouse. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="allowCopyCommand")
      private final @Nullable Output<Object> allowCopyCommand;

    public Output<Object> allowCopyCommand() {
        return this.allowCopyCommand == null ? Codegen.empty() : this.allowCopyCommand;
    }

    /**
     * Indicates to use PolyBase to copy data into SQL Data Warehouse when applicable. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="allowPolyBase")
      private final @Nullable Output<Object> allowPolyBase;

    public Output<Object> allowPolyBase() {
        return this.allowPolyBase == null ? Codegen.empty() : this.allowPolyBase;
    }

    /**
     * Specifies Copy Command related settings when allowCopyCommand is true.
     * 
     */
    @Import(name="copyCommandSettings")
      private final @Nullable Output<DWCopyCommandSettingsArgs> copyCommandSettings;

    public Output<DWCopyCommandSettingsArgs> copyCommandSettings() {
        return this.copyCommandSettings == null ? Codegen.empty() : this.copyCommandSettings;
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
     * The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
      private final @Nullable Output<Object> maxConcurrentConnections;

    public Output<Object> maxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Codegen.empty() : this.maxConcurrentConnections;
    }

    /**
     * Specifies PolyBase-related settings when allowPolyBase is true.
     * 
     */
    @Import(name="polyBaseSettings")
      private final @Nullable Output<PolybaseSettingsArgs> polyBaseSettings;

    public Output<PolybaseSettingsArgs> polyBaseSettings() {
        return this.polyBaseSettings == null ? Codegen.empty() : this.polyBaseSettings;
    }

    /**
     * SQL pre-copy script. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="preCopyScript")
      private final @Nullable Output<Object> preCopyScript;

    public Output<Object> preCopyScript() {
        return this.preCopyScript == null ? Codegen.empty() : this.preCopyScript;
    }

    /**
     * Sink retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sinkRetryCount")
      private final @Nullable Output<Object> sinkRetryCount;

    public Output<Object> sinkRetryCount() {
        return this.sinkRetryCount == null ? Codegen.empty() : this.sinkRetryCount;
    }

    /**
     * Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sinkRetryWait")
      private final @Nullable Output<Object> sinkRetryWait;

    public Output<Object> sinkRetryWait() {
        return this.sinkRetryWait == null ? Codegen.empty() : this.sinkRetryWait;
    }

    /**
     * Whether to use table lock during bulk copy. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="sqlWriterUseTableLock")
      private final @Nullable Output<Object> sqlWriterUseTableLock;

    public Output<Object> sqlWriterUseTableLock() {
        return this.sqlWriterUseTableLock == null ? Codegen.empty() : this.sqlWriterUseTableLock;
    }

    /**
     * The option to handle sink table, such as autoCreate. For now only 'autoCreate' value is supported. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="tableOption")
      private final @Nullable Output<Object> tableOption;

    public Output<Object> tableOption() {
        return this.tableOption == null ? Codegen.empty() : this.tableOption;
    }

    /**
     * Copy sink type.
     * Expected value is 'SqlDWSink'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * SQL DW upsert settings.
     * 
     */
    @Import(name="upsertSettings")
      private final @Nullable Output<SqlDWUpsertSettingsArgs> upsertSettings;

    public Output<SqlDWUpsertSettingsArgs> upsertSettings() {
        return this.upsertSettings == null ? Codegen.empty() : this.upsertSettings;
    }

    /**
     * Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @Import(name="writeBatchSize")
      private final @Nullable Output<Object> writeBatchSize;

    public Output<Object> writeBatchSize() {
        return this.writeBatchSize == null ? Codegen.empty() : this.writeBatchSize;
    }

    /**
     * Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="writeBatchTimeout")
      private final @Nullable Output<Object> writeBatchTimeout;

    public Output<Object> writeBatchTimeout() {
        return this.writeBatchTimeout == null ? Codegen.empty() : this.writeBatchTimeout;
    }

    /**
     * Write behavior when copying data into azure SQL DW. Type: SqlDWWriteBehaviorEnum (or Expression with resultType SqlDWWriteBehaviorEnum)
     * 
     */
    @Import(name="writeBehavior")
      private final @Nullable Output<Object> writeBehavior;

    public Output<Object> writeBehavior() {
        return this.writeBehavior == null ? Codegen.empty() : this.writeBehavior;
    }

    public SqlDWSinkArgs(
        @Nullable Output<Object> allowCopyCommand,
        @Nullable Output<Object> allowPolyBase,
        @Nullable Output<DWCopyCommandSettingsArgs> copyCommandSettings,
        @Nullable Output<Object> disableMetricsCollection,
        @Nullable Output<Object> maxConcurrentConnections,
        @Nullable Output<PolybaseSettingsArgs> polyBaseSettings,
        @Nullable Output<Object> preCopyScript,
        @Nullable Output<Object> sinkRetryCount,
        @Nullable Output<Object> sinkRetryWait,
        @Nullable Output<Object> sqlWriterUseTableLock,
        @Nullable Output<Object> tableOption,
        Output<String> type,
        @Nullable Output<SqlDWUpsertSettingsArgs> upsertSettings,
        @Nullable Output<Object> writeBatchSize,
        @Nullable Output<Object> writeBatchTimeout,
        @Nullable Output<Object> writeBehavior) {
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

    private SqlDWSinkArgs() {
        this.allowCopyCommand = Codegen.empty();
        this.allowPolyBase = Codegen.empty();
        this.copyCommandSettings = Codegen.empty();
        this.disableMetricsCollection = Codegen.empty();
        this.maxConcurrentConnections = Codegen.empty();
        this.polyBaseSettings = Codegen.empty();
        this.preCopyScript = Codegen.empty();
        this.sinkRetryCount = Codegen.empty();
        this.sinkRetryWait = Codegen.empty();
        this.sqlWriterUseTableLock = Codegen.empty();
        this.tableOption = Codegen.empty();
        this.type = Codegen.empty();
        this.upsertSettings = Codegen.empty();
        this.writeBatchSize = Codegen.empty();
        this.writeBatchTimeout = Codegen.empty();
        this.writeBehavior = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlDWSinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> allowCopyCommand;
        private @Nullable Output<Object> allowPolyBase;
        private @Nullable Output<DWCopyCommandSettingsArgs> copyCommandSettings;
        private @Nullable Output<Object> disableMetricsCollection;
        private @Nullable Output<Object> maxConcurrentConnections;
        private @Nullable Output<PolybaseSettingsArgs> polyBaseSettings;
        private @Nullable Output<Object> preCopyScript;
        private @Nullable Output<Object> sinkRetryCount;
        private @Nullable Output<Object> sinkRetryWait;
        private @Nullable Output<Object> sqlWriterUseTableLock;
        private @Nullable Output<Object> tableOption;
        private Output<String> type;
        private @Nullable Output<SqlDWUpsertSettingsArgs> upsertSettings;
        private @Nullable Output<Object> writeBatchSize;
        private @Nullable Output<Object> writeBatchTimeout;
        private @Nullable Output<Object> writeBehavior;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlDWSinkArgs defaults) {
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

        public Builder allowCopyCommand(@Nullable Output<Object> allowCopyCommand) {
            this.allowCopyCommand = allowCopyCommand;
            return this;
        }
        public Builder allowCopyCommand(@Nullable Object allowCopyCommand) {
            this.allowCopyCommand = Codegen.ofNullable(allowCopyCommand);
            return this;
        }
        public Builder allowPolyBase(@Nullable Output<Object> allowPolyBase) {
            this.allowPolyBase = allowPolyBase;
            return this;
        }
        public Builder allowPolyBase(@Nullable Object allowPolyBase) {
            this.allowPolyBase = Codegen.ofNullable(allowPolyBase);
            return this;
        }
        public Builder copyCommandSettings(@Nullable Output<DWCopyCommandSettingsArgs> copyCommandSettings) {
            this.copyCommandSettings = copyCommandSettings;
            return this;
        }
        public Builder copyCommandSettings(@Nullable DWCopyCommandSettingsArgs copyCommandSettings) {
            this.copyCommandSettings = Codegen.ofNullable(copyCommandSettings);
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
        public Builder polyBaseSettings(@Nullable Output<PolybaseSettingsArgs> polyBaseSettings) {
            this.polyBaseSettings = polyBaseSettings;
            return this;
        }
        public Builder polyBaseSettings(@Nullable PolybaseSettingsArgs polyBaseSettings) {
            this.polyBaseSettings = Codegen.ofNullable(polyBaseSettings);
            return this;
        }
        public Builder preCopyScript(@Nullable Output<Object> preCopyScript) {
            this.preCopyScript = preCopyScript;
            return this;
        }
        public Builder preCopyScript(@Nullable Object preCopyScript) {
            this.preCopyScript = Codegen.ofNullable(preCopyScript);
            return this;
        }
        public Builder sinkRetryCount(@Nullable Output<Object> sinkRetryCount) {
            this.sinkRetryCount = sinkRetryCount;
            return this;
        }
        public Builder sinkRetryCount(@Nullable Object sinkRetryCount) {
            this.sinkRetryCount = Codegen.ofNullable(sinkRetryCount);
            return this;
        }
        public Builder sinkRetryWait(@Nullable Output<Object> sinkRetryWait) {
            this.sinkRetryWait = sinkRetryWait;
            return this;
        }
        public Builder sinkRetryWait(@Nullable Object sinkRetryWait) {
            this.sinkRetryWait = Codegen.ofNullable(sinkRetryWait);
            return this;
        }
        public Builder sqlWriterUseTableLock(@Nullable Output<Object> sqlWriterUseTableLock) {
            this.sqlWriterUseTableLock = sqlWriterUseTableLock;
            return this;
        }
        public Builder sqlWriterUseTableLock(@Nullable Object sqlWriterUseTableLock) {
            this.sqlWriterUseTableLock = Codegen.ofNullable(sqlWriterUseTableLock);
            return this;
        }
        public Builder tableOption(@Nullable Output<Object> tableOption) {
            this.tableOption = tableOption;
            return this;
        }
        public Builder tableOption(@Nullable Object tableOption) {
            this.tableOption = Codegen.ofNullable(tableOption);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder upsertSettings(@Nullable Output<SqlDWUpsertSettingsArgs> upsertSettings) {
            this.upsertSettings = upsertSettings;
            return this;
        }
        public Builder upsertSettings(@Nullable SqlDWUpsertSettingsArgs upsertSettings) {
            this.upsertSettings = Codegen.ofNullable(upsertSettings);
            return this;
        }
        public Builder writeBatchSize(@Nullable Output<Object> writeBatchSize) {
            this.writeBatchSize = writeBatchSize;
            return this;
        }
        public Builder writeBatchSize(@Nullable Object writeBatchSize) {
            this.writeBatchSize = Codegen.ofNullable(writeBatchSize);
            return this;
        }
        public Builder writeBatchTimeout(@Nullable Output<Object> writeBatchTimeout) {
            this.writeBatchTimeout = writeBatchTimeout;
            return this;
        }
        public Builder writeBatchTimeout(@Nullable Object writeBatchTimeout) {
            this.writeBatchTimeout = Codegen.ofNullable(writeBatchTimeout);
            return this;
        }
        public Builder writeBehavior(@Nullable Output<Object> writeBehavior) {
            this.writeBehavior = writeBehavior;
            return this;
        }
        public Builder writeBehavior(@Nullable Object writeBehavior) {
            this.writeBehavior = Codegen.ofNullable(writeBehavior);
            return this;
        }        public SqlDWSinkArgs build() {
            return new SqlDWSinkArgs(allowCopyCommand, allowPolyBase, copyCommandSettings, disableMetricsCollection, maxConcurrentConnections, polyBaseSettings, preCopyScript, sinkRetryCount, sinkRetryWait, sqlWriterUseTableLock, tableOption, type, upsertSettings, writeBatchSize, writeBatchTimeout, writeBehavior);
        }
    }
}
