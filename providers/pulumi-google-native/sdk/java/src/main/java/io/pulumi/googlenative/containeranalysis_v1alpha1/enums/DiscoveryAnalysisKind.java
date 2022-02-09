// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum DiscoveryAnalysisKind {
        KindUnspecified("KIND_UNSPECIFIED"),
        PackageVulnerability("PACKAGE_VULNERABILITY"),
        BuildDetails("BUILD_DETAILS"),
        ImageBasis("IMAGE_BASIS"),
        PackageManager("PACKAGE_MANAGER"),
        Deployable("DEPLOYABLE"),
        Discovery("DISCOVERY"),
        AttestationAuthority("ATTESTATION_AUTHORITY"),
        Upgrade("UPGRADE"),
        Compliance("COMPLIANCE"),
        Sbom("SBOM"),
        SpdxPackage("SPDX_PACKAGE"),
        SpdxFile("SPDX_FILE"),
        SpdxRelationship("SPDX_RELATIONSHIP"),
        DsseAttestation("DSSE_ATTESTATION");

        private final String value;

        DiscoveryAnalysisKind(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DiscoveryAnalysisKind[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }