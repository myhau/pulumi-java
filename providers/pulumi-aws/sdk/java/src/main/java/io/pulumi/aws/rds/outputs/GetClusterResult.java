// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetClusterResult {
    private final String arn;
    private final List<String> availabilityZones;
    private final Integer backtrackWindow;
    private final Integer backupRetentionPeriod;
    private final String clusterIdentifier;
    private final List<String> clusterMembers;
    private final String clusterResourceId;
    private final String databaseName;
    private final String dbClusterParameterGroupName;
    private final String dbSubnetGroupName;
    private final List<String> enabledCloudwatchLogsExports;
    private final String endpoint;
    private final String engine;
    private final String engineVersion;
    private final String finalSnapshotIdentifier;
    private final String hostedZoneId;
    private final Boolean iamDatabaseAuthenticationEnabled;
    private final List<String> iamRoles;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String kmsKeyId;
    private final String masterUsername;
    private final Integer port;
    private final String preferredBackupWindow;
    private final String preferredMaintenanceWindow;
    private final String readerEndpoint;
    private final String replicationSourceIdentifier;
    private final Boolean storageEncrypted;
    private final Map<String,String> tags;
    private final List<String> vpcSecurityGroupIds;

    @OutputCustomType.Constructor({"arn","availabilityZones","backtrackWindow","backupRetentionPeriod","clusterIdentifier","clusterMembers","clusterResourceId","databaseName","dbClusterParameterGroupName","dbSubnetGroupName","enabledCloudwatchLogsExports","endpoint","engine","engineVersion","finalSnapshotIdentifier","hostedZoneId","iamDatabaseAuthenticationEnabled","iamRoles","id","kmsKeyId","masterUsername","port","preferredBackupWindow","preferredMaintenanceWindow","readerEndpoint","replicationSourceIdentifier","storageEncrypted","tags","vpcSecurityGroupIds"})
    private GetClusterResult(
        String arn,
        List<String> availabilityZones,
        Integer backtrackWindow,
        Integer backupRetentionPeriod,
        String clusterIdentifier,
        List<String> clusterMembers,
        String clusterResourceId,
        String databaseName,
        String dbClusterParameterGroupName,
        String dbSubnetGroupName,
        List<String> enabledCloudwatchLogsExports,
        String endpoint,
        String engine,
        String engineVersion,
        String finalSnapshotIdentifier,
        String hostedZoneId,
        Boolean iamDatabaseAuthenticationEnabled,
        List<String> iamRoles,
        String id,
        String kmsKeyId,
        String masterUsername,
        Integer port,
        String preferredBackupWindow,
        String preferredMaintenanceWindow,
        String readerEndpoint,
        String replicationSourceIdentifier,
        Boolean storageEncrypted,
        Map<String,String> tags,
        List<String> vpcSecurityGroupIds) {
        this.arn = arn;
        this.availabilityZones = availabilityZones;
        this.backtrackWindow = backtrackWindow;
        this.backupRetentionPeriod = backupRetentionPeriod;
        this.clusterIdentifier = clusterIdentifier;
        this.clusterMembers = clusterMembers;
        this.clusterResourceId = clusterResourceId;
        this.databaseName = databaseName;
        this.dbClusterParameterGroupName = dbClusterParameterGroupName;
        this.dbSubnetGroupName = dbSubnetGroupName;
        this.enabledCloudwatchLogsExports = enabledCloudwatchLogsExports;
        this.endpoint = endpoint;
        this.engine = engine;
        this.engineVersion = engineVersion;
        this.finalSnapshotIdentifier = finalSnapshotIdentifier;
        this.hostedZoneId = hostedZoneId;
        this.iamDatabaseAuthenticationEnabled = iamDatabaseAuthenticationEnabled;
        this.iamRoles = iamRoles;
        this.id = id;
        this.kmsKeyId = kmsKeyId;
        this.masterUsername = masterUsername;
        this.port = port;
        this.preferredBackupWindow = preferredBackupWindow;
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        this.readerEndpoint = readerEndpoint;
        this.replicationSourceIdentifier = replicationSourceIdentifier;
        this.storageEncrypted = storageEncrypted;
        this.tags = tags;
        this.vpcSecurityGroupIds = vpcSecurityGroupIds;
    }

    public String getArn() {
        return this.arn;
    }
    public List<String> getAvailabilityZones() {
        return this.availabilityZones;
    }
    public Integer getBacktrackWindow() {
        return this.backtrackWindow;
    }
    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }
    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }
    public List<String> getClusterMembers() {
        return this.clusterMembers;
    }
    public String getClusterResourceId() {
        return this.clusterResourceId;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }
    public String getDbClusterParameterGroupName() {
        return this.dbClusterParameterGroupName;
    }
    public String getDbSubnetGroupName() {
        return this.dbSubnetGroupName;
    }
    public List<String> getEnabledCloudwatchLogsExports() {
        return this.enabledCloudwatchLogsExports;
    }
    public String getEndpoint() {
        return this.endpoint;
    }
    public String getEngine() {
        return this.engine;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }
    public String getFinalSnapshotIdentifier() {
        return this.finalSnapshotIdentifier;
    }
    public String getHostedZoneId() {
        return this.hostedZoneId;
    }
    public Boolean getIamDatabaseAuthenticationEnabled() {
        return this.iamDatabaseAuthenticationEnabled;
    }
    public List<String> getIamRoles() {
        return this.iamRoles;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }
    public String getMasterUsername() {
        return this.masterUsername;
    }
    public Integer getPort() {
        return this.port;
    }
    public String getPreferredBackupWindow() {
        return this.preferredBackupWindow;
    }
    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }
    public String getReaderEndpoint() {
        return this.readerEndpoint;
    }
    public String getReplicationSourceIdentifier() {
        return this.replicationSourceIdentifier;
    }
    public Boolean getStorageEncrypted() {
        return this.storageEncrypted;
    }
    public Map<String,String> getTags() {
        return this.tags;
    }
    public List<String> getVpcSecurityGroupIds() {
        return this.vpcSecurityGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private List<String> availabilityZones;
        private Integer backtrackWindow;
        private Integer backupRetentionPeriod;
        private String clusterIdentifier;
        private List<String> clusterMembers;
        private String clusterResourceId;
        private String databaseName;
        private String dbClusterParameterGroupName;
        private String dbSubnetGroupName;
        private List<String> enabledCloudwatchLogsExports;
        private String endpoint;
        private String engine;
        private String engineVersion;
        private String finalSnapshotIdentifier;
        private String hostedZoneId;
        private Boolean iamDatabaseAuthenticationEnabled;
        private List<String> iamRoles;
        private String id;
        private String kmsKeyId;
        private String masterUsername;
        private Integer port;
        private String preferredBackupWindow;
        private String preferredMaintenanceWindow;
        private String readerEndpoint;
        private String replicationSourceIdentifier;
        private Boolean storageEncrypted;
        private Map<String,String> tags;
        private List<String> vpcSecurityGroupIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.backtrackWindow = defaults.backtrackWindow;
    	      this.backupRetentionPeriod = defaults.backupRetentionPeriod;
    	      this.clusterIdentifier = defaults.clusterIdentifier;
    	      this.clusterMembers = defaults.clusterMembers;
    	      this.clusterResourceId = defaults.clusterResourceId;
    	      this.databaseName = defaults.databaseName;
    	      this.dbClusterParameterGroupName = defaults.dbClusterParameterGroupName;
    	      this.dbSubnetGroupName = defaults.dbSubnetGroupName;
    	      this.enabledCloudwatchLogsExports = defaults.enabledCloudwatchLogsExports;
    	      this.endpoint = defaults.endpoint;
    	      this.engine = defaults.engine;
    	      this.engineVersion = defaults.engineVersion;
    	      this.finalSnapshotIdentifier = defaults.finalSnapshotIdentifier;
    	      this.hostedZoneId = defaults.hostedZoneId;
    	      this.iamDatabaseAuthenticationEnabled = defaults.iamDatabaseAuthenticationEnabled;
    	      this.iamRoles = defaults.iamRoles;
    	      this.id = defaults.id;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.masterUsername = defaults.masterUsername;
    	      this.port = defaults.port;
    	      this.preferredBackupWindow = defaults.preferredBackupWindow;
    	      this.preferredMaintenanceWindow = defaults.preferredMaintenanceWindow;
    	      this.readerEndpoint = defaults.readerEndpoint;
    	      this.replicationSourceIdentifier = defaults.replicationSourceIdentifier;
    	      this.storageEncrypted = defaults.storageEncrypted;
    	      this.tags = defaults.tags;
    	      this.vpcSecurityGroupIds = defaults.vpcSecurityGroupIds;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setAvailabilityZones(List<String> availabilityZones) {
            this.availabilityZones = Objects.requireNonNull(availabilityZones);
            return this;
        }

        public Builder setBacktrackWindow(Integer backtrackWindow) {
            this.backtrackWindow = Objects.requireNonNull(backtrackWindow);
            return this;
        }

        public Builder setBackupRetentionPeriod(Integer backupRetentionPeriod) {
            this.backupRetentionPeriod = Objects.requireNonNull(backupRetentionPeriod);
            return this;
        }

        public Builder setClusterIdentifier(String clusterIdentifier) {
            this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier);
            return this;
        }

        public Builder setClusterMembers(List<String> clusterMembers) {
            this.clusterMembers = Objects.requireNonNull(clusterMembers);
            return this;
        }

        public Builder setClusterResourceId(String clusterResourceId) {
            this.clusterResourceId = Objects.requireNonNull(clusterResourceId);
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setDbClusterParameterGroupName(String dbClusterParameterGroupName) {
            this.dbClusterParameterGroupName = Objects.requireNonNull(dbClusterParameterGroupName);
            return this;
        }

        public Builder setDbSubnetGroupName(String dbSubnetGroupName) {
            this.dbSubnetGroupName = Objects.requireNonNull(dbSubnetGroupName);
            return this;
        }

        public Builder setEnabledCloudwatchLogsExports(List<String> enabledCloudwatchLogsExports) {
            this.enabledCloudwatchLogsExports = Objects.requireNonNull(enabledCloudwatchLogsExports);
            return this;
        }

        public Builder setEndpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }

        public Builder setEngine(String engine) {
            this.engine = Objects.requireNonNull(engine);
            return this;
        }

        public Builder setEngineVersion(String engineVersion) {
            this.engineVersion = Objects.requireNonNull(engineVersion);
            return this;
        }

        public Builder setFinalSnapshotIdentifier(String finalSnapshotIdentifier) {
            this.finalSnapshotIdentifier = Objects.requireNonNull(finalSnapshotIdentifier);
            return this;
        }

        public Builder setHostedZoneId(String hostedZoneId) {
            this.hostedZoneId = Objects.requireNonNull(hostedZoneId);
            return this;
        }

        public Builder setIamDatabaseAuthenticationEnabled(Boolean iamDatabaseAuthenticationEnabled) {
            this.iamDatabaseAuthenticationEnabled = Objects.requireNonNull(iamDatabaseAuthenticationEnabled);
            return this;
        }

        public Builder setIamRoles(List<String> iamRoles) {
            this.iamRoles = Objects.requireNonNull(iamRoles);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKmsKeyId(String kmsKeyId) {
            this.kmsKeyId = Objects.requireNonNull(kmsKeyId);
            return this;
        }

        public Builder setMasterUsername(String masterUsername) {
            this.masterUsername = Objects.requireNonNull(masterUsername);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setPreferredBackupWindow(String preferredBackupWindow) {
            this.preferredBackupWindow = Objects.requireNonNull(preferredBackupWindow);
            return this;
        }

        public Builder setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
            this.preferredMaintenanceWindow = Objects.requireNonNull(preferredMaintenanceWindow);
            return this;
        }

        public Builder setReaderEndpoint(String readerEndpoint) {
            this.readerEndpoint = Objects.requireNonNull(readerEndpoint);
            return this;
        }

        public Builder setReplicationSourceIdentifier(String replicationSourceIdentifier) {
            this.replicationSourceIdentifier = Objects.requireNonNull(replicationSourceIdentifier);
            return this;
        }

        public Builder setStorageEncrypted(Boolean storageEncrypted) {
            this.storageEncrypted = Objects.requireNonNull(storageEncrypted);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setVpcSecurityGroupIds(List<String> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = Objects.requireNonNull(vpcSecurityGroupIds);
            return this;
        }
        public GetClusterResult build() {
            return new GetClusterResult(arn, availabilityZones, backtrackWindow, backupRetentionPeriod, clusterIdentifier, clusterMembers, clusterResourceId, databaseName, dbClusterParameterGroupName, dbSubnetGroupName, enabledCloudwatchLogsExports, endpoint, engine, engineVersion, finalSnapshotIdentifier, hostedZoneId, iamDatabaseAuthenticationEnabled, iamRoles, id, kmsKeyId, masterUsername, port, preferredBackupWindow, preferredMaintenanceWindow, readerEndpoint, replicationSourceIdentifier, storageEncrypted, tags, vpcSecurityGroupIds);
        }
    }
}
