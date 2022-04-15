// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices;

import io.pulumi.azurenative.machinelearningservices.enums.VariantType;
import io.pulumi.azurenative.machinelearningservices.inputs.CreateServiceRequestEnvironmentImageRequestArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.CreateServiceRequestKeysArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EndpointVariantArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointVariantArgs Empty = new EndpointVariantArgs();

    /**
     * The compute environment type for the service.
     * Expected value is 'Custom'.
     * 
     */
    @Import(name="computeType", required=true)
      private final Output<String> computeType;

    public Output<String> computeType() {
        return this.computeType;
    }

    /**
     * The description of the service.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The Environment, models and assets needed for inferencing.
     * 
     */
    @Import(name="environmentImageRequest")
      private final @Nullable Output<CreateServiceRequestEnvironmentImageRequestArgs> environmentImageRequest;

    public Output<CreateServiceRequestEnvironmentImageRequestArgs> environmentImageRequest() {
        return this.environmentImageRequest == null ? Codegen.empty() : this.environmentImageRequest;
    }

    /**
     * Is this the default variant.
     * 
     */
    @Import(name="isDefault")
      private final @Nullable Output<Boolean> isDefault;

    public Output<Boolean> isDefault() {
        return this.isDefault == null ? Codegen.empty() : this.isDefault;
    }

    /**
     * The authentication keys.
     * 
     */
    @Import(name="keys")
      private final @Nullable Output<CreateServiceRequestKeysArgs> keys;

    public Output<CreateServiceRequestKeysArgs> keys() {
        return this.keys == null ? Codegen.empty() : this.keys;
    }

    /**
     * The service tag dictionary. Tags are mutable.
     * 
     */
    @Import(name="kvTags")
      private final @Nullable Output<Map<String,String>> kvTags;

    public Output<Map<String,String>> kvTags() {
        return this.kvTags == null ? Codegen.empty() : this.kvTags;
    }

    /**
     * The name of the Azure location/region.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The service properties dictionary. Properties are immutable.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<Map<String,String>> properties;

    public Output<Map<String,String>> properties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    /**
     * Name of the resource group in which workspace is located.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the Azure Machine Learning service.
     * 
     */
    @Import(name="serviceName")
      private final @Nullable Output<String> serviceName;

    public Output<String> serviceName() {
        return this.serviceName == null ? Codegen.empty() : this.serviceName;
    }

    /**
     * The amount of traffic variant receives.
     * 
     */
    @Import(name="trafficPercentile")
      private final @Nullable Output<Double> trafficPercentile;

    public Output<Double> trafficPercentile() {
        return this.trafficPercentile == null ? Codegen.empty() : this.trafficPercentile;
    }

    /**
     * The type of the variant.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<Either<String,VariantType>> type;

    public Output<Either<String,VariantType>> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    /**
     * Name of Azure Machine Learning workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
      private final Output<String> workspaceName;

    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    public EndpointVariantArgs(
        Output<String> computeType,
        @Nullable Output<String> description,
        @Nullable Output<CreateServiceRequestEnvironmentImageRequestArgs> environmentImageRequest,
        @Nullable Output<Boolean> isDefault,
        @Nullable Output<CreateServiceRequestKeysArgs> keys,
        @Nullable Output<Map<String,String>> kvTags,
        @Nullable Output<String> location,
        @Nullable Output<Map<String,String>> properties,
        Output<String> resourceGroupName,
        @Nullable Output<String> serviceName,
        @Nullable Output<Double> trafficPercentile,
        @Nullable Output<Either<String,VariantType>> type,
        Output<String> workspaceName) {
        this.computeType = Objects.requireNonNull(computeType, "expected parameter 'computeType' to be non-null");
        this.description = description;
        this.environmentImageRequest = environmentImageRequest;
        this.isDefault = isDefault;
        this.keys = keys;
        this.kvTags = kvTags;
        this.location = location;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = serviceName;
        this.trafficPercentile = trafficPercentile;
        this.type = type;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private EndpointVariantArgs() {
        this.computeType = Codegen.empty();
        this.description = Codegen.empty();
        this.environmentImageRequest = Codegen.empty();
        this.isDefault = Codegen.empty();
        this.keys = Codegen.empty();
        this.kvTags = Codegen.empty();
        this.location = Codegen.empty();
        this.properties = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.serviceName = Codegen.empty();
        this.trafficPercentile = Codegen.empty();
        this.type = Codegen.empty();
        this.workspaceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointVariantArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> computeType;
        private @Nullable Output<String> description;
        private @Nullable Output<CreateServiceRequestEnvironmentImageRequestArgs> environmentImageRequest;
        private @Nullable Output<Boolean> isDefault;
        private @Nullable Output<CreateServiceRequestKeysArgs> keys;
        private @Nullable Output<Map<String,String>> kvTags;
        private @Nullable Output<String> location;
        private @Nullable Output<Map<String,String>> properties;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> serviceName;
        private @Nullable Output<Double> trafficPercentile;
        private @Nullable Output<Either<String,VariantType>> type;
        private Output<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointVariantArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeType = defaults.computeType;
    	      this.description = defaults.description;
    	      this.environmentImageRequest = defaults.environmentImageRequest;
    	      this.isDefault = defaults.isDefault;
    	      this.keys = defaults.keys;
    	      this.kvTags = defaults.kvTags;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
    	      this.trafficPercentile = defaults.trafficPercentile;
    	      this.type = defaults.type;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder computeType(Output<String> computeType) {
            this.computeType = Objects.requireNonNull(computeType);
            return this;
        }
        public Builder computeType(String computeType) {
            this.computeType = Output.of(Objects.requireNonNull(computeType));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder environmentImageRequest(@Nullable Output<CreateServiceRequestEnvironmentImageRequestArgs> environmentImageRequest) {
            this.environmentImageRequest = environmentImageRequest;
            return this;
        }
        public Builder environmentImageRequest(@Nullable CreateServiceRequestEnvironmentImageRequestArgs environmentImageRequest) {
            this.environmentImageRequest = Codegen.ofNullable(environmentImageRequest);
            return this;
        }
        public Builder isDefault(@Nullable Output<Boolean> isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Builder isDefault(@Nullable Boolean isDefault) {
            this.isDefault = Codegen.ofNullable(isDefault);
            return this;
        }
        public Builder keys(@Nullable Output<CreateServiceRequestKeysArgs> keys) {
            this.keys = keys;
            return this;
        }
        public Builder keys(@Nullable CreateServiceRequestKeysArgs keys) {
            this.keys = Codegen.ofNullable(keys);
            return this;
        }
        public Builder kvTags(@Nullable Output<Map<String,String>> kvTags) {
            this.kvTags = kvTags;
            return this;
        }
        public Builder kvTags(@Nullable Map<String,String> kvTags) {
            this.kvTags = Codegen.ofNullable(kvTags);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = Codegen.ofNullable(properties);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder serviceName(@Nullable Output<String> serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public Builder serviceName(@Nullable String serviceName) {
            this.serviceName = Codegen.ofNullable(serviceName);
            return this;
        }
        public Builder trafficPercentile(@Nullable Output<Double> trafficPercentile) {
            this.trafficPercentile = trafficPercentile;
            return this;
        }
        public Builder trafficPercentile(@Nullable Double trafficPercentile) {
            this.trafficPercentile = Codegen.ofNullable(trafficPercentile);
            return this;
        }
        public Builder type(@Nullable Output<Either<String,VariantType>> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable Either<String,VariantType> type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }
        public Builder workspaceName(Output<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Output.of(Objects.requireNonNull(workspaceName));
            return this;
        }        public EndpointVariantArgs build() {
            return new EndpointVariantArgs(computeType, description, environmentImageRequest, isDefault, keys, kvTags, location, properties, resourceGroupName, serviceName, trafficPercentile, type, workspaceName);
        }
    }
}
