// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.redshift;

import io.pulumi.aws.redshift.inputs.ParameterGroupParameterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ParameterGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final ParameterGroupArgs Empty = new ParameterGroupArgs();

    /**
     * The description of the Redshift parameter group. Defaults to "Managed by Pulumi".
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The family of the Redshift parameter group.
     * 
     */
    @InputImport(name="family", required=true)
      private final Input<String> family;

    public Input<String> getFamily() {
        return this.family;
    }

    /**
     * The name of the Redshift parameter.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A list of Redshift parameters to apply.
     * 
     */
    @InputImport(name="parameters")
      private final @Nullable Input<List<ParameterGroupParameterArgs>> parameters;

    public Input<List<ParameterGroupParameterArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
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

    public ParameterGroupArgs(
        @Nullable Input<String> description,
        Input<String> family,
        @Nullable Input<String> name,
        @Nullable Input<List<ParameterGroupParameterArgs>> parameters,
        @Nullable Input<Map<String,String>> tags) {
        this.description = description == null ? Input.ofNullable("Managed by Pulumi") : description;
        this.family = Objects.requireNonNull(family, "expected parameter 'family' to be non-null");
        this.name = name;
        this.parameters = parameters;
        this.tags = tags;
    }

    private ParameterGroupArgs() {
        this.description = Input.empty();
        this.family = Input.empty();
        this.name = Input.empty();
        this.parameters = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParameterGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> family;
        private @Nullable Input<String> name;
        private @Nullable Input<List<ParameterGroupParameterArgs>> parameters;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ParameterGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.family = defaults.family;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
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

        public Builder setFamily(Input<String> family) {
            this.family = Objects.requireNonNull(family);
            return this;
        }

        public Builder setFamily(String family) {
            this.family = Input.of(Objects.requireNonNull(family));
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

        public Builder setParameters(@Nullable Input<List<ParameterGroupParameterArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable List<ParameterGroupParameterArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
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
        public ParameterGroupArgs build() {
            return new ParameterGroupArgs(description, family, name, parameters, tags);
        }
    }
}
