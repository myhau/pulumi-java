// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.beyondcorp.v1alpha.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Overall health status. Overall status is derived based on the status of each sub level resources.
     * 
     */
    @EnumType
    public enum ResourceInfoStatus {
        /**
         * Health status is unknown: not initialized or failed to retrieve.
         * 
         */
        HealthStatusUnspecified("HEALTH_STATUS_UNSPECIFIED"),
        /**
         * The resource is healthy.
         * 
         */
        Healthy("HEALTHY"),
        /**
         * The resource is unhealthy.
         * 
         */
        Unhealthy("UNHEALTHY"),
        /**
         * The resource is unresponsive.
         * 
         */
        Unresponsive("UNRESPONSIVE"),
        /**
         * Some sub-resources are UNHEALTHY.
         * 
         */
        Degraded("DEGRADED");

        private final String value;

        ResourceInfoStatus(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ResourceInfoStatus[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
