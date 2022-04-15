// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.inputs;

import io.pulumi.azurenative.labservices.enums.EnableState;
import io.pulumi.azurenative.labservices.enums.ShutdownOnIdleMode;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Profile for how to handle shutting down virtual machines.
 * 
 */
public final class AutoShutdownProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoShutdownProfileArgs Empty = new AutoShutdownProfileArgs();

    /**
     * The amount of time a VM will stay running after a user disconnects if this behavior is enabled.
     * 
     */
    @Import(name="disconnectDelay")
      private final @Nullable Output<String> disconnectDelay;

    public Output<String> disconnectDelay() {
        return this.disconnectDelay == null ? Codegen.empty() : this.disconnectDelay;
    }

    /**
     * The amount of time a VM will idle before it is shutdown if this behavior is enabled.
     * 
     */
    @Import(name="idleDelay")
      private final @Nullable Output<String> idleDelay;

    public Output<String> idleDelay() {
        return this.idleDelay == null ? Codegen.empty() : this.idleDelay;
    }

    /**
     * The amount of time a VM will stay running before it is shutdown if no connection is made and this behavior is enabled.
     * 
     */
    @Import(name="noConnectDelay")
      private final @Nullable Output<String> noConnectDelay;

    public Output<String> noConnectDelay() {
        return this.noConnectDelay == null ? Codegen.empty() : this.noConnectDelay;
    }

    /**
     * Whether shutdown on disconnect is enabled
     * 
     */
    @Import(name="shutdownOnDisconnect")
      private final @Nullable Output<EnableState> shutdownOnDisconnect;

    public Output<EnableState> shutdownOnDisconnect() {
        return this.shutdownOnDisconnect == null ? Codegen.empty() : this.shutdownOnDisconnect;
    }

    /**
     * Whether a VM will get shutdown when it has idled for a period of time.
     * 
     */
    @Import(name="shutdownOnIdle")
      private final @Nullable Output<ShutdownOnIdleMode> shutdownOnIdle;

    public Output<ShutdownOnIdleMode> shutdownOnIdle() {
        return this.shutdownOnIdle == null ? Codegen.empty() : this.shutdownOnIdle;
    }

    /**
     * Whether a VM will get shutdown when it hasn't been connected to after a period of time.
     * 
     */
    @Import(name="shutdownWhenNotConnected")
      private final @Nullable Output<EnableState> shutdownWhenNotConnected;

    public Output<EnableState> shutdownWhenNotConnected() {
        return this.shutdownWhenNotConnected == null ? Codegen.empty() : this.shutdownWhenNotConnected;
    }

    public AutoShutdownProfileArgs(
        @Nullable Output<String> disconnectDelay,
        @Nullable Output<String> idleDelay,
        @Nullable Output<String> noConnectDelay,
        @Nullable Output<EnableState> shutdownOnDisconnect,
        @Nullable Output<ShutdownOnIdleMode> shutdownOnIdle,
        @Nullable Output<EnableState> shutdownWhenNotConnected) {
        this.disconnectDelay = disconnectDelay;
        this.idleDelay = idleDelay;
        this.noConnectDelay = noConnectDelay;
        this.shutdownOnDisconnect = shutdownOnDisconnect == null ? Codegen.ofNullable(io.pulumi.azurenative.labservices.enums.EnableState.Disabled) : shutdownOnDisconnect;
        this.shutdownOnIdle = shutdownOnIdle == null ? Codegen.ofNullable(io.pulumi.azurenative.labservices.enums.ShutdownOnIdleMode.None) : shutdownOnIdle;
        this.shutdownWhenNotConnected = shutdownWhenNotConnected == null ? Codegen.ofNullable(io.pulumi.azurenative.labservices.enums.EnableState.Disabled) : shutdownWhenNotConnected;
    }

    private AutoShutdownProfileArgs() {
        this.disconnectDelay = Codegen.empty();
        this.idleDelay = Codegen.empty();
        this.noConnectDelay = Codegen.empty();
        this.shutdownOnDisconnect = Codegen.empty();
        this.shutdownOnIdle = Codegen.empty();
        this.shutdownWhenNotConnected = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoShutdownProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> disconnectDelay;
        private @Nullable Output<String> idleDelay;
        private @Nullable Output<String> noConnectDelay;
        private @Nullable Output<EnableState> shutdownOnDisconnect;
        private @Nullable Output<ShutdownOnIdleMode> shutdownOnIdle;
        private @Nullable Output<EnableState> shutdownWhenNotConnected;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoShutdownProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disconnectDelay = defaults.disconnectDelay;
    	      this.idleDelay = defaults.idleDelay;
    	      this.noConnectDelay = defaults.noConnectDelay;
    	      this.shutdownOnDisconnect = defaults.shutdownOnDisconnect;
    	      this.shutdownOnIdle = defaults.shutdownOnIdle;
    	      this.shutdownWhenNotConnected = defaults.shutdownWhenNotConnected;
        }

        public Builder disconnectDelay(@Nullable Output<String> disconnectDelay) {
            this.disconnectDelay = disconnectDelay;
            return this;
        }
        public Builder disconnectDelay(@Nullable String disconnectDelay) {
            this.disconnectDelay = Codegen.ofNullable(disconnectDelay);
            return this;
        }
        public Builder idleDelay(@Nullable Output<String> idleDelay) {
            this.idleDelay = idleDelay;
            return this;
        }
        public Builder idleDelay(@Nullable String idleDelay) {
            this.idleDelay = Codegen.ofNullable(idleDelay);
            return this;
        }
        public Builder noConnectDelay(@Nullable Output<String> noConnectDelay) {
            this.noConnectDelay = noConnectDelay;
            return this;
        }
        public Builder noConnectDelay(@Nullable String noConnectDelay) {
            this.noConnectDelay = Codegen.ofNullable(noConnectDelay);
            return this;
        }
        public Builder shutdownOnDisconnect(@Nullable Output<EnableState> shutdownOnDisconnect) {
            this.shutdownOnDisconnect = shutdownOnDisconnect;
            return this;
        }
        public Builder shutdownOnDisconnect(@Nullable EnableState shutdownOnDisconnect) {
            this.shutdownOnDisconnect = Codegen.ofNullable(shutdownOnDisconnect);
            return this;
        }
        public Builder shutdownOnIdle(@Nullable Output<ShutdownOnIdleMode> shutdownOnIdle) {
            this.shutdownOnIdle = shutdownOnIdle;
            return this;
        }
        public Builder shutdownOnIdle(@Nullable ShutdownOnIdleMode shutdownOnIdle) {
            this.shutdownOnIdle = Codegen.ofNullable(shutdownOnIdle);
            return this;
        }
        public Builder shutdownWhenNotConnected(@Nullable Output<EnableState> shutdownWhenNotConnected) {
            this.shutdownWhenNotConnected = shutdownWhenNotConnected;
            return this;
        }
        public Builder shutdownWhenNotConnected(@Nullable EnableState shutdownWhenNotConnected) {
            this.shutdownWhenNotConnected = Codegen.ofNullable(shutdownWhenNotConnected);
            return this;
        }        public AutoShutdownProfileArgs build() {
            return new AutoShutdownProfileArgs(disconnectDelay, idleDelay, noConnectDelay, shutdownOnDisconnect, shutdownOnIdle, shutdownWhenNotConnected);
        }
    }
}
