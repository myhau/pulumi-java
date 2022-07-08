// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v2beta1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Optional. Settings for displaying the image. Applies to every image in items.
     * 
     */
    @EnumType
    public enum GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardImageDisplayOptions {
        /**
         * Fill the gaps between the image and the image container with gray bars.
         * 
         */
        ImageDisplayOptionsUnspecified("IMAGE_DISPLAY_OPTIONS_UNSPECIFIED"),
        /**
         * Fill the gaps between the image and the image container with gray bars.
         * 
         */
        Gray("GRAY"),
        /**
         * Fill the gaps between the image and the image container with white bars.
         * 
         */
        White("WHITE"),
        /**
         * Image is scaled such that the image width and height match or exceed the container dimensions. This may crop the top and bottom of the image if the scaled image height is greater than the container height, or crop the left and right of the image if the scaled image width is greater than the container width. This is similar to &#34;Zoom Mode&#34; on a widescreen TV when playing a 4:3 video.
         * 
         */
        Cropped("CROPPED"),
        /**
         * Pad the gaps between image and image frame with a blurred copy of the same image.
         * 
         */
        BlurredBackground("BLURRED_BACKGROUND");

        private final String value;

        GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardImageDisplayOptions(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardImageDisplayOptions[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
