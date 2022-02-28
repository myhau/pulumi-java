// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceProfileState extends io.pulumi.resources.ResourceArgs {

    public static final InstanceProfileState Empty = new InstanceProfileState();

    /**
     * ARN assigned by AWS to the instance profile.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Creation timestamp of the instance profile.
     * 
     */
    @InputImport(name="createDate")
      private final @Nullable Input<String> createDate;

    public Input<String> getCreateDate() {
        return this.createDate == null ? Input.empty() : this.createDate;
    }

    /**
     * Name of the instance profile. If omitted, this provider will assign a random, unique name. Conflicts with `name_prefix`. Can be a string of characters consisting of upper and lowercase alphanumeric characters and these special characters: `_`, `+`, `=`, `,`, `.`, `@`, `-`. Spaces are not allowed.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @InputImport(name="namePrefix")
      private final @Nullable Input<String> namePrefix;

    public Input<String> getNamePrefix() {
        return this.namePrefix == null ? Input.empty() : this.namePrefix;
    }

    /**
     * Path to the instance profile. For more information about paths, see [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) in the IAM User Guide. Can be a string of characters consisting of either a forward slash (`/`) by itself or a string that must begin and end with forward slashes. Can include any ASCII character from the ! (\u0021) through the DEL character (\u007F), including most punctuation characters, digits, and upper and lowercase letters.
     * 
     */
    @InputImport(name="path")
      private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    /**
     * Name of the role to add to the profile.
     * 
     */
    @InputImport(name="role")
      private final @Nullable Input<String> role;

    public Input<String> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    /**
     * Map of resource tags for the IAM Instance Profile. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

    /**
     * [Unique ID][1] assigned by AWS.
     * 
     */
    @InputImport(name="uniqueId")
      private final @Nullable Input<String> uniqueId;

    public Input<String> getUniqueId() {
        return this.uniqueId == null ? Input.empty() : this.uniqueId;
    }

    public InstanceProfileState(
        @Nullable Input<String> arn,
        @Nullable Input<String> createDate,
        @Nullable Input<String> name,
        @Nullable Input<String> namePrefix,
        @Nullable Input<String> path,
        @Nullable Input<String> role,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> uniqueId) {
        this.arn = arn;
        this.createDate = createDate;
        this.name = name;
        this.namePrefix = namePrefix;
        this.path = path;
        this.role = role;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.uniqueId = uniqueId;
    }

    private InstanceProfileState() {
        this.arn = Input.empty();
        this.createDate = Input.empty();
        this.name = Input.empty();
        this.namePrefix = Input.empty();
        this.path = Input.empty();
        this.role = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.uniqueId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceProfileState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> createDate;
        private @Nullable Input<String> name;
        private @Nullable Input<String> namePrefix;
        private @Nullable Input<String> path;
        private @Nullable Input<String> role;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> uniqueId;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceProfileState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createDate = defaults.createDate;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.path = defaults.path;
    	      this.role = defaults.role;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.uniqueId = defaults.uniqueId;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setCreateDate(@Nullable Input<String> createDate) {
            this.createDate = createDate;
            return this;
        }

        public Builder setCreateDate(@Nullable String createDate) {
            this.createDate = Input.ofNullable(createDate);
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

        public Builder setNamePrefix(@Nullable Input<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        public Builder setNamePrefix(@Nullable String namePrefix) {
            this.namePrefix = Input.ofNullable(namePrefix);
            return this;
        }

        public Builder setPath(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public Builder setRole(@Nullable Input<String> role) {
            this.role = role;
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

        public Builder setUniqueId(@Nullable Input<String> uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }

        public Builder setUniqueId(@Nullable String uniqueId) {
            this.uniqueId = Input.ofNullable(uniqueId);
            return this;
        }
        public InstanceProfileState build() {
            return new InstanceProfileState(arn, createDate, name, namePrefix, path, role, tags, tagsAll, uniqueId);
        }
    }
}
