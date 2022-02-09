// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aad.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LdapsSettingsResponse {
    private final String certificateNotAfter;
    private final String certificateThumbprint;
    private final @Nullable String externalAccess;
    private final @Nullable String ldaps;
    private final @Nullable String pfxCertificate;
    private final @Nullable String pfxCertificatePassword;
    private final String publicCertificate;

    @OutputCustomType.Constructor({"certificateNotAfter","certificateThumbprint","externalAccess","ldaps","pfxCertificate","pfxCertificatePassword","publicCertificate"})
    private LdapsSettingsResponse(
        String certificateNotAfter,
        String certificateThumbprint,
        @Nullable String externalAccess,
        @Nullable String ldaps,
        @Nullable String pfxCertificate,
        @Nullable String pfxCertificatePassword,
        String publicCertificate) {
        this.certificateNotAfter = Objects.requireNonNull(certificateNotAfter);
        this.certificateThumbprint = Objects.requireNonNull(certificateThumbprint);
        this.externalAccess = externalAccess;
        this.ldaps = ldaps;
        this.pfxCertificate = pfxCertificate;
        this.pfxCertificatePassword = pfxCertificatePassword;
        this.publicCertificate = Objects.requireNonNull(publicCertificate);
    }

    public String getCertificateNotAfter() {
        return this.certificateNotAfter;
    }
    public String getCertificateThumbprint() {
        return this.certificateThumbprint;
    }
    public Optional<String> getExternalAccess() {
        return Optional.ofNullable(this.externalAccess);
    }
    public Optional<String> getLdaps() {
        return Optional.ofNullable(this.ldaps);
    }
    public Optional<String> getPfxCertificate() {
        return Optional.ofNullable(this.pfxCertificate);
    }
    public Optional<String> getPfxCertificatePassword() {
        return Optional.ofNullable(this.pfxCertificatePassword);
    }
    public String getPublicCertificate() {
        return this.publicCertificate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LdapsSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateNotAfter;
        private String certificateThumbprint;
        private @Nullable String externalAccess;
        private @Nullable String ldaps;
        private @Nullable String pfxCertificate;
        private @Nullable String pfxCertificatePassword;
        private String publicCertificate;

        public Builder() {
    	      // Empty
        }

        public Builder(LdapsSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateNotAfter = defaults.certificateNotAfter;
    	      this.certificateThumbprint = defaults.certificateThumbprint;
    	      this.externalAccess = defaults.externalAccess;
    	      this.ldaps = defaults.ldaps;
    	      this.pfxCertificate = defaults.pfxCertificate;
    	      this.pfxCertificatePassword = defaults.pfxCertificatePassword;
    	      this.publicCertificate = defaults.publicCertificate;
        }

        public Builder setCertificateNotAfter(String certificateNotAfter) {
            this.certificateNotAfter = Objects.requireNonNull(certificateNotAfter);
            return this;
        }

        public Builder setCertificateThumbprint(String certificateThumbprint) {
            this.certificateThumbprint = Objects.requireNonNull(certificateThumbprint);
            return this;
        }

        public Builder setExternalAccess(@Nullable String externalAccess) {
            this.externalAccess = externalAccess;
            return this;
        }

        public Builder setLdaps(@Nullable String ldaps) {
            this.ldaps = ldaps;
            return this;
        }

        public Builder setPfxCertificate(@Nullable String pfxCertificate) {
            this.pfxCertificate = pfxCertificate;
            return this;
        }

        public Builder setPfxCertificatePassword(@Nullable String pfxCertificatePassword) {
            this.pfxCertificatePassword = pfxCertificatePassword;
            return this;
        }

        public Builder setPublicCertificate(String publicCertificate) {
            this.publicCertificate = Objects.requireNonNull(publicCertificate);
            return this;
        }

        public LdapsSettingsResponse build() {
            return new LdapsSettingsResponse(certificateNotAfter, certificateThumbprint, externalAccess, ldaps, pfxCertificate, pfxCertificatePassword, publicCertificate);
        }
    }
}