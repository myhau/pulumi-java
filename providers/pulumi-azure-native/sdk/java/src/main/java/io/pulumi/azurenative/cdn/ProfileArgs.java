// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn;

import io.pulumi.azurenative.cdn.inputs.SkuArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProfileArgs Empty = new ProfileArgs();

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Name of the CDN profile which is unique within the resource group.
     * 
     */
    @Import(name="profileName")
      private final @Nullable Output<String> profileName;

    public Output<String> profileName() {
        return this.profileName == null ? Codegen.empty() : this.profileName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The pricing tier (defines a CDN provider, feature list and rate) of the CDN profile.
     * 
     */
    @Import(name="sku", required=true)
      private final Output<SkuArgs> sku;

    public Output<SkuArgs> sku() {
        return this.sku;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public ProfileArgs(
        @Nullable Output<String> location,
        @Nullable Output<String> profileName,
        Output<String> resourceGroupName,
        Output<SkuArgs> sku,
        @Nullable Output<Map<String,String>> tags) {
        this.location = location;
        this.profileName = profileName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
        this.tags = tags;
    }

    private ProfileArgs() {
        this.location = Codegen.empty();
        this.profileName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.sku = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> location;
        private @Nullable Output<String> profileName;
        private Output<String> resourceGroupName;
        private Output<SkuArgs> sku;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.profileName = defaults.profileName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder profileName(@Nullable Output<String> profileName) {
            this.profileName = profileName;
            return this;
        }
        public Builder profileName(@Nullable String profileName) {
            this.profileName = Codegen.ofNullable(profileName);
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
        public Builder sku(Output<SkuArgs> sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public Builder sku(SkuArgs sku) {
            this.sku = Output.of(Objects.requireNonNull(sku));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public ProfileArgs build() {
            return new ProfileArgs(location, profileName, resourceGroupName, sku, tags);
        }
    }
}
