// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * BGP settings details for a link.
 * 
 */
public final class VpnLinkBgpSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final VpnLinkBgpSettingsResponse Empty = new VpnLinkBgpSettingsResponse();

    /**
     * The BGP speaker's ASN.
     * 
     */
    @Import(name="asn")
      private final @Nullable Double asn;

    public Optional<Double> asn() {
        return this.asn == null ? Optional.empty() : Optional.ofNullable(this.asn);
    }

    /**
     * The BGP peering address and BGP identifier of this BGP speaker.
     * 
     */
    @Import(name="bgpPeeringAddress")
      private final @Nullable String bgpPeeringAddress;

    public Optional<String> bgpPeeringAddress() {
        return this.bgpPeeringAddress == null ? Optional.empty() : Optional.ofNullable(this.bgpPeeringAddress);
    }

    public VpnLinkBgpSettingsResponse(
        @Nullable Double asn,
        @Nullable String bgpPeeringAddress) {
        this.asn = asn;
        this.bgpPeeringAddress = bgpPeeringAddress;
    }

    private VpnLinkBgpSettingsResponse() {
        this.asn = null;
        this.bgpPeeringAddress = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnLinkBgpSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double asn;
        private @Nullable String bgpPeeringAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnLinkBgpSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asn = defaults.asn;
    	      this.bgpPeeringAddress = defaults.bgpPeeringAddress;
        }

        public Builder asn(@Nullable Double asn) {
            this.asn = asn;
            return this;
        }
        public Builder bgpPeeringAddress(@Nullable String bgpPeeringAddress) {
            this.bgpPeeringAddress = bgpPeeringAddress;
            return this;
        }        public VpnLinkBgpSettingsResponse build() {
            return new VpnLinkBgpSettingsResponse(asn, bgpPeeringAddress);
        }
    }
}
