// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.azurenative.securityinsights.outputs.TIDataConnectorDataTypesResponseIndicators;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TIDataConnectorDataTypesResponse {
    /**
     * Data type for indicators connection.
     * 
     */
    private final @Nullable TIDataConnectorDataTypesResponseIndicators indicators;

    @CustomType.Constructor
    private TIDataConnectorDataTypesResponse(@CustomType.Parameter("indicators") @Nullable TIDataConnectorDataTypesResponseIndicators indicators) {
        this.indicators = indicators;
    }

    /**
     * Data type for indicators connection.
     * 
    */
    public Optional<TIDataConnectorDataTypesResponseIndicators> indicators() {
        return Optional.ofNullable(this.indicators);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TIDataConnectorDataTypesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TIDataConnectorDataTypesResponseIndicators indicators;

        public Builder() {
    	      // Empty
        }

        public Builder(TIDataConnectorDataTypesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.indicators = defaults.indicators;
        }

        public Builder indicators(@Nullable TIDataConnectorDataTypesResponseIndicators indicators) {
            this.indicators = indicators;
            return this;
        }        public TIDataConnectorDataTypesResponse build() {
            return new TIDataConnectorDataTypesResponse(indicators);
        }
    }
}
