// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurestack.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCustomerSubscriptionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCustomerSubscriptionArgs Empty = new GetCustomerSubscriptionArgs();

    /**
     * Name of the product.
     * 
     */
    @Import(name="customerSubscriptionName", required=true)
      private final String customerSubscriptionName;

    public String customerSubscriptionName() {
        return this.customerSubscriptionName;
    }

    /**
     * Name of the Azure Stack registration.
     * 
     */
    @Import(name="registrationName", required=true)
      private final String registrationName;

    public String registrationName() {
        return this.registrationName;
    }

    /**
     * Name of the resource group.
     * 
     */
    @Import(name="resourceGroup", required=true)
      private final String resourceGroup;

    public String resourceGroup() {
        return this.resourceGroup;
    }

    public GetCustomerSubscriptionArgs(
        String customerSubscriptionName,
        String registrationName,
        String resourceGroup) {
        this.customerSubscriptionName = Objects.requireNonNull(customerSubscriptionName, "expected parameter 'customerSubscriptionName' to be non-null");
        this.registrationName = Objects.requireNonNull(registrationName, "expected parameter 'registrationName' to be non-null");
        this.resourceGroup = Objects.requireNonNull(resourceGroup, "expected parameter 'resourceGroup' to be non-null");
    }

    private GetCustomerSubscriptionArgs() {
        this.customerSubscriptionName = null;
        this.registrationName = null;
        this.resourceGroup = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCustomerSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String customerSubscriptionName;
        private String registrationName;
        private String resourceGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCustomerSubscriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customerSubscriptionName = defaults.customerSubscriptionName;
    	      this.registrationName = defaults.registrationName;
    	      this.resourceGroup = defaults.resourceGroup;
        }

        public Builder customerSubscriptionName(String customerSubscriptionName) {
            this.customerSubscriptionName = Objects.requireNonNull(customerSubscriptionName);
            return this;
        }
        public Builder registrationName(String registrationName) {
            this.registrationName = Objects.requireNonNull(registrationName);
            return this;
        }
        public Builder resourceGroup(String resourceGroup) {
            this.resourceGroup = Objects.requireNonNull(resourceGroup);
            return this;
        }        public GetCustomerSubscriptionArgs build() {
            return new GetCustomerSubscriptionArgs(customerSubscriptionName, registrationName, resourceGroup);
        }
    }
}
