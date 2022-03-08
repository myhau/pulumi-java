// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.AS2AcknowledgementConnectionSettingsResponse;
import io.pulumi.azurenative.logic.outputs.AS2EnvelopeSettingsResponse;
import io.pulumi.azurenative.logic.outputs.AS2ErrorSettingsResponse;
import io.pulumi.azurenative.logic.outputs.AS2MdnSettingsResponse;
import io.pulumi.azurenative.logic.outputs.AS2MessageConnectionSettingsResponse;
import io.pulumi.azurenative.logic.outputs.AS2SecuritySettingsResponse;
import io.pulumi.azurenative.logic.outputs.AS2ValidationSettingsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class AS2ProtocolSettingsResponse {
    /**
     * The acknowledgement connection settings.
     * 
     */
    private final AS2AcknowledgementConnectionSettingsResponse acknowledgementConnectionSettings;
    /**
     * The envelope settings.
     * 
     */
    private final AS2EnvelopeSettingsResponse envelopeSettings;
    /**
     * The error settings.
     * 
     */
    private final AS2ErrorSettingsResponse errorSettings;
    /**
     * The MDN settings.
     * 
     */
    private final AS2MdnSettingsResponse mdnSettings;
    /**
     * The message connection settings.
     * 
     */
    private final AS2MessageConnectionSettingsResponse messageConnectionSettings;
    /**
     * The security settings.
     * 
     */
    private final AS2SecuritySettingsResponse securitySettings;
    /**
     * The validation settings.
     * 
     */
    private final AS2ValidationSettingsResponse validationSettings;

    @OutputCustomType.Constructor({"acknowledgementConnectionSettings","envelopeSettings","errorSettings","mdnSettings","messageConnectionSettings","securitySettings","validationSettings"})
    private AS2ProtocolSettingsResponse(
        AS2AcknowledgementConnectionSettingsResponse acknowledgementConnectionSettings,
        AS2EnvelopeSettingsResponse envelopeSettings,
        AS2ErrorSettingsResponse errorSettings,
        AS2MdnSettingsResponse mdnSettings,
        AS2MessageConnectionSettingsResponse messageConnectionSettings,
        AS2SecuritySettingsResponse securitySettings,
        AS2ValidationSettingsResponse validationSettings) {
        this.acknowledgementConnectionSettings = acknowledgementConnectionSettings;
        this.envelopeSettings = envelopeSettings;
        this.errorSettings = errorSettings;
        this.mdnSettings = mdnSettings;
        this.messageConnectionSettings = messageConnectionSettings;
        this.securitySettings = securitySettings;
        this.validationSettings = validationSettings;
    }

    /**
     * The acknowledgement connection settings.
     * 
    */
    public AS2AcknowledgementConnectionSettingsResponse getAcknowledgementConnectionSettings() {
        return this.acknowledgementConnectionSettings;
    }
    /**
     * The envelope settings.
     * 
    */
    public AS2EnvelopeSettingsResponse getEnvelopeSettings() {
        return this.envelopeSettings;
    }
    /**
     * The error settings.
     * 
    */
    public AS2ErrorSettingsResponse getErrorSettings() {
        return this.errorSettings;
    }
    /**
     * The MDN settings.
     * 
    */
    public AS2MdnSettingsResponse getMdnSettings() {
        return this.mdnSettings;
    }
    /**
     * The message connection settings.
     * 
    */
    public AS2MessageConnectionSettingsResponse getMessageConnectionSettings() {
        return this.messageConnectionSettings;
    }
    /**
     * The security settings.
     * 
    */
    public AS2SecuritySettingsResponse getSecuritySettings() {
        return this.securitySettings;
    }
    /**
     * The validation settings.
     * 
    */
    public AS2ValidationSettingsResponse getValidationSettings() {
        return this.validationSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AS2ProtocolSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AS2AcknowledgementConnectionSettingsResponse acknowledgementConnectionSettings;
        private AS2EnvelopeSettingsResponse envelopeSettings;
        private AS2ErrorSettingsResponse errorSettings;
        private AS2MdnSettingsResponse mdnSettings;
        private AS2MessageConnectionSettingsResponse messageConnectionSettings;
        private AS2SecuritySettingsResponse securitySettings;
        private AS2ValidationSettingsResponse validationSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(AS2ProtocolSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acknowledgementConnectionSettings = defaults.acknowledgementConnectionSettings;
    	      this.envelopeSettings = defaults.envelopeSettings;
    	      this.errorSettings = defaults.errorSettings;
    	      this.mdnSettings = defaults.mdnSettings;
    	      this.messageConnectionSettings = defaults.messageConnectionSettings;
    	      this.securitySettings = defaults.securitySettings;
    	      this.validationSettings = defaults.validationSettings;
        }

        public Builder setAcknowledgementConnectionSettings(AS2AcknowledgementConnectionSettingsResponse acknowledgementConnectionSettings) {
            this.acknowledgementConnectionSettings = Objects.requireNonNull(acknowledgementConnectionSettings);
            return this;
        }

        public Builder setEnvelopeSettings(AS2EnvelopeSettingsResponse envelopeSettings) {
            this.envelopeSettings = Objects.requireNonNull(envelopeSettings);
            return this;
        }

        public Builder setErrorSettings(AS2ErrorSettingsResponse errorSettings) {
            this.errorSettings = Objects.requireNonNull(errorSettings);
            return this;
        }

        public Builder setMdnSettings(AS2MdnSettingsResponse mdnSettings) {
            this.mdnSettings = Objects.requireNonNull(mdnSettings);
            return this;
        }

        public Builder setMessageConnectionSettings(AS2MessageConnectionSettingsResponse messageConnectionSettings) {
            this.messageConnectionSettings = Objects.requireNonNull(messageConnectionSettings);
            return this;
        }

        public Builder setSecuritySettings(AS2SecuritySettingsResponse securitySettings) {
            this.securitySettings = Objects.requireNonNull(securitySettings);
            return this;
        }

        public Builder setValidationSettings(AS2ValidationSettingsResponse validationSettings) {
            this.validationSettings = Objects.requireNonNull(validationSettings);
            return this;
        }
        public AS2ProtocolSettingsResponse build() {
            return new AS2ProtocolSettingsResponse(acknowledgementConnectionSettings, envelopeSettings, errorSettings, mdnSettings, messageConnectionSettings, securitySettings, validationSettings);
        }
    }
}
