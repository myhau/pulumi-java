// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.inputs;

import io.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderGetArgs;
import io.pulumi.aws.appsync.inputs.GraphQLApiLambdaAuthorizerConfigGetArgs;
import io.pulumi.aws.appsync.inputs.GraphQLApiLogConfigGetArgs;
import io.pulumi.aws.appsync.inputs.GraphQLApiOpenidConnectConfigGetArgs;
import io.pulumi.aws.appsync.inputs.GraphQLApiUserPoolConfigGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GraphQLApiState extends io.pulumi.resources.ResourceArgs {

    public static final GraphQLApiState Empty = new GraphQLApiState();

    /**
     * One or more additional authentication providers for the GraphqlApi. Defined below.
     * 
     */
    @InputImport(name="additionalAuthenticationProviders")
      private final @Nullable Input<List<GraphQLApiAdditionalAuthenticationProviderGetArgs>> additionalAuthenticationProviders;

    public Input<List<GraphQLApiAdditionalAuthenticationProviderGetArgs>> getAdditionalAuthenticationProviders() {
        return this.additionalAuthenticationProviders == null ? Input.empty() : this.additionalAuthenticationProviders;
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
     * The authentication type. Valid values: `API_KEY`, `AWS_IAM`, `AMAZON_COGNITO_USER_POOLS`, `OPENID_CONNECT`, `AWS_LAMBDA`
     * 
     */
    @InputImport(name="authenticationType")
      private final @Nullable Input<String> authenticationType;

    public Input<String> getAuthenticationType() {
        return this.authenticationType == null ? Input.empty() : this.authenticationType;
    }

    /**
     * Nested argument containing Lambda authorizer configuration. Defined below.
     * 
     */
    @InputImport(name="lambdaAuthorizerConfig")
      private final @Nullable Input<GraphQLApiLambdaAuthorizerConfigGetArgs> lambdaAuthorizerConfig;

    public Input<GraphQLApiLambdaAuthorizerConfigGetArgs> getLambdaAuthorizerConfig() {
        return this.lambdaAuthorizerConfig == null ? Input.empty() : this.lambdaAuthorizerConfig;
    }

    /**
     * Nested argument containing logging configuration. Defined below.
     * 
     */
    @InputImport(name="logConfig")
      private final @Nullable Input<GraphQLApiLogConfigGetArgs> logConfig;

    public Input<GraphQLApiLogConfigGetArgs> getLogConfig() {
        return this.logConfig == null ? Input.empty() : this.logConfig;
    }

    /**
     * A user-supplied name for the GraphqlApi.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Nested argument containing OpenID Connect configuration. Defined below.
     * 
     */
    @InputImport(name="openidConnectConfig")
      private final @Nullable Input<GraphQLApiOpenidConnectConfigGetArgs> openidConnectConfig;

    public Input<GraphQLApiOpenidConnectConfigGetArgs> getOpenidConnectConfig() {
        return this.openidConnectConfig == null ? Input.empty() : this.openidConnectConfig;
    }

    /**
     * The schema definition, in GraphQL schema language format. This provider cannot perform drift detection of this configuration.
     * 
     */
    @InputImport(name="schema")
      private final @Nullable Input<String> schema;

    public Input<String> getSchema() {
        return this.schema == null ? Input.empty() : this.schema;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * Map of URIs associated with the APIE.g., `uris["GRAPHQL"] = https://ID.appsync-api.REGION.amazonaws.com/graphql`
     * 
     */
    @InputImport(name="uris")
      private final @Nullable Input<Map<String,String>> uris;

    public Input<Map<String,String>> getUris() {
        return this.uris == null ? Input.empty() : this.uris;
    }

    /**
     * The Amazon Cognito User Pool configuration. Defined below.
     * 
     */
    @InputImport(name="userPoolConfig")
      private final @Nullable Input<GraphQLApiUserPoolConfigGetArgs> userPoolConfig;

    public Input<GraphQLApiUserPoolConfigGetArgs> getUserPoolConfig() {
        return this.userPoolConfig == null ? Input.empty() : this.userPoolConfig;
    }

    /**
     * Whether tracing with X-ray is enabled. Defaults to false.
     * 
     */
    @InputImport(name="xrayEnabled")
      private final @Nullable Input<Boolean> xrayEnabled;

    public Input<Boolean> getXrayEnabled() {
        return this.xrayEnabled == null ? Input.empty() : this.xrayEnabled;
    }

    public GraphQLApiState(
        @Nullable Input<List<GraphQLApiAdditionalAuthenticationProviderGetArgs>> additionalAuthenticationProviders,
        @Nullable Input<String> arn,
        @Nullable Input<String> authenticationType,
        @Nullable Input<GraphQLApiLambdaAuthorizerConfigGetArgs> lambdaAuthorizerConfig,
        @Nullable Input<GraphQLApiLogConfigGetArgs> logConfig,
        @Nullable Input<String> name,
        @Nullable Input<GraphQLApiOpenidConnectConfigGetArgs> openidConnectConfig,
        @Nullable Input<String> schema,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<Map<String,String>> uris,
        @Nullable Input<GraphQLApiUserPoolConfigGetArgs> userPoolConfig,
        @Nullable Input<Boolean> xrayEnabled) {
        this.additionalAuthenticationProviders = additionalAuthenticationProviders;
        this.arn = arn;
        this.authenticationType = authenticationType;
        this.lambdaAuthorizerConfig = lambdaAuthorizerConfig;
        this.logConfig = logConfig;
        this.name = name;
        this.openidConnectConfig = openidConnectConfig;
        this.schema = schema;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.uris = uris;
        this.userPoolConfig = userPoolConfig;
        this.xrayEnabled = xrayEnabled;
    }

    private GraphQLApiState() {
        this.additionalAuthenticationProviders = Input.empty();
        this.arn = Input.empty();
        this.authenticationType = Input.empty();
        this.lambdaAuthorizerConfig = Input.empty();
        this.logConfig = Input.empty();
        this.name = Input.empty();
        this.openidConnectConfig = Input.empty();
        this.schema = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.uris = Input.empty();
        this.userPoolConfig = Input.empty();
        this.xrayEnabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GraphQLApiState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<GraphQLApiAdditionalAuthenticationProviderGetArgs>> additionalAuthenticationProviders;
        private @Nullable Input<String> arn;
        private @Nullable Input<String> authenticationType;
        private @Nullable Input<GraphQLApiLambdaAuthorizerConfigGetArgs> lambdaAuthorizerConfig;
        private @Nullable Input<GraphQLApiLogConfigGetArgs> logConfig;
        private @Nullable Input<String> name;
        private @Nullable Input<GraphQLApiOpenidConnectConfigGetArgs> openidConnectConfig;
        private @Nullable Input<String> schema;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<Map<String,String>> uris;
        private @Nullable Input<GraphQLApiUserPoolConfigGetArgs> userPoolConfig;
        private @Nullable Input<Boolean> xrayEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GraphQLApiState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalAuthenticationProviders = defaults.additionalAuthenticationProviders;
    	      this.arn = defaults.arn;
    	      this.authenticationType = defaults.authenticationType;
    	      this.lambdaAuthorizerConfig = defaults.lambdaAuthorizerConfig;
    	      this.logConfig = defaults.logConfig;
    	      this.name = defaults.name;
    	      this.openidConnectConfig = defaults.openidConnectConfig;
    	      this.schema = defaults.schema;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.uris = defaults.uris;
    	      this.userPoolConfig = defaults.userPoolConfig;
    	      this.xrayEnabled = defaults.xrayEnabled;
        }

        public Builder setAdditionalAuthenticationProviders(@Nullable Input<List<GraphQLApiAdditionalAuthenticationProviderGetArgs>> additionalAuthenticationProviders) {
            this.additionalAuthenticationProviders = additionalAuthenticationProviders;
            return this;
        }

        public Builder setAdditionalAuthenticationProviders(@Nullable List<GraphQLApiAdditionalAuthenticationProviderGetArgs> additionalAuthenticationProviders) {
            this.additionalAuthenticationProviders = Input.ofNullable(additionalAuthenticationProviders);
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

        public Builder setAuthenticationType(@Nullable Input<String> authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        public Builder setAuthenticationType(@Nullable String authenticationType) {
            this.authenticationType = Input.ofNullable(authenticationType);
            return this;
        }

        public Builder setLambdaAuthorizerConfig(@Nullable Input<GraphQLApiLambdaAuthorizerConfigGetArgs> lambdaAuthorizerConfig) {
            this.lambdaAuthorizerConfig = lambdaAuthorizerConfig;
            return this;
        }

        public Builder setLambdaAuthorizerConfig(@Nullable GraphQLApiLambdaAuthorizerConfigGetArgs lambdaAuthorizerConfig) {
            this.lambdaAuthorizerConfig = Input.ofNullable(lambdaAuthorizerConfig);
            return this;
        }

        public Builder setLogConfig(@Nullable Input<GraphQLApiLogConfigGetArgs> logConfig) {
            this.logConfig = logConfig;
            return this;
        }

        public Builder setLogConfig(@Nullable GraphQLApiLogConfigGetArgs logConfig) {
            this.logConfig = Input.ofNullable(logConfig);
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

        public Builder setOpenidConnectConfig(@Nullable Input<GraphQLApiOpenidConnectConfigGetArgs> openidConnectConfig) {
            this.openidConnectConfig = openidConnectConfig;
            return this;
        }

        public Builder setOpenidConnectConfig(@Nullable GraphQLApiOpenidConnectConfigGetArgs openidConnectConfig) {
            this.openidConnectConfig = Input.ofNullable(openidConnectConfig);
            return this;
        }

        public Builder setSchema(@Nullable Input<String> schema) {
            this.schema = schema;
            return this;
        }

        public Builder setSchema(@Nullable String schema) {
            this.schema = Input.ofNullable(schema);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder setUris(@Nullable Input<Map<String,String>> uris) {
            this.uris = uris;
            return this;
        }

        public Builder setUris(@Nullable Map<String,String> uris) {
            this.uris = Input.ofNullable(uris);
            return this;
        }

        public Builder setUserPoolConfig(@Nullable Input<GraphQLApiUserPoolConfigGetArgs> userPoolConfig) {
            this.userPoolConfig = userPoolConfig;
            return this;
        }

        public Builder setUserPoolConfig(@Nullable GraphQLApiUserPoolConfigGetArgs userPoolConfig) {
            this.userPoolConfig = Input.ofNullable(userPoolConfig);
            return this;
        }

        public Builder setXrayEnabled(@Nullable Input<Boolean> xrayEnabled) {
            this.xrayEnabled = xrayEnabled;
            return this;
        }

        public Builder setXrayEnabled(@Nullable Boolean xrayEnabled) {
            this.xrayEnabled = Input.ofNullable(xrayEnabled);
            return this;
        }
        public GraphQLApiState build() {
            return new GraphQLApiState(additionalAuthenticationProviders, arn, authenticationType, lambdaAuthorizerConfig, logConfig, name, openidConnectConfig, schema, tags, tagsAll, uris, userPoolConfig, xrayEnabled);
        }
    }
}
