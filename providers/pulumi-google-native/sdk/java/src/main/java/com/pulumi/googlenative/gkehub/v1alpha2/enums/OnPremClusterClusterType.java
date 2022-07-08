// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub.v1alpha2.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Immutable. The on prem cluster&#39;s type.
     * 
     */
    @EnumType
    public enum OnPremClusterClusterType {
        /**
         * The ClusterType is not set.
         * 
         */
        ClustertypeUnspecified("CLUSTERTYPE_UNSPECIFIED"),
        /**
         * The ClusterType is bootstrap cluster.
         * 
         */
        Bootstrap("BOOTSTRAP"),
        /**
         * The ClusterType is baremetal hybrid cluster.
         * 
         */
        Hybrid("HYBRID"),
        /**
         * The ClusterType is baremetal standalone cluster.
         * 
         */
        Standalone("STANDALONE"),
        /**
         * The ClusterType is user cluster.
         * 
         */
        User("USER");

        private final String value;

        OnPremClusterClusterType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "OnPremClusterClusterType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
