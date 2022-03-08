// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.PostgreSqlConnectionInfoResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class ConnectToSourcePostgreSqlSyncTaskInputResponse {
    /**
     * Connection information for source PostgreSQL server
     * 
     */
    private final PostgreSqlConnectionInfoResponse sourceConnectionInfo;

    @OutputCustomType.Constructor({"sourceConnectionInfo"})
    private ConnectToSourcePostgreSqlSyncTaskInputResponse(PostgreSqlConnectionInfoResponse sourceConnectionInfo) {
        this.sourceConnectionInfo = sourceConnectionInfo;
    }

    /**
     * Connection information for source PostgreSQL server
     * 
    */
    public PostgreSqlConnectionInfoResponse getSourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToSourcePostgreSqlSyncTaskInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PostgreSqlConnectionInfoResponse sourceConnectionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToSourcePostgreSqlSyncTaskInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceConnectionInfo = defaults.sourceConnectionInfo;
        }

        public Builder setSourceConnectionInfo(PostgreSqlConnectionInfoResponse sourceConnectionInfo) {
            this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo);
            return this;
        }
        public ConnectToSourcePostgreSqlSyncTaskInputResponse build() {
            return new ConnectToSourcePostgreSqlSyncTaskInputResponse(sourceConnectionInfo);
        }
    }
}
