// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListKustoPoolLanguageExtensionsArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListKustoPoolLanguageExtensionsArgs Empty = new ListKustoPoolLanguageExtensionsArgs();

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
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
      private final String workspaceName;

    public String workspaceName() {
        return this.workspaceName;
    }

    public ListKustoPoolLanguageExtensionsArgs(
        String kustoPoolName,
        String resourceGroupName,
        String workspaceName) {
        this.kustoPoolName = Objects.requireNonNull(kustoPoolName, "expected parameter 'kustoPoolName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private ListKustoPoolLanguageExtensionsArgs() {
        this.kustoPoolName = null;
        this.resourceGroupName = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListKustoPoolLanguageExtensionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kustoPoolName;
        private String resourceGroupName;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListKustoPoolLanguageExtensionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kustoPoolName = defaults.kustoPoolName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
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
        }        public ListKustoPoolLanguageExtensionsArgs build() {
            return new ListKustoPoolLanguageExtensionsArgs(kustoPoolName, resourceGroupName, workspaceName);
        }
    }
}
