// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServiceEndpointPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetServiceEndpointPolicyArgs Empty = new GetServiceEndpointPolicyArgs();

    /**
     * Expands referenced resources.
     * 
     */
    @Import(name="expand")
      private final @Nullable String expand;

    public Optional<String> expand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
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
     * The name of the service endpoint policy.
     * 
     */
    @Import(name="serviceEndpointPolicyName", required=true)
      private final String serviceEndpointPolicyName;

    public String serviceEndpointPolicyName() {
        return this.serviceEndpointPolicyName;
    }

    public GetServiceEndpointPolicyArgs(
        @Nullable String expand,
        String resourceGroupName,
        String serviceEndpointPolicyName) {
        this.expand = expand;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceEndpointPolicyName = Objects.requireNonNull(serviceEndpointPolicyName, "expected parameter 'serviceEndpointPolicyName' to be non-null");
    }

    private GetServiceEndpointPolicyArgs() {
        this.expand = null;
        this.resourceGroupName = null;
        this.serviceEndpointPolicyName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceEndpointPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expand;
        private String resourceGroupName;
        private String serviceEndpointPolicyName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceEndpointPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expand = defaults.expand;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceEndpointPolicyName = defaults.serviceEndpointPolicyName;
        }

        public Builder expand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder serviceEndpointPolicyName(String serviceEndpointPolicyName) {
            this.serviceEndpointPolicyName = Objects.requireNonNull(serviceEndpointPolicyName);
            return this;
        }        public GetServiceEndpointPolicyArgs build() {
            return new GetServiceEndpointPolicyArgs(expand, resourceGroupName, serviceEndpointPolicyName);
        }
    }
}
