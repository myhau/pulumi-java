// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.GatewayRouteSpecHttp2RouteActionTargetVirtualService;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class GatewayRouteSpecHttp2RouteActionTarget {
    /**
     * The virtual service gateway route target.
     * 
     */
    private final GatewayRouteSpecHttp2RouteActionTargetVirtualService virtualService;

    @OutputCustomType.Constructor({"virtualService"})
    private GatewayRouteSpecHttp2RouteActionTarget(GatewayRouteSpecHttp2RouteActionTargetVirtualService virtualService) {
        this.virtualService = virtualService;
    }

    /**
     * The virtual service gateway route target.
     * 
    */
    public GatewayRouteSpecHttp2RouteActionTargetVirtualService getVirtualService() {
        return this.virtualService;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpecHttp2RouteActionTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayRouteSpecHttp2RouteActionTargetVirtualService virtualService;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayRouteSpecHttp2RouteActionTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.virtualService = defaults.virtualService;
        }

        public Builder setVirtualService(GatewayRouteSpecHttp2RouteActionTargetVirtualService virtualService) {
            this.virtualService = Objects.requireNonNull(virtualService);
            return this;
        }
        public GatewayRouteSpecHttp2RouteActionTarget build() {
            return new GatewayRouteSpecHttp2RouteActionTarget(virtualService);
        }
    }
}
