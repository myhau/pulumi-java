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
public final class GetBackupPolicyResult {
    /**
     * The backup policy creation type. Indicates whether this was created through SaaS or through StorSimple Snapshot Manager.
     * 
     */
    private final String backupPolicyCreationType;
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
     * The time of the last backup for the backup policy.
     * 
     */
    private final String lastBackupTime;
    /**
     * The name of the object.
     * 
     */
    private final String name;
    /**
     * The time of the next backup for the backup policy.
     * 
     */
    private final String nextBackupTime;
    /**
     * Indicates whether at least one of the schedules in the backup policy is active or not.
     * 
     */
    private final String scheduledBackupStatus;
    /**
     * The count of schedules the backup policy contains.
     * 
     */
    private final Double schedulesCount;
    /**
     * If the backup policy was created by StorSimple Snapshot Manager, then this field indicates the hostname of the StorSimple Snapshot Manager.
     * 
     */
    private final String ssmHostName;
    /**
     * The hierarchical type of the object.
     * 
     */
    private final String type;
    /**
     * The path IDs of the volumes which are part of the backup policy.
     * 
     */
    private final List<String> volumeIds;

    @CustomType.Constructor
    private GetBackupPolicyResult(
        @CustomType.Parameter("backupPolicyCreationType") String backupPolicyCreationType,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("lastBackupTime") String lastBackupTime,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("nextBackupTime") String nextBackupTime,
        @CustomType.Parameter("scheduledBackupStatus") String scheduledBackupStatus,
        @CustomType.Parameter("schedulesCount") Double schedulesCount,
        @CustomType.Parameter("ssmHostName") String ssmHostName,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("volumeIds") List<String> volumeIds) {
        this.backupPolicyCreationType = backupPolicyCreationType;
        this.id = id;
        this.kind = kind;
        this.lastBackupTime = lastBackupTime;
        this.name = name;
        this.nextBackupTime = nextBackupTime;
        this.scheduledBackupStatus = scheduledBackupStatus;
        this.schedulesCount = schedulesCount;
        this.ssmHostName = ssmHostName;
        this.type = type;
        this.volumeIds = volumeIds;
    }

    /**
     * The backup policy creation type. Indicates whether this was created through SaaS or through StorSimple Snapshot Manager.
     * 
    */
    public String backupPolicyCreationType() {
        return this.backupPolicyCreationType;
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
     * The time of the last backup for the backup policy.
     * 
    */
    public String lastBackupTime() {
        return this.lastBackupTime;
    }
    /**
     * The name of the object.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The time of the next backup for the backup policy.
     * 
    */
    public String nextBackupTime() {
        return this.nextBackupTime;
    }
    /**
     * Indicates whether at least one of the schedules in the backup policy is active or not.
     * 
    */
    public String scheduledBackupStatus() {
        return this.scheduledBackupStatus;
    }
    /**
     * The count of schedules the backup policy contains.
     * 
    */
    public Double schedulesCount() {
        return this.schedulesCount;
    }
    /**
     * If the backup policy was created by StorSimple Snapshot Manager, then this field indicates the hostname of the StorSimple Snapshot Manager.
     * 
    */
    public String ssmHostName() {
        return this.ssmHostName;
    }
    /**
     * The hierarchical type of the object.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * The path IDs of the volumes which are part of the backup policy.
     * 
    */
    public List<String> volumeIds() {
        return this.volumeIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackupPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backupPolicyCreationType;
        private String id;
        private @Nullable String kind;
        private String lastBackupTime;
        private String name;
        private String nextBackupTime;
        private String scheduledBackupStatus;
        private Double schedulesCount;
        private String ssmHostName;
        private String type;
        private List<String> volumeIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackupPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupPolicyCreationType = defaults.backupPolicyCreationType;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.lastBackupTime = defaults.lastBackupTime;
    	      this.name = defaults.name;
    	      this.nextBackupTime = defaults.nextBackupTime;
    	      this.scheduledBackupStatus = defaults.scheduledBackupStatus;
    	      this.schedulesCount = defaults.schedulesCount;
    	      this.ssmHostName = defaults.ssmHostName;
    	      this.type = defaults.type;
    	      this.volumeIds = defaults.volumeIds;
        }

        public Builder backupPolicyCreationType(String backupPolicyCreationType) {
            this.backupPolicyCreationType = Objects.requireNonNull(backupPolicyCreationType);
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
        public Builder lastBackupTime(String lastBackupTime) {
            this.lastBackupTime = Objects.requireNonNull(lastBackupTime);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder nextBackupTime(String nextBackupTime) {
            this.nextBackupTime = Objects.requireNonNull(nextBackupTime);
            return this;
        }
        public Builder scheduledBackupStatus(String scheduledBackupStatus) {
            this.scheduledBackupStatus = Objects.requireNonNull(scheduledBackupStatus);
            return this;
        }
        public Builder schedulesCount(Double schedulesCount) {
            this.schedulesCount = Objects.requireNonNull(schedulesCount);
            return this;
        }
        public Builder ssmHostName(String ssmHostName) {
            this.ssmHostName = Objects.requireNonNull(ssmHostName);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder volumeIds(List<String> volumeIds) {
            this.volumeIds = Objects.requireNonNull(volumeIds);
            return this;
        }
        public Builder volumeIds(String... volumeIds) {
            return volumeIds(List.of(volumeIds));
        }        public GetBackupPolicyResult build() {
            return new GetBackupPolicyResult(backupPolicyCreationType, id, kind, lastBackupTime, name, nextBackupTime, scheduledBackupStatus, schedulesCount, ssmHostName, type, volumeIds);
        }
    }
}
