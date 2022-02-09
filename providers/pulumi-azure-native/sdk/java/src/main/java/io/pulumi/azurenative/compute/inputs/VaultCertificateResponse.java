// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VaultCertificateResponse extends io.pulumi.resources.InvokeArgs {

    public static final VaultCertificateResponse Empty = new VaultCertificateResponse();

    @InputImport(name="certificateStore")
    private final @Nullable String certificateStore;

    public Optional<String> getCertificateStore() {
        return this.certificateStore == null ? Optional.empty() : Optional.ofNullable(this.certificateStore);
    }

    @InputImport(name="certificateUrl")
    private final @Nullable String certificateUrl;

    public Optional<String> getCertificateUrl() {
        return this.certificateUrl == null ? Optional.empty() : Optional.ofNullable(this.certificateUrl);
    }

    public VaultCertificateResponse(
        @Nullable String certificateStore,
        @Nullable String certificateUrl) {
        this.certificateStore = certificateStore;
        this.certificateUrl = certificateUrl;
    }

    private VaultCertificateResponse() {
        this.certificateStore = null;
        this.certificateUrl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultCertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String certificateStore;
        private @Nullable String certificateUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultCertificateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateStore = defaults.certificateStore;
    	      this.certificateUrl = defaults.certificateUrl;
        }

        public Builder setCertificateStore(@Nullable String certificateStore) {
            this.certificateStore = certificateStore;
            return this;
        }

        public Builder setCertificateUrl(@Nullable String certificateUrl) {
            this.certificateUrl = certificateUrl;
            return this;
        }

        public VaultCertificateResponse build() {
            return new VaultCertificateResponse(certificateStore, certificateUrl);
        }
    }
}