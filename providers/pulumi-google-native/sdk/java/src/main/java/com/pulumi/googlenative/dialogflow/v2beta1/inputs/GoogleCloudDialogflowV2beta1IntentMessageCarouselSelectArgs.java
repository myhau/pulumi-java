// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v2beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow.v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItemArgs;
import java.util.List;
import java.util.Objects;


/**
 * The card for presenting a carousel of options to select from.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectArgs();

    /**
     * Carousel items.
     * 
     */
    @Import(name="items", required=true)
    private Output<List<GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItemArgs>> items;

    /**
     * @return Carousel items.
     * 
     */
    public Output<List<GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItemArgs>> items() {
        return this.items;
    }

    private GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectArgs() {}

    private GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectArgs(GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectArgs $) {
        this.items = $.items;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectArgs();
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectArgs defaults) {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param items Carousel items.
         * 
         * @return builder
         * 
         */
        public Builder items(Output<List<GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItemArgs>> items) {
            $.items = items;
            return this;
        }

        /**
         * @param items Carousel items.
         * 
         * @return builder
         * 
         */
        public Builder items(List<GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItemArgs> items) {
            return items(Output.of(items));
        }

        /**
         * @param items Carousel items.
         * 
         * @return builder
         * 
         */
        public Builder items(GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItemArgs... items) {
            return items(List.of(items));
        }

        public GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectArgs build() {
            $.items = Objects.requireNonNull($.items, "expected parameter 'items' to be non-null");
            return $;
        }
    }

}
