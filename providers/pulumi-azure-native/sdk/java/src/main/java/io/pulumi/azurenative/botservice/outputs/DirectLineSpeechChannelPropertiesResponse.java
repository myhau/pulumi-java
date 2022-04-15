// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DirectLineSpeechChannelPropertiesResponse {
    /**
     * The cognitive service region with this channel registration.
     * 
     */
    private final String cognitiveServiceRegion;
    /**
     * The cognitive service subscription key to use with this channel registration.
     * 
     */
    private final String cognitiveServiceSubscriptionKey;
    /**
     * Custom voice deployment id (optional).
     * 
     */
    private final @Nullable String customSpeechModelId;
    /**
     * Custom speech model id (optional).
     * 
     */
    private final @Nullable String customVoiceDeploymentId;
    /**
     * Make this a default bot for chosen cognitive service account.
     * 
     */
    private final @Nullable Boolean isDefaultBotForCogSvcAccount;
    /**
     * Whether this channel is enabled or not.
     * 
     */
    private final @Nullable Boolean isEnabled;

    @CustomType.Constructor
    private DirectLineSpeechChannelPropertiesResponse(
        @CustomType.Parameter("cognitiveServiceRegion") String cognitiveServiceRegion,
        @CustomType.Parameter("cognitiveServiceSubscriptionKey") String cognitiveServiceSubscriptionKey,
        @CustomType.Parameter("customSpeechModelId") @Nullable String customSpeechModelId,
        @CustomType.Parameter("customVoiceDeploymentId") @Nullable String customVoiceDeploymentId,
        @CustomType.Parameter("isDefaultBotForCogSvcAccount") @Nullable Boolean isDefaultBotForCogSvcAccount,
        @CustomType.Parameter("isEnabled") @Nullable Boolean isEnabled) {
        this.cognitiveServiceRegion = cognitiveServiceRegion;
        this.cognitiveServiceSubscriptionKey = cognitiveServiceSubscriptionKey;
        this.customSpeechModelId = customSpeechModelId;
        this.customVoiceDeploymentId = customVoiceDeploymentId;
        this.isDefaultBotForCogSvcAccount = isDefaultBotForCogSvcAccount;
        this.isEnabled = isEnabled;
    }

    /**
     * The cognitive service region with this channel registration.
     * 
    */
    public String cognitiveServiceRegion() {
        return this.cognitiveServiceRegion;
    }
    /**
     * The cognitive service subscription key to use with this channel registration.
     * 
    */
    public String cognitiveServiceSubscriptionKey() {
        return this.cognitiveServiceSubscriptionKey;
    }
    /**
     * Custom voice deployment id (optional).
     * 
    */
    public Optional<String> customSpeechModelId() {
        return Optional.ofNullable(this.customSpeechModelId);
    }
    /**
     * Custom speech model id (optional).
     * 
    */
    public Optional<String> customVoiceDeploymentId() {
        return Optional.ofNullable(this.customVoiceDeploymentId);
    }
    /**
     * Make this a default bot for chosen cognitive service account.
     * 
    */
    public Optional<Boolean> isDefaultBotForCogSvcAccount() {
        return Optional.ofNullable(this.isDefaultBotForCogSvcAccount);
    }
    /**
     * Whether this channel is enabled or not.
     * 
    */
    public Optional<Boolean> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DirectLineSpeechChannelPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cognitiveServiceRegion;
        private String cognitiveServiceSubscriptionKey;
        private @Nullable String customSpeechModelId;
        private @Nullable String customVoiceDeploymentId;
        private @Nullable Boolean isDefaultBotForCogSvcAccount;
        private @Nullable Boolean isEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(DirectLineSpeechChannelPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cognitiveServiceRegion = defaults.cognitiveServiceRegion;
    	      this.cognitiveServiceSubscriptionKey = defaults.cognitiveServiceSubscriptionKey;
    	      this.customSpeechModelId = defaults.customSpeechModelId;
    	      this.customVoiceDeploymentId = defaults.customVoiceDeploymentId;
    	      this.isDefaultBotForCogSvcAccount = defaults.isDefaultBotForCogSvcAccount;
    	      this.isEnabled = defaults.isEnabled;
        }

        public Builder cognitiveServiceRegion(String cognitiveServiceRegion) {
            this.cognitiveServiceRegion = Objects.requireNonNull(cognitiveServiceRegion);
            return this;
        }
        public Builder cognitiveServiceSubscriptionKey(String cognitiveServiceSubscriptionKey) {
            this.cognitiveServiceSubscriptionKey = Objects.requireNonNull(cognitiveServiceSubscriptionKey);
            return this;
        }
        public Builder customSpeechModelId(@Nullable String customSpeechModelId) {
            this.customSpeechModelId = customSpeechModelId;
            return this;
        }
        public Builder customVoiceDeploymentId(@Nullable String customVoiceDeploymentId) {
            this.customVoiceDeploymentId = customVoiceDeploymentId;
            return this;
        }
        public Builder isDefaultBotForCogSvcAccount(@Nullable Boolean isDefaultBotForCogSvcAccount) {
            this.isDefaultBotForCogSvcAccount = isDefaultBotForCogSvcAccount;
            return this;
        }
        public Builder isEnabled(@Nullable Boolean isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }        public DirectLineSpeechChannelPropertiesResponse build() {
            return new DirectLineSpeechChannelPropertiesResponse(cognitiveServiceRegion, cognitiveServiceSubscriptionKey, customSpeechModelId, customVoiceDeploymentId, isDefaultBotForCogSvcAccount, isEnabled);
        }
    }
}
