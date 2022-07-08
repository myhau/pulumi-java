// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.contactcenterinsights.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.contactcenterinsights.v1.inputs.GoogleCloudContactcenterinsightsV1DialogflowSourceArgs;
import com.pulumi.googlenative.contactcenterinsights.v1.inputs.GoogleCloudContactcenterinsightsV1GcsSourceArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The conversation source, which is a combination of transcript and audio.
 * 
 */
public final class GoogleCloudContactcenterinsightsV1ConversationDataSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudContactcenterinsightsV1ConversationDataSourceArgs Empty = new GoogleCloudContactcenterinsightsV1ConversationDataSourceArgs();

    /**
     * The source when the conversation comes from Dialogflow.
     * 
     */
    @Import(name="dialogflowSource")
    private @Nullable Output<GoogleCloudContactcenterinsightsV1DialogflowSourceArgs> dialogflowSource;

    /**
     * @return The source when the conversation comes from Dialogflow.
     * 
     */
    public Optional<Output<GoogleCloudContactcenterinsightsV1DialogflowSourceArgs>> dialogflowSource() {
        return Optional.ofNullable(this.dialogflowSource);
    }

    /**
     * A Cloud Storage location specification for the audio and transcript.
     * 
     */
    @Import(name="gcsSource")
    private @Nullable Output<GoogleCloudContactcenterinsightsV1GcsSourceArgs> gcsSource;

    /**
     * @return A Cloud Storage location specification for the audio and transcript.
     * 
     */
    public Optional<Output<GoogleCloudContactcenterinsightsV1GcsSourceArgs>> gcsSource() {
        return Optional.ofNullable(this.gcsSource);
    }

    private GoogleCloudContactcenterinsightsV1ConversationDataSourceArgs() {}

    private GoogleCloudContactcenterinsightsV1ConversationDataSourceArgs(GoogleCloudContactcenterinsightsV1ConversationDataSourceArgs $) {
        this.dialogflowSource = $.dialogflowSource;
        this.gcsSource = $.gcsSource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudContactcenterinsightsV1ConversationDataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudContactcenterinsightsV1ConversationDataSourceArgs $;

        public Builder() {
            $ = new GoogleCloudContactcenterinsightsV1ConversationDataSourceArgs();
        }

        public Builder(GoogleCloudContactcenterinsightsV1ConversationDataSourceArgs defaults) {
            $ = new GoogleCloudContactcenterinsightsV1ConversationDataSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dialogflowSource The source when the conversation comes from Dialogflow.
         * 
         * @return builder
         * 
         */
        public Builder dialogflowSource(@Nullable Output<GoogleCloudContactcenterinsightsV1DialogflowSourceArgs> dialogflowSource) {
            $.dialogflowSource = dialogflowSource;
            return this;
        }

        /**
         * @param dialogflowSource The source when the conversation comes from Dialogflow.
         * 
         * @return builder
         * 
         */
        public Builder dialogflowSource(GoogleCloudContactcenterinsightsV1DialogflowSourceArgs dialogflowSource) {
            return dialogflowSource(Output.of(dialogflowSource));
        }

        /**
         * @param gcsSource A Cloud Storage location specification for the audio and transcript.
         * 
         * @return builder
         * 
         */
        public Builder gcsSource(@Nullable Output<GoogleCloudContactcenterinsightsV1GcsSourceArgs> gcsSource) {
            $.gcsSource = gcsSource;
            return this;
        }

        /**
         * @param gcsSource A Cloud Storage location specification for the audio and transcript.
         * 
         * @return builder
         * 
         */
        public Builder gcsSource(GoogleCloudContactcenterinsightsV1GcsSourceArgs gcsSource) {
            return gcsSource(Output.of(gcsSource));
        }

        public GoogleCloudContactcenterinsightsV1ConversationDataSourceArgs build() {
            return $;
        }
    }

}
