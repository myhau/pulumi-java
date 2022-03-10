// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.DiscoveredResponse;
import java.util.Objects;

@OutputCustomType
public final class GrafeasV1beta1DiscoveryDetailsResponse {
    /**
     * Analysis status for the discovered resource.
     * 
     */
    private final DiscoveredResponse discovered;

    @OutputCustomType.Constructor
    private GrafeasV1beta1DiscoveryDetailsResponse(@OutputCustomType.Parameter("discovered") DiscoveredResponse discovered) {
        this.discovered = discovered;
    }

    /**
     * Analysis status for the discovered resource.
     * 
    */
    public DiscoveredResponse getDiscovered() {
        return this.discovered;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrafeasV1beta1DiscoveryDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiscoveredResponse discovered;

        public Builder() {
    	      // Empty
        }

        public Builder(GrafeasV1beta1DiscoveryDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.discovered = defaults.discovered;
        }

        public Builder setDiscovered(DiscoveredResponse discovered) {
            this.discovered = Objects.requireNonNull(discovered);
            return this;
        }
        public GrafeasV1beta1DiscoveryDetailsResponse build() {
            return new GrafeasV1beta1DiscoveryDetailsResponse(discovered);
        }
    }
}
