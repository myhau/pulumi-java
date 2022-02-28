// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutHttpIdleGetArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutHttpPerRequestGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecListenerTimeoutHttpGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerTimeoutHttpGetArgs Empty = new VirtualNodeSpecListenerTimeoutHttpGetArgs();

    /**
     * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
     */
    @InputImport(name="idle")
      private final @Nullable Input<VirtualNodeSpecListenerTimeoutHttpIdleGetArgs> idle;

    public Input<VirtualNodeSpecListenerTimeoutHttpIdleGetArgs> getIdle() {
        return this.idle == null ? Input.empty() : this.idle;
    }

    /**
     * The per request timeout.
     * 
     */
    @InputImport(name="perRequest")
      private final @Nullable Input<VirtualNodeSpecListenerTimeoutHttpPerRequestGetArgs> perRequest;

    public Input<VirtualNodeSpecListenerTimeoutHttpPerRequestGetArgs> getPerRequest() {
        return this.perRequest == null ? Input.empty() : this.perRequest;
    }

    public VirtualNodeSpecListenerTimeoutHttpGetArgs(
        @Nullable Input<VirtualNodeSpecListenerTimeoutHttpIdleGetArgs> idle,
        @Nullable Input<VirtualNodeSpecListenerTimeoutHttpPerRequestGetArgs> perRequest) {
        this.idle = idle;
        this.perRequest = perRequest;
    }

    private VirtualNodeSpecListenerTimeoutHttpGetArgs() {
        this.idle = Input.empty();
        this.perRequest = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerTimeoutHttpGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<VirtualNodeSpecListenerTimeoutHttpIdleGetArgs> idle;
        private @Nullable Input<VirtualNodeSpecListenerTimeoutHttpPerRequestGetArgs> perRequest;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerTimeoutHttpGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idle = defaults.idle;
    	      this.perRequest = defaults.perRequest;
        }

        public Builder setIdle(@Nullable Input<VirtualNodeSpecListenerTimeoutHttpIdleGetArgs> idle) {
            this.idle = idle;
            return this;
        }

        public Builder setIdle(@Nullable VirtualNodeSpecListenerTimeoutHttpIdleGetArgs idle) {
            this.idle = Input.ofNullable(idle);
            return this;
        }

        public Builder setPerRequest(@Nullable Input<VirtualNodeSpecListenerTimeoutHttpPerRequestGetArgs> perRequest) {
            this.perRequest = perRequest;
            return this;
        }

        public Builder setPerRequest(@Nullable VirtualNodeSpecListenerTimeoutHttpPerRequestGetArgs perRequest) {
            this.perRequest = Input.ofNullable(perRequest);
            return this;
        }
        public VirtualNodeSpecListenerTimeoutHttpGetArgs build() {
            return new VirtualNodeSpecListenerTimeoutHttpGetArgs(idle, perRequest);
        }
    }
}
