// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSqlResourceSqlStoredProcedureArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSqlResourceSqlStoredProcedureArgs Empty = new GetSqlResourceSqlStoredProcedureArgs();

    /**
     * Cosmos DB database account name.
     * 
     */
    @Import(name="accountName", required=true)
      private final String accountName;

    public String accountName() {
        return this.accountName;
    }

    /**
     * Cosmos DB container name.
     * 
     */
    @Import(name="containerName", required=true)
      private final String containerName;

    public String containerName() {
        return this.containerName;
    }

    /**
     * Cosmos DB database name.
     * 
     */
    @Import(name="databaseName", required=true)
      private final String databaseName;

    public String databaseName() {
        return this.databaseName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Cosmos DB storedProcedure name.
     * 
     */
    @Import(name="storedProcedureName", required=true)
      private final String storedProcedureName;

    public String storedProcedureName() {
        return this.storedProcedureName;
    }

    public GetSqlResourceSqlStoredProcedureArgs(
        String accountName,
        String containerName,
        String databaseName,
        String resourceGroupName,
        String storedProcedureName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.containerName = Objects.requireNonNull(containerName, "expected parameter 'containerName' to be non-null");
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.storedProcedureName = Objects.requireNonNull(storedProcedureName, "expected parameter 'storedProcedureName' to be non-null");
    }

    private GetSqlResourceSqlStoredProcedureArgs() {
        this.accountName = null;
        this.containerName = null;
        this.databaseName = null;
        this.resourceGroupName = null;
        this.storedProcedureName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSqlResourceSqlStoredProcedureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String containerName;
        private String databaseName;
        private String resourceGroupName;
        private String storedProcedureName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSqlResourceSqlStoredProcedureArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.containerName = defaults.containerName;
    	      this.databaseName = defaults.databaseName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.storedProcedureName = defaults.storedProcedureName;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder containerName(String containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }
        public Builder databaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder storedProcedureName(String storedProcedureName) {
            this.storedProcedureName = Objects.requireNonNull(storedProcedureName);
            return this;
        }        public GetSqlResourceSqlStoredProcedureArgs build() {
            return new GetSqlResourceSqlStoredProcedureArgs(accountName, containerName, databaseName, resourceGroupName, storedProcedureName);
        }
    }
}
