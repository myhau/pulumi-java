// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.BgpPeerStatusResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetVirtualNetworkGatewayBgpPeerStatusResult {
    /**
     * List of BGP peers.
     * 
     */
    private final @Nullable List<BgpPeerStatusResponse> value;

    @CustomType.Constructor
    private GetVirtualNetworkGatewayBgpPeerStatusResult(@CustomType.Parameter("value") @Nullable List<BgpPeerStatusResponse> value) {
        this.value = value;
    }

    /**
     * List of BGP peers.
     * 
    */
    public List<BgpPeerStatusResponse> value() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualNetworkGatewayBgpPeerStatusResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<BgpPeerStatusResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualNetworkGatewayBgpPeerStatusResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder value(@Nullable List<BgpPeerStatusResponse> value) {
            this.value = value;
            return this;
        }
        public Builder value(BgpPeerStatusResponse... value) {
            return value(List.of(value));
        }        public GetVirtualNetworkGatewayBgpPeerStatusResult build() {
            return new GetVirtualNetworkGatewayBgpPeerStatusResult(value);
        }
    }
}
