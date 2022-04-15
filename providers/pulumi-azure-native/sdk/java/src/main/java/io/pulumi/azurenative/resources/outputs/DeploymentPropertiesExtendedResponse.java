// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.outputs;

import io.pulumi.azurenative.resources.outputs.DebugSettingResponse;
import io.pulumi.azurenative.resources.outputs.DependencyResponse;
import io.pulumi.azurenative.resources.outputs.ErrorResponseResponse;
import io.pulumi.azurenative.resources.outputs.OnErrorDeploymentExtendedResponse;
import io.pulumi.azurenative.resources.outputs.ParametersLinkResponse;
import io.pulumi.azurenative.resources.outputs.ProviderResponse;
import io.pulumi.azurenative.resources.outputs.ResourceReferenceResponse;
import io.pulumi.azurenative.resources.outputs.TemplateLinkResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DeploymentPropertiesExtendedResponse {
    /**
     * The correlation ID of the deployment.
     * 
     */
    private final String correlationId;
    /**
     * The debug setting of the deployment.
     * 
     */
    private final DebugSettingResponse debugSetting;
    /**
     * The list of deployment dependencies.
     * 
     */
    private final List<DependencyResponse> dependencies;
    /**
     * The duration of the template deployment.
     * 
     */
    private final String duration;
    /**
     * The deployment error.
     * 
     */
    private final ErrorResponseResponse error;
    /**
     * The deployment mode. Possible values are Incremental and Complete.
     * 
     */
    private final String mode;
    /**
     * The deployment on error behavior.
     * 
     */
    private final OnErrorDeploymentExtendedResponse onErrorDeployment;
    /**
     * Array of provisioned resources.
     * 
     */
    private final List<ResourceReferenceResponse> outputResources;
    /**
     * Key/value pairs that represent deployment output.
     * 
     */
    private final Object outputs;
    /**
     * Deployment parameters.
     * 
     */
    private final Object parameters;
    /**
     * The URI referencing the parameters.
     * 
     */
    private final ParametersLinkResponse parametersLink;
    /**
     * The list of resource providers needed for the deployment.
     * 
     */
    private final List<ProviderResponse> providers;
    /**
     * Denotes the state of provisioning.
     * 
     */
    private final String provisioningState;
    /**
     * The hash produced for the template.
     * 
     */
    private final String templateHash;
    /**
     * The URI referencing the template.
     * 
     */
    private final TemplateLinkResponse templateLink;
    /**
     * The timestamp of the template deployment.
     * 
     */
    private final String timestamp;
    /**
     * Array of validated resources.
     * 
     */
    private final List<ResourceReferenceResponse> validatedResources;

    @CustomType.Constructor
    private DeploymentPropertiesExtendedResponse(
        @CustomType.Parameter("correlationId") String correlationId,
        @CustomType.Parameter("debugSetting") DebugSettingResponse debugSetting,
        @CustomType.Parameter("dependencies") List<DependencyResponse> dependencies,
        @CustomType.Parameter("duration") String duration,
        @CustomType.Parameter("error") ErrorResponseResponse error,
        @CustomType.Parameter("mode") String mode,
        @CustomType.Parameter("onErrorDeployment") OnErrorDeploymentExtendedResponse onErrorDeployment,
        @CustomType.Parameter("outputResources") List<ResourceReferenceResponse> outputResources,
        @CustomType.Parameter("outputs") Object outputs,
        @CustomType.Parameter("parameters") Object parameters,
        @CustomType.Parameter("parametersLink") ParametersLinkResponse parametersLink,
        @CustomType.Parameter("providers") List<ProviderResponse> providers,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("templateHash") String templateHash,
        @CustomType.Parameter("templateLink") TemplateLinkResponse templateLink,
        @CustomType.Parameter("timestamp") String timestamp,
        @CustomType.Parameter("validatedResources") List<ResourceReferenceResponse> validatedResources) {
        this.correlationId = correlationId;
        this.debugSetting = debugSetting;
        this.dependencies = dependencies;
        this.duration = duration;
        this.error = error;
        this.mode = mode;
        this.onErrorDeployment = onErrorDeployment;
        this.outputResources = outputResources;
        this.outputs = outputs;
        this.parameters = parameters;
        this.parametersLink = parametersLink;
        this.providers = providers;
        this.provisioningState = provisioningState;
        this.templateHash = templateHash;
        this.templateLink = templateLink;
        this.timestamp = timestamp;
        this.validatedResources = validatedResources;
    }

    /**
     * The correlation ID of the deployment.
     * 
    */
    public String correlationId() {
        return this.correlationId;
    }
    /**
     * The debug setting of the deployment.
     * 
    */
    public DebugSettingResponse debugSetting() {
        return this.debugSetting;
    }
    /**
     * The list of deployment dependencies.
     * 
    */
    public List<DependencyResponse> dependencies() {
        return this.dependencies;
    }
    /**
     * The duration of the template deployment.
     * 
    */
    public String duration() {
        return this.duration;
    }
    /**
     * The deployment error.
     * 
    */
    public ErrorResponseResponse error() {
        return this.error;
    }
    /**
     * The deployment mode. Possible values are Incremental and Complete.
     * 
    */
    public String mode() {
        return this.mode;
    }
    /**
     * The deployment on error behavior.
     * 
    */
    public OnErrorDeploymentExtendedResponse onErrorDeployment() {
        return this.onErrorDeployment;
    }
    /**
     * Array of provisioned resources.
     * 
    */
    public List<ResourceReferenceResponse> outputResources() {
        return this.outputResources;
    }
    /**
     * Key/value pairs that represent deployment output.
     * 
    */
    public Object outputs() {
        return this.outputs;
    }
    /**
     * Deployment parameters.
     * 
    */
    public Object parameters() {
        return this.parameters;
    }
    /**
     * The URI referencing the parameters.
     * 
    */
    public ParametersLinkResponse parametersLink() {
        return this.parametersLink;
    }
    /**
     * The list of resource providers needed for the deployment.
     * 
    */
    public List<ProviderResponse> providers() {
        return this.providers;
    }
    /**
     * Denotes the state of provisioning.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * The hash produced for the template.
     * 
    */
    public String templateHash() {
        return this.templateHash;
    }
    /**
     * The URI referencing the template.
     * 
    */
    public TemplateLinkResponse templateLink() {
        return this.templateLink;
    }
    /**
     * The timestamp of the template deployment.
     * 
    */
    public String timestamp() {
        return this.timestamp;
    }
    /**
     * Array of validated resources.
     * 
    */
    public List<ResourceReferenceResponse> validatedResources() {
        return this.validatedResources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentPropertiesExtendedResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String correlationId;
        private DebugSettingResponse debugSetting;
        private List<DependencyResponse> dependencies;
        private String duration;
        private ErrorResponseResponse error;
        private String mode;
        private OnErrorDeploymentExtendedResponse onErrorDeployment;
        private List<ResourceReferenceResponse> outputResources;
        private Object outputs;
        private Object parameters;
        private ParametersLinkResponse parametersLink;
        private List<ProviderResponse> providers;
        private String provisioningState;
        private String templateHash;
        private TemplateLinkResponse templateLink;
        private String timestamp;
        private List<ResourceReferenceResponse> validatedResources;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentPropertiesExtendedResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.correlationId = defaults.correlationId;
    	      this.debugSetting = defaults.debugSetting;
    	      this.dependencies = defaults.dependencies;
    	      this.duration = defaults.duration;
    	      this.error = defaults.error;
    	      this.mode = defaults.mode;
    	      this.onErrorDeployment = defaults.onErrorDeployment;
    	      this.outputResources = defaults.outputResources;
    	      this.outputs = defaults.outputs;
    	      this.parameters = defaults.parameters;
    	      this.parametersLink = defaults.parametersLink;
    	      this.providers = defaults.providers;
    	      this.provisioningState = defaults.provisioningState;
    	      this.templateHash = defaults.templateHash;
    	      this.templateLink = defaults.templateLink;
    	      this.timestamp = defaults.timestamp;
    	      this.validatedResources = defaults.validatedResources;
        }

        public Builder correlationId(String correlationId) {
            this.correlationId = Objects.requireNonNull(correlationId);
            return this;
        }
        public Builder debugSetting(DebugSettingResponse debugSetting) {
            this.debugSetting = Objects.requireNonNull(debugSetting);
            return this;
        }
        public Builder dependencies(List<DependencyResponse> dependencies) {
            this.dependencies = Objects.requireNonNull(dependencies);
            return this;
        }
        public Builder dependencies(DependencyResponse... dependencies) {
            return dependencies(List.of(dependencies));
        }
        public Builder duration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }
        public Builder error(ErrorResponseResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }
        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public Builder onErrorDeployment(OnErrorDeploymentExtendedResponse onErrorDeployment) {
            this.onErrorDeployment = Objects.requireNonNull(onErrorDeployment);
            return this;
        }
        public Builder outputResources(List<ResourceReferenceResponse> outputResources) {
            this.outputResources = Objects.requireNonNull(outputResources);
            return this;
        }
        public Builder outputResources(ResourceReferenceResponse... outputResources) {
            return outputResources(List.of(outputResources));
        }
        public Builder outputs(Object outputs) {
            this.outputs = Objects.requireNonNull(outputs);
            return this;
        }
        public Builder parameters(Object parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public Builder parametersLink(ParametersLinkResponse parametersLink) {
            this.parametersLink = Objects.requireNonNull(parametersLink);
            return this;
        }
        public Builder providers(List<ProviderResponse> providers) {
            this.providers = Objects.requireNonNull(providers);
            return this;
        }
        public Builder providers(ProviderResponse... providers) {
            return providers(List.of(providers));
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder templateHash(String templateHash) {
            this.templateHash = Objects.requireNonNull(templateHash);
            return this;
        }
        public Builder templateLink(TemplateLinkResponse templateLink) {
            this.templateLink = Objects.requireNonNull(templateLink);
            return this;
        }
        public Builder timestamp(String timestamp) {
            this.timestamp = Objects.requireNonNull(timestamp);
            return this;
        }
        public Builder validatedResources(List<ResourceReferenceResponse> validatedResources) {
            this.validatedResources = Objects.requireNonNull(validatedResources);
            return this;
        }
        public Builder validatedResources(ResourceReferenceResponse... validatedResources) {
            return validatedResources(List.of(validatedResources));
        }        public DeploymentPropertiesExtendedResponse build() {
            return new DeploymentPropertiesExtendedResponse(correlationId, debugSetting, dependencies, duration, error, mode, onErrorDeployment, outputResources, outputs, parameters, parametersLink, providers, provisioningState, templateHash, templateLink, timestamp, validatedResources);
        }
    }
}
