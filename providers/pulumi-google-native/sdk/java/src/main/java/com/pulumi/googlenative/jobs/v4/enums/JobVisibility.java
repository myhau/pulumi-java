// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.jobs.v4.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Deprecated. The job is only visible to the owner. The visibility of the job. Defaults to Visibility.ACCOUNT_ONLY if not specified.
     * 
     */
    @EnumType
    public enum JobVisibility {
        /**
         * Default value.
         * 
         */
        VisibilityUnspecified("VISIBILITY_UNSPECIFIED"),
        /**
         * The resource is only visible to the GCP account who owns it.
         * 
         */
        AccountOnly("ACCOUNT_ONLY"),
        /**
         * The resource is visible to the owner and may be visible to other applications and processes at Google.
         * 
         */
        SharedWithGoogle("SHARED_WITH_GOOGLE"),
        /**
         * The resource is visible to the owner and may be visible to all other API clients.
         * 
         */
        SharedWithPublic("SHARED_WITH_PUBLIC");

        private final String value;

        JobVisibility(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "JobVisibility[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
