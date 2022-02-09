// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.azurenative.providerhub.inputs.ResourceTypeExtensionOptionsResourceCreationBeginArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceTypeRegistrationPropertiesExtensionOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceTypeRegistrationPropertiesExtensionOptionsArgs Empty = new ResourceTypeRegistrationPropertiesExtensionOptionsArgs();

    @InputImport(name="resourceCreationBegin")
    private final @Nullable Input<ResourceTypeExtensionOptionsResourceCreationBeginArgs> resourceCreationBegin;

    public Input<ResourceTypeExtensionOptionsResourceCreationBeginArgs> getResourceCreationBegin() {
        return this.resourceCreationBegin == null ? Input.empty() : this.resourceCreationBegin;
    }

    public ResourceTypeRegistrationPropertiesExtensionOptionsArgs(@Nullable Input<ResourceTypeExtensionOptionsResourceCreationBeginArgs> resourceCreationBegin) {
        this.resourceCreationBegin = resourceCreationBegin;
    }

    private ResourceTypeRegistrationPropertiesExtensionOptionsArgs() {
        this.resourceCreationBegin = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceTypeRegistrationPropertiesExtensionOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ResourceTypeExtensionOptionsResourceCreationBeginArgs> resourceCreationBegin;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceTypeRegistrationPropertiesExtensionOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceCreationBegin = defaults.resourceCreationBegin;
        }

        public Builder setResourceCreationBegin(@Nullable Input<ResourceTypeExtensionOptionsResourceCreationBeginArgs> resourceCreationBegin) {
            this.resourceCreationBegin = resourceCreationBegin;
            return this;
        }

        public Builder setResourceCreationBegin(@Nullable ResourceTypeExtensionOptionsResourceCreationBeginArgs resourceCreationBegin) {
            this.resourceCreationBegin = Input.ofNullable(resourceCreationBegin);
            return this;
        }

        public ResourceTypeRegistrationPropertiesExtensionOptionsArgs build() {
            return new ResourceTypeRegistrationPropertiesExtensionOptionsArgs(resourceCreationBegin);
        }
    }
}