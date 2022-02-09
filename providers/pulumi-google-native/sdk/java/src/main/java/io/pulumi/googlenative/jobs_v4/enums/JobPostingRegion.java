// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v4.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum JobPostingRegion {
        PostingRegionUnspecified("POSTING_REGION_UNSPECIFIED"),
        AdministrativeArea("ADMINISTRATIVE_AREA"),
        Nation("NATION"),
        Telecommute("TELECOMMUTE");

        private final String value;

        JobPostingRegion(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "JobPostingRegion[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }