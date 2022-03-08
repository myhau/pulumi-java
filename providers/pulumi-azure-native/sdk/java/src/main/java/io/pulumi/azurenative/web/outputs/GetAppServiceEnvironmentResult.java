// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.NameValuePairResponse;
import io.pulumi.azurenative.web.outputs.VirtualNetworkProfileResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAppServiceEnvironmentResult {
    /**
     * Custom settings for changing the behavior of the App Service Environment.
     * 
     */
    private final @Nullable List<NameValuePairResponse> clusterSettings;
    /**
     * Dedicated Host Count
     * 
     */
    private final Integer dedicatedHostCount;
    /**
     * DNS suffix of the App Service Environment.
     * 
     */
    private final @Nullable String dnsSuffix;
    /**
     * Scale factor for front-ends.
     * 
     */
    private final @Nullable Integer frontEndScaleFactor;
    /**
     * Flag that displays whether an ASE has linux workers or not
     * 
     */
    private final Boolean hasLinuxWorkers;
    /**
     * Resource Id.
     * 
     */
    private final String id;
    /**
     * Specifies which endpoints to serve internally in the Virtual Network for the App Service Environment.
     * 
     */
    private final @Nullable String internalLoadBalancingMode;
    /**
     * Number of IP SSL addresses reserved for the App Service Environment.
     * 
     */
    private final @Nullable Integer ipsslAddressCount;
    /**
     * Kind of resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * Resource Location.
     * 
     */
    private final String location;
    /**
     * Maximum number of VMs in the App Service Environment.
     * 
     */
    private final Integer maximumNumberOfMachines;
    /**
     * Number of front-end instances.
     * 
     */
    private final Integer multiRoleCount;
    /**
     * Front-end VM size, e.g. "Medium", "Large".
     * 
     */
    private final @Nullable String multiSize;
    /**
     * Resource Name.
     * 
     */
    private final String name;
    /**
     * Provisioning state of the App Service Environment.
     * 
     */
    private final String provisioningState;
    /**
     * Current status of the App Service Environment.
     * 
     */
    private final String status;
    /**
     * <code>true</code> if the App Service Environment is suspended; otherwise, <code>false</code>. The environment can be suspended, e.g. when the management endpoint is no longer available
     *  (most likely because NSG blocked the incoming traffic).
     * 
     */
    private final Boolean suspended;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * User added ip ranges to whitelist on ASE db
     * 
     */
    private final @Nullable List<String> userWhitelistedIpRanges;
    /**
     * Description of the Virtual Network.
     * 
     */
    private final VirtualNetworkProfileResponse virtualNetwork;

    @OutputCustomType.Constructor({"clusterSettings","dedicatedHostCount","dnsSuffix","frontEndScaleFactor","hasLinuxWorkers","id","internalLoadBalancingMode","ipsslAddressCount","kind","location","maximumNumberOfMachines","multiRoleCount","multiSize","name","provisioningState","status","suspended","tags","type","userWhitelistedIpRanges","virtualNetwork"})
    private GetAppServiceEnvironmentResult(
        @Nullable List<NameValuePairResponse> clusterSettings,
        Integer dedicatedHostCount,
        @Nullable String dnsSuffix,
        @Nullable Integer frontEndScaleFactor,
        Boolean hasLinuxWorkers,
        String id,
        @Nullable String internalLoadBalancingMode,
        @Nullable Integer ipsslAddressCount,
        @Nullable String kind,
        String location,
        Integer maximumNumberOfMachines,
        Integer multiRoleCount,
        @Nullable String multiSize,
        String name,
        String provisioningState,
        String status,
        Boolean suspended,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable List<String> userWhitelistedIpRanges,
        VirtualNetworkProfileResponse virtualNetwork) {
        this.clusterSettings = clusterSettings;
        this.dedicatedHostCount = dedicatedHostCount;
        this.dnsSuffix = dnsSuffix;
        this.frontEndScaleFactor = frontEndScaleFactor;
        this.hasLinuxWorkers = hasLinuxWorkers;
        this.id = id;
        this.internalLoadBalancingMode = internalLoadBalancingMode;
        this.ipsslAddressCount = ipsslAddressCount;
        this.kind = kind;
        this.location = location;
        this.maximumNumberOfMachines = maximumNumberOfMachines;
        this.multiRoleCount = multiRoleCount;
        this.multiSize = multiSize;
        this.name = name;
        this.provisioningState = provisioningState;
        this.status = status;
        this.suspended = suspended;
        this.tags = tags;
        this.type = type;
        this.userWhitelistedIpRanges = userWhitelistedIpRanges;
        this.virtualNetwork = virtualNetwork;
    }

    /**
     * Custom settings for changing the behavior of the App Service Environment.
     * 
    */
    public List<NameValuePairResponse> getClusterSettings() {
        return this.clusterSettings == null ? List.of() : this.clusterSettings;
    }
    /**
     * Dedicated Host Count
     * 
    */
    public Integer getDedicatedHostCount() {
        return this.dedicatedHostCount;
    }
    /**
     * DNS suffix of the App Service Environment.
     * 
    */
    public Optional<String> getDnsSuffix() {
        return Optional.ofNullable(this.dnsSuffix);
    }
    /**
     * Scale factor for front-ends.
     * 
    */
    public Optional<Integer> getFrontEndScaleFactor() {
        return Optional.ofNullable(this.frontEndScaleFactor);
    }
    /**
     * Flag that displays whether an ASE has linux workers or not
     * 
    */
    public Boolean getHasLinuxWorkers() {
        return this.hasLinuxWorkers;
    }
    /**
     * Resource Id.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Specifies which endpoints to serve internally in the Virtual Network for the App Service Environment.
     * 
    */
    public Optional<String> getInternalLoadBalancingMode() {
        return Optional.ofNullable(this.internalLoadBalancingMode);
    }
    /**
     * Number of IP SSL addresses reserved for the App Service Environment.
     * 
    */
    public Optional<Integer> getIpsslAddressCount() {
        return Optional.ofNullable(this.ipsslAddressCount);
    }
    /**
     * Kind of resource.
     * 
    */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Resource Location.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Maximum number of VMs in the App Service Environment.
     * 
    */
    public Integer getMaximumNumberOfMachines() {
        return this.maximumNumberOfMachines;
    }
    /**
     * Number of front-end instances.
     * 
    */
    public Integer getMultiRoleCount() {
        return this.multiRoleCount;
    }
    /**
     * Front-end VM size, e.g. "Medium", "Large".
     * 
    */
    public Optional<String> getMultiSize() {
        return Optional.ofNullable(this.multiSize);
    }
    /**
     * Resource Name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Provisioning state of the App Service Environment.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Current status of the App Service Environment.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * <code>true</code> if the App Service Environment is suspended; otherwise, <code>false</code>. The environment can be suspended, e.g. when the management endpoint is no longer available
     *  (most likely because NSG blocked the incoming traffic).
     * 
    */
    public Boolean getSuspended() {
        return this.suspended;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * User added ip ranges to whitelist on ASE db
     * 
    */
    public List<String> getUserWhitelistedIpRanges() {
        return this.userWhitelistedIpRanges == null ? List.of() : this.userWhitelistedIpRanges;
    }
    /**
     * Description of the Virtual Network.
     * 
    */
    public VirtualNetworkProfileResponse getVirtualNetwork() {
        return this.virtualNetwork;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppServiceEnvironmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<NameValuePairResponse> clusterSettings;
        private Integer dedicatedHostCount;
        private @Nullable String dnsSuffix;
        private @Nullable Integer frontEndScaleFactor;
        private Boolean hasLinuxWorkers;
        private String id;
        private @Nullable String internalLoadBalancingMode;
        private @Nullable Integer ipsslAddressCount;
        private @Nullable String kind;
        private String location;
        private Integer maximumNumberOfMachines;
        private Integer multiRoleCount;
        private @Nullable String multiSize;
        private String name;
        private String provisioningState;
        private String status;
        private Boolean suspended;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable List<String> userWhitelistedIpRanges;
        private VirtualNetworkProfileResponse virtualNetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAppServiceEnvironmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterSettings = defaults.clusterSettings;
    	      this.dedicatedHostCount = defaults.dedicatedHostCount;
    	      this.dnsSuffix = defaults.dnsSuffix;
    	      this.frontEndScaleFactor = defaults.frontEndScaleFactor;
    	      this.hasLinuxWorkers = defaults.hasLinuxWorkers;
    	      this.id = defaults.id;
    	      this.internalLoadBalancingMode = defaults.internalLoadBalancingMode;
    	      this.ipsslAddressCount = defaults.ipsslAddressCount;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.maximumNumberOfMachines = defaults.maximumNumberOfMachines;
    	      this.multiRoleCount = defaults.multiRoleCount;
    	      this.multiSize = defaults.multiSize;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.status = defaults.status;
    	      this.suspended = defaults.suspended;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.userWhitelistedIpRanges = defaults.userWhitelistedIpRanges;
    	      this.virtualNetwork = defaults.virtualNetwork;
        }

        public Builder setClusterSettings(@Nullable List<NameValuePairResponse> clusterSettings) {
            this.clusterSettings = clusterSettings;
            return this;
        }

        public Builder setDedicatedHostCount(Integer dedicatedHostCount) {
            this.dedicatedHostCount = Objects.requireNonNull(dedicatedHostCount);
            return this;
        }

        public Builder setDnsSuffix(@Nullable String dnsSuffix) {
            this.dnsSuffix = dnsSuffix;
            return this;
        }

        public Builder setFrontEndScaleFactor(@Nullable Integer frontEndScaleFactor) {
            this.frontEndScaleFactor = frontEndScaleFactor;
            return this;
        }

        public Builder setHasLinuxWorkers(Boolean hasLinuxWorkers) {
            this.hasLinuxWorkers = Objects.requireNonNull(hasLinuxWorkers);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInternalLoadBalancingMode(@Nullable String internalLoadBalancingMode) {
            this.internalLoadBalancingMode = internalLoadBalancingMode;
            return this;
        }

        public Builder setIpsslAddressCount(@Nullable Integer ipsslAddressCount) {
            this.ipsslAddressCount = ipsslAddressCount;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setMaximumNumberOfMachines(Integer maximumNumberOfMachines) {
            this.maximumNumberOfMachines = Objects.requireNonNull(maximumNumberOfMachines);
            return this;
        }

        public Builder setMultiRoleCount(Integer multiRoleCount) {
            this.multiRoleCount = Objects.requireNonNull(multiRoleCount);
            return this;
        }

        public Builder setMultiSize(@Nullable String multiSize) {
            this.multiSize = multiSize;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setSuspended(Boolean suspended) {
            this.suspended = Objects.requireNonNull(suspended);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserWhitelistedIpRanges(@Nullable List<String> userWhitelistedIpRanges) {
            this.userWhitelistedIpRanges = userWhitelistedIpRanges;
            return this;
        }

        public Builder setVirtualNetwork(VirtualNetworkProfileResponse virtualNetwork) {
            this.virtualNetwork = Objects.requireNonNull(virtualNetwork);
            return this;
        }
        public GetAppServiceEnvironmentResult build() {
            return new GetAppServiceEnvironmentResult(clusterSettings, dedicatedHostCount, dnsSuffix, frontEndScaleFactor, hasLinuxWorkers, id, internalLoadBalancingMode, ipsslAddressCount, kind, location, maximumNumberOfMachines, multiRoleCount, multiSize, name, provisioningState, status, suspended, tags, type, userWhitelistedIpRanges, virtualNetwork);
        }
    }
}
