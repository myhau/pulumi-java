// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.GatewayRouteSpecGrpcRouteGetArgs;
import io.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteGetArgs;
import io.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GatewayRouteSpecGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayRouteSpecGetArgs Empty = new GatewayRouteSpecGetArgs();

    /**
     * The specification of a gRPC gateway route.
     * 
     */
    @InputImport(name="grpcRoute")
      private final @Nullable Input<GatewayRouteSpecGrpcRouteGetArgs> grpcRoute;

    public Input<GatewayRouteSpecGrpcRouteGetArgs> getGrpcRoute() {
        return this.grpcRoute == null ? Input.empty() : this.grpcRoute;
    }

    /**
     * The specification of an HTTP/2 gateway route.
     * 
     */
    @InputImport(name="http2Route")
      private final @Nullable Input<GatewayRouteSpecHttp2RouteGetArgs> http2Route;

    public Input<GatewayRouteSpecHttp2RouteGetArgs> getHttp2Route() {
        return this.http2Route == null ? Input.empty() : this.http2Route;
    }

    /**
     * The specification of an HTTP gateway route.
     * 
     */
    @InputImport(name="httpRoute")
      private final @Nullable Input<GatewayRouteSpecHttpRouteGetArgs> httpRoute;

    public Input<GatewayRouteSpecHttpRouteGetArgs> getHttpRoute() {
        return this.httpRoute == null ? Input.empty() : this.httpRoute;
    }

    public GatewayRouteSpecGetArgs(
        @Nullable Input<GatewayRouteSpecGrpcRouteGetArgs> grpcRoute,
        @Nullable Input<GatewayRouteSpecHttp2RouteGetArgs> http2Route,
        @Nullable Input<GatewayRouteSpecHttpRouteGetArgs> httpRoute) {
        this.grpcRoute = grpcRoute;
        this.http2Route = http2Route;
        this.httpRoute = httpRoute;
    }

    private GatewayRouteSpecGetArgs() {
        this.grpcRoute = Input.empty();
        this.http2Route = Input.empty();
        this.httpRoute = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpecGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GatewayRouteSpecGrpcRouteGetArgs> grpcRoute;
        private @Nullable Input<GatewayRouteSpecHttp2RouteGetArgs> http2Route;
        private @Nullable Input<GatewayRouteSpecHttpRouteGetArgs> httpRoute;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayRouteSpecGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.grpcRoute = defaults.grpcRoute;
    	      this.http2Route = defaults.http2Route;
    	      this.httpRoute = defaults.httpRoute;
        }

        public Builder setGrpcRoute(@Nullable Input<GatewayRouteSpecGrpcRouteGetArgs> grpcRoute) {
            this.grpcRoute = grpcRoute;
            return this;
        }

        public Builder setGrpcRoute(@Nullable GatewayRouteSpecGrpcRouteGetArgs grpcRoute) {
            this.grpcRoute = Input.ofNullable(grpcRoute);
            return this;
        }

        public Builder setHttp2Route(@Nullable Input<GatewayRouteSpecHttp2RouteGetArgs> http2Route) {
            this.http2Route = http2Route;
            return this;
        }

        public Builder setHttp2Route(@Nullable GatewayRouteSpecHttp2RouteGetArgs http2Route) {
            this.http2Route = Input.ofNullable(http2Route);
            return this;
        }

        public Builder setHttpRoute(@Nullable Input<GatewayRouteSpecHttpRouteGetArgs> httpRoute) {
            this.httpRoute = httpRoute;
            return this;
        }

        public Builder setHttpRoute(@Nullable GatewayRouteSpecHttpRouteGetArgs httpRoute) {
            this.httpRoute = Input.ofNullable(httpRoute);
            return this;
        }
        public GatewayRouteSpecGetArgs build() {
            return new GatewayRouteSpecGetArgs(grpcRoute, http2Route, httpRoute);
        }
    }
}
