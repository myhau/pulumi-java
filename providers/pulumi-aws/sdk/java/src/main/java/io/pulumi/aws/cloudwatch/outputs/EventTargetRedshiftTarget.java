// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EventTargetRedshiftTarget {
    /**
     * The name of the database.
     * 
     */
    private final String database;
    /**
     * The database user name.
     * 
     */
    private final @Nullable String dbUser;
    /**
     * The name or ARN of the secret that enables access to the database.
     * 
     */
    private final @Nullable String secretsManagerArn;
    /**
     * The SQL statement text to run.
     * 
     */
    private final @Nullable String sql;
    /**
     * The name of the SQL statement.
     * 
     */
    private final @Nullable String statementName;
    /**
     * Indicates whether to send an event back to EventBridge after the SQL statement runs.
     * 
     */
    private final @Nullable Boolean withEvent;

    @OutputCustomType.Constructor({"database","dbUser","secretsManagerArn","sql","statementName","withEvent"})
    private EventTargetRedshiftTarget(
        String database,
        @Nullable String dbUser,
        @Nullable String secretsManagerArn,
        @Nullable String sql,
        @Nullable String statementName,
        @Nullable Boolean withEvent) {
        this.database = Objects.requireNonNull(database);
        this.dbUser = dbUser;
        this.secretsManagerArn = secretsManagerArn;
        this.sql = sql;
        this.statementName = statementName;
        this.withEvent = withEvent;
    }

    /**
     * The name of the database.
     * 
     */
    public String getDatabase() {
        return this.database;
    }
    /**
     * The database user name.
     * 
     */
    public Optional<String> getDbUser() {
        return Optional.ofNullable(this.dbUser);
    }
    /**
     * The name or ARN of the secret that enables access to the database.
     * 
     */
    public Optional<String> getSecretsManagerArn() {
        return Optional.ofNullable(this.secretsManagerArn);
    }
    /**
     * The SQL statement text to run.
     * 
     */
    public Optional<String> getSql() {
        return Optional.ofNullable(this.sql);
    }
    /**
     * The name of the SQL statement.
     * 
     */
    public Optional<String> getStatementName() {
        return Optional.ofNullable(this.statementName);
    }
    /**
     * Indicates whether to send an event back to EventBridge after the SQL statement runs.
     * 
     */
    public Optional<Boolean> getWithEvent() {
        return Optional.ofNullable(this.withEvent);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventTargetRedshiftTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String database;
        private @Nullable String dbUser;
        private @Nullable String secretsManagerArn;
        private @Nullable String sql;
        private @Nullable String statementName;
        private @Nullable Boolean withEvent;

        public Builder() {
    	      // Empty
        }

        public Builder(EventTargetRedshiftTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.dbUser = defaults.dbUser;
    	      this.secretsManagerArn = defaults.secretsManagerArn;
    	      this.sql = defaults.sql;
    	      this.statementName = defaults.statementName;
    	      this.withEvent = defaults.withEvent;
        }

        public Builder setDatabase(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }

        public Builder setDbUser(@Nullable String dbUser) {
            this.dbUser = dbUser;
            return this;
        }

        public Builder setSecretsManagerArn(@Nullable String secretsManagerArn) {
            this.secretsManagerArn = secretsManagerArn;
            return this;
        }

        public Builder setSql(@Nullable String sql) {
            this.sql = sql;
            return this;
        }

        public Builder setStatementName(@Nullable String statementName) {
            this.statementName = statementName;
            return this;
        }

        public Builder setWithEvent(@Nullable Boolean withEvent) {
            this.withEvent = withEvent;
            return this;
        }
        public EventTargetRedshiftTarget build() {
            return new EventTargetRedshiftTarget(database, dbUser, secretsManagerArn, sql, statementName, withEvent);
        }
    }
}
