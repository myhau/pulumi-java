// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Indicates the type of the snapshot.
     * 
     */
    @EnumType
    public enum SnapshotSnapshotType {
        Archive("ARCHIVE"),
        Standard("STANDARD");

        private final String value;

        SnapshotSnapshotType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SnapshotSnapshotType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
