// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Option to specify behavior when there is an error in the substitution checks. NOTE: this is always set to ALLOW_LOOSE for triggered builds and cannot be overridden in the build configuration file.
     * 
     */
    @EnumType
    public enum BuildOptionsSubstitutionOption {
        /**
         * Fails the build if error in substitutions checks, like missing a substitution in the template or in the map.
         * 
         */
        MustMatch("MUST_MATCH"),
        /**
         * Do not fail the build if error in substitutions checks.
         * 
         */
        AllowLoose("ALLOW_LOOSE");

        private final String value;

        BuildOptionsSubstitutionOption(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "BuildOptionsSubstitutionOption[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
