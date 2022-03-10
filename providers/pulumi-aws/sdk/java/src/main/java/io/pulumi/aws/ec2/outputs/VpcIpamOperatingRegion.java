// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VpcIpamOperatingRegion {
    /**
     * The name of the Region you want to add to the IPAM.
     * 
     */
    private final String regionName;

    @OutputCustomType.Constructor({"regionName"})
    private VpcIpamOperatingRegion(String regionName) {
        this.regionName = regionName;
    }

    /**
     * The name of the Region you want to add to the IPAM.
     * 
    */
    public String getRegionName() {
        return this.regionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcIpamOperatingRegion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String regionName;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcIpamOperatingRegion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regionName = defaults.regionName;
        }

        public Builder setRegionName(String regionName) {
            this.regionName = Objects.requireNonNull(regionName);
            return this;
        }
        public VpcIpamOperatingRegion build() {
            return new VpcIpamOperatingRegion(regionName);
        }
    }
}