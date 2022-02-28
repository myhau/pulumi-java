// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationState extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationState Empty = new ApplicationState();

    /**
     * The application ID.
     * 
     */
    @InputImport(name="applicationId")
      private final @Nullable Input<String> applicationId;

    public Input<String> getApplicationId() {
        return this.applicationId == null ? Input.empty() : this.applicationId;
    }

    /**
     * The ARN of the CodeDeploy application.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The compute platform can either be `ECS`, `Lambda`, or `Server`. Default is `Server`.
     * 
     */
    @InputImport(name="computePlatform")
      private final @Nullable Input<String> computePlatform;

    public Input<String> getComputePlatform() {
        return this.computePlatform == null ? Input.empty() : this.computePlatform;
    }

    /**
     * The name for a connection to a GitHub account.
     * 
     */
    @InputImport(name="githubAccountName")
      private final @Nullable Input<String> githubAccountName;

    public Input<String> getGithubAccountName() {
        return this.githubAccountName == null ? Input.empty() : this.githubAccountName;
    }

    /**
     * Whether the user has authenticated with GitHub for the specified application.
     * 
     */
    @InputImport(name="linkedToGithub")
      private final @Nullable Input<Boolean> linkedToGithub;

    public Input<Boolean> getLinkedToGithub() {
        return this.linkedToGithub == null ? Input.empty() : this.linkedToGithub;
    }

    /**
     * The name of the application.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

    public ApplicationState(
        @Nullable Input<String> applicationId,
        @Nullable Input<String> arn,
        @Nullable Input<String> computePlatform,
        @Nullable Input<String> githubAccountName,
        @Nullable Input<Boolean> linkedToGithub,
        @Nullable Input<String> name,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.applicationId = applicationId;
        this.arn = arn;
        this.computePlatform = computePlatform;
        this.githubAccountName = githubAccountName;
        this.linkedToGithub = linkedToGithub;
        this.name = name;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private ApplicationState() {
        this.applicationId = Input.empty();
        this.arn = Input.empty();
        this.computePlatform = Input.empty();
        this.githubAccountName = Input.empty();
        this.linkedToGithub = Input.empty();
        this.name = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> applicationId;
        private @Nullable Input<String> arn;
        private @Nullable Input<String> computePlatform;
        private @Nullable Input<String> githubAccountName;
        private @Nullable Input<Boolean> linkedToGithub;
        private @Nullable Input<String> name;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.arn = defaults.arn;
    	      this.computePlatform = defaults.computePlatform;
    	      this.githubAccountName = defaults.githubAccountName;
    	      this.linkedToGithub = defaults.linkedToGithub;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder setApplicationId(@Nullable Input<String> applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        public Builder setApplicationId(@Nullable String applicationId) {
            this.applicationId = Input.ofNullable(applicationId);
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

        public Builder setComputePlatform(@Nullable Input<String> computePlatform) {
            this.computePlatform = computePlatform;
            return this;
        }

        public Builder setComputePlatform(@Nullable String computePlatform) {
            this.computePlatform = Input.ofNullable(computePlatform);
            return this;
        }

        public Builder setGithubAccountName(@Nullable Input<String> githubAccountName) {
            this.githubAccountName = githubAccountName;
            return this;
        }

        public Builder setGithubAccountName(@Nullable String githubAccountName) {
            this.githubAccountName = Input.ofNullable(githubAccountName);
            return this;
        }

        public Builder setLinkedToGithub(@Nullable Input<Boolean> linkedToGithub) {
            this.linkedToGithub = linkedToGithub;
            return this;
        }

        public Builder setLinkedToGithub(@Nullable Boolean linkedToGithub) {
            this.linkedToGithub = Input.ofNullable(linkedToGithub);
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

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }
        public ApplicationState build() {
            return new ApplicationState(applicationId, arn, computePlatform, githubAccountName, linkedToGithub, name, tags, tagsAll);
        }
    }
}
