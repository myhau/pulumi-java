// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VpcPeeringConnectivityResponse {
    /**
     * The name of the VPC network to peer with the Cloud SQL private network.
     * 
     */
    private final String vpc;

    @OutputCustomType.Constructor({"vpc"})
    private VpcPeeringConnectivityResponse(String vpc) {
        this.vpc = vpc;
    }

    /**
     * The name of the VPC network to peer with the Cloud SQL private network.
     * 
    */
    public String getVpc() {
        return this.vpc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcPeeringConnectivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String vpc;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcPeeringConnectivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vpc = defaults.vpc;
        }

        public Builder setVpc(String vpc) {
            this.vpc = Objects.requireNonNull(vpc);
            return this;
        }
        public VpcPeeringConnectivityResponse build() {
            return new VpcPeeringConnectivityResponse(vpc);
        }
    }
}
