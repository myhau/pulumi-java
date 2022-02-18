// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatabaseInstanceRestoreBackupContext {
    /**
     * The ID of the backup run to restore from.
     * 
     */
    private final Integer backupRunId;
    /**
     * The ID of the instance that the backup was taken from. If left empty,
     * this instance's ID will be used.
     * 
     */
    private final @Nullable String instanceId;
    /**
     * The full project ID of the source instance.`
     * 
     */
    private final @Nullable String project;

    @OutputCustomType.Constructor({"backupRunId","instanceId","project"})
    private DatabaseInstanceRestoreBackupContext(
        Integer backupRunId,
        @Nullable String instanceId,
        @Nullable String project) {
        this.backupRunId = Objects.requireNonNull(backupRunId);
        this.instanceId = instanceId;
        this.project = project;
    }

    /**
     * The ID of the backup run to restore from.
     * 
     */
    public Integer getBackupRunId() {
        return this.backupRunId;
    }
    /**
     * The ID of the instance that the backup was taken from. If left empty,
     * this instance's ID will be used.
     * 
     */
    public Optional<String> getInstanceId() {
        return Optional.ofNullable(this.instanceId);
    }
    /**
     * The full project ID of the source instance.`
     * 
     */
    public Optional<String> getProject() {
        return Optional.ofNullable(this.project);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInstanceRestoreBackupContext defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer backupRunId;
        private @Nullable String instanceId;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseInstanceRestoreBackupContext defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupRunId = defaults.backupRunId;
    	      this.instanceId = defaults.instanceId;
    	      this.project = defaults.project;
        }

        public Builder setBackupRunId(Integer backupRunId) {
            this.backupRunId = Objects.requireNonNull(backupRunId);
            return this;
        }

        public Builder setInstanceId(@Nullable String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public DatabaseInstanceRestoreBackupContext build() {
            return new DatabaseInstanceRestoreBackupContext(backupRunId, instanceId, project);
        }
    }
}
