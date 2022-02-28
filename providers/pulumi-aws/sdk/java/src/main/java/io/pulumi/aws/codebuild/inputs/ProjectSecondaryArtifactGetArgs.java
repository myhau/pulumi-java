// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectSecondaryArtifactGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectSecondaryArtifactGetArgs Empty = new ProjectSecondaryArtifactGetArgs();

    /**
     * Artifact identifier. Must be the same specified inside the AWS CodeBuild build specification.
     * 
     */
    @InputImport(name="artifactIdentifier", required=true)
      private final Input<String> artifactIdentifier;

    public Input<String> getArtifactIdentifier() {
        return this.artifactIdentifier;
    }

    /**
     * Specifies the bucket owner's access for objects that another account uploads to their Amazon S3 bucket. By default, only the account that uploads the objects to the bucket has access to these objects. This property allows you to give the bucket owner access to these objects. Valid values are `NONE`, `READ_ONLY`, and `FULL`. your CodeBuild service role must have the `s3:PutBucketAcl` permission. This permission allows CodeBuild to modify the access control list for the bucket.
     * 
     */
    @InputImport(name="bucketOwnerAccess")
      private final @Nullable Input<String> bucketOwnerAccess;

    public Input<String> getBucketOwnerAccess() {
        return this.bucketOwnerAccess == null ? Input.empty() : this.bucketOwnerAccess;
    }

    /**
     * Whether to disable encrypting output artifacts. If `type` is set to `NO_ARTIFACTS`, this value is ignored. Defaults to `false`.
     * 
     */
    @InputImport(name="encryptionDisabled")
      private final @Nullable Input<Boolean> encryptionDisabled;

    public Input<Boolean> getEncryptionDisabled() {
        return this.encryptionDisabled == null ? Input.empty() : this.encryptionDisabled;
    }

    /**
     * Location of the source code from git or s3.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Name of the project. If `type` is set to `S3`, this is the name of the output artifact object
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Namespace to use in storing build artifacts. If `type` is set to `S3`, then valid values are `BUILD_ID` or `NONE`.
     * 
     */
    @InputImport(name="namespaceType")
      private final @Nullable Input<String> namespaceType;

    public Input<String> getNamespaceType() {
        return this.namespaceType == null ? Input.empty() : this.namespaceType;
    }

    /**
     * Whether a name specified in the build specification overrides the artifact name.
     * 
     */
    @InputImport(name="overrideArtifactName")
      private final @Nullable Input<Boolean> overrideArtifactName;

    public Input<Boolean> getOverrideArtifactName() {
        return this.overrideArtifactName == null ? Input.empty() : this.overrideArtifactName;
    }

    /**
     * Type of build output artifact to create. If `type` is set to `S3`, valid values are `NONE`, `ZIP`
     * 
     */
    @InputImport(name="packaging")
      private final @Nullable Input<String> packaging;

    public Input<String> getPackaging() {
        return this.packaging == null ? Input.empty() : this.packaging;
    }

    /**
     * If `type` is set to `S3`, this is the path to the output artifact.
     * 
     */
    @InputImport(name="path")
      private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    /**
     * Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public ProjectSecondaryArtifactGetArgs(
        Input<String> artifactIdentifier,
        @Nullable Input<String> bucketOwnerAccess,
        @Nullable Input<Boolean> encryptionDisabled,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> namespaceType,
        @Nullable Input<Boolean> overrideArtifactName,
        @Nullable Input<String> packaging,
        @Nullable Input<String> path,
        Input<String> type) {
        this.artifactIdentifier = Objects.requireNonNull(artifactIdentifier, "expected parameter 'artifactIdentifier' to be non-null");
        this.bucketOwnerAccess = bucketOwnerAccess;
        this.encryptionDisabled = encryptionDisabled;
        this.location = location;
        this.name = name;
        this.namespaceType = namespaceType;
        this.overrideArtifactName = overrideArtifactName;
        this.packaging = packaging;
        this.path = path;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ProjectSecondaryArtifactGetArgs() {
        this.artifactIdentifier = Input.empty();
        this.bucketOwnerAccess = Input.empty();
        this.encryptionDisabled = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.namespaceType = Input.empty();
        this.overrideArtifactName = Input.empty();
        this.packaging = Input.empty();
        this.path = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectSecondaryArtifactGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> artifactIdentifier;
        private @Nullable Input<String> bucketOwnerAccess;
        private @Nullable Input<Boolean> encryptionDisabled;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> namespaceType;
        private @Nullable Input<Boolean> overrideArtifactName;
        private @Nullable Input<String> packaging;
        private @Nullable Input<String> path;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectSecondaryArtifactGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactIdentifier = defaults.artifactIdentifier;
    	      this.bucketOwnerAccess = defaults.bucketOwnerAccess;
    	      this.encryptionDisabled = defaults.encryptionDisabled;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.namespaceType = defaults.namespaceType;
    	      this.overrideArtifactName = defaults.overrideArtifactName;
    	      this.packaging = defaults.packaging;
    	      this.path = defaults.path;
    	      this.type = defaults.type;
        }

        public Builder setArtifactIdentifier(Input<String> artifactIdentifier) {
            this.artifactIdentifier = Objects.requireNonNull(artifactIdentifier);
            return this;
        }

        public Builder setArtifactIdentifier(String artifactIdentifier) {
            this.artifactIdentifier = Input.of(Objects.requireNonNull(artifactIdentifier));
            return this;
        }

        public Builder setBucketOwnerAccess(@Nullable Input<String> bucketOwnerAccess) {
            this.bucketOwnerAccess = bucketOwnerAccess;
            return this;
        }

        public Builder setBucketOwnerAccess(@Nullable String bucketOwnerAccess) {
            this.bucketOwnerAccess = Input.ofNullable(bucketOwnerAccess);
            return this;
        }

        public Builder setEncryptionDisabled(@Nullable Input<Boolean> encryptionDisabled) {
            this.encryptionDisabled = encryptionDisabled;
            return this;
        }

        public Builder setEncryptionDisabled(@Nullable Boolean encryptionDisabled) {
            this.encryptionDisabled = Input.ofNullable(encryptionDisabled);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
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

        public Builder setNamespaceType(@Nullable Input<String> namespaceType) {
            this.namespaceType = namespaceType;
            return this;
        }

        public Builder setNamespaceType(@Nullable String namespaceType) {
            this.namespaceType = Input.ofNullable(namespaceType);
            return this;
        }

        public Builder setOverrideArtifactName(@Nullable Input<Boolean> overrideArtifactName) {
            this.overrideArtifactName = overrideArtifactName;
            return this;
        }

        public Builder setOverrideArtifactName(@Nullable Boolean overrideArtifactName) {
            this.overrideArtifactName = Input.ofNullable(overrideArtifactName);
            return this;
        }

        public Builder setPackaging(@Nullable Input<String> packaging) {
            this.packaging = packaging;
            return this;
        }

        public Builder setPackaging(@Nullable String packaging) {
            this.packaging = Input.ofNullable(packaging);
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

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public ProjectSecondaryArtifactGetArgs build() {
            return new ProjectSecondaryArtifactGetArgs(artifactIdentifier, bucketOwnerAccess, encryptionDisabled, location, name, namespaceType, overrideArtifactName, packaging, path, type);
        }
    }
}
