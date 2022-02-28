// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.RouteSpecTcpRouteTimeoutIdle;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RouteSpecTcpRouteTimeout {
    /**
     * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
     */
    private final @Nullable RouteSpecTcpRouteTimeoutIdle idle;

    @OutputCustomType.Constructor({"idle"})
    private RouteSpecTcpRouteTimeout(@Nullable RouteSpecTcpRouteTimeoutIdle idle) {
        this.idle = idle;
    }

    /**
     * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
     */
    public Optional<RouteSpecTcpRouteTimeoutIdle> getIdle() {
        return Optional.ofNullable(this.idle);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecTcpRouteTimeout defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RouteSpecTcpRouteTimeoutIdle idle;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecTcpRouteTimeout defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idle = defaults.idle;
        }

        public Builder setIdle(@Nullable RouteSpecTcpRouteTimeoutIdle idle) {
            this.idle = idle;
            return this;
        }
        public RouteSpecTcpRouteTimeout build() {
            return new RouteSpecTcpRouteTimeout(idle);
        }
    }
}
