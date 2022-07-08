// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * This field is for internal use. This field can be both set at resource creation time and updated using patch.
     * 
     */
    @EnumType
    public enum SubnetworkPrivateIpv6GoogleAccess {
        /**
         * Disable private IPv6 access to/from Google services.
         * 
         */
        DisableGoogleAccess("DISABLE_GOOGLE_ACCESS"),
        /**
         * Bidirectional private IPv6 access to/from Google services.
         * 
         */
        EnableBidirectionalAccessToGoogle("ENABLE_BIDIRECTIONAL_ACCESS_TO_GOOGLE"),
        /**
         * Outbound private IPv6 access from VMs in this subnet to Google services.
         * 
         */
        EnableOutboundVmAccessToGoogle("ENABLE_OUTBOUND_VM_ACCESS_TO_GOOGLE");

        private final String value;

        SubnetworkPrivateIpv6GoogleAccess(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SubnetworkPrivateIpv6GoogleAccess[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
