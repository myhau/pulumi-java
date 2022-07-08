// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow.v2.outputs.GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriActionResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse {
    /**
     * @return Action to take when a user taps on the button.
     * 
     */
    private final GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriActionResponse openUriAction;
    /**
     * @return The title of the button.
     * 
     */
    private final String title;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse(
        @CustomType.Parameter("openUriAction") GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriActionResponse openUriAction,
        @CustomType.Parameter("title") String title) {
        this.openUriAction = openUriAction;
        this.title = title;
    }

    /**
     * @return Action to take when a user taps on the button.
     * 
     */
    public GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriActionResponse openUriAction() {
        return this.openUriAction;
    }
    /**
     * @return The title of the button.
     * 
     */
    public String title() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriActionResponse openUriAction;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.openUriAction = defaults.openUriAction;
    	      this.title = defaults.title;
        }

        public Builder openUriAction(GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriActionResponse openUriAction) {
            this.openUriAction = Objects.requireNonNull(openUriAction);
            return this;
        }
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }        public GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse(openUriAction, title);
        }
    }
}
