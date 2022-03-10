// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.composer_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.composer_v1beta1.outputs.CidrBlockResponse;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class MasterAuthorizedNetworksConfigResponse {
    /**
     * cidr_blocks define up to 50 external networks that could access Kubernetes master through HTTPS.
     * 
     */
    private final List<CidrBlockResponse> cidrBlocks;
    /**
     * Whether or not master authorized networks is enabled.
     * 
     */
    private final Boolean enabled;

    @OutputCustomType.Constructor
    private MasterAuthorizedNetworksConfigResponse(
        @OutputCustomType.Parameter("cidrBlocks") List<CidrBlockResponse> cidrBlocks,
        @OutputCustomType.Parameter("enabled") Boolean enabled) {
        this.cidrBlocks = cidrBlocks;
        this.enabled = enabled;
    }

    /**
     * cidr_blocks define up to 50 external networks that could access Kubernetes master through HTTPS.
     * 
    */
    public List<CidrBlockResponse> getCidrBlocks() {
        return this.cidrBlocks;
    }
    /**
     * Whether or not master authorized networks is enabled.
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MasterAuthorizedNetworksConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<CidrBlockResponse> cidrBlocks;
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(MasterAuthorizedNetworksConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlocks = defaults.cidrBlocks;
    	      this.enabled = defaults.enabled;
        }

        public Builder setCidrBlocks(List<CidrBlockResponse> cidrBlocks) {
            this.cidrBlocks = Objects.requireNonNull(cidrBlocks);
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public MasterAuthorizedNetworksConfigResponse build() {
            return new MasterAuthorizedNetworksConfigResponse(cidrBlocks, enabled);
        }
    }
}
