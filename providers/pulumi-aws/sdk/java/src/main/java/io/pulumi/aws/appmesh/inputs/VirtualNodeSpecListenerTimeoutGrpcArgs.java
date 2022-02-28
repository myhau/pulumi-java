// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutGrpcIdleArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutGrpcPerRequestArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecListenerTimeoutGrpcArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerTimeoutGrpcArgs Empty = new VirtualNodeSpecListenerTimeoutGrpcArgs();

    /**
     * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
     */
    @InputImport(name="idle")
      private final @Nullable Input<VirtualNodeSpecListenerTimeoutGrpcIdleArgs> idle;

    public Input<VirtualNodeSpecListenerTimeoutGrpcIdleArgs> getIdle() {
        return this.idle == null ? Input.empty() : this.idle;
    }

    /**
     * The per request timeout.
     * 
     */
    @InputImport(name="perRequest")
      private final @Nullable Input<VirtualNodeSpecListenerTimeoutGrpcPerRequestArgs> perRequest;

    public Input<VirtualNodeSpecListenerTimeoutGrpcPerRequestArgs> getPerRequest() {
        return this.perRequest == null ? Input.empty() : this.perRequest;
    }

    public VirtualNodeSpecListenerTimeoutGrpcArgs(
        @Nullable Input<VirtualNodeSpecListenerTimeoutGrpcIdleArgs> idle,
        @Nullable Input<VirtualNodeSpecListenerTimeoutGrpcPerRequestArgs> perRequest) {
        this.idle = idle;
        this.perRequest = perRequest;
    }

    private VirtualNodeSpecListenerTimeoutGrpcArgs() {
        this.idle = Input.empty();
        this.perRequest = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerTimeoutGrpcArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<VirtualNodeSpecListenerTimeoutGrpcIdleArgs> idle;
        private @Nullable Input<VirtualNodeSpecListenerTimeoutGrpcPerRequestArgs> perRequest;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerTimeoutGrpcArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idle = defaults.idle;
    	      this.perRequest = defaults.perRequest;
        }

        public Builder setIdle(@Nullable Input<VirtualNodeSpecListenerTimeoutGrpcIdleArgs> idle) {
            this.idle = idle;
            return this;
        }

        public Builder setIdle(@Nullable VirtualNodeSpecListenerTimeoutGrpcIdleArgs idle) {
            this.idle = Input.ofNullable(idle);
            return this;
        }

        public Builder setPerRequest(@Nullable Input<VirtualNodeSpecListenerTimeoutGrpcPerRequestArgs> perRequest) {
            this.perRequest = perRequest;
            return this;
        }

        public Builder setPerRequest(@Nullable VirtualNodeSpecListenerTimeoutGrpcPerRequestArgs perRequest) {
            this.perRequest = Input.ofNullable(perRequest);
            return this;
        }
        public VirtualNodeSpecListenerTimeoutGrpcArgs build() {
            return new VirtualNodeSpecListenerTimeoutGrpcArgs(idle, perRequest);
        }
    }
}
