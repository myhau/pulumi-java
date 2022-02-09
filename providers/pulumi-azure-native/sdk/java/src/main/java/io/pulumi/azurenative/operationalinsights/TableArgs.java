// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights;

import io.pulumi.azurenative.operationalinsights.enums.TablePlanEnum;
import io.pulumi.azurenative.operationalinsights.inputs.RestoredLogsArgs;
import io.pulumi.azurenative.operationalinsights.inputs.SchemaArgs;
import io.pulumi.azurenative.operationalinsights.inputs.SearchResultsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableArgs Empty = new TableArgs();

    @InputImport(name="plan")
    private final @Nullable Input<Either<String,TablePlanEnum>> plan;

    public Input<Either<String,TablePlanEnum>> getPlan() {
        return this.plan == null ? Input.empty() : this.plan;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="restoredLogs")
    private final @Nullable Input<RestoredLogsArgs> restoredLogs;

    public Input<RestoredLogsArgs> getRestoredLogs() {
        return this.restoredLogs == null ? Input.empty() : this.restoredLogs;
    }

    @InputImport(name="retentionInDays")
    private final @Nullable Input<Integer> retentionInDays;

    public Input<Integer> getRetentionInDays() {
        return this.retentionInDays == null ? Input.empty() : this.retentionInDays;
    }

    @InputImport(name="schema")
    private final @Nullable Input<SchemaArgs> schema;

    public Input<SchemaArgs> getSchema() {
        return this.schema == null ? Input.empty() : this.schema;
    }

    @InputImport(name="searchResults")
    private final @Nullable Input<SearchResultsArgs> searchResults;

    public Input<SearchResultsArgs> getSearchResults() {
        return this.searchResults == null ? Input.empty() : this.searchResults;
    }

    @InputImport(name="tableName")
    private final @Nullable Input<String> tableName;

    public Input<String> getTableName() {
        return this.tableName == null ? Input.empty() : this.tableName;
    }

    @InputImport(name="totalRetentionInDays")
    private final @Nullable Input<Integer> totalRetentionInDays;

    public Input<Integer> getTotalRetentionInDays() {
        return this.totalRetentionInDays == null ? Input.empty() : this.totalRetentionInDays;
    }

    @InputImport(name="workspaceName", required=true)
    private final Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public TableArgs(
        @Nullable Input<Either<String,TablePlanEnum>> plan,
        Input<String> resourceGroupName,
        @Nullable Input<RestoredLogsArgs> restoredLogs,
        @Nullable Input<Integer> retentionInDays,
        @Nullable Input<SchemaArgs> schema,
        @Nullable Input<SearchResultsArgs> searchResults,
        @Nullable Input<String> tableName,
        @Nullable Input<Integer> totalRetentionInDays,
        Input<String> workspaceName) {
        this.plan = plan;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.restoredLogs = restoredLogs;
        this.retentionInDays = retentionInDays;
        this.schema = schema;
        this.searchResults = searchResults;
        this.tableName = tableName;
        this.totalRetentionInDays = totalRetentionInDays;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private TableArgs() {
        this.plan = Input.empty();
        this.resourceGroupName = Input.empty();
        this.restoredLogs = Input.empty();
        this.retentionInDays = Input.empty();
        this.schema = Input.empty();
        this.searchResults = Input.empty();
        this.tableName = Input.empty();
        this.totalRetentionInDays = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,TablePlanEnum>> plan;
        private Input<String> resourceGroupName;
        private @Nullable Input<RestoredLogsArgs> restoredLogs;
        private @Nullable Input<Integer> retentionInDays;
        private @Nullable Input<SchemaArgs> schema;
        private @Nullable Input<SearchResultsArgs> searchResults;
        private @Nullable Input<String> tableName;
        private @Nullable Input<Integer> totalRetentionInDays;
        private Input<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(TableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.plan = defaults.plan;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.restoredLogs = defaults.restoredLogs;
    	      this.retentionInDays = defaults.retentionInDays;
    	      this.schema = defaults.schema;
    	      this.searchResults = defaults.searchResults;
    	      this.tableName = defaults.tableName;
    	      this.totalRetentionInDays = defaults.totalRetentionInDays;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setPlan(@Nullable Input<Either<String,TablePlanEnum>> plan) {
            this.plan = plan;
            return this;
        }

        public Builder setPlan(@Nullable Either<String,TablePlanEnum> plan) {
            this.plan = Input.ofNullable(plan);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setRestoredLogs(@Nullable Input<RestoredLogsArgs> restoredLogs) {
            this.restoredLogs = restoredLogs;
            return this;
        }

        public Builder setRestoredLogs(@Nullable RestoredLogsArgs restoredLogs) {
            this.restoredLogs = Input.ofNullable(restoredLogs);
            return this;
        }

        public Builder setRetentionInDays(@Nullable Input<Integer> retentionInDays) {
            this.retentionInDays = retentionInDays;
            return this;
        }

        public Builder setRetentionInDays(@Nullable Integer retentionInDays) {
            this.retentionInDays = Input.ofNullable(retentionInDays);
            return this;
        }

        public Builder setSchema(@Nullable Input<SchemaArgs> schema) {
            this.schema = schema;
            return this;
        }

        public Builder setSchema(@Nullable SchemaArgs schema) {
            this.schema = Input.ofNullable(schema);
            return this;
        }

        public Builder setSearchResults(@Nullable Input<SearchResultsArgs> searchResults) {
            this.searchResults = searchResults;
            return this;
        }

        public Builder setSearchResults(@Nullable SearchResultsArgs searchResults) {
            this.searchResults = Input.ofNullable(searchResults);
            return this;
        }

        public Builder setTableName(@Nullable Input<String> tableName) {
            this.tableName = tableName;
            return this;
        }

        public Builder setTableName(@Nullable String tableName) {
            this.tableName = Input.ofNullable(tableName);
            return this;
        }

        public Builder setTotalRetentionInDays(@Nullable Input<Integer> totalRetentionInDays) {
            this.totalRetentionInDays = totalRetentionInDays;
            return this;
        }

        public Builder setTotalRetentionInDays(@Nullable Integer totalRetentionInDays) {
            this.totalRetentionInDays = Input.ofNullable(totalRetentionInDays);
            return this;
        }

        public Builder setWorkspaceName(Input<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Input.of(Objects.requireNonNull(workspaceName));
            return this;
        }

        public TableArgs build() {
            return new TableArgs(plan, resourceGroupName, restoredLogs, retentionInDays, schema, searchResults, tableName, totalRetentionInDays, workspaceName);
        }
    }
}