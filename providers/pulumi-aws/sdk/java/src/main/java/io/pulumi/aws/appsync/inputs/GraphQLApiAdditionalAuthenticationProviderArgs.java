// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.inputs;

import io.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigArgs;
import io.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfigArgs;
import io.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderUserPoolConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GraphQLApiAdditionalAuthenticationProviderArgs extends io.pulumi.resources.ResourceArgs {

    public static final GraphQLApiAdditionalAuthenticationProviderArgs Empty = new GraphQLApiAdditionalAuthenticationProviderArgs();

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
      private final @Nullable Input<GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigArgs> lambdaAuthorizerConfig;

    public Input<GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigArgs> getLambdaAuthorizerConfig() {
        return this.lambdaAuthorizerConfig == null ? Input.empty() : this.lambdaAuthorizerConfig;
    }

    /**
     * Nested argument containing OpenID Connect configuration. Defined below.
     * 
     */
    @InputImport(name="openidConnectConfig")
      private final @Nullable Input<GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfigArgs> openidConnectConfig;

    public Input<GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfigArgs> getOpenidConnectConfig() {
        return this.openidConnectConfig == null ? Input.empty() : this.openidConnectConfig;
    }

    /**
     * The Amazon Cognito User Pool configuration. Defined below.
     * 
     */
    @InputImport(name="userPoolConfig")
      private final @Nullable Input<GraphQLApiAdditionalAuthenticationProviderUserPoolConfigArgs> userPoolConfig;

    public Input<GraphQLApiAdditionalAuthenticationProviderUserPoolConfigArgs> getUserPoolConfig() {
        return this.userPoolConfig == null ? Input.empty() : this.userPoolConfig;
    }

    public GraphQLApiAdditionalAuthenticationProviderArgs(
        Input<String> authenticationType,
        @Nullable Input<GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigArgs> lambdaAuthorizerConfig,
        @Nullable Input<GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfigArgs> openidConnectConfig,
        @Nullable Input<GraphQLApiAdditionalAuthenticationProviderUserPoolConfigArgs> userPoolConfig) {
        this.authenticationType = Objects.requireNonNull(authenticationType, "expected parameter 'authenticationType' to be non-null");
        this.lambdaAuthorizerConfig = lambdaAuthorizerConfig;
        this.openidConnectConfig = openidConnectConfig;
        this.userPoolConfig = userPoolConfig;
    }

    private GraphQLApiAdditionalAuthenticationProviderArgs() {
        this.authenticationType = Input.empty();
        this.lambdaAuthorizerConfig = Input.empty();
        this.openidConnectConfig = Input.empty();
        this.userPoolConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GraphQLApiAdditionalAuthenticationProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> authenticationType;
        private @Nullable Input<GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigArgs> lambdaAuthorizerConfig;
        private @Nullable Input<GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfigArgs> openidConnectConfig;
        private @Nullable Input<GraphQLApiAdditionalAuthenticationProviderUserPoolConfigArgs> userPoolConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GraphQLApiAdditionalAuthenticationProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationType = defaults.authenticationType;
    	      this.lambdaAuthorizerConfig = defaults.lambdaAuthorizerConfig;
    	      this.openidConnectConfig = defaults.openidConnectConfig;
    	      this.userPoolConfig = defaults.userPoolConfig;
        }

        public Builder setAuthenticationType(Input<String> authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }

        public Builder setAuthenticationType(String authenticationType) {
            this.authenticationType = Input.of(Objects.requireNonNull(authenticationType));
            return this;
        }

        public Builder setLambdaAuthorizerConfig(@Nullable Input<GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigArgs> lambdaAuthorizerConfig) {
            this.lambdaAuthorizerConfig = lambdaAuthorizerConfig;
            return this;
        }

        public Builder setLambdaAuthorizerConfig(@Nullable GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigArgs lambdaAuthorizerConfig) {
            this.lambdaAuthorizerConfig = Input.ofNullable(lambdaAuthorizerConfig);
            return this;
        }

        public Builder setOpenidConnectConfig(@Nullable Input<GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfigArgs> openidConnectConfig) {
            this.openidConnectConfig = openidConnectConfig;
            return this;
        }

        public Builder setOpenidConnectConfig(@Nullable GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfigArgs openidConnectConfig) {
            this.openidConnectConfig = Input.ofNullable(openidConnectConfig);
            return this;
        }

        public Builder setUserPoolConfig(@Nullable Input<GraphQLApiAdditionalAuthenticationProviderUserPoolConfigArgs> userPoolConfig) {
            this.userPoolConfig = userPoolConfig;
            return this;
        }

        public Builder setUserPoolConfig(@Nullable GraphQLApiAdditionalAuthenticationProviderUserPoolConfigArgs userPoolConfig) {
            this.userPoolConfig = Input.ofNullable(userPoolConfig);
            return this;
        }
        public GraphQLApiAdditionalAuthenticationProviderArgs build() {
            return new GraphQLApiAdditionalAuthenticationProviderArgs(authenticationType, lambdaAuthorizerConfig, openidConnectConfig, userPoolConfig);
        }
    }
}
