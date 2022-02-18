// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkconnectivity.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class SpokeLinkedVpnTunnels {
    /**
     * A value that controls whether site-to-site data transfer is enabled for these resources. Note that data transfer is available only in supported locations.
     * 
     */
    private final Boolean siteToSiteDataTransfer;
    /**
     * The URIs of linked VPN tunnel resources.
     * 
     */
    private final List<String> uris;

    @OutputCustomType.Constructor({"siteToSiteDataTransfer","uris"})
    private SpokeLinkedVpnTunnels(
        Boolean siteToSiteDataTransfer,
        List<String> uris) {
        this.siteToSiteDataTransfer = Objects.requireNonNull(siteToSiteDataTransfer);
        this.uris = Objects.requireNonNull(uris);
    }

    /**
     * A value that controls whether site-to-site data transfer is enabled for these resources. Note that data transfer is available only in supported locations.
     * 
     */
    public Boolean getSiteToSiteDataTransfer() {
        return this.siteToSiteDataTransfer;
    }
    /**
     * The URIs of linked VPN tunnel resources.
     * 
     */
    public List<String> getUris() {
        return this.uris;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpokeLinkedVpnTunnels defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean siteToSiteDataTransfer;
        private List<String> uris;

        public Builder() {
    	      // Empty
        }

        public Builder(SpokeLinkedVpnTunnels defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.siteToSiteDataTransfer = defaults.siteToSiteDataTransfer;
    	      this.uris = defaults.uris;
        }

        public Builder setSiteToSiteDataTransfer(Boolean siteToSiteDataTransfer) {
            this.siteToSiteDataTransfer = Objects.requireNonNull(siteToSiteDataTransfer);
            return this;
        }

        public Builder setUris(List<String> uris) {
            this.uris = Objects.requireNonNull(uris);
            return this;
        }

        public SpokeLinkedVpnTunnels build() {
            return new SpokeLinkedVpnTunnels(siteToSiteDataTransfer, uris);
        }
    }
}
