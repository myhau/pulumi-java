// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetBackupRunResult {
    private final Integer backupId;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String instance;
    /**
     * Location of the backups.
     * 
     */
    private final String location;
    private final @Nullable Boolean mostRecent;
    /**
     * The time the backup operation actually started in UTC timezone in RFC 3339 format, for
     * example 2012-11-15T16:19:00.094Z.
     * 
     */
    private final String startTime;
    /**
     * The status of this run. Refer to [API reference](https://cloud.google.com/sql/docs/mysql/admin-api/rest/v1beta4/backupRuns#SqlBackupRunStatus) for possible status values.
     * 
     */
    private final String status;

    @OutputCustomType.Constructor({"backupId","id","instance","location","mostRecent","startTime","status"})
    private GetBackupRunResult(
        Integer backupId,
        String id,
        String instance,
        String location,
        @Nullable Boolean mostRecent,
        String startTime,
        String status) {
        this.backupId = Objects.requireNonNull(backupId);
        this.id = Objects.requireNonNull(id);
        this.instance = Objects.requireNonNull(instance);
        this.location = Objects.requireNonNull(location);
        this.mostRecent = mostRecent;
        this.startTime = Objects.requireNonNull(startTime);
        this.status = Objects.requireNonNull(status);
    }

    public Integer getBackupId() {
        return this.backupId;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    public String getInstance() {
        return this.instance;
    }
    /**
     * Location of the backups.
     * 
     */
    public String getLocation() {
        return this.location;
    }
    public Optional<Boolean> getMostRecent() {
        return Optional.ofNullable(this.mostRecent);
    }
    /**
     * The time the backup operation actually started in UTC timezone in RFC 3339 format, for
     * example 2012-11-15T16:19:00.094Z.
     * 
     */
    public String getStartTime() {
        return this.startTime;
    }
    /**
     * The status of this run. Refer to [API reference](https://cloud.google.com/sql/docs/mysql/admin-api/rest/v1beta4/backupRuns#SqlBackupRunStatus) for possible status values.
     * 
     */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackupRunResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer backupId;
        private String id;
        private String instance;
        private String location;
        private @Nullable Boolean mostRecent;
        private String startTime;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackupRunResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupId = defaults.backupId;
    	      this.id = defaults.id;
    	      this.instance = defaults.instance;
    	      this.location = defaults.location;
    	      this.mostRecent = defaults.mostRecent;
    	      this.startTime = defaults.startTime;
    	      this.status = defaults.status;
        }

        public Builder setBackupId(Integer backupId) {
            this.backupId = Objects.requireNonNull(backupId);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInstance(String instance) {
            this.instance = Objects.requireNonNull(instance);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setMostRecent(@Nullable Boolean mostRecent) {
            this.mostRecent = mostRecent;
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public GetBackupRunResult build() {
            return new GetBackupRunResult(backupId, id, instance, location, mostRecent, startTime, status);
        }
    }
}
