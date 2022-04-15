// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVolumeResult {
    /**
     * The IDs of the access control records, associated with the volume.
     * 
     */
    private final List<String> accessControlRecordIds;
    /**
     * The IDs of the backup policies, in which this volume is part of.
     * 
     */
    private final List<String> backupPolicyIds;
    /**
     * The backup status of the volume.
     * 
     */
    private final String backupStatus;
    /**
     * The path ID that uniquely identifies the object.
     * 
     */
    private final String id;
    /**
     * The Kind of the object. Currently only Series8000 is supported
     * 
     */
    private final @Nullable String kind;
    /**
     * The monitoring status of the volume.
     * 
     */
    private final String monitoringStatus;
    /**
     * The name of the object.
     * 
     */
    private final String name;
    /**
     * The operation status on the volume.
     * 
     */
    private final String operationStatus;
    /**
     * The size of the volume in bytes.
     * 
     */
    private final Double sizeInBytes;
    /**
     * The hierarchical type of the object.
     * 
     */
    private final String type;
    /**
     * The ID of the volume container, in which this volume is created.
     * 
     */
    private final String volumeContainerId;
    /**
     * The volume status.
     * 
     */
    private final String volumeStatus;
    /**
     * The type of the volume.
     * 
     */
    private final String volumeType;

    @CustomType.Constructor
    private GetVolumeResult(
        @CustomType.Parameter("accessControlRecordIds") List<String> accessControlRecordIds,
        @CustomType.Parameter("backupPolicyIds") List<String> backupPolicyIds,
        @CustomType.Parameter("backupStatus") String backupStatus,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("monitoringStatus") String monitoringStatus,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("operationStatus") String operationStatus,
        @CustomType.Parameter("sizeInBytes") Double sizeInBytes,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("volumeContainerId") String volumeContainerId,
        @CustomType.Parameter("volumeStatus") String volumeStatus,
        @CustomType.Parameter("volumeType") String volumeType) {
        this.accessControlRecordIds = accessControlRecordIds;
        this.backupPolicyIds = backupPolicyIds;
        this.backupStatus = backupStatus;
        this.id = id;
        this.kind = kind;
        this.monitoringStatus = monitoringStatus;
        this.name = name;
        this.operationStatus = operationStatus;
        this.sizeInBytes = sizeInBytes;
        this.type = type;
        this.volumeContainerId = volumeContainerId;
        this.volumeStatus = volumeStatus;
        this.volumeType = volumeType;
    }

    /**
     * The IDs of the access control records, associated with the volume.
     * 
    */
    public List<String> accessControlRecordIds() {
        return this.accessControlRecordIds;
    }
    /**
     * The IDs of the backup policies, in which this volume is part of.
     * 
    */
    public List<String> backupPolicyIds() {
        return this.backupPolicyIds;
    }
    /**
     * The backup status of the volume.
     * 
    */
    public String backupStatus() {
        return this.backupStatus;
    }
    /**
     * The path ID that uniquely identifies the object.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The Kind of the object. Currently only Series8000 is supported
     * 
    */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * The monitoring status of the volume.
     * 
    */
    public String monitoringStatus() {
        return this.monitoringStatus;
    }
    /**
     * The name of the object.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The operation status on the volume.
     * 
    */
    public String operationStatus() {
        return this.operationStatus;
    }
    /**
     * The size of the volume in bytes.
     * 
    */
    public Double sizeInBytes() {
        return this.sizeInBytes;
    }
    /**
     * The hierarchical type of the object.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * The ID of the volume container, in which this volume is created.
     * 
    */
    public String volumeContainerId() {
        return this.volumeContainerId;
    }
    /**
     * The volume status.
     * 
    */
    public String volumeStatus() {
        return this.volumeStatus;
    }
    /**
     * The type of the volume.
     * 
    */
    public String volumeType() {
        return this.volumeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVolumeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> accessControlRecordIds;
        private List<String> backupPolicyIds;
        private String backupStatus;
        private String id;
        private @Nullable String kind;
        private String monitoringStatus;
        private String name;
        private String operationStatus;
        private Double sizeInBytes;
        private String type;
        private String volumeContainerId;
        private String volumeStatus;
        private String volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVolumeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessControlRecordIds = defaults.accessControlRecordIds;
    	      this.backupPolicyIds = defaults.backupPolicyIds;
    	      this.backupStatus = defaults.backupStatus;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.monitoringStatus = defaults.monitoringStatus;
    	      this.name = defaults.name;
    	      this.operationStatus = defaults.operationStatus;
    	      this.sizeInBytes = defaults.sizeInBytes;
    	      this.type = defaults.type;
    	      this.volumeContainerId = defaults.volumeContainerId;
    	      this.volumeStatus = defaults.volumeStatus;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder accessControlRecordIds(List<String> accessControlRecordIds) {
            this.accessControlRecordIds = Objects.requireNonNull(accessControlRecordIds);
            return this;
        }
        public Builder accessControlRecordIds(String... accessControlRecordIds) {
            return accessControlRecordIds(List.of(accessControlRecordIds));
        }
        public Builder backupPolicyIds(List<String> backupPolicyIds) {
            this.backupPolicyIds = Objects.requireNonNull(backupPolicyIds);
            return this;
        }
        public Builder backupPolicyIds(String... backupPolicyIds) {
            return backupPolicyIds(List.of(backupPolicyIds));
        }
        public Builder backupStatus(String backupStatus) {
            this.backupStatus = Objects.requireNonNull(backupStatus);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder monitoringStatus(String monitoringStatus) {
            this.monitoringStatus = Objects.requireNonNull(monitoringStatus);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder operationStatus(String operationStatus) {
            this.operationStatus = Objects.requireNonNull(operationStatus);
            return this;
        }
        public Builder sizeInBytes(Double sizeInBytes) {
            this.sizeInBytes = Objects.requireNonNull(sizeInBytes);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder volumeContainerId(String volumeContainerId) {
            this.volumeContainerId = Objects.requireNonNull(volumeContainerId);
            return this;
        }
        public Builder volumeStatus(String volumeStatus) {
            this.volumeStatus = Objects.requireNonNull(volumeStatus);
            return this;
        }
        public Builder volumeType(String volumeType) {
            this.volumeType = Objects.requireNonNull(volumeType);
            return this;
        }        public GetVolumeResult build() {
            return new GetVolumeResult(accessControlRecordIds, backupPolicyIds, backupStatus, id, kind, monitoringStatus, name, operationStatus, sizeInBytes, type, volumeContainerId, volumeStatus, volumeType);
        }
    }
}
