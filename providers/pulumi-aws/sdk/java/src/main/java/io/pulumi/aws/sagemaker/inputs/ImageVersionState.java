// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ImageVersionState extends io.pulumi.resources.ResourceArgs {

    public static final ImageVersionState Empty = new ImageVersionState();

    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this Image Version.
     * * `image_arn`- The Amazon Resource Name (ARN) of the image the version is based on.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The registry path of the container image on which this image version is based.
     * 
     */
    @InputImport(name="baseImage")
      private final @Nullable Input<String> baseImage;

    public Input<String> getBaseImage() {
        return this.baseImage == null ? Input.empty() : this.baseImage;
    }

    /**
     * The registry path of the container image that contains this image version.
     * 
     */
    @InputImport(name="containerImage")
      private final @Nullable Input<String> containerImage;

    public Input<String> getContainerImage() {
        return this.containerImage == null ? Input.empty() : this.containerImage;
    }

    @InputImport(name="imageArn")
      private final @Nullable Input<String> imageArn;

    public Input<String> getImageArn() {
        return this.imageArn == null ? Input.empty() : this.imageArn;
    }

    /**
     * The name of the image. Must be unique to your account.
     * 
     */
    @InputImport(name="imageName")
      private final @Nullable Input<String> imageName;

    public Input<String> getImageName() {
        return this.imageName == null ? Input.empty() : this.imageName;
    }

    @InputImport(name="version")
      private final @Nullable Input<Integer> version;

    public Input<Integer> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public ImageVersionState(
        @Nullable Input<String> arn,
        @Nullable Input<String> baseImage,
        @Nullable Input<String> containerImage,
        @Nullable Input<String> imageArn,
        @Nullable Input<String> imageName,
        @Nullable Input<Integer> version) {
        this.arn = arn;
        this.baseImage = baseImage;
        this.containerImage = containerImage;
        this.imageArn = imageArn;
        this.imageName = imageName;
        this.version = version;
    }

    private ImageVersionState() {
        this.arn = Input.empty();
        this.baseImage = Input.empty();
        this.containerImage = Input.empty();
        this.imageArn = Input.empty();
        this.imageName = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageVersionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> baseImage;
        private @Nullable Input<String> containerImage;
        private @Nullable Input<String> imageArn;
        private @Nullable Input<String> imageName;
        private @Nullable Input<Integer> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageVersionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.baseImage = defaults.baseImage;
    	      this.containerImage = defaults.containerImage;
    	      this.imageArn = defaults.imageArn;
    	      this.imageName = defaults.imageName;
    	      this.version = defaults.version;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setBaseImage(@Nullable Input<String> baseImage) {
            this.baseImage = baseImage;
            return this;
        }

        public Builder setBaseImage(@Nullable String baseImage) {
            this.baseImage = Input.ofNullable(baseImage);
            return this;
        }

        public Builder setContainerImage(@Nullable Input<String> containerImage) {
            this.containerImage = containerImage;
            return this;
        }

        public Builder setContainerImage(@Nullable String containerImage) {
            this.containerImage = Input.ofNullable(containerImage);
            return this;
        }

        public Builder setImageArn(@Nullable Input<String> imageArn) {
            this.imageArn = imageArn;
            return this;
        }

        public Builder setImageArn(@Nullable String imageArn) {
            this.imageArn = Input.ofNullable(imageArn);
            return this;
        }

        public Builder setImageName(@Nullable Input<String> imageName) {
            this.imageName = imageName;
            return this;
        }

        public Builder setImageName(@Nullable String imageName) {
            this.imageName = Input.ofNullable(imageName);
            return this;
        }

        public Builder setVersion(@Nullable Input<Integer> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable Integer version) {
            this.version = Input.ofNullable(version);
            return this;
        }
        public ImageVersionState build() {
            return new ImageVersionState(arn, baseImage, containerImage, imageArn, imageName, version);
        }
    }
}
