// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes an Azure SQL database output data source.
 * 
 */
public final class AzureSqlDatabaseOutputDataSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureSqlDatabaseOutputDataSourceArgs Empty = new AzureSqlDatabaseOutputDataSourceArgs();

    /**
     * The name of the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="database")
      private final @Nullable Output<String> database;

    public Output<String> database() {
        return this.database == null ? Codegen.empty() : this.database;
    }

    /**
     * The password that will be used to connect to the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> password() {
        return this.password == null ? Codegen.empty() : this.password;
    }

    /**
     * The name of the SQL server containing the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="server")
      private final @Nullable Output<String> server;

    public Output<String> server() {
        return this.server == null ? Codegen.empty() : this.server;
    }

    /**
     * The name of the table in the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="table")
      private final @Nullable Output<String> table;

    public Output<String> table() {
        return this.table == null ? Codegen.empty() : this.table;
    }

    /**
     * Indicates the type of data source output will be written to. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Microsoft.Sql/Server/Database'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * The user name that will be used to connect to the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="user")
      private final @Nullable Output<String> user;

    public Output<String> user() {
        return this.user == null ? Codegen.empty() : this.user;
    }

    public AzureSqlDatabaseOutputDataSourceArgs(
        @Nullable Output<String> database,
        @Nullable Output<String> password,
        @Nullable Output<String> server,
        @Nullable Output<String> table,
        Output<String> type,
        @Nullable Output<String> user) {
        this.database = database;
        this.password = password;
        this.server = server;
        this.table = table;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.user = user;
    }

    private AzureSqlDatabaseOutputDataSourceArgs() {
        this.database = Codegen.empty();
        this.password = Codegen.empty();
        this.server = Codegen.empty();
        this.table = Codegen.empty();
        this.type = Codegen.empty();
        this.user = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureSqlDatabaseOutputDataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> database;
        private @Nullable Output<String> password;
        private @Nullable Output<String> server;
        private @Nullable Output<String> table;
        private Output<String> type;
        private @Nullable Output<String> user;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureSqlDatabaseOutputDataSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.password = defaults.password;
    	      this.server = defaults.server;
    	      this.table = defaults.table;
    	      this.type = defaults.type;
    	      this.user = defaults.user;
        }

        public Builder database(@Nullable Output<String> database) {
            this.database = database;
            return this;
        }
        public Builder database(@Nullable String database) {
            this.database = Codegen.ofNullable(database);
            return this;
        }
        public Builder password(@Nullable Output<String> password) {
            this.password = password;
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = Codegen.ofNullable(password);
            return this;
        }
        public Builder server(@Nullable Output<String> server) {
            this.server = server;
            return this;
        }
        public Builder server(@Nullable String server) {
            this.server = Codegen.ofNullable(server);
            return this;
        }
        public Builder table(@Nullable Output<String> table) {
            this.table = table;
            return this;
        }
        public Builder table(@Nullable String table) {
            this.table = Codegen.ofNullable(table);
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
        public Builder user(@Nullable Output<String> user) {
            this.user = user;
            return this;
        }
        public Builder user(@Nullable String user) {
            this.user = Codegen.ofNullable(user);
            return this;
        }        public AzureSqlDatabaseOutputDataSourceArgs build() {
            return new AzureSqlDatabaseOutputDataSourceArgs(database, password, server, table, type, user);
        }
    }
}
