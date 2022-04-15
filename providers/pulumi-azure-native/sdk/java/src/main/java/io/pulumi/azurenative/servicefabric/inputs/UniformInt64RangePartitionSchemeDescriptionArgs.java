// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a partitioning scheme where an integer range is allocated evenly across a number of partitions.
 * 
 */
public final class UniformInt64RangePartitionSchemeDescriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final UniformInt64RangePartitionSchemeDescriptionArgs Empty = new UniformInt64RangePartitionSchemeDescriptionArgs();

    /**
     * The number of partitions.
     * 
     */
    @Import(name="count", required=true)
      private final Output<Integer> count;

    public Output<Integer> count() {
        return this.count;
    }

    /**
     * String indicating the upper bound of the partition key range that
     * should be split between the partition ‘count’
     * 
     */
    @Import(name="highKey", required=true)
      private final Output<String> highKey;

    public Output<String> highKey() {
        return this.highKey;
    }

    /**
     * String indicating the lower bound of the partition key range that
     * should be split between the partition ‘count’
     * 
     */
    @Import(name="lowKey", required=true)
      private final Output<String> lowKey;

    public Output<String> lowKey() {
        return this.lowKey;
    }

    /**
     * Enumerates the ways that a service can be partitioned.
     * Expected value is 'UniformInt64Range'.
     * 
     */
    @Import(name="partitionScheme", required=true)
      private final Output<String> partitionScheme;

    public Output<String> partitionScheme() {
        return this.partitionScheme;
    }

    public UniformInt64RangePartitionSchemeDescriptionArgs(
        Output<Integer> count,
        Output<String> highKey,
        Output<String> lowKey,
        Output<String> partitionScheme) {
        this.count = Objects.requireNonNull(count, "expected parameter 'count' to be non-null");
        this.highKey = Objects.requireNonNull(highKey, "expected parameter 'highKey' to be non-null");
        this.lowKey = Objects.requireNonNull(lowKey, "expected parameter 'lowKey' to be non-null");
        this.partitionScheme = Objects.requireNonNull(partitionScheme, "expected parameter 'partitionScheme' to be non-null");
    }

    private UniformInt64RangePartitionSchemeDescriptionArgs() {
        this.count = Codegen.empty();
        this.highKey = Codegen.empty();
        this.lowKey = Codegen.empty();
        this.partitionScheme = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UniformInt64RangePartitionSchemeDescriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> count;
        private Output<String> highKey;
        private Output<String> lowKey;
        private Output<String> partitionScheme;

        public Builder() {
    	      // Empty
        }

        public Builder(UniformInt64RangePartitionSchemeDescriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.highKey = defaults.highKey;
    	      this.lowKey = defaults.lowKey;
    	      this.partitionScheme = defaults.partitionScheme;
        }

        public Builder count(Output<Integer> count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        public Builder count(Integer count) {
            this.count = Output.of(Objects.requireNonNull(count));
            return this;
        }
        public Builder highKey(Output<String> highKey) {
            this.highKey = Objects.requireNonNull(highKey);
            return this;
        }
        public Builder highKey(String highKey) {
            this.highKey = Output.of(Objects.requireNonNull(highKey));
            return this;
        }
        public Builder lowKey(Output<String> lowKey) {
            this.lowKey = Objects.requireNonNull(lowKey);
            return this;
        }
        public Builder lowKey(String lowKey) {
            this.lowKey = Output.of(Objects.requireNonNull(lowKey));
            return this;
        }
        public Builder partitionScheme(Output<String> partitionScheme) {
            this.partitionScheme = Objects.requireNonNull(partitionScheme);
            return this;
        }
        public Builder partitionScheme(String partitionScheme) {
            this.partitionScheme = Output.of(Objects.requireNonNull(partitionScheme));
            return this;
        }        public UniformInt64RangePartitionSchemeDescriptionArgs build() {
            return new UniformInt64RangePartitionSchemeDescriptionArgs(count, highKey, lowKey, partitionScheme);
        }
    }
}
