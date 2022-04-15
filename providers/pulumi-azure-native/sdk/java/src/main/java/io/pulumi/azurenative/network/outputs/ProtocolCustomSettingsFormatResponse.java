// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProtocolCustomSettingsFormatResponse {
    /**
     * The protocol for which the DDoS protection policy is being customized.
     * 
     */
    private final @Nullable String protocol;
    /**
     * The customized DDoS protection source rate.
     * 
     */
    private final @Nullable String sourceRateOverride;
    /**
     * The customized DDoS protection trigger rate.
     * 
     */
    private final @Nullable String triggerRateOverride;
    /**
     * The customized DDoS protection trigger rate sensitivity degrees. High: Trigger rate set with most sensitivity w.r.t. normal traffic. Default: Trigger rate set with moderate sensitivity w.r.t. normal traffic. Low: Trigger rate set with less sensitivity w.r.t. normal traffic. Relaxed: Trigger rate set with least sensitivity w.r.t. normal traffic.
     * 
     */
    private final @Nullable String triggerSensitivityOverride;

    @CustomType.Constructor
    private ProtocolCustomSettingsFormatResponse(
        @CustomType.Parameter("protocol") @Nullable String protocol,
        @CustomType.Parameter("sourceRateOverride") @Nullable String sourceRateOverride,
        @CustomType.Parameter("triggerRateOverride") @Nullable String triggerRateOverride,
        @CustomType.Parameter("triggerSensitivityOverride") @Nullable String triggerSensitivityOverride) {
        this.protocol = protocol;
        this.sourceRateOverride = sourceRateOverride;
        this.triggerRateOverride = triggerRateOverride;
        this.triggerSensitivityOverride = triggerSensitivityOverride;
    }

    /**
     * The protocol for which the DDoS protection policy is being customized.
     * 
    */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }
    /**
     * The customized DDoS protection source rate.
     * 
    */
    public Optional<String> sourceRateOverride() {
        return Optional.ofNullable(this.sourceRateOverride);
    }
    /**
     * The customized DDoS protection trigger rate.
     * 
    */
    public Optional<String> triggerRateOverride() {
        return Optional.ofNullable(this.triggerRateOverride);
    }
    /**
     * The customized DDoS protection trigger rate sensitivity degrees. High: Trigger rate set with most sensitivity w.r.t. normal traffic. Default: Trigger rate set with moderate sensitivity w.r.t. normal traffic. Low: Trigger rate set with less sensitivity w.r.t. normal traffic. Relaxed: Trigger rate set with least sensitivity w.r.t. normal traffic.
     * 
    */
    public Optional<String> triggerSensitivityOverride() {
        return Optional.ofNullable(this.triggerSensitivityOverride);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProtocolCustomSettingsFormatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String protocol;
        private @Nullable String sourceRateOverride;
        private @Nullable String triggerRateOverride;
        private @Nullable String triggerSensitivityOverride;

        public Builder() {
    	      // Empty
        }

        public Builder(ProtocolCustomSettingsFormatResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.protocol = defaults.protocol;
    	      this.sourceRateOverride = defaults.sourceRateOverride;
    	      this.triggerRateOverride = defaults.triggerRateOverride;
    	      this.triggerSensitivityOverride = defaults.triggerSensitivityOverride;
        }

        public Builder protocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }
        public Builder sourceRateOverride(@Nullable String sourceRateOverride) {
            this.sourceRateOverride = sourceRateOverride;
            return this;
        }
        public Builder triggerRateOverride(@Nullable String triggerRateOverride) {
            this.triggerRateOverride = triggerRateOverride;
            return this;
        }
        public Builder triggerSensitivityOverride(@Nullable String triggerSensitivityOverride) {
            this.triggerSensitivityOverride = triggerSensitivityOverride;
            return this;
        }        public ProtocolCustomSettingsFormatResponse build() {
            return new ProtocolCustomSettingsFormatResponse(protocol, sourceRateOverride, triggerRateOverride, triggerSensitivityOverride);
        }
    }
}
