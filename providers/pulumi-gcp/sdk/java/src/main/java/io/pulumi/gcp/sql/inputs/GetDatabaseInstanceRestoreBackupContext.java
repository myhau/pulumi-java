// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetDatabaseInstanceRestoreBackupContext extends io.pulumi.resources.InvokeArgs {

    public static final GetDatabaseInstanceRestoreBackupContext Empty = new GetDatabaseInstanceRestoreBackupContext();

    @InputImport(name="backupRunId", required=true)
    private final Integer backupRunId;

    public Integer getBackupRunId() {
        return this.backupRunId;
    }

    @InputImport(name="instanceId", required=true)
    private final String instanceId;

    public String getInstanceId() {
        return this.instanceId;
    }

    @InputImport(name="project", required=true)
    private final String project;

    public String getProject() {
        return this.project;
    }

    public GetDatabaseInstanceRestoreBackupContext(
        Integer backupRunId,
        String instanceId,
        String project) {
        this.backupRunId = Objects.requireNonNull(backupRunId, "expected parameter 'backupRunId' to be non-null");
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.project = Objects.requireNonNull(project, "expected parameter 'project' to be non-null");
    }

    private GetDatabaseInstanceRestoreBackupContext() {
        this.backupRunId = null;
        this.instanceId = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseInstanceRestoreBackupContext defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer backupRunId;
        private String instanceId;
        private String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatabaseInstanceRestoreBackupContext defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupRunId = defaults.backupRunId;
    	      this.instanceId = defaults.instanceId;
    	      this.project = defaults.project;
        }

        public Builder setBackupRunId(Integer backupRunId) {
            this.backupRunId = Objects.requireNonNull(backupRunId);
            return this;
        }

        public Builder setInstanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public GetDatabaseInstanceRestoreBackupContext build() {
            return new GetDatabaseInstanceRestoreBackupContext(backupRunId, instanceId, project);
        }
    }
}