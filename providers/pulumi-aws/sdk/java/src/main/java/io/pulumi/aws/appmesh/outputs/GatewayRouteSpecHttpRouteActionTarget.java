// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.GatewayRouteSpecHttpRouteActionTargetVirtualService;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class GatewayRouteSpecHttpRouteActionTarget {
    /**
     * The virtual service gateway route target.
     * 
     */
    private final GatewayRouteSpecHttpRouteActionTargetVirtualService virtualService;

    @OutputCustomType.Constructor({"virtualService"})
    private GatewayRouteSpecHttpRouteActionTarget(GatewayRouteSpecHttpRouteActionTargetVirtualService virtualService) {
        this.virtualService = Objects.requireNonNull(virtualService);
    }

    /**
     * The virtual service gateway route target.
     * 
     */
    public GatewayRouteSpecHttpRouteActionTargetVirtualService getVirtualService() {
        return this.virtualService;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpecHttpRouteActionTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayRouteSpecHttpRouteActionTargetVirtualService virtualService;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayRouteSpecHttpRouteActionTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.virtualService = defaults.virtualService;
        }

        public Builder setVirtualService(GatewayRouteSpecHttpRouteActionTargetVirtualService virtualService) {
            this.virtualService = Objects.requireNonNull(virtualService);
            return this;
        }
        public GatewayRouteSpecHttpRouteActionTarget build() {
            return new GatewayRouteSpecHttpRouteActionTarget(virtualService);
        }
    }
}
