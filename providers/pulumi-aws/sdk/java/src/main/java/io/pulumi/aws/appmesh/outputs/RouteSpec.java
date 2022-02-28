// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.RouteSpecGrpcRoute;
import io.pulumi.aws.appmesh.outputs.RouteSpecHttp2Route;
import io.pulumi.aws.appmesh.outputs.RouteSpecHttpRoute;
import io.pulumi.aws.appmesh.outputs.RouteSpecTcpRoute;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RouteSpec {
    /**
     * The gRPC routing information for the route.
     * 
     */
    private final @Nullable RouteSpecGrpcRoute grpcRoute;
    /**
     * The HTTP/2 routing information for the route.
     * 
     */
    private final @Nullable RouteSpecHttp2Route http2Route;
    /**
     * The HTTP routing information for the route.
     * 
     */
    private final @Nullable RouteSpecHttpRoute httpRoute;
    /**
     * The priority for the route, between `0` and `1000`.
     * Routes are matched based on the specified value, where `0` is the highest priority.
     * 
     */
    private final @Nullable Integer priority;
    /**
     * The TCP routing information for the route.
     * 
     */
    private final @Nullable RouteSpecTcpRoute tcpRoute;

    @OutputCustomType.Constructor({"grpcRoute","http2Route","httpRoute","priority","tcpRoute"})
    private RouteSpec(
        @Nullable RouteSpecGrpcRoute grpcRoute,
        @Nullable RouteSpecHttp2Route http2Route,
        @Nullable RouteSpecHttpRoute httpRoute,
        @Nullable Integer priority,
        @Nullable RouteSpecTcpRoute tcpRoute) {
        this.grpcRoute = grpcRoute;
        this.http2Route = http2Route;
        this.httpRoute = httpRoute;
        this.priority = priority;
        this.tcpRoute = tcpRoute;
    }

    /**
     * The gRPC routing information for the route.
     * 
     */
    public Optional<RouteSpecGrpcRoute> getGrpcRoute() {
        return Optional.ofNullable(this.grpcRoute);
    }
    /**
     * The HTTP/2 routing information for the route.
     * 
     */
    public Optional<RouteSpecHttp2Route> getHttp2Route() {
        return Optional.ofNullable(this.http2Route);
    }
    /**
     * The HTTP routing information for the route.
     * 
     */
    public Optional<RouteSpecHttpRoute> getHttpRoute() {
        return Optional.ofNullable(this.httpRoute);
    }
    /**
     * The priority for the route, between `0` and `1000`.
     * Routes are matched based on the specified value, where `0` is the highest priority.
     * 
     */
    public Optional<Integer> getPriority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * The TCP routing information for the route.
     * 
     */
    public Optional<RouteSpecTcpRoute> getTcpRoute() {
        return Optional.ofNullable(this.tcpRoute);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RouteSpecGrpcRoute grpcRoute;
        private @Nullable RouteSpecHttp2Route http2Route;
        private @Nullable RouteSpecHttpRoute httpRoute;
        private @Nullable Integer priority;
        private @Nullable RouteSpecTcpRoute tcpRoute;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.grpcRoute = defaults.grpcRoute;
    	      this.http2Route = defaults.http2Route;
    	      this.httpRoute = defaults.httpRoute;
    	      this.priority = defaults.priority;
    	      this.tcpRoute = defaults.tcpRoute;
        }

        public Builder setGrpcRoute(@Nullable RouteSpecGrpcRoute grpcRoute) {
            this.grpcRoute = grpcRoute;
            return this;
        }

        public Builder setHttp2Route(@Nullable RouteSpecHttp2Route http2Route) {
            this.http2Route = http2Route;
            return this;
        }

        public Builder setHttpRoute(@Nullable RouteSpecHttpRoute httpRoute) {
            this.httpRoute = httpRoute;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }

        public Builder setTcpRoute(@Nullable RouteSpecTcpRoute tcpRoute) {
            this.tcpRoute = tcpRoute;
            return this;
        }
        public RouteSpec build() {
            return new RouteSpec(grpcRoute, http2Route, httpRoute, priority, tcpRoute);
        }
    }
}
