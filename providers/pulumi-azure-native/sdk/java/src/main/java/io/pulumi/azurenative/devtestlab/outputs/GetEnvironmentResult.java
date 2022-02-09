// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.azurenative.devtestlab.outputs.EnvironmentDeploymentPropertiesResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetEnvironmentResult {
    private final @Nullable String armTemplateDisplayName;
    private final String createdByUser;
    private final @Nullable EnvironmentDeploymentPropertiesResponse deploymentProperties;
    private final String id;
    private final @Nullable String location;
    private final String name;
    private final String provisioningState;
    private final String resourceGroupId;
    private final @Nullable Map<String,String> tags;
    private final String type;
    private final String uniqueIdentifier;

    @OutputCustomType.Constructor({"armTemplateDisplayName","createdByUser","deploymentProperties","id","location","name","provisioningState","resourceGroupId","tags","type","uniqueIdentifier"})
    private GetEnvironmentResult(
        @Nullable String armTemplateDisplayName,
        String createdByUser,
        @Nullable EnvironmentDeploymentPropertiesResponse deploymentProperties,
        String id,
        @Nullable String location,
        String name,
        String provisioningState,
        String resourceGroupId,
        @Nullable Map<String,String> tags,
        String type,
        String uniqueIdentifier) {
        this.armTemplateDisplayName = armTemplateDisplayName;
        this.createdByUser = Objects.requireNonNull(createdByUser);
        this.deploymentProperties = deploymentProperties;
        this.id = Objects.requireNonNull(id);
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.resourceGroupId = Objects.requireNonNull(resourceGroupId);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.uniqueIdentifier = Objects.requireNonNull(uniqueIdentifier);
    }

    public Optional<String> getArmTemplateDisplayName() {
        return Optional.ofNullable(this.armTemplateDisplayName);
    }
    public String getCreatedByUser() {
        return this.createdByUser;
    }
    public Optional<EnvironmentDeploymentPropertiesResponse> getDeploymentProperties() {
        return Optional.ofNullable(this.deploymentProperties);
    }
    public String getId() {
        return this.id;
    }
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    public String getName() {
        return this.name;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }
    public String getUniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String armTemplateDisplayName;
        private String createdByUser;
        private @Nullable EnvironmentDeploymentPropertiesResponse deploymentProperties;
        private String id;
        private @Nullable String location;
        private String name;
        private String provisioningState;
        private String resourceGroupId;
        private @Nullable Map<String,String> tags;
        private String type;
        private String uniqueIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.armTemplateDisplayName = defaults.armTemplateDisplayName;
    	      this.createdByUser = defaults.createdByUser;
    	      this.deploymentProperties = defaults.deploymentProperties;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.uniqueIdentifier = defaults.uniqueIdentifier;
        }

        public Builder setArmTemplateDisplayName(@Nullable String armTemplateDisplayName) {
            this.armTemplateDisplayName = armTemplateDisplayName;
            return this;
        }

        public Builder setCreatedByUser(String createdByUser) {
            this.createdByUser = Objects.requireNonNull(createdByUser);
            return this;
        }

        public Builder setDeploymentProperties(@Nullable EnvironmentDeploymentPropertiesResponse deploymentProperties) {
            this.deploymentProperties = deploymentProperties;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = Objects.requireNonNull(resourceGroupId);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUniqueIdentifier(String uniqueIdentifier) {
            this.uniqueIdentifier = Objects.requireNonNull(uniqueIdentifier);
            return this;
        }

        public GetEnvironmentResult build() {
            return new GetEnvironmentResult(armTemplateDisplayName, createdByUser, deploymentProperties, id, location, name, provisioningState, resourceGroupId, tags, type, uniqueIdentifier);
        }
    }
}