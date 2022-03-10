// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.chime;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VoiceConnectorLoggingArgs extends io.pulumi.resources.ResourceArgs {

    public static final VoiceConnectorLoggingArgs Empty = new VoiceConnectorLoggingArgs();

    /**
     * When true, enables SIP message logs for sending to Amazon CloudWatch Logs.
     * 
     */
    @InputImport(name="enableSipLogs")
      private final @Nullable Input<Boolean> enableSipLogs;

    public Input<Boolean> getEnableSipLogs() {
        return this.enableSipLogs == null ? Input.empty() : this.enableSipLogs;
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

    public VoiceConnectorLoggingArgs(
        @Nullable Input<Boolean> enableSipLogs,
        Input<String> voiceConnectorId) {
        this.enableSipLogs = enableSipLogs;
        this.voiceConnectorId = Objects.requireNonNull(voiceConnectorId, "expected parameter 'voiceConnectorId' to be non-null");
    }

    private VoiceConnectorLoggingArgs() {
        this.enableSipLogs = Input.empty();
        this.voiceConnectorId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VoiceConnectorLoggingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableSipLogs;
        private Input<String> voiceConnectorId;

        public Builder() {
    	      // Empty
        }

        public Builder(VoiceConnectorLoggingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableSipLogs = defaults.enableSipLogs;
    	      this.voiceConnectorId = defaults.voiceConnectorId;
        }

        public Builder setEnableSipLogs(@Nullable Input<Boolean> enableSipLogs) {
            this.enableSipLogs = enableSipLogs;
            return this;
        }

        public Builder setEnableSipLogs(@Nullable Boolean enableSipLogs) {
            this.enableSipLogs = Input.ofNullable(enableSipLogs);
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
        public VoiceConnectorLoggingArgs build() {
            return new VoiceConnectorLoggingArgs(enableSipLogs, voiceConnectorId);
        }
    }
}