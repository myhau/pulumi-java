// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.batch.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ComputeEnvironmentComputeResourcesEc2ConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ComputeEnvironmentComputeResourcesEc2ConfigurationGetArgs Empty = new ComputeEnvironmentComputeResourcesEc2ConfigurationGetArgs();

    /**
     * The AMI ID used for instances launched in the compute environment that match the image type. This setting overrides the `image_id` argument in the `compute_resources` block.
     * 
     */
    @InputImport(name="imageIdOverride")
      private final @Nullable Input<String> imageIdOverride;

    public Input<String> getImageIdOverride() {
        return this.imageIdOverride == null ? Input.empty() : this.imageIdOverride;
    }

    /**
     * The image type to match with the instance type to select an AMI. If the `image_id_override` parameter isn't specified, then a recent [Amazon ECS-optimized Amazon Linux 2 AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami) (`ECS_AL2`) is used.
     * 
     */
    @InputImport(name="imageType")
      private final @Nullable Input<String> imageType;

    public Input<String> getImageType() {
        return this.imageType == null ? Input.empty() : this.imageType;
    }

    public ComputeEnvironmentComputeResourcesEc2ConfigurationGetArgs(
        @Nullable Input<String> imageIdOverride,
        @Nullable Input<String> imageType) {
        this.imageIdOverride = imageIdOverride;
        this.imageType = imageType;
    }

    private ComputeEnvironmentComputeResourcesEc2ConfigurationGetArgs() {
        this.imageIdOverride = Input.empty();
        this.imageType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeEnvironmentComputeResourcesEc2ConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> imageIdOverride;
        private @Nullable Input<String> imageType;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeEnvironmentComputeResourcesEc2ConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageIdOverride = defaults.imageIdOverride;
    	      this.imageType = defaults.imageType;
        }

        public Builder setImageIdOverride(@Nullable Input<String> imageIdOverride) {
            this.imageIdOverride = imageIdOverride;
            return this;
        }

        public Builder setImageIdOverride(@Nullable String imageIdOverride) {
            this.imageIdOverride = Input.ofNullable(imageIdOverride);
            return this;
        }

        public Builder setImageType(@Nullable Input<String> imageType) {
            this.imageType = imageType;
            return this;
        }

        public Builder setImageType(@Nullable String imageType) {
            this.imageType = Input.ofNullable(imageType);
            return this;
        }
        public ComputeEnvironmentComputeResourcesEc2ConfigurationGetArgs build() {
            return new ComputeEnvironmentComputeResourcesEc2ConfigurationGetArgs(imageIdOverride, imageType);
        }
    }
}
