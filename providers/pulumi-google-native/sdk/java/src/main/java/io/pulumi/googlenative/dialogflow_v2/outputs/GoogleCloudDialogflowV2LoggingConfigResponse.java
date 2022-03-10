// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2LoggingConfigResponse {
    /**
     * Whether to log conversation events like CONVERSATION_STARTED to Stackdriver in the conversation project as JSON format ConversationEvent protos.
     * 
     */
    private final Boolean enableStackdriverLogging;

    @OutputCustomType.Constructor
    private GoogleCloudDialogflowV2LoggingConfigResponse(@OutputCustomType.Parameter("enableStackdriverLogging") Boolean enableStackdriverLogging) {
        this.enableStackdriverLogging = enableStackdriverLogging;
    }

    /**
     * Whether to log conversation events like CONVERSATION_STARTED to Stackdriver in the conversation project as JSON format ConversationEvent protos.
     * 
    */
    public Boolean getEnableStackdriverLogging() {
        return this.enableStackdriverLogging;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2LoggingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableStackdriverLogging;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2LoggingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableStackdriverLogging = defaults.enableStackdriverLogging;
        }

        public Builder setEnableStackdriverLogging(Boolean enableStackdriverLogging) {
            this.enableStackdriverLogging = Objects.requireNonNull(enableStackdriverLogging);
            return this;
        }
        public GoogleCloudDialogflowV2LoggingConfigResponse build() {
            return new GoogleCloudDialogflowV2LoggingConfigResponse(enableStackdriverLogging);
        }
    }
}
