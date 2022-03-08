// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetClusterMasterAuthorizedNetworksConfigCidrBlock {
    private final String cidrBlock;
    private final String displayName;

    @OutputCustomType.Constructor({"cidrBlock","displayName"})
    private GetClusterMasterAuthorizedNetworksConfigCidrBlock(
        String cidrBlock,
        String displayName) {
        this.cidrBlock = cidrBlock;
        this.displayName = displayName;
    }

    public String getCidrBlock() {
        return this.cidrBlock;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterMasterAuthorizedNetworksConfigCidrBlock defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cidrBlock;
        private String displayName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterMasterAuthorizedNetworksConfigCidrBlock defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.displayName = defaults.displayName;
        }

        public Builder setCidrBlock(String cidrBlock) {
            this.cidrBlock = Objects.requireNonNull(cidrBlock);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public GetClusterMasterAuthorizedNetworksConfigCidrBlock build() {
            return new GetClusterMasterAuthorizedNetworksConfigCidrBlock(cidrBlock, displayName);
        }
    }
}
