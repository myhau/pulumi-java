// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codepipeline.inputs;

import io.pulumi.aws.codepipeline.inputs.PipelineArtifactStoreEncryptionKeyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineArtifactStoreArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineArtifactStoreArgs Empty = new PipelineArtifactStoreArgs();

    /**
     * The encryption key block AWS CodePipeline uses to encrypt the data in the artifact store, such as an AWS Key Management Service (AWS KMS) key. If you don't specify a key, AWS CodePipeline uses the default key for Amazon Simple Storage Service (Amazon S3). An `encryption_key` block is documented below.
     * 
     */
    @InputImport(name="encryptionKey")
      private final @Nullable Input<PipelineArtifactStoreEncryptionKeyArgs> encryptionKey;

    public Input<PipelineArtifactStoreEncryptionKeyArgs> getEncryptionKey() {
        return this.encryptionKey == null ? Input.empty() : this.encryptionKey;
    }

    /**
     * The location where AWS CodePipeline stores artifacts for a pipeline; currently only `S3` is supported.
     * 
     */
    @InputImport(name="location", required=true)
      private final Input<String> location;

    public Input<String> getLocation() {
        return this.location;
    }

    /**
     * The region where the artifact store is located. Required for a cross-region CodePipeline, do not provide for a single-region CodePipeline.
     * 
     */
    @InputImport(name="region")
      private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * The type of the artifact store, such as Amazon S3
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public PipelineArtifactStoreArgs(
        @Nullable Input<PipelineArtifactStoreEncryptionKeyArgs> encryptionKey,
        Input<String> location,
        @Nullable Input<String> region,
        Input<String> type) {
        this.encryptionKey = encryptionKey;
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.region = region;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private PipelineArtifactStoreArgs() {
        this.encryptionKey = Input.empty();
        this.location = Input.empty();
        this.region = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineArtifactStoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PipelineArtifactStoreEncryptionKeyArgs> encryptionKey;
        private Input<String> location;
        private @Nullable Input<String> region;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineArtifactStoreArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionKey = defaults.encryptionKey;
    	      this.location = defaults.location;
    	      this.region = defaults.region;
    	      this.type = defaults.type;
        }

        public Builder setEncryptionKey(@Nullable Input<PipelineArtifactStoreEncryptionKeyArgs> encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }

        public Builder setEncryptionKey(@Nullable PipelineArtifactStoreEncryptionKeyArgs encryptionKey) {
            this.encryptionKey = Input.ofNullable(encryptionKey);
            return this;
        }

        public Builder setLocation(Input<String> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Input.of(Objects.requireNonNull(location));
            return this;
        }

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
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
        public PipelineArtifactStoreArgs build() {
            return new PipelineArtifactStoreArgs(encryptionKey, location, region, type);
        }
    }
}
