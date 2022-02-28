// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.devicefarm;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UploadArgs extends io.pulumi.resources.ResourceArgs {

    public static final UploadArgs Empty = new UploadArgs();

    /**
     * The upload's content type (for example, application/octet-stream).
     * 
     */
    @InputImport(name="contentType")
      private final @Nullable Input<String> contentType;

    public Input<String> getContentType() {
        return this.contentType == null ? Input.empty() : this.contentType;
    }

    /**
     * The upload's file name. The name should not contain any forward slashes (/). If you are uploading an iOS app, the file name must end with the .ipa extension. If you are uploading an Android app, the file name must end with the .apk extension. For all others, the file name must end with the .zip file extension.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ARN of the project for the upload.
     * 
     */
    @InputImport(name="projectArn", required=true)
      private final Input<String> projectArn;

    public Input<String> getProjectArn() {
        return this.projectArn;
    }

    /**
     * The upload's upload type. See [AWS Docs](https://docs.aws.amazon.com/devicefarm/latest/APIReference/API_CreateUpload.html#API_CreateUpload_RequestSyntax) for valid list of values.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public UploadArgs(
        @Nullable Input<String> contentType,
        @Nullable Input<String> name,
        Input<String> projectArn,
        Input<String> type) {
        this.contentType = contentType;
        this.name = name;
        this.projectArn = Objects.requireNonNull(projectArn, "expected parameter 'projectArn' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private UploadArgs() {
        this.contentType = Input.empty();
        this.name = Input.empty();
        this.projectArn = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UploadArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> contentType;
        private @Nullable Input<String> name;
        private Input<String> projectArn;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(UploadArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.name = defaults.name;
    	      this.projectArn = defaults.projectArn;
    	      this.type = defaults.type;
        }

        public Builder setContentType(@Nullable Input<String> contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder setContentType(@Nullable String contentType) {
            this.contentType = Input.ofNullable(contentType);
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

        public Builder setProjectArn(Input<String> projectArn) {
            this.projectArn = Objects.requireNonNull(projectArn);
            return this;
        }

        public Builder setProjectArn(String projectArn) {
            this.projectArn = Input.of(Objects.requireNonNull(projectArn));
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
        public UploadArgs build() {
            return new UploadArgs(contentType, name, projectArn, type);
        }
    }
}
