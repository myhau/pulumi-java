// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.datacatalog.inputs.TagFieldGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TagState extends io.pulumi.resources.ResourceArgs {

    public static final TagState Empty = new TagState();

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
    @InputImport(name="fields")
    private final @Nullable Input<List<TagFieldGetArgs>> fields;

    public Input<List<TagFieldGetArgs>> getFields() {
        return this.fields == null ? Input.empty() : this.fields;
    }

    /**
     * The resource name of the tag in URL format. Example:
     * projects/{project_id}/locations/{location}/entrygroups/{entryGroupId}/entries/{entryId}/tags/{tag_id} or
     * projects/{project_id}/locations/{location}/entrygroups/{entryGroupId}/tags/{tag_id} where tag_id is a system-generated
     * identifier. Note that this Tag may not actually be stored in the location in this name.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
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
    @InputImport(name="template")
    private final @Nullable Input<String> template;

    public Input<String> getTemplate() {
        return this.template == null ? Input.empty() : this.template;
    }

    /**
     * The display name of the tag template.
     * 
     */
    @InputImport(name="templateDisplayname")
    private final @Nullable Input<String> templateDisplayname;

    public Input<String> getTemplateDisplayname() {
        return this.templateDisplayname == null ? Input.empty() : this.templateDisplayname;
    }

    public TagState(
        @Nullable Input<String> column,
        @Nullable Input<List<TagFieldGetArgs>> fields,
        @Nullable Input<String> name,
        @Nullable Input<String> parent,
        @Nullable Input<String> template,
        @Nullable Input<String> templateDisplayname) {
        this.column = column;
        this.fields = fields;
        this.name = name;
        this.parent = parent;
        this.template = template;
        this.templateDisplayname = templateDisplayname;
    }

    private TagState() {
        this.column = Input.empty();
        this.fields = Input.empty();
        this.name = Input.empty();
        this.parent = Input.empty();
        this.template = Input.empty();
        this.templateDisplayname = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> column;
        private @Nullable Input<List<TagFieldGetArgs>> fields;
        private @Nullable Input<String> name;
        private @Nullable Input<String> parent;
        private @Nullable Input<String> template;
        private @Nullable Input<String> templateDisplayname;

        public Builder() {
    	      // Empty
        }

        public Builder(TagState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.column = defaults.column;
    	      this.fields = defaults.fields;
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
    	      this.template = defaults.template;
    	      this.templateDisplayname = defaults.templateDisplayname;
        }

        public Builder setColumn(@Nullable Input<String> column) {
            this.column = column;
            return this;
        }

        public Builder setColumn(@Nullable String column) {
            this.column = Input.ofNullable(column);
            return this;
        }

        public Builder setFields(@Nullable Input<List<TagFieldGetArgs>> fields) {
            this.fields = fields;
            return this;
        }

        public Builder setFields(@Nullable List<TagFieldGetArgs> fields) {
            this.fields = Input.ofNullable(fields);
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

        public Builder setParent(@Nullable Input<String> parent) {
            this.parent = parent;
            return this;
        }

        public Builder setParent(@Nullable String parent) {
            this.parent = Input.ofNullable(parent);
            return this;
        }

        public Builder setTemplate(@Nullable Input<String> template) {
            this.template = template;
            return this;
        }

        public Builder setTemplate(@Nullable String template) {
            this.template = Input.ofNullable(template);
            return this;
        }

        public Builder setTemplateDisplayname(@Nullable Input<String> templateDisplayname) {
            this.templateDisplayname = templateDisplayname;
            return this;
        }

        public Builder setTemplateDisplayname(@Nullable String templateDisplayname) {
            this.templateDisplayname = Input.ofNullable(templateDisplayname);
            return this;
        }

        public TagState build() {
            return new TagState(column, fields, name, parent, template, templateDisplayname);
        }
    }
}
