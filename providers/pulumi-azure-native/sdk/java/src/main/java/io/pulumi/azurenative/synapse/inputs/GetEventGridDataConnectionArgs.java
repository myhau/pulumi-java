// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetEventGridDataConnectionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetEventGridDataConnectionArgs Empty = new GetEventGridDataConnectionArgs();

    /**
     * The name of the data connection.
     * 
     */
    @Import(name="dataConnectionName", required=true)
      private final String dataConnectionName;

    public String dataConnectionName() {
        return this.dataConnectionName;
    }

    /**
     * The name of the database in the Kusto pool.
     * 
     */
    @Import(name="databaseName", required=true)
      private final String databaseName;

    public String databaseName() {
        return this.databaseName;
    }

    /**
     * The name of the Kusto pool.
     * 
     */
    @Import(name="kustoPoolName", required=true)
      private final String kustoPoolName;

    public String kustoPoolName() {
        return this.kustoPoolName;
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
     * The name of the workspace
     * 
     */
    @Import(name="workspaceName", required=true)
      private final String workspaceName;

    public String workspaceName() {
        return this.workspaceName;
    }

    public GetEventGridDataConnectionArgs(
        String dataConnectionName,
        String databaseName,
        String kustoPoolName,
        String resourceGroupName,
        String workspaceName) {
        this.dataConnectionName = Objects.requireNonNull(dataConnectionName, "expected parameter 'dataConnectionName' to be non-null");
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.kustoPoolName = Objects.requireNonNull(kustoPoolName, "expected parameter 'kustoPoolName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private GetEventGridDataConnectionArgs() {
        this.dataConnectionName = null;
        this.databaseName = null;
        this.kustoPoolName = null;
        this.resourceGroupName = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEventGridDataConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataConnectionName;
        private String databaseName;
        private String kustoPoolName;
        private String resourceGroupName;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEventGridDataConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataConnectionName = defaults.dataConnectionName;
    	      this.databaseName = defaults.databaseName;
    	      this.kustoPoolName = defaults.kustoPoolName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder dataConnectionName(String dataConnectionName) {
            this.dataConnectionName = Objects.requireNonNull(dataConnectionName);
            return this;
        }
        public Builder databaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        public Builder kustoPoolName(String kustoPoolName) {
            this.kustoPoolName = Objects.requireNonNull(kustoPoolName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }        public GetEventGridDataConnectionArgs build() {
            return new GetEventGridDataConnectionArgs(dataConnectionName, databaseName, kustoPoolName, resourceGroupName, workspaceName);
        }
    }
}
