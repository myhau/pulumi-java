// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardResponse {
    /**
     * The cards in the carousel. A carousel must have at least 2 cards and at most 10.
     * 
     */
    private final List<GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse> cardContents;
    /**
     * The width of the cards in the carousel.
     * 
     */
    private final String cardWidth;

    @OutputCustomType.Constructor({"cardContents","cardWidth"})
    private GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardResponse(
        List<GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse> cardContents,
        String cardWidth) {
        this.cardContents = cardContents;
        this.cardWidth = cardWidth;
    }

    /**
     * The cards in the carousel. A carousel must have at least 2 cards and at most 10.
     * 
    */
    public List<GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse> getCardContents() {
        return this.cardContents;
    }
    /**
     * The width of the cards in the carousel.
     * 
    */
    public String getCardWidth() {
        return this.cardWidth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse> cardContents;
        private String cardWidth;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cardContents = defaults.cardContents;
    	      this.cardWidth = defaults.cardWidth;
        }

        public Builder setCardContents(List<GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentResponse> cardContents) {
            this.cardContents = Objects.requireNonNull(cardContents);
            return this;
        }

        public Builder setCardWidth(String cardWidth) {
            this.cardWidth = Objects.requireNonNull(cardWidth);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardResponse(cardContents, cardWidth);
        }
    }
}
