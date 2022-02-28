// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dynamodb.inputs;

import io.pulumi.aws.dynamodb.inputs.TableAttributeGetArgs;
import io.pulumi.aws.dynamodb.inputs.TableGlobalSecondaryIndexGetArgs;
import io.pulumi.aws.dynamodb.inputs.TableLocalSecondaryIndexGetArgs;
import io.pulumi.aws.dynamodb.inputs.TablePointInTimeRecoveryGetArgs;
import io.pulumi.aws.dynamodb.inputs.TableReplicaGetArgs;
import io.pulumi.aws.dynamodb.inputs.TableServerSideEncryptionGetArgs;
import io.pulumi.aws.dynamodb.inputs.TableTtlGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableState extends io.pulumi.resources.ResourceArgs {

    public static final TableState Empty = new TableState();

    /**
     * The arn of the table
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * List of nested attribute definitions. Only required for `hash_key` and `range_key` attributes. Each attribute has two properties:
     * 
     */
    @InputImport(name="attributes")
      private final @Nullable Input<List<TableAttributeGetArgs>> attributes;

    public Input<List<TableAttributeGetArgs>> getAttributes() {
        return this.attributes == null ? Input.empty() : this.attributes;
    }

    /**
     * Controls how you are charged for read and write throughput and how you manage capacity. The valid values are `PROVISIONED` and `PAY_PER_REQUEST`. Defaults to `PROVISIONED`.
     * 
     */
    @InputImport(name="billingMode")
      private final @Nullable Input<String> billingMode;

    public Input<String> getBillingMode() {
        return this.billingMode == null ? Input.empty() : this.billingMode;
    }

    /**
     * Describe a GSI for the table;
     * subject to the normal limits on the number of GSIs, projected
     * attributes, etc.
     * 
     */
    @InputImport(name="globalSecondaryIndexes")
      private final @Nullable Input<List<TableGlobalSecondaryIndexGetArgs>> globalSecondaryIndexes;

    public Input<List<TableGlobalSecondaryIndexGetArgs>> getGlobalSecondaryIndexes() {
        return this.globalSecondaryIndexes == null ? Input.empty() : this.globalSecondaryIndexes;
    }

    /**
     * The name of the hash key in the index; must be
     * defined as an attribute in the resource.
     * 
     */
    @InputImport(name="hashKey")
      private final @Nullable Input<String> hashKey;

    public Input<String> getHashKey() {
        return this.hashKey == null ? Input.empty() : this.hashKey;
    }

    /**
     * Describe an LSI on the table;
     * these can only be allocated *at creation* so you cannot change this
     * definition after you have created the resource.
     * 
     */
    @InputImport(name="localSecondaryIndexes")
      private final @Nullable Input<List<TableLocalSecondaryIndexGetArgs>> localSecondaryIndexes;

    public Input<List<TableLocalSecondaryIndexGetArgs>> getLocalSecondaryIndexes() {
        return this.localSecondaryIndexes == null ? Input.empty() : this.localSecondaryIndexes;
    }

    /**
     * The name of the index
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Enable point-in-time recovery options.
     * 
     */
    @InputImport(name="pointInTimeRecovery")
      private final @Nullable Input<TablePointInTimeRecoveryGetArgs> pointInTimeRecovery;

    public Input<TablePointInTimeRecoveryGetArgs> getPointInTimeRecovery() {
        return this.pointInTimeRecovery == null ? Input.empty() : this.pointInTimeRecovery;
    }

    /**
     * The name of the range key; must be defined
     * 
     */
    @InputImport(name="rangeKey")
      private final @Nullable Input<String> rangeKey;

    public Input<String> getRangeKey() {
        return this.rangeKey == null ? Input.empty() : this.rangeKey;
    }

    /**
     * The number of read units for this index. Must be set if billing_mode is set to PROVISIONED.
     * 
     */
    @InputImport(name="readCapacity")
      private final @Nullable Input<Integer> readCapacity;

    public Input<Integer> getReadCapacity() {
        return this.readCapacity == null ? Input.empty() : this.readCapacity;
    }

    /**
     * Configuration block(s) with [DynamoDB Global Tables V2 (version 2019.11.21)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V2.html) replication configurations. Detailed below.
     * 
     */
    @InputImport(name="replicas")
      private final @Nullable Input<List<TableReplicaGetArgs>> replicas;

    public Input<List<TableReplicaGetArgs>> getReplicas() {
        return this.replicas == null ? Input.empty() : this.replicas;
    }

    /**
     * The time of the point-in-time recovery point to restore.
     * 
     */
    @InputImport(name="restoreDateTime")
      private final @Nullable Input<String> restoreDateTime;

    public Input<String> getRestoreDateTime() {
        return this.restoreDateTime == null ? Input.empty() : this.restoreDateTime;
    }

    /**
     * The name of the table to restore. Must match the name of an existing table.
     * 
     */
    @InputImport(name="restoreSourceName")
      private final @Nullable Input<String> restoreSourceName;

    public Input<String> getRestoreSourceName() {
        return this.restoreSourceName == null ? Input.empty() : this.restoreSourceName;
    }

    /**
     * If set, restores table to the most recent point-in-time recovery point.
     * 
     */
    @InputImport(name="restoreToLatestTime")
      private final @Nullable Input<Boolean> restoreToLatestTime;

    public Input<Boolean> getRestoreToLatestTime() {
        return this.restoreToLatestTime == null ? Input.empty() : this.restoreToLatestTime;
    }

    /**
     * Encryption at rest options. AWS DynamoDB tables are automatically encrypted at rest with an AWS owned Customer Master Key if this argument isn't specified.
     * 
     */
    @InputImport(name="serverSideEncryption")
      private final @Nullable Input<TableServerSideEncryptionGetArgs> serverSideEncryption;

    public Input<TableServerSideEncryptionGetArgs> getServerSideEncryption() {
        return this.serverSideEncryption == null ? Input.empty() : this.serverSideEncryption;
    }

    /**
     * The ARN of the Table Stream. Only available when `stream_enabled = true`
     * 
     */
    @InputImport(name="streamArn")
      private final @Nullable Input<String> streamArn;

    public Input<String> getStreamArn() {
        return this.streamArn == null ? Input.empty() : this.streamArn;
    }

    /**
     * Indicates whether Streams are to be enabled (true) or disabled (false).
     * 
     */
    @InputImport(name="streamEnabled")
      private final @Nullable Input<Boolean> streamEnabled;

    public Input<Boolean> getStreamEnabled() {
        return this.streamEnabled == null ? Input.empty() : this.streamEnabled;
    }

    /**
     * A timestamp, in ISO 8601 format, for this stream. Note that this timestamp is not
     * a unique identifier for the stream on its own. However, the combination of AWS customer ID,
     * table name and this field is guaranteed to be unique.
     * It can be used for creating CloudWatch Alarms. Only available when `stream_enabled = true`
     * 
     */
    @InputImport(name="streamLabel")
      private final @Nullable Input<String> streamLabel;

    public Input<String> getStreamLabel() {
        return this.streamLabel == null ? Input.empty() : this.streamLabel;
    }

    /**
     * When an item in the table is modified, StreamViewType determines what information is written to the table's stream. Valid values are `KEYS_ONLY`, `NEW_IMAGE`, `OLD_IMAGE`, `NEW_AND_OLD_IMAGES`.
     * 
     */
    @InputImport(name="streamViewType")
      private final @Nullable Input<String> streamViewType;

    public Input<String> getStreamViewType() {
        return this.streamViewType == null ? Input.empty() : this.streamViewType;
    }

    /**
     * The storage class of the table. Valid values are `STANDARD` and `STANDARD_INFREQUENT_ACCESS`.
     * 
     */
    @InputImport(name="tableClass")
      private final @Nullable Input<String> tableClass;

    public Input<String> getTableClass() {
        return this.tableClass == null ? Input.empty() : this.tableClass;
    }

    /**
     * A map of tags to populate on the created table. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Defines ttl, has two properties, and can only be specified once:
     * 
     */
    @InputImport(name="ttl")
      private final @Nullable Input<TableTtlGetArgs> ttl;

    public Input<TableTtlGetArgs> getTtl() {
        return this.ttl == null ? Input.empty() : this.ttl;
    }

    /**
     * The number of write units for this index. Must be set if billing_mode is set to PROVISIONED.
     * 
     */
    @InputImport(name="writeCapacity")
      private final @Nullable Input<Integer> writeCapacity;

    public Input<Integer> getWriteCapacity() {
        return this.writeCapacity == null ? Input.empty() : this.writeCapacity;
    }

    public TableState(
        @Nullable Input<String> arn,
        @Nullable Input<List<TableAttributeGetArgs>> attributes,
        @Nullable Input<String> billingMode,
        @Nullable Input<List<TableGlobalSecondaryIndexGetArgs>> globalSecondaryIndexes,
        @Nullable Input<String> hashKey,
        @Nullable Input<List<TableLocalSecondaryIndexGetArgs>> localSecondaryIndexes,
        @Nullable Input<String> name,
        @Nullable Input<TablePointInTimeRecoveryGetArgs> pointInTimeRecovery,
        @Nullable Input<String> rangeKey,
        @Nullable Input<Integer> readCapacity,
        @Nullable Input<List<TableReplicaGetArgs>> replicas,
        @Nullable Input<String> restoreDateTime,
        @Nullable Input<String> restoreSourceName,
        @Nullable Input<Boolean> restoreToLatestTime,
        @Nullable Input<TableServerSideEncryptionGetArgs> serverSideEncryption,
        @Nullable Input<String> streamArn,
        @Nullable Input<Boolean> streamEnabled,
        @Nullable Input<String> streamLabel,
        @Nullable Input<String> streamViewType,
        @Nullable Input<String> tableClass,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<TableTtlGetArgs> ttl,
        @Nullable Input<Integer> writeCapacity) {
        this.arn = arn;
        this.attributes = attributes;
        this.billingMode = billingMode;
        this.globalSecondaryIndexes = globalSecondaryIndexes;
        this.hashKey = hashKey;
        this.localSecondaryIndexes = localSecondaryIndexes;
        this.name = name;
        this.pointInTimeRecovery = pointInTimeRecovery;
        this.rangeKey = rangeKey;
        this.readCapacity = readCapacity;
        this.replicas = replicas;
        this.restoreDateTime = restoreDateTime;
        this.restoreSourceName = restoreSourceName;
        this.restoreToLatestTime = restoreToLatestTime;
        this.serverSideEncryption = serverSideEncryption;
        this.streamArn = streamArn;
        this.streamEnabled = streamEnabled;
        this.streamLabel = streamLabel;
        this.streamViewType = streamViewType;
        this.tableClass = tableClass;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.ttl = ttl;
        this.writeCapacity = writeCapacity;
    }

    private TableState() {
        this.arn = Input.empty();
        this.attributes = Input.empty();
        this.billingMode = Input.empty();
        this.globalSecondaryIndexes = Input.empty();
        this.hashKey = Input.empty();
        this.localSecondaryIndexes = Input.empty();
        this.name = Input.empty();
        this.pointInTimeRecovery = Input.empty();
        this.rangeKey = Input.empty();
        this.readCapacity = Input.empty();
        this.replicas = Input.empty();
        this.restoreDateTime = Input.empty();
        this.restoreSourceName = Input.empty();
        this.restoreToLatestTime = Input.empty();
        this.serverSideEncryption = Input.empty();
        this.streamArn = Input.empty();
        this.streamEnabled = Input.empty();
        this.streamLabel = Input.empty();
        this.streamViewType = Input.empty();
        this.tableClass = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.ttl = Input.empty();
        this.writeCapacity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<List<TableAttributeGetArgs>> attributes;
        private @Nullable Input<String> billingMode;
        private @Nullable Input<List<TableGlobalSecondaryIndexGetArgs>> globalSecondaryIndexes;
        private @Nullable Input<String> hashKey;
        private @Nullable Input<List<TableLocalSecondaryIndexGetArgs>> localSecondaryIndexes;
        private @Nullable Input<String> name;
        private @Nullable Input<TablePointInTimeRecoveryGetArgs> pointInTimeRecovery;
        private @Nullable Input<String> rangeKey;
        private @Nullable Input<Integer> readCapacity;
        private @Nullable Input<List<TableReplicaGetArgs>> replicas;
        private @Nullable Input<String> restoreDateTime;
        private @Nullable Input<String> restoreSourceName;
        private @Nullable Input<Boolean> restoreToLatestTime;
        private @Nullable Input<TableServerSideEncryptionGetArgs> serverSideEncryption;
        private @Nullable Input<String> streamArn;
        private @Nullable Input<Boolean> streamEnabled;
        private @Nullable Input<String> streamLabel;
        private @Nullable Input<String> streamViewType;
        private @Nullable Input<String> tableClass;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<TableTtlGetArgs> ttl;
        private @Nullable Input<Integer> writeCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(TableState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.attributes = defaults.attributes;
    	      this.billingMode = defaults.billingMode;
    	      this.globalSecondaryIndexes = defaults.globalSecondaryIndexes;
    	      this.hashKey = defaults.hashKey;
    	      this.localSecondaryIndexes = defaults.localSecondaryIndexes;
    	      this.name = defaults.name;
    	      this.pointInTimeRecovery = defaults.pointInTimeRecovery;
    	      this.rangeKey = defaults.rangeKey;
    	      this.readCapacity = defaults.readCapacity;
    	      this.replicas = defaults.replicas;
    	      this.restoreDateTime = defaults.restoreDateTime;
    	      this.restoreSourceName = defaults.restoreSourceName;
    	      this.restoreToLatestTime = defaults.restoreToLatestTime;
    	      this.serverSideEncryption = defaults.serverSideEncryption;
    	      this.streamArn = defaults.streamArn;
    	      this.streamEnabled = defaults.streamEnabled;
    	      this.streamLabel = defaults.streamLabel;
    	      this.streamViewType = defaults.streamViewType;
    	      this.tableClass = defaults.tableClass;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.ttl = defaults.ttl;
    	      this.writeCapacity = defaults.writeCapacity;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setAttributes(@Nullable Input<List<TableAttributeGetArgs>> attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder setAttributes(@Nullable List<TableAttributeGetArgs> attributes) {
            this.attributes = Input.ofNullable(attributes);
            return this;
        }

        public Builder setBillingMode(@Nullable Input<String> billingMode) {
            this.billingMode = billingMode;
            return this;
        }

        public Builder setBillingMode(@Nullable String billingMode) {
            this.billingMode = Input.ofNullable(billingMode);
            return this;
        }

        public Builder setGlobalSecondaryIndexes(@Nullable Input<List<TableGlobalSecondaryIndexGetArgs>> globalSecondaryIndexes) {
            this.globalSecondaryIndexes = globalSecondaryIndexes;
            return this;
        }

        public Builder setGlobalSecondaryIndexes(@Nullable List<TableGlobalSecondaryIndexGetArgs> globalSecondaryIndexes) {
            this.globalSecondaryIndexes = Input.ofNullable(globalSecondaryIndexes);
            return this;
        }

        public Builder setHashKey(@Nullable Input<String> hashKey) {
            this.hashKey = hashKey;
            return this;
        }

        public Builder setHashKey(@Nullable String hashKey) {
            this.hashKey = Input.ofNullable(hashKey);
            return this;
        }

        public Builder setLocalSecondaryIndexes(@Nullable Input<List<TableLocalSecondaryIndexGetArgs>> localSecondaryIndexes) {
            this.localSecondaryIndexes = localSecondaryIndexes;
            return this;
        }

        public Builder setLocalSecondaryIndexes(@Nullable List<TableLocalSecondaryIndexGetArgs> localSecondaryIndexes) {
            this.localSecondaryIndexes = Input.ofNullable(localSecondaryIndexes);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPointInTimeRecovery(@Nullable Input<TablePointInTimeRecoveryGetArgs> pointInTimeRecovery) {
            this.pointInTimeRecovery = pointInTimeRecovery;
            return this;
        }

        public Builder setPointInTimeRecovery(@Nullable TablePointInTimeRecoveryGetArgs pointInTimeRecovery) {
            this.pointInTimeRecovery = Input.ofNullable(pointInTimeRecovery);
            return this;
        }

        public Builder setRangeKey(@Nullable Input<String> rangeKey) {
            this.rangeKey = rangeKey;
            return this;
        }

        public Builder setRangeKey(@Nullable String rangeKey) {
            this.rangeKey = Input.ofNullable(rangeKey);
            return this;
        }

        public Builder setReadCapacity(@Nullable Input<Integer> readCapacity) {
            this.readCapacity = readCapacity;
            return this;
        }

        public Builder setReadCapacity(@Nullable Integer readCapacity) {
            this.readCapacity = Input.ofNullable(readCapacity);
            return this;
        }

        public Builder setReplicas(@Nullable Input<List<TableReplicaGetArgs>> replicas) {
            this.replicas = replicas;
            return this;
        }

        public Builder setReplicas(@Nullable List<TableReplicaGetArgs> replicas) {
            this.replicas = Input.ofNullable(replicas);
            return this;
        }

        public Builder setRestoreDateTime(@Nullable Input<String> restoreDateTime) {
            this.restoreDateTime = restoreDateTime;
            return this;
        }

        public Builder setRestoreDateTime(@Nullable String restoreDateTime) {
            this.restoreDateTime = Input.ofNullable(restoreDateTime);
            return this;
        }

        public Builder setRestoreSourceName(@Nullable Input<String> restoreSourceName) {
            this.restoreSourceName = restoreSourceName;
            return this;
        }

        public Builder setRestoreSourceName(@Nullable String restoreSourceName) {
            this.restoreSourceName = Input.ofNullable(restoreSourceName);
            return this;
        }

        public Builder setRestoreToLatestTime(@Nullable Input<Boolean> restoreToLatestTime) {
            this.restoreToLatestTime = restoreToLatestTime;
            return this;
        }

        public Builder setRestoreToLatestTime(@Nullable Boolean restoreToLatestTime) {
            this.restoreToLatestTime = Input.ofNullable(restoreToLatestTime);
            return this;
        }

        public Builder setServerSideEncryption(@Nullable Input<TableServerSideEncryptionGetArgs> serverSideEncryption) {
            this.serverSideEncryption = serverSideEncryption;
            return this;
        }

        public Builder setServerSideEncryption(@Nullable TableServerSideEncryptionGetArgs serverSideEncryption) {
            this.serverSideEncryption = Input.ofNullable(serverSideEncryption);
            return this;
        }

        public Builder setStreamArn(@Nullable Input<String> streamArn) {
            this.streamArn = streamArn;
            return this;
        }

        public Builder setStreamArn(@Nullable String streamArn) {
            this.streamArn = Input.ofNullable(streamArn);
            return this;
        }

        public Builder setStreamEnabled(@Nullable Input<Boolean> streamEnabled) {
            this.streamEnabled = streamEnabled;
            return this;
        }

        public Builder setStreamEnabled(@Nullable Boolean streamEnabled) {
            this.streamEnabled = Input.ofNullable(streamEnabled);
            return this;
        }

        public Builder setStreamLabel(@Nullable Input<String> streamLabel) {
            this.streamLabel = streamLabel;
            return this;
        }

        public Builder setStreamLabel(@Nullable String streamLabel) {
            this.streamLabel = Input.ofNullable(streamLabel);
            return this;
        }

        public Builder setStreamViewType(@Nullable Input<String> streamViewType) {
            this.streamViewType = streamViewType;
            return this;
        }

        public Builder setStreamViewType(@Nullable String streamViewType) {
            this.streamViewType = Input.ofNullable(streamViewType);
            return this;
        }

        public Builder setTableClass(@Nullable Input<String> tableClass) {
            this.tableClass = tableClass;
            return this;
        }

        public Builder setTableClass(@Nullable String tableClass) {
            this.tableClass = Input.ofNullable(tableClass);
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

        public Builder setTtl(@Nullable Input<TableTtlGetArgs> ttl) {
            this.ttl = ttl;
            return this;
        }

        public Builder setTtl(@Nullable TableTtlGetArgs ttl) {
            this.ttl = Input.ofNullable(ttl);
            return this;
        }

        public Builder setWriteCapacity(@Nullable Input<Integer> writeCapacity) {
            this.writeCapacity = writeCapacity;
            return this;
        }

        public Builder setWriteCapacity(@Nullable Integer writeCapacity) {
            this.writeCapacity = Input.ofNullable(writeCapacity);
            return this;
        }
        public TableState build() {
            return new TableState(arn, attributes, billingMode, globalSecondaryIndexes, hashKey, localSecondaryIndexes, name, pointInTimeRecovery, rangeKey, readCapacity, replicas, restoreDateTime, restoreSourceName, restoreToLatestTime, serverSideEncryption, streamArn, streamEnabled, streamLabel, streamViewType, tableClass, tags, tagsAll, ttl, writeCapacity);
        }
    }
}
