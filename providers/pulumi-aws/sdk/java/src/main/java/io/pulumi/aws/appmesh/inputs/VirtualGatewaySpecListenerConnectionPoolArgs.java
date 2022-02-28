// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerConnectionPoolGrpcArgs;
import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerConnectionPoolHttp2Args;
import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerConnectionPoolHttpArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualGatewaySpecListenerConnectionPoolArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecListenerConnectionPoolArgs Empty = new VirtualGatewaySpecListenerConnectionPoolArgs();

    /**
     * Connection pool information for gRPC listeners.
     * 
     */
    @InputImport(name="grpc")
      private final @Nullable Input<VirtualGatewaySpecListenerConnectionPoolGrpcArgs> grpc;

    public Input<VirtualGatewaySpecListenerConnectionPoolGrpcArgs> getGrpc() {
        return this.grpc == null ? Input.empty() : this.grpc;
    }

    /**
     * Connection pool information for HTTP listeners.
     * 
     */
    @InputImport(name="http")
      private final @Nullable Input<VirtualGatewaySpecListenerConnectionPoolHttpArgs> http;

    public Input<VirtualGatewaySpecListenerConnectionPoolHttpArgs> getHttp() {
        return this.http == null ? Input.empty() : this.http;
    }

    /**
     * Connection pool information for HTTP2 listeners.
     * 
     */
    @InputImport(name="http2")
      private final @Nullable Input<VirtualGatewaySpecListenerConnectionPoolHttp2Args> http2;

    public Input<VirtualGatewaySpecListenerConnectionPoolHttp2Args> getHttp2() {
        return this.http2 == null ? Input.empty() : this.http2;
    }

    public VirtualGatewaySpecListenerConnectionPoolArgs(
        @Nullable Input<VirtualGatewaySpecListenerConnectionPoolGrpcArgs> grpc,
        @Nullable Input<VirtualGatewaySpecListenerConnectionPoolHttpArgs> http,
        @Nullable Input<VirtualGatewaySpecListenerConnectionPoolHttp2Args> http2) {
        this.grpc = grpc;
        this.http = http;
        this.http2 = http2;
    }

    private VirtualGatewaySpecListenerConnectionPoolArgs() {
        this.grpc = Input.empty();
        this.http = Input.empty();
        this.http2 = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecListenerConnectionPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<VirtualGatewaySpecListenerConnectionPoolGrpcArgs> grpc;
        private @Nullable Input<VirtualGatewaySpecListenerConnectionPoolHttpArgs> http;
        private @Nullable Input<VirtualGatewaySpecListenerConnectionPoolHttp2Args> http2;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecListenerConnectionPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.grpc = defaults.grpc;
    	      this.http = defaults.http;
    	      this.http2 = defaults.http2;
        }

        public Builder setGrpc(@Nullable Input<VirtualGatewaySpecListenerConnectionPoolGrpcArgs> grpc) {
            this.grpc = grpc;
            return this;
        }

        public Builder setGrpc(@Nullable VirtualGatewaySpecListenerConnectionPoolGrpcArgs grpc) {
            this.grpc = Input.ofNullable(grpc);
            return this;
        }

        public Builder setHttp(@Nullable Input<VirtualGatewaySpecListenerConnectionPoolHttpArgs> http) {
            this.http = http;
            return this;
        }

        public Builder setHttp(@Nullable VirtualGatewaySpecListenerConnectionPoolHttpArgs http) {
            this.http = Input.ofNullable(http);
            return this;
        }

        public Builder setHttp2(@Nullable Input<VirtualGatewaySpecListenerConnectionPoolHttp2Args> http2) {
            this.http2 = http2;
            return this;
        }

        public Builder setHttp2(@Nullable VirtualGatewaySpecListenerConnectionPoolHttp2Args http2) {
            this.http2 = Input.ofNullable(http2);
            return this;
        }
        public VirtualGatewaySpecListenerConnectionPoolArgs build() {
            return new VirtualGatewaySpecListenerConnectionPoolArgs(grpc, http, http2);
        }
    }
}
