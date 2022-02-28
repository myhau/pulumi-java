// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.chime.inputs;

import io.pulumi.aws.chime.inputs.VoiceConnectorTerminationCredentialsCredentialGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VoiceConnectorTerminationCredentialsState extends io.pulumi.resources.ResourceArgs {

    public static final VoiceConnectorTerminationCredentialsState Empty = new VoiceConnectorTerminationCredentialsState();

    /**
     * List of termination SIP credentials.
     * 
     */
    @InputImport(name="credentials")
      private final @Nullable Input<List<VoiceConnectorTerminationCredentialsCredentialGetArgs>> credentials;

    public Input<List<VoiceConnectorTerminationCredentialsCredentialGetArgs>> getCredentials() {
        return this.credentials == null ? Input.empty() : this.credentials;
    }

    /**
     * Amazon Chime Voice Connector ID.
     * 
     */
    @InputImport(name="voiceConnectorId")
      private final @Nullable Input<String> voiceConnectorId;

    public Input<String> getVoiceConnectorId() {
        return this.voiceConnectorId == null ? Input.empty() : this.voiceConnectorId;
    }

    public VoiceConnectorTerminationCredentialsState(
        @Nullable Input<List<VoiceConnectorTerminationCredentialsCredentialGetArgs>> credentials,
        @Nullable Input<String> voiceConnectorId) {
        this.credentials = credentials;
        this.voiceConnectorId = voiceConnectorId;
    }

    private VoiceConnectorTerminationCredentialsState() {
        this.credentials = Input.empty();
        this.voiceConnectorId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VoiceConnectorTerminationCredentialsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<VoiceConnectorTerminationCredentialsCredentialGetArgs>> credentials;
        private @Nullable Input<String> voiceConnectorId;

        public Builder() {
    	      // Empty
        }

        public Builder(VoiceConnectorTerminationCredentialsState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentials = defaults.credentials;
    	      this.voiceConnectorId = defaults.voiceConnectorId;
        }

        public Builder setCredentials(@Nullable Input<List<VoiceConnectorTerminationCredentialsCredentialGetArgs>> credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder setCredentials(@Nullable List<VoiceConnectorTerminationCredentialsCredentialGetArgs> credentials) {
            this.credentials = Input.ofNullable(credentials);
            return this;
        }

        public Builder setVoiceConnectorId(@Nullable Input<String> voiceConnectorId) {
            this.voiceConnectorId = voiceConnectorId;
            return this;
        }

        public Builder setVoiceConnectorId(@Nullable String voiceConnectorId) {
            this.voiceConnectorId = Input.ofNullable(voiceConnectorId);
            return this;
        }
        public VoiceConnectorTerminationCredentialsState build() {
            return new VoiceConnectorTerminationCredentialsState(credentials, voiceConnectorId);
        }
    }
}
