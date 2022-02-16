// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.enums.ModelExplainabilityJobDefinitionS3OutputS3UploadMode;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ModelExplainabilityJobDefinitionS3Output {
    private final String localPath;
    private final @Nullable ModelExplainabilityJobDefinitionS3OutputS3UploadMode s3UploadMode;
    private final String s3Uri;

    @OutputCustomType.Constructor({"localPath","s3UploadMode","s3Uri"})
    private ModelExplainabilityJobDefinitionS3Output(
        String localPath,
        @Nullable ModelExplainabilityJobDefinitionS3OutputS3UploadMode s3UploadMode,
        String s3Uri) {
        this.localPath = Objects.requireNonNull(localPath);
        this.s3UploadMode = s3UploadMode;
        this.s3Uri = Objects.requireNonNull(s3Uri);
    }

    public String getLocalPath() {
        return this.localPath;
    }
    public Optional<ModelExplainabilityJobDefinitionS3OutputS3UploadMode> getS3UploadMode() {
        return Optional.ofNullable(this.s3UploadMode);
    }
    public String getS3Uri() {
        return this.s3Uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelExplainabilityJobDefinitionS3Output defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String localPath;
        private @Nullable ModelExplainabilityJobDefinitionS3OutputS3UploadMode s3UploadMode;
        private String s3Uri;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelExplainabilityJobDefinitionS3Output defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localPath = defaults.localPath;
    	      this.s3UploadMode = defaults.s3UploadMode;
    	      this.s3Uri = defaults.s3Uri;
        }

        public Builder setLocalPath(String localPath) {
            this.localPath = Objects.requireNonNull(localPath);
            return this;
        }

        public Builder setS3UploadMode(@Nullable ModelExplainabilityJobDefinitionS3OutputS3UploadMode s3UploadMode) {
            this.s3UploadMode = s3UploadMode;
            return this;
        }

        public Builder setS3Uri(String s3Uri) {
            this.s3Uri = Objects.requireNonNull(s3Uri);
            return this;
        }

        public ModelExplainabilityJobDefinitionS3Output build() {
            return new ModelExplainabilityJobDefinitionS3Output(localPath, s3UploadMode, s3Uri);
        }
    }
}