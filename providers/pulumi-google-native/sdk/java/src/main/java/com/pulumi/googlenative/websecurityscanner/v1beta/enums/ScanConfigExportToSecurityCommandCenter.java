// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.websecurityscanner.v1beta.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Controls export of scan configurations and results to Security Command Center.
     * 
     */
    @EnumType
    public enum ScanConfigExportToSecurityCommandCenter {
        /**
         * Use default, which is ENABLED.
         * 
         */
        ExportToSecurityCommandCenterUnspecified("EXPORT_TO_SECURITY_COMMAND_CENTER_UNSPECIFIED"),
        /**
         * Export results of this scan to Security Command Center.
         * 
         */
        Enabled("ENABLED"),
        /**
         * Do not export results of this scan to Security Command Center.
         * 
         */
        Disabled("DISABLED");

        private final String value;

        ScanConfigExportToSecurityCommandCenter(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ScanConfigExportToSecurityCommandCenter[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
