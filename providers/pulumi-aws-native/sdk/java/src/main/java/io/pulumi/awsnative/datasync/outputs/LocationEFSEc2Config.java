// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class LocationEFSEc2Config {
    private final List<String> securityGroupArns;
    private final String subnetArn;

    @OutputCustomType.Constructor({"securityGroupArns","subnetArn"})
    private LocationEFSEc2Config(
        List<String> securityGroupArns,
        String subnetArn) {
        this.securityGroupArns = Objects.requireNonNull(securityGroupArns);
        this.subnetArn = Objects.requireNonNull(subnetArn);
    }

    public List<String> getSecurityGroupArns() {
        return this.securityGroupArns;
    }
    public String getSubnetArn() {
        return this.subnetArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationEFSEc2Config defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> securityGroupArns;
        private String subnetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationEFSEc2Config defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupArns = defaults.securityGroupArns;
    	      this.subnetArn = defaults.subnetArn;
        }

        public Builder setSecurityGroupArns(List<String> securityGroupArns) {
            this.securityGroupArns = Objects.requireNonNull(securityGroupArns);
            return this;
        }

        public Builder setSubnetArn(String subnetArn) {
            this.subnetArn = Objects.requireNonNull(subnetArn);
            return this;
        }

        public LocationEFSEc2Config build() {
            return new LocationEFSEc2Config(securityGroupArns, subnetArn);
        }
    }
}