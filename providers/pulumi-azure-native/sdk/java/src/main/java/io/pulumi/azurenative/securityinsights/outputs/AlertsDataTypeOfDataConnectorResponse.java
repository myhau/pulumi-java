// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.azurenative.securityinsights.outputs.DataConnectorDataTypeCommonResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlertsDataTypeOfDataConnectorResponse {
    /**
     * Alerts data type connection.
     * 
     */
    private final @Nullable DataConnectorDataTypeCommonResponse alerts;

    @CustomType.Constructor
    private AlertsDataTypeOfDataConnectorResponse(@CustomType.Parameter("alerts") @Nullable DataConnectorDataTypeCommonResponse alerts) {
        this.alerts = alerts;
    }

    /**
     * Alerts data type connection.
     * 
    */
    public Optional<DataConnectorDataTypeCommonResponse> alerts() {
        return Optional.ofNullable(this.alerts);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertsDataTypeOfDataConnectorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DataConnectorDataTypeCommonResponse alerts;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertsDataTypeOfDataConnectorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alerts = defaults.alerts;
        }

        public Builder alerts(@Nullable DataConnectorDataTypeCommonResponse alerts) {
            this.alerts = alerts;
            return this;
        }        public AlertsDataTypeOfDataConnectorResponse build() {
            return new AlertsDataTypeOfDataConnectorResponse(alerts);
        }
    }
}
