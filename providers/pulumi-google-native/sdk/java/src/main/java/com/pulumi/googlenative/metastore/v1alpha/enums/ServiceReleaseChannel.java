// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.metastore.v1alpha.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Immutable. The release channel of the service. If unspecified, defaults to STABLE.
     * 
     */
    @EnumType
    public enum ServiceReleaseChannel {
        /**
         * Release channel is not specified.
         * 
         */
        ReleaseChannelUnspecified("RELEASE_CHANNEL_UNSPECIFIED"),
        /**
         * The CANARY release channel contains the newest features, which may be unstable and subject to unresolved issues with no known workarounds. Services using the CANARY release channel are not subject to any SLAs.
         * 
         */
        Canary("CANARY"),
        /**
         * The STABLE release channel contains features that are considered stable and have been validated for production use.
         * 
         */
        Stable("STABLE");

        private final String value;

        ServiceReleaseChannel(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ServiceReleaseChannel[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
