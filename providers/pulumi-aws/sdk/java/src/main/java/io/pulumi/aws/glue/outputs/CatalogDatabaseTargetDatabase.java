// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CatalogDatabaseTargetDatabase {
    /**
     * ID of the Data Catalog in which the database resides.
     * 
     */
    private final String catalogId;
    /**
     * Name of the catalog database.
     * 
     */
    private final String databaseName;

    @OutputCustomType.Constructor({"catalogId","databaseName"})
    private CatalogDatabaseTargetDatabase(
        String catalogId,
        String databaseName) {
        this.catalogId = Objects.requireNonNull(catalogId);
        this.databaseName = Objects.requireNonNull(databaseName);
    }

    /**
     * ID of the Data Catalog in which the database resides.
     * 
     */
    public String getCatalogId() {
        return this.catalogId;
    }
    /**
     * Name of the catalog database.
     * 
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CatalogDatabaseTargetDatabase defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String catalogId;
        private String databaseName;

        public Builder() {
    	      // Empty
        }

        public Builder(CatalogDatabaseTargetDatabase defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.databaseName = defaults.databaseName;
        }

        public Builder setCatalogId(String catalogId) {
            this.catalogId = Objects.requireNonNull(catalogId);
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        public CatalogDatabaseTargetDatabase build() {
            return new CatalogDatabaseTargetDatabase(catalogId, databaseName);
        }
    }
}
