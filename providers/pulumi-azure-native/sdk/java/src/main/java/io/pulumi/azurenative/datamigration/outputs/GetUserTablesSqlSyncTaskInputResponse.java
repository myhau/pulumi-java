// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.SqlConnectionInfoResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetUserTablesSqlSyncTaskInputResponse {
    /**
     * List of source database names to collect tables for
     * 
     */
    private final List<String> selectedSourceDatabases;
    /**
     * List of target database names to collect tables for
     * 
     */
    private final List<String> selectedTargetDatabases;
    /**
     * Connection information for SQL Server
     * 
     */
    private final SqlConnectionInfoResponse sourceConnectionInfo;
    /**
     * Connection information for SQL DB
     * 
     */
    private final SqlConnectionInfoResponse targetConnectionInfo;

    @CustomType.Constructor
    private GetUserTablesSqlSyncTaskInputResponse(
        @CustomType.Parameter("selectedSourceDatabases") List<String> selectedSourceDatabases,
        @CustomType.Parameter("selectedTargetDatabases") List<String> selectedTargetDatabases,
        @CustomType.Parameter("sourceConnectionInfo") SqlConnectionInfoResponse sourceConnectionInfo,
        @CustomType.Parameter("targetConnectionInfo") SqlConnectionInfoResponse targetConnectionInfo) {
        this.selectedSourceDatabases = selectedSourceDatabases;
        this.selectedTargetDatabases = selectedTargetDatabases;
        this.sourceConnectionInfo = sourceConnectionInfo;
        this.targetConnectionInfo = targetConnectionInfo;
    }

    /**
     * List of source database names to collect tables for
     * 
    */
    public List<String> selectedSourceDatabases() {
        return this.selectedSourceDatabases;
    }
    /**
     * List of target database names to collect tables for
     * 
    */
    public List<String> selectedTargetDatabases() {
        return this.selectedTargetDatabases;
    }
    /**
     * Connection information for SQL Server
     * 
    */
    public SqlConnectionInfoResponse sourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }
    /**
     * Connection information for SQL DB
     * 
    */
    public SqlConnectionInfoResponse targetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserTablesSqlSyncTaskInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> selectedSourceDatabases;
        private List<String> selectedTargetDatabases;
        private SqlConnectionInfoResponse sourceConnectionInfo;
        private SqlConnectionInfoResponse targetConnectionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserTablesSqlSyncTaskInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.selectedSourceDatabases = defaults.selectedSourceDatabases;
    	      this.selectedTargetDatabases = defaults.selectedTargetDatabases;
    	      this.sourceConnectionInfo = defaults.sourceConnectionInfo;
    	      this.targetConnectionInfo = defaults.targetConnectionInfo;
        }

        public Builder selectedSourceDatabases(List<String> selectedSourceDatabases) {
            this.selectedSourceDatabases = Objects.requireNonNull(selectedSourceDatabases);
            return this;
        }
        public Builder selectedSourceDatabases(String... selectedSourceDatabases) {
            return selectedSourceDatabases(List.of(selectedSourceDatabases));
        }
        public Builder selectedTargetDatabases(List<String> selectedTargetDatabases) {
            this.selectedTargetDatabases = Objects.requireNonNull(selectedTargetDatabases);
            return this;
        }
        public Builder selectedTargetDatabases(String... selectedTargetDatabases) {
            return selectedTargetDatabases(List.of(selectedTargetDatabases));
        }
        public Builder sourceConnectionInfo(SqlConnectionInfoResponse sourceConnectionInfo) {
            this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo);
            return this;
        }
        public Builder targetConnectionInfo(SqlConnectionInfoResponse targetConnectionInfo) {
            this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
            return this;
        }        public GetUserTablesSqlSyncTaskInputResponse build() {
            return new GetUserTablesSqlSyncTaskInputResponse(selectedSourceDatabases, selectedTargetDatabases, sourceConnectionInfo, targetConnectionInfo);
        }
    }
}
