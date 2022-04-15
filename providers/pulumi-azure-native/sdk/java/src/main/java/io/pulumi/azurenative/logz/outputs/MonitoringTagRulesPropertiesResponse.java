// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz.outputs;

import io.pulumi.azurenative.logz.outputs.LogRulesResponse;
import io.pulumi.azurenative.logz.outputs.SystemDataResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MonitoringTagRulesPropertiesResponse {
    /**
     * Set of rules for sending logs for the Monitor resource.
     * 
     */
    private final @Nullable LogRulesResponse logRules;
    /**
     * Flag specifying if the resource provisioning state as tracked by ARM.
     * 
     */
    private final String provisioningState;
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    private final SystemDataResponse systemData;

    @CustomType.Constructor
    private MonitoringTagRulesPropertiesResponse(
        @CustomType.Parameter("logRules") @Nullable LogRulesResponse logRules,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("systemData") SystemDataResponse systemData) {
        this.logRules = logRules;
        this.provisioningState = provisioningState;
        this.systemData = systemData;
    }

    /**
     * Set of rules for sending logs for the Monitor resource.
     * 
    */
    public Optional<LogRulesResponse> logRules() {
        return Optional.ofNullable(this.logRules);
    }
    /**
     * Flag specifying if the resource provisioning state as tracked by ARM.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
    */
    public SystemDataResponse systemData() {
        return this.systemData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringTagRulesPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LogRulesResponse logRules;
        private String provisioningState;
        private SystemDataResponse systemData;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringTagRulesPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logRules = defaults.logRules;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
        }

        public Builder logRules(@Nullable LogRulesResponse logRules) {
            this.logRules = logRules;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }        public MonitoringTagRulesPropertiesResponse build() {
            return new MonitoringTagRulesPropertiesResponse(logRules, provisioningState, systemData);
        }
    }
}
