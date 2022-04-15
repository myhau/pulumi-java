// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetConnectionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetConnectionArgs Empty = new GetConnectionArgs();

    /**
     * The name of the automation account.
     * 
     */
    @Import(name="automationAccountName", required=true)
      private final String automationAccountName;

    public String automationAccountName() {
        return this.automationAccountName;
    }

    /**
     * The name of connection.
     * 
     */
    @Import(name="connectionName", required=true)
      private final String connectionName;

    public String connectionName() {
        return this.connectionName;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public GetConnectionArgs(
        String automationAccountName,
        String connectionName,
        String resourceGroupName) {
        this.automationAccountName = Objects.requireNonNull(automationAccountName, "expected parameter 'automationAccountName' to be non-null");
        this.connectionName = Objects.requireNonNull(connectionName, "expected parameter 'connectionName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetConnectionArgs() {
        this.automationAccountName = null;
        this.connectionName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String automationAccountName;
        private String connectionName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationAccountName = defaults.automationAccountName;
    	      this.connectionName = defaults.connectionName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder automationAccountName(String automationAccountName) {
            this.automationAccountName = Objects.requireNonNull(automationAccountName);
            return this;
        }
        public Builder connectionName(String connectionName) {
            this.connectionName = Objects.requireNonNull(connectionName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetConnectionArgs build() {
            return new GetConnectionArgs(automationAccountName, connectionName, resourceGroupName);
        }
    }
}
