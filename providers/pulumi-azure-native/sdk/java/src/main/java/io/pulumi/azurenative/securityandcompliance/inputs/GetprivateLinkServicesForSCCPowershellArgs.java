// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityandcompliance.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetprivateLinkServicesForSCCPowershellArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetprivateLinkServicesForSCCPowershellArgs Empty = new GetprivateLinkServicesForSCCPowershellArgs();

    /**
     * The name of the resource group that contains the service instance.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the service instance.
     * 
     */
    @Import(name="resourceName", required=true)
      private final String resourceName;

    public String resourceName() {
        return this.resourceName;
    }

    public GetprivateLinkServicesForSCCPowershellArgs(
        String resourceGroupName,
        String resourceName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
    }

    private GetprivateLinkServicesForSCCPowershellArgs() {
        this.resourceGroupName = null;
        this.resourceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetprivateLinkServicesForSCCPowershellArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetprivateLinkServicesForSCCPowershellArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceName(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }        public GetprivateLinkServicesForSCCPowershellArgs build() {
            return new GetprivateLinkServicesForSCCPowershellArgs(resourceGroupName, resourceName);
        }
    }
}
