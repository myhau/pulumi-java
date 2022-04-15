// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagesync;

import io.pulumi.azurenative.storagesync.enums.FeatureStatus;
import io.pulumi.azurenative.storagesync.enums.InitialDownloadPolicy;
import io.pulumi.azurenative.storagesync.enums.LocalCacheMode;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServerEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServerEndpointArgs Empty = new ServerEndpointArgs();

    /**
     * Cloud Tiering.
     * 
     */
    @Import(name="cloudTiering")
      private final @Nullable Output<Either<String,FeatureStatus>> cloudTiering;

    public Output<Either<String,FeatureStatus>> cloudTiering() {
        return this.cloudTiering == null ? Codegen.empty() : this.cloudTiering;
    }

    /**
     * Friendly Name
     * 
     */
    @Import(name="friendlyName")
      private final @Nullable Output<String> friendlyName;

    public Output<String> friendlyName() {
        return this.friendlyName == null ? Codegen.empty() : this.friendlyName;
    }

    /**
     * Policy for how namespace and files are recalled during FastDr.
     * 
     */
    @Import(name="initialDownloadPolicy")
      private final @Nullable Output<Either<String,InitialDownloadPolicy>> initialDownloadPolicy;

    public Output<Either<String,InitialDownloadPolicy>> initialDownloadPolicy() {
        return this.initialDownloadPolicy == null ? Codegen.empty() : this.initialDownloadPolicy;
    }

    /**
     * Policy for enabling follow-the-sun business models: link local cache to cloud behavior to pre-populate before local access.
     * 
     */
    @Import(name="localCacheMode")
      private final @Nullable Output<Either<String,LocalCacheMode>> localCacheMode;

    public Output<Either<String,LocalCacheMode>> localCacheMode() {
        return this.localCacheMode == null ? Codegen.empty() : this.localCacheMode;
    }

    /**
     * Offline data transfer
     * 
     */
    @Import(name="offlineDataTransfer")
      private final @Nullable Output<Either<String,FeatureStatus>> offlineDataTransfer;

    public Output<Either<String,FeatureStatus>> offlineDataTransfer() {
        return this.offlineDataTransfer == null ? Codegen.empty() : this.offlineDataTransfer;
    }

    /**
     * Offline data transfer share name
     * 
     */
    @Import(name="offlineDataTransferShareName")
      private final @Nullable Output<String> offlineDataTransferShareName;

    public Output<String> offlineDataTransferShareName() {
        return this.offlineDataTransferShareName == null ? Codegen.empty() : this.offlineDataTransferShareName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of Server Endpoint object.
     * 
     */
    @Import(name="serverEndpointName")
      private final @Nullable Output<String> serverEndpointName;

    public Output<String> serverEndpointName() {
        return this.serverEndpointName == null ? Codegen.empty() : this.serverEndpointName;
    }

    /**
     * Server Local path.
     * 
     */
    @Import(name="serverLocalPath")
      private final @Nullable Output<String> serverLocalPath;

    public Output<String> serverLocalPath() {
        return this.serverLocalPath == null ? Codegen.empty() : this.serverLocalPath;
    }

    /**
     * Server Resource Id.
     * 
     */
    @Import(name="serverResourceId")
      private final @Nullable Output<String> serverResourceId;

    public Output<String> serverResourceId() {
        return this.serverResourceId == null ? Codegen.empty() : this.serverResourceId;
    }

    /**
     * Name of Storage Sync Service resource.
     * 
     */
    @Import(name="storageSyncServiceName", required=true)
      private final Output<String> storageSyncServiceName;

    public Output<String> storageSyncServiceName() {
        return this.storageSyncServiceName;
    }

    /**
     * Name of Sync Group resource.
     * 
     */
    @Import(name="syncGroupName", required=true)
      private final Output<String> syncGroupName;

    public Output<String> syncGroupName() {
        return this.syncGroupName;
    }

    /**
     * Tier files older than days.
     * 
     */
    @Import(name="tierFilesOlderThanDays")
      private final @Nullable Output<Integer> tierFilesOlderThanDays;

    public Output<Integer> tierFilesOlderThanDays() {
        return this.tierFilesOlderThanDays == null ? Codegen.empty() : this.tierFilesOlderThanDays;
    }

    /**
     * Level of free space to be maintained by Cloud Tiering if it is enabled.
     * 
     */
    @Import(name="volumeFreeSpacePercent")
      private final @Nullable Output<Integer> volumeFreeSpacePercent;

    public Output<Integer> volumeFreeSpacePercent() {
        return this.volumeFreeSpacePercent == null ? Codegen.empty() : this.volumeFreeSpacePercent;
    }

    public ServerEndpointArgs(
        @Nullable Output<Either<String,FeatureStatus>> cloudTiering,
        @Nullable Output<String> friendlyName,
        @Nullable Output<Either<String,InitialDownloadPolicy>> initialDownloadPolicy,
        @Nullable Output<Either<String,LocalCacheMode>> localCacheMode,
        @Nullable Output<Either<String,FeatureStatus>> offlineDataTransfer,
        @Nullable Output<String> offlineDataTransferShareName,
        Output<String> resourceGroupName,
        @Nullable Output<String> serverEndpointName,
        @Nullable Output<String> serverLocalPath,
        @Nullable Output<String> serverResourceId,
        Output<String> storageSyncServiceName,
        Output<String> syncGroupName,
        @Nullable Output<Integer> tierFilesOlderThanDays,
        @Nullable Output<Integer> volumeFreeSpacePercent) {
        this.cloudTiering = cloudTiering;
        this.friendlyName = friendlyName;
        this.initialDownloadPolicy = initialDownloadPolicy == null ? Output.ofLeft("NamespaceThenModifiedFiles") : initialDownloadPolicy;
        this.localCacheMode = localCacheMode == null ? Output.ofLeft("UpdateLocallyCachedFiles") : localCacheMode;
        this.offlineDataTransfer = offlineDataTransfer;
        this.offlineDataTransferShareName = offlineDataTransferShareName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverEndpointName = serverEndpointName;
        this.serverLocalPath = serverLocalPath;
        this.serverResourceId = serverResourceId;
        this.storageSyncServiceName = Objects.requireNonNull(storageSyncServiceName, "expected parameter 'storageSyncServiceName' to be non-null");
        this.syncGroupName = Objects.requireNonNull(syncGroupName, "expected parameter 'syncGroupName' to be non-null");
        this.tierFilesOlderThanDays = tierFilesOlderThanDays;
        this.volumeFreeSpacePercent = volumeFreeSpacePercent;
    }

    private ServerEndpointArgs() {
        this.cloudTiering = Codegen.empty();
        this.friendlyName = Codegen.empty();
        this.initialDownloadPolicy = Codegen.empty();
        this.localCacheMode = Codegen.empty();
        this.offlineDataTransfer = Codegen.empty();
        this.offlineDataTransferShareName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.serverEndpointName = Codegen.empty();
        this.serverLocalPath = Codegen.empty();
        this.serverResourceId = Codegen.empty();
        this.storageSyncServiceName = Codegen.empty();
        this.syncGroupName = Codegen.empty();
        this.tierFilesOlderThanDays = Codegen.empty();
        this.volumeFreeSpacePercent = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,FeatureStatus>> cloudTiering;
        private @Nullable Output<String> friendlyName;
        private @Nullable Output<Either<String,InitialDownloadPolicy>> initialDownloadPolicy;
        private @Nullable Output<Either<String,LocalCacheMode>> localCacheMode;
        private @Nullable Output<Either<String,FeatureStatus>> offlineDataTransfer;
        private @Nullable Output<String> offlineDataTransferShareName;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> serverEndpointName;
        private @Nullable Output<String> serverLocalPath;
        private @Nullable Output<String> serverResourceId;
        private Output<String> storageSyncServiceName;
        private Output<String> syncGroupName;
        private @Nullable Output<Integer> tierFilesOlderThanDays;
        private @Nullable Output<Integer> volumeFreeSpacePercent;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudTiering = defaults.cloudTiering;
    	      this.friendlyName = defaults.friendlyName;
    	      this.initialDownloadPolicy = defaults.initialDownloadPolicy;
    	      this.localCacheMode = defaults.localCacheMode;
    	      this.offlineDataTransfer = defaults.offlineDataTransfer;
    	      this.offlineDataTransferShareName = defaults.offlineDataTransferShareName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverEndpointName = defaults.serverEndpointName;
    	      this.serverLocalPath = defaults.serverLocalPath;
    	      this.serverResourceId = defaults.serverResourceId;
    	      this.storageSyncServiceName = defaults.storageSyncServiceName;
    	      this.syncGroupName = defaults.syncGroupName;
    	      this.tierFilesOlderThanDays = defaults.tierFilesOlderThanDays;
    	      this.volumeFreeSpacePercent = defaults.volumeFreeSpacePercent;
        }

        public Builder cloudTiering(@Nullable Output<Either<String,FeatureStatus>> cloudTiering) {
            this.cloudTiering = cloudTiering;
            return this;
        }
        public Builder cloudTiering(@Nullable Either<String,FeatureStatus> cloudTiering) {
            this.cloudTiering = Codegen.ofNullable(cloudTiering);
            return this;
        }
        public Builder friendlyName(@Nullable Output<String> friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }
        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = Codegen.ofNullable(friendlyName);
            return this;
        }
        public Builder initialDownloadPolicy(@Nullable Output<Either<String,InitialDownloadPolicy>> initialDownloadPolicy) {
            this.initialDownloadPolicy = initialDownloadPolicy;
            return this;
        }
        public Builder initialDownloadPolicy(@Nullable Either<String,InitialDownloadPolicy> initialDownloadPolicy) {
            this.initialDownloadPolicy = Codegen.ofNullable(initialDownloadPolicy);
            return this;
        }
        public Builder localCacheMode(@Nullable Output<Either<String,LocalCacheMode>> localCacheMode) {
            this.localCacheMode = localCacheMode;
            return this;
        }
        public Builder localCacheMode(@Nullable Either<String,LocalCacheMode> localCacheMode) {
            this.localCacheMode = Codegen.ofNullable(localCacheMode);
            return this;
        }
        public Builder offlineDataTransfer(@Nullable Output<Either<String,FeatureStatus>> offlineDataTransfer) {
            this.offlineDataTransfer = offlineDataTransfer;
            return this;
        }
        public Builder offlineDataTransfer(@Nullable Either<String,FeatureStatus> offlineDataTransfer) {
            this.offlineDataTransfer = Codegen.ofNullable(offlineDataTransfer);
            return this;
        }
        public Builder offlineDataTransferShareName(@Nullable Output<String> offlineDataTransferShareName) {
            this.offlineDataTransferShareName = offlineDataTransferShareName;
            return this;
        }
        public Builder offlineDataTransferShareName(@Nullable String offlineDataTransferShareName) {
            this.offlineDataTransferShareName = Codegen.ofNullable(offlineDataTransferShareName);
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
        public Builder serverEndpointName(@Nullable Output<String> serverEndpointName) {
            this.serverEndpointName = serverEndpointName;
            return this;
        }
        public Builder serverEndpointName(@Nullable String serverEndpointName) {
            this.serverEndpointName = Codegen.ofNullable(serverEndpointName);
            return this;
        }
        public Builder serverLocalPath(@Nullable Output<String> serverLocalPath) {
            this.serverLocalPath = serverLocalPath;
            return this;
        }
        public Builder serverLocalPath(@Nullable String serverLocalPath) {
            this.serverLocalPath = Codegen.ofNullable(serverLocalPath);
            return this;
        }
        public Builder serverResourceId(@Nullable Output<String> serverResourceId) {
            this.serverResourceId = serverResourceId;
            return this;
        }
        public Builder serverResourceId(@Nullable String serverResourceId) {
            this.serverResourceId = Codegen.ofNullable(serverResourceId);
            return this;
        }
        public Builder storageSyncServiceName(Output<String> storageSyncServiceName) {
            this.storageSyncServiceName = Objects.requireNonNull(storageSyncServiceName);
            return this;
        }
        public Builder storageSyncServiceName(String storageSyncServiceName) {
            this.storageSyncServiceName = Output.of(Objects.requireNonNull(storageSyncServiceName));
            return this;
        }
        public Builder syncGroupName(Output<String> syncGroupName) {
            this.syncGroupName = Objects.requireNonNull(syncGroupName);
            return this;
        }
        public Builder syncGroupName(String syncGroupName) {
            this.syncGroupName = Output.of(Objects.requireNonNull(syncGroupName));
            return this;
        }
        public Builder tierFilesOlderThanDays(@Nullable Output<Integer> tierFilesOlderThanDays) {
            this.tierFilesOlderThanDays = tierFilesOlderThanDays;
            return this;
        }
        public Builder tierFilesOlderThanDays(@Nullable Integer tierFilesOlderThanDays) {
            this.tierFilesOlderThanDays = Codegen.ofNullable(tierFilesOlderThanDays);
            return this;
        }
        public Builder volumeFreeSpacePercent(@Nullable Output<Integer> volumeFreeSpacePercent) {
            this.volumeFreeSpacePercent = volumeFreeSpacePercent;
            return this;
        }
        public Builder volumeFreeSpacePercent(@Nullable Integer volumeFreeSpacePercent) {
            this.volumeFreeSpacePercent = Codegen.ofNullable(volumeFreeSpacePercent);
            return this;
        }        public ServerEndpointArgs build() {
            return new ServerEndpointArgs(cloudTiering, friendlyName, initialDownloadPolicy, localCacheMode, offlineDataTransfer, offlineDataTransferShareName, resourceGroupName, serverEndpointName, serverLocalPath, serverResourceId, storageSyncServiceName, syncGroupName, tierFilesOlderThanDays, volumeFreeSpacePercent);
        }
    }
}
