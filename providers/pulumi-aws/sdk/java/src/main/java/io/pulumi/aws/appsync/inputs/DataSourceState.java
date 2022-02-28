// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.inputs;

import io.pulumi.aws.appsync.inputs.DataSourceDynamodbConfigGetArgs;
import io.pulumi.aws.appsync.inputs.DataSourceElasticsearchConfigGetArgs;
import io.pulumi.aws.appsync.inputs.DataSourceHttpConfigGetArgs;
import io.pulumi.aws.appsync.inputs.DataSourceLambdaConfigGetArgs;
import io.pulumi.aws.appsync.inputs.DataSourceRelationalDatabaseConfigGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceState extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceState Empty = new DataSourceState();

    /**
     * The API ID for the GraphQL API for the DataSource.
     * 
     */
    @InputImport(name="apiId")
      private final @Nullable Input<String> apiId;

    public Input<String> getApiId() {
        return this.apiId == null ? Input.empty() : this.apiId;
    }

    /**
     * The ARN
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * A description of the DataSource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * DynamoDB settings. See below
     * 
     */
    @InputImport(name="dynamodbConfig")
      private final @Nullable Input<DataSourceDynamodbConfigGetArgs> dynamodbConfig;

    public Input<DataSourceDynamodbConfigGetArgs> getDynamodbConfig() {
        return this.dynamodbConfig == null ? Input.empty() : this.dynamodbConfig;
    }

    /**
     * Amazon Elasticsearch settings. See below
     * 
     */
    @InputImport(name="elasticsearchConfig")
      private final @Nullable Input<DataSourceElasticsearchConfigGetArgs> elasticsearchConfig;

    public Input<DataSourceElasticsearchConfigGetArgs> getElasticsearchConfig() {
        return this.elasticsearchConfig == null ? Input.empty() : this.elasticsearchConfig;
    }

    /**
     * HTTP settings. See below
     * 
     */
    @InputImport(name="httpConfig")
      private final @Nullable Input<DataSourceHttpConfigGetArgs> httpConfig;

    public Input<DataSourceHttpConfigGetArgs> getHttpConfig() {
        return this.httpConfig == null ? Input.empty() : this.httpConfig;
    }

    /**
     * AWS Lambda settings. See below
     * 
     */
    @InputImport(name="lambdaConfig")
      private final @Nullable Input<DataSourceLambdaConfigGetArgs> lambdaConfig;

    public Input<DataSourceLambdaConfigGetArgs> getLambdaConfig() {
        return this.lambdaConfig == null ? Input.empty() : this.lambdaConfig;
    }

    /**
     * A user-supplied name for the DataSource.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * AWS RDS settings. See Relational Database Config
     * 
     */
    @InputImport(name="relationalDatabaseConfig")
      private final @Nullable Input<DataSourceRelationalDatabaseConfigGetArgs> relationalDatabaseConfig;

    public Input<DataSourceRelationalDatabaseConfigGetArgs> getRelationalDatabaseConfig() {
        return this.relationalDatabaseConfig == null ? Input.empty() : this.relationalDatabaseConfig;
    }

    /**
     * The IAM service role ARN for the data source.
     * 
     */
    @InputImport(name="serviceRoleArn")
      private final @Nullable Input<String> serviceRoleArn;

    public Input<String> getServiceRoleArn() {
        return this.serviceRoleArn == null ? Input.empty() : this.serviceRoleArn;
    }

    /**
     * The type of the DataSource. Valid values: `AWS_LAMBDA`, `AMAZON_DYNAMODB`, `AMAZON_ELASTICSEARCH`, `HTTP`, `NONE`, `RELATIONAL_DATABASE`.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public DataSourceState(
        @Nullable Input<String> apiId,
        @Nullable Input<String> arn,
        @Nullable Input<String> description,
        @Nullable Input<DataSourceDynamodbConfigGetArgs> dynamodbConfig,
        @Nullable Input<DataSourceElasticsearchConfigGetArgs> elasticsearchConfig,
        @Nullable Input<DataSourceHttpConfigGetArgs> httpConfig,
        @Nullable Input<DataSourceLambdaConfigGetArgs> lambdaConfig,
        @Nullable Input<String> name,
        @Nullable Input<DataSourceRelationalDatabaseConfigGetArgs> relationalDatabaseConfig,
        @Nullable Input<String> serviceRoleArn,
        @Nullable Input<String> type) {
        this.apiId = apiId;
        this.arn = arn;
        this.description = description;
        this.dynamodbConfig = dynamodbConfig;
        this.elasticsearchConfig = elasticsearchConfig;
        this.httpConfig = httpConfig;
        this.lambdaConfig = lambdaConfig;
        this.name = name;
        this.relationalDatabaseConfig = relationalDatabaseConfig;
        this.serviceRoleArn = serviceRoleArn;
        this.type = type;
    }

    private DataSourceState() {
        this.apiId = Input.empty();
        this.arn = Input.empty();
        this.description = Input.empty();
        this.dynamodbConfig = Input.empty();
        this.elasticsearchConfig = Input.empty();
        this.httpConfig = Input.empty();
        this.lambdaConfig = Input.empty();
        this.name = Input.empty();
        this.relationalDatabaseConfig = Input.empty();
        this.serviceRoleArn = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiId;
        private @Nullable Input<String> arn;
        private @Nullable Input<String> description;
        private @Nullable Input<DataSourceDynamodbConfigGetArgs> dynamodbConfig;
        private @Nullable Input<DataSourceElasticsearchConfigGetArgs> elasticsearchConfig;
        private @Nullable Input<DataSourceHttpConfigGetArgs> httpConfig;
        private @Nullable Input<DataSourceLambdaConfigGetArgs> lambdaConfig;
        private @Nullable Input<String> name;
        private @Nullable Input<DataSourceRelationalDatabaseConfigGetArgs> relationalDatabaseConfig;
        private @Nullable Input<String> serviceRoleArn;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.dynamodbConfig = defaults.dynamodbConfig;
    	      this.elasticsearchConfig = defaults.elasticsearchConfig;
    	      this.httpConfig = defaults.httpConfig;
    	      this.lambdaConfig = defaults.lambdaConfig;
    	      this.name = defaults.name;
    	      this.relationalDatabaseConfig = defaults.relationalDatabaseConfig;
    	      this.serviceRoleArn = defaults.serviceRoleArn;
    	      this.type = defaults.type;
        }

        public Builder setApiId(@Nullable Input<String> apiId) {
            this.apiId = apiId;
            return this;
        }

        public Builder setApiId(@Nullable String apiId) {
            this.apiId = Input.ofNullable(apiId);
            return this;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDynamodbConfig(@Nullable Input<DataSourceDynamodbConfigGetArgs> dynamodbConfig) {
            this.dynamodbConfig = dynamodbConfig;
            return this;
        }

        public Builder setDynamodbConfig(@Nullable DataSourceDynamodbConfigGetArgs dynamodbConfig) {
            this.dynamodbConfig = Input.ofNullable(dynamodbConfig);
            return this;
        }

        public Builder setElasticsearchConfig(@Nullable Input<DataSourceElasticsearchConfigGetArgs> elasticsearchConfig) {
            this.elasticsearchConfig = elasticsearchConfig;
            return this;
        }

        public Builder setElasticsearchConfig(@Nullable DataSourceElasticsearchConfigGetArgs elasticsearchConfig) {
            this.elasticsearchConfig = Input.ofNullable(elasticsearchConfig);
            return this;
        }

        public Builder setHttpConfig(@Nullable Input<DataSourceHttpConfigGetArgs> httpConfig) {
            this.httpConfig = httpConfig;
            return this;
        }

        public Builder setHttpConfig(@Nullable DataSourceHttpConfigGetArgs httpConfig) {
            this.httpConfig = Input.ofNullable(httpConfig);
            return this;
        }

        public Builder setLambdaConfig(@Nullable Input<DataSourceLambdaConfigGetArgs> lambdaConfig) {
            this.lambdaConfig = lambdaConfig;
            return this;
        }

        public Builder setLambdaConfig(@Nullable DataSourceLambdaConfigGetArgs lambdaConfig) {
            this.lambdaConfig = Input.ofNullable(lambdaConfig);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRelationalDatabaseConfig(@Nullable Input<DataSourceRelationalDatabaseConfigGetArgs> relationalDatabaseConfig) {
            this.relationalDatabaseConfig = relationalDatabaseConfig;
            return this;
        }

        public Builder setRelationalDatabaseConfig(@Nullable DataSourceRelationalDatabaseConfigGetArgs relationalDatabaseConfig) {
            this.relationalDatabaseConfig = Input.ofNullable(relationalDatabaseConfig);
            return this;
        }

        public Builder setServiceRoleArn(@Nullable Input<String> serviceRoleArn) {
            this.serviceRoleArn = serviceRoleArn;
            return this;
        }

        public Builder setServiceRoleArn(@Nullable String serviceRoleArn) {
            this.serviceRoleArn = Input.ofNullable(serviceRoleArn);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public DataSourceState build() {
            return new DataSourceState(apiId, arn, description, dynamodbConfig, elasticsearchConfig, httpConfig, lambdaConfig, name, relationalDatabaseConfig, serviceRoleArn, type);
        }
    }
}
