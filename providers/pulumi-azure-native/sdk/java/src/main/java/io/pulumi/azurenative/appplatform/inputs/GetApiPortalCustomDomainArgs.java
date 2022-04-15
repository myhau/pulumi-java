// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetApiPortalCustomDomainArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetApiPortalCustomDomainArgs Empty = new GetApiPortalCustomDomainArgs();

    /**
     * The name of API portal.
     * 
     */
    @Import(name="apiPortalName", required=true)
      private final String apiPortalName;

    public String apiPortalName() {
        return this.apiPortalName;
    }

    /**
     * The name of the API portal custom domain.
     * 
     */
    @Import(name="domainName", required=true)
      private final String domainName;

    public String domainName() {
        return this.domainName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Service resource.
     * 
     */
    @Import(name="serviceName", required=true)
      private final String serviceName;

    public String serviceName() {
        return this.serviceName;
    }

    public GetApiPortalCustomDomainArgs(
        String apiPortalName,
        String domainName,
        String resourceGroupName,
        String serviceName) {
        this.apiPortalName = Objects.requireNonNull(apiPortalName, "expected parameter 'apiPortalName' to be non-null");
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private GetApiPortalCustomDomainArgs() {
        this.apiPortalName = null;
        this.domainName = null;
        this.resourceGroupName = null;
        this.serviceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiPortalCustomDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiPortalName;
        private String domainName;
        private String resourceGroupName;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApiPortalCustomDomainArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiPortalName = defaults.apiPortalName;
    	      this.domainName = defaults.domainName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder apiPortalName(String apiPortalName) {
            this.apiPortalName = Objects.requireNonNull(apiPortalName);
            return this;
        }
        public Builder domainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }        public GetApiPortalCustomDomainArgs build() {
            return new GetApiPortalCustomDomainArgs(apiPortalName, domainName, resourceGroupName, serviceName);
        }
    }
}
