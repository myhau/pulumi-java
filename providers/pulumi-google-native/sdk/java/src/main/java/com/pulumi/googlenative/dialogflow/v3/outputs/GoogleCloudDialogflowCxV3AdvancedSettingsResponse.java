// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow.v3.outputs.GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettingsResponse;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3AdvancedSettingsResponse {
    /**
     * @return Settings for logging. Settings for Dialogflow History, Contact Center messages, StackDriver logs, and speech logging. Exposed at the following levels: - Agent level.
     * 
     */
    private final GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettingsResponse loggingSettings;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3AdvancedSettingsResponse(@CustomType.Parameter("loggingSettings") GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettingsResponse loggingSettings) {
        this.loggingSettings = loggingSettings;
    }

    /**
     * @return Settings for logging. Settings for Dialogflow History, Contact Center messages, StackDriver logs, and speech logging. Exposed at the following levels: - Agent level.
     * 
     */
    public GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettingsResponse loggingSettings() {
        return this.loggingSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3AdvancedSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettingsResponse loggingSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3AdvancedSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loggingSettings = defaults.loggingSettings;
        }

        public Builder loggingSettings(GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettingsResponse loggingSettings) {
            this.loggingSettings = Objects.requireNonNull(loggingSettings);
            return this;
        }        public GoogleCloudDialogflowCxV3AdvancedSettingsResponse build() {
            return new GoogleCloudDialogflowCxV3AdvancedSettingsResponse(loggingSettings);
        }
    }
}
