// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.AzureDataLakeSectionResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.AzureMySqlSectionResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.AzurePostgreSqlSectionResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.AzureSqlDatabaseSectionResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.AzureStorageSectionResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.GlusterFsSectionResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.LinkedInfoResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.UserInfoResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatastoreResponse {
    private final @Nullable AzureDataLakeSectionResponse azureDataLakeSection;
    private final @Nullable AzureMySqlSectionResponse azureMySqlSection;
    private final @Nullable AzurePostgreSqlSectionResponse azurePostgreSqlSection;
    private final @Nullable AzureSqlDatabaseSectionResponse azureSqlDatabaseSection;
    private final @Nullable AzureStorageSectionResponse azureStorageSection;
    /**
     * The User who created the datastore.
     * 
     */
    private final UserInfoResponse createdBy;
    /**
     * The date and time when the datastore was created.
     * 
     */
    private final String createdTime;
    /**
     * The datastore type.
     * 
     */
    private final @Nullable String dataStoreType;
    /**
     * Description of the datastore.
     * 
     */
    private final @Nullable String description;
    /**
     * Data specific to GlusterFS.
     * 
     */
    private final @Nullable GlusterFsSectionResponse glusterFsSection;
    /**
     * A read only property that denotes whether the service datastore has been validated with credentials.
     * 
     */
    private final @Nullable Boolean hasBeenValidated;
    /**
     * Info about origin if it is linked.
     * 
     */
    private final @Nullable LinkedInfoResponse linkedInfo;
    /**
     * The User who modified the datastore.
     * 
     */
    private final UserInfoResponse modifiedBy;
    /**
     * The date and time when the datastore was last modified.
     * 
     */
    private final String modifiedTime;
    /**
     * Name of the datastore.
     * 
     */
    private final @Nullable String name;
    /**
     * Tags for this datastore.
     * 
     */
    private final Map<String,String> tags;

    @CustomType.Constructor
    private DatastoreResponse(
        @CustomType.Parameter("azureDataLakeSection") @Nullable AzureDataLakeSectionResponse azureDataLakeSection,
        @CustomType.Parameter("azureMySqlSection") @Nullable AzureMySqlSectionResponse azureMySqlSection,
        @CustomType.Parameter("azurePostgreSqlSection") @Nullable AzurePostgreSqlSectionResponse azurePostgreSqlSection,
        @CustomType.Parameter("azureSqlDatabaseSection") @Nullable AzureSqlDatabaseSectionResponse azureSqlDatabaseSection,
        @CustomType.Parameter("azureStorageSection") @Nullable AzureStorageSectionResponse azureStorageSection,
        @CustomType.Parameter("createdBy") UserInfoResponse createdBy,
        @CustomType.Parameter("createdTime") String createdTime,
        @CustomType.Parameter("dataStoreType") @Nullable String dataStoreType,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("glusterFsSection") @Nullable GlusterFsSectionResponse glusterFsSection,
        @CustomType.Parameter("hasBeenValidated") @Nullable Boolean hasBeenValidated,
        @CustomType.Parameter("linkedInfo") @Nullable LinkedInfoResponse linkedInfo,
        @CustomType.Parameter("modifiedBy") UserInfoResponse modifiedBy,
        @CustomType.Parameter("modifiedTime") String modifiedTime,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("tags") Map<String,String> tags) {
        this.azureDataLakeSection = azureDataLakeSection;
        this.azureMySqlSection = azureMySqlSection;
        this.azurePostgreSqlSection = azurePostgreSqlSection;
        this.azureSqlDatabaseSection = azureSqlDatabaseSection;
        this.azureStorageSection = azureStorageSection;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.dataStoreType = dataStoreType;
        this.description = description;
        this.glusterFsSection = glusterFsSection;
        this.hasBeenValidated = hasBeenValidated;
        this.linkedInfo = linkedInfo;
        this.modifiedBy = modifiedBy;
        this.modifiedTime = modifiedTime;
        this.name = name;
        this.tags = tags;
    }

    public Optional<AzureDataLakeSectionResponse> azureDataLakeSection() {
        return Optional.ofNullable(this.azureDataLakeSection);
    }
    public Optional<AzureMySqlSectionResponse> azureMySqlSection() {
        return Optional.ofNullable(this.azureMySqlSection);
    }
    public Optional<AzurePostgreSqlSectionResponse> azurePostgreSqlSection() {
        return Optional.ofNullable(this.azurePostgreSqlSection);
    }
    public Optional<AzureSqlDatabaseSectionResponse> azureSqlDatabaseSection() {
        return Optional.ofNullable(this.azureSqlDatabaseSection);
    }
    public Optional<AzureStorageSectionResponse> azureStorageSection() {
        return Optional.ofNullable(this.azureStorageSection);
    }
    /**
     * The User who created the datastore.
     * 
    */
    public UserInfoResponse createdBy() {
        return this.createdBy;
    }
    /**
     * The date and time when the datastore was created.
     * 
    */
    public String createdTime() {
        return this.createdTime;
    }
    /**
     * The datastore type.
     * 
    */
    public Optional<String> dataStoreType() {
        return Optional.ofNullable(this.dataStoreType);
    }
    /**
     * Description of the datastore.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Data specific to GlusterFS.
     * 
    */
    public Optional<GlusterFsSectionResponse> glusterFsSection() {
        return Optional.ofNullable(this.glusterFsSection);
    }
    /**
     * A read only property that denotes whether the service datastore has been validated with credentials.
     * 
    */
    public Optional<Boolean> hasBeenValidated() {
        return Optional.ofNullable(this.hasBeenValidated);
    }
    /**
     * Info about origin if it is linked.
     * 
    */
    public Optional<LinkedInfoResponse> linkedInfo() {
        return Optional.ofNullable(this.linkedInfo);
    }
    /**
     * The User who modified the datastore.
     * 
    */
    public UserInfoResponse modifiedBy() {
        return this.modifiedBy;
    }
    /**
     * The date and time when the datastore was last modified.
     * 
    */
    public String modifiedTime() {
        return this.modifiedTime;
    }
    /**
     * Name of the datastore.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Tags for this datastore.
     * 
    */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatastoreResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AzureDataLakeSectionResponse azureDataLakeSection;
        private @Nullable AzureMySqlSectionResponse azureMySqlSection;
        private @Nullable AzurePostgreSqlSectionResponse azurePostgreSqlSection;
        private @Nullable AzureSqlDatabaseSectionResponse azureSqlDatabaseSection;
        private @Nullable AzureStorageSectionResponse azureStorageSection;
        private UserInfoResponse createdBy;
        private String createdTime;
        private @Nullable String dataStoreType;
        private @Nullable String description;
        private @Nullable GlusterFsSectionResponse glusterFsSection;
        private @Nullable Boolean hasBeenValidated;
        private @Nullable LinkedInfoResponse linkedInfo;
        private UserInfoResponse modifiedBy;
        private String modifiedTime;
        private @Nullable String name;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DatastoreResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureDataLakeSection = defaults.azureDataLakeSection;
    	      this.azureMySqlSection = defaults.azureMySqlSection;
    	      this.azurePostgreSqlSection = defaults.azurePostgreSqlSection;
    	      this.azureSqlDatabaseSection = defaults.azureSqlDatabaseSection;
    	      this.azureStorageSection = defaults.azureStorageSection;
    	      this.createdBy = defaults.createdBy;
    	      this.createdTime = defaults.createdTime;
    	      this.dataStoreType = defaults.dataStoreType;
    	      this.description = defaults.description;
    	      this.glusterFsSection = defaults.glusterFsSection;
    	      this.hasBeenValidated = defaults.hasBeenValidated;
    	      this.linkedInfo = defaults.linkedInfo;
    	      this.modifiedBy = defaults.modifiedBy;
    	      this.modifiedTime = defaults.modifiedTime;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder azureDataLakeSection(@Nullable AzureDataLakeSectionResponse azureDataLakeSection) {
            this.azureDataLakeSection = azureDataLakeSection;
            return this;
        }
        public Builder azureMySqlSection(@Nullable AzureMySqlSectionResponse azureMySqlSection) {
            this.azureMySqlSection = azureMySqlSection;
            return this;
        }
        public Builder azurePostgreSqlSection(@Nullable AzurePostgreSqlSectionResponse azurePostgreSqlSection) {
            this.azurePostgreSqlSection = azurePostgreSqlSection;
            return this;
        }
        public Builder azureSqlDatabaseSection(@Nullable AzureSqlDatabaseSectionResponse azureSqlDatabaseSection) {
            this.azureSqlDatabaseSection = azureSqlDatabaseSection;
            return this;
        }
        public Builder azureStorageSection(@Nullable AzureStorageSectionResponse azureStorageSection) {
            this.azureStorageSection = azureStorageSection;
            return this;
        }
        public Builder createdBy(UserInfoResponse createdBy) {
            this.createdBy = Objects.requireNonNull(createdBy);
            return this;
        }
        public Builder createdTime(String createdTime) {
            this.createdTime = Objects.requireNonNull(createdTime);
            return this;
        }
        public Builder dataStoreType(@Nullable String dataStoreType) {
            this.dataStoreType = dataStoreType;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder glusterFsSection(@Nullable GlusterFsSectionResponse glusterFsSection) {
            this.glusterFsSection = glusterFsSection;
            return this;
        }
        public Builder hasBeenValidated(@Nullable Boolean hasBeenValidated) {
            this.hasBeenValidated = hasBeenValidated;
            return this;
        }
        public Builder linkedInfo(@Nullable LinkedInfoResponse linkedInfo) {
            this.linkedInfo = linkedInfo;
            return this;
        }
        public Builder modifiedBy(UserInfoResponse modifiedBy) {
            this.modifiedBy = Objects.requireNonNull(modifiedBy);
            return this;
        }
        public Builder modifiedTime(String modifiedTime) {
            this.modifiedTime = Objects.requireNonNull(modifiedTime);
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public DatastoreResponse build() {
            return new DatastoreResponse(azureDataLakeSection, azureMySqlSection, azurePostgreSqlSection, azureSqlDatabaseSection, azureStorageSection, createdBy, createdTime, dataStoreType, description, glusterFsSection, hasBeenValidated, linkedInfo, modifiedBy, modifiedTime, name, tags);
        }
    }
}
