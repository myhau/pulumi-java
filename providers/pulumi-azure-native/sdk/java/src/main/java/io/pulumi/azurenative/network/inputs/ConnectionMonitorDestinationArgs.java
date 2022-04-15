// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the destination of connection monitor.
 * 
 */
public final class ConnectionMonitorDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionMonitorDestinationArgs Empty = new ConnectionMonitorDestinationArgs();

    /**
     * Address of the connection monitor destination (IP or domain name).
     * 
     */
    @Import(name="address")
      private final @Nullable Output<String> address;

    public Output<String> address() {
        return this.address == null ? Codegen.empty() : this.address;
    }

    /**
     * The destination port used by connection monitor.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> port() {
        return this.port == null ? Codegen.empty() : this.port;
    }

    /**
     * The ID of the resource used as the destination by connection monitor.
     * 
     */
    @Import(name="resourceId")
      private final @Nullable Output<String> resourceId;

    public Output<String> resourceId() {
        return this.resourceId == null ? Codegen.empty() : this.resourceId;
    }

    public ConnectionMonitorDestinationArgs(
        @Nullable Output<String> address,
        @Nullable Output<Integer> port,
        @Nullable Output<String> resourceId) {
        this.address = address;
        this.port = port;
        this.resourceId = resourceId;
    }

    private ConnectionMonitorDestinationArgs() {
        this.address = Codegen.empty();
        this.port = Codegen.empty();
        this.resourceId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionMonitorDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> address;
        private @Nullable Output<Integer> port;
        private @Nullable Output<String> resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionMonitorDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.port = defaults.port;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder address(@Nullable Output<String> address) {
            this.address = address;
            return this;
        }
        public Builder address(@Nullable String address) {
            this.address = Codegen.ofNullable(address);
            return this;
        }
        public Builder port(@Nullable Output<Integer> port) {
            this.port = port;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = Codegen.ofNullable(port);
            return this;
        }
        public Builder resourceId(@Nullable Output<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = Codegen.ofNullable(resourceId);
            return this;
        }        public ConnectionMonitorDestinationArgs build() {
            return new ConnectionMonitorDestinationArgs(address, port, resourceId);
        }
    }
}
