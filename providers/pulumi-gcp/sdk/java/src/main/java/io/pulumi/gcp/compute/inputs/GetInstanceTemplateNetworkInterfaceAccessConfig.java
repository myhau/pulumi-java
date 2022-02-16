// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetInstanceTemplateNetworkInterfaceAccessConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetInstanceTemplateNetworkInterfaceAccessConfig Empty = new GetInstanceTemplateNetworkInterfaceAccessConfig();

    @InputImport(name="natIp", required=true)
    private final String natIp;

    public String getNatIp() {
        return this.natIp;
    }

    @InputImport(name="networkTier", required=true)
    private final String networkTier;

    public String getNetworkTier() {
        return this.networkTier;
    }

    @InputImport(name="publicPtrDomainName", required=true)
    private final String publicPtrDomainName;

    public String getPublicPtrDomainName() {
        return this.publicPtrDomainName;
    }

    public GetInstanceTemplateNetworkInterfaceAccessConfig(
        String natIp,
        String networkTier,
        String publicPtrDomainName) {
        this.natIp = Objects.requireNonNull(natIp, "expected parameter 'natIp' to be non-null");
        this.networkTier = Objects.requireNonNull(networkTier, "expected parameter 'networkTier' to be non-null");
        this.publicPtrDomainName = Objects.requireNonNull(publicPtrDomainName, "expected parameter 'publicPtrDomainName' to be non-null");
    }

    private GetInstanceTemplateNetworkInterfaceAccessConfig() {
        this.natIp = null;
        this.networkTier = null;
        this.publicPtrDomainName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTemplateNetworkInterfaceAccessConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String natIp;
        private String networkTier;
        private String publicPtrDomainName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceTemplateNetworkInterfaceAccessConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.natIp = defaults.natIp;
    	      this.networkTier = defaults.networkTier;
    	      this.publicPtrDomainName = defaults.publicPtrDomainName;
        }

        public Builder setNatIp(String natIp) {
            this.natIp = Objects.requireNonNull(natIp);
            return this;
        }

        public Builder setNetworkTier(String networkTier) {
            this.networkTier = Objects.requireNonNull(networkTier);
            return this;
        }

        public Builder setPublicPtrDomainName(String publicPtrDomainName) {
            this.publicPtrDomainName = Objects.requireNonNull(publicPtrDomainName);
            return this;
        }

        public GetInstanceTemplateNetworkInterfaceAccessConfig build() {
            return new GetInstanceTemplateNetworkInterfaceAccessConfig(natIp, networkTier, publicPtrDomainName);
        }
    }
}