// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutGrpcArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutHttp2Args;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutHttpArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutTcpArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecListenerTimeoutArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerTimeoutArgs Empty = new VirtualNodeSpecListenerTimeoutArgs();

    /**
     * Timeouts for gRPC listeners.
     * 
     */
    @InputImport(name="grpc")
      private final @Nullable Input<VirtualNodeSpecListenerTimeoutGrpcArgs> grpc;

    public Input<VirtualNodeSpecListenerTimeoutGrpcArgs> getGrpc() {
        return this.grpc == null ? Input.empty() : this.grpc;
    }

    /**
     * Timeouts for HTTP listeners.
     * 
     */
    @InputImport(name="http")
      private final @Nullable Input<VirtualNodeSpecListenerTimeoutHttpArgs> http;

    public Input<VirtualNodeSpecListenerTimeoutHttpArgs> getHttp() {
        return this.http == null ? Input.empty() : this.http;
    }

    /**
     * Timeouts for HTTP2 listeners.
     * 
     */
    @InputImport(name="http2")
      private final @Nullable Input<VirtualNodeSpecListenerTimeoutHttp2Args> http2;

    public Input<VirtualNodeSpecListenerTimeoutHttp2Args> getHttp2() {
        return this.http2 == null ? Input.empty() : this.http2;
    }

    /**
     * Timeouts for TCP listeners.
     * 
     */
    @InputImport(name="tcp")
      private final @Nullable Input<VirtualNodeSpecListenerTimeoutTcpArgs> tcp;

    public Input<VirtualNodeSpecListenerTimeoutTcpArgs> getTcp() {
        return this.tcp == null ? Input.empty() : this.tcp;
    }

    public VirtualNodeSpecListenerTimeoutArgs(
        @Nullable Input<VirtualNodeSpecListenerTimeoutGrpcArgs> grpc,
        @Nullable Input<VirtualNodeSpecListenerTimeoutHttpArgs> http,
        @Nullable Input<VirtualNodeSpecListenerTimeoutHttp2Args> http2,
        @Nullable Input<VirtualNodeSpecListenerTimeoutTcpArgs> tcp) {
        this.grpc = grpc;
        this.http = http;
        this.http2 = http2;
        this.tcp = tcp;
    }

    private VirtualNodeSpecListenerTimeoutArgs() {
        this.grpc = Input.empty();
        this.http = Input.empty();
        this.http2 = Input.empty();
        this.tcp = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerTimeoutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<VirtualNodeSpecListenerTimeoutGrpcArgs> grpc;
        private @Nullable Input<VirtualNodeSpecListenerTimeoutHttpArgs> http;
        private @Nullable Input<VirtualNodeSpecListenerTimeoutHttp2Args> http2;
        private @Nullable Input<VirtualNodeSpecListenerTimeoutTcpArgs> tcp;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerTimeoutArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.grpc = defaults.grpc;
    	      this.http = defaults.http;
    	      this.http2 = defaults.http2;
    	      this.tcp = defaults.tcp;
        }

        public Builder setGrpc(@Nullable Input<VirtualNodeSpecListenerTimeoutGrpcArgs> grpc) {
            this.grpc = grpc;
            return this;
        }

        public Builder setGrpc(@Nullable VirtualNodeSpecListenerTimeoutGrpcArgs grpc) {
            this.grpc = Input.ofNullable(grpc);
            return this;
        }

        public Builder setHttp(@Nullable Input<VirtualNodeSpecListenerTimeoutHttpArgs> http) {
            this.http = http;
            return this;
        }

        public Builder setHttp(@Nullable VirtualNodeSpecListenerTimeoutHttpArgs http) {
            this.http = Input.ofNullable(http);
            return this;
        }

        public Builder setHttp2(@Nullable Input<VirtualNodeSpecListenerTimeoutHttp2Args> http2) {
            this.http2 = http2;
            return this;
        }

        public Builder setHttp2(@Nullable VirtualNodeSpecListenerTimeoutHttp2Args http2) {
            this.http2 = Input.ofNullable(http2);
            return this;
        }

        public Builder setTcp(@Nullable Input<VirtualNodeSpecListenerTimeoutTcpArgs> tcp) {
            this.tcp = tcp;
            return this;
        }

        public Builder setTcp(@Nullable VirtualNodeSpecListenerTimeoutTcpArgs tcp) {
            this.tcp = Input.ofNullable(tcp);
            return this;
        }
        public VirtualNodeSpecListenerTimeoutArgs build() {
            return new VirtualNodeSpecListenerTimeoutArgs(grpc, http, http2, tcp);
        }
    }
}
