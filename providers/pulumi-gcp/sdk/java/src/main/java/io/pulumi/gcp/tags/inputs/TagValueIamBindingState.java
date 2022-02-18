// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.tags.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.tags.inputs.TagValueIamBindingConditionGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TagValueIamBindingState extends io.pulumi.resources.ResourceArgs {

    public static final TagValueIamBindingState Empty = new TagValueIamBindingState();

    @InputImport(name="condition")
    private final @Nullable Input<TagValueIamBindingConditionGetArgs> condition;

    public Input<TagValueIamBindingConditionGetArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @InputImport(name="etag")
    private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    @InputImport(name="members")
    private final @Nullable Input<List<String>> members;

    public Input<List<String>> getMembers() {
        return this.members == null ? Input.empty() : this.members;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.tags.TagValueIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role")
    private final @Nullable Input<String> role;

    public Input<String> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="tagValue")
    private final @Nullable Input<String> tagValue;

    public Input<String> getTagValue() {
        return this.tagValue == null ? Input.empty() : this.tagValue;
    }

    public TagValueIamBindingState(
        @Nullable Input<TagValueIamBindingConditionGetArgs> condition,
        @Nullable Input<String> etag,
        @Nullable Input<List<String>> members,
        @Nullable Input<String> role,
        @Nullable Input<String> tagValue) {
        this.condition = condition;
        this.etag = etag;
        this.members = members;
        this.role = role;
        this.tagValue = tagValue;
    }

    private TagValueIamBindingState() {
        this.condition = Input.empty();
        this.etag = Input.empty();
        this.members = Input.empty();
        this.role = Input.empty();
        this.tagValue = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagValueIamBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TagValueIamBindingConditionGetArgs> condition;
        private @Nullable Input<String> etag;
        private @Nullable Input<List<String>> members;
        private @Nullable Input<String> role;
        private @Nullable Input<String> tagValue;

        public Builder() {
    	      // Empty
        }

        public Builder(TagValueIamBindingState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.members = defaults.members;
    	      this.role = defaults.role;
    	      this.tagValue = defaults.tagValue;
        }

        public Builder setCondition(@Nullable Input<TagValueIamBindingConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable TagValueIamBindingConditionGetArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setMembers(@Nullable Input<List<String>> members) {
            this.members = members;
            return this;
        }

        public Builder setMembers(@Nullable List<String> members) {
            this.members = Input.ofNullable(members);
            return this;
        }

        public Builder setRole(@Nullable Input<String> role) {
            this.role = role;
            return this;
        }

        public Builder setRole(@Nullable String role) {
            this.role = Input.ofNullable(role);
            return this;
        }

        public Builder setTagValue(@Nullable Input<String> tagValue) {
            this.tagValue = tagValue;
            return this;
        }

        public Builder setTagValue(@Nullable String tagValue) {
            this.tagValue = Input.ofNullable(tagValue);
            return this;
        }

        public TagValueIamBindingState build() {
            return new TagValueIamBindingState(condition, etag, members, role, tagValue);
        }
    }
}
