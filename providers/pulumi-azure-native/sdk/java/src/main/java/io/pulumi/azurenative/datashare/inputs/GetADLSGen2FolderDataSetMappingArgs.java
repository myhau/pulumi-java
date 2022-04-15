// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetADLSGen2FolderDataSetMappingArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetADLSGen2FolderDataSetMappingArgs Empty = new GetADLSGen2FolderDataSetMappingArgs();

    /**
     * The name of the share account.
     * 
     */
    @Import(name="accountName", required=true)
      private final String accountName;

    public String accountName() {
        return this.accountName;
    }

    /**
     * The name of the dataSetMapping.
     * 
     */
    @Import(name="dataSetMappingName", required=true)
      private final String dataSetMappingName;

    public String dataSetMappingName() {
        return this.dataSetMappingName;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the shareSubscription.
     * 
     */
    @Import(name="shareSubscriptionName", required=true)
      private final String shareSubscriptionName;

    public String shareSubscriptionName() {
        return this.shareSubscriptionName;
    }

    public GetADLSGen2FolderDataSetMappingArgs(
        String accountName,
        String dataSetMappingName,
        String resourceGroupName,
        String shareSubscriptionName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.dataSetMappingName = Objects.requireNonNull(dataSetMappingName, "expected parameter 'dataSetMappingName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.shareSubscriptionName = Objects.requireNonNull(shareSubscriptionName, "expected parameter 'shareSubscriptionName' to be non-null");
    }

    private GetADLSGen2FolderDataSetMappingArgs() {
        this.accountName = null;
        this.dataSetMappingName = null;
        this.resourceGroupName = null;
        this.shareSubscriptionName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetADLSGen2FolderDataSetMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String dataSetMappingName;
        private String resourceGroupName;
        private String shareSubscriptionName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetADLSGen2FolderDataSetMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.dataSetMappingName = defaults.dataSetMappingName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.shareSubscriptionName = defaults.shareSubscriptionName;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder dataSetMappingName(String dataSetMappingName) {
            this.dataSetMappingName = Objects.requireNonNull(dataSetMappingName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder shareSubscriptionName(String shareSubscriptionName) {
            this.shareSubscriptionName = Objects.requireNonNull(shareSubscriptionName);
            return this;
        }        public GetADLSGen2FolderDataSetMappingArgs build() {
            return new GetADLSGen2FolderDataSetMappingArgs(accountName, dataSetMappingName, resourceGroupName, shareSubscriptionName);
        }
    }
}
