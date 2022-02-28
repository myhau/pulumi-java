// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder;

import io.pulumi.aws.imagebuilder.inputs.ImageRecipeBlockDeviceMappingArgs;
import io.pulumi.aws.imagebuilder.inputs.ImageRecipeComponentArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ImageRecipeArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImageRecipeArgs Empty = new ImageRecipeArgs();

    /**
     * Configuration block(s) with block device mappings for the the image recipe. Detailed below.
     * 
     */
    @InputImport(name="blockDeviceMappings")
      private final @Nullable Input<List<ImageRecipeBlockDeviceMappingArgs>> blockDeviceMappings;

    public Input<List<ImageRecipeBlockDeviceMappingArgs>> getBlockDeviceMappings() {
        return this.blockDeviceMappings == null ? Input.empty() : this.blockDeviceMappings;
    }

    /**
     * Ordered configuration block(s) with components for the image recipe. Detailed below.
     * 
     */
    @InputImport(name="components", required=true)
      private final Input<List<ImageRecipeComponentArgs>> components;

    public Input<List<ImageRecipeComponentArgs>> getComponents() {
        return this.components;
    }

    /**
     * Description of the image recipe.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Name of the image recipe.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Platform of the image recipe.
     * 
     */
    @InputImport(name="parentImage", required=true)
      private final Input<String> parentImage;

    public Input<String> getParentImage() {
        return this.parentImage;
    }

    /**
     * Key-value map of resource tags for the image recipe. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Base64 encoded user data. Use this to provide commands or a command script to run when you launch your build instance.
     * 
     */
    @InputImport(name="userDataBase64")
      private final @Nullable Input<String> userDataBase64;

    public Input<String> getUserDataBase64() {
        return this.userDataBase64 == null ? Input.empty() : this.userDataBase64;
    }

    /**
     * Version of the image recipe.
     * 
     */
    @InputImport(name="version", required=true)
      private final Input<String> version;

    public Input<String> getVersion() {
        return this.version;
    }

    /**
     * The working directory to be used during build and test workflows.
     * 
     */
    @InputImport(name="workingDirectory")
      private final @Nullable Input<String> workingDirectory;

    public Input<String> getWorkingDirectory() {
        return this.workingDirectory == null ? Input.empty() : this.workingDirectory;
    }

    public ImageRecipeArgs(
        @Nullable Input<List<ImageRecipeBlockDeviceMappingArgs>> blockDeviceMappings,
        Input<List<ImageRecipeComponentArgs>> components,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        Input<String> parentImage,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> userDataBase64,
        Input<String> version,
        @Nullable Input<String> workingDirectory) {
        this.blockDeviceMappings = blockDeviceMappings;
        this.components = Objects.requireNonNull(components, "expected parameter 'components' to be non-null");
        this.description = description;
        this.name = name;
        this.parentImage = Objects.requireNonNull(parentImage, "expected parameter 'parentImage' to be non-null");
        this.tags = tags;
        this.userDataBase64 = userDataBase64;
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
        this.workingDirectory = workingDirectory;
    }

    private ImageRecipeArgs() {
        this.blockDeviceMappings = Input.empty();
        this.components = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.parentImage = Input.empty();
        this.tags = Input.empty();
        this.userDataBase64 = Input.empty();
        this.version = Input.empty();
        this.workingDirectory = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageRecipeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ImageRecipeBlockDeviceMappingArgs>> blockDeviceMappings;
        private Input<List<ImageRecipeComponentArgs>> components;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private Input<String> parentImage;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> userDataBase64;
        private Input<String> version;
        private @Nullable Input<String> workingDirectory;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageRecipeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blockDeviceMappings = defaults.blockDeviceMappings;
    	      this.components = defaults.components;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.parentImage = defaults.parentImage;
    	      this.tags = defaults.tags;
    	      this.userDataBase64 = defaults.userDataBase64;
    	      this.version = defaults.version;
    	      this.workingDirectory = defaults.workingDirectory;
        }

        public Builder setBlockDeviceMappings(@Nullable Input<List<ImageRecipeBlockDeviceMappingArgs>> blockDeviceMappings) {
            this.blockDeviceMappings = blockDeviceMappings;
            return this;
        }

        public Builder setBlockDeviceMappings(@Nullable List<ImageRecipeBlockDeviceMappingArgs> blockDeviceMappings) {
            this.blockDeviceMappings = Input.ofNullable(blockDeviceMappings);
            return this;
        }

        public Builder setComponents(Input<List<ImageRecipeComponentArgs>> components) {
            this.components = Objects.requireNonNull(components);
            return this;
        }

        public Builder setComponents(List<ImageRecipeComponentArgs> components) {
            this.components = Input.of(Objects.requireNonNull(components));
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

        public Builder setParentImage(Input<String> parentImage) {
            this.parentImage = Objects.requireNonNull(parentImage);
            return this;
        }

        public Builder setParentImage(String parentImage) {
            this.parentImage = Input.of(Objects.requireNonNull(parentImage));
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

        public Builder setUserDataBase64(@Nullable Input<String> userDataBase64) {
            this.userDataBase64 = userDataBase64;
            return this;
        }

        public Builder setUserDataBase64(@Nullable String userDataBase64) {
            this.userDataBase64 = Input.ofNullable(userDataBase64);
            return this;
        }

        public Builder setVersion(Input<String> version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Input.of(Objects.requireNonNull(version));
            return this;
        }

        public Builder setWorkingDirectory(@Nullable Input<String> workingDirectory) {
            this.workingDirectory = workingDirectory;
            return this;
        }

        public Builder setWorkingDirectory(@Nullable String workingDirectory) {
            this.workingDirectory = Input.ofNullable(workingDirectory);
            return this;
        }
        public ImageRecipeArgs build() {
            return new ImageRecipeArgs(blockDeviceMappings, components, description, name, parentImage, tags, userDataBase64, version, workingDirectory);
        }
    }
}
