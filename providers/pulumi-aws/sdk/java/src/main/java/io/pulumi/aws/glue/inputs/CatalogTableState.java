// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.aws.glue.inputs.CatalogTablePartitionIndexGetArgs;
import io.pulumi.aws.glue.inputs.CatalogTablePartitionKeyGetArgs;
import io.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorGetArgs;
import io.pulumi.aws.glue.inputs.CatalogTableTargetTableGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CatalogTableState extends io.pulumi.resources.ResourceArgs {

    public static final CatalogTableState Empty = new CatalogTableState();

    /**
     * The ARN of the Glue Table.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * ID of the Data Catalog in which the table resides.
     * 
     */
    @InputImport(name="catalogId")
      private final @Nullable Input<String> catalogId;

    public Input<String> getCatalogId() {
        return this.catalogId == null ? Input.empty() : this.catalogId;
    }

    /**
     * Name of the catalog database that contains the target table.
     * 
     */
    @InputImport(name="databaseName")
      private final @Nullable Input<String> databaseName;

    public Input<String> getDatabaseName() {
        return this.databaseName == null ? Input.empty() : this.databaseName;
    }

    /**
     * Description of the table.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Name of the target table.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Owner of the table.
     * 
     */
    @InputImport(name="owner")
      private final @Nullable Input<String> owner;

    public Input<String> getOwner() {
        return this.owner == null ? Input.empty() : this.owner;
    }

    /**
     * Map of initialization parameters for the SerDe, in key-value form.
     * 
     */
    @InputImport(name="parameters")
      private final @Nullable Input<Map<String,String>> parameters;

    public Input<Map<String,String>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * Configuration block for a maximum of 3 partition indexes. See `partition_index` below.
     * 
     */
    @InputImport(name="partitionIndices")
      private final @Nullable Input<List<CatalogTablePartitionIndexGetArgs>> partitionIndices;

    public Input<List<CatalogTablePartitionIndexGetArgs>> getPartitionIndices() {
        return this.partitionIndices == null ? Input.empty() : this.partitionIndices;
    }

    /**
     * Configuration block of columns by which the table is partitioned. Only primitive types are supported as partition keys. See `partition_keys` below.
     * 
     */
    @InputImport(name="partitionKeys")
      private final @Nullable Input<List<CatalogTablePartitionKeyGetArgs>> partitionKeys;

    public Input<List<CatalogTablePartitionKeyGetArgs>> getPartitionKeys() {
        return this.partitionKeys == null ? Input.empty() : this.partitionKeys;
    }

    /**
     * Retention time for this table.
     * 
     */
    @InputImport(name="retention")
      private final @Nullable Input<Integer> retention;

    public Input<Integer> getRetention() {
        return this.retention == null ? Input.empty() : this.retention;
    }

    /**
     * Configuration block for information about the physical storage of this table. For more information, refer to the [Glue Developer Guide](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-tables.html#aws-glue-api-catalog-tables-StorageDescriptor). See `storage_descriptor` below.
     * 
     */
    @InputImport(name="storageDescriptor")
      private final @Nullable Input<CatalogTableStorageDescriptorGetArgs> storageDescriptor;

    public Input<CatalogTableStorageDescriptorGetArgs> getStorageDescriptor() {
        return this.storageDescriptor == null ? Input.empty() : this.storageDescriptor;
    }

    /**
     * Type of this table (EXTERNAL_TABLE, VIRTUAL_VIEW, etc.). While optional, some Athena DDL queries such as `ALTER TABLE` and `SHOW CREATE TABLE` will fail if this argument is empty.
     * 
     */
    @InputImport(name="tableType")
      private final @Nullable Input<String> tableType;

    public Input<String> getTableType() {
        return this.tableType == null ? Input.empty() : this.tableType;
    }

    /**
     * Configuration block of a target table for resource linking. See `target_table` below.
     * 
     */
    @InputImport(name="targetTable")
      private final @Nullable Input<CatalogTableTargetTableGetArgs> targetTable;

    public Input<CatalogTableTargetTableGetArgs> getTargetTable() {
        return this.targetTable == null ? Input.empty() : this.targetTable;
    }

    /**
     * If the table is a view, the expanded text of the view; otherwise null.
     * 
     */
    @InputImport(name="viewExpandedText")
      private final @Nullable Input<String> viewExpandedText;

    public Input<String> getViewExpandedText() {
        return this.viewExpandedText == null ? Input.empty() : this.viewExpandedText;
    }

    /**
     * If the table is a view, the original text of the view; otherwise null.
     * 
     */
    @InputImport(name="viewOriginalText")
      private final @Nullable Input<String> viewOriginalText;

    public Input<String> getViewOriginalText() {
        return this.viewOriginalText == null ? Input.empty() : this.viewOriginalText;
    }

    public CatalogTableState(
        @Nullable Input<String> arn,
        @Nullable Input<String> catalogId,
        @Nullable Input<String> databaseName,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<String> owner,
        @Nullable Input<Map<String,String>> parameters,
        @Nullable Input<List<CatalogTablePartitionIndexGetArgs>> partitionIndices,
        @Nullable Input<List<CatalogTablePartitionKeyGetArgs>> partitionKeys,
        @Nullable Input<Integer> retention,
        @Nullable Input<CatalogTableStorageDescriptorGetArgs> storageDescriptor,
        @Nullable Input<String> tableType,
        @Nullable Input<CatalogTableTargetTableGetArgs> targetTable,
        @Nullable Input<String> viewExpandedText,
        @Nullable Input<String> viewOriginalText) {
        this.arn = arn;
        this.catalogId = catalogId;
        this.databaseName = databaseName;
        this.description = description;
        this.name = name;
        this.owner = owner;
        this.parameters = parameters;
        this.partitionIndices = partitionIndices;
        this.partitionKeys = partitionKeys;
        this.retention = retention;
        this.storageDescriptor = storageDescriptor;
        this.tableType = tableType;
        this.targetTable = targetTable;
        this.viewExpandedText = viewExpandedText;
        this.viewOriginalText = viewOriginalText;
    }

    private CatalogTableState() {
        this.arn = Input.empty();
        this.catalogId = Input.empty();
        this.databaseName = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.owner = Input.empty();
        this.parameters = Input.empty();
        this.partitionIndices = Input.empty();
        this.partitionKeys = Input.empty();
        this.retention = Input.empty();
        this.storageDescriptor = Input.empty();
        this.tableType = Input.empty();
        this.targetTable = Input.empty();
        this.viewExpandedText = Input.empty();
        this.viewOriginalText = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CatalogTableState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> catalogId;
        private @Nullable Input<String> databaseName;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<String> owner;
        private @Nullable Input<Map<String,String>> parameters;
        private @Nullable Input<List<CatalogTablePartitionIndexGetArgs>> partitionIndices;
        private @Nullable Input<List<CatalogTablePartitionKeyGetArgs>> partitionKeys;
        private @Nullable Input<Integer> retention;
        private @Nullable Input<CatalogTableStorageDescriptorGetArgs> storageDescriptor;
        private @Nullable Input<String> tableType;
        private @Nullable Input<CatalogTableTargetTableGetArgs> targetTable;
        private @Nullable Input<String> viewExpandedText;
        private @Nullable Input<String> viewOriginalText;

        public Builder() {
    	      // Empty
        }

        public Builder(CatalogTableState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.catalogId = defaults.catalogId;
    	      this.databaseName = defaults.databaseName;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.owner = defaults.owner;
    	      this.parameters = defaults.parameters;
    	      this.partitionIndices = defaults.partitionIndices;
    	      this.partitionKeys = defaults.partitionKeys;
    	      this.retention = defaults.retention;
    	      this.storageDescriptor = defaults.storageDescriptor;
    	      this.tableType = defaults.tableType;
    	      this.targetTable = defaults.targetTable;
    	      this.viewExpandedText = defaults.viewExpandedText;
    	      this.viewOriginalText = defaults.viewOriginalText;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setCatalogId(@Nullable Input<String> catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        public Builder setCatalogId(@Nullable String catalogId) {
            this.catalogId = Input.ofNullable(catalogId);
            return this;
        }

        public Builder setDatabaseName(@Nullable Input<String> databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        public Builder setDatabaseName(@Nullable String databaseName) {
            this.databaseName = Input.ofNullable(databaseName);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
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

        public Builder setOwner(@Nullable Input<String> owner) {
            this.owner = owner;
            return this;
        }

        public Builder setOwner(@Nullable String owner) {
            this.owner = Input.ofNullable(owner);
            return this;
        }

        public Builder setParameters(@Nullable Input<Map<String,String>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,String> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder setPartitionIndices(@Nullable Input<List<CatalogTablePartitionIndexGetArgs>> partitionIndices) {
            this.partitionIndices = partitionIndices;
            return this;
        }

        public Builder setPartitionIndices(@Nullable List<CatalogTablePartitionIndexGetArgs> partitionIndices) {
            this.partitionIndices = Input.ofNullable(partitionIndices);
            return this;
        }

        public Builder setPartitionKeys(@Nullable Input<List<CatalogTablePartitionKeyGetArgs>> partitionKeys) {
            this.partitionKeys = partitionKeys;
            return this;
        }

        public Builder setPartitionKeys(@Nullable List<CatalogTablePartitionKeyGetArgs> partitionKeys) {
            this.partitionKeys = Input.ofNullable(partitionKeys);
            return this;
        }

        public Builder setRetention(@Nullable Input<Integer> retention) {
            this.retention = retention;
            return this;
        }

        public Builder setRetention(@Nullable Integer retention) {
            this.retention = Input.ofNullable(retention);
            return this;
        }

        public Builder setStorageDescriptor(@Nullable Input<CatalogTableStorageDescriptorGetArgs> storageDescriptor) {
            this.storageDescriptor = storageDescriptor;
            return this;
        }

        public Builder setStorageDescriptor(@Nullable CatalogTableStorageDescriptorGetArgs storageDescriptor) {
            this.storageDescriptor = Input.ofNullable(storageDescriptor);
            return this;
        }

        public Builder setTableType(@Nullable Input<String> tableType) {
            this.tableType = tableType;
            return this;
        }

        public Builder setTableType(@Nullable String tableType) {
            this.tableType = Input.ofNullable(tableType);
            return this;
        }

        public Builder setTargetTable(@Nullable Input<CatalogTableTargetTableGetArgs> targetTable) {
            this.targetTable = targetTable;
            return this;
        }

        public Builder setTargetTable(@Nullable CatalogTableTargetTableGetArgs targetTable) {
            this.targetTable = Input.ofNullable(targetTable);
            return this;
        }

        public Builder setViewExpandedText(@Nullable Input<String> viewExpandedText) {
            this.viewExpandedText = viewExpandedText;
            return this;
        }

        public Builder setViewExpandedText(@Nullable String viewExpandedText) {
            this.viewExpandedText = Input.ofNullable(viewExpandedText);
            return this;
        }

        public Builder setViewOriginalText(@Nullable Input<String> viewOriginalText) {
            this.viewOriginalText = viewOriginalText;
            return this;
        }

        public Builder setViewOriginalText(@Nullable String viewOriginalText) {
            this.viewOriginalText = Input.ofNullable(viewOriginalText);
            return this;
        }
        public CatalogTableState build() {
            return new CatalogTableState(arn, catalogId, databaseName, description, name, owner, parameters, partitionIndices, partitionKeys, retention, storageDescriptor, tableType, targetTable, viewExpandedText, viewOriginalText);
        }
    }
}
