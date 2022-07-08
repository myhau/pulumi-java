// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.domains.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The hash function used to generate the digest of the referenced DNSKEY.
     * 
     */
    @EnumType
    public enum DsRecordDigestType {
        /**
         * The DigestType is unspecified.
         * 
         */
        DigestTypeUnspecified("DIGEST_TYPE_UNSPECIFIED"),
        /**
         * SHA-1. Not recommended for new deployments.
         * 
         */
        Sha1("SHA1"),
        /**
         * SHA-256.
         * 
         */
        Sha256("SHA256"),
        /**
         * GOST R 34.11-94.
         * 
         */
        Gost3411("GOST3411"),
        /**
         * SHA-384.
         * 
         */
        Sha384("SHA384");

        private final String value;

        DsRecordDigestType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DsRecordDigestType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
