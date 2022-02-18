// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableTimePartitioningGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableTimePartitioningGetArgs Empty = new TableTimePartitioningGetArgs();

    /**
     * Number of milliseconds for which to keep the
     * storage for a partition.
     * 
     */
    @InputImport(name="expirationMs")
    private final @Nullable Input<Integer> expirationMs;

    public Input<Integer> getExpirationMs() {
        return this.expirationMs == null ? Input.empty() : this.expirationMs;
    }

    /**
     * The field used to determine how to create a range-based
     * partition.
     * 
     */
    @InputImport(name="field")
    private final @Nullable Input<String> field;

    public Input<String> getField() {
        return this.field == null ? Input.empty() : this.field;
    }

    /**
     * If set to true, queries over this table
     * require a partition filter that can be used for partition elimination to be
     * specified.
     * 
     */
    @InputImport(name="requirePartitionFilter")
    private final @Nullable Input<Boolean> requirePartitionFilter;

    public Input<Boolean> getRequirePartitionFilter() {
        return this.requirePartitionFilter == null ? Input.empty() : this.requirePartitionFilter;
    }

    /**
     * The supported types are DAY, HOUR, MONTH, and YEAR,
     * which will generate one partition per day, hour, month, and year, respectively.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public TableTimePartitioningGetArgs(
        @Nullable Input<Integer> expirationMs,
        @Nullable Input<String> field,
        @Nullable Input<Boolean> requirePartitionFilter,
        Input<String> type) {
        this.expirationMs = expirationMs;
        this.field = field;
        this.requirePartitionFilter = requirePartitionFilter;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private TableTimePartitioningGetArgs() {
        this.expirationMs = Input.empty();
        this.field = Input.empty();
        this.requirePartitionFilter = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableTimePartitioningGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> expirationMs;
        private @Nullable Input<String> field;
        private @Nullable Input<Boolean> requirePartitionFilter;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(TableTimePartitioningGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationMs = defaults.expirationMs;
    	      this.field = defaults.field;
    	      this.requirePartitionFilter = defaults.requirePartitionFilter;
    	      this.type = defaults.type;
        }

        public Builder setExpirationMs(@Nullable Input<Integer> expirationMs) {
            this.expirationMs = expirationMs;
            return this;
        }

        public Builder setExpirationMs(@Nullable Integer expirationMs) {
            this.expirationMs = Input.ofNullable(expirationMs);
            return this;
        }

        public Builder setField(@Nullable Input<String> field) {
            this.field = field;
            return this;
        }

        public Builder setField(@Nullable String field) {
            this.field = Input.ofNullable(field);
            return this;
        }

        public Builder setRequirePartitionFilter(@Nullable Input<Boolean> requirePartitionFilter) {
            this.requirePartitionFilter = requirePartitionFilter;
            return this;
        }

        public Builder setRequirePartitionFilter(@Nullable Boolean requirePartitionFilter) {
            this.requirePartitionFilter = Input.ofNullable(requirePartitionFilter);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public TableTimePartitioningGetArgs build() {
            return new TableTimePartitioningGetArgs(expirationMs, field, requirePartitionFilter, type);
        }
    }
}
