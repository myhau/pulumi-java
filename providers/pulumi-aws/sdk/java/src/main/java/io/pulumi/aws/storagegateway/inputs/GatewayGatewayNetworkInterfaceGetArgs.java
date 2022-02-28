// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.storagegateway.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GatewayGatewayNetworkInterfaceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayGatewayNetworkInterfaceGetArgs Empty = new GatewayGatewayNetworkInterfaceGetArgs();

    /**
     * The Internet Protocol version 4 (IPv4) address of the interface.
     * 
     */
    @InputImport(name="ipv4Address")
      private final @Nullable Input<String> ipv4Address;

    public Input<String> getIpv4Address() {
        return this.ipv4Address == null ? Input.empty() : this.ipv4Address;
    }

    public GatewayGatewayNetworkInterfaceGetArgs(@Nullable Input<String> ipv4Address) {
        this.ipv4Address = ipv4Address;
    }

    private GatewayGatewayNetworkInterfaceGetArgs() {
        this.ipv4Address = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayGatewayNetworkInterfaceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> ipv4Address;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayGatewayNetworkInterfaceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipv4Address = defaults.ipv4Address;
        }

        public Builder setIpv4Address(@Nullable Input<String> ipv4Address) {
            this.ipv4Address = ipv4Address;
            return this;
        }

        public Builder setIpv4Address(@Nullable String ipv4Address) {
            this.ipv4Address = Input.ofNullable(ipv4Address);
            return this;
        }
        public GatewayGatewayNetworkInterfaceGetArgs build() {
            return new GatewayGatewayNetworkInterfaceGetArgs(ipv4Address);
        }
    }
}
