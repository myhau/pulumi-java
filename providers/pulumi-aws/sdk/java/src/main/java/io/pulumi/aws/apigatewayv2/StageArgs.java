// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2;

import io.pulumi.aws.apigatewayv2.inputs.StageAccessLogSettingsArgs;
import io.pulumi.aws.apigatewayv2.inputs.StageDefaultRouteSettingsArgs;
import io.pulumi.aws.apigatewayv2.inputs.StageRouteSettingArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StageArgs extends io.pulumi.resources.ResourceArgs {

    public static final StageArgs Empty = new StageArgs();

    /**
     * Settings for logging access in this stage.
     * Use the `aws.apigateway.Account` resource to configure [permissions for CloudWatch Logging](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-logging.html#set-up-access-logging-permissions).
     * 
     */
    @InputImport(name="accessLogSettings")
      private final @Nullable Input<StageAccessLogSettingsArgs> accessLogSettings;

    public Input<StageAccessLogSettingsArgs> getAccessLogSettings() {
        return this.accessLogSettings == null ? Input.empty() : this.accessLogSettings;
    }

    /**
     * The API identifier.
     * 
     */
    @InputImport(name="apiId", required=true)
      private final Input<String> apiId;

    public Input<String> getApiId() {
        return this.apiId;
    }

    /**
     * Whether updates to an API automatically trigger a new deployment. Defaults to `false`.
     * 
     */
    @InputImport(name="autoDeploy")
      private final @Nullable Input<Boolean> autoDeploy;

    public Input<Boolean> getAutoDeploy() {
        return this.autoDeploy == null ? Input.empty() : this.autoDeploy;
    }

    /**
     * The identifier of a client certificate for the stage. Use the `aws.apigateway.ClientCertificate` resource to configure a client certificate.
     * Supported only for WebSocket APIs.
     * 
     */
    @InputImport(name="clientCertificateId")
      private final @Nullable Input<String> clientCertificateId;

    public Input<String> getClientCertificateId() {
        return this.clientCertificateId == null ? Input.empty() : this.clientCertificateId;
    }

    /**
     * The default route settings for the stage.
     * 
     */
    @InputImport(name="defaultRouteSettings")
      private final @Nullable Input<StageDefaultRouteSettingsArgs> defaultRouteSettings;

    public Input<StageDefaultRouteSettingsArgs> getDefaultRouteSettings() {
        return this.defaultRouteSettings == null ? Input.empty() : this.defaultRouteSettings;
    }

    /**
     * The deployment identifier of the stage. Use the `aws.apigatewayv2.Deployment` resource to configure a deployment.
     * 
     */
    @InputImport(name="deploymentId")
      private final @Nullable Input<String> deploymentId;

    public Input<String> getDeploymentId() {
        return this.deploymentId == null ? Input.empty() : this.deploymentId;
    }

    /**
     * The description for the stage. Must be less than or equal to 1024 characters in length.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The name of the stage. Must be between 1 and 128 characters in length.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Route settings for the stage.
     * 
     */
    @InputImport(name="routeSettings")
      private final @Nullable Input<List<StageRouteSettingArgs>> routeSettings;

    public Input<List<StageRouteSettingArgs>> getRouteSettings() {
        return this.routeSettings == null ? Input.empty() : this.routeSettings;
    }

    /**
     * A map that defines the stage variables for the stage.
     * 
     */
    @InputImport(name="stageVariables")
      private final @Nullable Input<Map<String,String>> stageVariables;

    public Input<Map<String,String>> getStageVariables() {
        return this.stageVariables == null ? Input.empty() : this.stageVariables;
    }

    /**
     * A map of tags to assign to the stage. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public StageArgs(
        @Nullable Input<StageAccessLogSettingsArgs> accessLogSettings,
        Input<String> apiId,
        @Nullable Input<Boolean> autoDeploy,
        @Nullable Input<String> clientCertificateId,
        @Nullable Input<StageDefaultRouteSettingsArgs> defaultRouteSettings,
        @Nullable Input<String> deploymentId,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<List<StageRouteSettingArgs>> routeSettings,
        @Nullable Input<Map<String,String>> stageVariables,
        @Nullable Input<Map<String,String>> tags) {
        this.accessLogSettings = accessLogSettings;
        this.apiId = Objects.requireNonNull(apiId, "expected parameter 'apiId' to be non-null");
        this.autoDeploy = autoDeploy;
        this.clientCertificateId = clientCertificateId;
        this.defaultRouteSettings = defaultRouteSettings;
        this.deploymentId = deploymentId;
        this.description = description;
        this.name = name;
        this.routeSettings = routeSettings;
        this.stageVariables = stageVariables;
        this.tags = tags;
    }

    private StageArgs() {
        this.accessLogSettings = Input.empty();
        this.apiId = Input.empty();
        this.autoDeploy = Input.empty();
        this.clientCertificateId = Input.empty();
        this.defaultRouteSettings = Input.empty();
        this.deploymentId = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.routeSettings = Input.empty();
        this.stageVariables = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<StageAccessLogSettingsArgs> accessLogSettings;
        private Input<String> apiId;
        private @Nullable Input<Boolean> autoDeploy;
        private @Nullable Input<String> clientCertificateId;
        private @Nullable Input<StageDefaultRouteSettingsArgs> defaultRouteSettings;
        private @Nullable Input<String> deploymentId;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<List<StageRouteSettingArgs>> routeSettings;
        private @Nullable Input<Map<String,String>> stageVariables;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(StageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLogSettings = defaults.accessLogSettings;
    	      this.apiId = defaults.apiId;
    	      this.autoDeploy = defaults.autoDeploy;
    	      this.clientCertificateId = defaults.clientCertificateId;
    	      this.defaultRouteSettings = defaults.defaultRouteSettings;
    	      this.deploymentId = defaults.deploymentId;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.routeSettings = defaults.routeSettings;
    	      this.stageVariables = defaults.stageVariables;
    	      this.tags = defaults.tags;
        }

        public Builder setAccessLogSettings(@Nullable Input<StageAccessLogSettingsArgs> accessLogSettings) {
            this.accessLogSettings = accessLogSettings;
            return this;
        }

        public Builder setAccessLogSettings(@Nullable StageAccessLogSettingsArgs accessLogSettings) {
            this.accessLogSettings = Input.ofNullable(accessLogSettings);
            return this;
        }

        public Builder setApiId(Input<String> apiId) {
            this.apiId = Objects.requireNonNull(apiId);
            return this;
        }

        public Builder setApiId(String apiId) {
            this.apiId = Input.of(Objects.requireNonNull(apiId));
            return this;
        }

        public Builder setAutoDeploy(@Nullable Input<Boolean> autoDeploy) {
            this.autoDeploy = autoDeploy;
            return this;
        }

        public Builder setAutoDeploy(@Nullable Boolean autoDeploy) {
            this.autoDeploy = Input.ofNullable(autoDeploy);
            return this;
        }

        public Builder setClientCertificateId(@Nullable Input<String> clientCertificateId) {
            this.clientCertificateId = clientCertificateId;
            return this;
        }

        public Builder setClientCertificateId(@Nullable String clientCertificateId) {
            this.clientCertificateId = Input.ofNullable(clientCertificateId);
            return this;
        }

        public Builder setDefaultRouteSettings(@Nullable Input<StageDefaultRouteSettingsArgs> defaultRouteSettings) {
            this.defaultRouteSettings = defaultRouteSettings;
            return this;
        }

        public Builder setDefaultRouteSettings(@Nullable StageDefaultRouteSettingsArgs defaultRouteSettings) {
            this.defaultRouteSettings = Input.ofNullable(defaultRouteSettings);
            return this;
        }

        public Builder setDeploymentId(@Nullable Input<String> deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }

        public Builder setDeploymentId(@Nullable String deploymentId) {
            this.deploymentId = Input.ofNullable(deploymentId);
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

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRouteSettings(@Nullable Input<List<StageRouteSettingArgs>> routeSettings) {
            this.routeSettings = routeSettings;
            return this;
        }

        public Builder setRouteSettings(@Nullable List<StageRouteSettingArgs> routeSettings) {
            this.routeSettings = Input.ofNullable(routeSettings);
            return this;
        }

        public Builder setStageVariables(@Nullable Input<Map<String,String>> stageVariables) {
            this.stageVariables = stageVariables;
            return this;
        }

        public Builder setStageVariables(@Nullable Map<String,String> stageVariables) {
            this.stageVariables = Input.ofNullable(stageVariables);
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
        public StageArgs build() {
            return new StageArgs(accessLogSettings, apiId, autoDeploy, clientCertificateId, defaultRouteSettings, deploymentId, description, name, routeSettings, stageVariables, tags);
        }
    }
}