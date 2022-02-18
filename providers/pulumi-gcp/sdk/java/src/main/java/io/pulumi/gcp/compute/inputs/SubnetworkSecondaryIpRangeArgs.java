// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class SubnetworkSecondaryIpRangeArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubnetworkSecondaryIpRangeArgs Empty = new SubnetworkSecondaryIpRangeArgs();

    /**
     * The range of IP addresses belonging to this subnetwork secondary
     * range. Provide this property when you create the subnetwork.
     * Ranges must be unique and non-overlapping with all primary and
     * secondary IP ranges within a network. Only IPv4 is supported.
     * 
     */
    @InputImport(name="ipCidrRange", required=true)
    private final Input<String> ipCidrRange;

    public Input<String> getIpCidrRange() {
        return this.ipCidrRange;
    }

    /**
     * The name associated with this subnetwork secondary range, used
     * when adding an alias IP range to a VM instance. The name must
     * be 1-63 characters long, and comply with RFC1035. The name
     * must be unique within the subnetwork.
     * 
     */
    @InputImport(name="rangeName", required=true)
    private final Input<String> rangeName;

    public Input<String> getRangeName() {
        return this.rangeName;
    }

    public SubnetworkSecondaryIpRangeArgs(
        Input<String> ipCidrRange,
        Input<String> rangeName) {
        this.ipCidrRange = Objects.requireNonNull(ipCidrRange, "expected parameter 'ipCidrRange' to be non-null");
        this.rangeName = Objects.requireNonNull(rangeName, "expected parameter 'rangeName' to be non-null");
    }

    private SubnetworkSecondaryIpRangeArgs() {
        this.ipCidrRange = Input.empty();
        this.rangeName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetworkSecondaryIpRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> ipCidrRange;
        private Input<String> rangeName;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetworkSecondaryIpRangeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.rangeName = defaults.rangeName;
        }

        public Builder setIpCidrRange(Input<String> ipCidrRange) {
            this.ipCidrRange = Objects.requireNonNull(ipCidrRange);
            return this;
        }

        public Builder setIpCidrRange(String ipCidrRange) {
            this.ipCidrRange = Input.of(Objects.requireNonNull(ipCidrRange));
            return this;
        }

        public Builder setRangeName(Input<String> rangeName) {
            this.rangeName = Objects.requireNonNull(rangeName);
            return this;
        }

        public Builder setRangeName(String rangeName) {
            this.rangeName = Input.of(Objects.requireNonNull(rangeName));
            return this;
        }

        public SubnetworkSecondaryIpRangeArgs build() {
            return new SubnetworkSecondaryIpRangeArgs(ipCidrRange, rangeName);
        }
    }
}
