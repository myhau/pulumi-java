// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProxyDefaultTargetGroupConnectionPoolConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProxyDefaultTargetGroupConnectionPoolConfigGetArgs Empty = new ProxyDefaultTargetGroupConnectionPoolConfigGetArgs();

    /**
     * The number of seconds for a proxy to wait for a connection to become available in the connection pool. Only applies when the proxy has opened its maximum number of connections and all connections are busy with client sessions.
     * 
     */
    @InputImport(name="connectionBorrowTimeout")
      private final @Nullable Input<Integer> connectionBorrowTimeout;

    public Input<Integer> getConnectionBorrowTimeout() {
        return this.connectionBorrowTimeout == null ? Input.empty() : this.connectionBorrowTimeout;
    }

    /**
     * One or more SQL statements for the proxy to run when opening each new database connection. Typically used with `SET` statements to make sure that each connection has identical settings such as time zone and character set. This setting is empty by default. For multiple statements, use semicolons as the separator. You can also include multiple variables in a single `SET` statement, such as `SET x=1, y=2`.
     * 
     */
    @InputImport(name="initQuery")
      private final @Nullable Input<String> initQuery;

    public Input<String> getInitQuery() {
        return this.initQuery == null ? Input.empty() : this.initQuery;
    }

    /**
     * The maximum size of the connection pool for each target in a target group. For Aurora MySQL, it is expressed as a percentage of the max_connections setting for the RDS DB instance or Aurora DB cluster used by the target group.
     * 
     */
    @InputImport(name="maxConnectionsPercent")
      private final @Nullable Input<Integer> maxConnectionsPercent;

    public Input<Integer> getMaxConnectionsPercent() {
        return this.maxConnectionsPercent == null ? Input.empty() : this.maxConnectionsPercent;
    }

    /**
     * Controls how actively the proxy closes idle database connections in the connection pool. A high value enables the proxy to leave a high percentage of idle connections open. A low value causes the proxy to close idle client connections and return the underlying database connections to the connection pool. For Aurora MySQL, it is expressed as a percentage of the max_connections setting for the RDS DB instance or Aurora DB cluster used by the target group.
     * 
     */
    @InputImport(name="maxIdleConnectionsPercent")
      private final @Nullable Input<Integer> maxIdleConnectionsPercent;

    public Input<Integer> getMaxIdleConnectionsPercent() {
        return this.maxIdleConnectionsPercent == null ? Input.empty() : this.maxIdleConnectionsPercent;
    }

    /**
     * Each item in the list represents a class of SQL operations that normally cause all later statements in a session using a proxy to be pinned to the same underlying database connection. Including an item in the list exempts that class of SQL operations from the pinning behavior. Currently, the only allowed value is `EXCLUDE_VARIABLE_SETS`.
     * 
     */
    @InputImport(name="sessionPinningFilters")
      private final @Nullable Input<List<String>> sessionPinningFilters;

    public Input<List<String>> getSessionPinningFilters() {
        return this.sessionPinningFilters == null ? Input.empty() : this.sessionPinningFilters;
    }

    public ProxyDefaultTargetGroupConnectionPoolConfigGetArgs(
        @Nullable Input<Integer> connectionBorrowTimeout,
        @Nullable Input<String> initQuery,
        @Nullable Input<Integer> maxConnectionsPercent,
        @Nullable Input<Integer> maxIdleConnectionsPercent,
        @Nullable Input<List<String>> sessionPinningFilters) {
        this.connectionBorrowTimeout = connectionBorrowTimeout;
        this.initQuery = initQuery;
        this.maxConnectionsPercent = maxConnectionsPercent;
        this.maxIdleConnectionsPercent = maxIdleConnectionsPercent;
        this.sessionPinningFilters = sessionPinningFilters;
    }

    private ProxyDefaultTargetGroupConnectionPoolConfigGetArgs() {
        this.connectionBorrowTimeout = Input.empty();
        this.initQuery = Input.empty();
        this.maxConnectionsPercent = Input.empty();
        this.maxIdleConnectionsPercent = Input.empty();
        this.sessionPinningFilters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProxyDefaultTargetGroupConnectionPoolConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> connectionBorrowTimeout;
        private @Nullable Input<String> initQuery;
        private @Nullable Input<Integer> maxConnectionsPercent;
        private @Nullable Input<Integer> maxIdleConnectionsPercent;
        private @Nullable Input<List<String>> sessionPinningFilters;

        public Builder() {
    	      // Empty
        }

        public Builder(ProxyDefaultTargetGroupConnectionPoolConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionBorrowTimeout = defaults.connectionBorrowTimeout;
    	      this.initQuery = defaults.initQuery;
    	      this.maxConnectionsPercent = defaults.maxConnectionsPercent;
    	      this.maxIdleConnectionsPercent = defaults.maxIdleConnectionsPercent;
    	      this.sessionPinningFilters = defaults.sessionPinningFilters;
        }

        public Builder setConnectionBorrowTimeout(@Nullable Input<Integer> connectionBorrowTimeout) {
            this.connectionBorrowTimeout = connectionBorrowTimeout;
            return this;
        }

        public Builder setConnectionBorrowTimeout(@Nullable Integer connectionBorrowTimeout) {
            this.connectionBorrowTimeout = Input.ofNullable(connectionBorrowTimeout);
            return this;
        }

        public Builder setInitQuery(@Nullable Input<String> initQuery) {
            this.initQuery = initQuery;
            return this;
        }

        public Builder setInitQuery(@Nullable String initQuery) {
            this.initQuery = Input.ofNullable(initQuery);
            return this;
        }

        public Builder setMaxConnectionsPercent(@Nullable Input<Integer> maxConnectionsPercent) {
            this.maxConnectionsPercent = maxConnectionsPercent;
            return this;
        }

        public Builder setMaxConnectionsPercent(@Nullable Integer maxConnectionsPercent) {
            this.maxConnectionsPercent = Input.ofNullable(maxConnectionsPercent);
            return this;
        }

        public Builder setMaxIdleConnectionsPercent(@Nullable Input<Integer> maxIdleConnectionsPercent) {
            this.maxIdleConnectionsPercent = maxIdleConnectionsPercent;
            return this;
        }

        public Builder setMaxIdleConnectionsPercent(@Nullable Integer maxIdleConnectionsPercent) {
            this.maxIdleConnectionsPercent = Input.ofNullable(maxIdleConnectionsPercent);
            return this;
        }

        public Builder setSessionPinningFilters(@Nullable Input<List<String>> sessionPinningFilters) {
            this.sessionPinningFilters = sessionPinningFilters;
            return this;
        }

        public Builder setSessionPinningFilters(@Nullable List<String> sessionPinningFilters) {
            this.sessionPinningFilters = Input.ofNullable(sessionPinningFilters);
            return this;
        }
        public ProxyDefaultTargetGroupConnectionPoolConfigGetArgs build() {
            return new ProxyDefaultTargetGroupConnectionPoolConfigGetArgs(connectionBorrowTimeout, initQuery, maxConnectionsPercent, maxIdleConnectionsPercent, sessionPinningFilters);
        }
    }
}
