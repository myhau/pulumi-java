// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ram;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceShareArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceShareArgs Empty = new ResourceShareArgs();

    /**
     * Indicates whether principals outside your organization can be associated with a resource share.
     * 
     */
    @InputImport(name="allowExternalPrincipals")
      private final @Nullable Input<Boolean> allowExternalPrincipals;

    public Input<Boolean> getAllowExternalPrincipals() {
        return this.allowExternalPrincipals == null ? Input.empty() : this.allowExternalPrincipals;
    }

    /**
     * The name of the resource share.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A map of tags to assign to the resource share. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ResourceShareArgs(
        @Nullable Input<Boolean> allowExternalPrincipals,
        @Nullable Input<String> name,
        @Nullable Input<Map<String,String>> tags) {
        this.allowExternalPrincipals = allowExternalPrincipals;
        this.name = name;
        this.tags = tags;
    }

    private ResourceShareArgs() {
        this.allowExternalPrincipals = Input.empty();
        this.name = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceShareArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowExternalPrincipals;
        private @Nullable Input<String> name;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceShareArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowExternalPrincipals = defaults.allowExternalPrincipals;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder setAllowExternalPrincipals(@Nullable Input<Boolean> allowExternalPrincipals) {
            this.allowExternalPrincipals = allowExternalPrincipals;
            return this;
        }

        public Builder setAllowExternalPrincipals(@Nullable Boolean allowExternalPrincipals) {
            this.allowExternalPrincipals = Input.ofNullable(allowExternalPrincipals);
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
        public ResourceShareArgs build() {
            return new ResourceShareArgs(allowExternalPrincipals, name, tags);
        }
    }
}
