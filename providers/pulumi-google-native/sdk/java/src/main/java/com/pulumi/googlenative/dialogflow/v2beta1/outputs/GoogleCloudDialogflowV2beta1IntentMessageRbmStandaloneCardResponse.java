// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v2beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow.v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardResponse {
    /**
     * @return Card content.
     * 
     */
    private final GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse cardContent;
    /**
     * @return Orientation of the card.
     * 
     */
    private final String cardOrientation;
    /**
     * @return Required if orientation is horizontal. Image preview alignment for standalone cards with horizontal layout.
     * 
     */
    private final String thumbnailImageAlignment;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardResponse(
        @CustomType.Parameter("cardContent") GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse cardContent,
        @CustomType.Parameter("cardOrientation") String cardOrientation,
        @CustomType.Parameter("thumbnailImageAlignment") String thumbnailImageAlignment) {
        this.cardContent = cardContent;
        this.cardOrientation = cardOrientation;
        this.thumbnailImageAlignment = thumbnailImageAlignment;
    }

    /**
     * @return Card content.
     * 
     */
    public GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse cardContent() {
        return this.cardContent;
    }
    /**
     * @return Orientation of the card.
     * 
     */
    public String cardOrientation() {
        return this.cardOrientation;
    }
    /**
     * @return Required if orientation is horizontal. Image preview alignment for standalone cards with horizontal layout.
     * 
     */
    public String thumbnailImageAlignment() {
        return this.thumbnailImageAlignment;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse cardContent;
        private String cardOrientation;
        private String thumbnailImageAlignment;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cardContent = defaults.cardContent;
    	      this.cardOrientation = defaults.cardOrientation;
    	      this.thumbnailImageAlignment = defaults.thumbnailImageAlignment;
        }

        public Builder cardContent(GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse cardContent) {
            this.cardContent = Objects.requireNonNull(cardContent);
            return this;
        }
        public Builder cardOrientation(String cardOrientation) {
            this.cardOrientation = Objects.requireNonNull(cardOrientation);
            return this;
        }
        public Builder thumbnailImageAlignment(String thumbnailImageAlignment) {
            this.thumbnailImageAlignment = Objects.requireNonNull(thumbnailImageAlignment);
            return this;
        }        public GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardResponse(cardContent, cardOrientation, thumbnailImageAlignment);
        }
    }
}
