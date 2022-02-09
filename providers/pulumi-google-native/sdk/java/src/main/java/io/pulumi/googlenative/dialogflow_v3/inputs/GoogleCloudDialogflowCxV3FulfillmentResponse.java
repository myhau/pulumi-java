// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3FulfillmentSetParameterActionResponse;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3ResponseMessageResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GoogleCloudDialogflowCxV3FulfillmentResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3FulfillmentResponse Empty = new GoogleCloudDialogflowCxV3FulfillmentResponse();

    @InputImport(name="conditionalCases", required=true)
    private final List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse> conditionalCases;

    public List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse> getConditionalCases() {
        return this.conditionalCases;
    }

    @InputImport(name="messages", required=true)
    private final List<GoogleCloudDialogflowCxV3ResponseMessageResponse> messages;

    public List<GoogleCloudDialogflowCxV3ResponseMessageResponse> getMessages() {
        return this.messages;
    }

    @InputImport(name="returnPartialResponses", required=true)
    private final Boolean returnPartialResponses;

    public Boolean getReturnPartialResponses() {
        return this.returnPartialResponses;
    }

    @InputImport(name="setParameterActions", required=true)
    private final List<GoogleCloudDialogflowCxV3FulfillmentSetParameterActionResponse> setParameterActions;

    public List<GoogleCloudDialogflowCxV3FulfillmentSetParameterActionResponse> getSetParameterActions() {
        return this.setParameterActions;
    }

    @InputImport(name="tag", required=true)
    private final String tag;

    public String getTag() {
        return this.tag;
    }

    @InputImport(name="webhook", required=true)
    private final String webhook;

    public String getWebhook() {
        return this.webhook;
    }

    public GoogleCloudDialogflowCxV3FulfillmentResponse(
        List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse> conditionalCases,
        List<GoogleCloudDialogflowCxV3ResponseMessageResponse> messages,
        Boolean returnPartialResponses,
        List<GoogleCloudDialogflowCxV3FulfillmentSetParameterActionResponse> setParameterActions,
        String tag,
        String webhook) {
        this.conditionalCases = Objects.requireNonNull(conditionalCases, "expected parameter 'conditionalCases' to be non-null");
        this.messages = Objects.requireNonNull(messages, "expected parameter 'messages' to be non-null");
        this.returnPartialResponses = Objects.requireNonNull(returnPartialResponses, "expected parameter 'returnPartialResponses' to be non-null");
        this.setParameterActions = Objects.requireNonNull(setParameterActions, "expected parameter 'setParameterActions' to be non-null");
        this.tag = Objects.requireNonNull(tag, "expected parameter 'tag' to be non-null");
        this.webhook = Objects.requireNonNull(webhook, "expected parameter 'webhook' to be non-null");
    }

    private GoogleCloudDialogflowCxV3FulfillmentResponse() {
        this.conditionalCases = List.of();
        this.messages = List.of();
        this.returnPartialResponses = null;
        this.setParameterActions = List.of();
        this.tag = null;
        this.webhook = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3FulfillmentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse> conditionalCases;
        private List<GoogleCloudDialogflowCxV3ResponseMessageResponse> messages;
        private Boolean returnPartialResponses;
        private List<GoogleCloudDialogflowCxV3FulfillmentSetParameterActionResponse> setParameterActions;
        private String tag;
        private String webhook;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3FulfillmentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditionalCases = defaults.conditionalCases;
    	      this.messages = defaults.messages;
    	      this.returnPartialResponses = defaults.returnPartialResponses;
    	      this.setParameterActions = defaults.setParameterActions;
    	      this.tag = defaults.tag;
    	      this.webhook = defaults.webhook;
        }

        public Builder setConditionalCases(List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse> conditionalCases) {
            this.conditionalCases = Objects.requireNonNull(conditionalCases);
            return this;
        }

        public Builder setMessages(List<GoogleCloudDialogflowCxV3ResponseMessageResponse> messages) {
            this.messages = Objects.requireNonNull(messages);
            return this;
        }

        public Builder setReturnPartialResponses(Boolean returnPartialResponses) {
            this.returnPartialResponses = Objects.requireNonNull(returnPartialResponses);
            return this;
        }

        public Builder setSetParameterActions(List<GoogleCloudDialogflowCxV3FulfillmentSetParameterActionResponse> setParameterActions) {
            this.setParameterActions = Objects.requireNonNull(setParameterActions);
            return this;
        }

        public Builder setTag(String tag) {
            this.tag = Objects.requireNonNull(tag);
            return this;
        }

        public Builder setWebhook(String webhook) {
            this.webhook = Objects.requireNonNull(webhook);
            return this;
        }

        public GoogleCloudDialogflowCxV3FulfillmentResponse build() {
            return new GoogleCloudDialogflowCxV3FulfillmentResponse(conditionalCases, messages, returnPartialResponses, setParameterActions, tag, webhook);
        }
    }
}