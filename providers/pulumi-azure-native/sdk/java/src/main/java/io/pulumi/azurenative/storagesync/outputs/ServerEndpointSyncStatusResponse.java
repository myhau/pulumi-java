// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagesync.outputs;

import io.pulumi.azurenative.storagesync.outputs.ServerEndpointSyncActivityStatusResponse;
import io.pulumi.azurenative.storagesync.outputs.ServerEndpointSyncSessionStatusResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ServerEndpointSyncStatusResponse {
    /**
     * Combined Health Status.
     * 
     */
    private final String combinedHealth;
    /**
     * Download sync activity
     * 
     */
    private final ServerEndpointSyncActivityStatusResponse downloadActivity;
    /**
     * Download Health Status.
     * 
     */
    private final String downloadHealth;
    /**
     * Download Status
     * 
     */
    private final ServerEndpointSyncSessionStatusResponse downloadStatus;
    /**
     * Last Updated Timestamp
     * 
     */
    private final String lastUpdatedTimestamp;
    /**
     * Offline Data Transfer State
     * 
     */
    private final String offlineDataTransferStatus;
    /**
     * Sync activity
     * 
     */
    private final String syncActivity;
    /**
     * Total count of persistent files not syncing (combined upload + download).
     * 
     */
    private final Double totalPersistentFilesNotSyncingCount;
    /**
     * Upload sync activity
     * 
     */
    private final ServerEndpointSyncActivityStatusResponse uploadActivity;
    /**
     * Upload Health Status.
     * 
     */
    private final String uploadHealth;
    /**
     * Upload Status
     * 
     */
    private final ServerEndpointSyncSessionStatusResponse uploadStatus;

    @CustomType.Constructor
    private ServerEndpointSyncStatusResponse(
        @CustomType.Parameter("combinedHealth") String combinedHealth,
        @CustomType.Parameter("downloadActivity") ServerEndpointSyncActivityStatusResponse downloadActivity,
        @CustomType.Parameter("downloadHealth") String downloadHealth,
        @CustomType.Parameter("downloadStatus") ServerEndpointSyncSessionStatusResponse downloadStatus,
        @CustomType.Parameter("lastUpdatedTimestamp") String lastUpdatedTimestamp,
        @CustomType.Parameter("offlineDataTransferStatus") String offlineDataTransferStatus,
        @CustomType.Parameter("syncActivity") String syncActivity,
        @CustomType.Parameter("totalPersistentFilesNotSyncingCount") Double totalPersistentFilesNotSyncingCount,
        @CustomType.Parameter("uploadActivity") ServerEndpointSyncActivityStatusResponse uploadActivity,
        @CustomType.Parameter("uploadHealth") String uploadHealth,
        @CustomType.Parameter("uploadStatus") ServerEndpointSyncSessionStatusResponse uploadStatus) {
        this.combinedHealth = combinedHealth;
        this.downloadActivity = downloadActivity;
        this.downloadHealth = downloadHealth;
        this.downloadStatus = downloadStatus;
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        this.offlineDataTransferStatus = offlineDataTransferStatus;
        this.syncActivity = syncActivity;
        this.totalPersistentFilesNotSyncingCount = totalPersistentFilesNotSyncingCount;
        this.uploadActivity = uploadActivity;
        this.uploadHealth = uploadHealth;
        this.uploadStatus = uploadStatus;
    }

    /**
     * Combined Health Status.
     * 
    */
    public String combinedHealth() {
        return this.combinedHealth;
    }
    /**
     * Download sync activity
     * 
    */
    public ServerEndpointSyncActivityStatusResponse downloadActivity() {
        return this.downloadActivity;
    }
    /**
     * Download Health Status.
     * 
    */
    public String downloadHealth() {
        return this.downloadHealth;
    }
    /**
     * Download Status
     * 
    */
    public ServerEndpointSyncSessionStatusResponse downloadStatus() {
        return this.downloadStatus;
    }
    /**
     * Last Updated Timestamp
     * 
    */
    public String lastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }
    /**
     * Offline Data Transfer State
     * 
    */
    public String offlineDataTransferStatus() {
        return this.offlineDataTransferStatus;
    }
    /**
     * Sync activity
     * 
    */
    public String syncActivity() {
        return this.syncActivity;
    }
    /**
     * Total count of persistent files not syncing (combined upload + download).
     * 
    */
    public Double totalPersistentFilesNotSyncingCount() {
        return this.totalPersistentFilesNotSyncingCount;
    }
    /**
     * Upload sync activity
     * 
    */
    public ServerEndpointSyncActivityStatusResponse uploadActivity() {
        return this.uploadActivity;
    }
    /**
     * Upload Health Status.
     * 
    */
    public String uploadHealth() {
        return this.uploadHealth;
    }
    /**
     * Upload Status
     * 
    */
    public ServerEndpointSyncSessionStatusResponse uploadStatus() {
        return this.uploadStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerEndpointSyncStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String combinedHealth;
        private ServerEndpointSyncActivityStatusResponse downloadActivity;
        private String downloadHealth;
        private ServerEndpointSyncSessionStatusResponse downloadStatus;
        private String lastUpdatedTimestamp;
        private String offlineDataTransferStatus;
        private String syncActivity;
        private Double totalPersistentFilesNotSyncingCount;
        private ServerEndpointSyncActivityStatusResponse uploadActivity;
        private String uploadHealth;
        private ServerEndpointSyncSessionStatusResponse uploadStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerEndpointSyncStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.combinedHealth = defaults.combinedHealth;
    	      this.downloadActivity = defaults.downloadActivity;
    	      this.downloadHealth = defaults.downloadHealth;
    	      this.downloadStatus = defaults.downloadStatus;
    	      this.lastUpdatedTimestamp = defaults.lastUpdatedTimestamp;
    	      this.offlineDataTransferStatus = defaults.offlineDataTransferStatus;
    	      this.syncActivity = defaults.syncActivity;
    	      this.totalPersistentFilesNotSyncingCount = defaults.totalPersistentFilesNotSyncingCount;
    	      this.uploadActivity = defaults.uploadActivity;
    	      this.uploadHealth = defaults.uploadHealth;
    	      this.uploadStatus = defaults.uploadStatus;
        }

        public Builder combinedHealth(String combinedHealth) {
            this.combinedHealth = Objects.requireNonNull(combinedHealth);
            return this;
        }
        public Builder downloadActivity(ServerEndpointSyncActivityStatusResponse downloadActivity) {
            this.downloadActivity = Objects.requireNonNull(downloadActivity);
            return this;
        }
        public Builder downloadHealth(String downloadHealth) {
            this.downloadHealth = Objects.requireNonNull(downloadHealth);
            return this;
        }
        public Builder downloadStatus(ServerEndpointSyncSessionStatusResponse downloadStatus) {
            this.downloadStatus = Objects.requireNonNull(downloadStatus);
            return this;
        }
        public Builder lastUpdatedTimestamp(String lastUpdatedTimestamp) {
            this.lastUpdatedTimestamp = Objects.requireNonNull(lastUpdatedTimestamp);
            return this;
        }
        public Builder offlineDataTransferStatus(String offlineDataTransferStatus) {
            this.offlineDataTransferStatus = Objects.requireNonNull(offlineDataTransferStatus);
            return this;
        }
        public Builder syncActivity(String syncActivity) {
            this.syncActivity = Objects.requireNonNull(syncActivity);
            return this;
        }
        public Builder totalPersistentFilesNotSyncingCount(Double totalPersistentFilesNotSyncingCount) {
            this.totalPersistentFilesNotSyncingCount = Objects.requireNonNull(totalPersistentFilesNotSyncingCount);
            return this;
        }
        public Builder uploadActivity(ServerEndpointSyncActivityStatusResponse uploadActivity) {
            this.uploadActivity = Objects.requireNonNull(uploadActivity);
            return this;
        }
        public Builder uploadHealth(String uploadHealth) {
            this.uploadHealth = Objects.requireNonNull(uploadHealth);
            return this;
        }
        public Builder uploadStatus(ServerEndpointSyncSessionStatusResponse uploadStatus) {
            this.uploadStatus = Objects.requireNonNull(uploadStatus);
            return this;
        }        public ServerEndpointSyncStatusResponse build() {
            return new ServerEndpointSyncStatusResponse(combinedHealth, downloadActivity, downloadHealth, downloadStatus, lastUpdatedTimestamp, offlineDataTransferStatus, syncActivity, totalPersistentFilesNotSyncingCount, uploadActivity, uploadHealth, uploadStatus);
        }
    }
}
