// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gameservices.v1beta.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Trusted attributes supplied by any service that owns resources and uses the IAM system for access control.
     * 
     */
    @EnumType
    public enum ConditionSys {
        /**
         * Default non-attribute type
         * 
         */
        NoAttr("NO_ATTR"),
        /**
         * Region of the resource
         * 
         */
        Region("REGION"),
        /**
         * Service name
         * 
         */
        Service("SERVICE"),
        /**
         * Resource name
         * 
         */
        Name("NAME"),
        /**
         * IP address of the caller
         * 
         */
        Ip("IP");

        private final String value;

        ConditionSys(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ConditionSys[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
