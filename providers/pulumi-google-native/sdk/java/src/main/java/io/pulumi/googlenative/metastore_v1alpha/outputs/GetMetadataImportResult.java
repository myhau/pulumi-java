// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.metastore_v1alpha.outputs.DatabaseDumpResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetMetadataImportResult {
    /**
     * The time when the metadata import was started.
     * 
     */
    private final String createTime;
    /**
     * Immutable. A database dump from a pre-existing metastore's database.
     * 
     */
    private final DatabaseDumpResponse databaseDump;
    /**
     * The description of the metadata import.
     * 
     */
    private final String description;
    /**
     * The time when the metadata import finished.
     * 
     */
    private final String endTime;
    /**
     * Immutable. The relative resource name of the metadata import, of the form:projects/{project_number}/locations/{location_id}/services/{service_id}/metadataImports/{metadata_import_id}.
     * 
     */
    private final String name;
    /**
     * The current state of the metadata import.
     * 
     */
    private final String state;
    /**
     * The time when the metadata import was last updated.
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor
    private GetMetadataImportResult(
        @OutputCustomType.Parameter("createTime") String createTime,
        @OutputCustomType.Parameter("databaseDump") DatabaseDumpResponse databaseDump,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("endTime") String endTime,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("state") String state,
        @OutputCustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.databaseDump = databaseDump;
        this.description = description;
        this.endTime = endTime;
        this.name = name;
        this.state = state;
        this.updateTime = updateTime;
    }

    /**
     * The time when the metadata import was started.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Immutable. A database dump from a pre-existing metastore's database.
     * 
    */
    public DatabaseDumpResponse getDatabaseDump() {
        return this.databaseDump;
    }
    /**
     * The description of the metadata import.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The time when the metadata import finished.
     * 
    */
    public String getEndTime() {
        return this.endTime;
    }
    /**
     * Immutable. The relative resource name of the metadata import, of the form:projects/{project_number}/locations/{location_id}/services/{service_id}/metadataImports/{metadata_import_id}.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The current state of the metadata import.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * The time when the metadata import was last updated.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMetadataImportResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private DatabaseDumpResponse databaseDump;
        private String description;
        private String endTime;
        private String name;
        private String state;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMetadataImportResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.databaseDump = defaults.databaseDump;
    	      this.description = defaults.description;
    	      this.endTime = defaults.endTime;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDatabaseDump(DatabaseDumpResponse databaseDump) {
            this.databaseDump = Objects.requireNonNull(databaseDump);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetMetadataImportResult build() {
            return new GetMetadataImportResult(createTime, databaseDump, description, endTime, name, state, updateTime);
        }
    }
}
