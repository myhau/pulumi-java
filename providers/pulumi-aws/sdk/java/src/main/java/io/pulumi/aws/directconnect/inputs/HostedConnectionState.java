// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directconnect.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HostedConnectionState extends io.pulumi.resources.ResourceArgs {

    public static final HostedConnectionState Empty = new HostedConnectionState();

    /**
     * The Direct Connect endpoint on which the physical connection terminates.
     * 
     */
    @InputImport(name="awsDevice")
      private final @Nullable Input<String> awsDevice;

    public Input<String> getAwsDevice() {
        return this.awsDevice == null ? Input.empty() : this.awsDevice;
    }

    /**
     * The bandwidth of the connection. Valid values for dedicated connections: 1Gbps, 10Gbps. Valid values for hosted connections: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps and 10Gbps. Case sensitive.
     * 
     */
    @InputImport(name="bandwidth")
      private final @Nullable Input<String> bandwidth;

    public Input<String> getBandwidth() {
        return this.bandwidth == null ? Input.empty() : this.bandwidth;
    }

    /**
     * The ID of the interconnect or LAG.
     * 
     */
    @InputImport(name="connectionId")
      private final @Nullable Input<String> connectionId;

    public Input<String> getConnectionId() {
        return this.connectionId == null ? Input.empty() : this.connectionId;
    }

    /**
     * Indicates whether the connection supports a secondary BGP peer in the same address family (IPv4/IPv6).
     * 
     */
    @InputImport(name="hasLogicalRedundancy")
      private final @Nullable Input<String> hasLogicalRedundancy;

    public Input<String> getHasLogicalRedundancy() {
        return this.hasLogicalRedundancy == null ? Input.empty() : this.hasLogicalRedundancy;
    }

    /**
     * Boolean value representing if jumbo frames have been enabled for this connection.
     * 
     */
    @InputImport(name="jumboFrameCapable")
      private final @Nullable Input<Boolean> jumboFrameCapable;

    public Input<Boolean> getJumboFrameCapable() {
        return this.jumboFrameCapable == null ? Input.empty() : this.jumboFrameCapable;
    }

    /**
     * The ID of the LAG.
     * 
     */
    @InputImport(name="lagId")
      private final @Nullable Input<String> lagId;

    public Input<String> getLagId() {
        return this.lagId == null ? Input.empty() : this.lagId;
    }

    /**
     * The time of the most recent call to [DescribeLoa](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeLoa.html) for this connection.
     * 
     */
    @InputImport(name="loaIssueTime")
      private final @Nullable Input<String> loaIssueTime;

    public Input<String> getLoaIssueTime() {
        return this.loaIssueTime == null ? Input.empty() : this.loaIssueTime;
    }

    /**
     * The location of the connection.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the connection.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the AWS account of the customer for the connection.
     * 
     */
    @InputImport(name="ownerAccountId")
      private final @Nullable Input<String> ownerAccountId;

    public Input<String> getOwnerAccountId() {
        return this.ownerAccountId == null ? Input.empty() : this.ownerAccountId;
    }

    /**
     * The name of the AWS Direct Connect service provider associated with the connection.
     * 
     */
    @InputImport(name="partnerName")
      private final @Nullable Input<String> partnerName;

    public Input<String> getPartnerName() {
        return this.partnerName == null ? Input.empty() : this.partnerName;
    }

    /**
     * The name of the service provider associated with the connection.
     * 
     */
    @InputImport(name="providerName")
      private final @Nullable Input<String> providerName;

    public Input<String> getProviderName() {
        return this.providerName == null ? Input.empty() : this.providerName;
    }

    /**
     * The AWS Region where the connection is located.
     * 
     */
    @InputImport(name="region")
      private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * The state of the connection. Possible values include: ordering, requested, pending, available, down, deleting, deleted, rejected, unknown. See [AllocateHostedConnection](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_AllocateHostedConnection.html) for a description of each connection state.
     * 
     */
    @InputImport(name="state")
      private final @Nullable Input<String> state;

    public Input<String> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    /**
     * The dedicated VLAN provisioned to the hosted connection.
     * 
     */
    @InputImport(name="vlan")
      private final @Nullable Input<Integer> vlan;

    public Input<Integer> getVlan() {
        return this.vlan == null ? Input.empty() : this.vlan;
    }

    public HostedConnectionState(
        @Nullable Input<String> awsDevice,
        @Nullable Input<String> bandwidth,
        @Nullable Input<String> connectionId,
        @Nullable Input<String> hasLogicalRedundancy,
        @Nullable Input<Boolean> jumboFrameCapable,
        @Nullable Input<String> lagId,
        @Nullable Input<String> loaIssueTime,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> ownerAccountId,
        @Nullable Input<String> partnerName,
        @Nullable Input<String> providerName,
        @Nullable Input<String> region,
        @Nullable Input<String> state,
        @Nullable Input<Integer> vlan) {
        this.awsDevice = awsDevice;
        this.bandwidth = bandwidth;
        this.connectionId = connectionId;
        this.hasLogicalRedundancy = hasLogicalRedundancy;
        this.jumboFrameCapable = jumboFrameCapable;
        this.lagId = lagId;
        this.loaIssueTime = loaIssueTime;
        this.location = location;
        this.name = name;
        this.ownerAccountId = ownerAccountId;
        this.partnerName = partnerName;
        this.providerName = providerName;
        this.region = region;
        this.state = state;
        this.vlan = vlan;
    }

    private HostedConnectionState() {
        this.awsDevice = Input.empty();
        this.bandwidth = Input.empty();
        this.connectionId = Input.empty();
        this.hasLogicalRedundancy = Input.empty();
        this.jumboFrameCapable = Input.empty();
        this.lagId = Input.empty();
        this.loaIssueTime = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.ownerAccountId = Input.empty();
        this.partnerName = Input.empty();
        this.providerName = Input.empty();
        this.region = Input.empty();
        this.state = Input.empty();
        this.vlan = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostedConnectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> awsDevice;
        private @Nullable Input<String> bandwidth;
        private @Nullable Input<String> connectionId;
        private @Nullable Input<String> hasLogicalRedundancy;
        private @Nullable Input<Boolean> jumboFrameCapable;
        private @Nullable Input<String> lagId;
        private @Nullable Input<String> loaIssueTime;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> ownerAccountId;
        private @Nullable Input<String> partnerName;
        private @Nullable Input<String> providerName;
        private @Nullable Input<String> region;
        private @Nullable Input<String> state;
        private @Nullable Input<Integer> vlan;

        public Builder() {
    	      // Empty
        }

        public Builder(HostedConnectionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsDevice = defaults.awsDevice;
    	      this.bandwidth = defaults.bandwidth;
    	      this.connectionId = defaults.connectionId;
    	      this.hasLogicalRedundancy = defaults.hasLogicalRedundancy;
    	      this.jumboFrameCapable = defaults.jumboFrameCapable;
    	      this.lagId = defaults.lagId;
    	      this.loaIssueTime = defaults.loaIssueTime;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.ownerAccountId = defaults.ownerAccountId;
    	      this.partnerName = defaults.partnerName;
    	      this.providerName = defaults.providerName;
    	      this.region = defaults.region;
    	      this.state = defaults.state;
    	      this.vlan = defaults.vlan;
        }

        public Builder setAwsDevice(@Nullable Input<String> awsDevice) {
            this.awsDevice = awsDevice;
            return this;
        }

        public Builder setAwsDevice(@Nullable String awsDevice) {
            this.awsDevice = Input.ofNullable(awsDevice);
            return this;
        }

        public Builder setBandwidth(@Nullable Input<String> bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        public Builder setBandwidth(@Nullable String bandwidth) {
            this.bandwidth = Input.ofNullable(bandwidth);
            return this;
        }

        public Builder setConnectionId(@Nullable Input<String> connectionId) {
            this.connectionId = connectionId;
            return this;
        }

        public Builder setConnectionId(@Nullable String connectionId) {
            this.connectionId = Input.ofNullable(connectionId);
            return this;
        }

        public Builder setHasLogicalRedundancy(@Nullable Input<String> hasLogicalRedundancy) {
            this.hasLogicalRedundancy = hasLogicalRedundancy;
            return this;
        }

        public Builder setHasLogicalRedundancy(@Nullable String hasLogicalRedundancy) {
            this.hasLogicalRedundancy = Input.ofNullable(hasLogicalRedundancy);
            return this;
        }

        public Builder setJumboFrameCapable(@Nullable Input<Boolean> jumboFrameCapable) {
            this.jumboFrameCapable = jumboFrameCapable;
            return this;
        }

        public Builder setJumboFrameCapable(@Nullable Boolean jumboFrameCapable) {
            this.jumboFrameCapable = Input.ofNullable(jumboFrameCapable);
            return this;
        }

        public Builder setLagId(@Nullable Input<String> lagId) {
            this.lagId = lagId;
            return this;
        }

        public Builder setLagId(@Nullable String lagId) {
            this.lagId = Input.ofNullable(lagId);
            return this;
        }

        public Builder setLoaIssueTime(@Nullable Input<String> loaIssueTime) {
            this.loaIssueTime = loaIssueTime;
            return this;
        }

        public Builder setLoaIssueTime(@Nullable String loaIssueTime) {
            this.loaIssueTime = Input.ofNullable(loaIssueTime);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setOwnerAccountId(@Nullable Input<String> ownerAccountId) {
            this.ownerAccountId = ownerAccountId;
            return this;
        }

        public Builder setOwnerAccountId(@Nullable String ownerAccountId) {
            this.ownerAccountId = Input.ofNullable(ownerAccountId);
            return this;
        }

        public Builder setPartnerName(@Nullable Input<String> partnerName) {
            this.partnerName = partnerName;
            return this;
        }

        public Builder setPartnerName(@Nullable String partnerName) {
            this.partnerName = Input.ofNullable(partnerName);
            return this;
        }

        public Builder setProviderName(@Nullable Input<String> providerName) {
            this.providerName = providerName;
            return this;
        }

        public Builder setProviderName(@Nullable String providerName) {
            this.providerName = Input.ofNullable(providerName);
            return this;
        }

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder setState(@Nullable Input<String> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Builder setVlan(@Nullable Input<Integer> vlan) {
            this.vlan = vlan;
            return this;
        }

        public Builder setVlan(@Nullable Integer vlan) {
            this.vlan = Input.ofNullable(vlan);
            return this;
        }
        public HostedConnectionState build() {
            return new HostedConnectionState(awsDevice, bandwidth, connectionId, hasLogicalRedundancy, jumboFrameCapable, lagId, loaIssueTime, location, name, ownerAccountId, partnerName, providerName, region, state, vlan);
        }
    }
}
