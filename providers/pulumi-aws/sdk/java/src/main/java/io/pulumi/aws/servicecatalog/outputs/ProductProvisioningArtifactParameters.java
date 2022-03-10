// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ProductProvisioningArtifactParameters {
    /**
     * Description of the provisioning artifact (i.e., version), including how it differs from the previous provisioning artifact.
     * 
     */
    private final @Nullable String description;
    /**
     * Whether AWS Service Catalog stops validating the specified provisioning artifact template even if it is invalid.
     * 
     */
    private final @Nullable Boolean disableTemplateValidation;
    /**
     * Name of the provisioning artifact (for example, `v1`, `v2beta`). No spaces are allowed.
     * 
     */
    private final @Nullable String name;
    /**
     * Template source as the physical ID of the resource that contains the template. Currently only supports CloudFormation stack ARN. Specify the physical ID as `arn:[partition]:cloudformation:[region]:[account ID]:stack/[stack name]/[resource ID]`.
     * 
     */
    private final @Nullable String templatePhysicalId;
    /**
     * Template source as URL of the CloudFormation template in Amazon S3.
     * 
     */
    private final @Nullable String templateUrl;
    /**
     * Type of provisioning artifact. Valid values: `CLOUD_FORMATION_TEMPLATE`, `MARKETPLACE_AMI`, `MARKETPLACE_CAR` (Marketplace Clusters and AWS Resources).
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor({"description","disableTemplateValidation","name","templatePhysicalId","templateUrl","type"})
    private ProductProvisioningArtifactParameters(
        @Nullable String description,
        @Nullable Boolean disableTemplateValidation,
        @Nullable String name,
        @Nullable String templatePhysicalId,
        @Nullable String templateUrl,
        @Nullable String type) {
        this.description = description;
        this.disableTemplateValidation = disableTemplateValidation;
        this.name = name;
        this.templatePhysicalId = templatePhysicalId;
        this.templateUrl = templateUrl;
        this.type = type;
    }

    /**
     * Description of the provisioning artifact (i.e., version), including how it differs from the previous provisioning artifact.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Whether AWS Service Catalog stops validating the specified provisioning artifact template even if it is invalid.
     * 
    */
    public Optional<Boolean> getDisableTemplateValidation() {
        return Optional.ofNullable(this.disableTemplateValidation);
    }
    /**
     * Name of the provisioning artifact (for example, `v1`, `v2beta`). No spaces are allowed.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Template source as the physical ID of the resource that contains the template. Currently only supports CloudFormation stack ARN. Specify the physical ID as `arn:[partition]:cloudformation:[region]:[account ID]:stack/[stack name]/[resource ID]`.
     * 
    */
    public Optional<String> getTemplatePhysicalId() {
        return Optional.ofNullable(this.templatePhysicalId);
    }
    /**
     * Template source as URL of the CloudFormation template in Amazon S3.
     * 
    */
    public Optional<String> getTemplateUrl() {
        return Optional.ofNullable(this.templateUrl);
    }
    /**
     * Type of provisioning artifact. Valid values: `CLOUD_FORMATION_TEMPLATE`, `MARKETPLACE_AMI`, `MARKETPLACE_CAR` (Marketplace Clusters and AWS Resources).
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProductProvisioningArtifactParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable Boolean disableTemplateValidation;
        private @Nullable String name;
        private @Nullable String templatePhysicalId;
        private @Nullable String templateUrl;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ProductProvisioningArtifactParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.disableTemplateValidation = defaults.disableTemplateValidation;
    	      this.name = defaults.name;
    	      this.templatePhysicalId = defaults.templatePhysicalId;
    	      this.templateUrl = defaults.templateUrl;
    	      this.type = defaults.type;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisableTemplateValidation(@Nullable Boolean disableTemplateValidation) {
            this.disableTemplateValidation = disableTemplateValidation;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setTemplatePhysicalId(@Nullable String templatePhysicalId) {
            this.templatePhysicalId = templatePhysicalId;
            return this;
        }

        public Builder setTemplateUrl(@Nullable String templateUrl) {
            this.templateUrl = templateUrl;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public ProductProvisioningArtifactParameters build() {
            return new ProductProvisioningArtifactParameters(description, disableTemplateValidation, name, templatePhysicalId, templateUrl, type);
        }
    }
}