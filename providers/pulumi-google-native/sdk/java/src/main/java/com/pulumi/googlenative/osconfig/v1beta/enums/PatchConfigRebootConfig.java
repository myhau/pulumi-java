// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig.v1beta.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Post-patch reboot settings.
     * 
     */
    @EnumType
    public enum PatchConfigRebootConfig {
        /**
         * The default behavior is DEFAULT.
         * 
         */
        RebootConfigUnspecified("REBOOT_CONFIG_UNSPECIFIED"),
        /**
         * The agent decides if a reboot is necessary by checking signals such as registry keys on Windows or `/var/run/reboot-required` on APT based systems. On RPM based systems, a set of core system package install times are compared with system boot time.
         * 
         */
        Default("DEFAULT"),
        /**
         * Always reboot the machine after the update completes.
         * 
         */
        Always("ALWAYS"),
        /**
         * Never reboot the machine after the update completes.
         * 
         */
        Never("NEVER");

        private final String value;

        PatchConfigRebootConfig(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "PatchConfigRebootConfig[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
