// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkconnectivity.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.networkconnectivity.outputs.SpokeLinkedRouterApplianceInstancesInstance;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class SpokeLinkedRouterApplianceInstances {
    /**
     * The list of router appliance instances
     * 
     */
    private final List<SpokeLinkedRouterApplianceInstancesInstance> instances;
    /**
     * A value that controls whether site-to-site data transfer is enabled for these resources. Note that data transfer is available only in supported locations.
     * 
     */
    private final Boolean siteToSiteDataTransfer;

    @OutputCustomType.Constructor({"instances","siteToSiteDataTransfer"})
    private SpokeLinkedRouterApplianceInstances(
        List<SpokeLinkedRouterApplianceInstancesInstance> instances,
        Boolean siteToSiteDataTransfer) {
        this.instances = Objects.requireNonNull(instances);
        this.siteToSiteDataTransfer = Objects.requireNonNull(siteToSiteDataTransfer);
    }

    /**
     * The list of router appliance instances
     * 
     */
    public List<SpokeLinkedRouterApplianceInstancesInstance> getInstances() {
        return this.instances;
    }
    /**
     * A value that controls whether site-to-site data transfer is enabled for these resources. Note that data transfer is available only in supported locations.
     * 
     */
    public Boolean getSiteToSiteDataTransfer() {
        return this.siteToSiteDataTransfer;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpokeLinkedRouterApplianceInstances defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<SpokeLinkedRouterApplianceInstancesInstance> instances;
        private Boolean siteToSiteDataTransfer;

        public Builder() {
    	      // Empty
        }

        public Builder(SpokeLinkedRouterApplianceInstances defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instances = defaults.instances;
    	      this.siteToSiteDataTransfer = defaults.siteToSiteDataTransfer;
        }

        public Builder setInstances(List<SpokeLinkedRouterApplianceInstancesInstance> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }

        public Builder setSiteToSiteDataTransfer(Boolean siteToSiteDataTransfer) {
            this.siteToSiteDataTransfer = Objects.requireNonNull(siteToSiteDataTransfer);
            return this;
        }

        public SpokeLinkedRouterApplianceInstances build() {
            return new SpokeLinkedRouterApplianceInstances(instances, siteToSiteDataTransfer);
        }
    }
}
