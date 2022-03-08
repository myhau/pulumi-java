// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TransportPreferencesResponse {
    /**
     * Indicates Shipment Logistics type that the customer preferred.
     * 
     */
    private final String preferredShipmentType;

    @OutputCustomType.Constructor({"preferredShipmentType"})
    private TransportPreferencesResponse(String preferredShipmentType) {
        this.preferredShipmentType = preferredShipmentType;
    }

    /**
     * Indicates Shipment Logistics type that the customer preferred.
     * 
    */
    public String getPreferredShipmentType() {
        return this.preferredShipmentType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransportPreferencesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String preferredShipmentType;

        public Builder() {
    	      // Empty
        }

        public Builder(TransportPreferencesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preferredShipmentType = defaults.preferredShipmentType;
        }

        public Builder setPreferredShipmentType(String preferredShipmentType) {
            this.preferredShipmentType = Objects.requireNonNull(preferredShipmentType);
            return this;
        }
        public TransportPreferencesResponse build() {
            return new TransportPreferencesResponse(preferredShipmentType);
        }
    }
}
