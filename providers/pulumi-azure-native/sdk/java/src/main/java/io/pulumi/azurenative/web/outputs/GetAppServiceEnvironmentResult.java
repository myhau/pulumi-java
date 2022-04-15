// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.NameValuePairResponse;
import io.pulumi.azurenative.web.outputs.VirtualNetworkProfileResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
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

    @CustomType.Constructor
    private GetAppServiceEnvironmentResult(
        @CustomType.Parameter("clusterSettings") @Nullable List<NameValuePairResponse> clusterSettings,
        @CustomType.Parameter("dedicatedHostCount") Integer dedicatedHostCount,
        @CustomType.Parameter("dnsSuffix") @Nullable String dnsSuffix,
        @CustomType.Parameter("frontEndScaleFactor") @Nullable Integer frontEndScaleFactor,
        @CustomType.Parameter("hasLinuxWorkers") Boolean hasLinuxWorkers,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("internalLoadBalancingMode") @Nullable String internalLoadBalancingMode,
        @CustomType.Parameter("ipsslAddressCount") @Nullable Integer ipsslAddressCount,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("maximumNumberOfMachines") Integer maximumNumberOfMachines,
        @CustomType.Parameter("multiRoleCount") Integer multiRoleCount,
        @CustomType.Parameter("multiSize") @Nullable String multiSize,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("suspended") Boolean suspended,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userWhitelistedIpRanges") @Nullable List<String> userWhitelistedIpRanges,
        @CustomType.Parameter("virtualNetwork") VirtualNetworkProfileResponse virtualNetwork) {
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
    public List<NameValuePairResponse> clusterSettings() {
        return this.clusterSettings == null ? List.of() : this.clusterSettings;
    }
    /**
     * Dedicated Host Count
     * 
    */
    public Integer dedicatedHostCount() {
        return this.dedicatedHostCount;
    }
    /**
     * DNS suffix of the App Service Environment.
     * 
    */
    public Optional<String> dnsSuffix() {
        return Optional.ofNullable(this.dnsSuffix);
    }
    /**
     * Scale factor for front-ends.
     * 
    */
    public Optional<Integer> frontEndScaleFactor() {
        return Optional.ofNullable(this.frontEndScaleFactor);
    }
    /**
     * Flag that displays whether an ASE has linux workers or not
     * 
    */
    public Boolean hasLinuxWorkers() {
        return this.hasLinuxWorkers;
    }
    /**
     * Resource Id.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Specifies which endpoints to serve internally in the Virtual Network for the App Service Environment.
     * 
    */
    public Optional<String> internalLoadBalancingMode() {
        return Optional.ofNullable(this.internalLoadBalancingMode);
    }
    /**
     * Number of IP SSL addresses reserved for the App Service Environment.
     * 
    */
    public Optional<Integer> ipsslAddressCount() {
        return Optional.ofNullable(this.ipsslAddressCount);
    }
    /**
     * Kind of resource.
     * 
    */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Resource Location.
     * 
    */
    public String location() {
        return this.location;
    }
    /**
     * Maximum number of VMs in the App Service Environment.
     * 
    */
    public Integer maximumNumberOfMachines() {
        return this.maximumNumberOfMachines;
    }
    /**
     * Number of front-end instances.
     * 
    */
    public Integer multiRoleCount() {
        return this.multiRoleCount;
    }
    /**
     * Front-end VM size, e.g. "Medium", "Large".
     * 
    */
    public Optional<String> multiSize() {
        return Optional.ofNullable(this.multiSize);
    }
    /**
     * Resource Name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Provisioning state of the App Service Environment.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * Current status of the App Service Environment.
     * 
    */
    public String status() {
        return this.status;
    }
    /**
     * <code>true</code> if the App Service Environment is suspended; otherwise, <code>false</code>. The environment can be suspended, e.g. when the management endpoint is no longer available
     *  (most likely because NSG blocked the incoming traffic).
     * 
    */
    public Boolean suspended() {
        return this.suspended;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * User added ip ranges to whitelist on ASE db
     * 
    */
    public List<String> userWhitelistedIpRanges() {
        return this.userWhitelistedIpRanges == null ? List.of() : this.userWhitelistedIpRanges;
    }
    /**
     * Description of the Virtual Network.
     * 
    */
    public VirtualNetworkProfileResponse virtualNetwork() {
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

        public Builder clusterSettings(@Nullable List<NameValuePairResponse> clusterSettings) {
            this.clusterSettings = clusterSettings;
            return this;
        }
        public Builder clusterSettings(NameValuePairResponse... clusterSettings) {
            return clusterSettings(List.of(clusterSettings));
        }
        public Builder dedicatedHostCount(Integer dedicatedHostCount) {
            this.dedicatedHostCount = Objects.requireNonNull(dedicatedHostCount);
            return this;
        }
        public Builder dnsSuffix(@Nullable String dnsSuffix) {
            this.dnsSuffix = dnsSuffix;
            return this;
        }
        public Builder frontEndScaleFactor(@Nullable Integer frontEndScaleFactor) {
            this.frontEndScaleFactor = frontEndScaleFactor;
            return this;
        }
        public Builder hasLinuxWorkers(Boolean hasLinuxWorkers) {
            this.hasLinuxWorkers = Objects.requireNonNull(hasLinuxWorkers);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder internalLoadBalancingMode(@Nullable String internalLoadBalancingMode) {
            this.internalLoadBalancingMode = internalLoadBalancingMode;
            return this;
        }
        public Builder ipsslAddressCount(@Nullable Integer ipsslAddressCount) {
            this.ipsslAddressCount = ipsslAddressCount;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder maximumNumberOfMachines(Integer maximumNumberOfMachines) {
            this.maximumNumberOfMachines = Objects.requireNonNull(maximumNumberOfMachines);
            return this;
        }
        public Builder multiRoleCount(Integer multiRoleCount) {
            this.multiRoleCount = Objects.requireNonNull(multiRoleCount);
            return this;
        }
        public Builder multiSize(@Nullable String multiSize) {
            this.multiSize = multiSize;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder suspended(Boolean suspended) {
            this.suspended = Objects.requireNonNull(suspended);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder userWhitelistedIpRanges(@Nullable List<String> userWhitelistedIpRanges) {
            this.userWhitelistedIpRanges = userWhitelistedIpRanges;
            return this;
        }
        public Builder userWhitelistedIpRanges(String... userWhitelistedIpRanges) {
            return userWhitelistedIpRanges(List.of(userWhitelistedIpRanges));
        }
        public Builder virtualNetwork(VirtualNetworkProfileResponse virtualNetwork) {
            this.virtualNetwork = Objects.requireNonNull(virtualNetwork);
            return this;
        }        public GetAppServiceEnvironmentResult build() {
            return new GetAppServiceEnvironmentResult(clusterSettings, dedicatedHostCount, dnsSuffix, frontEndScaleFactor, hasLinuxWorkers, id, internalLoadBalancingMode, ipsslAddressCount, kind, location, maximumNumberOfMachines, multiRoleCount, multiSize, name, provisioningState, status, suspended, tags, type, userWhitelistedIpRanges, virtualNetwork);
        }
    }
}
