// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appconfiguration;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KeyValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyValueArgs Empty = new KeyValueArgs();

    /**
     * The name of the configuration store.
     * 
     */
    @Import(name="configStoreName", required=true)
      private final Output<String> configStoreName;

    public Output<String> configStoreName() {
        return this.configStoreName;
    }

    /**
     * The content type of the key-value's value.
     * Providing a proper content-type can enable transformations of values when they are retrieved by applications.
     * 
     */
    @Import(name="contentType")
      private final @Nullable Output<String> contentType;

    public Output<String> contentType() {
        return this.contentType == null ? Codegen.empty() : this.contentType;
    }

    /**
     * Identifier of key and label combination. Key and label are joined by $ character. Label is optional.
     * 
     */
    @Import(name="keyValueName")
      private final @Nullable Output<String> keyValueName;

    public Output<String> keyValueName() {
        return this.keyValueName == null ? Codegen.empty() : this.keyValueName;
    }

    /**
     * The name of the resource group to which the container registry belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * A dictionary of tags that can help identify what a key-value may be applicable for.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The value of the key-value.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> value() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public KeyValueArgs(
        Output<String> configStoreName,
        @Nullable Output<String> contentType,
        @Nullable Output<String> keyValueName,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> value) {
        this.configStoreName = Objects.requireNonNull(configStoreName, "expected parameter 'configStoreName' to be non-null");
        this.contentType = contentType;
        this.keyValueName = keyValueName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.value = value;
    }

    private KeyValueArgs() {
        this.configStoreName = Codegen.empty();
        this.contentType = Codegen.empty();
        this.keyValueName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tags = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> configStoreName;
        private @Nullable Output<String> contentType;
        private @Nullable Output<String> keyValueName;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configStoreName = defaults.configStoreName;
    	      this.contentType = defaults.contentType;
    	      this.keyValueName = defaults.keyValueName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.value = defaults.value;
        }

        public Builder configStoreName(Output<String> configStoreName) {
            this.configStoreName = Objects.requireNonNull(configStoreName);
            return this;
        }
        public Builder configStoreName(String configStoreName) {
            this.configStoreName = Output.of(Objects.requireNonNull(configStoreName));
            return this;
        }
        public Builder contentType(@Nullable Output<String> contentType) {
            this.contentType = contentType;
            return this;
        }
        public Builder contentType(@Nullable String contentType) {
            this.contentType = Codegen.ofNullable(contentType);
            return this;
        }
        public Builder keyValueName(@Nullable Output<String> keyValueName) {
            this.keyValueName = keyValueName;
            return this;
        }
        public Builder keyValueName(@Nullable String keyValueName) {
            this.keyValueName = Codegen.ofNullable(keyValueName);
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
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public KeyValueArgs build() {
            return new KeyValueArgs(configStoreName, contentType, keyValueName, resourceGroupName, tags, value);
        }
    }
}
