// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class DataSourceParametersAuroraPostgresqlGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceParametersAuroraPostgresqlGetArgs Empty = new DataSourceParametersAuroraPostgresqlGetArgs();

    /**
     * The database to which to connect.
     * 
     */
    @InputImport(name="database", required=true)
      private final Input<String> database;

    public Input<String> getDatabase() {
        return this.database;
    }

    /**
     * The host to which to connect.
     * 
     */
    @InputImport(name="host", required=true)
      private final Input<String> host;

    public Input<String> getHost() {
        return this.host;
    }

    /**
     * The port to which to connect.
     * 
     */
    @InputImport(name="port", required=true)
      private final Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port;
    }

    public DataSourceParametersAuroraPostgresqlGetArgs(
        Input<String> database,
        Input<String> host,
        Input<Integer> port) {
        this.database = Objects.requireNonNull(database, "expected parameter 'database' to be non-null");
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
    }

    private DataSourceParametersAuroraPostgresqlGetArgs() {
        this.database = Input.empty();
        this.host = Input.empty();
        this.port = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParametersAuroraPostgresqlGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> database;
        private Input<String> host;
        private Input<Integer> port;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceParametersAuroraPostgresqlGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        public Builder setDatabase(Input<String> database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }

        public Builder setDatabase(String database) {
            this.database = Input.of(Objects.requireNonNull(database));
            return this;
        }

        public Builder setHost(Input<String> host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder setHost(String host) {
            this.host = Input.of(Objects.requireNonNull(host));
            return this;
        }

        public Builder setPort(Input<Integer> port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Input.of(Objects.requireNonNull(port));
            return this;
        }
        public DataSourceParametersAuroraPostgresqlGetArgs build() {
            return new DataSourceParametersAuroraPostgresqlGetArgs(database, host, port);
        }
    }
}
