// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1EventHandlerResponse;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1FulfillmentResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorResponse {
    private final GoogleCloudDialogflowCxV3beta1FulfillmentResponse initialPromptFulfillment;
    private final List<GoogleCloudDialogflowCxV3beta1EventHandlerResponse> repromptEventHandlers;

    @OutputCustomType.Constructor({"initialPromptFulfillment","repromptEventHandlers"})
    private GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorResponse(
        GoogleCloudDialogflowCxV3beta1FulfillmentResponse initialPromptFulfillment,
        List<GoogleCloudDialogflowCxV3beta1EventHandlerResponse> repromptEventHandlers) {
        this.initialPromptFulfillment = Objects.requireNonNull(initialPromptFulfillment);
        this.repromptEventHandlers = Objects.requireNonNull(repromptEventHandlers);
    }

    public GoogleCloudDialogflowCxV3beta1FulfillmentResponse getInitialPromptFulfillment() {
        return this.initialPromptFulfillment;
    }
    public List<GoogleCloudDialogflowCxV3beta1EventHandlerResponse> getRepromptEventHandlers() {
        return this.repromptEventHandlers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3beta1FulfillmentResponse initialPromptFulfillment;
        private List<GoogleCloudDialogflowCxV3beta1EventHandlerResponse> repromptEventHandlers;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.initialPromptFulfillment = defaults.initialPromptFulfillment;
    	      this.repromptEventHandlers = defaults.repromptEventHandlers;
        }

        public Builder setInitialPromptFulfillment(GoogleCloudDialogflowCxV3beta1FulfillmentResponse initialPromptFulfillment) {
            this.initialPromptFulfillment = Objects.requireNonNull(initialPromptFulfillment);
            return this;
        }

        public Builder setRepromptEventHandlers(List<GoogleCloudDialogflowCxV3beta1EventHandlerResponse> repromptEventHandlers) {
            this.repromptEventHandlers = Objects.requireNonNull(repromptEventHandlers);
            return this;
        }

        public GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorResponse build() {
            return new GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorResponse(initialPromptFulfillment, repromptEventHandlers);
        }
    }
}