// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx;

import io.pulumi.aws.fsx.inputs.OpenZfsFileSystemDiskIopsConfigurationArgs;
import io.pulumi.aws.fsx.inputs.OpenZfsFileSystemRootVolumeConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OpenZfsFileSystemArgs extends io.pulumi.resources.ResourceArgs {

    public static final OpenZfsFileSystemArgs Empty = new OpenZfsFileSystemArgs();

    /**
     * The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain automatic backups for a maximum of 90 days.
     * 
     */
    @InputImport(name="automaticBackupRetentionDays")
      private final @Nullable Input<Integer> automaticBackupRetentionDays;

    public Input<Integer> getAutomaticBackupRetentionDays() {
        return this.automaticBackupRetentionDays == null ? Input.empty() : this.automaticBackupRetentionDays;
    }

    /**
     * The ID of the source backup to create the filesystem from.
     * 
     */
    @InputImport(name="backupId")
      private final @Nullable Input<String> backupId;

    public Input<String> getBackupId() {
        return this.backupId == null ? Input.empty() : this.backupId;
    }

    /**
     * A boolean flag indicating whether tags for the file system should be copied to backups. The default value is false.
     * 
     */
    @InputImport(name="copyTagsToBackups")
      private final @Nullable Input<Boolean> copyTagsToBackups;

    public Input<Boolean> getCopyTagsToBackups() {
        return this.copyTagsToBackups == null ? Input.empty() : this.copyTagsToBackups;
    }

    /**
     * A boolean flag indicating whether tags for the file system should be copied to snapshots. The default value is false.
     * 
     */
    @InputImport(name="copyTagsToVolumes")
      private final @Nullable Input<Boolean> copyTagsToVolumes;

    public Input<Boolean> getCopyTagsToVolumes() {
        return this.copyTagsToVolumes == null ? Input.empty() : this.copyTagsToVolumes;
    }

    /**
     * A recurring daily time, in the format HH:MM. HH is the zero-padded hour of the day (0-23), and MM is the zero-padded minute of the hour. For example, 05:00 specifies 5 AM daily. Requires `automatic_backup_retention_days` to be set.
     * 
     */
    @InputImport(name="dailyAutomaticBackupStartTime")
      private final @Nullable Input<String> dailyAutomaticBackupStartTime;

    public Input<String> getDailyAutomaticBackupStartTime() {
        return this.dailyAutomaticBackupStartTime == null ? Input.empty() : this.dailyAutomaticBackupStartTime;
    }

    /**
     * - The filesystem deployment type. Only `SINGLE_AZ_1` is supported.
     * 
     */
    @InputImport(name="deploymentType", required=true)
      private final Input<String> deploymentType;

    public Input<String> getDeploymentType() {
        return this.deploymentType;
    }

    /**
     * The SSD IOPS configuration for the Amazon FSx for OpenZFS file system. See Disk Iops Configuration Below.
     * 
     */
    @InputImport(name="diskIopsConfiguration")
      private final @Nullable Input<OpenZfsFileSystemDiskIopsConfigurationArgs> diskIopsConfiguration;

    public Input<OpenZfsFileSystemDiskIopsConfigurationArgs> getDiskIopsConfiguration() {
        return this.diskIopsConfiguration == null ? Input.empty() : this.diskIopsConfiguration;
    }

    /**
     * ARN for the KMS Key to encrypt the file system at rest, Defaults to an AWS managed KMS Key.
     * 
     */
    @InputImport(name="kmsKeyId")
      private final @Nullable Input<String> kmsKeyId;

    public Input<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Input.empty() : this.kmsKeyId;
    }

    /**
     * The configuration for the root volume of the file system. All other volumes are children or the root volume. See Root Volume Configuration Below.
     * 
     */
    @InputImport(name="rootVolumeConfiguration")
      private final @Nullable Input<OpenZfsFileSystemRootVolumeConfigurationArgs> rootVolumeConfiguration;

    public Input<OpenZfsFileSystemRootVolumeConfigurationArgs> getRootVolumeConfiguration() {
        return this.rootVolumeConfiguration == null ? Input.empty() : this.rootVolumeConfiguration;
    }

    /**
     * A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups will apply to all network interfaces.
     * 
     */
    @InputImport(name="securityGroupIds")
      private final @Nullable Input<List<String>> securityGroupIds;

    public Input<List<String>> getSecurityGroupIds() {
        return this.securityGroupIds == null ? Input.empty() : this.securityGroupIds;
    }

    /**
     * The storage capacity (GiB) of the file system. Valid values between `64` and `524288`.
     * 
     */
    @InputImport(name="storageCapacity")
      private final @Nullable Input<Integer> storageCapacity;

    public Input<Integer> getStorageCapacity() {
        return this.storageCapacity == null ? Input.empty() : this.storageCapacity;
    }

    /**
     * The filesystem storage type. Only `SSD` is supported.
     * 
     */
    @InputImport(name="storageType")
      private final @Nullable Input<String> storageType;

    public Input<String> getStorageType() {
        return this.storageType == null ? Input.empty() : this.storageType;
    }

    /**
     * A list of IDs for the subnets that the file system will be accessible from. Exactly 1 subnet need to be provided.
     * 
     */
    @InputImport(name="subnetIds", required=true)
      private final Input<String> subnetIds;

    public Input<String> getSubnetIds() {
        return this.subnetIds;
    }

    /**
     * A map of tags to assign to the file system. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * Throughput (megabytes per second) of the file system in power of 2 increments. Minimum of `64` and maximum of `4096`.
     * 
     */
    @InputImport(name="throughputCapacity", required=true)
      private final Input<Integer> throughputCapacity;

    public Input<Integer> getThroughputCapacity() {
        return this.throughputCapacity;
    }

    /**
     * The preferred start time (in `d:HH:MM` format) to perform weekly maintenance, in the UTC time zone.
     * 
     */
    @InputImport(name="weeklyMaintenanceStartTime")
      private final @Nullable Input<String> weeklyMaintenanceStartTime;

    public Input<String> getWeeklyMaintenanceStartTime() {
        return this.weeklyMaintenanceStartTime == null ? Input.empty() : this.weeklyMaintenanceStartTime;
    }

    public OpenZfsFileSystemArgs(
        @Nullable Input<Integer> automaticBackupRetentionDays,
        @Nullable Input<String> backupId,
        @Nullable Input<Boolean> copyTagsToBackups,
        @Nullable Input<Boolean> copyTagsToVolumes,
        @Nullable Input<String> dailyAutomaticBackupStartTime,
        Input<String> deploymentType,
        @Nullable Input<OpenZfsFileSystemDiskIopsConfigurationArgs> diskIopsConfiguration,
        @Nullable Input<String> kmsKeyId,
        @Nullable Input<OpenZfsFileSystemRootVolumeConfigurationArgs> rootVolumeConfiguration,
        @Nullable Input<List<String>> securityGroupIds,
        @Nullable Input<Integer> storageCapacity,
        @Nullable Input<String> storageType,
        Input<String> subnetIds,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        Input<Integer> throughputCapacity,
        @Nullable Input<String> weeklyMaintenanceStartTime) {
        this.automaticBackupRetentionDays = automaticBackupRetentionDays;
        this.backupId = backupId;
        this.copyTagsToBackups = copyTagsToBackups;
        this.copyTagsToVolumes = copyTagsToVolumes;
        this.dailyAutomaticBackupStartTime = dailyAutomaticBackupStartTime;
        this.deploymentType = Objects.requireNonNull(deploymentType, "expected parameter 'deploymentType' to be non-null");
        this.diskIopsConfiguration = diskIopsConfiguration;
        this.kmsKeyId = kmsKeyId;
        this.rootVolumeConfiguration = rootVolumeConfiguration;
        this.securityGroupIds = securityGroupIds;
        this.storageCapacity = storageCapacity;
        this.storageType = storageType;
        this.subnetIds = Objects.requireNonNull(subnetIds, "expected parameter 'subnetIds' to be non-null");
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.throughputCapacity = Objects.requireNonNull(throughputCapacity, "expected parameter 'throughputCapacity' to be non-null");
        this.weeklyMaintenanceStartTime = weeklyMaintenanceStartTime;
    }

    private OpenZfsFileSystemArgs() {
        this.automaticBackupRetentionDays = Input.empty();
        this.backupId = Input.empty();
        this.copyTagsToBackups = Input.empty();
        this.copyTagsToVolumes = Input.empty();
        this.dailyAutomaticBackupStartTime = Input.empty();
        this.deploymentType = Input.empty();
        this.diskIopsConfiguration = Input.empty();
        this.kmsKeyId = Input.empty();
        this.rootVolumeConfiguration = Input.empty();
        this.securityGroupIds = Input.empty();
        this.storageCapacity = Input.empty();
        this.storageType = Input.empty();
        this.subnetIds = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.throughputCapacity = Input.empty();
        this.weeklyMaintenanceStartTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenZfsFileSystemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> automaticBackupRetentionDays;
        private @Nullable Input<String> backupId;
        private @Nullable Input<Boolean> copyTagsToBackups;
        private @Nullable Input<Boolean> copyTagsToVolumes;
        private @Nullable Input<String> dailyAutomaticBackupStartTime;
        private Input<String> deploymentType;
        private @Nullable Input<OpenZfsFileSystemDiskIopsConfigurationArgs> diskIopsConfiguration;
        private @Nullable Input<String> kmsKeyId;
        private @Nullable Input<OpenZfsFileSystemRootVolumeConfigurationArgs> rootVolumeConfiguration;
        private @Nullable Input<List<String>> securityGroupIds;
        private @Nullable Input<Integer> storageCapacity;
        private @Nullable Input<String> storageType;
        private Input<String> subnetIds;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private Input<Integer> throughputCapacity;
        private @Nullable Input<String> weeklyMaintenanceStartTime;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenZfsFileSystemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticBackupRetentionDays = defaults.automaticBackupRetentionDays;
    	      this.backupId = defaults.backupId;
    	      this.copyTagsToBackups = defaults.copyTagsToBackups;
    	      this.copyTagsToVolumes = defaults.copyTagsToVolumes;
    	      this.dailyAutomaticBackupStartTime = defaults.dailyAutomaticBackupStartTime;
    	      this.deploymentType = defaults.deploymentType;
    	      this.diskIopsConfiguration = defaults.diskIopsConfiguration;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.rootVolumeConfiguration = defaults.rootVolumeConfiguration;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.storageCapacity = defaults.storageCapacity;
    	      this.storageType = defaults.storageType;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.throughputCapacity = defaults.throughputCapacity;
    	      this.weeklyMaintenanceStartTime = defaults.weeklyMaintenanceStartTime;
        }

        public Builder setAutomaticBackupRetentionDays(@Nullable Input<Integer> automaticBackupRetentionDays) {
            this.automaticBackupRetentionDays = automaticBackupRetentionDays;
            return this;
        }

        public Builder setAutomaticBackupRetentionDays(@Nullable Integer automaticBackupRetentionDays) {
            this.automaticBackupRetentionDays = Input.ofNullable(automaticBackupRetentionDays);
            return this;
        }

        public Builder setBackupId(@Nullable Input<String> backupId) {
            this.backupId = backupId;
            return this;
        }

        public Builder setBackupId(@Nullable String backupId) {
            this.backupId = Input.ofNullable(backupId);
            return this;
        }

        public Builder setCopyTagsToBackups(@Nullable Input<Boolean> copyTagsToBackups) {
            this.copyTagsToBackups = copyTagsToBackups;
            return this;
        }

        public Builder setCopyTagsToBackups(@Nullable Boolean copyTagsToBackups) {
            this.copyTagsToBackups = Input.ofNullable(copyTagsToBackups);
            return this;
        }

        public Builder setCopyTagsToVolumes(@Nullable Input<Boolean> copyTagsToVolumes) {
            this.copyTagsToVolumes = copyTagsToVolumes;
            return this;
        }

        public Builder setCopyTagsToVolumes(@Nullable Boolean copyTagsToVolumes) {
            this.copyTagsToVolumes = Input.ofNullable(copyTagsToVolumes);
            return this;
        }

        public Builder setDailyAutomaticBackupStartTime(@Nullable Input<String> dailyAutomaticBackupStartTime) {
            this.dailyAutomaticBackupStartTime = dailyAutomaticBackupStartTime;
            return this;
        }

        public Builder setDailyAutomaticBackupStartTime(@Nullable String dailyAutomaticBackupStartTime) {
            this.dailyAutomaticBackupStartTime = Input.ofNullable(dailyAutomaticBackupStartTime);
            return this;
        }

        public Builder setDeploymentType(Input<String> deploymentType) {
            this.deploymentType = Objects.requireNonNull(deploymentType);
            return this;
        }

        public Builder setDeploymentType(String deploymentType) {
            this.deploymentType = Input.of(Objects.requireNonNull(deploymentType));
            return this;
        }

        public Builder setDiskIopsConfiguration(@Nullable Input<OpenZfsFileSystemDiskIopsConfigurationArgs> diskIopsConfiguration) {
            this.diskIopsConfiguration = diskIopsConfiguration;
            return this;
        }

        public Builder setDiskIopsConfiguration(@Nullable OpenZfsFileSystemDiskIopsConfigurationArgs diskIopsConfiguration) {
            this.diskIopsConfiguration = Input.ofNullable(diskIopsConfiguration);
            return this;
        }

        public Builder setKmsKeyId(@Nullable Input<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Input.ofNullable(kmsKeyId);
            return this;
        }

        public Builder setRootVolumeConfiguration(@Nullable Input<OpenZfsFileSystemRootVolumeConfigurationArgs> rootVolumeConfiguration) {
            this.rootVolumeConfiguration = rootVolumeConfiguration;
            return this;
        }

        public Builder setRootVolumeConfiguration(@Nullable OpenZfsFileSystemRootVolumeConfigurationArgs rootVolumeConfiguration) {
            this.rootVolumeConfiguration = Input.ofNullable(rootVolumeConfiguration);
            return this;
        }

        public Builder setSecurityGroupIds(@Nullable Input<List<String>> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        public Builder setSecurityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = Input.ofNullable(securityGroupIds);
            return this;
        }

        public Builder setStorageCapacity(@Nullable Input<Integer> storageCapacity) {
            this.storageCapacity = storageCapacity;
            return this;
        }

        public Builder setStorageCapacity(@Nullable Integer storageCapacity) {
            this.storageCapacity = Input.ofNullable(storageCapacity);
            return this;
        }

        public Builder setStorageType(@Nullable Input<String> storageType) {
            this.storageType = storageType;
            return this;
        }

        public Builder setStorageType(@Nullable String storageType) {
            this.storageType = Input.ofNullable(storageType);
            return this;
        }

        public Builder setSubnetIds(Input<String> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }

        public Builder setSubnetIds(String subnetIds) {
            this.subnetIds = Input.of(Objects.requireNonNull(subnetIds));
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

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder setThroughputCapacity(Input<Integer> throughputCapacity) {
            this.throughputCapacity = Objects.requireNonNull(throughputCapacity);
            return this;
        }

        public Builder setThroughputCapacity(Integer throughputCapacity) {
            this.throughputCapacity = Input.of(Objects.requireNonNull(throughputCapacity));
            return this;
        }

        public Builder setWeeklyMaintenanceStartTime(@Nullable Input<String> weeklyMaintenanceStartTime) {
            this.weeklyMaintenanceStartTime = weeklyMaintenanceStartTime;
            return this;
        }

        public Builder setWeeklyMaintenanceStartTime(@Nullable String weeklyMaintenanceStartTime) {
            this.weeklyMaintenanceStartTime = Input.ofNullable(weeklyMaintenanceStartTime);
            return this;
        }
        public OpenZfsFileSystemArgs build() {
            return new OpenZfsFileSystemArgs(automaticBackupRetentionDays, backupId, copyTagsToBackups, copyTagsToVolumes, dailyAutomaticBackupStartTime, deploymentType, diskIopsConfiguration, kmsKeyId, rootVolumeConfiguration, securityGroupIds, storageCapacity, storageType, subnetIds, tags, tagsAll, throughputCapacity, weeklyMaintenanceStartTime);
        }
    }
}
