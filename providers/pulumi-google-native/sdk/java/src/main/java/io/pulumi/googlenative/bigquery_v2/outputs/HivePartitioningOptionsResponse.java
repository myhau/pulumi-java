// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class HivePartitioningOptionsResponse {
    /**
     * [Optional] When set, what mode of hive partitioning to use when reading data. The following modes are supported. (1) AUTO: automatically infer partition key name(s) and type(s). (2) STRINGS: automatically infer partition key name(s). All types are interpreted as strings. (3) CUSTOM: partition key schema is encoded in the source URI prefix. Not all storage formats support hive partitioning. Requesting hive partitioning on an unsupported format will lead to an error. Currently supported types include: AVRO, CSV, JSON, ORC and Parquet.
     * 
     */
    private final String mode;
    /**
     * [Optional] If set to true, queries over this table require a partition filter that can be used for partition elimination to be specified. Note that this field should only be true when creating a permanent external table or querying a temporary external table. Hive-partitioned loads with requirePartitionFilter explicitly set to true will fail.
     * 
     */
    private final Boolean requirePartitionFilter;
    /**
     * [Optional] When hive partition detection is requested, a common prefix for all source uris should be supplied. The prefix must end immediately before the partition key encoding begins. For example, consider files following this data layout. gs://bucket/path_to_table/dt=2019-01-01/country=BR/id=7/file.avro gs://bucket/path_to_table/dt=2018-12-31/country=CA/id=3/file.avro When hive partitioning is requested with either AUTO or STRINGS detection, the common prefix can be either of gs://bucket/path_to_table or gs://bucket/path_to_table/ (trailing slash does not matter).
     * 
     */
    private final String sourceUriPrefix;

    @OutputCustomType.Constructor({"mode","requirePartitionFilter","sourceUriPrefix"})
    private HivePartitioningOptionsResponse(
        String mode,
        Boolean requirePartitionFilter,
        String sourceUriPrefix) {
        this.mode = mode;
        this.requirePartitionFilter = requirePartitionFilter;
        this.sourceUriPrefix = sourceUriPrefix;
    }

    /**
     * [Optional] When set, what mode of hive partitioning to use when reading data. The following modes are supported. (1) AUTO: automatically infer partition key name(s) and type(s). (2) STRINGS: automatically infer partition key name(s). All types are interpreted as strings. (3) CUSTOM: partition key schema is encoded in the source URI prefix. Not all storage formats support hive partitioning. Requesting hive partitioning on an unsupported format will lead to an error. Currently supported types include: AVRO, CSV, JSON, ORC and Parquet.
     * 
    */
    public String getMode() {
        return this.mode;
    }
    /**
     * [Optional] If set to true, queries over this table require a partition filter that can be used for partition elimination to be specified. Note that this field should only be true when creating a permanent external table or querying a temporary external table. Hive-partitioned loads with requirePartitionFilter explicitly set to true will fail.
     * 
    */
    public Boolean getRequirePartitionFilter() {
        return this.requirePartitionFilter;
    }
    /**
     * [Optional] When hive partition detection is requested, a common prefix for all source uris should be supplied. The prefix must end immediately before the partition key encoding begins. For example, consider files following this data layout. gs://bucket/path_to_table/dt=2019-01-01/country=BR/id=7/file.avro gs://bucket/path_to_table/dt=2018-12-31/country=CA/id=3/file.avro When hive partitioning is requested with either AUTO or STRINGS detection, the common prefix can be either of gs://bucket/path_to_table or gs://bucket/path_to_table/ (trailing slash does not matter).
     * 
    */
    public String getSourceUriPrefix() {
        return this.sourceUriPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HivePartitioningOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mode;
        private Boolean requirePartitionFilter;
        private String sourceUriPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(HivePartitioningOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.requirePartitionFilter = defaults.requirePartitionFilter;
    	      this.sourceUriPrefix = defaults.sourceUriPrefix;
        }

        public Builder setMode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }

        public Builder setRequirePartitionFilter(Boolean requirePartitionFilter) {
            this.requirePartitionFilter = Objects.requireNonNull(requirePartitionFilter);
            return this;
        }

        public Builder setSourceUriPrefix(String sourceUriPrefix) {
            this.sourceUriPrefix = Objects.requireNonNull(sourceUriPrefix);
            return this;
        }
        public HivePartitioningOptionsResponse build() {
            return new HivePartitioningOptionsResponse(mode, requirePartitionFilter, sourceUriPrefix);
        }
    }
}
