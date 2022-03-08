// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MLTransformInputRecordTable {
    /**
     * A unique identifier for the AWS Glue Data Catalog.
     * 
     */
    private final @Nullable String catalogId;
    /**
     * The name of the connection to the AWS Glue Data Catalog.
     * 
     */
    private final @Nullable String connectionName;
    /**
     * A database name in the AWS Glue Data Catalog.
     * 
     */
    private final String databaseName;
    /**
     * A table name in the AWS Glue Data Catalog.
     * 
     */
    private final String tableName;

    @OutputCustomType.Constructor({"catalogId","connectionName","databaseName","tableName"})
    private MLTransformInputRecordTable(
        @Nullable String catalogId,
        @Nullable String connectionName,
        String databaseName,
        String tableName) {
        this.catalogId = catalogId;
        this.connectionName = connectionName;
        this.databaseName = databaseName;
        this.tableName = tableName;
    }

    /**
     * A unique identifier for the AWS Glue Data Catalog.
     * 
    */
    public Optional<String> getCatalogId() {
        return Optional.ofNullable(this.catalogId);
    }
    /**
     * The name of the connection to the AWS Glue Data Catalog.
     * 
    */
    public Optional<String> getConnectionName() {
        return Optional.ofNullable(this.connectionName);
    }
    /**
     * A database name in the AWS Glue Data Catalog.
     * 
    */
    public String getDatabaseName() {
        return this.databaseName;
    }
    /**
     * A table name in the AWS Glue Data Catalog.
     * 
    */
    public String getTableName() {
        return this.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MLTransformInputRecordTable defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String catalogId;
        private @Nullable String connectionName;
        private String databaseName;
        private String tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(MLTransformInputRecordTable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.connectionName = defaults.connectionName;
    	      this.databaseName = defaults.databaseName;
    	      this.tableName = defaults.tableName;
        }

        public Builder setCatalogId(@Nullable String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        public Builder setConnectionName(@Nullable String connectionName) {
            this.connectionName = connectionName;
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setTableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }
        public MLTransformInputRecordTable build() {
            return new MLTransformInputRecordTable(catalogId, connectionName, databaseName, tableName);
        }
    }
}
