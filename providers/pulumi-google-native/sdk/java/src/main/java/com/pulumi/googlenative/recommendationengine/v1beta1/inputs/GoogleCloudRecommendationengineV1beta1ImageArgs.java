// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.recommendationengine.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Catalog item thumbnail/detail image.
 * 
 */
public final class GoogleCloudRecommendationengineV1beta1ImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRecommendationengineV1beta1ImageArgs Empty = new GoogleCloudRecommendationengineV1beta1ImageArgs();

    /**
     * Optional. Height of the image in number of pixels.
     * 
     */
    @Import(name="height")
    private @Nullable Output<Integer> height;

    /**
     * @return Optional. Height of the image in number of pixels.
     * 
     */
    public Optional<Output<Integer>> height() {
        return Optional.ofNullable(this.height);
    }

    /**
     * URL of the image with a length limit of 5 KiB.
     * 
     */
    @Import(name="uri", required=true)
    private Output<String> uri;

    /**
     * @return URL of the image with a length limit of 5 KiB.
     * 
     */
    public Output<String> uri() {
        return this.uri;
    }

    /**
     * Optional. Width of the image in number of pixels.
     * 
     */
    @Import(name="width")
    private @Nullable Output<Integer> width;

    /**
     * @return Optional. Width of the image in number of pixels.
     * 
     */
    public Optional<Output<Integer>> width() {
        return Optional.ofNullable(this.width);
    }

    private GoogleCloudRecommendationengineV1beta1ImageArgs() {}

    private GoogleCloudRecommendationengineV1beta1ImageArgs(GoogleCloudRecommendationengineV1beta1ImageArgs $) {
        this.height = $.height;
        this.uri = $.uri;
        this.width = $.width;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRecommendationengineV1beta1ImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRecommendationengineV1beta1ImageArgs $;

        public Builder() {
            $ = new GoogleCloudRecommendationengineV1beta1ImageArgs();
        }

        public Builder(GoogleCloudRecommendationengineV1beta1ImageArgs defaults) {
            $ = new GoogleCloudRecommendationengineV1beta1ImageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param height Optional. Height of the image in number of pixels.
         * 
         * @return builder
         * 
         */
        public Builder height(@Nullable Output<Integer> height) {
            $.height = height;
            return this;
        }

        /**
         * @param height Optional. Height of the image in number of pixels.
         * 
         * @return builder
         * 
         */
        public Builder height(Integer height) {
            return height(Output.of(height));
        }

        /**
         * @param uri URL of the image with a length limit of 5 KiB.
         * 
         * @return builder
         * 
         */
        public Builder uri(Output<String> uri) {
            $.uri = uri;
            return this;
        }

        /**
         * @param uri URL of the image with a length limit of 5 KiB.
         * 
         * @return builder
         * 
         */
        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        /**
         * @param width Optional. Width of the image in number of pixels.
         * 
         * @return builder
         * 
         */
        public Builder width(@Nullable Output<Integer> width) {
            $.width = width;
            return this;
        }

        /**
         * @param width Optional. Width of the image in number of pixels.
         * 
         * @return builder
         * 
         */
        public Builder width(Integer width) {
            return width(Output.of(width));
        }

        public GoogleCloudRecommendationengineV1beta1ImageArgs build() {
            $.uri = Objects.requireNonNull($.uri, "expected parameter 'uri' to be non-null");
            return $;
        }
    }

}
