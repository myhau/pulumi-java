// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.inputs;

import io.pulumi.azurenative.edgeorder.enums.TransportShipmentTypes;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class TransportPreferencesArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransportPreferencesArgs Empty = new TransportPreferencesArgs();

    @InputImport(name="preferredShipmentType", required=true)
    private final Input<Either<String,TransportShipmentTypes>> preferredShipmentType;

    public Input<Either<String,TransportShipmentTypes>> getPreferredShipmentType() {
        return this.preferredShipmentType;
    }

    public TransportPreferencesArgs(Input<Either<String,TransportShipmentTypes>> preferredShipmentType) {
        this.preferredShipmentType = Objects.requireNonNull(preferredShipmentType, "expected parameter 'preferredShipmentType' to be non-null");
    }

    private TransportPreferencesArgs() {
        this.preferredShipmentType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransportPreferencesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,TransportShipmentTypes>> preferredShipmentType;

        public Builder() {
    	      // Empty
        }

        public Builder(TransportPreferencesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preferredShipmentType = defaults.preferredShipmentType;
        }

        public Builder setPreferredShipmentType(Input<Either<String,TransportShipmentTypes>> preferredShipmentType) {
            this.preferredShipmentType = Objects.requireNonNull(preferredShipmentType);
            return this;
        }

        public Builder setPreferredShipmentType(Either<String,TransportShipmentTypes> preferredShipmentType) {
            this.preferredShipmentType = Input.of(Objects.requireNonNull(preferredShipmentType));
            return this;
        }

        public TransportPreferencesArgs build() {
            return new TransportPreferencesArgs(preferredShipmentType);
        }
    }
}