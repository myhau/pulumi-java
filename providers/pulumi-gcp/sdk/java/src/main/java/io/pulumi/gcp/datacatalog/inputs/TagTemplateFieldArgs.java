// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.datacatalog.inputs.TagTemplateFieldTypeArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TagTemplateFieldArgs extends io.pulumi.resources.ResourceArgs {

    public static final TagTemplateFieldArgs Empty = new TagTemplateFieldArgs();

    /**
     * A description for this field.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The display name for this template.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * The identifier for this object. Format specified above.
     * 
     */
    @InputImport(name="fieldId", required=true)
    private final Input<String> fieldId;

    public Input<String> getFieldId() {
        return this.fieldId;
    }

    /**
     * Whether this is a required field. Defaults to false.
     * 
     */
    @InputImport(name="isRequired")
    private final @Nullable Input<Boolean> isRequired;

    public Input<Boolean> getIsRequired() {
        return this.isRequired == null ? Input.empty() : this.isRequired;
    }

    /**
     * - 
     * The resource name of the tag template field in URL format. Example: projects/{project_id}/locations/{location}/tagTemplates/{tagTemplateId}/fields/{field}
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The order of this field with respect to other fields in this tag template.
     * A higher value indicates a more important field. The value can be negative.
     * Multiple fields can have the same order, and field orders within a tag do not have to be sequential.
     * 
     */
    @InputImport(name="order")
    private final @Nullable Input<Integer> order;

    public Input<Integer> getOrder() {
        return this.order == null ? Input.empty() : this.order;
    }

    /**
     * The type of value this tag field can contain.
     * Structure is documented below.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<TagTemplateFieldTypeArgs> type;

    public Input<TagTemplateFieldTypeArgs> getType() {
        return this.type;
    }

    public TagTemplateFieldArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        Input<String> fieldId,
        @Nullable Input<Boolean> isRequired,
        @Nullable Input<String> name,
        @Nullable Input<Integer> order,
        Input<TagTemplateFieldTypeArgs> type) {
        this.description = description;
        this.displayName = displayName;
        this.fieldId = Objects.requireNonNull(fieldId, "expected parameter 'fieldId' to be non-null");
        this.isRequired = isRequired;
        this.name = name;
        this.order = order;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private TagTemplateFieldArgs() {
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.fieldId = Input.empty();
        this.isRequired = Input.empty();
        this.name = Input.empty();
        this.order = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagTemplateFieldArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private Input<String> fieldId;
        private @Nullable Input<Boolean> isRequired;
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> order;
        private Input<TagTemplateFieldTypeArgs> type;

        public Builder() {
    	      // Empty
        }

        public Builder(TagTemplateFieldArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.fieldId = defaults.fieldId;
    	      this.isRequired = defaults.isRequired;
    	      this.name = defaults.name;
    	      this.order = defaults.order;
    	      this.type = defaults.type;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setFieldId(Input<String> fieldId) {
            this.fieldId = Objects.requireNonNull(fieldId);
            return this;
        }

        public Builder setFieldId(String fieldId) {
            this.fieldId = Input.of(Objects.requireNonNull(fieldId));
            return this;
        }

        public Builder setIsRequired(@Nullable Input<Boolean> isRequired) {
            this.isRequired = isRequired;
            return this;
        }

        public Builder setIsRequired(@Nullable Boolean isRequired) {
            this.isRequired = Input.ofNullable(isRequired);
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

        public Builder setOrder(@Nullable Input<Integer> order) {
            this.order = order;
            return this;
        }

        public Builder setOrder(@Nullable Integer order) {
            this.order = Input.ofNullable(order);
            return this;
        }

        public Builder setType(Input<TagTemplateFieldTypeArgs> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(TagTemplateFieldTypeArgs type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public TagTemplateFieldArgs build() {
            return new TagTemplateFieldArgs(description, displayName, fieldId, isRequired, name, order, type);
        }
    }
}
