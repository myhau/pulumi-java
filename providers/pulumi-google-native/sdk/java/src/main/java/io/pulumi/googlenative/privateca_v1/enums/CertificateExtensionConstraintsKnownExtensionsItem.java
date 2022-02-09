// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum CertificateExtensionConstraintsKnownExtensionsItem {
        KnownCertificateExtensionUnspecified("KNOWN_CERTIFICATE_EXTENSION_UNSPECIFIED"),
        BaseKeyUsage("BASE_KEY_USAGE"),
        ExtendedKeyUsage("EXTENDED_KEY_USAGE"),
        CaOptions("CA_OPTIONS"),
        PolicyIds("POLICY_IDS"),
        AiaOcspServers("AIA_OCSP_SERVERS");

        private final String value;

        CertificateExtensionConstraintsKnownExtensionsItem(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "CertificateExtensionConstraintsKnownExtensionsItem[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }