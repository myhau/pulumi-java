// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.FirewallPolicyIntrusionDetectionBypassTrafficSpecificationsResponse;
import io.pulumi.azurenative.network.outputs.FirewallPolicyIntrusionDetectionSignatureSpecificationResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class FirewallPolicyIntrusionDetectionConfigurationResponse {
    /**
     * List of rules for traffic to bypass.
     * 
     */
    private final @Nullable List<FirewallPolicyIntrusionDetectionBypassTrafficSpecificationsResponse> bypassTrafficSettings;
    /**
     * List of specific signatures states.
     * 
     */
    private final @Nullable List<FirewallPolicyIntrusionDetectionSignatureSpecificationResponse> signatureOverrides;

    @CustomType.Constructor
    private FirewallPolicyIntrusionDetectionConfigurationResponse(
        @CustomType.Parameter("bypassTrafficSettings") @Nullable List<FirewallPolicyIntrusionDetectionBypassTrafficSpecificationsResponse> bypassTrafficSettings,
        @CustomType.Parameter("signatureOverrides") @Nullable List<FirewallPolicyIntrusionDetectionSignatureSpecificationResponse> signatureOverrides) {
        this.bypassTrafficSettings = bypassTrafficSettings;
        this.signatureOverrides = signatureOverrides;
    }

    /**
     * List of rules for traffic to bypass.
     * 
    */
    public List<FirewallPolicyIntrusionDetectionBypassTrafficSpecificationsResponse> bypassTrafficSettings() {
        return this.bypassTrafficSettings == null ? List.of() : this.bypassTrafficSettings;
    }
    /**
     * List of specific signatures states.
     * 
    */
    public List<FirewallPolicyIntrusionDetectionSignatureSpecificationResponse> signatureOverrides() {
        return this.signatureOverrides == null ? List.of() : this.signatureOverrides;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyIntrusionDetectionConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<FirewallPolicyIntrusionDetectionBypassTrafficSpecificationsResponse> bypassTrafficSettings;
        private @Nullable List<FirewallPolicyIntrusionDetectionSignatureSpecificationResponse> signatureOverrides;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyIntrusionDetectionConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bypassTrafficSettings = defaults.bypassTrafficSettings;
    	      this.signatureOverrides = defaults.signatureOverrides;
        }

        public Builder bypassTrafficSettings(@Nullable List<FirewallPolicyIntrusionDetectionBypassTrafficSpecificationsResponse> bypassTrafficSettings) {
            this.bypassTrafficSettings = bypassTrafficSettings;
            return this;
        }
        public Builder bypassTrafficSettings(FirewallPolicyIntrusionDetectionBypassTrafficSpecificationsResponse... bypassTrafficSettings) {
            return bypassTrafficSettings(List.of(bypassTrafficSettings));
        }
        public Builder signatureOverrides(@Nullable List<FirewallPolicyIntrusionDetectionSignatureSpecificationResponse> signatureOverrides) {
            this.signatureOverrides = signatureOverrides;
            return this;
        }
        public Builder signatureOverrides(FirewallPolicyIntrusionDetectionSignatureSpecificationResponse... signatureOverrides) {
            return signatureOverrides(List.of(signatureOverrides));
        }        public FirewallPolicyIntrusionDetectionConfigurationResponse build() {
            return new FirewallPolicyIntrusionDetectionConfigurationResponse(bypassTrafficSettings, signatureOverrides);
        }
    }
}
