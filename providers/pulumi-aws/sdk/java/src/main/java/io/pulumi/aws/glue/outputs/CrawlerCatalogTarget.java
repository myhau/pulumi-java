// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class CrawlerCatalogTarget {
    /**
     * The name of the Glue database to be synchronized.
     * 
     */
    private final String databaseName;
    /**
     * A list of catalog tables to be synchronized.
     * 
     */
    private final List<String> tables;

    @OutputCustomType.Constructor({"databaseName","tables"})
    private CrawlerCatalogTarget(
        String databaseName,
        List<String> tables) {
        this.databaseName = Objects.requireNonNull(databaseName);
        this.tables = Objects.requireNonNull(tables);
    }

    /**
     * The name of the Glue database to be synchronized.
     * 
     */
    public String getDatabaseName() {
        return this.databaseName;
    }
    /**
     * A list of catalog tables to be synchronized.
     * 
     */
    public List<String> getTables() {
        return this.tables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CrawlerCatalogTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String databaseName;
        private List<String> tables;

        public Builder() {
    	      // Empty
        }

        public Builder(CrawlerCatalogTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.tables = defaults.tables;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setTables(List<String> tables) {
            this.tables = Objects.requireNonNull(tables);
            return this;
        }
        public CrawlerCatalogTarget build() {
            return new CrawlerCatalogTarget(databaseName, tables);
        }
    }
}
