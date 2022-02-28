// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventTargetRedshiftTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventTargetRedshiftTargetArgs Empty = new EventTargetRedshiftTargetArgs();

    /**
     * The name of the database.
     * 
     */
    @InputImport(name="database", required=true)
      private final Input<String> database;

    public Input<String> getDatabase() {
        return this.database;
    }

    /**
     * The database user name.
     * 
     */
    @InputImport(name="dbUser")
      private final @Nullable Input<String> dbUser;

    public Input<String> getDbUser() {
        return this.dbUser == null ? Input.empty() : this.dbUser;
    }

    /**
     * The name or ARN of the secret that enables access to the database.
     * 
     */
    @InputImport(name="secretsManagerArn")
      private final @Nullable Input<String> secretsManagerArn;

    public Input<String> getSecretsManagerArn() {
        return this.secretsManagerArn == null ? Input.empty() : this.secretsManagerArn;
    }

    /**
     * The SQL statement text to run.
     * 
     */
    @InputImport(name="sql")
      private final @Nullable Input<String> sql;

    public Input<String> getSql() {
        return this.sql == null ? Input.empty() : this.sql;
    }

    /**
     * The name of the SQL statement.
     * 
     */
    @InputImport(name="statementName")
      private final @Nullable Input<String> statementName;

    public Input<String> getStatementName() {
        return this.statementName == null ? Input.empty() : this.statementName;
    }

    /**
     * Indicates whether to send an event back to EventBridge after the SQL statement runs.
     * 
     */
    @InputImport(name="withEvent")
      private final @Nullable Input<Boolean> withEvent;

    public Input<Boolean> getWithEvent() {
        return this.withEvent == null ? Input.empty() : this.withEvent;
    }

    public EventTargetRedshiftTargetArgs(
        Input<String> database,
        @Nullable Input<String> dbUser,
        @Nullable Input<String> secretsManagerArn,
        @Nullable Input<String> sql,
        @Nullable Input<String> statementName,
        @Nullable Input<Boolean> withEvent) {
        this.database = Objects.requireNonNull(database, "expected parameter 'database' to be non-null");
        this.dbUser = dbUser;
        this.secretsManagerArn = secretsManagerArn;
        this.sql = sql;
        this.statementName = statementName;
        this.withEvent = withEvent;
    }

    private EventTargetRedshiftTargetArgs() {
        this.database = Input.empty();
        this.dbUser = Input.empty();
        this.secretsManagerArn = Input.empty();
        this.sql = Input.empty();
        this.statementName = Input.empty();
        this.withEvent = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventTargetRedshiftTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> database;
        private @Nullable Input<String> dbUser;
        private @Nullable Input<String> secretsManagerArn;
        private @Nullable Input<String> sql;
        private @Nullable Input<String> statementName;
        private @Nullable Input<Boolean> withEvent;

        public Builder() {
    	      // Empty
        }

        public Builder(EventTargetRedshiftTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.dbUser = defaults.dbUser;
    	      this.secretsManagerArn = defaults.secretsManagerArn;
    	      this.sql = defaults.sql;
    	      this.statementName = defaults.statementName;
    	      this.withEvent = defaults.withEvent;
        }

        public Builder setDatabase(Input<String> database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }

        public Builder setDatabase(String database) {
            this.database = Input.of(Objects.requireNonNull(database));
            return this;
        }

        public Builder setDbUser(@Nullable Input<String> dbUser) {
            this.dbUser = dbUser;
            return this;
        }

        public Builder setDbUser(@Nullable String dbUser) {
            this.dbUser = Input.ofNullable(dbUser);
            return this;
        }

        public Builder setSecretsManagerArn(@Nullable Input<String> secretsManagerArn) {
            this.secretsManagerArn = secretsManagerArn;
            return this;
        }

        public Builder setSecretsManagerArn(@Nullable String secretsManagerArn) {
            this.secretsManagerArn = Input.ofNullable(secretsManagerArn);
            return this;
        }

        public Builder setSql(@Nullable Input<String> sql) {
            this.sql = sql;
            return this;
        }

        public Builder setSql(@Nullable String sql) {
            this.sql = Input.ofNullable(sql);
            return this;
        }

        public Builder setStatementName(@Nullable Input<String> statementName) {
            this.statementName = statementName;
            return this;
        }

        public Builder setStatementName(@Nullable String statementName) {
            this.statementName = Input.ofNullable(statementName);
            return this;
        }

        public Builder setWithEvent(@Nullable Input<Boolean> withEvent) {
            this.withEvent = withEvent;
            return this;
        }

        public Builder setWithEvent(@Nullable Boolean withEvent) {
            this.withEvent = Input.ofNullable(withEvent);
            return this;
        }
        public EventTargetRedshiftTargetArgs build() {
            return new EventTargetRedshiftTargetArgs(database, dbUser, secretsManagerArn, sql, statementName, withEvent);
        }
    }
}
