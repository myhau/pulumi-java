// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin.v1beta4.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Dual password status for the user.
     * 
     */
    @EnumType
    public enum UserDualPasswordType {
        /**
         * The default value.
         * 
         */
        DualPasswordTypeUnspecified("DUAL_PASSWORD_TYPE_UNSPECIFIED"),
        /**
         * Do not update the user&#39;s dual password status.
         * 
         */
        NoModifyDualPassword("NO_MODIFY_DUAL_PASSWORD"),
        /**
         * No dual password usable for connecting using this user.
         * 
         */
        NoDualPassword("NO_DUAL_PASSWORD"),
        /**
         * Dual password usable for connecting using this user.
         * 
         */
        DualPassword("DUAL_PASSWORD");

        private final String value;

        UserDualPasswordType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "UserDualPasswordType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
