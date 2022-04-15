// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAuthorizationServerArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAuthorizationServerArgs Empty = new GetAuthorizationServerArgs();

    /**
     * Identifier of the authorization server.
     * 
     */
    @Import(name="authsid", required=true)
      private final String authsid;

    public String authsid() {
        return this.authsid;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
      private final String serviceName;

    public String serviceName() {
        return this.serviceName;
    }

    public GetAuthorizationServerArgs(
        String authsid,
        String resourceGroupName,
        String serviceName) {
        this.authsid = Objects.requireNonNull(authsid, "expected parameter 'authsid' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private GetAuthorizationServerArgs() {
        this.authsid = null;
        this.resourceGroupName = null;
        this.serviceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAuthorizationServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authsid;
        private String resourceGroupName;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAuthorizationServerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authsid = defaults.authsid;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder authsid(String authsid) {
            this.authsid = Objects.requireNonNull(authsid);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }        public GetAuthorizationServerArgs build() {
            return new GetAuthorizationServerArgs(authsid, resourceGroupName, serviceName);
        }
    }
}
