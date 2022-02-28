// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datasync.inputs;

import io.pulumi.aws.datasync.inputs.EfsLocationEc2ConfigGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EfsLocationState extends io.pulumi.resources.ResourceArgs {

    public static final EfsLocationState Empty = new EfsLocationState();

    /**
     * Amazon Resource Name (ARN) of the DataSync Location.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Configuration block containing EC2 configurations for connecting to the EFS File System.
     * 
     */
    @InputImport(name="ec2Config")
      private final @Nullable Input<EfsLocationEc2ConfigGetArgs> ec2Config;

    public Input<EfsLocationEc2ConfigGetArgs> getEc2Config() {
        return this.ec2Config == null ? Input.empty() : this.ec2Config;
    }

    /**
     * Amazon Resource Name (ARN) of EFS File System.
     * 
     */
    @InputImport(name="efsFileSystemArn")
      private final @Nullable Input<String> efsFileSystemArn;

    public Input<String> getEfsFileSystemArn() {
        return this.efsFileSystemArn == null ? Input.empty() : this.efsFileSystemArn;
    }

    /**
     * Subdirectory to perform actions as source or destination. Default `/`.
     * 
     */
    @InputImport(name="subdirectory")
      private final @Nullable Input<String> subdirectory;

    public Input<String> getSubdirectory() {
        return this.subdirectory == null ? Input.empty() : this.subdirectory;
    }

    /**
     * Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

    @InputImport(name="uri")
      private final @Nullable Input<String> uri;

    public Input<String> getUri() {
        return this.uri == null ? Input.empty() : this.uri;
    }

    public EfsLocationState(
        @Nullable Input<String> arn,
        @Nullable Input<EfsLocationEc2ConfigGetArgs> ec2Config,
        @Nullable Input<String> efsFileSystemArn,
        @Nullable Input<String> subdirectory,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> uri) {
        this.arn = arn;
        this.ec2Config = ec2Config;
        this.efsFileSystemArn = efsFileSystemArn;
        this.subdirectory = subdirectory;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.uri = uri;
    }

    private EfsLocationState() {
        this.arn = Input.empty();
        this.ec2Config = Input.empty();
        this.efsFileSystemArn = Input.empty();
        this.subdirectory = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.uri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EfsLocationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<EfsLocationEc2ConfigGetArgs> ec2Config;
        private @Nullable Input<String> efsFileSystemArn;
        private @Nullable Input<String> subdirectory;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(EfsLocationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.ec2Config = defaults.ec2Config;
    	      this.efsFileSystemArn = defaults.efsFileSystemArn;
    	      this.subdirectory = defaults.subdirectory;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.uri = defaults.uri;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setEc2Config(@Nullable Input<EfsLocationEc2ConfigGetArgs> ec2Config) {
            this.ec2Config = ec2Config;
            return this;
        }

        public Builder setEc2Config(@Nullable EfsLocationEc2ConfigGetArgs ec2Config) {
            this.ec2Config = Input.ofNullable(ec2Config);
            return this;
        }

        public Builder setEfsFileSystemArn(@Nullable Input<String> efsFileSystemArn) {
            this.efsFileSystemArn = efsFileSystemArn;
            return this;
        }

        public Builder setEfsFileSystemArn(@Nullable String efsFileSystemArn) {
            this.efsFileSystemArn = Input.ofNullable(efsFileSystemArn);
            return this;
        }

        public Builder setSubdirectory(@Nullable Input<String> subdirectory) {
            this.subdirectory = subdirectory;
            return this;
        }

        public Builder setSubdirectory(@Nullable String subdirectory) {
            this.subdirectory = Input.ofNullable(subdirectory);
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

        public Builder setUri(@Nullable Input<String> uri) {
            this.uri = uri;
            return this;
        }

        public Builder setUri(@Nullable String uri) {
            this.uri = Input.ofNullable(uri);
            return this;
        }
        public EfsLocationState build() {
            return new EfsLocationState(arn, ec2Config, efsFileSystemArn, subdirectory, tags, tagsAll, uri);
        }
    }
}
