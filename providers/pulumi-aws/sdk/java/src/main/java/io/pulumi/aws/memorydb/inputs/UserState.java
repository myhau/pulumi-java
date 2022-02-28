// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.memorydb.inputs;

import io.pulumi.aws.memorydb.inputs.UserAuthenticationModeGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserState extends io.pulumi.resources.ResourceArgs {

    public static final UserState Empty = new UserState();

    /**
     * The access permissions string used for this user.
     * 
     */
    @InputImport(name="accessString")
      private final @Nullable Input<String> accessString;

    public Input<String> getAccessString() {
        return this.accessString == null ? Input.empty() : this.accessString;
    }

    /**
     * The ARN of the user.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Denotes the user's authentication properties. Detailed below.
     * 
     */
    @InputImport(name="authenticationMode")
      private final @Nullable Input<UserAuthenticationModeGetArgs> authenticationMode;

    public Input<UserAuthenticationModeGetArgs> getAuthenticationMode() {
        return this.authenticationMode == null ? Input.empty() : this.authenticationMode;
    }

    /**
     * The minimum engine version supported for the user.
     * * `authentication_mode` configuration block
     * 
     */
    @InputImport(name="minimumEngineVersion")
      private final @Nullable Input<String> minimumEngineVersion;

    public Input<String> getMinimumEngineVersion() {
        return this.minimumEngineVersion == null ? Input.empty() : this.minimumEngineVersion;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * Name of the MemoryDB user. Up to 40 characters.
     * 
     */
    @InputImport(name="userName")
      private final @Nullable Input<String> userName;

    public Input<String> getUserName() {
        return this.userName == null ? Input.empty() : this.userName;
    }

    public UserState(
        @Nullable Input<String> accessString,
        @Nullable Input<String> arn,
        @Nullable Input<UserAuthenticationModeGetArgs> authenticationMode,
        @Nullable Input<String> minimumEngineVersion,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> userName) {
        this.accessString = accessString;
        this.arn = arn;
        this.authenticationMode = authenticationMode;
        this.minimumEngineVersion = minimumEngineVersion;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.userName = userName;
    }

    private UserState() {
        this.accessString = Input.empty();
        this.arn = Input.empty();
        this.authenticationMode = Input.empty();
        this.minimumEngineVersion = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.userName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accessString;
        private @Nullable Input<String> arn;
        private @Nullable Input<UserAuthenticationModeGetArgs> authenticationMode;
        private @Nullable Input<String> minimumEngineVersion;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(UserState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessString = defaults.accessString;
    	      this.arn = defaults.arn;
    	      this.authenticationMode = defaults.authenticationMode;
    	      this.minimumEngineVersion = defaults.minimumEngineVersion;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.userName = defaults.userName;
        }

        public Builder setAccessString(@Nullable Input<String> accessString) {
            this.accessString = accessString;
            return this;
        }

        public Builder setAccessString(@Nullable String accessString) {
            this.accessString = Input.ofNullable(accessString);
            return this;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setAuthenticationMode(@Nullable Input<UserAuthenticationModeGetArgs> authenticationMode) {
            this.authenticationMode = authenticationMode;
            return this;
        }

        public Builder setAuthenticationMode(@Nullable UserAuthenticationModeGetArgs authenticationMode) {
            this.authenticationMode = Input.ofNullable(authenticationMode);
            return this;
        }

        public Builder setMinimumEngineVersion(@Nullable Input<String> minimumEngineVersion) {
            this.minimumEngineVersion = minimumEngineVersion;
            return this;
        }

        public Builder setMinimumEngineVersion(@Nullable String minimumEngineVersion) {
            this.minimumEngineVersion = Input.ofNullable(minimumEngineVersion);
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

        public Builder setUserName(@Nullable Input<String> userName) {
            this.userName = userName;
            return this;
        }

        public Builder setUserName(@Nullable String userName) {
            this.userName = Input.ofNullable(userName);
            return this;
        }
        public UserState build() {
            return new UserState(accessString, arn, authenticationMode, minimumEngineVersion, tags, tagsAll, userName);
        }
    }
}
