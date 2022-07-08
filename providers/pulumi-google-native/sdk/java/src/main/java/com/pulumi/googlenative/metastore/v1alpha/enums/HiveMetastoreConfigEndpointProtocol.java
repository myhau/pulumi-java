// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.metastore.v1alpha.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The protocol to use for the metastore service endpoint. If unspecified, defaults to THRIFT.
     * 
     */
    @EnumType
    public enum HiveMetastoreConfigEndpointProtocol {
        /**
         * The protocol is not set.
         * 
         */
        EndpointProtocolUnspecified("ENDPOINT_PROTOCOL_UNSPECIFIED"),
        /**
         * Use the legacy Apache Thrift protocol for the metastore service endpoint.
         * 
         */
        Thrift("THRIFT"),
        /**
         * Use the modernized gRPC protocol for the metastore service endpoint.
         * 
         */
        Grpc("GRPC");

        private final String value;

        HiveMetastoreConfigEndpointProtocol(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "HiveMetastoreConfigEndpointProtocol[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
