// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.amplify;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BranchArgs extends io.pulumi.resources.ResourceArgs {

    public static final BranchArgs Empty = new BranchArgs();

    /**
     * The unique ID for an Amplify app.
     * 
     */
    @InputImport(name="appId", required=true)
      private final Input<String> appId;

    public Input<String> getAppId() {
        return this.appId;
    }

    /**
     * The Amazon Resource Name (ARN) for a backend environment that is part of an Amplify app.
     * 
     */
    @InputImport(name="backendEnvironmentArn")
      private final @Nullable Input<String> backendEnvironmentArn;

    public Input<String> getBackendEnvironmentArn() {
        return this.backendEnvironmentArn == null ? Input.empty() : this.backendEnvironmentArn;
    }

    /**
     * The basic authorization credentials for the branch.
     * 
     */
    @InputImport(name="basicAuthCredentials")
      private final @Nullable Input<String> basicAuthCredentials;

    public Input<String> getBasicAuthCredentials() {
        return this.basicAuthCredentials == null ? Input.empty() : this.basicAuthCredentials;
    }

    /**
     * The name for the branch.
     * 
     */
    @InputImport(name="branchName", required=true)
      private final Input<String> branchName;

    public Input<String> getBranchName() {
        return this.branchName;
    }

    /**
     * The description for the branch.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The display name for a branch. This is used as the default domain prefix.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Enables auto building for the branch.
     * 
     */
    @InputImport(name="enableAutoBuild")
      private final @Nullable Input<Boolean> enableAutoBuild;

    public Input<Boolean> getEnableAutoBuild() {
        return this.enableAutoBuild == null ? Input.empty() : this.enableAutoBuild;
    }

    /**
     * Enables basic authorization for the branch.
     * 
     */
    @InputImport(name="enableBasicAuth")
      private final @Nullable Input<Boolean> enableBasicAuth;

    public Input<Boolean> getEnableBasicAuth() {
        return this.enableBasicAuth == null ? Input.empty() : this.enableBasicAuth;
    }

    /**
     * Enables notifications for the branch.
     * 
     */
    @InputImport(name="enableNotification")
      private final @Nullable Input<Boolean> enableNotification;

    public Input<Boolean> getEnableNotification() {
        return this.enableNotification == null ? Input.empty() : this.enableNotification;
    }

    /**
     * Enables performance mode for the branch.
     * 
     */
    @InputImport(name="enablePerformanceMode")
      private final @Nullable Input<Boolean> enablePerformanceMode;

    public Input<Boolean> getEnablePerformanceMode() {
        return this.enablePerformanceMode == null ? Input.empty() : this.enablePerformanceMode;
    }

    /**
     * Enables pull request previews for this branch.
     * 
     */
    @InputImport(name="enablePullRequestPreview")
      private final @Nullable Input<Boolean> enablePullRequestPreview;

    public Input<Boolean> getEnablePullRequestPreview() {
        return this.enablePullRequestPreview == null ? Input.empty() : this.enablePullRequestPreview;
    }

    /**
     * The environment variables for the branch.
     * 
     */
    @InputImport(name="environmentVariables")
      private final @Nullable Input<Map<String,String>> environmentVariables;

    public Input<Map<String,String>> getEnvironmentVariables() {
        return this.environmentVariables == null ? Input.empty() : this.environmentVariables;
    }

    /**
     * The framework for the branch.
     * 
     */
    @InputImport(name="framework")
      private final @Nullable Input<String> framework;

    public Input<String> getFramework() {
        return this.framework == null ? Input.empty() : this.framework;
    }

    /**
     * The Amplify environment name for the pull request.
     * 
     */
    @InputImport(name="pullRequestEnvironmentName")
      private final @Nullable Input<String> pullRequestEnvironmentName;

    public Input<String> getPullRequestEnvironmentName() {
        return this.pullRequestEnvironmentName == null ? Input.empty() : this.pullRequestEnvironmentName;
    }

    /**
     * Describes the current stage for the branch. Valid values: `PRODUCTION`, `BETA`, `DEVELOPMENT`, `EXPERIMENTAL`, `PULL_REQUEST`.
     * 
     */
    @InputImport(name="stage")
      private final @Nullable Input<String> stage;

    public Input<String> getStage() {
        return this.stage == null ? Input.empty() : this.stage;
    }

    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The content Time To Live (TTL) for the website in seconds.
     * 
     */
    @InputImport(name="ttl")
      private final @Nullable Input<String> ttl;

    public Input<String> getTtl() {
        return this.ttl == null ? Input.empty() : this.ttl;
    }

    public BranchArgs(
        Input<String> appId,
        @Nullable Input<String> backendEnvironmentArn,
        @Nullable Input<String> basicAuthCredentials,
        Input<String> branchName,
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        @Nullable Input<Boolean> enableAutoBuild,
        @Nullable Input<Boolean> enableBasicAuth,
        @Nullable Input<Boolean> enableNotification,
        @Nullable Input<Boolean> enablePerformanceMode,
        @Nullable Input<Boolean> enablePullRequestPreview,
        @Nullable Input<Map<String,String>> environmentVariables,
        @Nullable Input<String> framework,
        @Nullable Input<String> pullRequestEnvironmentName,
        @Nullable Input<String> stage,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> ttl) {
        this.appId = Objects.requireNonNull(appId, "expected parameter 'appId' to be non-null");
        this.backendEnvironmentArn = backendEnvironmentArn;
        this.basicAuthCredentials = basicAuthCredentials;
        this.branchName = Objects.requireNonNull(branchName, "expected parameter 'branchName' to be non-null");
        this.description = description;
        this.displayName = displayName;
        this.enableAutoBuild = enableAutoBuild;
        this.enableBasicAuth = enableBasicAuth;
        this.enableNotification = enableNotification;
        this.enablePerformanceMode = enablePerformanceMode;
        this.enablePullRequestPreview = enablePullRequestPreview;
        this.environmentVariables = environmentVariables;
        this.framework = framework;
        this.pullRequestEnvironmentName = pullRequestEnvironmentName;
        this.stage = stage;
        this.tags = tags;
        this.ttl = ttl;
    }

    private BranchArgs() {
        this.appId = Input.empty();
        this.backendEnvironmentArn = Input.empty();
        this.basicAuthCredentials = Input.empty();
        this.branchName = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.enableAutoBuild = Input.empty();
        this.enableBasicAuth = Input.empty();
        this.enableNotification = Input.empty();
        this.enablePerformanceMode = Input.empty();
        this.enablePullRequestPreview = Input.empty();
        this.environmentVariables = Input.empty();
        this.framework = Input.empty();
        this.pullRequestEnvironmentName = Input.empty();
        this.stage = Input.empty();
        this.tags = Input.empty();
        this.ttl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BranchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> appId;
        private @Nullable Input<String> backendEnvironmentArn;
        private @Nullable Input<String> basicAuthCredentials;
        private Input<String> branchName;
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private @Nullable Input<Boolean> enableAutoBuild;
        private @Nullable Input<Boolean> enableBasicAuth;
        private @Nullable Input<Boolean> enableNotification;
        private @Nullable Input<Boolean> enablePerformanceMode;
        private @Nullable Input<Boolean> enablePullRequestPreview;
        private @Nullable Input<Map<String,String>> environmentVariables;
        private @Nullable Input<String> framework;
        private @Nullable Input<String> pullRequestEnvironmentName;
        private @Nullable Input<String> stage;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> ttl;

        public Builder() {
    	      // Empty
        }

        public Builder(BranchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.backendEnvironmentArn = defaults.backendEnvironmentArn;
    	      this.basicAuthCredentials = defaults.basicAuthCredentials;
    	      this.branchName = defaults.branchName;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.enableAutoBuild = defaults.enableAutoBuild;
    	      this.enableBasicAuth = defaults.enableBasicAuth;
    	      this.enableNotification = defaults.enableNotification;
    	      this.enablePerformanceMode = defaults.enablePerformanceMode;
    	      this.enablePullRequestPreview = defaults.enablePullRequestPreview;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.framework = defaults.framework;
    	      this.pullRequestEnvironmentName = defaults.pullRequestEnvironmentName;
    	      this.stage = defaults.stage;
    	      this.tags = defaults.tags;
    	      this.ttl = defaults.ttl;
        }

        public Builder setAppId(Input<String> appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }

        public Builder setAppId(String appId) {
            this.appId = Input.of(Objects.requireNonNull(appId));
            return this;
        }

        public Builder setBackendEnvironmentArn(@Nullable Input<String> backendEnvironmentArn) {
            this.backendEnvironmentArn = backendEnvironmentArn;
            return this;
        }

        public Builder setBackendEnvironmentArn(@Nullable String backendEnvironmentArn) {
            this.backendEnvironmentArn = Input.ofNullable(backendEnvironmentArn);
            return this;
        }

        public Builder setBasicAuthCredentials(@Nullable Input<String> basicAuthCredentials) {
            this.basicAuthCredentials = basicAuthCredentials;
            return this;
        }

        public Builder setBasicAuthCredentials(@Nullable String basicAuthCredentials) {
            this.basicAuthCredentials = Input.ofNullable(basicAuthCredentials);
            return this;
        }

        public Builder setBranchName(Input<String> branchName) {
            this.branchName = Objects.requireNonNull(branchName);
            return this;
        }

        public Builder setBranchName(String branchName) {
            this.branchName = Input.of(Objects.requireNonNull(branchName));
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

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setEnableAutoBuild(@Nullable Input<Boolean> enableAutoBuild) {
            this.enableAutoBuild = enableAutoBuild;
            return this;
        }

        public Builder setEnableAutoBuild(@Nullable Boolean enableAutoBuild) {
            this.enableAutoBuild = Input.ofNullable(enableAutoBuild);
            return this;
        }

        public Builder setEnableBasicAuth(@Nullable Input<Boolean> enableBasicAuth) {
            this.enableBasicAuth = enableBasicAuth;
            return this;
        }

        public Builder setEnableBasicAuth(@Nullable Boolean enableBasicAuth) {
            this.enableBasicAuth = Input.ofNullable(enableBasicAuth);
            return this;
        }

        public Builder setEnableNotification(@Nullable Input<Boolean> enableNotification) {
            this.enableNotification = enableNotification;
            return this;
        }

        public Builder setEnableNotification(@Nullable Boolean enableNotification) {
            this.enableNotification = Input.ofNullable(enableNotification);
            return this;
        }

        public Builder setEnablePerformanceMode(@Nullable Input<Boolean> enablePerformanceMode) {
            this.enablePerformanceMode = enablePerformanceMode;
            return this;
        }

        public Builder setEnablePerformanceMode(@Nullable Boolean enablePerformanceMode) {
            this.enablePerformanceMode = Input.ofNullable(enablePerformanceMode);
            return this;
        }

        public Builder setEnablePullRequestPreview(@Nullable Input<Boolean> enablePullRequestPreview) {
            this.enablePullRequestPreview = enablePullRequestPreview;
            return this;
        }

        public Builder setEnablePullRequestPreview(@Nullable Boolean enablePullRequestPreview) {
            this.enablePullRequestPreview = Input.ofNullable(enablePullRequestPreview);
            return this;
        }

        public Builder setEnvironmentVariables(@Nullable Input<Map<String,String>> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        public Builder setEnvironmentVariables(@Nullable Map<String,String> environmentVariables) {
            this.environmentVariables = Input.ofNullable(environmentVariables);
            return this;
        }

        public Builder setFramework(@Nullable Input<String> framework) {
            this.framework = framework;
            return this;
        }

        public Builder setFramework(@Nullable String framework) {
            this.framework = Input.ofNullable(framework);
            return this;
        }

        public Builder setPullRequestEnvironmentName(@Nullable Input<String> pullRequestEnvironmentName) {
            this.pullRequestEnvironmentName = pullRequestEnvironmentName;
            return this;
        }

        public Builder setPullRequestEnvironmentName(@Nullable String pullRequestEnvironmentName) {
            this.pullRequestEnvironmentName = Input.ofNullable(pullRequestEnvironmentName);
            return this;
        }

        public Builder setStage(@Nullable Input<String> stage) {
            this.stage = stage;
            return this;
        }

        public Builder setStage(@Nullable String stage) {
            this.stage = Input.ofNullable(stage);
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

        public Builder setTtl(@Nullable Input<String> ttl) {
            this.ttl = ttl;
            return this;
        }

        public Builder setTtl(@Nullable String ttl) {
            this.ttl = Input.ofNullable(ttl);
            return this;
        }
        public BranchArgs build() {
            return new BranchArgs(appId, backendEnvironmentArn, basicAuthCredentials, branchName, description, displayName, enableAutoBuild, enableBasicAuth, enableNotification, enablePerformanceMode, enablePullRequestPreview, environmentVariables, framework, pullRequestEnvironmentName, stage, tags, ttl);
        }
    }
}
