// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.neptune.inputs;

import io.pulumi.aws.neptune.inputs.ParameterGroupParameterGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ParameterGroupState extends io.pulumi.resources.ResourceArgs {

    public static final ParameterGroupState Empty = new ParameterGroupState();

    /**
     * The Neptune parameter group Amazon Resource Name (ARN).
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The description of the Neptune parameter group. Defaults to "Managed by Pulumi".
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The family of the Neptune parameter group.
     * 
     */
    @InputImport(name="family")
      private final @Nullable Input<String> family;

    public Input<String> getFamily() {
        return this.family == null ? Input.empty() : this.family;
    }

    /**
     * The name of the Neptune parameter.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A list of Neptune parameters to apply.
     * 
     */
    @InputImport(name="parameters")
      private final @Nullable Input<List<ParameterGroupParameterGetArgs>> parameters;

    public Input<List<ParameterGroupParameterGetArgs>> getParameters() {
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

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    public ParameterGroupState(
        @Nullable Input<String> arn,
        @Nullable Input<String> description,
        @Nullable Input<String> family,
        @Nullable Input<String> name,
        @Nullable Input<List<ParameterGroupParameterGetArgs>> parameters,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.description = description;
        this.family = family;
        this.name = name;
        this.parameters = parameters;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private ParameterGroupState() {
        this.arn = Input.empty();
        this.description = Input.empty();
        this.family = Input.empty();
        this.name = Input.empty();
        this.parameters = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParameterGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> description;
        private @Nullable Input<String> family;
        private @Nullable Input<String> name;
        private @Nullable Input<List<ParameterGroupParameterGetArgs>> parameters;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(ParameterGroupState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.family = defaults.family;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
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

        public Builder setFamily(@Nullable Input<String> family) {
            this.family = family;
            return this;
        }

        public Builder setFamily(@Nullable String family) {
            this.family = Input.ofNullable(family);
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

        public Builder setParameters(@Nullable Input<List<ParameterGroupParameterGetArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable List<ParameterGroupParameterGetArgs> parameters) {
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

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }
        public ParameterGroupState build() {
            return new ParameterGroupState(arn, description, family, name, parameters, tags, tagsAll);
        }
    }
}
