// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.datastream_v1.outputs.MysqlTableResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class MysqlDatabaseResponse {
    /**
     * Database name.
     * 
     */
    private final String database;
    /**
     * Tables in the database.
     * 
     */
    private final List<MysqlTableResponse> mysqlTables;

    @OutputCustomType.Constructor({"database","mysqlTables"})
    private MysqlDatabaseResponse(
        String database,
        List<MysqlTableResponse> mysqlTables) {
        this.database = database;
        this.mysqlTables = mysqlTables;
    }

    /**
     * Database name.
     * 
    */
    public String getDatabase() {
        return this.database;
    }
    /**
     * Tables in the database.
     * 
    */
    public List<MysqlTableResponse> getMysqlTables() {
        return this.mysqlTables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MysqlDatabaseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String database;
        private List<MysqlTableResponse> mysqlTables;

        public Builder() {
    	      // Empty
        }

        public Builder(MysqlDatabaseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.mysqlTables = defaults.mysqlTables;
        }

        public Builder setDatabase(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }

        public Builder setMysqlTables(List<MysqlTableResponse> mysqlTables) {
            this.mysqlTables = Objects.requireNonNull(mysqlTables);
            return this;
        }
        public MysqlDatabaseResponse build() {
            return new MysqlDatabaseResponse(database, mysqlTables);
        }
    }
}
