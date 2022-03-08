// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentMessageCardButtonResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2IntentMessageCardResponse {
    /**
     * Optional. The collection of card buttons.
     * 
     */
    private final List<GoogleCloudDialogflowV2IntentMessageCardButtonResponse> buttons;
    /**
     * Optional. The public URI to an image file for the card.
     * 
     */
    private final String imageUri;
    /**
     * Optional. The subtitle of the card.
     * 
     */
    private final String subtitle;
    /**
     * Optional. The title of the card.
     * 
     */
    private final String title;

    @OutputCustomType.Constructor({"buttons","imageUri","subtitle","title"})
    private GoogleCloudDialogflowV2IntentMessageCardResponse(
        List<GoogleCloudDialogflowV2IntentMessageCardButtonResponse> buttons,
        String imageUri,
        String subtitle,
        String title) {
        this.buttons = buttons;
        this.imageUri = imageUri;
        this.subtitle = subtitle;
        this.title = title;
    }

    /**
     * Optional. The collection of card buttons.
     * 
    */
    public List<GoogleCloudDialogflowV2IntentMessageCardButtonResponse> getButtons() {
        return this.buttons;
    }
    /**
     * Optional. The public URI to an image file for the card.
     * 
    */
    public String getImageUri() {
        return this.imageUri;
    }
    /**
     * Optional. The subtitle of the card.
     * 
    */
    public String getSubtitle() {
        return this.subtitle;
    }
    /**
     * Optional. The title of the card.
     * 
    */
    public String getTitle() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageCardResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowV2IntentMessageCardButtonResponse> buttons;
        private String imageUri;
        private String subtitle;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageCardResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buttons = defaults.buttons;
    	      this.imageUri = defaults.imageUri;
    	      this.subtitle = defaults.subtitle;
    	      this.title = defaults.title;
        }

        public Builder setButtons(List<GoogleCloudDialogflowV2IntentMessageCardButtonResponse> buttons) {
            this.buttons = Objects.requireNonNull(buttons);
            return this;
        }

        public Builder setImageUri(String imageUri) {
            this.imageUri = Objects.requireNonNull(imageUri);
            return this;
        }

        public Builder setSubtitle(String subtitle) {
            this.subtitle = Objects.requireNonNull(subtitle);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public GoogleCloudDialogflowV2IntentMessageCardResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageCardResponse(buttons, imageUri, subtitle, title);
        }
    }
}
