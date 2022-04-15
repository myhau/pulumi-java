// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetP2sVpnGatewayArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetP2sVpnGatewayArgs Empty = new GetP2sVpnGatewayArgs();

    /**
     * The name of the gateway.
     * 
     */
    @Import(name="gatewayName", required=true)
      private final String gatewayName;

    public String gatewayName() {
        return this.gatewayName;
    }

    /**
     * The resource group name of the P2SVpnGateway.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public GetP2sVpnGatewayArgs(
        String gatewayName,
        String resourceGroupName) {
        this.gatewayName = Objects.requireNonNull(gatewayName, "expected parameter 'gatewayName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetP2sVpnGatewayArgs() {
        this.gatewayName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetP2sVpnGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gatewayName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetP2sVpnGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gatewayName = defaults.gatewayName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder gatewayName(String gatewayName) {
            this.gatewayName = Objects.requireNonNull(gatewayName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetP2sVpnGatewayArgs build() {
            return new GetP2sVpnGatewayArgs(gatewayName, resourceGroupName);
        }
    }
}
