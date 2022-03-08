// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directoryservice.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class DirectoryConnectSettings {
    private final @Nullable List<String> availabilityZones;
    /**
     * The IP addresses of the AD Connector servers.
     * 
     */
    private final @Nullable List<String> connectIps;
    /**
     * The DNS IP addresses of the domain to connect to.
     * 
     */
    private final List<String> customerDnsIps;
    /**
     * The username corresponding to the password provided.
     * 
     */
    private final String customerUsername;
    /**
     * The identifiers of the subnets for the directory servers (2 subnets in 2 different AZs).
     * 
     */
    private final List<String> subnetIds;
    /**
     * The identifier of the VPC that the directory is in.
     * 
     */
    private final String vpcId;

    @OutputCustomType.Constructor({"availabilityZones","connectIps","customerDnsIps","customerUsername","subnetIds","vpcId"})
    private DirectoryConnectSettings(
        @Nullable List<String> availabilityZones,
        @Nullable List<String> connectIps,
        List<String> customerDnsIps,
        String customerUsername,
        List<String> subnetIds,
        String vpcId) {
        this.availabilityZones = availabilityZones;
        this.connectIps = connectIps;
        this.customerDnsIps = customerDnsIps;
        this.customerUsername = customerUsername;
        this.subnetIds = subnetIds;
        this.vpcId = vpcId;
    }

    public List<String> getAvailabilityZones() {
        return this.availabilityZones == null ? List.of() : this.availabilityZones;
    }
    /**
     * The IP addresses of the AD Connector servers.
     * 
    */
    public List<String> getConnectIps() {
        return this.connectIps == null ? List.of() : this.connectIps;
    }
    /**
     * The DNS IP addresses of the domain to connect to.
     * 
    */
    public List<String> getCustomerDnsIps() {
        return this.customerDnsIps;
    }
    /**
     * The username corresponding to the password provided.
     * 
    */
    public String getCustomerUsername() {
        return this.customerUsername;
    }
    /**
     * The identifiers of the subnets for the directory servers (2 subnets in 2 different AZs).
     * 
    */
    public List<String> getSubnetIds() {
        return this.subnetIds;
    }
    /**
     * The identifier of the VPC that the directory is in.
     * 
    */
    public String getVpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DirectoryConnectSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> availabilityZones;
        private @Nullable List<String> connectIps;
        private List<String> customerDnsIps;
        private String customerUsername;
        private List<String> subnetIds;
        private String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(DirectoryConnectSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.connectIps = defaults.connectIps;
    	      this.customerDnsIps = defaults.customerDnsIps;
    	      this.customerUsername = defaults.customerUsername;
    	      this.subnetIds = defaults.subnetIds;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setAvailabilityZones(@Nullable List<String> availabilityZones) {
            this.availabilityZones = availabilityZones;
            return this;
        }

        public Builder setConnectIps(@Nullable List<String> connectIps) {
            this.connectIps = connectIps;
            return this;
        }

        public Builder setCustomerDnsIps(List<String> customerDnsIps) {
            this.customerDnsIps = Objects.requireNonNull(customerDnsIps);
            return this;
        }

        public Builder setCustomerUsername(String customerUsername) {
            this.customerUsername = Objects.requireNonNull(customerUsername);
            return this;
        }

        public Builder setSubnetIds(List<String> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }

        public Builder setVpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public DirectoryConnectSettings build() {
            return new DirectoryConnectSettings(availabilityZones, connectIps, customerDnsIps, customerUsername, subnetIds, vpcId);
        }
    }
}
