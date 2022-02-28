// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync;

import io.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderArgs;
import io.pulumi.aws.appsync.inputs.GraphQLApiLambdaAuthorizerConfigArgs;
import io.pulumi.aws.appsync.inputs.GraphQLApiLogConfigArgs;
import io.pulumi.aws.appsync.inputs.GraphQLApiOpenidConnectConfigArgs;
import io.pulumi.aws.appsync.inputs.GraphQLApiUserPoolConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GraphQLApiArgs extends io.pulumi.resources.ResourceArgs {

    public static final GraphQLApiArgs Empty = new GraphQLApiArgs();

    /**
     * One or more additional authentication providers for the GraphqlApi. Defined below.
     * 
     */
    @InputImport(name="additionalAuthenticationProviders")
      private final @Nullable Input<List<GraphQLApiAdditionalAuthenticationProviderArgs>> additionalAuthenticationProviders;

    public Input<List<GraphQLApiAdditionalAuthenticationProviderArgs>> getAdditionalAuthenticationProviders() {
        return this.additionalAuthenticationProviders == null ? Input.empty() : this.additionalAuthenticationProviders;
    }

    /**
     * The authentication type. Valid values: `API_KEY`, `AWS_IAM`, `AMAZON_COGNITO_USER_POOLS`, `OPENID_CONNECT`, `AWS_LAMBDA`
     * 
     */
    @InputImport(name="authenticationType", required=true)
      private final Input<String> authenticationType;

    public Input<String> getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Nested argument containing Lambda authorizer configuration. Defined below.
     * 
     */
    @InputImport(name="lambdaAuthorizerConfig")
      private final @Nullable Input<GraphQLApiLambdaAuthorizerConfigArgs> lambdaAuthorizerConfig;

    public Input<GraphQLApiLambdaAuthorizerConfigArgs> getLambdaAuthorizerConfig() {
        return this.lambdaAuthorizerConfig == null ? Input.empty() : this.lambdaAuthorizerConfig;
    }

    /**
     * Nested argument containing logging configuration. Defined below.
     * 
     */
    @InputImport(name="logConfig")
      private final @Nullable Input<GraphQLApiLogConfigArgs> logConfig;

    public Input<GraphQLApiLogConfigArgs> getLogConfig() {
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
      private final @Nullable Input<GraphQLApiOpenidConnectConfigArgs> openidConnectConfig;

    public Input<GraphQLApiOpenidConnectConfigArgs> getOpenidConnectConfig() {
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
     * The Amazon Cognito User Pool configuration. Defined below.
     * 
     */
    @InputImport(name="userPoolConfig")
      private final @Nullable Input<GraphQLApiUserPoolConfigArgs> userPoolConfig;

    public Input<GraphQLApiUserPoolConfigArgs> getUserPoolConfig() {
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

    public GraphQLApiArgs(
        @Nullable Input<List<GraphQLApiAdditionalAuthenticationProviderArgs>> additionalAuthenticationProviders,
        Input<String> authenticationType,
        @Nullable Input<GraphQLApiLambdaAuthorizerConfigArgs> lambdaAuthorizerConfig,
        @Nullable Input<GraphQLApiLogConfigArgs> logConfig,
        @Nullable Input<String> name,
        @Nullable Input<GraphQLApiOpenidConnectConfigArgs> openidConnectConfig,
        @Nullable Input<String> schema,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<GraphQLApiUserPoolConfigArgs> userPoolConfig,
        @Nullable Input<Boolean> xrayEnabled) {
        this.additionalAuthenticationProviders = additionalAuthenticationProviders;
        this.authenticationType = Objects.requireNonNull(authenticationType, "expected parameter 'authenticationType' to be non-null");
        this.lambdaAuthorizerConfig = lambdaAuthorizerConfig;
        this.logConfig = logConfig;
        this.name = name;
        this.openidConnectConfig = openidConnectConfig;
        this.schema = schema;
        this.tags = tags;
        this.userPoolConfig = userPoolConfig;
        this.xrayEnabled = xrayEnabled;
    }

    private GraphQLApiArgs() {
        this.additionalAuthenticationProviders = Input.empty();
        this.authenticationType = Input.empty();
        this.lambdaAuthorizerConfig = Input.empty();
        this.logConfig = Input.empty();
        this.name = Input.empty();
        this.openidConnectConfig = Input.empty();
        this.schema = Input.empty();
        this.tags = Input.empty();
        this.userPoolConfig = Input.empty();
        this.xrayEnabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GraphQLApiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<GraphQLApiAdditionalAuthenticationProviderArgs>> additionalAuthenticationProviders;
        private Input<String> authenticationType;
        private @Nullable Input<GraphQLApiLambdaAuthorizerConfigArgs> lambdaAuthorizerConfig;
        private @Nullable Input<GraphQLApiLogConfigArgs> logConfig;
        private @Nullable Input<String> name;
        private @Nullable Input<GraphQLApiOpenidConnectConfigArgs> openidConnectConfig;
        private @Nullable Input<String> schema;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<GraphQLApiUserPoolConfigArgs> userPoolConfig;
        private @Nullable Input<Boolean> xrayEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GraphQLApiArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalAuthenticationProviders = defaults.additionalAuthenticationProviders;
    	      this.authenticationType = defaults.authenticationType;
    	      this.lambdaAuthorizerConfig = defaults.lambdaAuthorizerConfig;
    	      this.logConfig = defaults.logConfig;
    	      this.name = defaults.name;
    	      this.openidConnectConfig = defaults.openidConnectConfig;
    	      this.schema = defaults.schema;
    	      this.tags = defaults.tags;
    	      this.userPoolConfig = defaults.userPoolConfig;
    	      this.xrayEnabled = defaults.xrayEnabled;
        }

        public Builder setAdditionalAuthenticationProviders(@Nullable Input<List<GraphQLApiAdditionalAuthenticationProviderArgs>> additionalAuthenticationProviders) {
            this.additionalAuthenticationProviders = additionalAuthenticationProviders;
            return this;
        }

        public Builder setAdditionalAuthenticationProviders(@Nullable List<GraphQLApiAdditionalAuthenticationProviderArgs> additionalAuthenticationProviders) {
            this.additionalAuthenticationProviders = Input.ofNullable(additionalAuthenticationProviders);
            return this;
        }

        public Builder setAuthenticationType(Input<String> authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }

        public Builder setAuthenticationType(String authenticationType) {
            this.authenticationType = Input.of(Objects.requireNonNull(authenticationType));
            return this;
        }

        public Builder setLambdaAuthorizerConfig(@Nullable Input<GraphQLApiLambdaAuthorizerConfigArgs> lambdaAuthorizerConfig) {
            this.lambdaAuthorizerConfig = lambdaAuthorizerConfig;
            return this;
        }

        public Builder setLambdaAuthorizerConfig(@Nullable GraphQLApiLambdaAuthorizerConfigArgs lambdaAuthorizerConfig) {
            this.lambdaAuthorizerConfig = Input.ofNullable(lambdaAuthorizerConfig);
            return this;
        }

        public Builder setLogConfig(@Nullable Input<GraphQLApiLogConfigArgs> logConfig) {
            this.logConfig = logConfig;
            return this;
        }

        public Builder setLogConfig(@Nullable GraphQLApiLogConfigArgs logConfig) {
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

        public Builder setOpenidConnectConfig(@Nullable Input<GraphQLApiOpenidConnectConfigArgs> openidConnectConfig) {
            this.openidConnectConfig = openidConnectConfig;
            return this;
        }

        public Builder setOpenidConnectConfig(@Nullable GraphQLApiOpenidConnectConfigArgs openidConnectConfig) {
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

        public Builder setUserPoolConfig(@Nullable Input<GraphQLApiUserPoolConfigArgs> userPoolConfig) {
            this.userPoolConfig = userPoolConfig;
            return this;
        }

        public Builder setUserPoolConfig(@Nullable GraphQLApiUserPoolConfigArgs userPoolConfig) {
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
        public GraphQLApiArgs build() {
            return new GraphQLApiArgs(additionalAuthenticationProviders, authenticationType, lambdaAuthorizerConfig, logConfig, name, openidConnectConfig, schema, tags, userPoolConfig, xrayEnabled);
        }
    }
}
