// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.azurenative.documentdb.inputs.CassandraSchemaArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Cosmos DB Cassandra table resource object
 * 
 */
public final class CassandraTableResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final CassandraTableResourceArgs Empty = new CassandraTableResourceArgs();

    /**
     * Analytical TTL.
     * 
     */
    @Import(name="analyticalStorageTtl")
      private final @Nullable Output<Integer> analyticalStorageTtl;

    public Output<Integer> analyticalStorageTtl() {
        return this.analyticalStorageTtl == null ? Codegen.empty() : this.analyticalStorageTtl;
    }

    /**
     * Time to live of the Cosmos DB Cassandra table
     * 
     */
    @Import(name="defaultTtl")
      private final @Nullable Output<Integer> defaultTtl;

    public Output<Integer> defaultTtl() {
        return this.defaultTtl == null ? Codegen.empty() : this.defaultTtl;
    }

    /**
     * Name of the Cosmos DB Cassandra table
     * 
     */
    @Import(name="id", required=true)
      private final Output<String> id;

    public Output<String> id() {
        return this.id;
    }

    /**
     * Schema of the Cosmos DB Cassandra table
     * 
     */
    @Import(name="schema")
      private final @Nullable Output<CassandraSchemaArgs> schema;

    public Output<CassandraSchemaArgs> schema() {
        return this.schema == null ? Codegen.empty() : this.schema;
    }

    public CassandraTableResourceArgs(
        @Nullable Output<Integer> analyticalStorageTtl,
        @Nullable Output<Integer> defaultTtl,
        Output<String> id,
        @Nullable Output<CassandraSchemaArgs> schema) {
        this.analyticalStorageTtl = analyticalStorageTtl;
        this.defaultTtl = defaultTtl;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.schema = schema;
    }

    private CassandraTableResourceArgs() {
        this.analyticalStorageTtl = Codegen.empty();
        this.defaultTtl = Codegen.empty();
        this.id = Codegen.empty();
        this.schema = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CassandraTableResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> analyticalStorageTtl;
        private @Nullable Output<Integer> defaultTtl;
        private Output<String> id;
        private @Nullable Output<CassandraSchemaArgs> schema;

        public Builder() {
    	      // Empty
        }

        public Builder(CassandraTableResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analyticalStorageTtl = defaults.analyticalStorageTtl;
    	      this.defaultTtl = defaults.defaultTtl;
    	      this.id = defaults.id;
    	      this.schema = defaults.schema;
        }

        public Builder analyticalStorageTtl(@Nullable Output<Integer> analyticalStorageTtl) {
            this.analyticalStorageTtl = analyticalStorageTtl;
            return this;
        }
        public Builder analyticalStorageTtl(@Nullable Integer analyticalStorageTtl) {
            this.analyticalStorageTtl = Codegen.ofNullable(analyticalStorageTtl);
            return this;
        }
        public Builder defaultTtl(@Nullable Output<Integer> defaultTtl) {
            this.defaultTtl = defaultTtl;
            return this;
        }
        public Builder defaultTtl(@Nullable Integer defaultTtl) {
            this.defaultTtl = Codegen.ofNullable(defaultTtl);
            return this;
        }
        public Builder id(Output<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder id(String id) {
            this.id = Output.of(Objects.requireNonNull(id));
            return this;
        }
        public Builder schema(@Nullable Output<CassandraSchemaArgs> schema) {
            this.schema = schema;
            return this;
        }
        public Builder schema(@Nullable CassandraSchemaArgs schema) {
            this.schema = Codegen.ofNullable(schema);
            return this;
        }        public CassandraTableResourceArgs build() {
            return new CassandraTableResourceArgs(analyticalStorageTtl, defaultTtl, id, schema);
        }
    }
}
