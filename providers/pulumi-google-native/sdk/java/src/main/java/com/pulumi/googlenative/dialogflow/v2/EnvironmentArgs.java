// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow.v2.inputs.GoogleCloudDialogflowV2FulfillmentArgs;
import com.pulumi.googlenative.dialogflow.v2.inputs.GoogleCloudDialogflowV2TextToSpeechSettingsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnvironmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentArgs Empty = new EnvironmentArgs();

    /**
     * Optional. The agent version loaded into this environment. Supported formats: - `projects//agent/versions/` - `projects//locations//agent/versions/`
     * 
     */
    @Import(name="agentVersion")
    private @Nullable Output<String> agentVersion;

    /**
     * @return Optional. The agent version loaded into this environment. Supported formats: - `projects//agent/versions/` - `projects//locations//agent/versions/`
     * 
     */
    public Optional<Output<String>> agentVersion() {
        return Optional.ofNullable(this.agentVersion);
    }

    /**
     * Optional. The developer-provided description for this environment. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Optional. The developer-provided description for this environment. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Required. The unique id of the new environment.
     * 
     */
    @Import(name="environmentId", required=true)
    private Output<String> environmentId;

    /**
     * @return Required. The unique id of the new environment.
     * 
     */
    public Output<String> environmentId() {
        return this.environmentId;
    }

    /**
     * Optional. The fulfillment settings to use for this environment.
     * 
     */
    @Import(name="fulfillment")
    private @Nullable Output<GoogleCloudDialogflowV2FulfillmentArgs> fulfillment;

    /**
     * @return Optional. The fulfillment settings to use for this environment.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2FulfillmentArgs>> fulfillment() {
        return Optional.ofNullable(this.fulfillment);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Optional. Text to speech settings for this environment.
     * 
     */
    @Import(name="textToSpeechSettings")
    private @Nullable Output<GoogleCloudDialogflowV2TextToSpeechSettingsArgs> textToSpeechSettings;

    /**
     * @return Optional. Text to speech settings for this environment.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2TextToSpeechSettingsArgs>> textToSpeechSettings() {
        return Optional.ofNullable(this.textToSpeechSettings);
    }

    private EnvironmentArgs() {}

    private EnvironmentArgs(EnvironmentArgs $) {
        this.agentVersion = $.agentVersion;
        this.description = $.description;
        this.environmentId = $.environmentId;
        this.fulfillment = $.fulfillment;
        this.location = $.location;
        this.project = $.project;
        this.textToSpeechSettings = $.textToSpeechSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentArgs $;

        public Builder() {
            $ = new EnvironmentArgs();
        }

        public Builder(EnvironmentArgs defaults) {
            $ = new EnvironmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param agentVersion Optional. The agent version loaded into this environment. Supported formats: - `projects//agent/versions/` - `projects//locations//agent/versions/`
         * 
         * @return builder
         * 
         */
        public Builder agentVersion(@Nullable Output<String> agentVersion) {
            $.agentVersion = agentVersion;
            return this;
        }

        /**
         * @param agentVersion Optional. The agent version loaded into this environment. Supported formats: - `projects//agent/versions/` - `projects//locations//agent/versions/`
         * 
         * @return builder
         * 
         */
        public Builder agentVersion(String agentVersion) {
            return agentVersion(Output.of(agentVersion));
        }

        /**
         * @param description Optional. The developer-provided description for this environment. The maximum length is 500 characters. If exceeded, the request is rejected.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Optional. The developer-provided description for this environment. The maximum length is 500 characters. If exceeded, the request is rejected.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param environmentId Required. The unique id of the new environment.
         * 
         * @return builder
         * 
         */
        public Builder environmentId(Output<String> environmentId) {
            $.environmentId = environmentId;
            return this;
        }

        /**
         * @param environmentId Required. The unique id of the new environment.
         * 
         * @return builder
         * 
         */
        public Builder environmentId(String environmentId) {
            return environmentId(Output.of(environmentId));
        }

        /**
         * @param fulfillment Optional. The fulfillment settings to use for this environment.
         * 
         * @return builder
         * 
         */
        public Builder fulfillment(@Nullable Output<GoogleCloudDialogflowV2FulfillmentArgs> fulfillment) {
            $.fulfillment = fulfillment;
            return this;
        }

        /**
         * @param fulfillment Optional. The fulfillment settings to use for this environment.
         * 
         * @return builder
         * 
         */
        public Builder fulfillment(GoogleCloudDialogflowV2FulfillmentArgs fulfillment) {
            return fulfillment(Output.of(fulfillment));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param textToSpeechSettings Optional. Text to speech settings for this environment.
         * 
         * @return builder
         * 
         */
        public Builder textToSpeechSettings(@Nullable Output<GoogleCloudDialogflowV2TextToSpeechSettingsArgs> textToSpeechSettings) {
            $.textToSpeechSettings = textToSpeechSettings;
            return this;
        }

        /**
         * @param textToSpeechSettings Optional. Text to speech settings for this environment.
         * 
         * @return builder
         * 
         */
        public Builder textToSpeechSettings(GoogleCloudDialogflowV2TextToSpeechSettingsArgs textToSpeechSettings) {
            return textToSpeechSettings(Output.of(textToSpeechSettings));
        }

        public EnvironmentArgs build() {
            $.environmentId = Objects.requireNonNull($.environmentId, "expected parameter 'environmentId' to be non-null");
            return $;
        }
    }

}
