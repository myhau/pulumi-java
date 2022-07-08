// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1beta1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The alias kind.
     * 
     */
    @EnumType
    public enum AliasContextKind {
        /**
         * Unknown.
         * 
         */
        KindUnspecified("KIND_UNSPECIFIED"),
        /**
         * Git tag.
         * 
         */
        Fixed("FIXED"),
        /**
         * Git branch.
         * 
         */
        Movable("MOVABLE"),
        /**
         * Used to specify non-standard aliases. For example, if a Git repo has a ref named &#34;refs/foo/bar&#34;.
         * 
         */
        Other("OTHER");

        private final String value;

        AliasContextKind(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AliasContextKind[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
