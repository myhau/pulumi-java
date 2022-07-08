// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The CPU architecture for which packages in this distribution channel were built.
     * 
     */
    @EnumType
    public enum DistributionArchitecture {
        /**
         * Unknown architecture.
         * 
         */
        ArchitectureUnspecified("ARCHITECTURE_UNSPECIFIED"),
        /**
         * X86 architecture.
         * 
         */
        X86("X86"),
        /**
         * X64 architecture.
         * 
         */
        X64("X64");

        private final String value;

        DistributionArchitecture(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DistributionArchitecture[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
