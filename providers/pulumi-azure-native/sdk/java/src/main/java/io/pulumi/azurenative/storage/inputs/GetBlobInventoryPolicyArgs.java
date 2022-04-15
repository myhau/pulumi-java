// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBlobInventoryPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBlobInventoryPolicyArgs Empty = new GetBlobInventoryPolicyArgs();

    /**
     * The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * 
     */
    @Import(name="accountName", required=true)
      private final String accountName;

    public String accountName() {
        return this.accountName;
    }

    /**
     * The name of the storage account blob inventory policy. It should always be 'default'
     * 
     */
    @Import(name="blobInventoryPolicyName", required=true)
      private final String blobInventoryPolicyName;

    public String blobInventoryPolicyName() {
        return this.blobInventoryPolicyName;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public GetBlobInventoryPolicyArgs(
        String accountName,
        String blobInventoryPolicyName,
        String resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.blobInventoryPolicyName = Objects.requireNonNull(blobInventoryPolicyName, "expected parameter 'blobInventoryPolicyName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetBlobInventoryPolicyArgs() {
        this.accountName = null;
        this.blobInventoryPolicyName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBlobInventoryPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String blobInventoryPolicyName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBlobInventoryPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.blobInventoryPolicyName = defaults.blobInventoryPolicyName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder blobInventoryPolicyName(String blobInventoryPolicyName) {
            this.blobInventoryPolicyName = Objects.requireNonNull(blobInventoryPolicyName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetBlobInventoryPolicyArgs build() {
            return new GetBlobInventoryPolicyArgs(accountName, blobInventoryPolicyName, resourceGroupName);
        }
    }
}
