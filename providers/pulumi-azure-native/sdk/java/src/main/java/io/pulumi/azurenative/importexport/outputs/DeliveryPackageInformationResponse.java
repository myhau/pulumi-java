// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.importexport.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DeliveryPackageInformationResponse {
    private final String carrierName;
    private final @Nullable Double driveCount;
    private final @Nullable String shipDate;
    private final String trackingNumber;

    @OutputCustomType.Constructor({"carrierName","driveCount","shipDate","trackingNumber"})
    private DeliveryPackageInformationResponse(
        String carrierName,
        @Nullable Double driveCount,
        @Nullable String shipDate,
        String trackingNumber) {
        this.carrierName = Objects.requireNonNull(carrierName);
        this.driveCount = driveCount;
        this.shipDate = shipDate;
        this.trackingNumber = Objects.requireNonNull(trackingNumber);
    }

    public String getCarrierName() {
        return this.carrierName;
    }
    public Optional<Double> getDriveCount() {
        return Optional.ofNullable(this.driveCount);
    }
    public Optional<String> getShipDate() {
        return Optional.ofNullable(this.shipDate);
    }
    public String getTrackingNumber() {
        return this.trackingNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryPackageInformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String carrierName;
        private @Nullable Double driveCount;
        private @Nullable String shipDate;
        private String trackingNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryPackageInformationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.carrierName = defaults.carrierName;
    	      this.driveCount = defaults.driveCount;
    	      this.shipDate = defaults.shipDate;
    	      this.trackingNumber = defaults.trackingNumber;
        }

        public Builder setCarrierName(String carrierName) {
            this.carrierName = Objects.requireNonNull(carrierName);
            return this;
        }

        public Builder setDriveCount(@Nullable Double driveCount) {
            this.driveCount = driveCount;
            return this;
        }

        public Builder setShipDate(@Nullable String shipDate) {
            this.shipDate = shipDate;
            return this;
        }

        public Builder setTrackingNumber(String trackingNumber) {
            this.trackingNumber = Objects.requireNonNull(trackingNumber);
            return this;
        }

        public DeliveryPackageInformationResponse build() {
            return new DeliveryPackageInformationResponse(carrierName, driveCount, shipDate, trackingNumber);
        }
    }
}