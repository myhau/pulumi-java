// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SubnetworkSecondaryRangeResponse {
    /**
     * The range of IP addresses belonging to this subnetwork secondary range. Provide this property when you create the subnetwork. Ranges must be unique and non-overlapping with all primary and secondary IP ranges within a network. Only IPv4 is supported. The range can be any range listed in the Valid ranges list.
     * 
     */
    private final String ipCidrRange;
    /**
     * The name associated with this subnetwork secondary range, used when adding an alias IP range to a VM instance. The name must be 1-63 characters long, and comply with RFC1035. The name must be unique within the subnetwork.
     * 
     */
    private final String rangeName;

    @OutputCustomType.Constructor
    private SubnetworkSecondaryRangeResponse(
        @OutputCustomType.Parameter("ipCidrRange") String ipCidrRange,
        @OutputCustomType.Parameter("rangeName") String rangeName) {
        this.ipCidrRange = ipCidrRange;
        this.rangeName = rangeName;
    }

    /**
     * The range of IP addresses belonging to this subnetwork secondary range. Provide this property when you create the subnetwork. Ranges must be unique and non-overlapping with all primary and secondary IP ranges within a network. Only IPv4 is supported. The range can be any range listed in the Valid ranges list.
     * 
    */
    public String getIpCidrRange() {
        return this.ipCidrRange;
    }
    /**
     * The name associated with this subnetwork secondary range, used when adding an alias IP range to a VM instance. The name must be 1-63 characters long, and comply with RFC1035. The name must be unique within the subnetwork.
     * 
    */
    public String getRangeName() {
        return this.rangeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetworkSecondaryRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipCidrRange;
        private String rangeName;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetworkSecondaryRangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.rangeName = defaults.rangeName;
        }

        public Builder setIpCidrRange(String ipCidrRange) {
            this.ipCidrRange = Objects.requireNonNull(ipCidrRange);
            return this;
        }

        public Builder setRangeName(String rangeName) {
            this.rangeName = Objects.requireNonNull(rangeName);
            return this;
        }
        public SubnetworkSecondaryRangeResponse build() {
            return new SubnetworkSecondaryRangeResponse(ipCidrRange, rangeName);
        }
    }
}
