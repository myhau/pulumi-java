// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.domains.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The algorithm used to generate the referenced DNSKEY.
     * 
     */
    @EnumType
    public enum DsRecordAlgorithm {
        /**
         * The algorithm is unspecified.
         * 
         */
        AlgorithmUnspecified("ALGORITHM_UNSPECIFIED"),
        /**
         * RSA/MD5. Cannot be used for new deployments.
         * 
         */
        Rsamd5("RSAMD5"),
        /**
         * Diffie-Hellman. Cannot be used for new deployments.
         * 
         */
        Dh("DH"),
        /**
         * DSA/SHA1. Not recommended for new deployments.
         * 
         */
        Dsa("DSA"),
        /**
         * ECC. Not recommended for new deployments.
         * 
         */
        Ecc("ECC"),
        /**
         * RSA/SHA-1. Not recommended for new deployments.
         * 
         */
        Rsasha1("RSASHA1"),
        /**
         * DSA-NSEC3-SHA1. Not recommended for new deployments.
         * 
         */
        Dsansec3sha1("DSANSEC3SHA1"),
        /**
         * RSA/SHA1-NSEC3-SHA1. Not recommended for new deployments.
         * 
         */
        Rsasha1nsec3sha1("RSASHA1NSEC3SHA1"),
        /**
         * RSA/SHA-256.
         * 
         */
        Rsasha256("RSASHA256"),
        /**
         * RSA/SHA-512.
         * 
         */
        Rsasha512("RSASHA512"),
        /**
         * GOST R 34.10-2001.
         * 
         */
        Eccgost("ECCGOST"),
        /**
         * ECDSA Curve P-256 with SHA-256.
         * 
         */
        Ecdsap256sha256("ECDSAP256SHA256"),
        /**
         * ECDSA Curve P-384 with SHA-384.
         * 
         */
        Ecdsap384sha384("ECDSAP384SHA384"),
        /**
         * Ed25519.
         * 
         */
        Ed25519("ED25519"),
        /**
         * Ed448.
         * 
         */
        Ed448("ED448"),
        /**
         * Reserved for Indirect Keys. Cannot be used for new deployments.
         * 
         */
        Indirect("INDIRECT"),
        /**
         * Private algorithm. Cannot be used for new deployments.
         * 
         */
        Privatedns("PRIVATEDNS"),
        /**
         * Private algorithm OID. Cannot be used for new deployments.
         * 
         */
        Privateoid("PRIVATEOID");

        private final String value;

        DsRecordAlgorithm(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DsRecordAlgorithm[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
