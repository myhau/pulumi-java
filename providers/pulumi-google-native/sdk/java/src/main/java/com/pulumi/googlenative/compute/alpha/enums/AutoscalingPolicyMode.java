// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Defines operating mode for this policy.
     * 
     */
    @EnumType
    public enum AutoscalingPolicyMode {
        /**
         * Do not automatically scale the MIG in or out. The recommended_size field contains the size of MIG that would be set if the actuation mode was enabled.
         * 
         */
        Off("OFF"),
        /**
         * Automatically scale the MIG in and out according to the policy.
         * 
         */
        On("ON"),
        /**
         * Automatically create VMs according to the policy, but do not scale the MIG in.
         * 
         */
        OnlyScaleOut("ONLY_SCALE_OUT"),
        /**
         * Automatically create VMs according to the policy, but do not scale the MIG in.
         * 
         */
        OnlyUp("ONLY_UP");

        private final String value;

        AutoscalingPolicyMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AutoscalingPolicyMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
