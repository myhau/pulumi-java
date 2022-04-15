// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.azurenative.devtestlab.outputs.LabAnnouncementPropertiesResponse;
import io.pulumi.azurenative.devtestlab.outputs.LabSupportPropertiesResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetLabResult {
    /**
     * The properties of any lab announcement associated with this lab
     * 
     */
    private final @Nullable LabAnnouncementPropertiesResponse announcement;
    /**
     * The lab's artifact storage account.
     * 
     */
    private final String artifactsStorageAccount;
    /**
     * The creation date of the lab.
     * 
     */
    private final String createdDate;
    /**
     * The lab's default premium storage account.
     * 
     */
    private final String defaultPremiumStorageAccount;
    /**
     * The lab's default storage account.
     * 
     */
    private final String defaultStorageAccount;
    /**
     * The access rights to be granted to the user when provisioning an environment
     * 
     */
    private final @Nullable String environmentPermission;
    /**
     * Extended properties of the lab used for experimental features
     * 
     */
    private final @Nullable Map<String,String> extendedProperties;
    /**
     * The identifier of the resource.
     * 
     */
    private final String id;
    /**
     * Type of storage used by the lab. It can be either Premium or Standard. Default is Premium.
     * 
     */
    private final @Nullable String labStorageType;
    /**
     * The load balancer used to for lab VMs that use shared IP address.
     * 
     */
    private final String loadBalancerId;
    /**
     * The location of the resource.
     * 
     */
    private final @Nullable String location;
    /**
     * The ordered list of artifact resource IDs that should be applied on all Linux VM creations by default, prior to the artifacts specified by the user.
     * 
     */
    private final @Nullable List<String> mandatoryArtifactsResourceIdsLinux;
    /**
     * The ordered list of artifact resource IDs that should be applied on all Windows VM creations by default, prior to the artifacts specified by the user.
     * 
     */
    private final @Nullable List<String> mandatoryArtifactsResourceIdsWindows;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * The Network Security Group attached to the lab VMs Network interfaces to restrict open ports.
     * 
     */
    private final String networkSecurityGroupId;
    /**
     * The lab's premium data disk storage account.
     * 
     */
    private final String premiumDataDiskStorageAccount;
    /**
     * The setting to enable usage of premium data disks.
     * When its value is 'Enabled', creation of standard or premium data disks is allowed.
     * When its value is 'Disabled', only creation of standard data disks is allowed.
     * 
     */
    private final @Nullable String premiumDataDisks;
    /**
     * The provisioning status of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * The public IP address for the lab's load balancer.
     * 
     */
    private final String publicIpId;
    /**
     * The properties of any lab support message associated with this lab
     * 
     */
    private final @Nullable LabSupportPropertiesResponse support;
    /**
     * The tags of the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource.
     * 
     */
    private final String type;
    /**
     * The unique immutable identifier of a resource (Guid).
     * 
     */
    private final String uniqueIdentifier;
    /**
     * The lab's Key vault.
     * 
     */
    private final String vaultName;
    /**
     * The resource group in which all new lab virtual machines will be created. To let DevTest Labs manage resource group creation, set this value to null.
     * 
     */
    private final String vmCreationResourceGroup;

    @CustomType.Constructor
    private GetLabResult(
        @CustomType.Parameter("announcement") @Nullable LabAnnouncementPropertiesResponse announcement,
        @CustomType.Parameter("artifactsStorageAccount") String artifactsStorageAccount,
        @CustomType.Parameter("createdDate") String createdDate,
        @CustomType.Parameter("defaultPremiumStorageAccount") String defaultPremiumStorageAccount,
        @CustomType.Parameter("defaultStorageAccount") String defaultStorageAccount,
        @CustomType.Parameter("environmentPermission") @Nullable String environmentPermission,
        @CustomType.Parameter("extendedProperties") @Nullable Map<String,String> extendedProperties,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("labStorageType") @Nullable String labStorageType,
        @CustomType.Parameter("loadBalancerId") String loadBalancerId,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("mandatoryArtifactsResourceIdsLinux") @Nullable List<String> mandatoryArtifactsResourceIdsLinux,
        @CustomType.Parameter("mandatoryArtifactsResourceIdsWindows") @Nullable List<String> mandatoryArtifactsResourceIdsWindows,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("networkSecurityGroupId") String networkSecurityGroupId,
        @CustomType.Parameter("premiumDataDiskStorageAccount") String premiumDataDiskStorageAccount,
        @CustomType.Parameter("premiumDataDisks") @Nullable String premiumDataDisks,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("publicIpId") String publicIpId,
        @CustomType.Parameter("support") @Nullable LabSupportPropertiesResponse support,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("uniqueIdentifier") String uniqueIdentifier,
        @CustomType.Parameter("vaultName") String vaultName,
        @CustomType.Parameter("vmCreationResourceGroup") String vmCreationResourceGroup) {
        this.announcement = announcement;
        this.artifactsStorageAccount = artifactsStorageAccount;
        this.createdDate = createdDate;
        this.defaultPremiumStorageAccount = defaultPremiumStorageAccount;
        this.defaultStorageAccount = defaultStorageAccount;
        this.environmentPermission = environmentPermission;
        this.extendedProperties = extendedProperties;
        this.id = id;
        this.labStorageType = labStorageType;
        this.loadBalancerId = loadBalancerId;
        this.location = location;
        this.mandatoryArtifactsResourceIdsLinux = mandatoryArtifactsResourceIdsLinux;
        this.mandatoryArtifactsResourceIdsWindows = mandatoryArtifactsResourceIdsWindows;
        this.name = name;
        this.networkSecurityGroupId = networkSecurityGroupId;
        this.premiumDataDiskStorageAccount = premiumDataDiskStorageAccount;
        this.premiumDataDisks = premiumDataDisks;
        this.provisioningState = provisioningState;
        this.publicIpId = publicIpId;
        this.support = support;
        this.tags = tags;
        this.type = type;
        this.uniqueIdentifier = uniqueIdentifier;
        this.vaultName = vaultName;
        this.vmCreationResourceGroup = vmCreationResourceGroup;
    }

    /**
     * The properties of any lab announcement associated with this lab
     * 
    */
    public Optional<LabAnnouncementPropertiesResponse> announcement() {
        return Optional.ofNullable(this.announcement);
    }
    /**
     * The lab's artifact storage account.
     * 
    */
    public String artifactsStorageAccount() {
        return this.artifactsStorageAccount;
    }
    /**
     * The creation date of the lab.
     * 
    */
    public String createdDate() {
        return this.createdDate;
    }
    /**
     * The lab's default premium storage account.
     * 
    */
    public String defaultPremiumStorageAccount() {
        return this.defaultPremiumStorageAccount;
    }
    /**
     * The lab's default storage account.
     * 
    */
    public String defaultStorageAccount() {
        return this.defaultStorageAccount;
    }
    /**
     * The access rights to be granted to the user when provisioning an environment
     * 
    */
    public Optional<String> environmentPermission() {
        return Optional.ofNullable(this.environmentPermission);
    }
    /**
     * Extended properties of the lab used for experimental features
     * 
    */
    public Map<String,String> extendedProperties() {
        return this.extendedProperties == null ? Map.of() : this.extendedProperties;
    }
    /**
     * The identifier of the resource.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Type of storage used by the lab. It can be either Premium or Standard. Default is Premium.
     * 
    */
    public Optional<String> labStorageType() {
        return Optional.ofNullable(this.labStorageType);
    }
    /**
     * The load balancer used to for lab VMs that use shared IP address.
     * 
    */
    public String loadBalancerId() {
        return this.loadBalancerId;
    }
    /**
     * The location of the resource.
     * 
    */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The ordered list of artifact resource IDs that should be applied on all Linux VM creations by default, prior to the artifacts specified by the user.
     * 
    */
    public List<String> mandatoryArtifactsResourceIdsLinux() {
        return this.mandatoryArtifactsResourceIdsLinux == null ? List.of() : this.mandatoryArtifactsResourceIdsLinux;
    }
    /**
     * The ordered list of artifact resource IDs that should be applied on all Windows VM creations by default, prior to the artifacts specified by the user.
     * 
    */
    public List<String> mandatoryArtifactsResourceIdsWindows() {
        return this.mandatoryArtifactsResourceIdsWindows == null ? List.of() : this.mandatoryArtifactsResourceIdsWindows;
    }
    /**
     * The name of the resource.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The Network Security Group attached to the lab VMs Network interfaces to restrict open ports.
     * 
    */
    public String networkSecurityGroupId() {
        return this.networkSecurityGroupId;
    }
    /**
     * The lab's premium data disk storage account.
     * 
    */
    public String premiumDataDiskStorageAccount() {
        return this.premiumDataDiskStorageAccount;
    }
    /**
     * The setting to enable usage of premium data disks.
     * When its value is 'Enabled', creation of standard or premium data disks is allowed.
     * When its value is 'Disabled', only creation of standard data disks is allowed.
     * 
    */
    public Optional<String> premiumDataDisks() {
        return Optional.ofNullable(this.premiumDataDisks);
    }
    /**
     * The provisioning status of the resource.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * The public IP address for the lab's load balancer.
     * 
    */
    public String publicIpId() {
        return this.publicIpId;
    }
    /**
     * The properties of any lab support message associated with this lab
     * 
    */
    public Optional<LabSupportPropertiesResponse> support() {
        return Optional.ofNullable(this.support);
    }
    /**
     * The tags of the resource.
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * The unique immutable identifier of a resource (Guid).
     * 
    */
    public String uniqueIdentifier() {
        return this.uniqueIdentifier;
    }
    /**
     * The lab's Key vault.
     * 
    */
    public String vaultName() {
        return this.vaultName;
    }
    /**
     * The resource group in which all new lab virtual machines will be created. To let DevTest Labs manage resource group creation, set this value to null.
     * 
    */
    public String vmCreationResourceGroup() {
        return this.vmCreationResourceGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLabResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LabAnnouncementPropertiesResponse announcement;
        private String artifactsStorageAccount;
        private String createdDate;
        private String defaultPremiumStorageAccount;
        private String defaultStorageAccount;
        private @Nullable String environmentPermission;
        private @Nullable Map<String,String> extendedProperties;
        private String id;
        private @Nullable String labStorageType;
        private String loadBalancerId;
        private @Nullable String location;
        private @Nullable List<String> mandatoryArtifactsResourceIdsLinux;
        private @Nullable List<String> mandatoryArtifactsResourceIdsWindows;
        private String name;
        private String networkSecurityGroupId;
        private String premiumDataDiskStorageAccount;
        private @Nullable String premiumDataDisks;
        private String provisioningState;
        private String publicIpId;
        private @Nullable LabSupportPropertiesResponse support;
        private @Nullable Map<String,String> tags;
        private String type;
        private String uniqueIdentifier;
        private String vaultName;
        private String vmCreationResourceGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLabResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.announcement = defaults.announcement;
    	      this.artifactsStorageAccount = defaults.artifactsStorageAccount;
    	      this.createdDate = defaults.createdDate;
    	      this.defaultPremiumStorageAccount = defaults.defaultPremiumStorageAccount;
    	      this.defaultStorageAccount = defaults.defaultStorageAccount;
    	      this.environmentPermission = defaults.environmentPermission;
    	      this.extendedProperties = defaults.extendedProperties;
    	      this.id = defaults.id;
    	      this.labStorageType = defaults.labStorageType;
    	      this.loadBalancerId = defaults.loadBalancerId;
    	      this.location = defaults.location;
    	      this.mandatoryArtifactsResourceIdsLinux = defaults.mandatoryArtifactsResourceIdsLinux;
    	      this.mandatoryArtifactsResourceIdsWindows = defaults.mandatoryArtifactsResourceIdsWindows;
    	      this.name = defaults.name;
    	      this.networkSecurityGroupId = defaults.networkSecurityGroupId;
    	      this.premiumDataDiskStorageAccount = defaults.premiumDataDiskStorageAccount;
    	      this.premiumDataDisks = defaults.premiumDataDisks;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicIpId = defaults.publicIpId;
    	      this.support = defaults.support;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.uniqueIdentifier = defaults.uniqueIdentifier;
    	      this.vaultName = defaults.vaultName;
    	      this.vmCreationResourceGroup = defaults.vmCreationResourceGroup;
        }

        public Builder announcement(@Nullable LabAnnouncementPropertiesResponse announcement) {
            this.announcement = announcement;
            return this;
        }
        public Builder artifactsStorageAccount(String artifactsStorageAccount) {
            this.artifactsStorageAccount = Objects.requireNonNull(artifactsStorageAccount);
            return this;
        }
        public Builder createdDate(String createdDate) {
            this.createdDate = Objects.requireNonNull(createdDate);
            return this;
        }
        public Builder defaultPremiumStorageAccount(String defaultPremiumStorageAccount) {
            this.defaultPremiumStorageAccount = Objects.requireNonNull(defaultPremiumStorageAccount);
            return this;
        }
        public Builder defaultStorageAccount(String defaultStorageAccount) {
            this.defaultStorageAccount = Objects.requireNonNull(defaultStorageAccount);
            return this;
        }
        public Builder environmentPermission(@Nullable String environmentPermission) {
            this.environmentPermission = environmentPermission;
            return this;
        }
        public Builder extendedProperties(@Nullable Map<String,String> extendedProperties) {
            this.extendedProperties = extendedProperties;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder labStorageType(@Nullable String labStorageType) {
            this.labStorageType = labStorageType;
            return this;
        }
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = Objects.requireNonNull(loadBalancerId);
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder mandatoryArtifactsResourceIdsLinux(@Nullable List<String> mandatoryArtifactsResourceIdsLinux) {
            this.mandatoryArtifactsResourceIdsLinux = mandatoryArtifactsResourceIdsLinux;
            return this;
        }
        public Builder mandatoryArtifactsResourceIdsLinux(String... mandatoryArtifactsResourceIdsLinux) {
            return mandatoryArtifactsResourceIdsLinux(List.of(mandatoryArtifactsResourceIdsLinux));
        }
        public Builder mandatoryArtifactsResourceIdsWindows(@Nullable List<String> mandatoryArtifactsResourceIdsWindows) {
            this.mandatoryArtifactsResourceIdsWindows = mandatoryArtifactsResourceIdsWindows;
            return this;
        }
        public Builder mandatoryArtifactsResourceIdsWindows(String... mandatoryArtifactsResourceIdsWindows) {
            return mandatoryArtifactsResourceIdsWindows(List.of(mandatoryArtifactsResourceIdsWindows));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder networkSecurityGroupId(String networkSecurityGroupId) {
            this.networkSecurityGroupId = Objects.requireNonNull(networkSecurityGroupId);
            return this;
        }
        public Builder premiumDataDiskStorageAccount(String premiumDataDiskStorageAccount) {
            this.premiumDataDiskStorageAccount = Objects.requireNonNull(premiumDataDiskStorageAccount);
            return this;
        }
        public Builder premiumDataDisks(@Nullable String premiumDataDisks) {
            this.premiumDataDisks = premiumDataDisks;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder publicIpId(String publicIpId) {
            this.publicIpId = Objects.requireNonNull(publicIpId);
            return this;
        }
        public Builder support(@Nullable LabSupportPropertiesResponse support) {
            this.support = support;
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
        public Builder uniqueIdentifier(String uniqueIdentifier) {
            this.uniqueIdentifier = Objects.requireNonNull(uniqueIdentifier);
            return this;
        }
        public Builder vaultName(String vaultName) {
            this.vaultName = Objects.requireNonNull(vaultName);
            return this;
        }
        public Builder vmCreationResourceGroup(String vmCreationResourceGroup) {
            this.vmCreationResourceGroup = Objects.requireNonNull(vmCreationResourceGroup);
            return this;
        }        public GetLabResult build() {
            return new GetLabResult(announcement, artifactsStorageAccount, createdDate, defaultPremiumStorageAccount, defaultStorageAccount, environmentPermission, extendedProperties, id, labStorageType, loadBalancerId, location, mandatoryArtifactsResourceIdsLinux, mandatoryArtifactsResourceIdsWindows, name, networkSecurityGroupId, premiumDataDiskStorageAccount, premiumDataDisks, provisioningState, publicIpId, support, tags, type, uniqueIdentifier, vaultName, vmCreationResourceGroup);
        }
    }
}
