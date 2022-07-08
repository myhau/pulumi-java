// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies the type of reservation from which this instance can consume resources: ANY_RESERVATION (default), SPECIFIC_RESERVATION, or NO_RESERVATION. See Consuming reserved instances for examples.
     * 
     */
    @EnumType
    public enum ReservationAffinityConsumeReservationType {
        /**
         * Consume any allocation available.
         * 
         */
        AnyReservation("ANY_RESERVATION"),
        /**
         * Do not consume from any allocated capacity.
         * 
         */
        NoReservation("NO_RESERVATION"),
        /**
         * Must consume from a specific reservation. Must specify key value fields for specifying the reservations.
         * 
         */
        SpecificReservation("SPECIFIC_RESERVATION"),
        Unspecified("UNSPECIFIED");

        private final String value;

        ReservationAffinityConsumeReservationType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ReservationAffinityConsumeReservationType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
