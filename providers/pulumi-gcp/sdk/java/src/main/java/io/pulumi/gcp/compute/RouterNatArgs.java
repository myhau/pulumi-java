// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.RouterNatLogConfigArgs;
import io.pulumi.gcp.compute.inputs.RouterNatSubnetworkArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouterNatArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouterNatArgs Empty = new RouterNatArgs();

    /**
     * A list of URLs of the IP resources to be drained. These IPs must be
     * valid static external IPs that have been assigned to the NAT.
     * 
     */
    @InputImport(name="drainNatIps")
    private final @Nullable Input<List<String>> drainNatIps;

    public Input<List<String>> getDrainNatIps() {
        return this.drainNatIps == null ? Input.empty() : this.drainNatIps;
    }

    /**
     * Specifies if endpoint independent mapping is enabled. This is enabled by default. For more information
     * see the [official documentation](https://cloud.google.com/nat/docs/overview#specs-rfcs).
     * 
     */
    @InputImport(name="enableEndpointIndependentMapping")
    private final @Nullable Input<Boolean> enableEndpointIndependentMapping;

    public Input<Boolean> getEnableEndpointIndependentMapping() {
        return this.enableEndpointIndependentMapping == null ? Input.empty() : this.enableEndpointIndependentMapping;
    }

    /**
     * Timeout (in seconds) for ICMP connections. Defaults to 30s if not set.
     * 
     */
    @InputImport(name="icmpIdleTimeoutSec")
    private final @Nullable Input<Integer> icmpIdleTimeoutSec;

    public Input<Integer> getIcmpIdleTimeoutSec() {
        return this.icmpIdleTimeoutSec == null ? Input.empty() : this.icmpIdleTimeoutSec;
    }

    /**
     * Configuration for logging on NAT
     * Structure is documented below.
     * 
     */
    @InputImport(name="logConfig")
    private final @Nullable Input<RouterNatLogConfigArgs> logConfig;

    public Input<RouterNatLogConfigArgs> getLogConfig() {
        return this.logConfig == null ? Input.empty() : this.logConfig;
    }

    /**
     * Minimum number of ports allocated to a VM from this NAT.
     * 
     */
    @InputImport(name="minPortsPerVm")
    private final @Nullable Input<Integer> minPortsPerVm;

    public Input<Integer> getMinPortsPerVm() {
        return this.minPortsPerVm == null ? Input.empty() : this.minPortsPerVm;
    }

    /**
     * Self-link of subnetwork to NAT
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * How external IPs should be allocated for this NAT. Valid values are
     * `AUTO_ONLY` for only allowing NAT IPs allocated by Google Cloud
     * Platform, or `MANUAL_ONLY` for only user-allocated NAT IP addresses.
     * Possible values are `MANUAL_ONLY` and `AUTO_ONLY`.
     * 
     */
    @InputImport(name="natIpAllocateOption", required=true)
    private final Input<String> natIpAllocateOption;

    public Input<String> getNatIpAllocateOption() {
        return this.natIpAllocateOption;
    }

    /**
     * Self-links of NAT IPs. Only valid if natIpAllocateOption
     * is set to MANUAL_ONLY.
     * 
     */
    @InputImport(name="natIps")
    private final @Nullable Input<List<String>> natIps;

    public Input<List<String>> getNatIps() {
        return this.natIps == null ? Input.empty() : this.natIps;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Region where the router and NAT reside.
     * 
     */
    @InputImport(name="region")
    private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * The name of the Cloud Router in which this NAT will be configured.
     * 
     */
    @InputImport(name="router", required=true)
    private final Input<String> router;

    public Input<String> getRouter() {
        return this.router;
    }

    /**
     * How NAT should be configured per Subnetwork.
     * If `ALL_SUBNETWORKS_ALL_IP_RANGES`, all of the
     * IP ranges in every Subnetwork are allowed to Nat.
     * If `ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES`, all of the primary IP
     * ranges in every Subnetwork are allowed to Nat.
     * `LIST_OF_SUBNETWORKS`: A list of Subnetworks are allowed to Nat
     * (specified in the field subnetwork below). Note that if this field
     * contains ALL_SUBNETWORKS_ALL_IP_RANGES or
     * ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES, then there should not be any
     * other RouterNat section in any Router for this network in this region.
     * Possible values are `ALL_SUBNETWORKS_ALL_IP_RANGES`, `ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES`, and `LIST_OF_SUBNETWORKS`.
     * 
     */
    @InputImport(name="sourceSubnetworkIpRangesToNat", required=true)
    private final Input<String> sourceSubnetworkIpRangesToNat;

    public Input<String> getSourceSubnetworkIpRangesToNat() {
        return this.sourceSubnetworkIpRangesToNat;
    }

    /**
     * One or more subnetwork NAT configurations. Only used if
     * `source_subnetwork_ip_ranges_to_nat` is set to `LIST_OF_SUBNETWORKS`
     * Structure is documented below.
     * 
     */
    @InputImport(name="subnetworks")
    private final @Nullable Input<List<RouterNatSubnetworkArgs>> subnetworks;

    public Input<List<RouterNatSubnetworkArgs>> getSubnetworks() {
        return this.subnetworks == null ? Input.empty() : this.subnetworks;
    }

    /**
     * Timeout (in seconds) for TCP established connections.
     * Defaults to 1200s if not set.
     * 
     */
    @InputImport(name="tcpEstablishedIdleTimeoutSec")
    private final @Nullable Input<Integer> tcpEstablishedIdleTimeoutSec;

    public Input<Integer> getTcpEstablishedIdleTimeoutSec() {
        return this.tcpEstablishedIdleTimeoutSec == null ? Input.empty() : this.tcpEstablishedIdleTimeoutSec;
    }

    /**
     * Timeout (in seconds) for TCP transitory connections.
     * Defaults to 30s if not set.
     * 
     */
    @InputImport(name="tcpTransitoryIdleTimeoutSec")
    private final @Nullable Input<Integer> tcpTransitoryIdleTimeoutSec;

    public Input<Integer> getTcpTransitoryIdleTimeoutSec() {
        return this.tcpTransitoryIdleTimeoutSec == null ? Input.empty() : this.tcpTransitoryIdleTimeoutSec;
    }

    /**
     * Timeout (in seconds) for UDP connections. Defaults to 30s if not set.
     * 
     */
    @InputImport(name="udpIdleTimeoutSec")
    private final @Nullable Input<Integer> udpIdleTimeoutSec;

    public Input<Integer> getUdpIdleTimeoutSec() {
        return this.udpIdleTimeoutSec == null ? Input.empty() : this.udpIdleTimeoutSec;
    }

    public RouterNatArgs(
        @Nullable Input<List<String>> drainNatIps,
        @Nullable Input<Boolean> enableEndpointIndependentMapping,
        @Nullable Input<Integer> icmpIdleTimeoutSec,
        @Nullable Input<RouterNatLogConfigArgs> logConfig,
        @Nullable Input<Integer> minPortsPerVm,
        @Nullable Input<String> name,
        Input<String> natIpAllocateOption,
        @Nullable Input<List<String>> natIps,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        Input<String> router,
        Input<String> sourceSubnetworkIpRangesToNat,
        @Nullable Input<List<RouterNatSubnetworkArgs>> subnetworks,
        @Nullable Input<Integer> tcpEstablishedIdleTimeoutSec,
        @Nullable Input<Integer> tcpTransitoryIdleTimeoutSec,
        @Nullable Input<Integer> udpIdleTimeoutSec) {
        this.drainNatIps = drainNatIps;
        this.enableEndpointIndependentMapping = enableEndpointIndependentMapping;
        this.icmpIdleTimeoutSec = icmpIdleTimeoutSec;
        this.logConfig = logConfig;
        this.minPortsPerVm = minPortsPerVm;
        this.name = name;
        this.natIpAllocateOption = Objects.requireNonNull(natIpAllocateOption, "expected parameter 'natIpAllocateOption' to be non-null");
        this.natIps = natIps;
        this.project = project;
        this.region = region;
        this.router = Objects.requireNonNull(router, "expected parameter 'router' to be non-null");
        this.sourceSubnetworkIpRangesToNat = Objects.requireNonNull(sourceSubnetworkIpRangesToNat, "expected parameter 'sourceSubnetworkIpRangesToNat' to be non-null");
        this.subnetworks = subnetworks;
        this.tcpEstablishedIdleTimeoutSec = tcpEstablishedIdleTimeoutSec;
        this.tcpTransitoryIdleTimeoutSec = tcpTransitoryIdleTimeoutSec;
        this.udpIdleTimeoutSec = udpIdleTimeoutSec;
    }

    private RouterNatArgs() {
        this.drainNatIps = Input.empty();
        this.enableEndpointIndependentMapping = Input.empty();
        this.icmpIdleTimeoutSec = Input.empty();
        this.logConfig = Input.empty();
        this.minPortsPerVm = Input.empty();
        this.name = Input.empty();
        this.natIpAllocateOption = Input.empty();
        this.natIps = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.router = Input.empty();
        this.sourceSubnetworkIpRangesToNat = Input.empty();
        this.subnetworks = Input.empty();
        this.tcpEstablishedIdleTimeoutSec = Input.empty();
        this.tcpTransitoryIdleTimeoutSec = Input.empty();
        this.udpIdleTimeoutSec = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterNatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> drainNatIps;
        private @Nullable Input<Boolean> enableEndpointIndependentMapping;
        private @Nullable Input<Integer> icmpIdleTimeoutSec;
        private @Nullable Input<RouterNatLogConfigArgs> logConfig;
        private @Nullable Input<Integer> minPortsPerVm;
        private @Nullable Input<String> name;
        private Input<String> natIpAllocateOption;
        private @Nullable Input<List<String>> natIps;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private Input<String> router;
        private Input<String> sourceSubnetworkIpRangesToNat;
        private @Nullable Input<List<RouterNatSubnetworkArgs>> subnetworks;
        private @Nullable Input<Integer> tcpEstablishedIdleTimeoutSec;
        private @Nullable Input<Integer> tcpTransitoryIdleTimeoutSec;
        private @Nullable Input<Integer> udpIdleTimeoutSec;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterNatArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.drainNatIps = defaults.drainNatIps;
    	      this.enableEndpointIndependentMapping = defaults.enableEndpointIndependentMapping;
    	      this.icmpIdleTimeoutSec = defaults.icmpIdleTimeoutSec;
    	      this.logConfig = defaults.logConfig;
    	      this.minPortsPerVm = defaults.minPortsPerVm;
    	      this.name = defaults.name;
    	      this.natIpAllocateOption = defaults.natIpAllocateOption;
    	      this.natIps = defaults.natIps;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.router = defaults.router;
    	      this.sourceSubnetworkIpRangesToNat = defaults.sourceSubnetworkIpRangesToNat;
    	      this.subnetworks = defaults.subnetworks;
    	      this.tcpEstablishedIdleTimeoutSec = defaults.tcpEstablishedIdleTimeoutSec;
    	      this.tcpTransitoryIdleTimeoutSec = defaults.tcpTransitoryIdleTimeoutSec;
    	      this.udpIdleTimeoutSec = defaults.udpIdleTimeoutSec;
        }

        public Builder setDrainNatIps(@Nullable Input<List<String>> drainNatIps) {
            this.drainNatIps = drainNatIps;
            return this;
        }

        public Builder setDrainNatIps(@Nullable List<String> drainNatIps) {
            this.drainNatIps = Input.ofNullable(drainNatIps);
            return this;
        }

        public Builder setEnableEndpointIndependentMapping(@Nullable Input<Boolean> enableEndpointIndependentMapping) {
            this.enableEndpointIndependentMapping = enableEndpointIndependentMapping;
            return this;
        }

        public Builder setEnableEndpointIndependentMapping(@Nullable Boolean enableEndpointIndependentMapping) {
            this.enableEndpointIndependentMapping = Input.ofNullable(enableEndpointIndependentMapping);
            return this;
        }

        public Builder setIcmpIdleTimeoutSec(@Nullable Input<Integer> icmpIdleTimeoutSec) {
            this.icmpIdleTimeoutSec = icmpIdleTimeoutSec;
            return this;
        }

        public Builder setIcmpIdleTimeoutSec(@Nullable Integer icmpIdleTimeoutSec) {
            this.icmpIdleTimeoutSec = Input.ofNullable(icmpIdleTimeoutSec);
            return this;
        }

        public Builder setLogConfig(@Nullable Input<RouterNatLogConfigArgs> logConfig) {
            this.logConfig = logConfig;
            return this;
        }

        public Builder setLogConfig(@Nullable RouterNatLogConfigArgs logConfig) {
            this.logConfig = Input.ofNullable(logConfig);
            return this;
        }

        public Builder setMinPortsPerVm(@Nullable Input<Integer> minPortsPerVm) {
            this.minPortsPerVm = minPortsPerVm;
            return this;
        }

        public Builder setMinPortsPerVm(@Nullable Integer minPortsPerVm) {
            this.minPortsPerVm = Input.ofNullable(minPortsPerVm);
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

        public Builder setNatIpAllocateOption(Input<String> natIpAllocateOption) {
            this.natIpAllocateOption = Objects.requireNonNull(natIpAllocateOption);
            return this;
        }

        public Builder setNatIpAllocateOption(String natIpAllocateOption) {
            this.natIpAllocateOption = Input.of(Objects.requireNonNull(natIpAllocateOption));
            return this;
        }

        public Builder setNatIps(@Nullable Input<List<String>> natIps) {
            this.natIps = natIps;
            return this;
        }

        public Builder setNatIps(@Nullable List<String> natIps) {
            this.natIps = Input.ofNullable(natIps);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
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

        public Builder setRouter(Input<String> router) {
            this.router = Objects.requireNonNull(router);
            return this;
        }

        public Builder setRouter(String router) {
            this.router = Input.of(Objects.requireNonNull(router));
            return this;
        }

        public Builder setSourceSubnetworkIpRangesToNat(Input<String> sourceSubnetworkIpRangesToNat) {
            this.sourceSubnetworkIpRangesToNat = Objects.requireNonNull(sourceSubnetworkIpRangesToNat);
            return this;
        }

        public Builder setSourceSubnetworkIpRangesToNat(String sourceSubnetworkIpRangesToNat) {
            this.sourceSubnetworkIpRangesToNat = Input.of(Objects.requireNonNull(sourceSubnetworkIpRangesToNat));
            return this;
        }

        public Builder setSubnetworks(@Nullable Input<List<RouterNatSubnetworkArgs>> subnetworks) {
            this.subnetworks = subnetworks;
            return this;
        }

        public Builder setSubnetworks(@Nullable List<RouterNatSubnetworkArgs> subnetworks) {
            this.subnetworks = Input.ofNullable(subnetworks);
            return this;
        }

        public Builder setTcpEstablishedIdleTimeoutSec(@Nullable Input<Integer> tcpEstablishedIdleTimeoutSec) {
            this.tcpEstablishedIdleTimeoutSec = tcpEstablishedIdleTimeoutSec;
            return this;
        }

        public Builder setTcpEstablishedIdleTimeoutSec(@Nullable Integer tcpEstablishedIdleTimeoutSec) {
            this.tcpEstablishedIdleTimeoutSec = Input.ofNullable(tcpEstablishedIdleTimeoutSec);
            return this;
        }

        public Builder setTcpTransitoryIdleTimeoutSec(@Nullable Input<Integer> tcpTransitoryIdleTimeoutSec) {
            this.tcpTransitoryIdleTimeoutSec = tcpTransitoryIdleTimeoutSec;
            return this;
        }

        public Builder setTcpTransitoryIdleTimeoutSec(@Nullable Integer tcpTransitoryIdleTimeoutSec) {
            this.tcpTransitoryIdleTimeoutSec = Input.ofNullable(tcpTransitoryIdleTimeoutSec);
            return this;
        }

        public Builder setUdpIdleTimeoutSec(@Nullable Input<Integer> udpIdleTimeoutSec) {
            this.udpIdleTimeoutSec = udpIdleTimeoutSec;
            return this;
        }

        public Builder setUdpIdleTimeoutSec(@Nullable Integer udpIdleTimeoutSec) {
            this.udpIdleTimeoutSec = Input.ofNullable(udpIdleTimeoutSec);
            return this;
        }

        public RouterNatArgs build() {
            return new RouterNatArgs(drainNatIps, enableEndpointIndependentMapping, icmpIdleTimeoutSec, logConfig, minPortsPerVm, name, natIpAllocateOption, natIps, project, region, router, sourceSubnetworkIpRangesToNat, subnetworks, tcpEstablishedIdleTimeoutSec, tcpTransitoryIdleTimeoutSec, udpIdleTimeoutSec);
        }
    }
}
