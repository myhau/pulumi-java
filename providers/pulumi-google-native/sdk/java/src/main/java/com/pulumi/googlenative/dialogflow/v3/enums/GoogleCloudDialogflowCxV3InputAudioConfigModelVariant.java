// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Optional. Which variant of the Speech model to use.
     * 
     */
    @EnumType
    public enum GoogleCloudDialogflowCxV3InputAudioConfigModelVariant {
        /**
         * No model variant specified. In this case Dialogflow defaults to USE_BEST_AVAILABLE.
         * 
         */
        SpeechModelVariantUnspecified("SPEECH_MODEL_VARIANT_UNSPECIFIED"),
        /**
         * Use the best available variant of the Speech model that the caller is eligible for. Please see the [Dialogflow docs](https://cloud.google.com/dialogflow/docs/data-logging) for how to make your project eligible for enhanced models.
         * 
         */
        UseBestAvailable("USE_BEST_AVAILABLE"),
        /**
         * Use standard model variant even if an enhanced model is available. See the [Cloud Speech documentation](https://cloud.google.com/speech-to-text/docs/enhanced-models) for details about enhanced models.
         * 
         */
        UseStandard("USE_STANDARD"),
        /**
         * Use an enhanced model variant: * If an enhanced variant does not exist for the given model and request language, Dialogflow falls back to the standard variant. The [Cloud Speech documentation](https://cloud.google.com/speech-to-text/docs/enhanced-models) describes which models have enhanced variants. * If the API caller isn&#39;t eligible for enhanced models, Dialogflow returns an error. Please see the [Dialogflow docs](https://cloud.google.com/dialogflow/docs/data-logging) for how to make your project eligible.
         * 
         */
        UseEnhanced("USE_ENHANCED");

        private final String value;

        GoogleCloudDialogflowCxV3InputAudioConfigModelVariant(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleCloudDialogflowCxV3InputAudioConfigModelVariant[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
