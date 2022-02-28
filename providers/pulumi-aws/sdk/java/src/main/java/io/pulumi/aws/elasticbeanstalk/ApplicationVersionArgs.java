// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticbeanstalk;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationVersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationVersionArgs Empty = new ApplicationVersionArgs();

    /**
     * Name of the Beanstalk Application the version is associated with.
     * 
     */
    @InputImport(name="application", required=true)
      private final Input<String> application;

    public Input<String> getApplication() {
        return this.application;
    }

    /**
     * S3 bucket that contains the Application Version source bundle.
     * 
     */
    @InputImport(name="bucket", required=true)
      private final Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket;
    }

    /**
     * Short description of the Application Version.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * On delete, force an Application Version to be deleted when it may be in use by multiple Elastic Beanstalk Environments.
     * 
     */
    @InputImport(name="forceDelete")
      private final @Nullable Input<Boolean> forceDelete;

    public Input<Boolean> getForceDelete() {
        return this.forceDelete == null ? Input.empty() : this.forceDelete;
    }

    /**
     * S3 object that is the Application Version source bundle.
     * 
     */
    @InputImport(name="key", required=true)
      private final Input<String> key;

    public Input<String> getKey() {
        return this.key;
    }

    /**
     * Unique name for the this Application Version.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Key-value map of tags for the Elastic Beanstalk Application Version. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ApplicationVersionArgs(
        Input<String> application,
        Input<String> bucket,
        @Nullable Input<String> description,
        @Nullable Input<Boolean> forceDelete,
        Input<String> key,
        @Nullable Input<String> name,
        @Nullable Input<Map<String,String>> tags) {
        this.application = Objects.requireNonNull(application, "expected parameter 'application' to be non-null");
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.description = description;
        this.forceDelete = forceDelete;
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.name = name;
        this.tags = tags;
    }

    private ApplicationVersionArgs() {
        this.application = Input.empty();
        this.bucket = Input.empty();
        this.description = Input.empty();
        this.forceDelete = Input.empty();
        this.key = Input.empty();
        this.name = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> application;
        private Input<String> bucket;
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> forceDelete;
        private Input<String> key;
        private @Nullable Input<String> name;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.application = defaults.application;
    	      this.bucket = defaults.bucket;
    	      this.description = defaults.description;
    	      this.forceDelete = defaults.forceDelete;
    	      this.key = defaults.key;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder setApplication(Input<String> application) {
            this.application = Objects.requireNonNull(application);
            return this;
        }

        public Builder setBucket(Input<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
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

        public Builder setForceDelete(@Nullable Input<Boolean> forceDelete) {
            this.forceDelete = forceDelete;
            return this;
        }

        public Builder setForceDelete(@Nullable Boolean forceDelete) {
            this.forceDelete = Input.ofNullable(forceDelete);
            return this;
        }

        public Builder setKey(Input<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Input.of(Objects.requireNonNull(key));
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
        public ApplicationVersionArgs build() {
            return new ApplicationVersionArgs(application, bucket, description, forceDelete, key, name, tags);
        }
    }
}
