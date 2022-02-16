// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca.inputs;

import io.pulumi.awsnative.acmpca.inputs.CertificateAuthorityCrlConfiguration;
import io.pulumi.awsnative.acmpca.inputs.CertificateAuthorityOcspConfiguration;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateAuthorityRevocationConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final CertificateAuthorityRevocationConfiguration Empty = new CertificateAuthorityRevocationConfiguration();

    @InputImport(name="crlConfiguration")
    private final @Nullable CertificateAuthorityCrlConfiguration crlConfiguration;

    public Optional<CertificateAuthorityCrlConfiguration> getCrlConfiguration() {
        return this.crlConfiguration == null ? Optional.empty() : Optional.ofNullable(this.crlConfiguration);
    }

    @InputImport(name="ocspConfiguration")
    private final @Nullable CertificateAuthorityOcspConfiguration ocspConfiguration;

    public Optional<CertificateAuthorityOcspConfiguration> getOcspConfiguration() {
        return this.ocspConfiguration == null ? Optional.empty() : Optional.ofNullable(this.ocspConfiguration);
    }

    public CertificateAuthorityRevocationConfiguration(
        @Nullable CertificateAuthorityCrlConfiguration crlConfiguration,
        @Nullable CertificateAuthorityOcspConfiguration ocspConfiguration) {
        this.crlConfiguration = crlConfiguration;
        this.ocspConfiguration = ocspConfiguration;
    }

    private CertificateAuthorityRevocationConfiguration() {
        this.crlConfiguration = null;
        this.ocspConfiguration = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateAuthorityRevocationConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CertificateAuthorityCrlConfiguration crlConfiguration;
        private @Nullable CertificateAuthorityOcspConfiguration ocspConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateAuthorityRevocationConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crlConfiguration = defaults.crlConfiguration;
    	      this.ocspConfiguration = defaults.ocspConfiguration;
        }

        public Builder setCrlConfiguration(@Nullable CertificateAuthorityCrlConfiguration crlConfiguration) {
            this.crlConfiguration = crlConfiguration;
            return this;
        }

        public Builder setOcspConfiguration(@Nullable CertificateAuthorityOcspConfiguration ocspConfiguration) {
            this.ocspConfiguration = ocspConfiguration;
            return this;
        }

        public CertificateAuthorityRevocationConfiguration build() {
            return new CertificateAuthorityRevocationConfiguration(crlConfiguration, ocspConfiguration);
        }
    }
}