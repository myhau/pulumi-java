// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datamigration.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The log type that this config enables.
     * 
     */
    @EnumType
    public enum AuditLogConfigLogType {
        /**
         * Default case. Should never be this.
         * 
         */
        LogTypeUnspecified("LOG_TYPE_UNSPECIFIED"),
        /**
         * Admin reads. Example: CloudIAM getIamPolicy
         * 
         */
        AdminRead("ADMIN_READ"),
        /**
         * Data writes. Example: CloudSQL Users create
         * 
         */
        DataWrite("DATA_WRITE"),
        /**
         * Data reads. Example: CloudSQL Users list
         * 
         */
        DataRead("DATA_READ");

        private final String value;

        AuditLogConfigLogType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AuditLogConfigLogType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
