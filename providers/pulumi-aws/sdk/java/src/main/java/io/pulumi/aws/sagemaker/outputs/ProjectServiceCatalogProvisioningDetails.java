// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.outputs;

import io.pulumi.aws.sagemaker.outputs.ProjectServiceCatalogProvisioningDetailsProvisioningParameter;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ProjectServiceCatalogProvisioningDetails {
    /**
     * The path identifier of the product. This value is optional if the product has a default path, and required if the product has more than one path.
     * 
     */
    private final @Nullable String pathId;
    /**
     * The ID of the product to provision.
     * 
     */
    private final String productId;
    /**
     * The ID of the provisioning artifact.
     * 
     */
    private final @Nullable String provisioningArtifactId;
    /**
     * A list of key value pairs that you specify when you provision a product. See Provisioning Parameter below.
     * 
     */
    private final @Nullable List<ProjectServiceCatalogProvisioningDetailsProvisioningParameter> provisioningParameters;

    @OutputCustomType.Constructor({"pathId","productId","provisioningArtifactId","provisioningParameters"})
    private ProjectServiceCatalogProvisioningDetails(
        @Nullable String pathId,
        String productId,
        @Nullable String provisioningArtifactId,
        @Nullable List<ProjectServiceCatalogProvisioningDetailsProvisioningParameter> provisioningParameters) {
        this.pathId = pathId;
        this.productId = Objects.requireNonNull(productId);
        this.provisioningArtifactId = provisioningArtifactId;
        this.provisioningParameters = provisioningParameters;
    }

    /**
     * The path identifier of the product. This value is optional if the product has a default path, and required if the product has more than one path.
     * 
     */
    public Optional<String> getPathId() {
        return Optional.ofNullable(this.pathId);
    }
    /**
     * The ID of the product to provision.
     * 
     */
    public String getProductId() {
        return this.productId;
    }
    /**
     * The ID of the provisioning artifact.
     * 
     */
    public Optional<String> getProvisioningArtifactId() {
        return Optional.ofNullable(this.provisioningArtifactId);
    }
    /**
     * A list of key value pairs that you specify when you provision a product. See Provisioning Parameter below.
     * 
     */
    public List<ProjectServiceCatalogProvisioningDetailsProvisioningParameter> getProvisioningParameters() {
        return this.provisioningParameters == null ? List.of() : this.provisioningParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectServiceCatalogProvisioningDetails defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String pathId;
        private String productId;
        private @Nullable String provisioningArtifactId;
        private @Nullable List<ProjectServiceCatalogProvisioningDetailsProvisioningParameter> provisioningParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectServiceCatalogProvisioningDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pathId = defaults.pathId;
    	      this.productId = defaults.productId;
    	      this.provisioningArtifactId = defaults.provisioningArtifactId;
    	      this.provisioningParameters = defaults.provisioningParameters;
        }

        public Builder setPathId(@Nullable String pathId) {
            this.pathId = pathId;
            return this;
        }

        public Builder setProductId(String productId) {
            this.productId = Objects.requireNonNull(productId);
            return this;
        }

        public Builder setProvisioningArtifactId(@Nullable String provisioningArtifactId) {
            this.provisioningArtifactId = provisioningArtifactId;
            return this;
        }

        public Builder setProvisioningParameters(@Nullable List<ProjectServiceCatalogProvisioningDetailsProvisioningParameter> provisioningParameters) {
            this.provisioningParameters = provisioningParameters;
            return this;
        }
        public ProjectServiceCatalogProvisioningDetails build() {
            return new ProjectServiceCatalogProvisioningDetails(pathId, productId, provisioningArtifactId, provisioningParameters);
        }
    }
}
