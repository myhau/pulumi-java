// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.alb;

import io.pulumi.aws.alb.inputs.LoadBalancerAccessLogsArgs;
import io.pulumi.aws.alb.inputs.LoadBalancerSubnetMappingArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LoadBalancerArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoadBalancerArgs Empty = new LoadBalancerArgs();

    /**
     * An Access Logs block. Access Logs documented below.
     * 
     */
    @InputImport(name="accessLogs")
      private final @Nullable Input<LoadBalancerAccessLogsArgs> accessLogs;

    public Input<LoadBalancerAccessLogsArgs> getAccessLogs() {
        return this.accessLogs == null ? Input.empty() : this.accessLogs;
    }

    /**
     * The ID of the customer owned ipv4 pool to use for this load balancer.
     * 
     */
    @InputImport(name="customerOwnedIpv4Pool")
      private final @Nullable Input<String> customerOwnedIpv4Pool;

    public Input<String> getCustomerOwnedIpv4Pool() {
        return this.customerOwnedIpv4Pool == null ? Input.empty() : this.customerOwnedIpv4Pool;
    }

    /**
     * Determines how the load balancer handles requests that might pose a security risk to an application due to HTTP desync. Valid values are `monitor`, `defensive` (default), `strictest`.
     * 
     */
    @InputImport(name="desyncMitigationMode")
      private final @Nullable Input<String> desyncMitigationMode;

    public Input<String> getDesyncMitigationMode() {
        return this.desyncMitigationMode == null ? Input.empty() : this.desyncMitigationMode;
    }

    /**
     * Indicates whether HTTP headers with header fields that are not valid are removed by the load balancer (true) or routed to targets (false). The default is false. Elastic Load Balancing requires that message header names contain only alphanumeric characters and hyphens. Only valid for Load Balancers of type `application`.
     * 
     */
    @InputImport(name="dropInvalidHeaderFields")
      private final @Nullable Input<Boolean> dropInvalidHeaderFields;

    public Input<Boolean> getDropInvalidHeaderFields() {
        return this.dropInvalidHeaderFields == null ? Input.empty() : this.dropInvalidHeaderFields;
    }

    /**
     * If true, cross-zone load balancing of the load balancer will be enabled.
     * This is a `network` load balancer feature. Defaults to `false`.
     * 
     */
    @InputImport(name="enableCrossZoneLoadBalancing")
      private final @Nullable Input<Boolean> enableCrossZoneLoadBalancing;

    public Input<Boolean> getEnableCrossZoneLoadBalancing() {
        return this.enableCrossZoneLoadBalancing == null ? Input.empty() : this.enableCrossZoneLoadBalancing;
    }

    /**
     * If true, deletion of the load balancer will be disabled via
     * the AWS API. This will prevent this provider from deleting the load balancer. Defaults to `false`.
     * 
     */
    @InputImport(name="enableDeletionProtection")
      private final @Nullable Input<Boolean> enableDeletionProtection;

    public Input<Boolean> getEnableDeletionProtection() {
        return this.enableDeletionProtection == null ? Input.empty() : this.enableDeletionProtection;
    }

    /**
     * Indicates whether HTTP/2 is enabled in `application` load balancers. Defaults to `true`.
     * 
     */
    @InputImport(name="enableHttp2")
      private final @Nullable Input<Boolean> enableHttp2;

    public Input<Boolean> getEnableHttp2() {
        return this.enableHttp2 == null ? Input.empty() : this.enableHttp2;
    }

    /**
     * Indicates whether to allow a WAF-enabled load balancer to route requests to targets if it is unable to forward the request to AWS WAF. Defaults to `false`.
     * 
     */
    @InputImport(name="enableWafFailOpen")
      private final @Nullable Input<Boolean> enableWafFailOpen;

    public Input<Boolean> getEnableWafFailOpen() {
        return this.enableWafFailOpen == null ? Input.empty() : this.enableWafFailOpen;
    }

    /**
     * The time in seconds that the connection is allowed to be idle. Only valid for Load Balancers of type `application`. Default: 60.
     * 
     */
    @InputImport(name="idleTimeout")
      private final @Nullable Input<Integer> idleTimeout;

    public Input<Integer> getIdleTimeout() {
        return this.idleTimeout == null ? Input.empty() : this.idleTimeout;
    }

    /**
     * If true, the LB will be internal.
     * 
     */
    @InputImport(name="internal")
      private final @Nullable Input<Boolean> internal;

    public Input<Boolean> getInternal() {
        return this.internal == null ? Input.empty() : this.internal;
    }

    /**
     * The type of IP addresses used by the subnets for your load balancer. The possible values are `ipv4` and `dualstack`
     * 
     */
    @InputImport(name="ipAddressType")
      private final @Nullable Input<String> ipAddressType;

    public Input<String> getIpAddressType() {
        return this.ipAddressType == null ? Input.empty() : this.ipAddressType;
    }

    /**
     * The type of load balancer to create. Possible values are `application`, `gateway`, or `network`. The default value is `application`.
     * 
     */
    @InputImport(name="loadBalancerType")
      private final @Nullable Input<String> loadBalancerType;

    public Input<String> getLoadBalancerType() {
        return this.loadBalancerType == null ? Input.empty() : this.loadBalancerType;
    }

    /**
     * The name of the LB. This name must be unique within your AWS account, can have a maximum of 32 characters,
     * must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen. If not specified,
     * this provider will autogenerate a name beginning with `tf-lb`.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @InputImport(name="namePrefix")
      private final @Nullable Input<String> namePrefix;

    public Input<String> getNamePrefix() {
        return this.namePrefix == null ? Input.empty() : this.namePrefix;
    }

    /**
     * A list of security group IDs to assign to the LB. Only valid for Load Balancers of type `application`.
     * 
     */
    @InputImport(name="securityGroups")
      private final @Nullable Input<List<String>> securityGroups;

    public Input<List<String>> getSecurityGroups() {
        return this.securityGroups == null ? Input.empty() : this.securityGroups;
    }

    /**
     * A subnet mapping block as documented below.
     * 
     */
    @InputImport(name="subnetMappings")
      private final @Nullable Input<List<LoadBalancerSubnetMappingArgs>> subnetMappings;

    public Input<List<LoadBalancerSubnetMappingArgs>> getSubnetMappings() {
        return this.subnetMappings == null ? Input.empty() : this.subnetMappings;
    }

    /**
     * A list of subnet IDs to attach to the LB. Subnets
     * cannot be updated for Load Balancers of type `network`. Changing this value
     * for load balancers of type `network` will force a recreation of the resource.
     * 
     */
    @InputImport(name="subnets")
      private final @Nullable Input<List<String>> subnets;

    public Input<List<String>> getSubnets() {
        return this.subnets == null ? Input.empty() : this.subnets;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public LoadBalancerArgs(
        @Nullable Input<LoadBalancerAccessLogsArgs> accessLogs,
        @Nullable Input<String> customerOwnedIpv4Pool,
        @Nullable Input<String> desyncMitigationMode,
        @Nullable Input<Boolean> dropInvalidHeaderFields,
        @Nullable Input<Boolean> enableCrossZoneLoadBalancing,
        @Nullable Input<Boolean> enableDeletionProtection,
        @Nullable Input<Boolean> enableHttp2,
        @Nullable Input<Boolean> enableWafFailOpen,
        @Nullable Input<Integer> idleTimeout,
        @Nullable Input<Boolean> internal,
        @Nullable Input<String> ipAddressType,
        @Nullable Input<String> loadBalancerType,
        @Nullable Input<String> name,
        @Nullable Input<String> namePrefix,
        @Nullable Input<List<String>> securityGroups,
        @Nullable Input<List<LoadBalancerSubnetMappingArgs>> subnetMappings,
        @Nullable Input<List<String>> subnets,
        @Nullable Input<Map<String,String>> tags) {
        this.accessLogs = accessLogs;
        this.customerOwnedIpv4Pool = customerOwnedIpv4Pool;
        this.desyncMitigationMode = desyncMitigationMode;
        this.dropInvalidHeaderFields = dropInvalidHeaderFields;
        this.enableCrossZoneLoadBalancing = enableCrossZoneLoadBalancing;
        this.enableDeletionProtection = enableDeletionProtection;
        this.enableHttp2 = enableHttp2;
        this.enableWafFailOpen = enableWafFailOpen;
        this.idleTimeout = idleTimeout;
        this.internal = internal;
        this.ipAddressType = ipAddressType;
        this.loadBalancerType = loadBalancerType;
        this.name = name;
        this.namePrefix = namePrefix;
        this.securityGroups = securityGroups;
        this.subnetMappings = subnetMappings;
        this.subnets = subnets;
        this.tags = tags;
    }

    private LoadBalancerArgs() {
        this.accessLogs = Input.empty();
        this.customerOwnedIpv4Pool = Input.empty();
        this.desyncMitigationMode = Input.empty();
        this.dropInvalidHeaderFields = Input.empty();
        this.enableCrossZoneLoadBalancing = Input.empty();
        this.enableDeletionProtection = Input.empty();
        this.enableHttp2 = Input.empty();
        this.enableWafFailOpen = Input.empty();
        this.idleTimeout = Input.empty();
        this.internal = Input.empty();
        this.ipAddressType = Input.empty();
        this.loadBalancerType = Input.empty();
        this.name = Input.empty();
        this.namePrefix = Input.empty();
        this.securityGroups = Input.empty();
        this.subnetMappings = Input.empty();
        this.subnets = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<LoadBalancerAccessLogsArgs> accessLogs;
        private @Nullable Input<String> customerOwnedIpv4Pool;
        private @Nullable Input<String> desyncMitigationMode;
        private @Nullable Input<Boolean> dropInvalidHeaderFields;
        private @Nullable Input<Boolean> enableCrossZoneLoadBalancing;
        private @Nullable Input<Boolean> enableDeletionProtection;
        private @Nullable Input<Boolean> enableHttp2;
        private @Nullable Input<Boolean> enableWafFailOpen;
        private @Nullable Input<Integer> idleTimeout;
        private @Nullable Input<Boolean> internal;
        private @Nullable Input<String> ipAddressType;
        private @Nullable Input<String> loadBalancerType;
        private @Nullable Input<String> name;
        private @Nullable Input<String> namePrefix;
        private @Nullable Input<List<String>> securityGroups;
        private @Nullable Input<List<LoadBalancerSubnetMappingArgs>> subnetMappings;
        private @Nullable Input<List<String>> subnets;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLogs = defaults.accessLogs;
    	      this.customerOwnedIpv4Pool = defaults.customerOwnedIpv4Pool;
    	      this.desyncMitigationMode = defaults.desyncMitigationMode;
    	      this.dropInvalidHeaderFields = defaults.dropInvalidHeaderFields;
    	      this.enableCrossZoneLoadBalancing = defaults.enableCrossZoneLoadBalancing;
    	      this.enableDeletionProtection = defaults.enableDeletionProtection;
    	      this.enableHttp2 = defaults.enableHttp2;
    	      this.enableWafFailOpen = defaults.enableWafFailOpen;
    	      this.idleTimeout = defaults.idleTimeout;
    	      this.internal = defaults.internal;
    	      this.ipAddressType = defaults.ipAddressType;
    	      this.loadBalancerType = defaults.loadBalancerType;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.securityGroups = defaults.securityGroups;
    	      this.subnetMappings = defaults.subnetMappings;
    	      this.subnets = defaults.subnets;
    	      this.tags = defaults.tags;
        }

        public Builder setAccessLogs(@Nullable Input<LoadBalancerAccessLogsArgs> accessLogs) {
            this.accessLogs = accessLogs;
            return this;
        }

        public Builder setAccessLogs(@Nullable LoadBalancerAccessLogsArgs accessLogs) {
            this.accessLogs = Input.ofNullable(accessLogs);
            return this;
        }

        public Builder setCustomerOwnedIpv4Pool(@Nullable Input<String> customerOwnedIpv4Pool) {
            this.customerOwnedIpv4Pool = customerOwnedIpv4Pool;
            return this;
        }

        public Builder setCustomerOwnedIpv4Pool(@Nullable String customerOwnedIpv4Pool) {
            this.customerOwnedIpv4Pool = Input.ofNullable(customerOwnedIpv4Pool);
            return this;
        }

        public Builder setDesyncMitigationMode(@Nullable Input<String> desyncMitigationMode) {
            this.desyncMitigationMode = desyncMitigationMode;
            return this;
        }

        public Builder setDesyncMitigationMode(@Nullable String desyncMitigationMode) {
            this.desyncMitigationMode = Input.ofNullable(desyncMitigationMode);
            return this;
        }

        public Builder setDropInvalidHeaderFields(@Nullable Input<Boolean> dropInvalidHeaderFields) {
            this.dropInvalidHeaderFields = dropInvalidHeaderFields;
            return this;
        }

        public Builder setDropInvalidHeaderFields(@Nullable Boolean dropInvalidHeaderFields) {
            this.dropInvalidHeaderFields = Input.ofNullable(dropInvalidHeaderFields);
            return this;
        }

        public Builder setEnableCrossZoneLoadBalancing(@Nullable Input<Boolean> enableCrossZoneLoadBalancing) {
            this.enableCrossZoneLoadBalancing = enableCrossZoneLoadBalancing;
            return this;
        }

        public Builder setEnableCrossZoneLoadBalancing(@Nullable Boolean enableCrossZoneLoadBalancing) {
            this.enableCrossZoneLoadBalancing = Input.ofNullable(enableCrossZoneLoadBalancing);
            return this;
        }

        public Builder setEnableDeletionProtection(@Nullable Input<Boolean> enableDeletionProtection) {
            this.enableDeletionProtection = enableDeletionProtection;
            return this;
        }

        public Builder setEnableDeletionProtection(@Nullable Boolean enableDeletionProtection) {
            this.enableDeletionProtection = Input.ofNullable(enableDeletionProtection);
            return this;
        }

        public Builder setEnableHttp2(@Nullable Input<Boolean> enableHttp2) {
            this.enableHttp2 = enableHttp2;
            return this;
        }

        public Builder setEnableHttp2(@Nullable Boolean enableHttp2) {
            this.enableHttp2 = Input.ofNullable(enableHttp2);
            return this;
        }

        public Builder setEnableWafFailOpen(@Nullable Input<Boolean> enableWafFailOpen) {
            this.enableWafFailOpen = enableWafFailOpen;
            return this;
        }

        public Builder setEnableWafFailOpen(@Nullable Boolean enableWafFailOpen) {
            this.enableWafFailOpen = Input.ofNullable(enableWafFailOpen);
            return this;
        }

        public Builder setIdleTimeout(@Nullable Input<Integer> idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }

        public Builder setIdleTimeout(@Nullable Integer idleTimeout) {
            this.idleTimeout = Input.ofNullable(idleTimeout);
            return this;
        }

        public Builder setInternal(@Nullable Input<Boolean> internal) {
            this.internal = internal;
            return this;
        }

        public Builder setInternal(@Nullable Boolean internal) {
            this.internal = Input.ofNullable(internal);
            return this;
        }

        public Builder setIpAddressType(@Nullable Input<String> ipAddressType) {
            this.ipAddressType = ipAddressType;
            return this;
        }

        public Builder setIpAddressType(@Nullable String ipAddressType) {
            this.ipAddressType = Input.ofNullable(ipAddressType);
            return this;
        }

        public Builder setLoadBalancerType(@Nullable Input<String> loadBalancerType) {
            this.loadBalancerType = loadBalancerType;
            return this;
        }

        public Builder setLoadBalancerType(@Nullable String loadBalancerType) {
            this.loadBalancerType = Input.ofNullable(loadBalancerType);
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

        public Builder setNamePrefix(@Nullable Input<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        public Builder setNamePrefix(@Nullable String namePrefix) {
            this.namePrefix = Input.ofNullable(namePrefix);
            return this;
        }

        public Builder setSecurityGroups(@Nullable Input<List<String>> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        public Builder setSecurityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = Input.ofNullable(securityGroups);
            return this;
        }

        public Builder setSubnetMappings(@Nullable Input<List<LoadBalancerSubnetMappingArgs>> subnetMappings) {
            this.subnetMappings = subnetMappings;
            return this;
        }

        public Builder setSubnetMappings(@Nullable List<LoadBalancerSubnetMappingArgs> subnetMappings) {
            this.subnetMappings = Input.ofNullable(subnetMappings);
            return this;
        }

        public Builder setSubnets(@Nullable Input<List<String>> subnets) {
            this.subnets = subnets;
            return this;
        }

        public Builder setSubnets(@Nullable List<String> subnets) {
            this.subnets = Input.ofNullable(subnets);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public LoadBalancerArgs build() {
            return new LoadBalancerArgs(accessLogs, customerOwnedIpv4Pool, desyncMitigationMode, dropInvalidHeaderFields, enableCrossZoneLoadBalancing, enableDeletionProtection, enableHttp2, enableWafFailOpen, idleTimeout, internal, ipAddressType, loadBalancerType, name, namePrefix, securityGroups, subnetMappings, subnets, tags);
        }
    }
}
