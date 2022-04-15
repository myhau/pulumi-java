// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.azurenative.documentdb.inputs.CreateUpdateOptionsArgs;
import io.pulumi.azurenative.documentdb.inputs.TableResourceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableResourceTableArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableResourceTableArgs Empty = new TableResourceTableArgs();

    /**
     * Cosmos DB database account name.
     * 
     */
    @Import(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * The location of the resource group to which the resource belongs.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * A key-value pair of options to be applied for the request. This corresponds to the headers sent with the request.
     * 
     */
    @Import(name="options")
      private final @Nullable Output<CreateUpdateOptionsArgs> options;

    public Output<CreateUpdateOptionsArgs> options() {
        return this.options == null ? Codegen.empty() : this.options;
    }

    /**
     * The standard JSON format of a Table
     * 
     */
    @Import(name="resource", required=true)
      private final Output<TableResourceArgs> resource;

    public Output<TableResourceArgs> resource() {
        return this.resource;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Cosmos DB table name.
     * 
     */
    @Import(name="tableName")
      private final @Nullable Output<String> tableName;

    public Output<String> tableName() {
        return this.tableName == null ? Codegen.empty() : this.tableName;
    }

    /**
     * Tags are a list of key-value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example, the default experience for a template type is set with "defaultExperience": "Cassandra". Current "defaultExperience" values also include "Table", "Graph", "DocumentDB", and "MongoDB".
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public TableResourceTableArgs(
        Output<String> accountName,
        @Nullable Output<String> location,
        @Nullable Output<CreateUpdateOptionsArgs> options,
        Output<TableResourceArgs> resource,
        Output<String> resourceGroupName,
        @Nullable Output<String> tableName,
        @Nullable Output<Map<String,String>> tags) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.location = location;
        this.options = options;
        this.resource = Objects.requireNonNull(resource, "expected parameter 'resource' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tableName = tableName;
        this.tags = tags;
    }

    private TableResourceTableArgs() {
        this.accountName = Codegen.empty();
        this.location = Codegen.empty();
        this.options = Codegen.empty();
        this.resource = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tableName = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableResourceTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private @Nullable Output<String> location;
        private @Nullable Output<CreateUpdateOptionsArgs> options;
        private Output<TableResourceArgs> resource;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> tableName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(TableResourceTableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.location = defaults.location;
    	      this.options = defaults.options;
    	      this.resource = defaults.resource;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tableName = defaults.tableName;
    	      this.tags = defaults.tags;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder options(@Nullable Output<CreateUpdateOptionsArgs> options) {
            this.options = options;
            return this;
        }
        public Builder options(@Nullable CreateUpdateOptionsArgs options) {
            this.options = Codegen.ofNullable(options);
            return this;
        }
        public Builder resource(Output<TableResourceArgs> resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }
        public Builder resource(TableResourceArgs resource) {
            this.resource = Output.of(Objects.requireNonNull(resource));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder tableName(@Nullable Output<String> tableName) {
            this.tableName = tableName;
            return this;
        }
        public Builder tableName(@Nullable String tableName) {
            this.tableName = Codegen.ofNullable(tableName);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public TableResourceTableArgs build() {
            return new TableResourceTableArgs(accountName, location, options, resource, resourceGroupName, tableName, tags);
        }
    }
}
