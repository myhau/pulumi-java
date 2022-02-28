// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class VirtualGatewaySpecListenerPortMappingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecListenerPortMappingGetArgs Empty = new VirtualGatewaySpecListenerPortMappingGetArgs();

    /**
     * The port used for the port mapping.
     * 
     */
    @InputImport(name="port", required=true)
      private final Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port;
    }

    /**
     * The protocol used for the port mapping. Valid values are `http`, `http2`, `tcp` and `grpc`.
     * 
     */
    @InputImport(name="protocol", required=true)
      private final Input<String> protocol;

    public Input<String> getProtocol() {
        return this.protocol;
    }

    public VirtualGatewaySpecListenerPortMappingGetArgs(
        Input<Integer> port,
        Input<String> protocol) {
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
    }

    private VirtualGatewaySpecListenerPortMappingGetArgs() {
        this.port = Input.empty();
        this.protocol = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecListenerPortMappingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> port;
        private Input<String> protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecListenerPortMappingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
        }

        public Builder setPort(Input<Integer> port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Input.of(Objects.requireNonNull(port));
            return this;
        }

        public Builder setProtocol(Input<String> protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder setProtocol(String protocol) {
            this.protocol = Input.of(Objects.requireNonNull(protocol));
            return this;
        }
        public VirtualGatewaySpecListenerPortMappingGetArgs build() {
            return new VirtualGatewaySpecListenerPortMappingGetArgs(port, protocol);
        }
    }
}
