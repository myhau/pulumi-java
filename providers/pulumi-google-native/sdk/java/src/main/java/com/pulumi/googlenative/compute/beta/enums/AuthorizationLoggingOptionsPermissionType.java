// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @EnumType
    public enum AuthorizationLoggingOptionsPermissionType {
        /**
         * This is deprecated and has no effect. Do not use.
         * 
         */
        AdminRead("ADMIN_READ"),
        /**
         * This is deprecated and has no effect. Do not use.
         * 
         */
        AdminWrite("ADMIN_WRITE"),
        /**
         * This is deprecated and has no effect. Do not use.
         * 
         */
        DataRead("DATA_READ"),
        /**
         * This is deprecated and has no effect. Do not use.
         * 
         */
        DataWrite("DATA_WRITE"),
        /**
         * This is deprecated and has no effect. Do not use.
         * 
         */
        PermissionTypeUnspecified("PERMISSION_TYPE_UNSPECIFIED");

        private final String value;

        AuthorizationLoggingOptionsPermissionType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AuthorizationLoggingOptionsPermissionType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
