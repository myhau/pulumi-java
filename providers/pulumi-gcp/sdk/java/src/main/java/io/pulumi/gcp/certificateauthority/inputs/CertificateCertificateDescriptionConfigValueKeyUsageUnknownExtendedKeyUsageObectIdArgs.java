// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdArgs Empty = new CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdArgs();

    /**
     * An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
     * 
     */
    @InputImport(name="objectIdPaths")
    private final @Nullable Input<List<Integer>> objectIdPaths;

    public Input<List<Integer>> getObjectIdPaths() {
        return this.objectIdPaths == null ? Input.empty() : this.objectIdPaths;
    }

    public CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdArgs(@Nullable Input<List<Integer>> objectIdPaths) {
        this.objectIdPaths = objectIdPaths;
    }

    private CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdArgs() {
        this.objectIdPaths = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Integer>> objectIdPaths;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectIdPaths = defaults.objectIdPaths;
        }

        public Builder setObjectIdPaths(@Nullable Input<List<Integer>> objectIdPaths) {
            this.objectIdPaths = objectIdPaths;
            return this;
        }

        public Builder setObjectIdPaths(@Nullable List<Integer> objectIdPaths) {
            this.objectIdPaths = Input.ofNullable(objectIdPaths);
            return this;
        }

        public CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdArgs build() {
            return new CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdArgs(objectIdPaths);
        }
    }
}
