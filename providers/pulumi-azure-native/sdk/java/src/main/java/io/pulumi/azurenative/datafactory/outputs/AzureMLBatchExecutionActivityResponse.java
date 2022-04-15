// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.outputs.ActivityPolicyResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureMLWebServiceFileResponse;
import io.pulumi.azurenative.datafactory.outputs.LinkedServiceReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.UserPropertyResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureMLBatchExecutionActivityResponse {
    /**
     * Activity depends on condition.
     * 
     */
    private final @Nullable List<ActivityDependencyResponse> dependsOn;
    /**
     * Activity description.
     * 
     */
    private final @Nullable String description;
    /**
     * Key,Value pairs to be passed to the Azure ML Batch Execution Service endpoint. Keys must match the names of web service parameters defined in the published Azure ML web service. Values will be passed in the GlobalParameters property of the Azure ML batch execution request.
     * 
     */
    private final @Nullable Map<String,Object> globalParameters;
    /**
     * Linked service reference.
     * 
     */
    private final @Nullable LinkedServiceReferenceResponse linkedServiceName;
    /**
     * Activity name.
     * 
     */
    private final String name;
    /**
     * Activity policy.
     * 
     */
    private final @Nullable ActivityPolicyResponse policy;
    /**
     * Type of activity.
     * Expected value is 'AzureMLBatchExecution'.
     * 
     */
    private final String type;
    /**
     * Activity user properties.
     * 
     */
    private final @Nullable List<UserPropertyResponse> userProperties;
    /**
     * Key,Value pairs, mapping the names of Azure ML endpoint's Web Service Inputs to AzureMLWebServiceFile objects specifying the input Blob locations.. This information will be passed in the WebServiceInputs property of the Azure ML batch execution request.
     * 
     */
    private final @Nullable Map<String,AzureMLWebServiceFileResponse> webServiceInputs;
    /**
     * Key,Value pairs, mapping the names of Azure ML endpoint's Web Service Outputs to AzureMLWebServiceFile objects specifying the output Blob locations. This information will be passed in the WebServiceOutputs property of the Azure ML batch execution request.
     * 
     */
    private final @Nullable Map<String,AzureMLWebServiceFileResponse> webServiceOutputs;

    @CustomType.Constructor
    private AzureMLBatchExecutionActivityResponse(
        @CustomType.Parameter("dependsOn") @Nullable List<ActivityDependencyResponse> dependsOn,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("globalParameters") @Nullable Map<String,Object> globalParameters,
        @CustomType.Parameter("linkedServiceName") @Nullable LinkedServiceReferenceResponse linkedServiceName,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("policy") @Nullable ActivityPolicyResponse policy,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userProperties") @Nullable List<UserPropertyResponse> userProperties,
        @CustomType.Parameter("webServiceInputs") @Nullable Map<String,AzureMLWebServiceFileResponse> webServiceInputs,
        @CustomType.Parameter("webServiceOutputs") @Nullable Map<String,AzureMLWebServiceFileResponse> webServiceOutputs) {
        this.dependsOn = dependsOn;
        this.description = description;
        this.globalParameters = globalParameters;
        this.linkedServiceName = linkedServiceName;
        this.name = name;
        this.policy = policy;
        this.type = type;
        this.userProperties = userProperties;
        this.webServiceInputs = webServiceInputs;
        this.webServiceOutputs = webServiceOutputs;
    }

    /**
     * Activity depends on condition.
     * 
    */
    public List<ActivityDependencyResponse> dependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }
    /**
     * Activity description.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Key,Value pairs to be passed to the Azure ML Batch Execution Service endpoint. Keys must match the names of web service parameters defined in the published Azure ML web service. Values will be passed in the GlobalParameters property of the Azure ML batch execution request.
     * 
    */
    public Map<String,Object> globalParameters() {
        return this.globalParameters == null ? Map.of() : this.globalParameters;
    }
    /**
     * Linked service reference.
     * 
    */
    public Optional<LinkedServiceReferenceResponse> linkedServiceName() {
        return Optional.ofNullable(this.linkedServiceName);
    }
    /**
     * Activity name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Activity policy.
     * 
    */
    public Optional<ActivityPolicyResponse> policy() {
        return Optional.ofNullable(this.policy);
    }
    /**
     * Type of activity.
     * Expected value is 'AzureMLBatchExecution'.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * Activity user properties.
     * 
    */
    public List<UserPropertyResponse> userProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }
    /**
     * Key,Value pairs, mapping the names of Azure ML endpoint's Web Service Inputs to AzureMLWebServiceFile objects specifying the input Blob locations.. This information will be passed in the WebServiceInputs property of the Azure ML batch execution request.
     * 
    */
    public Map<String,AzureMLWebServiceFileResponse> webServiceInputs() {
        return this.webServiceInputs == null ? Map.of() : this.webServiceInputs;
    }
    /**
     * Key,Value pairs, mapping the names of Azure ML endpoint's Web Service Outputs to AzureMLWebServiceFile objects specifying the output Blob locations. This information will be passed in the WebServiceOutputs property of the Azure ML batch execution request.
     * 
    */
    public Map<String,AzureMLWebServiceFileResponse> webServiceOutputs() {
        return this.webServiceOutputs == null ? Map.of() : this.webServiceOutputs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureMLBatchExecutionActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private @Nullable Map<String,Object> globalParameters;
        private @Nullable LinkedServiceReferenceResponse linkedServiceName;
        private String name;
        private @Nullable ActivityPolicyResponse policy;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;
        private @Nullable Map<String,AzureMLWebServiceFileResponse> webServiceInputs;
        private @Nullable Map<String,AzureMLWebServiceFileResponse> webServiceOutputs;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureMLBatchExecutionActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.globalParameters = defaults.globalParameters;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
    	      this.webServiceInputs = defaults.webServiceInputs;
    	      this.webServiceOutputs = defaults.webServiceOutputs;
        }

        public Builder dependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }
        public Builder dependsOn(ActivityDependencyResponse... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder globalParameters(@Nullable Map<String,Object> globalParameters) {
            this.globalParameters = globalParameters;
            return this;
        }
        public Builder linkedServiceName(@Nullable LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder policy(@Nullable ActivityPolicyResponse policy) {
            this.policy = policy;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder userProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public Builder userProperties(UserPropertyResponse... userProperties) {
            return userProperties(List.of(userProperties));
        }
        public Builder webServiceInputs(@Nullable Map<String,AzureMLWebServiceFileResponse> webServiceInputs) {
            this.webServiceInputs = webServiceInputs;
            return this;
        }
        public Builder webServiceOutputs(@Nullable Map<String,AzureMLWebServiceFileResponse> webServiceOutputs) {
            this.webServiceOutputs = webServiceOutputs;
            return this;
        }        public AzureMLBatchExecutionActivityResponse build() {
            return new AzureMLBatchExecutionActivityResponse(dependsOn, description, globalParameters, linkedServiceName, name, policy, type, userProperties, webServiceInputs, webServiceOutputs);
        }
    }
}
