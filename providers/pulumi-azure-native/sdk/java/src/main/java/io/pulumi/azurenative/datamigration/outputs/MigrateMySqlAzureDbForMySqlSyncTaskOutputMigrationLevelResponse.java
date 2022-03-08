// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MigrateMySqlAzureDbForMySqlSyncTaskOutputMigrationLevelResponse {
    /**
     * Migration end time
     * 
     */
    private final String endedOn;
    /**
     * Result identifier
     * 
     */
    private final String id;
    /**
     * Result type
     * Expected value is 'MigrationLevelOutput'.
     * 
     */
    private final String resultType;
    /**
     * Source server name
     * 
     */
    private final String sourceServer;
    /**
     * Source server version
     * 
     */
    private final String sourceServerVersion;
    /**
     * Migration start time
     * 
     */
    private final String startedOn;
    /**
     * Target server name
     * 
     */
    private final String targetServer;
    /**
     * Target server version
     * 
     */
    private final String targetServerVersion;

    @OutputCustomType.Constructor({"endedOn","id","resultType","sourceServer","sourceServerVersion","startedOn","targetServer","targetServerVersion"})
    private MigrateMySqlAzureDbForMySqlSyncTaskOutputMigrationLevelResponse(
        String endedOn,
        String id,
        String resultType,
        String sourceServer,
        String sourceServerVersion,
        String startedOn,
        String targetServer,
        String targetServerVersion) {
        this.endedOn = endedOn;
        this.id = id;
        this.resultType = resultType;
        this.sourceServer = sourceServer;
        this.sourceServerVersion = sourceServerVersion;
        this.startedOn = startedOn;
        this.targetServer = targetServer;
        this.targetServerVersion = targetServerVersion;
    }

    /**
     * Migration end time
     * 
    */
    public String getEndedOn() {
        return this.endedOn;
    }
    /**
     * Result identifier
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Result type
     * Expected value is 'MigrationLevelOutput'.
     * 
    */
    public String getResultType() {
        return this.resultType;
    }
    /**
     * Source server name
     * 
    */
    public String getSourceServer() {
        return this.sourceServer;
    }
    /**
     * Source server version
     * 
    */
    public String getSourceServerVersion() {
        return this.sourceServerVersion;
    }
    /**
     * Migration start time
     * 
    */
    public String getStartedOn() {
        return this.startedOn;
    }
    /**
     * Target server name
     * 
    */
    public String getTargetServer() {
        return this.targetServer;
    }
    /**
     * Target server version
     * 
    */
    public String getTargetServerVersion() {
        return this.targetServerVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateMySqlAzureDbForMySqlSyncTaskOutputMigrationLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endedOn;
        private String id;
        private String resultType;
        private String sourceServer;
        private String sourceServerVersion;
        private String startedOn;
        private String targetServer;
        private String targetServerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateMySqlAzureDbForMySqlSyncTaskOutputMigrationLevelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endedOn = defaults.endedOn;
    	      this.id = defaults.id;
    	      this.resultType = defaults.resultType;
    	      this.sourceServer = defaults.sourceServer;
    	      this.sourceServerVersion = defaults.sourceServerVersion;
    	      this.startedOn = defaults.startedOn;
    	      this.targetServer = defaults.targetServer;
    	      this.targetServerVersion = defaults.targetServerVersion;
        }

        public Builder setEndedOn(String endedOn) {
            this.endedOn = Objects.requireNonNull(endedOn);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setResultType(String resultType) {
            this.resultType = Objects.requireNonNull(resultType);
            return this;
        }

        public Builder setSourceServer(String sourceServer) {
            this.sourceServer = Objects.requireNonNull(sourceServer);
            return this;
        }

        public Builder setSourceServerVersion(String sourceServerVersion) {
            this.sourceServerVersion = Objects.requireNonNull(sourceServerVersion);
            return this;
        }

        public Builder setStartedOn(String startedOn) {
            this.startedOn = Objects.requireNonNull(startedOn);
            return this;
        }

        public Builder setTargetServer(String targetServer) {
            this.targetServer = Objects.requireNonNull(targetServer);
            return this;
        }

        public Builder setTargetServerVersion(String targetServerVersion) {
            this.targetServerVersion = Objects.requireNonNull(targetServerVersion);
            return this;
        }
        public MigrateMySqlAzureDbForMySqlSyncTaskOutputMigrationLevelResponse build() {
            return new MigrateMySqlAzureDbForMySqlSyncTaskOutputMigrationLevelResponse(endedOn, id, resultType, sourceServer, sourceServerVersion, startedOn, targetServer, targetServerVersion);
        }
    }
}
