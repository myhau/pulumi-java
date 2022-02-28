// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DistributionCustomErrorResponse {
    /**
     * The minimum amount of time you want
     * HTTP error codes to stay in CloudFront caches before CloudFront queries your
     * origin to see whether the object has been updated.
     * 
     */
    private final @Nullable Integer errorCachingMinTtl;
    /**
     * The 4xx or 5xx HTTP status code that you want to
     * customize.
     * 
     */
    private final Integer errorCode;
    /**
     * The HTTP status code that you want CloudFront
     * to return with the custom error page to the viewer.
     * 
     */
    private final @Nullable Integer responseCode;
    /**
     * The path of the custom error page (for
     * example, `/custom_404.html`).
     * 
     */
    private final @Nullable String responsePagePath;

    @OutputCustomType.Constructor({"errorCachingMinTtl","errorCode","responseCode","responsePagePath"})
    private DistributionCustomErrorResponse(
        @Nullable Integer errorCachingMinTtl,
        Integer errorCode,
        @Nullable Integer responseCode,
        @Nullable String responsePagePath) {
        this.errorCachingMinTtl = errorCachingMinTtl;
        this.errorCode = Objects.requireNonNull(errorCode);
        this.responseCode = responseCode;
        this.responsePagePath = responsePagePath;
    }

    /**
     * The minimum amount of time you want
     * HTTP error codes to stay in CloudFront caches before CloudFront queries your
     * origin to see whether the object has been updated.
     * 
     */
    public Optional<Integer> getErrorCachingMinTtl() {
        return Optional.ofNullable(this.errorCachingMinTtl);
    }
    /**
     * The 4xx or 5xx HTTP status code that you want to
     * customize.
     * 
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }
    /**
     * The HTTP status code that you want CloudFront
     * to return with the custom error page to the viewer.
     * 
     */
    public Optional<Integer> getResponseCode() {
        return Optional.ofNullable(this.responseCode);
    }
    /**
     * The path of the custom error page (for
     * example, `/custom_404.html`).
     * 
     */
    public Optional<String> getResponsePagePath() {
        return Optional.ofNullable(this.responsePagePath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionCustomErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer errorCachingMinTtl;
        private Integer errorCode;
        private @Nullable Integer responseCode;
        private @Nullable String responsePagePath;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionCustomErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorCachingMinTtl = defaults.errorCachingMinTtl;
    	      this.errorCode = defaults.errorCode;
    	      this.responseCode = defaults.responseCode;
    	      this.responsePagePath = defaults.responsePagePath;
        }

        public Builder setErrorCachingMinTtl(@Nullable Integer errorCachingMinTtl) {
            this.errorCachingMinTtl = errorCachingMinTtl;
            return this;
        }

        public Builder setErrorCode(Integer errorCode) {
            this.errorCode = Objects.requireNonNull(errorCode);
            return this;
        }

        public Builder setResponseCode(@Nullable Integer responseCode) {
            this.responseCode = responseCode;
            return this;
        }

        public Builder setResponsePagePath(@Nullable String responsePagePath) {
            this.responsePagePath = responsePagePath;
            return this;
        }
        public DistributionCustomErrorResponse build() {
            return new DistributionCustomErrorResponse(errorCachingMinTtl, errorCode, responseCode, responsePagePath);
        }
    }
}
