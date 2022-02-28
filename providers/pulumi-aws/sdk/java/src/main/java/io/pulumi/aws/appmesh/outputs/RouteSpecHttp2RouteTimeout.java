// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.RouteSpecHttp2RouteTimeoutIdle;
import io.pulumi.aws.appmesh.outputs.RouteSpecHttp2RouteTimeoutPerRequest;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RouteSpecHttp2RouteTimeout {
    /**
     * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
     */
    private final @Nullable RouteSpecHttp2RouteTimeoutIdle idle;
    /**
     * The per request timeout.
     * 
     */
    private final @Nullable RouteSpecHttp2RouteTimeoutPerRequest perRequest;

    @OutputCustomType.Constructor({"idle","perRequest"})
    private RouteSpecHttp2RouteTimeout(
        @Nullable RouteSpecHttp2RouteTimeoutIdle idle,
        @Nullable RouteSpecHttp2RouteTimeoutPerRequest perRequest) {
        this.idle = idle;
        this.perRequest = perRequest;
    }

    /**
     * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
     */
    public Optional<RouteSpecHttp2RouteTimeoutIdle> getIdle() {
        return Optional.ofNullable(this.idle);
    }
    /**
     * The per request timeout.
     * 
     */
    public Optional<RouteSpecHttp2RouteTimeoutPerRequest> getPerRequest() {
        return Optional.ofNullable(this.perRequest);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecHttp2RouteTimeout defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RouteSpecHttp2RouteTimeoutIdle idle;
        private @Nullable RouteSpecHttp2RouteTimeoutPerRequest perRequest;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecHttp2RouteTimeout defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idle = defaults.idle;
    	      this.perRequest = defaults.perRequest;
        }

        public Builder setIdle(@Nullable RouteSpecHttp2RouteTimeoutIdle idle) {
            this.idle = idle;
            return this;
        }

        public Builder setPerRequest(@Nullable RouteSpecHttp2RouteTimeoutPerRequest perRequest) {
            this.perRequest = perRequest;
            return this;
        }
        public RouteSpecHttp2RouteTimeout build() {
            return new RouteSpecHttp2RouteTimeout(idle, perRequest);
        }
    }
}
