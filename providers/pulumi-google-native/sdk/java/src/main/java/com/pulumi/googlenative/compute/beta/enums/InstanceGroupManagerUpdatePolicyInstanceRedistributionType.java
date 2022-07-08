// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The instance redistribution policy for regional managed instance groups. Valid values are: - PROACTIVE (default): The group attempts to maintain an even distribution of VM instances across zones in the region. - NONE: For non-autoscaled groups, proactive redistribution is disabled.
     * 
     */
    @EnumType
    public enum InstanceGroupManagerUpdatePolicyInstanceRedistributionType {
        /**
         * No action is being proactively performed in order to bring this IGM to its target instance distribution.
         * 
         */
        None("NONE"),
        /**
         * This IGM will actively converge to its target instance distribution.
         * 
         */
        Proactive("PROACTIVE");

        private final String value;

        InstanceGroupManagerUpdatePolicyInstanceRedistributionType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "InstanceGroupManagerUpdatePolicyInstanceRedistributionType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
