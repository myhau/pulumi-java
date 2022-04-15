// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Cosmos DB Cassandra view resource object
 * 
 */
public final class CassandraViewResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final CassandraViewResourceArgs Empty = new CassandraViewResourceArgs();

    /**
     * Name of the Cosmos DB Cassandra view
     * 
     */
    @Import(name="id", required=true)
      private final Output<String> id;

    public Output<String> id() {
        return this.id;
    }

    /**
     * View Definition of the Cosmos DB Cassandra view
     * 
     */
    @Import(name="viewDefinition", required=true)
      private final Output<String> viewDefinition;

    public Output<String> viewDefinition() {
        return this.viewDefinition;
    }

    public CassandraViewResourceArgs(
        Output<String> id,
        Output<String> viewDefinition) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.viewDefinition = Objects.requireNonNull(viewDefinition, "expected parameter 'viewDefinition' to be non-null");
    }

    private CassandraViewResourceArgs() {
        this.id = Codegen.empty();
        this.viewDefinition = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CassandraViewResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> id;
        private Output<String> viewDefinition;

        public Builder() {
    	      // Empty
        }

        public Builder(CassandraViewResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.viewDefinition = defaults.viewDefinition;
        }

        public Builder id(Output<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder id(String id) {
            this.id = Output.of(Objects.requireNonNull(id));
            return this;
        }
        public Builder viewDefinition(Output<String> viewDefinition) {
            this.viewDefinition = Objects.requireNonNull(viewDefinition);
            return this;
        }
        public Builder viewDefinition(String viewDefinition) {
            this.viewDefinition = Output.of(Objects.requireNonNull(viewDefinition));
            return this;
        }        public CassandraViewResourceArgs build() {
            return new CassandraViewResourceArgs(id, viewDefinition);
        }
    }
}
