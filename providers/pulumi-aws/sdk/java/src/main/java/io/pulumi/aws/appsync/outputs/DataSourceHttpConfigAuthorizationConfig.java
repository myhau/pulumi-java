// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.outputs;

import io.pulumi.aws.appsync.outputs.DataSourceHttpConfigAuthorizationConfigAwsIamConfig;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataSourceHttpConfigAuthorizationConfig {
    /**
     * The authorization type that the HTTP endpoint requires. Default values is `AWS_IAM`.
     * 
     */
    private final @Nullable String authorizationType;
    /**
     * The Identity and Access Management (IAM) settings. See AWS IAM Config.
     * 
     */
    private final @Nullable DataSourceHttpConfigAuthorizationConfigAwsIamConfig awsIamConfig;

    @OutputCustomType.Constructor({"authorizationType","awsIamConfig"})
    private DataSourceHttpConfigAuthorizationConfig(
        @Nullable String authorizationType,
        @Nullable DataSourceHttpConfigAuthorizationConfigAwsIamConfig awsIamConfig) {
        this.authorizationType = authorizationType;
        this.awsIamConfig = awsIamConfig;
    }

    /**
     * The authorization type that the HTTP endpoint requires. Default values is `AWS_IAM`.
     * 
     */
    public Optional<String> getAuthorizationType() {
        return Optional.ofNullable(this.authorizationType);
    }
    /**
     * The Identity and Access Management (IAM) settings. See AWS IAM Config.
     * 
     */
    public Optional<DataSourceHttpConfigAuthorizationConfigAwsIamConfig> getAwsIamConfig() {
        return Optional.ofNullable(this.awsIamConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceHttpConfigAuthorizationConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authorizationType;
        private @Nullable DataSourceHttpConfigAuthorizationConfigAwsIamConfig awsIamConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceHttpConfigAuthorizationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationType = defaults.authorizationType;
    	      this.awsIamConfig = defaults.awsIamConfig;
        }

        public Builder setAuthorizationType(@Nullable String authorizationType) {
            this.authorizationType = authorizationType;
            return this;
        }

        public Builder setAwsIamConfig(@Nullable DataSourceHttpConfigAuthorizationConfigAwsIamConfig awsIamConfig) {
            this.awsIamConfig = awsIamConfig;
            return this;
        }
        public DataSourceHttpConfigAuthorizationConfig build() {
            return new DataSourceHttpConfigAuthorizationConfig(authorizationType, awsIamConfig);
        }
    }
}
