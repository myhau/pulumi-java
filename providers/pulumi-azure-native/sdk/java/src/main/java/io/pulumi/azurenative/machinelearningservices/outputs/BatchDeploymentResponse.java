// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.BatchOutputConfigurationResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.BatchRetrySettingsResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.CodeConfigurationResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.ComputeConfigurationResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.DataPathAssetReferenceResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.IdAssetReferenceResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.OutputPathAssetReferenceResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BatchDeploymentResponse {
    /**
     * Code configuration for the endpoint deployment.
     * 
     */
    private final @Nullable CodeConfigurationResponse codeConfiguration;
    /**
     * Configuration for compute binding.
     * 
     */
    private final @Nullable ComputeConfigurationResponse compute;
    /**
     * Description of the endpoint deployment.
     * 
     */
    private final @Nullable String description;
    /**
     * ARM resource ID of the environment specification for the endpoint deployment.
     * 
     */
    private final @Nullable String environmentId;
    /**
     * Environment variables configuration for the deployment.
     * 
     */
    private final @Nullable Map<String,String> environmentVariables;
    /**
     * Error threshold, if the error count for the entire input goes above this value,
     * the batch inference will be aborted. Range is [-1, int.MaxValue].
     * For FileDataset, this value is the count of file failures.
     * For TabularDataset, this value is the count of record failures.
     * If set to -1 (the lower bound), all failures during batch inference will be ignored.
     * 
     */
    private final @Nullable Integer errorThreshold;
    /**
     * Logging level for batch inference operation.
     * 
     */
    private final @Nullable String loggingLevel;
    /**
     * Size of the mini-batch passed to each batch invocation.
     * For FileDataset, this is the number of files per mini-batch.
     * For TabularDataset, this is the size of the records in bytes, per mini-batch.
     * 
     */
    private final @Nullable Double miniBatchSize;
    /**
     * Reference to the model asset for the endpoint deployment.
     * 
     */
    private final @Nullable Object model;
    /**
     * Output configuration for the batch inference operation.
     * 
     */
    private final @Nullable BatchOutputConfigurationResponse outputConfiguration;
    /**
     * Partition keys list used for Named partitioning.
     * 
     */
    private final @Nullable List<String> partitionKeys;
    /**
     * Property dictionary. Properties can be added, but not removed or altered.
     * 
     */
    private final @Nullable Map<String,String> properties;
    /**
     * Retry Settings for the batch inference operation.
     * 
     */
    private final @Nullable BatchRetrySettingsResponse retrySettings;

    @CustomType.Constructor
    private BatchDeploymentResponse(
        @CustomType.Parameter("codeConfiguration") @Nullable CodeConfigurationResponse codeConfiguration,
        @CustomType.Parameter("compute") @Nullable ComputeConfigurationResponse compute,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("environmentId") @Nullable String environmentId,
        @CustomType.Parameter("environmentVariables") @Nullable Map<String,String> environmentVariables,
        @CustomType.Parameter("errorThreshold") @Nullable Integer errorThreshold,
        @CustomType.Parameter("loggingLevel") @Nullable String loggingLevel,
        @CustomType.Parameter("miniBatchSize") @Nullable Double miniBatchSize,
        @CustomType.Parameter("model") @Nullable Object model,
        @CustomType.Parameter("outputConfiguration") @Nullable BatchOutputConfigurationResponse outputConfiguration,
        @CustomType.Parameter("partitionKeys") @Nullable List<String> partitionKeys,
        @CustomType.Parameter("properties") @Nullable Map<String,String> properties,
        @CustomType.Parameter("retrySettings") @Nullable BatchRetrySettingsResponse retrySettings) {
        this.codeConfiguration = codeConfiguration;
        this.compute = compute;
        this.description = description;
        this.environmentId = environmentId;
        this.environmentVariables = environmentVariables;
        this.errorThreshold = errorThreshold;
        this.loggingLevel = loggingLevel;
        this.miniBatchSize = miniBatchSize;
        this.model = model;
        this.outputConfiguration = outputConfiguration;
        this.partitionKeys = partitionKeys;
        this.properties = properties;
        this.retrySettings = retrySettings;
    }

    /**
     * Code configuration for the endpoint deployment.
     * 
    */
    public Optional<CodeConfigurationResponse> codeConfiguration() {
        return Optional.ofNullable(this.codeConfiguration);
    }
    /**
     * Configuration for compute binding.
     * 
    */
    public Optional<ComputeConfigurationResponse> compute() {
        return Optional.ofNullable(this.compute);
    }
    /**
     * Description of the endpoint deployment.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * ARM resource ID of the environment specification for the endpoint deployment.
     * 
    */
    public Optional<String> environmentId() {
        return Optional.ofNullable(this.environmentId);
    }
    /**
     * Environment variables configuration for the deployment.
     * 
    */
    public Map<String,String> environmentVariables() {
        return this.environmentVariables == null ? Map.of() : this.environmentVariables;
    }
    /**
     * Error threshold, if the error count for the entire input goes above this value,
     * the batch inference will be aborted. Range is [-1, int.MaxValue].
     * For FileDataset, this value is the count of file failures.
     * For TabularDataset, this value is the count of record failures.
     * If set to -1 (the lower bound), all failures during batch inference will be ignored.
     * 
    */
    public Optional<Integer> errorThreshold() {
        return Optional.ofNullable(this.errorThreshold);
    }
    /**
     * Logging level for batch inference operation.
     * 
    */
    public Optional<String> loggingLevel() {
        return Optional.ofNullable(this.loggingLevel);
    }
    /**
     * Size of the mini-batch passed to each batch invocation.
     * For FileDataset, this is the number of files per mini-batch.
     * For TabularDataset, this is the size of the records in bytes, per mini-batch.
     * 
    */
    public Optional<Double> miniBatchSize() {
        return Optional.ofNullable(this.miniBatchSize);
    }
    /**
     * Reference to the model asset for the endpoint deployment.
     * 
    */
    public Optional<Object> model() {
        return Optional.ofNullable(this.model);
    }
    /**
     * Output configuration for the batch inference operation.
     * 
    */
    public Optional<BatchOutputConfigurationResponse> outputConfiguration() {
        return Optional.ofNullable(this.outputConfiguration);
    }
    /**
     * Partition keys list used for Named partitioning.
     * 
    */
    public List<String> partitionKeys() {
        return this.partitionKeys == null ? List.of() : this.partitionKeys;
    }
    /**
     * Property dictionary. Properties can be added, but not removed or altered.
     * 
    */
    public Map<String,String> properties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    /**
     * Retry Settings for the batch inference operation.
     * 
    */
    public Optional<BatchRetrySettingsResponse> retrySettings() {
        return Optional.ofNullable(this.retrySettings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BatchDeploymentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CodeConfigurationResponse codeConfiguration;
        private @Nullable ComputeConfigurationResponse compute;
        private @Nullable String description;
        private @Nullable String environmentId;
        private @Nullable Map<String,String> environmentVariables;
        private @Nullable Integer errorThreshold;
        private @Nullable String loggingLevel;
        private @Nullable Double miniBatchSize;
        private @Nullable Object model;
        private @Nullable BatchOutputConfigurationResponse outputConfiguration;
        private @Nullable List<String> partitionKeys;
        private @Nullable Map<String,String> properties;
        private @Nullable BatchRetrySettingsResponse retrySettings;

        public Builder() {
    	      // Empty
        }

        public Builder(BatchDeploymentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeConfiguration = defaults.codeConfiguration;
    	      this.compute = defaults.compute;
    	      this.description = defaults.description;
    	      this.environmentId = defaults.environmentId;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.errorThreshold = defaults.errorThreshold;
    	      this.loggingLevel = defaults.loggingLevel;
    	      this.miniBatchSize = defaults.miniBatchSize;
    	      this.model = defaults.model;
    	      this.outputConfiguration = defaults.outputConfiguration;
    	      this.partitionKeys = defaults.partitionKeys;
    	      this.properties = defaults.properties;
    	      this.retrySettings = defaults.retrySettings;
        }

        public Builder codeConfiguration(@Nullable CodeConfigurationResponse codeConfiguration) {
            this.codeConfiguration = codeConfiguration;
            return this;
        }
        public Builder compute(@Nullable ComputeConfigurationResponse compute) {
            this.compute = compute;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder environmentId(@Nullable String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public Builder environmentVariables(@Nullable Map<String,String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }
        public Builder errorThreshold(@Nullable Integer errorThreshold) {
            this.errorThreshold = errorThreshold;
            return this;
        }
        public Builder loggingLevel(@Nullable String loggingLevel) {
            this.loggingLevel = loggingLevel;
            return this;
        }
        public Builder miniBatchSize(@Nullable Double miniBatchSize) {
            this.miniBatchSize = miniBatchSize;
            return this;
        }
        public Builder model(@Nullable Object model) {
            this.model = model;
            return this;
        }
        public Builder outputConfiguration(@Nullable BatchOutputConfigurationResponse outputConfiguration) {
            this.outputConfiguration = outputConfiguration;
            return this;
        }
        public Builder partitionKeys(@Nullable List<String> partitionKeys) {
            this.partitionKeys = partitionKeys;
            return this;
        }
        public Builder partitionKeys(String... partitionKeys) {
            return partitionKeys(List.of(partitionKeys));
        }
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }
        public Builder retrySettings(@Nullable BatchRetrySettingsResponse retrySettings) {
            this.retrySettings = retrySettings;
            return this;
        }        public BatchDeploymentResponse build() {
            return new BatchDeploymentResponse(codeConfiguration, compute, description, environmentId, environmentVariables, errorThreshold, loggingLevel, miniBatchSize, model, outputConfiguration, partitionKeys, properties, retrySettings);
        }
    }
}
