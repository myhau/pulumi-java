// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVirtualNetworkGatewayConnectionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVirtualNetworkGatewayConnectionArgs Empty = new GetVirtualNetworkGatewayConnectionArgs();

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
     * The name of the virtual network gateway connection.
     * 
     */
    @Import(name="virtualNetworkGatewayConnectionName", required=true)
      private final String virtualNetworkGatewayConnectionName;

    public String virtualNetworkGatewayConnectionName() {
        return this.virtualNetworkGatewayConnectionName;
    }

    public GetVirtualNetworkGatewayConnectionArgs(
        String resourceGroupName,
        String virtualNetworkGatewayConnectionName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.virtualNetworkGatewayConnectionName = Objects.requireNonNull(virtualNetworkGatewayConnectionName, "expected parameter 'virtualNetworkGatewayConnectionName' to be non-null");
    }

    private GetVirtualNetworkGatewayConnectionArgs() {
        this.resourceGroupName = null;
        this.virtualNetworkGatewayConnectionName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualNetworkGatewayConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String virtualNetworkGatewayConnectionName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualNetworkGatewayConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.virtualNetworkGatewayConnectionName = defaults.virtualNetworkGatewayConnectionName;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder virtualNetworkGatewayConnectionName(String virtualNetworkGatewayConnectionName) {
            this.virtualNetworkGatewayConnectionName = Objects.requireNonNull(virtualNetworkGatewayConnectionName);
            return this;
        }        public GetVirtualNetworkGatewayConnectionArgs build() {
            return new GetVirtualNetworkGatewayConnectionArgs(resourceGroupName, virtualNetworkGatewayConnectionName);
        }
    }
}
