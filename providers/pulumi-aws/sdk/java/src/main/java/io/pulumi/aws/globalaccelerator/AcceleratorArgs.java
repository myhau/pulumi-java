// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.globalaccelerator;

import io.pulumi.aws.globalaccelerator.inputs.AcceleratorAttributesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AcceleratorArgs extends io.pulumi.resources.ResourceArgs {

    public static final AcceleratorArgs Empty = new AcceleratorArgs();

    /**
     * The attributes of the accelerator. Fields documented below.
     * 
     */
    @InputImport(name="attributes")
      private final @Nullable Input<AcceleratorAttributesArgs> attributes;

    public Input<AcceleratorAttributesArgs> getAttributes() {
        return this.attributes == null ? Input.empty() : this.attributes;
    }

    /**
     * Indicates whether the accelerator is enabled. Defaults to `true`. Valid values: `true`, `false`.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * The value for the address type. Defaults to `IPV4`. Valid values: `IPV4`.
     * 
     */
    @InputImport(name="ipAddressType")
      private final @Nullable Input<String> ipAddressType;

    public Input<String> getIpAddressType() {
        return this.ipAddressType == null ? Input.empty() : this.ipAddressType;
    }

    /**
     * The name of the accelerator.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public AcceleratorArgs(
        @Nullable Input<AcceleratorAttributesArgs> attributes,
        @Nullable Input<Boolean> enabled,
        @Nullable Input<String> ipAddressType,
        @Nullable Input<String> name,
        @Nullable Input<Map<String,String>> tags) {
        this.attributes = attributes;
        this.enabled = enabled;
        this.ipAddressType = ipAddressType;
        this.name = name;
        this.tags = tags;
    }

    private AcceleratorArgs() {
        this.attributes = Input.empty();
        this.enabled = Input.empty();
        this.ipAddressType = Input.empty();
        this.name = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AcceleratorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AcceleratorAttributesArgs> attributes;
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<String> ipAddressType;
        private @Nullable Input<String> name;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(AcceleratorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.enabled = defaults.enabled;
    	      this.ipAddressType = defaults.ipAddressType;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder setAttributes(@Nullable Input<AcceleratorAttributesArgs> attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder setAttributes(@Nullable AcceleratorAttributesArgs attributes) {
            this.attributes = Input.ofNullable(attributes);
            return this;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setIpAddressType(@Nullable Input<String> ipAddressType) {
            this.ipAddressType = ipAddressType;
            return this;
        }

        public Builder setIpAddressType(@Nullable String ipAddressType) {
            this.ipAddressType = Input.ofNullable(ipAddressType);
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

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public AcceleratorArgs build() {
            return new AcceleratorArgs(attributes, enabled, ipAddressType, name, tags);
        }
    }
}