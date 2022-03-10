// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PartitionStorageDescriptorSortColumn {
    /**
     * The name of the column.
     * 
     */
    private final String column;
    /**
     * Indicates that the column is sorted in ascending order (== 1), or in descending order (==0).
     * 
     */
    private final Integer sortOrder;

    @OutputCustomType.Constructor({"column","sortOrder"})
    private PartitionStorageDescriptorSortColumn(
        String column,
        Integer sortOrder) {
        this.column = column;
        this.sortOrder = sortOrder;
    }

    /**
     * The name of the column.
     * 
    */
    public String getColumn() {
        return this.column;
    }
    /**
     * Indicates that the column is sorted in ascending order (== 1), or in descending order (==0).
     * 
    */
    public Integer getSortOrder() {
        return this.sortOrder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PartitionStorageDescriptorSortColumn defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String column;
        private Integer sortOrder;

        public Builder() {
    	      // Empty
        }

        public Builder(PartitionStorageDescriptorSortColumn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.column = defaults.column;
    	      this.sortOrder = defaults.sortOrder;
        }

        public Builder setColumn(String column) {
            this.column = Objects.requireNonNull(column);
            return this;
        }

        public Builder setSortOrder(Integer sortOrder) {
            this.sortOrder = Objects.requireNonNull(sortOrder);
            return this;
        }
        public PartitionStorageDescriptorSortColumn build() {
            return new PartitionStorageDescriptorSortColumn(column, sortOrder);
        }
    }
}