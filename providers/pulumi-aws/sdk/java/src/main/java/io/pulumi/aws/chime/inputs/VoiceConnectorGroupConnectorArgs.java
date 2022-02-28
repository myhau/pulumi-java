// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.chime.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class VoiceConnectorGroupConnectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final VoiceConnectorGroupConnectorArgs Empty = new VoiceConnectorGroupConnectorArgs();

    /**
     * The priority associated with the Amazon Chime Voice Connector, with 1 being the highest priority. Higher priority Amazon Chime Voice Connectors are attempted first.
     * 
     */
    @InputImport(name="priority", required=true)
      private final Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority;
    }

    /**
     * The Amazon Chime Voice Connector ID.
     * 
     */
    @InputImport(name="voiceConnectorId", required=true)
      private final Input<String> voiceConnectorId;

    public Input<String> getVoiceConnectorId() {
        return this.voiceConnectorId;
    }

    public VoiceConnectorGroupConnectorArgs(
        Input<Integer> priority,
        Input<String> voiceConnectorId) {
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.voiceConnectorId = Objects.requireNonNull(voiceConnectorId, "expected parameter 'voiceConnectorId' to be non-null");
    }

    private VoiceConnectorGroupConnectorArgs() {
        this.priority = Input.empty();
        this.voiceConnectorId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VoiceConnectorGroupConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> priority;
        private Input<String> voiceConnectorId;

        public Builder() {
    	      // Empty
        }

        public Builder(VoiceConnectorGroupConnectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.priority = defaults.priority;
    	      this.voiceConnectorId = defaults.voiceConnectorId;
        }

        public Builder setPriority(Input<Integer> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Input.of(Objects.requireNonNull(priority));
            return this;
        }

        public Builder setVoiceConnectorId(Input<String> voiceConnectorId) {
            this.voiceConnectorId = Objects.requireNonNull(voiceConnectorId);
            return this;
        }

        public Builder setVoiceConnectorId(String voiceConnectorId) {
            this.voiceConnectorId = Input.of(Objects.requireNonNull(voiceConnectorId));
            return this;
        }
        public VoiceConnectorGroupConnectorArgs build() {
            return new VoiceConnectorGroupConnectorArgs(priority, voiceConnectorId);
        }
    }
}
