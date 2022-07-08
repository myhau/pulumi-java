// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The plan for this commitment, which determines duration and discount rate. The currently supported plans are TWELVE_MONTH (1 year), and THIRTY_SIX_MONTH (3 years).
     * 
     */
    @EnumType
    public enum RegionCommitmentPlan {
        Invalid("INVALID"),
        ThirtySixMonth("THIRTY_SIX_MONTH"),
        TwelveMonth("TWELVE_MONTH");

        private final String value;

        RegionCommitmentPlan(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RegionCommitmentPlan[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
