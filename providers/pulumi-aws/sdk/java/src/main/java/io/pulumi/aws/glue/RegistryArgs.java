// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegistryArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegistryArgs Empty = new RegistryArgs();

    /**
     * A description of the registry.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The Name of the registry.
     * 
     */
    @InputImport(name="registryName", required=true)
      private final Input<String> registryName;

    public Input<String> getRegistryName() {
        return this.registryName;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public RegistryArgs(
        @Nullable Input<String> description,
        Input<String> registryName,
        @Nullable Input<Map<String,String>> tags) {
        this.description = description;
        this.registryName = Objects.requireNonNull(registryName, "expected parameter 'registryName' to be non-null");
        this.tags = tags;
    }

    private RegistryArgs() {
        this.description = Input.empty();
        this.registryName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> registryName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.registryName = defaults.registryName;
    	      this.tags = defaults.tags;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setRegistryName(Input<String> registryName) {
            this.registryName = Objects.requireNonNull(registryName);
            return this;
        }

        public Builder setRegistryName(String registryName) {
            this.registryName = Input.of(Objects.requireNonNull(registryName));
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
        public RegistryArgs build() {
            return new RegistryArgs(description, registryName, tags);
        }
    }
}
