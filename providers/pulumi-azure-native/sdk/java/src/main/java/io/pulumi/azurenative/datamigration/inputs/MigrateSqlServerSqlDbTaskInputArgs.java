// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.MigrateSqlServerSqlDbDatabaseInputArgs;
import io.pulumi.azurenative.datamigration.inputs.MigrationValidationOptionsArgs;
import io.pulumi.azurenative.datamigration.inputs.SqlConnectionInfoArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MigrateSqlServerSqlDbTaskInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final MigrateSqlServerSqlDbTaskInputArgs Empty = new MigrateSqlServerSqlDbTaskInputArgs();

    @InputImport(name="selectedDatabases", required=true)
    private final Input<List<MigrateSqlServerSqlDbDatabaseInputArgs>> selectedDatabases;

    public Input<List<MigrateSqlServerSqlDbDatabaseInputArgs>> getSelectedDatabases() {
        return this.selectedDatabases;
    }

    @InputImport(name="sourceConnectionInfo", required=true)
    private final Input<SqlConnectionInfoArgs> sourceConnectionInfo;

    public Input<SqlConnectionInfoArgs> getSourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    @InputImport(name="targetConnectionInfo", required=true)
    private final Input<SqlConnectionInfoArgs> targetConnectionInfo;

    public Input<SqlConnectionInfoArgs> getTargetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    @InputImport(name="validationOptions")
    private final @Nullable Input<MigrationValidationOptionsArgs> validationOptions;

    public Input<MigrationValidationOptionsArgs> getValidationOptions() {
        return this.validationOptions == null ? Input.empty() : this.validationOptions;
    }

    public MigrateSqlServerSqlDbTaskInputArgs(
        Input<List<MigrateSqlServerSqlDbDatabaseInputArgs>> selectedDatabases,
        Input<SqlConnectionInfoArgs> sourceConnectionInfo,
        Input<SqlConnectionInfoArgs> targetConnectionInfo,
        @Nullable Input<MigrationValidationOptionsArgs> validationOptions) {
        this.selectedDatabases = Objects.requireNonNull(selectedDatabases, "expected parameter 'selectedDatabases' to be non-null");
        this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo, "expected parameter 'sourceConnectionInfo' to be non-null");
        this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo, "expected parameter 'targetConnectionInfo' to be non-null");
        this.validationOptions = validationOptions;
    }

    private MigrateSqlServerSqlDbTaskInputArgs() {
        this.selectedDatabases = Input.empty();
        this.sourceConnectionInfo = Input.empty();
        this.targetConnectionInfo = Input.empty();
        this.validationOptions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlDbTaskInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<MigrateSqlServerSqlDbDatabaseInputArgs>> selectedDatabases;
        private Input<SqlConnectionInfoArgs> sourceConnectionInfo;
        private Input<SqlConnectionInfoArgs> targetConnectionInfo;
        private @Nullable Input<MigrationValidationOptionsArgs> validationOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlDbTaskInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.selectedDatabases = defaults.selectedDatabases;
    	      this.sourceConnectionInfo = defaults.sourceConnectionInfo;
    	      this.targetConnectionInfo = defaults.targetConnectionInfo;
    	      this.validationOptions = defaults.validationOptions;
        }

        public Builder setSelectedDatabases(Input<List<MigrateSqlServerSqlDbDatabaseInputArgs>> selectedDatabases) {
            this.selectedDatabases = Objects.requireNonNull(selectedDatabases);
            return this;
        }

        public Builder setSelectedDatabases(List<MigrateSqlServerSqlDbDatabaseInputArgs> selectedDatabases) {
            this.selectedDatabases = Input.of(Objects.requireNonNull(selectedDatabases));
            return this;
        }

        public Builder setSourceConnectionInfo(Input<SqlConnectionInfoArgs> sourceConnectionInfo) {
            this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo);
            return this;
        }

        public Builder setSourceConnectionInfo(SqlConnectionInfoArgs sourceConnectionInfo) {
            this.sourceConnectionInfo = Input.of(Objects.requireNonNull(sourceConnectionInfo));
            return this;
        }

        public Builder setTargetConnectionInfo(Input<SqlConnectionInfoArgs> targetConnectionInfo) {
            this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
            return this;
        }

        public Builder setTargetConnectionInfo(SqlConnectionInfoArgs targetConnectionInfo) {
            this.targetConnectionInfo = Input.of(Objects.requireNonNull(targetConnectionInfo));
            return this;
        }

        public Builder setValidationOptions(@Nullable Input<MigrationValidationOptionsArgs> validationOptions) {
            this.validationOptions = validationOptions;
            return this;
        }

        public Builder setValidationOptions(@Nullable MigrationValidationOptionsArgs validationOptions) {
            this.validationOptions = Input.ofNullable(validationOptions);
            return this;
        }

        public MigrateSqlServerSqlDbTaskInputArgs build() {
            return new MigrateSqlServerSqlDbTaskInputArgs(selectedDatabases, sourceConnectionInfo, targetConnectionInfo, validationOptions);
        }
    }
}