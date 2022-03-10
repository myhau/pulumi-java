// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3beta1IntentInputResponse {
    /**
     * The unique identifier of the intent. Format: `projects//locations//agents//intents/`.
     * 
     */
    private final String intent;

    @OutputCustomType.Constructor
    private GoogleCloudDialogflowCxV3beta1IntentInputResponse(@OutputCustomType.Parameter("intent") String intent) {
        this.intent = intent;
    }

    /**
     * The unique identifier of the intent. Format: `projects//locations//agents//intents/`.
     * 
    */
    public String getIntent() {
        return this.intent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1IntentInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String intent;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1IntentInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.intent = defaults.intent;
        }

        public Builder setIntent(String intent) {
            this.intent = Objects.requireNonNull(intent);
            return this;
        }
        public GoogleCloudDialogflowCxV3beta1IntentInputResponse build() {
            return new GoogleCloudDialogflowCxV3beta1IntentInputResponse(intent);
        }
    }
}
