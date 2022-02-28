// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.amplify.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AppAutoBranchCreationConfig {
    /**
     * The basic authorization credentials for the autocreated branch.
     * 
     */
    private final @Nullable String basicAuthCredentials;
    /**
     * The build specification (build spec) for the autocreated branch.
     * 
     */
    private final @Nullable String buildSpec;
    /**
     * Enables auto building for the autocreated branch.
     * 
     */
    private final @Nullable Boolean enableAutoBuild;
    /**
     * Enables basic authorization for the autocreated branch.
     * 
     */
    private final @Nullable Boolean enableBasicAuth;
    /**
     * Enables performance mode for the branch.
     * 
     */
    private final @Nullable Boolean enablePerformanceMode;
    /**
     * Enables pull request previews for the autocreated branch.
     * 
     */
    private final @Nullable Boolean enablePullRequestPreview;
    /**
     * The environment variables for the autocreated branch.
     * 
     */
    private final @Nullable Map<String,String> environmentVariables;
    /**
     * The framework for the autocreated branch.
     * 
     */
    private final @Nullable String framework;
    /**
     * The Amplify environment name for the pull request.
     * 
     */
    private final @Nullable String pullRequestEnvironmentName;
    /**
     * Describes the current stage for the autocreated branch. Valid values: `PRODUCTION`, `BETA`, `DEVELOPMENT`, `EXPERIMENTAL`, `PULL_REQUEST`.
     * 
     */
    private final @Nullable String stage;

    @OutputCustomType.Constructor({"basicAuthCredentials","buildSpec","enableAutoBuild","enableBasicAuth","enablePerformanceMode","enablePullRequestPreview","environmentVariables","framework","pullRequestEnvironmentName","stage"})
    private AppAutoBranchCreationConfig(
        @Nullable String basicAuthCredentials,
        @Nullable String buildSpec,
        @Nullable Boolean enableAutoBuild,
        @Nullable Boolean enableBasicAuth,
        @Nullable Boolean enablePerformanceMode,
        @Nullable Boolean enablePullRequestPreview,
        @Nullable Map<String,String> environmentVariables,
        @Nullable String framework,
        @Nullable String pullRequestEnvironmentName,
        @Nullable String stage) {
        this.basicAuthCredentials = basicAuthCredentials;
        this.buildSpec = buildSpec;
        this.enableAutoBuild = enableAutoBuild;
        this.enableBasicAuth = enableBasicAuth;
        this.enablePerformanceMode = enablePerformanceMode;
        this.enablePullRequestPreview = enablePullRequestPreview;
        this.environmentVariables = environmentVariables;
        this.framework = framework;
        this.pullRequestEnvironmentName = pullRequestEnvironmentName;
        this.stage = stage;
    }

    /**
     * The basic authorization credentials for the autocreated branch.
     * 
     */
    public Optional<String> getBasicAuthCredentials() {
        return Optional.ofNullable(this.basicAuthCredentials);
    }
    /**
     * The build specification (build spec) for the autocreated branch.
     * 
     */
    public Optional<String> getBuildSpec() {
        return Optional.ofNullable(this.buildSpec);
    }
    /**
     * Enables auto building for the autocreated branch.
     * 
     */
    public Optional<Boolean> getEnableAutoBuild() {
        return Optional.ofNullable(this.enableAutoBuild);
    }
    /**
     * Enables basic authorization for the autocreated branch.
     * 
     */
    public Optional<Boolean> getEnableBasicAuth() {
        return Optional.ofNullable(this.enableBasicAuth);
    }
    /**
     * Enables performance mode for the branch.
     * 
     */
    public Optional<Boolean> getEnablePerformanceMode() {
        return Optional.ofNullable(this.enablePerformanceMode);
    }
    /**
     * Enables pull request previews for the autocreated branch.
     * 
     */
    public Optional<Boolean> getEnablePullRequestPreview() {
        return Optional.ofNullable(this.enablePullRequestPreview);
    }
    /**
     * The environment variables for the autocreated branch.
     * 
     */
    public Map<String,String> getEnvironmentVariables() {
        return this.environmentVariables == null ? Map.of() : this.environmentVariables;
    }
    /**
     * The framework for the autocreated branch.
     * 
     */
    public Optional<String> getFramework() {
        return Optional.ofNullable(this.framework);
    }
    /**
     * The Amplify environment name for the pull request.
     * 
     */
    public Optional<String> getPullRequestEnvironmentName() {
        return Optional.ofNullable(this.pullRequestEnvironmentName);
    }
    /**
     * Describes the current stage for the autocreated branch. Valid values: `PRODUCTION`, `BETA`, `DEVELOPMENT`, `EXPERIMENTAL`, `PULL_REQUEST`.
     * 
     */
    public Optional<String> getStage() {
        return Optional.ofNullable(this.stage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppAutoBranchCreationConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String basicAuthCredentials;
        private @Nullable String buildSpec;
        private @Nullable Boolean enableAutoBuild;
        private @Nullable Boolean enableBasicAuth;
        private @Nullable Boolean enablePerformanceMode;
        private @Nullable Boolean enablePullRequestPreview;
        private @Nullable Map<String,String> environmentVariables;
        private @Nullable String framework;
        private @Nullable String pullRequestEnvironmentName;
        private @Nullable String stage;

        public Builder() {
    	      // Empty
        }

        public Builder(AppAutoBranchCreationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basicAuthCredentials = defaults.basicAuthCredentials;
    	      this.buildSpec = defaults.buildSpec;
    	      this.enableAutoBuild = defaults.enableAutoBuild;
    	      this.enableBasicAuth = defaults.enableBasicAuth;
    	      this.enablePerformanceMode = defaults.enablePerformanceMode;
    	      this.enablePullRequestPreview = defaults.enablePullRequestPreview;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.framework = defaults.framework;
    	      this.pullRequestEnvironmentName = defaults.pullRequestEnvironmentName;
    	      this.stage = defaults.stage;
        }

        public Builder setBasicAuthCredentials(@Nullable String basicAuthCredentials) {
            this.basicAuthCredentials = basicAuthCredentials;
            return this;
        }

        public Builder setBuildSpec(@Nullable String buildSpec) {
            this.buildSpec = buildSpec;
            return this;
        }

        public Builder setEnableAutoBuild(@Nullable Boolean enableAutoBuild) {
            this.enableAutoBuild = enableAutoBuild;
            return this;
        }

        public Builder setEnableBasicAuth(@Nullable Boolean enableBasicAuth) {
            this.enableBasicAuth = enableBasicAuth;
            return this;
        }

        public Builder setEnablePerformanceMode(@Nullable Boolean enablePerformanceMode) {
            this.enablePerformanceMode = enablePerformanceMode;
            return this;
        }

        public Builder setEnablePullRequestPreview(@Nullable Boolean enablePullRequestPreview) {
            this.enablePullRequestPreview = enablePullRequestPreview;
            return this;
        }

        public Builder setEnvironmentVariables(@Nullable Map<String,String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        public Builder setFramework(@Nullable String framework) {
            this.framework = framework;
            return this;
        }

        public Builder setPullRequestEnvironmentName(@Nullable String pullRequestEnvironmentName) {
            this.pullRequestEnvironmentName = pullRequestEnvironmentName;
            return this;
        }

        public Builder setStage(@Nullable String stage) {
            this.stage = stage;
            return this;
        }
        public AppAutoBranchCreationConfig build() {
            return new AppAutoBranchCreationConfig(basicAuthCredentials, buildSpec, enableAutoBuild, enableBasicAuth, enablePerformanceMode, enablePullRequestPreview, environmentVariables, framework, pullRequestEnvironmentName, stage);
        }
    }
}
