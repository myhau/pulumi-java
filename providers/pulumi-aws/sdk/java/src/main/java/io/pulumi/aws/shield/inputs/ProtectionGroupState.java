// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.shield.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProtectionGroupState extends io.pulumi.resources.ResourceArgs {

    public static final ProtectionGroupState Empty = new ProtectionGroupState();

    /**
     * Defines how AWS Shield combines resource data for the group in order to detect, mitigate, and report events.
     * 
     */
    @InputImport(name="aggregation")
      private final @Nullable Input<String> aggregation;

    public Input<String> getAggregation() {
        return this.aggregation == null ? Input.empty() : this.aggregation;
    }

    /**
     * The Amazon Resource Names (ARNs) of the resources to include in the protection group. You must set this when you set `pattern` to ARBITRARY and you must not set it for any other `pattern` setting.
     * 
     */
    @InputImport(name="members")
      private final @Nullable Input<List<String>> members;

    public Input<List<String>> getMembers() {
        return this.members == null ? Input.empty() : this.members;
    }

    /**
     * The criteria to use to choose the protected resources for inclusion in the group.
     * 
     */
    @InputImport(name="pattern")
      private final @Nullable Input<String> pattern;

    public Input<String> getPattern() {
        return this.pattern == null ? Input.empty() : this.pattern;
    }

    /**
     * The ARN (Amazon Resource Name) of the protection group.
     * 
     */
    @InputImport(name="protectionGroupArn")
      private final @Nullable Input<String> protectionGroupArn;

    public Input<String> getProtectionGroupArn() {
        return this.protectionGroupArn == null ? Input.empty() : this.protectionGroupArn;
    }

    /**
     * The name of the protection group.
     * 
     */
    @InputImport(name="protectionGroupId")
      private final @Nullable Input<String> protectionGroupId;

    public Input<String> getProtectionGroupId() {
        return this.protectionGroupId == null ? Input.empty() : this.protectionGroupId;
    }

    /**
     * The resource type to include in the protection group. You must set this when you set `pattern` to BY_RESOURCE_TYPE and you must not set it for any other `pattern` setting.
     * 
     */
    @InputImport(name="resourceType")
      private final @Nullable Input<String> resourceType;

    public Input<String> getPropResourceType() {
        return this.resourceType == null ? Input.empty() : this.resourceType;
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    public ProtectionGroupState(
        @Nullable Input<String> aggregation,
        @Nullable Input<List<String>> members,
        @Nullable Input<String> pattern,
        @Nullable Input<String> protectionGroupArn,
        @Nullable Input<String> protectionGroupId,
        @Nullable Input<String> resourceType,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.aggregation = aggregation;
        this.members = members;
        this.pattern = pattern;
        this.protectionGroupArn = protectionGroupArn;
        this.protectionGroupId = protectionGroupId;
        this.resourceType = resourceType;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private ProtectionGroupState() {
        this.aggregation = Input.empty();
        this.members = Input.empty();
        this.pattern = Input.empty();
        this.protectionGroupArn = Input.empty();
        this.protectionGroupId = Input.empty();
        this.resourceType = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProtectionGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> aggregation;
        private @Nullable Input<List<String>> members;
        private @Nullable Input<String> pattern;
        private @Nullable Input<String> protectionGroupArn;
        private @Nullable Input<String> protectionGroupId;
        private @Nullable Input<String> resourceType;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(ProtectionGroupState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregation = defaults.aggregation;
    	      this.members = defaults.members;
    	      this.pattern = defaults.pattern;
    	      this.protectionGroupArn = defaults.protectionGroupArn;
    	      this.protectionGroupId = defaults.protectionGroupId;
    	      this.resourceType = defaults.resourceType;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder setAggregation(@Nullable Input<String> aggregation) {
            this.aggregation = aggregation;
            return this;
        }

        public Builder setAggregation(@Nullable String aggregation) {
            this.aggregation = Input.ofNullable(aggregation);
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

        public Builder setPattern(@Nullable Input<String> pattern) {
            this.pattern = pattern;
            return this;
        }

        public Builder setPattern(@Nullable String pattern) {
            this.pattern = Input.ofNullable(pattern);
            return this;
        }

        public Builder setProtectionGroupArn(@Nullable Input<String> protectionGroupArn) {
            this.protectionGroupArn = protectionGroupArn;
            return this;
        }

        public Builder setProtectionGroupArn(@Nullable String protectionGroupArn) {
            this.protectionGroupArn = Input.ofNullable(protectionGroupArn);
            return this;
        }

        public Builder setProtectionGroupId(@Nullable Input<String> protectionGroupId) {
            this.protectionGroupId = protectionGroupId;
            return this;
        }

        public Builder setProtectionGroupId(@Nullable String protectionGroupId) {
            this.protectionGroupId = Input.ofNullable(protectionGroupId);
            return this;
        }

        public Builder setResourceType(@Nullable Input<String> resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder setResourceType(@Nullable String resourceType) {
            this.resourceType = Input.ofNullable(resourceType);
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
        public ProtectionGroupState build() {
            return new ProtectionGroupState(aggregation, members, pattern, protectionGroupArn, protectionGroupId, resourceType, tags, tagsAll);
        }
    }
}