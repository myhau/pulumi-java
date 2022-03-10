// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.inputs;

import io.pulumi.aws.appsync.inputs.DataSourceRelationalDatabaseConfigHttpEndpointConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceRelationalDatabaseConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceRelationalDatabaseConfigArgs Empty = new DataSourceRelationalDatabaseConfigArgs();

    /**
     * The Amazon RDS HTTP endpoint configuration. See HTTP Endpoint Config.
     * 
     */
    @InputImport(name="httpEndpointConfig")
      private final @Nullable Input<DataSourceRelationalDatabaseConfigHttpEndpointConfigArgs> httpEndpointConfig;

    public Input<DataSourceRelationalDatabaseConfigHttpEndpointConfigArgs> getHttpEndpointConfig() {
        return this.httpEndpointConfig == null ? Input.empty() : this.httpEndpointConfig;
    }

    /**
     * Source type for the relational database. Valid values: `RDS_HTTP_ENDPOINT`.
     * 
     */
    @InputImport(name="sourceType")
      private final @Nullable Input<String> sourceType;

    public Input<String> getSourceType() {
        return this.sourceType == null ? Input.empty() : this.sourceType;
    }

    public DataSourceRelationalDatabaseConfigArgs(
        @Nullable Input<DataSourceRelationalDatabaseConfigHttpEndpointConfigArgs> httpEndpointConfig,
        @Nullable Input<String> sourceType) {
        this.httpEndpointConfig = httpEndpointConfig;
        this.sourceType = sourceType;
    }

    private DataSourceRelationalDatabaseConfigArgs() {
        this.httpEndpointConfig = Input.empty();
        this.sourceType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceRelationalDatabaseConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DataSourceRelationalDatabaseConfigHttpEndpointConfigArgs> httpEndpointConfig;
        private @Nullable Input<String> sourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceRelationalDatabaseConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpEndpointConfig = defaults.httpEndpointConfig;
    	      this.sourceType = defaults.sourceType;
        }

        public Builder setHttpEndpointConfig(@Nullable Input<DataSourceRelationalDatabaseConfigHttpEndpointConfigArgs> httpEndpointConfig) {
            this.httpEndpointConfig = httpEndpointConfig;
            return this;
        }

        public Builder setHttpEndpointConfig(@Nullable DataSourceRelationalDatabaseConfigHttpEndpointConfigArgs httpEndpointConfig) {
            this.httpEndpointConfig = Input.ofNullable(httpEndpointConfig);
            return this;
        }

        public Builder setSourceType(@Nullable Input<String> sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        public Builder setSourceType(@Nullable String sourceType) {
            this.sourceType = Input.ofNullable(sourceType);
            return this;
        }
        public DataSourceRelationalDatabaseConfigArgs build() {
            return new DataSourceRelationalDatabaseConfigArgs(httpEndpointConfig, sourceType);
        }
    }
}