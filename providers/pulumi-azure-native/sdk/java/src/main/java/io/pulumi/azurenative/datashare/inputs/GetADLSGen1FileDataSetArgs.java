// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetADLSGen1FileDataSetArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetADLSGen1FileDataSetArgs Empty = new GetADLSGen1FileDataSetArgs();

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
     * The name of the dataSet.
     * 
     */
    @Import(name="dataSetName", required=true)
      private final String dataSetName;

    public String dataSetName() {
        return this.dataSetName;
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
     * The name of the share.
     * 
     */
    @Import(name="shareName", required=true)
      private final String shareName;

    public String shareName() {
        return this.shareName;
    }

    public GetADLSGen1FileDataSetArgs(
        String accountName,
        String dataSetName,
        String resourceGroupName,
        String shareName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.dataSetName = Objects.requireNonNull(dataSetName, "expected parameter 'dataSetName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.shareName = Objects.requireNonNull(shareName, "expected parameter 'shareName' to be non-null");
    }

    private GetADLSGen1FileDataSetArgs() {
        this.accountName = null;
        this.dataSetName = null;
        this.resourceGroupName = null;
        this.shareName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetADLSGen1FileDataSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String dataSetName;
        private String resourceGroupName;
        private String shareName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetADLSGen1FileDataSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.dataSetName = defaults.dataSetName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.shareName = defaults.shareName;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder dataSetName(String dataSetName) {
            this.dataSetName = Objects.requireNonNull(dataSetName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder shareName(String shareName) {
            this.shareName = Objects.requireNonNull(shareName);
            return this;
        }        public GetADLSGen1FileDataSetArgs build() {
            return new GetADLSGen1FileDataSetArgs(accountName, dataSetName, resourceGroupName, shareName);
        }
    }
}
