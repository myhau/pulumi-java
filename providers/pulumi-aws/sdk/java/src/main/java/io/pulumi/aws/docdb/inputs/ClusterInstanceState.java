// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.docdb.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterInstanceState extends io.pulumi.resources.ResourceArgs {

    public static final ClusterInstanceState Empty = new ClusterInstanceState();

    /**
     * Specifies whether any database modifications
     * are applied immediately, or during the next maintenance window. Default is`false`.
     * 
     */
    @InputImport(name="applyImmediately")
      private final @Nullable Input<Boolean> applyImmediately;

    public Input<Boolean> getApplyImmediately() {
        return this.applyImmediately == null ? Input.empty() : this.applyImmediately;
    }

    /**
     * Amazon Resource Name (ARN) of cluster instance
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Indicates that minor engine upgrades will be applied automatically to the DB instance during the maintenance window. Default `true`.
     * 
     */
    @InputImport(name="autoMinorVersionUpgrade")
      private final @Nullable Input<Boolean> autoMinorVersionUpgrade;

    public Input<Boolean> getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade == null ? Input.empty() : this.autoMinorVersionUpgrade;
    }

    /**
     * The EC2 Availability Zone that the DB instance is created in. See [docs](https://docs.aws.amazon.com/documentdb/latest/developerguide/API_CreateDBInstance.html) about the details.
     * 
     */
    @InputImport(name="availabilityZone")
      private final @Nullable Input<String> availabilityZone;

    public Input<String> getAvailabilityZone() {
        return this.availabilityZone == null ? Input.empty() : this.availabilityZone;
    }

    /**
     * (Optional) The identifier of the CA certificate for the DB instance.
     * 
     */
    @InputImport(name="caCertIdentifier")
      private final @Nullable Input<String> caCertIdentifier;

    public Input<String> getCaCertIdentifier() {
        return this.caCertIdentifier == null ? Input.empty() : this.caCertIdentifier;
    }

    /**
     * The identifier of the `aws.docdb.Cluster` in which to launch this instance.
     * 
     */
    @InputImport(name="clusterIdentifier")
      private final @Nullable Input<String> clusterIdentifier;

    public Input<String> getClusterIdentifier() {
        return this.clusterIdentifier == null ? Input.empty() : this.clusterIdentifier;
    }

    /**
     * The DB subnet group to associate with this DB instance.
     * 
     */
    @InputImport(name="dbSubnetGroupName")
      private final @Nullable Input<String> dbSubnetGroupName;

    public Input<String> getDbSubnetGroupName() {
        return this.dbSubnetGroupName == null ? Input.empty() : this.dbSubnetGroupName;
    }

    /**
     * The region-unique, immutable identifier for the DB instance.
     * 
     */
    @InputImport(name="dbiResourceId")
      private final @Nullable Input<String> dbiResourceId;

    public Input<String> getDbiResourceId() {
        return this.dbiResourceId == null ? Input.empty() : this.dbiResourceId;
    }

    /**
     * The DNS address for this instance. May not be writable
     * 
     */
    @InputImport(name="endpoint")
      private final @Nullable Input<String> endpoint;

    public Input<String> getEndpoint() {
        return this.endpoint == null ? Input.empty() : this.endpoint;
    }

    /**
     * The name of the database engine to be used for the DocDB instance. Defaults to `docdb`. Valid Values: `docdb`.
     * 
     */
    @InputImport(name="engine")
      private final @Nullable Input<String> engine;

    public Input<String> getEngine() {
        return this.engine == null ? Input.empty() : this.engine;
    }

    /**
     * The database engine version
     * 
     */
    @InputImport(name="engineVersion")
      private final @Nullable Input<String> engineVersion;

    public Input<String> getEngineVersion() {
        return this.engineVersion == null ? Input.empty() : this.engineVersion;
    }

    /**
     * The identifier for the DocDB instance, if omitted, this provider will assign a random, unique identifier.
     * 
     */
    @InputImport(name="identifier")
      private final @Nullable Input<String> identifier;

    public Input<String> getIdentifier() {
        return this.identifier == null ? Input.empty() : this.identifier;
    }

    /**
     * Creates a unique identifier beginning with the specified prefix. Conflicts with `identifier`.
     * 
     */
    @InputImport(name="identifierPrefix")
      private final @Nullable Input<String> identifierPrefix;

    public Input<String> getIdentifierPrefix() {
        return this.identifierPrefix == null ? Input.empty() : this.identifierPrefix;
    }

    /**
     * The instance class to use. For details on CPU and memory, see [Scaling for DocDB Instances](https://docs.aws.amazon.com/documentdb/latest/developerguide/db-cluster-manage-performance.html#db-cluster-manage-scaling-instance). DocDB currently
     * supports the below instance classes. Please see [AWS Documentation](https://docs.aws.amazon.com/documentdb/latest/developerguide/db-instance-classes.html#db-instance-class-specs) for complete details.
     * - db.r5.large
     * - db.r5.xlarge
     * - db.r5.2xlarge
     * - db.r5.4xlarge
     * - db.r5.12xlarge
     * - db.r5.24xlarge
     * - db.r4.large
     * - db.r4.xlarge
     * - db.r4.2xlarge
     * - db.r4.4xlarge
     * - db.r4.8xlarge
     * - db.r4.16xlarge
     * - db.t3.medium
     * 
     */
    @InputImport(name="instanceClass")
      private final @Nullable Input<String> instanceClass;

    public Input<String> getInstanceClass() {
        return this.instanceClass == null ? Input.empty() : this.instanceClass;
    }

    /**
     * The ARN for the KMS encryption key if one is set to the cluster.
     * 
     */
    @InputImport(name="kmsKeyId")
      private final @Nullable Input<String> kmsKeyId;

    public Input<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Input.empty() : this.kmsKeyId;
    }

    /**
     * The database port
     * 
     */
    @InputImport(name="port")
      private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    /**
     * The daily time range during which automated backups are created if automated backups are enabled.
     * 
     */
    @InputImport(name="preferredBackupWindow")
      private final @Nullable Input<String> preferredBackupWindow;

    public Input<String> getPreferredBackupWindow() {
        return this.preferredBackupWindow == null ? Input.empty() : this.preferredBackupWindow;
    }

    /**
     * The window to perform maintenance in.
     * Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00".
     * 
     */
    @InputImport(name="preferredMaintenanceWindow")
      private final @Nullable Input<String> preferredMaintenanceWindow;

    public Input<String> getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow == null ? Input.empty() : this.preferredMaintenanceWindow;
    }

    /**
     * Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoter to writer.
     * 
     */
    @InputImport(name="promotionTier")
      private final @Nullable Input<Integer> promotionTier;

    public Input<Integer> getPromotionTier() {
        return this.promotionTier == null ? Input.empty() : this.promotionTier;
    }

    @InputImport(name="publiclyAccessible")
      private final @Nullable Input<Boolean> publiclyAccessible;

    public Input<Boolean> getPubliclyAccessible() {
        return this.publiclyAccessible == null ? Input.empty() : this.publiclyAccessible;
    }

    /**
     * Specifies whether the DB cluster is encrypted.
     * 
     */
    @InputImport(name="storageEncrypted")
      private final @Nullable Input<Boolean> storageEncrypted;

    public Input<Boolean> getStorageEncrypted() {
        return this.storageEncrypted == null ? Input.empty() : this.storageEncrypted;
    }

    /**
     * A map of tags to assign to the instance. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * Boolean indicating if this instance is writable. `False` indicates this instance is a read replica.
     * 
     */
    @InputImport(name="writer")
      private final @Nullable Input<Boolean> writer;

    public Input<Boolean> getWriter() {
        return this.writer == null ? Input.empty() : this.writer;
    }

    public ClusterInstanceState(
        @Nullable Input<Boolean> applyImmediately,
        @Nullable Input<String> arn,
        @Nullable Input<Boolean> autoMinorVersionUpgrade,
        @Nullable Input<String> availabilityZone,
        @Nullable Input<String> caCertIdentifier,
        @Nullable Input<String> clusterIdentifier,
        @Nullable Input<String> dbSubnetGroupName,
        @Nullable Input<String> dbiResourceId,
        @Nullable Input<String> endpoint,
        @Nullable Input<String> engine,
        @Nullable Input<String> engineVersion,
        @Nullable Input<String> identifier,
        @Nullable Input<String> identifierPrefix,
        @Nullable Input<String> instanceClass,
        @Nullable Input<String> kmsKeyId,
        @Nullable Input<Integer> port,
        @Nullable Input<String> preferredBackupWindow,
        @Nullable Input<String> preferredMaintenanceWindow,
        @Nullable Input<Integer> promotionTier,
        @Nullable Input<Boolean> publiclyAccessible,
        @Nullable Input<Boolean> storageEncrypted,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<Boolean> writer) {
        this.applyImmediately = applyImmediately;
        this.arn = arn;
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        this.availabilityZone = availabilityZone;
        this.caCertIdentifier = caCertIdentifier;
        this.clusterIdentifier = clusterIdentifier;
        this.dbSubnetGroupName = dbSubnetGroupName;
        this.dbiResourceId = dbiResourceId;
        this.endpoint = endpoint;
        this.engine = engine;
        this.engineVersion = engineVersion;
        this.identifier = identifier;
        this.identifierPrefix = identifierPrefix;
        this.instanceClass = instanceClass;
        this.kmsKeyId = kmsKeyId;
        this.port = port;
        this.preferredBackupWindow = preferredBackupWindow;
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        this.promotionTier = promotionTier;
        this.publiclyAccessible = publiclyAccessible;
        this.storageEncrypted = storageEncrypted;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.writer = writer;
    }

    private ClusterInstanceState() {
        this.applyImmediately = Input.empty();
        this.arn = Input.empty();
        this.autoMinorVersionUpgrade = Input.empty();
        this.availabilityZone = Input.empty();
        this.caCertIdentifier = Input.empty();
        this.clusterIdentifier = Input.empty();
        this.dbSubnetGroupName = Input.empty();
        this.dbiResourceId = Input.empty();
        this.endpoint = Input.empty();
        this.engine = Input.empty();
        this.engineVersion = Input.empty();
        this.identifier = Input.empty();
        this.identifierPrefix = Input.empty();
        this.instanceClass = Input.empty();
        this.kmsKeyId = Input.empty();
        this.port = Input.empty();
        this.preferredBackupWindow = Input.empty();
        this.preferredMaintenanceWindow = Input.empty();
        this.promotionTier = Input.empty();
        this.publiclyAccessible = Input.empty();
        this.storageEncrypted = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.writer = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterInstanceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> applyImmediately;
        private @Nullable Input<String> arn;
        private @Nullable Input<Boolean> autoMinorVersionUpgrade;
        private @Nullable Input<String> availabilityZone;
        private @Nullable Input<String> caCertIdentifier;
        private @Nullable Input<String> clusterIdentifier;
        private @Nullable Input<String> dbSubnetGroupName;
        private @Nullable Input<String> dbiResourceId;
        private @Nullable Input<String> endpoint;
        private @Nullable Input<String> engine;
        private @Nullable Input<String> engineVersion;
        private @Nullable Input<String> identifier;
        private @Nullable Input<String> identifierPrefix;
        private @Nullable Input<String> instanceClass;
        private @Nullable Input<String> kmsKeyId;
        private @Nullable Input<Integer> port;
        private @Nullable Input<String> preferredBackupWindow;
        private @Nullable Input<String> preferredMaintenanceWindow;
        private @Nullable Input<Integer> promotionTier;
        private @Nullable Input<Boolean> publiclyAccessible;
        private @Nullable Input<Boolean> storageEncrypted;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<Boolean> writer;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterInstanceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applyImmediately = defaults.applyImmediately;
    	      this.arn = defaults.arn;
    	      this.autoMinorVersionUpgrade = defaults.autoMinorVersionUpgrade;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.caCertIdentifier = defaults.caCertIdentifier;
    	      this.clusterIdentifier = defaults.clusterIdentifier;
    	      this.dbSubnetGroupName = defaults.dbSubnetGroupName;
    	      this.dbiResourceId = defaults.dbiResourceId;
    	      this.endpoint = defaults.endpoint;
    	      this.engine = defaults.engine;
    	      this.engineVersion = defaults.engineVersion;
    	      this.identifier = defaults.identifier;
    	      this.identifierPrefix = defaults.identifierPrefix;
    	      this.instanceClass = defaults.instanceClass;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.port = defaults.port;
    	      this.preferredBackupWindow = defaults.preferredBackupWindow;
    	      this.preferredMaintenanceWindow = defaults.preferredMaintenanceWindow;
    	      this.promotionTier = defaults.promotionTier;
    	      this.publiclyAccessible = defaults.publiclyAccessible;
    	      this.storageEncrypted = defaults.storageEncrypted;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.writer = defaults.writer;
        }

        public Builder setApplyImmediately(@Nullable Input<Boolean> applyImmediately) {
            this.applyImmediately = applyImmediately;
            return this;
        }

        public Builder setApplyImmediately(@Nullable Boolean applyImmediately) {
            this.applyImmediately = Input.ofNullable(applyImmediately);
            return this;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setAutoMinorVersionUpgrade(@Nullable Input<Boolean> autoMinorVersionUpgrade) {
            this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
            return this;
        }

        public Builder setAutoMinorVersionUpgrade(@Nullable Boolean autoMinorVersionUpgrade) {
            this.autoMinorVersionUpgrade = Input.ofNullable(autoMinorVersionUpgrade);
            return this;
        }

        public Builder setAvailabilityZone(@Nullable Input<String> availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        public Builder setAvailabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = Input.ofNullable(availabilityZone);
            return this;
        }

        public Builder setCaCertIdentifier(@Nullable Input<String> caCertIdentifier) {
            this.caCertIdentifier = caCertIdentifier;
            return this;
        }

        public Builder setCaCertIdentifier(@Nullable String caCertIdentifier) {
            this.caCertIdentifier = Input.ofNullable(caCertIdentifier);
            return this;
        }

        public Builder setClusterIdentifier(@Nullable Input<String> clusterIdentifier) {
            this.clusterIdentifier = clusterIdentifier;
            return this;
        }

        public Builder setClusterIdentifier(@Nullable String clusterIdentifier) {
            this.clusterIdentifier = Input.ofNullable(clusterIdentifier);
            return this;
        }

        public Builder setDbSubnetGroupName(@Nullable Input<String> dbSubnetGroupName) {
            this.dbSubnetGroupName = dbSubnetGroupName;
            return this;
        }

        public Builder setDbSubnetGroupName(@Nullable String dbSubnetGroupName) {
            this.dbSubnetGroupName = Input.ofNullable(dbSubnetGroupName);
            return this;
        }

        public Builder setDbiResourceId(@Nullable Input<String> dbiResourceId) {
            this.dbiResourceId = dbiResourceId;
            return this;
        }

        public Builder setDbiResourceId(@Nullable String dbiResourceId) {
            this.dbiResourceId = Input.ofNullable(dbiResourceId);
            return this;
        }

        public Builder setEndpoint(@Nullable Input<String> endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder setEndpoint(@Nullable String endpoint) {
            this.endpoint = Input.ofNullable(endpoint);
            return this;
        }

        public Builder setEngine(@Nullable Input<String> engine) {
            this.engine = engine;
            return this;
        }

        public Builder setEngine(@Nullable String engine) {
            this.engine = Input.ofNullable(engine);
            return this;
        }

        public Builder setEngineVersion(@Nullable Input<String> engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        public Builder setEngineVersion(@Nullable String engineVersion) {
            this.engineVersion = Input.ofNullable(engineVersion);
            return this;
        }

        public Builder setIdentifier(@Nullable Input<String> identifier) {
            this.identifier = identifier;
            return this;
        }

        public Builder setIdentifier(@Nullable String identifier) {
            this.identifier = Input.ofNullable(identifier);
            return this;
        }

        public Builder setIdentifierPrefix(@Nullable Input<String> identifierPrefix) {
            this.identifierPrefix = identifierPrefix;
            return this;
        }

        public Builder setIdentifierPrefix(@Nullable String identifierPrefix) {
            this.identifierPrefix = Input.ofNullable(identifierPrefix);
            return this;
        }

        public Builder setInstanceClass(@Nullable Input<String> instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }

        public Builder setInstanceClass(@Nullable String instanceClass) {
            this.instanceClass = Input.ofNullable(instanceClass);
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

        public Builder setPort(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder setPreferredBackupWindow(@Nullable Input<String> preferredBackupWindow) {
            this.preferredBackupWindow = preferredBackupWindow;
            return this;
        }

        public Builder setPreferredBackupWindow(@Nullable String preferredBackupWindow) {
            this.preferredBackupWindow = Input.ofNullable(preferredBackupWindow);
            return this;
        }

        public Builder setPreferredMaintenanceWindow(@Nullable Input<String> preferredMaintenanceWindow) {
            this.preferredMaintenanceWindow = preferredMaintenanceWindow;
            return this;
        }

        public Builder setPreferredMaintenanceWindow(@Nullable String preferredMaintenanceWindow) {
            this.preferredMaintenanceWindow = Input.ofNullable(preferredMaintenanceWindow);
            return this;
        }

        public Builder setPromotionTier(@Nullable Input<Integer> promotionTier) {
            this.promotionTier = promotionTier;
            return this;
        }

        public Builder setPromotionTier(@Nullable Integer promotionTier) {
            this.promotionTier = Input.ofNullable(promotionTier);
            return this;
        }

        public Builder setPubliclyAccessible(@Nullable Input<Boolean> publiclyAccessible) {
            this.publiclyAccessible = publiclyAccessible;
            return this;
        }

        public Builder setPubliclyAccessible(@Nullable Boolean publiclyAccessible) {
            this.publiclyAccessible = Input.ofNullable(publiclyAccessible);
            return this;
        }

        public Builder setStorageEncrypted(@Nullable Input<Boolean> storageEncrypted) {
            this.storageEncrypted = storageEncrypted;
            return this;
        }

        public Builder setStorageEncrypted(@Nullable Boolean storageEncrypted) {
            this.storageEncrypted = Input.ofNullable(storageEncrypted);
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

        public Builder setWriter(@Nullable Input<Boolean> writer) {
            this.writer = writer;
            return this;
        }

        public Builder setWriter(@Nullable Boolean writer) {
            this.writer = Input.ofNullable(writer);
            return this;
        }
        public ClusterInstanceState build() {
            return new ClusterInstanceState(applyImmediately, arn, autoMinorVersionUpgrade, availabilityZone, caCertIdentifier, clusterIdentifier, dbSubnetGroupName, dbiResourceId, endpoint, engine, engineVersion, identifier, identifierPrefix, instanceClass, kmsKeyId, port, preferredBackupWindow, preferredMaintenanceWindow, promotionTier, publiclyAccessible, storageEncrypted, tags, tagsAll, writer);
        }
    }
}
