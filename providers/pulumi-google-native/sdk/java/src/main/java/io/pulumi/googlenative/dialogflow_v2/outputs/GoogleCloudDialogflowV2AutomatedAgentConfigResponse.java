// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2AutomatedAgentConfigResponse {
    /**
     * ID of the Dialogflow agent environment to use. This project needs to either be the same project as the conversation or you need to grant `service-@gcp-sa-dialogflow.iam.gserviceaccount.com` the `Dialogflow API Service Agent` role in this project. - For ES agents, use format: `projects//locations//agent/environments/`. If environment is not specified, the default `draft` environment is used. Refer to [DetectIntentRequest](/dialogflow/docs/reference/rpc/google.cloud.dialogflow.v2#google.cloud.dialogflow.v2.DetectIntentRequest) for more details. - For CX agents, use format `projects//locations//agents//environments/`. If environment is not specified, the default `draft` environment is used.
     * 
     */
    private final String agent;

    @OutputCustomType.Constructor({"agent"})
    private GoogleCloudDialogflowV2AutomatedAgentConfigResponse(String agent) {
        this.agent = agent;
    }

    /**
     * ID of the Dialogflow agent environment to use. This project needs to either be the same project as the conversation or you need to grant `service-@gcp-sa-dialogflow.iam.gserviceaccount.com` the `Dialogflow API Service Agent` role in this project. - For ES agents, use format: `projects//locations//agent/environments/`. If environment is not specified, the default `draft` environment is used. Refer to [DetectIntentRequest](/dialogflow/docs/reference/rpc/google.cloud.dialogflow.v2#google.cloud.dialogflow.v2.DetectIntentRequest) for more details. - For CX agents, use format `projects//locations//agents//environments/`. If environment is not specified, the default `draft` environment is used.
     * 
    */
    public String getAgent() {
        return this.agent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2AutomatedAgentConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String agent;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2AutomatedAgentConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agent = defaults.agent;
        }

        public Builder setAgent(String agent) {
            this.agent = Objects.requireNonNull(agent);
            return this;
        }
        public GoogleCloudDialogflowV2AutomatedAgentConfigResponse build() {
            return new GoogleCloudDialogflowV2AutomatedAgentConfigResponse(agent);
        }
    }
}
