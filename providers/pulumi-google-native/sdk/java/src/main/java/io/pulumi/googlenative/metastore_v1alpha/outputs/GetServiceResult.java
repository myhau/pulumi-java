// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.metastore_v1alpha.outputs.EncryptionConfigResponse;
import io.pulumi.googlenative.metastore_v1alpha.outputs.HiveMetastoreConfigResponse;
import io.pulumi.googlenative.metastore_v1alpha.outputs.MaintenanceWindowResponse;
import io.pulumi.googlenative.metastore_v1alpha.outputs.MetadataIntegrationResponse;
import io.pulumi.googlenative.metastore_v1alpha.outputs.MetadataManagementActivityResponse;
import io.pulumi.googlenative.metastore_v1alpha.outputs.NetworkConfigResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetServiceResult {
    /**
     * A Cloud Storage URI (starting with gs://) that specifies where artifacts related to the metastore service are stored.
     * 
     */
    private final String artifactGcsUri;
    /**
     * The time when the metastore service was created.
     * 
     */
    private final String createTime;
    /**
     * Immutable. The database type that the Metastore service stores its data.
     * 
     */
    private final String databaseType;
    /**
     * Immutable. Information used to configure the Dataproc Metastore service to encrypt customer data at rest. Cannot be updated.
     * 
     */
    private final EncryptionConfigResponse encryptionConfig;
    /**
     * The URI of the endpoint used to access the metastore service.
     * 
     */
    private final String endpointUri;
    /**
     * Configuration information specific to running Hive metastore software as the metastore service.
     * 
     */
    private final HiveMetastoreConfigResponse hiveMetastoreConfig;
    /**
     * User-defined labels for the metastore service.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The one hour maintenance window of the metastore service. This specifies when the service can be restarted for maintenance purposes in UTC time. Maintenance window is not needed for services with the SPANNER database type.
     * 
     */
    private final MaintenanceWindowResponse maintenanceWindow;
    /**
     * The setting that defines how metastore metadata should be integrated with external services and systems.
     * 
     */
    private final MetadataIntegrationResponse metadataIntegration;
    /**
     * The metadata management activities of the metastore service.
     * 
     */
    private final MetadataManagementActivityResponse metadataManagementActivity;
    /**
     * Immutable. The relative resource name of the metastore service, of the form:projects/{project_number}/locations/{location_id}/services/{service_id}.
     * 
     */
    private final String name;
    /**
     * Immutable. The relative resource name of the VPC network on which the instance can be accessed. It is specified in the following form:projects/{project_number}/global/networks/{network_id}.
     * 
     */
    private final String network;
    /**
     * Immutable. The configuration specifying the network settings for the Dataproc Metastore service.
     * 
     */
    private final NetworkConfigResponse networkConfig;
    /**
     * The TCP port at which the metastore service is reached. Default: 9083.
     * 
     */
    private final Integer port;
    /**
     * Immutable. The release channel of the service. If unspecified, defaults to STABLE.
     * 
     */
    private final String releaseChannel;
    /**
     * The current state of the metastore service.
     * 
     */
    private final String state;
    /**
     * Additional information about the current state of the metastore service, if available.
     * 
     */
    private final String stateMessage;
    /**
     * The tier of the service.
     * 
     */
    private final String tier;
    /**
     * The globally unique resource identifier of the metastore service.
     * 
     */
    private final String uid;
    /**
     * The time when the metastore service was last updated.
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor({"artifactGcsUri","createTime","databaseType","encryptionConfig","endpointUri","hiveMetastoreConfig","labels","maintenanceWindow","metadataIntegration","metadataManagementActivity","name","network","networkConfig","port","releaseChannel","state","stateMessage","tier","uid","updateTime"})
    private GetServiceResult(
        String artifactGcsUri,
        String createTime,
        String databaseType,
        EncryptionConfigResponse encryptionConfig,
        String endpointUri,
        HiveMetastoreConfigResponse hiveMetastoreConfig,
        Map<String,String> labels,
        MaintenanceWindowResponse maintenanceWindow,
        MetadataIntegrationResponse metadataIntegration,
        MetadataManagementActivityResponse metadataManagementActivity,
        String name,
        String network,
        NetworkConfigResponse networkConfig,
        Integer port,
        String releaseChannel,
        String state,
        String stateMessage,
        String tier,
        String uid,
        String updateTime) {
        this.artifactGcsUri = artifactGcsUri;
        this.createTime = createTime;
        this.databaseType = databaseType;
        this.encryptionConfig = encryptionConfig;
        this.endpointUri = endpointUri;
        this.hiveMetastoreConfig = hiveMetastoreConfig;
        this.labels = labels;
        this.maintenanceWindow = maintenanceWindow;
        this.metadataIntegration = metadataIntegration;
        this.metadataManagementActivity = metadataManagementActivity;
        this.name = name;
        this.network = network;
        this.networkConfig = networkConfig;
        this.port = port;
        this.releaseChannel = releaseChannel;
        this.state = state;
        this.stateMessage = stateMessage;
        this.tier = tier;
        this.uid = uid;
        this.updateTime = updateTime;
    }

    /**
     * A Cloud Storage URI (starting with gs://) that specifies where artifacts related to the metastore service are stored.
     * 
    */
    public String getArtifactGcsUri() {
        return this.artifactGcsUri;
    }
    /**
     * The time when the metastore service was created.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Immutable. The database type that the Metastore service stores its data.
     * 
    */
    public String getDatabaseType() {
        return this.databaseType;
    }
    /**
     * Immutable. Information used to configure the Dataproc Metastore service to encrypt customer data at rest. Cannot be updated.
     * 
    */
    public EncryptionConfigResponse getEncryptionConfig() {
        return this.encryptionConfig;
    }
    /**
     * The URI of the endpoint used to access the metastore service.
     * 
    */
    public String getEndpointUri() {
        return this.endpointUri;
    }
    /**
     * Configuration information specific to running Hive metastore software as the metastore service.
     * 
    */
    public HiveMetastoreConfigResponse getHiveMetastoreConfig() {
        return this.hiveMetastoreConfig;
    }
    /**
     * User-defined labels for the metastore service.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * The one hour maintenance window of the metastore service. This specifies when the service can be restarted for maintenance purposes in UTC time. Maintenance window is not needed for services with the SPANNER database type.
     * 
    */
    public MaintenanceWindowResponse getMaintenanceWindow() {
        return this.maintenanceWindow;
    }
    /**
     * The setting that defines how metastore metadata should be integrated with external services and systems.
     * 
    */
    public MetadataIntegrationResponse getMetadataIntegration() {
        return this.metadataIntegration;
    }
    /**
     * The metadata management activities of the metastore service.
     * 
    */
    public MetadataManagementActivityResponse getMetadataManagementActivity() {
        return this.metadataManagementActivity;
    }
    /**
     * Immutable. The relative resource name of the metastore service, of the form:projects/{project_number}/locations/{location_id}/services/{service_id}.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Immutable. The relative resource name of the VPC network on which the instance can be accessed. It is specified in the following form:projects/{project_number}/global/networks/{network_id}.
     * 
    */
    public String getNetwork() {
        return this.network;
    }
    /**
     * Immutable. The configuration specifying the network settings for the Dataproc Metastore service.
     * 
    */
    public NetworkConfigResponse getNetworkConfig() {
        return this.networkConfig;
    }
    /**
     * The TCP port at which the metastore service is reached. Default: 9083.
     * 
    */
    public Integer getPort() {
        return this.port;
    }
    /**
     * Immutable. The release channel of the service. If unspecified, defaults to STABLE.
     * 
    */
    public String getReleaseChannel() {
        return this.releaseChannel;
    }
    /**
     * The current state of the metastore service.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * Additional information about the current state of the metastore service, if available.
     * 
    */
    public String getStateMessage() {
        return this.stateMessage;
    }
    /**
     * The tier of the service.
     * 
    */
    public String getTier() {
        return this.tier;
    }
    /**
     * The globally unique resource identifier of the metastore service.
     * 
    */
    public String getUid() {
        return this.uid;
    }
    /**
     * The time when the metastore service was last updated.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String artifactGcsUri;
        private String createTime;
        private String databaseType;
        private EncryptionConfigResponse encryptionConfig;
        private String endpointUri;
        private HiveMetastoreConfigResponse hiveMetastoreConfig;
        private Map<String,String> labels;
        private MaintenanceWindowResponse maintenanceWindow;
        private MetadataIntegrationResponse metadataIntegration;
        private MetadataManagementActivityResponse metadataManagementActivity;
        private String name;
        private String network;
        private NetworkConfigResponse networkConfig;
        private Integer port;
        private String releaseChannel;
        private String state;
        private String stateMessage;
        private String tier;
        private String uid;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactGcsUri = defaults.artifactGcsUri;
    	      this.createTime = defaults.createTime;
    	      this.databaseType = defaults.databaseType;
    	      this.encryptionConfig = defaults.encryptionConfig;
    	      this.endpointUri = defaults.endpointUri;
    	      this.hiveMetastoreConfig = defaults.hiveMetastoreConfig;
    	      this.labels = defaults.labels;
    	      this.maintenanceWindow = defaults.maintenanceWindow;
    	      this.metadataIntegration = defaults.metadataIntegration;
    	      this.metadataManagementActivity = defaults.metadataManagementActivity;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.networkConfig = defaults.networkConfig;
    	      this.port = defaults.port;
    	      this.releaseChannel = defaults.releaseChannel;
    	      this.state = defaults.state;
    	      this.stateMessage = defaults.stateMessage;
    	      this.tier = defaults.tier;
    	      this.uid = defaults.uid;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setArtifactGcsUri(String artifactGcsUri) {
            this.artifactGcsUri = Objects.requireNonNull(artifactGcsUri);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDatabaseType(String databaseType) {
            this.databaseType = Objects.requireNonNull(databaseType);
            return this;
        }

        public Builder setEncryptionConfig(EncryptionConfigResponse encryptionConfig) {
            this.encryptionConfig = Objects.requireNonNull(encryptionConfig);
            return this;
        }

        public Builder setEndpointUri(String endpointUri) {
            this.endpointUri = Objects.requireNonNull(endpointUri);
            return this;
        }

        public Builder setHiveMetastoreConfig(HiveMetastoreConfigResponse hiveMetastoreConfig) {
            this.hiveMetastoreConfig = Objects.requireNonNull(hiveMetastoreConfig);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setMaintenanceWindow(MaintenanceWindowResponse maintenanceWindow) {
            this.maintenanceWindow = Objects.requireNonNull(maintenanceWindow);
            return this;
        }

        public Builder setMetadataIntegration(MetadataIntegrationResponse metadataIntegration) {
            this.metadataIntegration = Objects.requireNonNull(metadataIntegration);
            return this;
        }

        public Builder setMetadataManagementActivity(MetadataManagementActivityResponse metadataManagementActivity) {
            this.metadataManagementActivity = Objects.requireNonNull(metadataManagementActivity);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetwork(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setNetworkConfig(NetworkConfigResponse networkConfig) {
            this.networkConfig = Objects.requireNonNull(networkConfig);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setReleaseChannel(String releaseChannel) {
            this.releaseChannel = Objects.requireNonNull(releaseChannel);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setStateMessage(String stateMessage) {
            this.stateMessage = Objects.requireNonNull(stateMessage);
            return this;
        }

        public Builder setTier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }

        public Builder setUid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetServiceResult build() {
            return new GetServiceResult(artifactGcsUri, createTime, databaseType, encryptionConfig, endpointUri, hiveMetastoreConfig, labels, maintenanceWindow, metadataIntegration, metadataManagementActivity, name, network, networkConfig, port, releaseChannel, state, stateMessage, tier, uid, updateTime);
        }
    }
}
