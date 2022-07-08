// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub.v1beta1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Optional. The infrastructure type this Membership is running on.
     * 
     */
    @EnumType
    public enum MembershipInfrastructureType {
        /**
         * No type was specified. Some Hub functionality may require a type be specified, and will not support Memberships with this value.
         * 
         */
        InfrastructureTypeUnspecified("INFRASTRUCTURE_TYPE_UNSPECIFIED"),
        /**
         * Private infrastructure that is owned or operated by customer. This includes GKE distributions such as GKE-OnPrem and GKE-OnBareMetal.
         * 
         */
        OnPrem("ON_PREM"),
        /**
         * Public cloud infrastructure.
         * 
         */
        MultiCloud("MULTI_CLOUD");

        private final String value;

        MembershipInfrastructureType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "MembershipInfrastructureType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
