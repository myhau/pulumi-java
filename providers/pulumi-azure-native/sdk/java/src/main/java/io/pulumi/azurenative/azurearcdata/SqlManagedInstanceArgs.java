// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurearcdata;

import io.pulumi.azurenative.azurearcdata.inputs.ExtendedLocationArgs;
import io.pulumi.azurenative.azurearcdata.inputs.SqlManagedInstancePropertiesArgs;
import io.pulumi.azurenative.azurearcdata.inputs.SqlManagedInstanceSkuArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SqlManagedInstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlManagedInstanceArgs Empty = new SqlManagedInstanceArgs();

    /**
     * The extendedLocation of the resource.
     * 
     */
    @Import(name="extendedLocation")
      private final @Nullable Output<ExtendedLocationArgs> extendedLocation;

    public Output<ExtendedLocationArgs> extendedLocation() {
        return this.extendedLocation == null ? Codegen.empty() : this.extendedLocation;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * null
     * 
     */
    @Import(name="properties", required=true)
      private final Output<SqlManagedInstancePropertiesArgs> properties;

    public Output<SqlManagedInstancePropertiesArgs> properties() {
        return this.properties;
    }

    /**
     * The name of the Azure resource group
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource sku.
     * 
     */
    @Import(name="sku")
      private final @Nullable Output<SqlManagedInstanceSkuArgs> sku;

    public Output<SqlManagedInstanceSkuArgs> sku() {
        return this.sku == null ? Codegen.empty() : this.sku;
    }

    /**
     * The name of SQL Managed Instances
     * 
     */
    @Import(name="sqlManagedInstanceName")
      private final @Nullable Output<String> sqlManagedInstanceName;

    public Output<String> sqlManagedInstanceName() {
        return this.sqlManagedInstanceName == null ? Codegen.empty() : this.sqlManagedInstanceName;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public SqlManagedInstanceArgs(
        @Nullable Output<ExtendedLocationArgs> extendedLocation,
        @Nullable Output<String> location,
        Output<SqlManagedInstancePropertiesArgs> properties,
        Output<String> resourceGroupName,
        @Nullable Output<SqlManagedInstanceSkuArgs> sku,
        @Nullable Output<String> sqlManagedInstanceName,
        @Nullable Output<Map<String,String>> tags) {
        this.extendedLocation = extendedLocation;
        this.location = location;
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.sqlManagedInstanceName = sqlManagedInstanceName;
        this.tags = tags;
    }

    private SqlManagedInstanceArgs() {
        this.extendedLocation = Codegen.empty();
        this.location = Codegen.empty();
        this.properties = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.sku = Codegen.empty();
        this.sqlManagedInstanceName = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlManagedInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ExtendedLocationArgs> extendedLocation;
        private @Nullable Output<String> location;
        private Output<SqlManagedInstancePropertiesArgs> properties;
        private Output<String> resourceGroupName;
        private @Nullable Output<SqlManagedInstanceSkuArgs> sku;
        private @Nullable Output<String> sqlManagedInstanceName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlManagedInstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.sqlManagedInstanceName = defaults.sqlManagedInstanceName;
    	      this.tags = defaults.tags;
        }

        public Builder extendedLocation(@Nullable Output<ExtendedLocationArgs> extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }
        public Builder extendedLocation(@Nullable ExtendedLocationArgs extendedLocation) {
            this.extendedLocation = Codegen.ofNullable(extendedLocation);
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
        public Builder properties(Output<SqlManagedInstancePropertiesArgs> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder properties(SqlManagedInstancePropertiesArgs properties) {
            this.properties = Output.of(Objects.requireNonNull(properties));
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
        public Builder sku(@Nullable Output<SqlManagedInstanceSkuArgs> sku) {
            this.sku = sku;
            return this;
        }
        public Builder sku(@Nullable SqlManagedInstanceSkuArgs sku) {
            this.sku = Codegen.ofNullable(sku);
            return this;
        }
        public Builder sqlManagedInstanceName(@Nullable Output<String> sqlManagedInstanceName) {
            this.sqlManagedInstanceName = sqlManagedInstanceName;
            return this;
        }
        public Builder sqlManagedInstanceName(@Nullable String sqlManagedInstanceName) {
            this.sqlManagedInstanceName = Codegen.ofNullable(sqlManagedInstanceName);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public SqlManagedInstanceArgs build() {
            return new SqlManagedInstanceArgs(extendedLocation, location, properties, resourceGroupName, sku, sqlManagedInstanceName, tags);
        }
    }
}
