// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.datacatalog.inputs.TagFieldArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TagArgs extends io.pulumi.resources.ResourceArgs {

    public static final TagArgs Empty = new TagArgs();

    /**
     * Resources like Entry can have schemas associated with them. This scope allows users to attach tags to an
     * individual column based on that schema.
     * For attaching a tag to a nested column, use `.` to separate the column names. Example:
     * `outer_column.inner_column`
     * 
     */
    @InputImport(name="column")
    private final @Nullable Input<String> column;

    public Input<String> getColumn() {
        return this.column == null ? Input.empty() : this.column;
    }

    /**
     * This maps the ID of a tag field to the value of and additional information about that field.
     * Valid field IDs are defined by the tag's template. A tag must have at least 1 field and at most 500 fields.
     * Structure is documented below.
     * 
     */
    @InputImport(name="fields", required=true)
    private final Input<List<TagFieldArgs>> fields;

    public Input<List<TagFieldArgs>> getFields() {
        return this.fields;
    }

    /**
     * The name of the parent this tag is attached to. This can be the name of an entry or an entry group. If an entry group, the tag will be attached to
     * all entries in that group.
     * 
     */
    @InputImport(name="parent")
    private final @Nullable Input<String> parent;

    public Input<String> getParent() {
        return this.parent == null ? Input.empty() : this.parent;
    }

    /**
     * The resource name of the tag template that this tag uses. Example:
     * projects/{project_id}/locations/{location}/tagTemplates/{tagTemplateId}
     * This field cannot be modified after creation.
     * 
     */
    @InputImport(name="template", required=true)
    private final Input<String> template;

    public Input<String> getTemplate() {
        return this.template;
    }

    public TagArgs(
        @Nullable Input<String> column,
        Input<List<TagFieldArgs>> fields,
        @Nullable Input<String> parent,
        Input<String> template) {
        this.column = column;
        this.fields = Objects.requireNonNull(fields, "expected parameter 'fields' to be non-null");
        this.parent = parent;
        this.template = Objects.requireNonNull(template, "expected parameter 'template' to be non-null");
    }

    private TagArgs() {
        this.column = Input.empty();
        this.fields = Input.empty();
        this.parent = Input.empty();
        this.template = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> column;
        private Input<List<TagFieldArgs>> fields;
        private @Nullable Input<String> parent;
        private Input<String> template;

        public Builder() {
    	      // Empty
        }

        public Builder(TagArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.column = defaults.column;
    	      this.fields = defaults.fields;
    	      this.parent = defaults.parent;
    	      this.template = defaults.template;
        }

        public Builder setColumn(@Nullable Input<String> column) {
            this.column = column;
            return this;
        }

        public Builder setColumn(@Nullable String column) {
            this.column = Input.ofNullable(column);
            return this;
        }

        public Builder setFields(Input<List<TagFieldArgs>> fields) {
            this.fields = Objects.requireNonNull(fields);
            return this;
        }

        public Builder setFields(List<TagFieldArgs> fields) {
            this.fields = Input.of(Objects.requireNonNull(fields));
            return this;
        }

        public Builder setParent(@Nullable Input<String> parent) {
            this.parent = parent;
            return this;
        }

        public Builder setParent(@Nullable String parent) {
            this.parent = Input.ofNullable(parent);
            return this;
        }

        public Builder setTemplate(Input<String> template) {
            this.template = Objects.requireNonNull(template);
            return this;
        }

        public Builder setTemplate(String template) {
            this.template = Input.of(Objects.requireNonNull(template));
            return this;
        }

        public TagArgs build() {
            return new TagArgs(column, fields, parent, template);
        }
    }
}
