// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow.v3.outputs.GoogleCloudDialogflowCxV3WebhookGenericWebServiceResponse;
import com.pulumi.googlenative.dialogflow.v3.outputs.GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWebhookResult {
    /**
     * @return Indicates whether the webhook is disabled.
     * 
     */
    private final Boolean disabled;
    /**
     * @return The human-readable name of the webhook, unique within the agent.
     * 
     */
    private final String displayName;
    /**
     * @return Configuration for a generic web service.
     * 
     */
    private final GoogleCloudDialogflowCxV3WebhookGenericWebServiceResponse genericWebService;
    /**
     * @return The unique identifier of the webhook. Required for the Webhooks.UpdateWebhook method. Webhooks.CreateWebhook populates the name automatically. Format: `projects//locations//agents//webhooks/`.
     * 
     */
    private final String name;
    /**
     * @return Configuration for a [Service Directory](https://cloud.google.com/service-directory) service.
     * 
     */
    private final GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigResponse serviceDirectory;
    /**
     * @return Webhook execution timeout. Execution is considered failed if Dialogflow doesn&#39;t receive a response from webhook at the end of the timeout period. Defaults to 5 seconds, maximum allowed timeout is 30 seconds.
     * 
     */
    private final String timeout;

    @CustomType.Constructor
    private GetWebhookResult(
        @CustomType.Parameter("disabled") Boolean disabled,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("genericWebService") GoogleCloudDialogflowCxV3WebhookGenericWebServiceResponse genericWebService,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("serviceDirectory") GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigResponse serviceDirectory,
        @CustomType.Parameter("timeout") String timeout) {
        this.disabled = disabled;
        this.displayName = displayName;
        this.genericWebService = genericWebService;
        this.name = name;
        this.serviceDirectory = serviceDirectory;
        this.timeout = timeout;
    }

    /**
     * @return Indicates whether the webhook is disabled.
     * 
     */
    public Boolean disabled() {
        return this.disabled;
    }
    /**
     * @return The human-readable name of the webhook, unique within the agent.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Configuration for a generic web service.
     * 
     */
    public GoogleCloudDialogflowCxV3WebhookGenericWebServiceResponse genericWebService() {
        return this.genericWebService;
    }
    /**
     * @return The unique identifier of the webhook. Required for the Webhooks.UpdateWebhook method. Webhooks.CreateWebhook populates the name automatically. Format: `projects//locations//agents//webhooks/`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Configuration for a [Service Directory](https://cloud.google.com/service-directory) service.
     * 
     */
    public GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigResponse serviceDirectory() {
        return this.serviceDirectory;
    }
    /**
     * @return Webhook execution timeout. Execution is considered failed if Dialogflow doesn&#39;t receive a response from webhook at the end of the timeout period. Defaults to 5 seconds, maximum allowed timeout is 30 seconds.
     * 
     */
    public String timeout() {
        return this.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebhookResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean disabled;
        private String displayName;
        private GoogleCloudDialogflowCxV3WebhookGenericWebServiceResponse genericWebService;
        private String name;
        private GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigResponse serviceDirectory;
        private String timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebhookResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
    	      this.displayName = defaults.displayName;
    	      this.genericWebService = defaults.genericWebService;
    	      this.name = defaults.name;
    	      this.serviceDirectory = defaults.serviceDirectory;
    	      this.timeout = defaults.timeout;
        }

        public Builder disabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder genericWebService(GoogleCloudDialogflowCxV3WebhookGenericWebServiceResponse genericWebService) {
            this.genericWebService = Objects.requireNonNull(genericWebService);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder serviceDirectory(GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigResponse serviceDirectory) {
            this.serviceDirectory = Objects.requireNonNull(serviceDirectory);
            return this;
        }
        public Builder timeout(String timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }        public GetWebhookResult build() {
            return new GetWebhookResult(disabled, displayName, genericWebService, name, serviceDirectory, timeout);
        }
    }
}
