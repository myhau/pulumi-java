// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Managed identity settings for upstream.
 * 
 */
public final class ManagedIdentitySettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedIdentitySettingsArgs Empty = new ManagedIdentitySettingsArgs();

    /**
     * The Resource indicating the App ID URI of the target resource.
     * It also appears in the aud (audience) claim of the issued token.
     * 
     */
    @Import(name="resource")
      private final @Nullable Output<String> resource;

    public Output<String> resource() {
        return this.resource == null ? Codegen.empty() : this.resource;
    }

    public ManagedIdentitySettingsArgs(@Nullable Output<String> resource) {
        this.resource = resource;
    }

    private ManagedIdentitySettingsArgs() {
        this.resource = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedIdentitySettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> resource;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedIdentitySettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resource = defaults.resource;
        }

        public Builder resource(@Nullable Output<String> resource) {
            this.resource = resource;
            return this;
        }
        public Builder resource(@Nullable String resource) {
            this.resource = Codegen.ofNullable(resource);
            return this;
        }        public ManagedIdentitySettingsArgs build() {
            return new ManagedIdentitySettingsArgs(resource);
        }
    }
}
