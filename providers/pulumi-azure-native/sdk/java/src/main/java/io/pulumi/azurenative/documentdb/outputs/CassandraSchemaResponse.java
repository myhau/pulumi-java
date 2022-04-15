// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.azurenative.documentdb.outputs.CassandraPartitionKeyResponse;
import io.pulumi.azurenative.documentdb.outputs.ClusterKeyResponse;
import io.pulumi.azurenative.documentdb.outputs.ColumnResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class CassandraSchemaResponse {
    /**
     * List of cluster key.
     * 
     */
    private final @Nullable List<ClusterKeyResponse> clusterKeys;
    /**
     * List of Cassandra table columns.
     * 
     */
    private final @Nullable List<ColumnResponse> columns;
    /**
     * List of partition key.
     * 
     */
    private final @Nullable List<CassandraPartitionKeyResponse> partitionKeys;

    @CustomType.Constructor
    private CassandraSchemaResponse(
        @CustomType.Parameter("clusterKeys") @Nullable List<ClusterKeyResponse> clusterKeys,
        @CustomType.Parameter("columns") @Nullable List<ColumnResponse> columns,
        @CustomType.Parameter("partitionKeys") @Nullable List<CassandraPartitionKeyResponse> partitionKeys) {
        this.clusterKeys = clusterKeys;
        this.columns = columns;
        this.partitionKeys = partitionKeys;
    }

    /**
     * List of cluster key.
     * 
    */
    public List<ClusterKeyResponse> clusterKeys() {
        return this.clusterKeys == null ? List.of() : this.clusterKeys;
    }
    /**
     * List of Cassandra table columns.
     * 
    */
    public List<ColumnResponse> columns() {
        return this.columns == null ? List.of() : this.columns;
    }
    /**
     * List of partition key.
     * 
    */
    public List<CassandraPartitionKeyResponse> partitionKeys() {
        return this.partitionKeys == null ? List.of() : this.partitionKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CassandraSchemaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ClusterKeyResponse> clusterKeys;
        private @Nullable List<ColumnResponse> columns;
        private @Nullable List<CassandraPartitionKeyResponse> partitionKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(CassandraSchemaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterKeys = defaults.clusterKeys;
    	      this.columns = defaults.columns;
    	      this.partitionKeys = defaults.partitionKeys;
        }

        public Builder clusterKeys(@Nullable List<ClusterKeyResponse> clusterKeys) {
            this.clusterKeys = clusterKeys;
            return this;
        }
        public Builder clusterKeys(ClusterKeyResponse... clusterKeys) {
            return clusterKeys(List.of(clusterKeys));
        }
        public Builder columns(@Nullable List<ColumnResponse> columns) {
            this.columns = columns;
            return this;
        }
        public Builder columns(ColumnResponse... columns) {
            return columns(List.of(columns));
        }
        public Builder partitionKeys(@Nullable List<CassandraPartitionKeyResponse> partitionKeys) {
            this.partitionKeys = partitionKeys;
            return this;
        }
        public Builder partitionKeys(CassandraPartitionKeyResponse... partitionKeys) {
            return partitionKeys(List.of(partitionKeys));
        }        public CassandraSchemaResponse build() {
            return new CassandraSchemaResponse(clusterKeys, columns, partitionKeys);
        }
    }
}
