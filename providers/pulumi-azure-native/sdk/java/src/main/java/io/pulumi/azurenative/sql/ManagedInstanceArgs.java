// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.sql.enums.ManagedInstanceLicenseType;
import io.pulumi.azurenative.sql.enums.ManagedInstanceProxyOverride;
import io.pulumi.azurenative.sql.enums.ManagedServerCreateMode;
import io.pulumi.azurenative.sql.enums.StorageAccountType;
import io.pulumi.azurenative.sql.inputs.ManagedInstanceExternalAdministratorArgs;
import io.pulumi.azurenative.sql.inputs.ResourceIdentityArgs;
import io.pulumi.azurenative.sql.inputs.SkuArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedInstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedInstanceArgs Empty = new ManagedInstanceArgs();

    /**
     * Administrator username for the managed instance. Can only be specified when the managed instance is being created (and is required for creation).
     * 
     */
    @Import(name="administratorLogin")
      private final @Nullable Output<String> administratorLogin;

    public Output<String> administratorLogin() {
        return this.administratorLogin == null ? Codegen.empty() : this.administratorLogin;
    }

    /**
     * The administrator login password (required for managed instance creation).
     * 
     */
    @Import(name="administratorLoginPassword")
      private final @Nullable Output<String> administratorLoginPassword;

    public Output<String> administratorLoginPassword() {
        return this.administratorLoginPassword == null ? Codegen.empty() : this.administratorLoginPassword;
    }

    /**
     * The Azure Active Directory administrator of the server.
     * 
     */
    @Import(name="administrators")
      private final @Nullable Output<ManagedInstanceExternalAdministratorArgs> administrators;

    public Output<ManagedInstanceExternalAdministratorArgs> administrators() {
        return this.administrators == null ? Codegen.empty() : this.administrators;
    }

    /**
     * Collation of the managed instance.
     * 
     */
    @Import(name="collation")
      private final @Nullable Output<String> collation;

    public Output<String> collation() {
        return this.collation == null ? Codegen.empty() : this.collation;
    }

    /**
     * The resource id of another managed instance whose DNS zone this managed instance will share after creation.
     * 
     */
    @Import(name="dnsZonePartner")
      private final @Nullable Output<String> dnsZonePartner;

    public Output<String> dnsZonePartner() {
        return this.dnsZonePartner == null ? Codegen.empty() : this.dnsZonePartner;
    }

    /**
     * The Azure Active Directory identity of the managed instance.
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<ResourceIdentityArgs> identity;

    public Output<ResourceIdentityArgs> identity() {
        return this.identity == null ? Codegen.empty() : this.identity;
    }

    /**
     * The Id of the instance pool this managed server belongs to.
     * 
     */
    @Import(name="instancePoolId")
      private final @Nullable Output<String> instancePoolId;

    public Output<String> instancePoolId() {
        return this.instancePoolId == null ? Codegen.empty() : this.instancePoolId;
    }

    /**
     * A CMK URI of the key to use for encryption.
     * 
     */
    @Import(name="keyId")
      private final @Nullable Output<String> keyId;

    public Output<String> keyId() {
        return this.keyId == null ? Codegen.empty() : this.keyId;
    }

    /**
     * The license type. Possible values are 'LicenseIncluded' (regular price inclusive of a new SQL license) and 'BasePrice' (discounted AHB price for bringing your own SQL licenses).
     * 
     */
    @Import(name="licenseType")
      private final @Nullable Output<Either<String,ManagedInstanceLicenseType>> licenseType;

    public Output<Either<String,ManagedInstanceLicenseType>> licenseType() {
        return this.licenseType == null ? Codegen.empty() : this.licenseType;
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Specifies maintenance configuration id to apply to this managed instance.
     * 
     */
    @Import(name="maintenanceConfigurationId")
      private final @Nullable Output<String> maintenanceConfigurationId;

    public Output<String> maintenanceConfigurationId() {
        return this.maintenanceConfigurationId == null ? Codegen.empty() : this.maintenanceConfigurationId;
    }

    /**
     * Specifies the mode of database creation.
     * 
     * Default: Regular instance creation.
     * 
     * Restore: Creates an instance by restoring a set of backups to specific point in time. RestorePointInTime and SourceManagedInstanceId must be specified.
     * 
     */
    @Import(name="managedInstanceCreateMode")
      private final @Nullable Output<Either<String,ManagedServerCreateMode>> managedInstanceCreateMode;

    public Output<Either<String,ManagedServerCreateMode>> managedInstanceCreateMode() {
        return this.managedInstanceCreateMode == null ? Codegen.empty() : this.managedInstanceCreateMode;
    }

    /**
     * The name of the managed instance.
     * 
     */
    @Import(name="managedInstanceName")
      private final @Nullable Output<String> managedInstanceName;

    public Output<String> managedInstanceName() {
        return this.managedInstanceName == null ? Codegen.empty() : this.managedInstanceName;
    }

    /**
     * Minimal TLS version. Allowed values: 'None', '1.0', '1.1', '1.2'
     * 
     */
    @Import(name="minimalTlsVersion")
      private final @Nullable Output<String> minimalTlsVersion;

    public Output<String> minimalTlsVersion() {
        return this.minimalTlsVersion == null ? Codegen.empty() : this.minimalTlsVersion;
    }

    /**
     * The resource id of a user assigned identity to be used by default.
     * 
     */
    @Import(name="primaryUserAssignedIdentityId")
      private final @Nullable Output<String> primaryUserAssignedIdentityId;

    public Output<String> primaryUserAssignedIdentityId() {
        return this.primaryUserAssignedIdentityId == null ? Codegen.empty() : this.primaryUserAssignedIdentityId;
    }

    /**
     * Connection type used for connecting to the instance.
     * 
     */
    @Import(name="proxyOverride")
      private final @Nullable Output<Either<String,ManagedInstanceProxyOverride>> proxyOverride;

    public Output<Either<String,ManagedInstanceProxyOverride>> proxyOverride() {
        return this.proxyOverride == null ? Codegen.empty() : this.proxyOverride;
    }

    /**
     * Whether or not the public data endpoint is enabled.
     * 
     */
    @Import(name="publicDataEndpointEnabled")
      private final @Nullable Output<Boolean> publicDataEndpointEnabled;

    public Output<Boolean> publicDataEndpointEnabled() {
        return this.publicDataEndpointEnabled == null ? Codegen.empty() : this.publicDataEndpointEnabled;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Specifies the point in time (ISO8601 format) of the source database that will be restored to create the new database.
     * 
     */
    @Import(name="restorePointInTime")
      private final @Nullable Output<String> restorePointInTime;

    public Output<String> restorePointInTime() {
        return this.restorePointInTime == null ? Codegen.empty() : this.restorePointInTime;
    }

    /**
     * Managed instance SKU. Allowed values for sku.name: GP_Gen4, GP_Gen5, BC_Gen4, BC_Gen5
     * 
     */
    @Import(name="sku")
      private final @Nullable Output<SkuArgs> sku;

    public Output<SkuArgs> sku() {
        return this.sku == null ? Codegen.empty() : this.sku;
    }

    /**
     * The resource identifier of the source managed instance associated with create operation of this instance.
     * 
     */
    @Import(name="sourceManagedInstanceId")
      private final @Nullable Output<String> sourceManagedInstanceId;

    public Output<String> sourceManagedInstanceId() {
        return this.sourceManagedInstanceId == null ? Codegen.empty() : this.sourceManagedInstanceId;
    }

    /**
     * The storage account type used to store backups for this instance. The options are LRS (LocallyRedundantStorage), ZRS (ZoneRedundantStorage) and GRS (GeoRedundantStorage)
     * 
     */
    @Import(name="storageAccountType")
      private final @Nullable Output<Either<String,StorageAccountType>> storageAccountType;

    public Output<Either<String,StorageAccountType>> storageAccountType() {
        return this.storageAccountType == null ? Codegen.empty() : this.storageAccountType;
    }

    /**
     * Storage size in GB. Minimum value: 32. Maximum value: 8192. Increments of 32 GB allowed only.
     * 
     */
    @Import(name="storageSizeInGB")
      private final @Nullable Output<Integer> storageSizeInGB;

    public Output<Integer> storageSizeInGB() {
        return this.storageSizeInGB == null ? Codegen.empty() : this.storageSizeInGB;
    }

    /**
     * Subnet resource ID for the managed instance.
     * 
     */
    @Import(name="subnetId")
      private final @Nullable Output<String> subnetId;

    public Output<String> subnetId() {
        return this.subnetId == null ? Codegen.empty() : this.subnetId;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Id of the timezone. Allowed values are timezones supported by Windows.
     * Windows keeps details on supported timezones, including the id, in registry under
     * KEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows NT\CurrentVersion\Time Zones.
     * You can get those registry values via SQL Server by querying SELECT name AS timezone_id FROM sys.time_zone_info.
     * List of Ids can also be obtained by executing [System.TimeZoneInfo]::GetSystemTimeZones() in PowerShell.
     * An example of valid timezone id is "Pacific Standard Time" or "W. Europe Standard Time".
     * 
     */
    @Import(name="timezoneId")
      private final @Nullable Output<String> timezoneId;

    public Output<String> timezoneId() {
        return this.timezoneId == null ? Codegen.empty() : this.timezoneId;
    }

    /**
     * The number of vCores. Allowed values: 8, 16, 24, 32, 40, 64, 80.
     * 
     */
    @Import(name="vCores")
      private final @Nullable Output<Integer> vCores;

    public Output<Integer> vCores() {
        return this.vCores == null ? Codegen.empty() : this.vCores;
    }

    /**
     * Whether or not the multi-az is enabled.
     * 
     */
    @Import(name="zoneRedundant")
      private final @Nullable Output<Boolean> zoneRedundant;

    public Output<Boolean> zoneRedundant() {
        return this.zoneRedundant == null ? Codegen.empty() : this.zoneRedundant;
    }

    public ManagedInstanceArgs(
        @Nullable Output<String> administratorLogin,
        @Nullable Output<String> administratorLoginPassword,
        @Nullable Output<ManagedInstanceExternalAdministratorArgs> administrators,
        @Nullable Output<String> collation,
        @Nullable Output<String> dnsZonePartner,
        @Nullable Output<ResourceIdentityArgs> identity,
        @Nullable Output<String> instancePoolId,
        @Nullable Output<String> keyId,
        @Nullable Output<Either<String,ManagedInstanceLicenseType>> licenseType,
        @Nullable Output<String> location,
        @Nullable Output<String> maintenanceConfigurationId,
        @Nullable Output<Either<String,ManagedServerCreateMode>> managedInstanceCreateMode,
        @Nullable Output<String> managedInstanceName,
        @Nullable Output<String> minimalTlsVersion,
        @Nullable Output<String> primaryUserAssignedIdentityId,
        @Nullable Output<Either<String,ManagedInstanceProxyOverride>> proxyOverride,
        @Nullable Output<Boolean> publicDataEndpointEnabled,
        Output<String> resourceGroupName,
        @Nullable Output<String> restorePointInTime,
        @Nullable Output<SkuArgs> sku,
        @Nullable Output<String> sourceManagedInstanceId,
        @Nullable Output<Either<String,StorageAccountType>> storageAccountType,
        @Nullable Output<Integer> storageSizeInGB,
        @Nullable Output<String> subnetId,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> timezoneId,
        @Nullable Output<Integer> vCores,
        @Nullable Output<Boolean> zoneRedundant) {
        this.administratorLogin = administratorLogin;
        this.administratorLoginPassword = administratorLoginPassword;
        this.administrators = administrators;
        this.collation = collation;
        this.dnsZonePartner = dnsZonePartner;
        this.identity = identity;
        this.instancePoolId = instancePoolId;
        this.keyId = keyId;
        this.licenseType = licenseType;
        this.location = location;
        this.maintenanceConfigurationId = maintenanceConfigurationId;
        this.managedInstanceCreateMode = managedInstanceCreateMode;
        this.managedInstanceName = managedInstanceName;
        this.minimalTlsVersion = minimalTlsVersion;
        this.primaryUserAssignedIdentityId = primaryUserAssignedIdentityId;
        this.proxyOverride = proxyOverride;
        this.publicDataEndpointEnabled = publicDataEndpointEnabled;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.restorePointInTime = restorePointInTime;
        this.sku = sku;
        this.sourceManagedInstanceId = sourceManagedInstanceId;
        this.storageAccountType = storageAccountType;
        this.storageSizeInGB = storageSizeInGB;
        this.subnetId = subnetId;
        this.tags = tags;
        this.timezoneId = timezoneId;
        this.vCores = vCores;
        this.zoneRedundant = zoneRedundant;
    }

    private ManagedInstanceArgs() {
        this.administratorLogin = Codegen.empty();
        this.administratorLoginPassword = Codegen.empty();
        this.administrators = Codegen.empty();
        this.collation = Codegen.empty();
        this.dnsZonePartner = Codegen.empty();
        this.identity = Codegen.empty();
        this.instancePoolId = Codegen.empty();
        this.keyId = Codegen.empty();
        this.licenseType = Codegen.empty();
        this.location = Codegen.empty();
        this.maintenanceConfigurationId = Codegen.empty();
        this.managedInstanceCreateMode = Codegen.empty();
        this.managedInstanceName = Codegen.empty();
        this.minimalTlsVersion = Codegen.empty();
        this.primaryUserAssignedIdentityId = Codegen.empty();
        this.proxyOverride = Codegen.empty();
        this.publicDataEndpointEnabled = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.restorePointInTime = Codegen.empty();
        this.sku = Codegen.empty();
        this.sourceManagedInstanceId = Codegen.empty();
        this.storageAccountType = Codegen.empty();
        this.storageSizeInGB = Codegen.empty();
        this.subnetId = Codegen.empty();
        this.tags = Codegen.empty();
        this.timezoneId = Codegen.empty();
        this.vCores = Codegen.empty();
        this.zoneRedundant = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> administratorLogin;
        private @Nullable Output<String> administratorLoginPassword;
        private @Nullable Output<ManagedInstanceExternalAdministratorArgs> administrators;
        private @Nullable Output<String> collation;
        private @Nullable Output<String> dnsZonePartner;
        private @Nullable Output<ResourceIdentityArgs> identity;
        private @Nullable Output<String> instancePoolId;
        private @Nullable Output<String> keyId;
        private @Nullable Output<Either<String,ManagedInstanceLicenseType>> licenseType;
        private @Nullable Output<String> location;
        private @Nullable Output<String> maintenanceConfigurationId;
        private @Nullable Output<Either<String,ManagedServerCreateMode>> managedInstanceCreateMode;
        private @Nullable Output<String> managedInstanceName;
        private @Nullable Output<String> minimalTlsVersion;
        private @Nullable Output<String> primaryUserAssignedIdentityId;
        private @Nullable Output<Either<String,ManagedInstanceProxyOverride>> proxyOverride;
        private @Nullable Output<Boolean> publicDataEndpointEnabled;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> restorePointInTime;
        private @Nullable Output<SkuArgs> sku;
        private @Nullable Output<String> sourceManagedInstanceId;
        private @Nullable Output<Either<String,StorageAccountType>> storageAccountType;
        private @Nullable Output<Integer> storageSizeInGB;
        private @Nullable Output<String> subnetId;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> timezoneId;
        private @Nullable Output<Integer> vCores;
        private @Nullable Output<Boolean> zoneRedundant;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedInstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administratorLogin = defaults.administratorLogin;
    	      this.administratorLoginPassword = defaults.administratorLoginPassword;
    	      this.administrators = defaults.administrators;
    	      this.collation = defaults.collation;
    	      this.dnsZonePartner = defaults.dnsZonePartner;
    	      this.identity = defaults.identity;
    	      this.instancePoolId = defaults.instancePoolId;
    	      this.keyId = defaults.keyId;
    	      this.licenseType = defaults.licenseType;
    	      this.location = defaults.location;
    	      this.maintenanceConfigurationId = defaults.maintenanceConfigurationId;
    	      this.managedInstanceCreateMode = defaults.managedInstanceCreateMode;
    	      this.managedInstanceName = defaults.managedInstanceName;
    	      this.minimalTlsVersion = defaults.minimalTlsVersion;
    	      this.primaryUserAssignedIdentityId = defaults.primaryUserAssignedIdentityId;
    	      this.proxyOverride = defaults.proxyOverride;
    	      this.publicDataEndpointEnabled = defaults.publicDataEndpointEnabled;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.restorePointInTime = defaults.restorePointInTime;
    	      this.sku = defaults.sku;
    	      this.sourceManagedInstanceId = defaults.sourceManagedInstanceId;
    	      this.storageAccountType = defaults.storageAccountType;
    	      this.storageSizeInGB = defaults.storageSizeInGB;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
    	      this.timezoneId = defaults.timezoneId;
    	      this.vCores = defaults.vCores;
    	      this.zoneRedundant = defaults.zoneRedundant;
        }

        public Builder administratorLogin(@Nullable Output<String> administratorLogin) {
            this.administratorLogin = administratorLogin;
            return this;
        }
        public Builder administratorLogin(@Nullable String administratorLogin) {
            this.administratorLogin = Codegen.ofNullable(administratorLogin);
            return this;
        }
        public Builder administratorLoginPassword(@Nullable Output<String> administratorLoginPassword) {
            this.administratorLoginPassword = administratorLoginPassword;
            return this;
        }
        public Builder administratorLoginPassword(@Nullable String administratorLoginPassword) {
            this.administratorLoginPassword = Codegen.ofNullable(administratorLoginPassword);
            return this;
        }
        public Builder administrators(@Nullable Output<ManagedInstanceExternalAdministratorArgs> administrators) {
            this.administrators = administrators;
            return this;
        }
        public Builder administrators(@Nullable ManagedInstanceExternalAdministratorArgs administrators) {
            this.administrators = Codegen.ofNullable(administrators);
            return this;
        }
        public Builder collation(@Nullable Output<String> collation) {
            this.collation = collation;
            return this;
        }
        public Builder collation(@Nullable String collation) {
            this.collation = Codegen.ofNullable(collation);
            return this;
        }
        public Builder dnsZonePartner(@Nullable Output<String> dnsZonePartner) {
            this.dnsZonePartner = dnsZonePartner;
            return this;
        }
        public Builder dnsZonePartner(@Nullable String dnsZonePartner) {
            this.dnsZonePartner = Codegen.ofNullable(dnsZonePartner);
            return this;
        }
        public Builder identity(@Nullable Output<ResourceIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }
        public Builder identity(@Nullable ResourceIdentityArgs identity) {
            this.identity = Codegen.ofNullable(identity);
            return this;
        }
        public Builder instancePoolId(@Nullable Output<String> instancePoolId) {
            this.instancePoolId = instancePoolId;
            return this;
        }
        public Builder instancePoolId(@Nullable String instancePoolId) {
            this.instancePoolId = Codegen.ofNullable(instancePoolId);
            return this;
        }
        public Builder keyId(@Nullable Output<String> keyId) {
            this.keyId = keyId;
            return this;
        }
        public Builder keyId(@Nullable String keyId) {
            this.keyId = Codegen.ofNullable(keyId);
            return this;
        }
        public Builder licenseType(@Nullable Output<Either<String,ManagedInstanceLicenseType>> licenseType) {
            this.licenseType = licenseType;
            return this;
        }
        public Builder licenseType(@Nullable Either<String,ManagedInstanceLicenseType> licenseType) {
            this.licenseType = Codegen.ofNullable(licenseType);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder maintenanceConfigurationId(@Nullable Output<String> maintenanceConfigurationId) {
            this.maintenanceConfigurationId = maintenanceConfigurationId;
            return this;
        }
        public Builder maintenanceConfigurationId(@Nullable String maintenanceConfigurationId) {
            this.maintenanceConfigurationId = Codegen.ofNullable(maintenanceConfigurationId);
            return this;
        }
        public Builder managedInstanceCreateMode(@Nullable Output<Either<String,ManagedServerCreateMode>> managedInstanceCreateMode) {
            this.managedInstanceCreateMode = managedInstanceCreateMode;
            return this;
        }
        public Builder managedInstanceCreateMode(@Nullable Either<String,ManagedServerCreateMode> managedInstanceCreateMode) {
            this.managedInstanceCreateMode = Codegen.ofNullable(managedInstanceCreateMode);
            return this;
        }
        public Builder managedInstanceName(@Nullable Output<String> managedInstanceName) {
            this.managedInstanceName = managedInstanceName;
            return this;
        }
        public Builder managedInstanceName(@Nullable String managedInstanceName) {
            this.managedInstanceName = Codegen.ofNullable(managedInstanceName);
            return this;
        }
        public Builder minimalTlsVersion(@Nullable Output<String> minimalTlsVersion) {
            this.minimalTlsVersion = minimalTlsVersion;
            return this;
        }
        public Builder minimalTlsVersion(@Nullable String minimalTlsVersion) {
            this.minimalTlsVersion = Codegen.ofNullable(minimalTlsVersion);
            return this;
        }
        public Builder primaryUserAssignedIdentityId(@Nullable Output<String> primaryUserAssignedIdentityId) {
            this.primaryUserAssignedIdentityId = primaryUserAssignedIdentityId;
            return this;
        }
        public Builder primaryUserAssignedIdentityId(@Nullable String primaryUserAssignedIdentityId) {
            this.primaryUserAssignedIdentityId = Codegen.ofNullable(primaryUserAssignedIdentityId);
            return this;
        }
        public Builder proxyOverride(@Nullable Output<Either<String,ManagedInstanceProxyOverride>> proxyOverride) {
            this.proxyOverride = proxyOverride;
            return this;
        }
        public Builder proxyOverride(@Nullable Either<String,ManagedInstanceProxyOverride> proxyOverride) {
            this.proxyOverride = Codegen.ofNullable(proxyOverride);
            return this;
        }
        public Builder publicDataEndpointEnabled(@Nullable Output<Boolean> publicDataEndpointEnabled) {
            this.publicDataEndpointEnabled = publicDataEndpointEnabled;
            return this;
        }
        public Builder publicDataEndpointEnabled(@Nullable Boolean publicDataEndpointEnabled) {
            this.publicDataEndpointEnabled = Codegen.ofNullable(publicDataEndpointEnabled);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder restorePointInTime(@Nullable Output<String> restorePointInTime) {
            this.restorePointInTime = restorePointInTime;
            return this;
        }
        public Builder restorePointInTime(@Nullable String restorePointInTime) {
            this.restorePointInTime = Codegen.ofNullable(restorePointInTime);
            return this;
        }
        public Builder sku(@Nullable Output<SkuArgs> sku) {
            this.sku = sku;
            return this;
        }
        public Builder sku(@Nullable SkuArgs sku) {
            this.sku = Codegen.ofNullable(sku);
            return this;
        }
        public Builder sourceManagedInstanceId(@Nullable Output<String> sourceManagedInstanceId) {
            this.sourceManagedInstanceId = sourceManagedInstanceId;
            return this;
        }
        public Builder sourceManagedInstanceId(@Nullable String sourceManagedInstanceId) {
            this.sourceManagedInstanceId = Codegen.ofNullable(sourceManagedInstanceId);
            return this;
        }
        public Builder storageAccountType(@Nullable Output<Either<String,StorageAccountType>> storageAccountType) {
            this.storageAccountType = storageAccountType;
            return this;
        }
        public Builder storageAccountType(@Nullable Either<String,StorageAccountType> storageAccountType) {
            this.storageAccountType = Codegen.ofNullable(storageAccountType);
            return this;
        }
        public Builder storageSizeInGB(@Nullable Output<Integer> storageSizeInGB) {
            this.storageSizeInGB = storageSizeInGB;
            return this;
        }
        public Builder storageSizeInGB(@Nullable Integer storageSizeInGB) {
            this.storageSizeInGB = Codegen.ofNullable(storageSizeInGB);
            return this;
        }
        public Builder subnetId(@Nullable Output<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = Codegen.ofNullable(subnetId);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder timezoneId(@Nullable Output<String> timezoneId) {
            this.timezoneId = timezoneId;
            return this;
        }
        public Builder timezoneId(@Nullable String timezoneId) {
            this.timezoneId = Codegen.ofNullable(timezoneId);
            return this;
        }
        public Builder vCores(@Nullable Output<Integer> vCores) {
            this.vCores = vCores;
            return this;
        }
        public Builder vCores(@Nullable Integer vCores) {
            this.vCores = Codegen.ofNullable(vCores);
            return this;
        }
        public Builder zoneRedundant(@Nullable Output<Boolean> zoneRedundant) {
            this.zoneRedundant = zoneRedundant;
            return this;
        }
        public Builder zoneRedundant(@Nullable Boolean zoneRedundant) {
            this.zoneRedundant = Codegen.ofNullable(zoneRedundant);
            return this;
        }        public ManagedInstanceArgs build() {
            return new ManagedInstanceArgs(administratorLogin, administratorLoginPassword, administrators, collation, dnsZonePartner, identity, instancePoolId, keyId, licenseType, location, maintenanceConfigurationId, managedInstanceCreateMode, managedInstanceName, minimalTlsVersion, primaryUserAssignedIdentityId, proxyOverride, publicDataEndpointEnabled, resourceGroupName, restorePointInTime, sku, sourceManagedInstanceId, storageAccountType, storageSizeInGB, subnetId, tags, timezoneId, vCores, zoneRedundant);
        }
    }
}
