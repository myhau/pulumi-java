// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FirewallSubnetMapping {
    /**
     * A SubnetId.
     * 
     */
    private final String subnetId;

    @OutputCustomType.Constructor({"subnetId"})
    private FirewallSubnetMapping(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * A SubnetId.
     * 
    */
    public String getSubnetId() {
        return this.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallSubnetMapping defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallSubnetMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnetId = defaults.subnetId;
        }

        public Builder setSubnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public FirewallSubnetMapping build() {
            return new FirewallSubnetMapping(subnetId);
        }
    }
}
