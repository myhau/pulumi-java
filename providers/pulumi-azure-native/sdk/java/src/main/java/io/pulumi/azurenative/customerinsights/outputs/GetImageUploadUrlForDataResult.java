// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetImageUploadUrlForDataResult {
    private final @Nullable String contentUrl;
    private final @Nullable Boolean imageExists;
    private final @Nullable String relativePath;

    @OutputCustomType.Constructor({"contentUrl","imageExists","relativePath"})
    private GetImageUploadUrlForDataResult(
        @Nullable String contentUrl,
        @Nullable Boolean imageExists,
        @Nullable String relativePath) {
        this.contentUrl = contentUrl;
        this.imageExists = imageExists;
        this.relativePath = relativePath;
    }

    public Optional<String> getContentUrl() {
        return Optional.ofNullable(this.contentUrl);
    }
    public Optional<Boolean> getImageExists() {
        return Optional.ofNullable(this.imageExists);
    }
    public Optional<String> getRelativePath() {
        return Optional.ofNullable(this.relativePath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageUploadUrlForDataResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String contentUrl;
        private @Nullable Boolean imageExists;
        private @Nullable String relativePath;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImageUploadUrlForDataResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentUrl = defaults.contentUrl;
    	      this.imageExists = defaults.imageExists;
    	      this.relativePath = defaults.relativePath;
        }

        public Builder setContentUrl(@Nullable String contentUrl) {
            this.contentUrl = contentUrl;
            return this;
        }

        public Builder setImageExists(@Nullable Boolean imageExists) {
            this.imageExists = imageExists;
            return this;
        }

        public Builder setRelativePath(@Nullable String relativePath) {
            this.relativePath = relativePath;
            return this;
        }

        public GetImageUploadUrlForDataResult build() {
            return new GetImageUploadUrlForDataResult(contentUrl, imageExists, relativePath);
        }
    }
}