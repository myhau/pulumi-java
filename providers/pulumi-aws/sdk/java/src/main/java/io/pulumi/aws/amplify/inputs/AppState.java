// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.amplify.inputs;

import io.pulumi.aws.amplify.inputs.AppAutoBranchCreationConfigGetArgs;
import io.pulumi.aws.amplify.inputs.AppCustomRuleGetArgs;
import io.pulumi.aws.amplify.inputs.AppProductionBranchGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppState extends io.pulumi.resources.ResourceArgs {

    public static final AppState Empty = new AppState();

    /**
     * The personal access token for a third-party source control system for an Amplify app. The personal access token is used to create a webhook and a read-only deploy key. The token is not stored.
     * 
     */
    @InputImport(name="accessToken")
      private final @Nullable Input<String> accessToken;

    public Input<String> getAccessToken() {
        return this.accessToken == null ? Input.empty() : this.accessToken;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amplify app.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The automated branch creation configuration for an Amplify app. An `auto_branch_creation_config` block is documented below.
     * 
     */
    @InputImport(name="autoBranchCreationConfig")
      private final @Nullable Input<AppAutoBranchCreationConfigGetArgs> autoBranchCreationConfig;

    public Input<AppAutoBranchCreationConfigGetArgs> getAutoBranchCreationConfig() {
        return this.autoBranchCreationConfig == null ? Input.empty() : this.autoBranchCreationConfig;
    }

    /**
     * The automated branch creation glob patterns for an Amplify app.
     * 
     */
    @InputImport(name="autoBranchCreationPatterns")
      private final @Nullable Input<List<String>> autoBranchCreationPatterns;

    public Input<List<String>> getAutoBranchCreationPatterns() {
        return this.autoBranchCreationPatterns == null ? Input.empty() : this.autoBranchCreationPatterns;
    }

    /**
     * The credentials for basic authorization for an Amplify app.
     * 
     */
    @InputImport(name="basicAuthCredentials")
      private final @Nullable Input<String> basicAuthCredentials;

    public Input<String> getBasicAuthCredentials() {
        return this.basicAuthCredentials == null ? Input.empty() : this.basicAuthCredentials;
    }

    /**
     * The [build specification](https://docs.aws.amazon.com/amplify/latest/userguide/build-settings.html) (build spec) for an Amplify app.
     * 
     */
    @InputImport(name="buildSpec")
      private final @Nullable Input<String> buildSpec;

    public Input<String> getBuildSpec() {
        return this.buildSpec == null ? Input.empty() : this.buildSpec;
    }

    /**
     * The custom rewrite and redirect rules for an Amplify app. A `custom_rule` block is documented below.
     * 
     */
    @InputImport(name="customRules")
      private final @Nullable Input<List<AppCustomRuleGetArgs>> customRules;

    public Input<List<AppCustomRuleGetArgs>> getCustomRules() {
        return this.customRules == null ? Input.empty() : this.customRules;
    }

    /**
     * The default domain for the Amplify app.
     * 
     */
    @InputImport(name="defaultDomain")
      private final @Nullable Input<String> defaultDomain;

    public Input<String> getDefaultDomain() {
        return this.defaultDomain == null ? Input.empty() : this.defaultDomain;
    }

    /**
     * The description for an Amplify app.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Enables automated branch creation for an Amplify app.
     * 
     */
    @InputImport(name="enableAutoBranchCreation")
      private final @Nullable Input<Boolean> enableAutoBranchCreation;

    public Input<Boolean> getEnableAutoBranchCreation() {
        return this.enableAutoBranchCreation == null ? Input.empty() : this.enableAutoBranchCreation;
    }

    /**
     * Enables basic authorization for an Amplify app. This will apply to all branches that are part of this app.
     * 
     */
    @InputImport(name="enableBasicAuth")
      private final @Nullable Input<Boolean> enableBasicAuth;

    public Input<Boolean> getEnableBasicAuth() {
        return this.enableBasicAuth == null ? Input.empty() : this.enableBasicAuth;
    }

    /**
     * Enables auto-building of branches for the Amplify App.
     * 
     */
    @InputImport(name="enableBranchAutoBuild")
      private final @Nullable Input<Boolean> enableBranchAutoBuild;

    public Input<Boolean> getEnableBranchAutoBuild() {
        return this.enableBranchAutoBuild == null ? Input.empty() : this.enableBranchAutoBuild;
    }

    /**
     * Automatically disconnects a branch in the Amplify Console when you delete a branch from your Git repository.
     * 
     */
    @InputImport(name="enableBranchAutoDeletion")
      private final @Nullable Input<Boolean> enableBranchAutoDeletion;

    public Input<Boolean> getEnableBranchAutoDeletion() {
        return this.enableBranchAutoDeletion == null ? Input.empty() : this.enableBranchAutoDeletion;
    }

    /**
     * The environment variables map for an Amplify app.
     * 
     */
    @InputImport(name="environmentVariables")
      private final @Nullable Input<Map<String,String>> environmentVariables;

    public Input<Map<String,String>> getEnvironmentVariables() {
        return this.environmentVariables == null ? Input.empty() : this.environmentVariables;
    }

    /**
     * The AWS Identity and Access Management (IAM) service role for an Amplify app.
     * 
     */
    @InputImport(name="iamServiceRoleArn")
      private final @Nullable Input<String> iamServiceRoleArn;

    public Input<String> getIamServiceRoleArn() {
        return this.iamServiceRoleArn == null ? Input.empty() : this.iamServiceRoleArn;
    }

    /**
     * The name for an Amplify app.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The OAuth token for a third-party source control system for an Amplify app. The OAuth token is used to create a webhook and a read-only deploy key. The OAuth token is not stored.
     * 
     */
    @InputImport(name="oauthToken")
      private final @Nullable Input<String> oauthToken;

    public Input<String> getOauthToken() {
        return this.oauthToken == null ? Input.empty() : this.oauthToken;
    }

    /**
     * The platform or framework for an Amplify app. Valid values: `WEB`.
     * 
     */
    @InputImport(name="platform")
      private final @Nullable Input<String> platform;

    public Input<String> getPlatform() {
        return this.platform == null ? Input.empty() : this.platform;
    }

    /**
     * Describes the information about a production branch for an Amplify app. A `production_branch` block is documented below.
     * 
     */
    @InputImport(name="productionBranches")
      private final @Nullable Input<List<AppProductionBranchGetArgs>> productionBranches;

    public Input<List<AppProductionBranchGetArgs>> getProductionBranches() {
        return this.productionBranches == null ? Input.empty() : this.productionBranches;
    }

    /**
     * The repository for an Amplify app.
     * 
     */
    @InputImport(name="repository")
      private final @Nullable Input<String> repository;

    public Input<String> getRepository() {
        return this.repository == null ? Input.empty() : this.repository;
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
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    public AppState(
        @Nullable Input<String> accessToken,
        @Nullable Input<String> arn,
        @Nullable Input<AppAutoBranchCreationConfigGetArgs> autoBranchCreationConfig,
        @Nullable Input<List<String>> autoBranchCreationPatterns,
        @Nullable Input<String> basicAuthCredentials,
        @Nullable Input<String> buildSpec,
        @Nullable Input<List<AppCustomRuleGetArgs>> customRules,
        @Nullable Input<String> defaultDomain,
        @Nullable Input<String> description,
        @Nullable Input<Boolean> enableAutoBranchCreation,
        @Nullable Input<Boolean> enableBasicAuth,
        @Nullable Input<Boolean> enableBranchAutoBuild,
        @Nullable Input<Boolean> enableBranchAutoDeletion,
        @Nullable Input<Map<String,String>> environmentVariables,
        @Nullable Input<String> iamServiceRoleArn,
        @Nullable Input<String> name,
        @Nullable Input<String> oauthToken,
        @Nullable Input<String> platform,
        @Nullable Input<List<AppProductionBranchGetArgs>> productionBranches,
        @Nullable Input<String> repository,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.accessToken = accessToken;
        this.arn = arn;
        this.autoBranchCreationConfig = autoBranchCreationConfig;
        this.autoBranchCreationPatterns = autoBranchCreationPatterns;
        this.basicAuthCredentials = basicAuthCredentials;
        this.buildSpec = buildSpec;
        this.customRules = customRules;
        this.defaultDomain = defaultDomain;
        this.description = description;
        this.enableAutoBranchCreation = enableAutoBranchCreation;
        this.enableBasicAuth = enableBasicAuth;
        this.enableBranchAutoBuild = enableBranchAutoBuild;
        this.enableBranchAutoDeletion = enableBranchAutoDeletion;
        this.environmentVariables = environmentVariables;
        this.iamServiceRoleArn = iamServiceRoleArn;
        this.name = name;
        this.oauthToken = oauthToken;
        this.platform = platform;
        this.productionBranches = productionBranches;
        this.repository = repository;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private AppState() {
        this.accessToken = Input.empty();
        this.arn = Input.empty();
        this.autoBranchCreationConfig = Input.empty();
        this.autoBranchCreationPatterns = Input.empty();
        this.basicAuthCredentials = Input.empty();
        this.buildSpec = Input.empty();
        this.customRules = Input.empty();
        this.defaultDomain = Input.empty();
        this.description = Input.empty();
        this.enableAutoBranchCreation = Input.empty();
        this.enableBasicAuth = Input.empty();
        this.enableBranchAutoBuild = Input.empty();
        this.enableBranchAutoDeletion = Input.empty();
        this.environmentVariables = Input.empty();
        this.iamServiceRoleArn = Input.empty();
        this.name = Input.empty();
        this.oauthToken = Input.empty();
        this.platform = Input.empty();
        this.productionBranches = Input.empty();
        this.repository = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accessToken;
        private @Nullable Input<String> arn;
        private @Nullable Input<AppAutoBranchCreationConfigGetArgs> autoBranchCreationConfig;
        private @Nullable Input<List<String>> autoBranchCreationPatterns;
        private @Nullable Input<String> basicAuthCredentials;
        private @Nullable Input<String> buildSpec;
        private @Nullable Input<List<AppCustomRuleGetArgs>> customRules;
        private @Nullable Input<String> defaultDomain;
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> enableAutoBranchCreation;
        private @Nullable Input<Boolean> enableBasicAuth;
        private @Nullable Input<Boolean> enableBranchAutoBuild;
        private @Nullable Input<Boolean> enableBranchAutoDeletion;
        private @Nullable Input<Map<String,String>> environmentVariables;
        private @Nullable Input<String> iamServiceRoleArn;
        private @Nullable Input<String> name;
        private @Nullable Input<String> oauthToken;
        private @Nullable Input<String> platform;
        private @Nullable Input<List<AppProductionBranchGetArgs>> productionBranches;
        private @Nullable Input<String> repository;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(AppState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.arn = defaults.arn;
    	      this.autoBranchCreationConfig = defaults.autoBranchCreationConfig;
    	      this.autoBranchCreationPatterns = defaults.autoBranchCreationPatterns;
    	      this.basicAuthCredentials = defaults.basicAuthCredentials;
    	      this.buildSpec = defaults.buildSpec;
    	      this.customRules = defaults.customRules;
    	      this.defaultDomain = defaults.defaultDomain;
    	      this.description = defaults.description;
    	      this.enableAutoBranchCreation = defaults.enableAutoBranchCreation;
    	      this.enableBasicAuth = defaults.enableBasicAuth;
    	      this.enableBranchAutoBuild = defaults.enableBranchAutoBuild;
    	      this.enableBranchAutoDeletion = defaults.enableBranchAutoDeletion;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.iamServiceRoleArn = defaults.iamServiceRoleArn;
    	      this.name = defaults.name;
    	      this.oauthToken = defaults.oauthToken;
    	      this.platform = defaults.platform;
    	      this.productionBranches = defaults.productionBranches;
    	      this.repository = defaults.repository;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder setAccessToken(@Nullable Input<String> accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        public Builder setAccessToken(@Nullable String accessToken) {
            this.accessToken = Input.ofNullable(accessToken);
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

        public Builder setAutoBranchCreationConfig(@Nullable Input<AppAutoBranchCreationConfigGetArgs> autoBranchCreationConfig) {
            this.autoBranchCreationConfig = autoBranchCreationConfig;
            return this;
        }

        public Builder setAutoBranchCreationConfig(@Nullable AppAutoBranchCreationConfigGetArgs autoBranchCreationConfig) {
            this.autoBranchCreationConfig = Input.ofNullable(autoBranchCreationConfig);
            return this;
        }

        public Builder setAutoBranchCreationPatterns(@Nullable Input<List<String>> autoBranchCreationPatterns) {
            this.autoBranchCreationPatterns = autoBranchCreationPatterns;
            return this;
        }

        public Builder setAutoBranchCreationPatterns(@Nullable List<String> autoBranchCreationPatterns) {
            this.autoBranchCreationPatterns = Input.ofNullable(autoBranchCreationPatterns);
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

        public Builder setBuildSpec(@Nullable Input<String> buildSpec) {
            this.buildSpec = buildSpec;
            return this;
        }

        public Builder setBuildSpec(@Nullable String buildSpec) {
            this.buildSpec = Input.ofNullable(buildSpec);
            return this;
        }

        public Builder setCustomRules(@Nullable Input<List<AppCustomRuleGetArgs>> customRules) {
            this.customRules = customRules;
            return this;
        }

        public Builder setCustomRules(@Nullable List<AppCustomRuleGetArgs> customRules) {
            this.customRules = Input.ofNullable(customRules);
            return this;
        }

        public Builder setDefaultDomain(@Nullable Input<String> defaultDomain) {
            this.defaultDomain = defaultDomain;
            return this;
        }

        public Builder setDefaultDomain(@Nullable String defaultDomain) {
            this.defaultDomain = Input.ofNullable(defaultDomain);
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

        public Builder setEnableAutoBranchCreation(@Nullable Input<Boolean> enableAutoBranchCreation) {
            this.enableAutoBranchCreation = enableAutoBranchCreation;
            return this;
        }

        public Builder setEnableAutoBranchCreation(@Nullable Boolean enableAutoBranchCreation) {
            this.enableAutoBranchCreation = Input.ofNullable(enableAutoBranchCreation);
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

        public Builder setEnableBranchAutoBuild(@Nullable Input<Boolean> enableBranchAutoBuild) {
            this.enableBranchAutoBuild = enableBranchAutoBuild;
            return this;
        }

        public Builder setEnableBranchAutoBuild(@Nullable Boolean enableBranchAutoBuild) {
            this.enableBranchAutoBuild = Input.ofNullable(enableBranchAutoBuild);
            return this;
        }

        public Builder setEnableBranchAutoDeletion(@Nullable Input<Boolean> enableBranchAutoDeletion) {
            this.enableBranchAutoDeletion = enableBranchAutoDeletion;
            return this;
        }

        public Builder setEnableBranchAutoDeletion(@Nullable Boolean enableBranchAutoDeletion) {
            this.enableBranchAutoDeletion = Input.ofNullable(enableBranchAutoDeletion);
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

        public Builder setIamServiceRoleArn(@Nullable Input<String> iamServiceRoleArn) {
            this.iamServiceRoleArn = iamServiceRoleArn;
            return this;
        }

        public Builder setIamServiceRoleArn(@Nullable String iamServiceRoleArn) {
            this.iamServiceRoleArn = Input.ofNullable(iamServiceRoleArn);
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

        public Builder setOauthToken(@Nullable Input<String> oauthToken) {
            this.oauthToken = oauthToken;
            return this;
        }

        public Builder setOauthToken(@Nullable String oauthToken) {
            this.oauthToken = Input.ofNullable(oauthToken);
            return this;
        }

        public Builder setPlatform(@Nullable Input<String> platform) {
            this.platform = platform;
            return this;
        }

        public Builder setPlatform(@Nullable String platform) {
            this.platform = Input.ofNullable(platform);
            return this;
        }

        public Builder setProductionBranches(@Nullable Input<List<AppProductionBranchGetArgs>> productionBranches) {
            this.productionBranches = productionBranches;
            return this;
        }

        public Builder setProductionBranches(@Nullable List<AppProductionBranchGetArgs> productionBranches) {
            this.productionBranches = Input.ofNullable(productionBranches);
            return this;
        }

        public Builder setRepository(@Nullable Input<String> repository) {
            this.repository = repository;
            return this;
        }

        public Builder setRepository(@Nullable String repository) {
            this.repository = Input.ofNullable(repository);
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
        public AppState build() {
            return new AppState(accessToken, arn, autoBranchCreationConfig, autoBranchCreationPatterns, basicAuthCredentials, buildSpec, customRules, defaultDomain, description, enableAutoBranchCreation, enableBasicAuth, enableBranchAutoBuild, enableBranchAutoDeletion, environmentVariables, iamServiceRoleArn, name, oauthToken, platform, productionBranches, repository, tags, tagsAll);
        }
    }
}
