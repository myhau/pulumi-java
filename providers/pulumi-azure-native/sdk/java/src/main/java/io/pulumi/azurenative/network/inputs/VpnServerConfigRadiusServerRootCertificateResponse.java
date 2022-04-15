// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of Radius Server root certificate of VpnServerConfiguration.
 * 
 */
public final class VpnServerConfigRadiusServerRootCertificateResponse extends io.pulumi.resources.InvokeArgs {

    public static final VpnServerConfigRadiusServerRootCertificateResponse Empty = new VpnServerConfigRadiusServerRootCertificateResponse();

    /**
     * The certificate name.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The certificate public data.
     * 
     */
    @Import(name="publicCertData")
      private final @Nullable String publicCertData;

    public Optional<String> publicCertData() {
        return this.publicCertData == null ? Optional.empty() : Optional.ofNullable(this.publicCertData);
    }

    public VpnServerConfigRadiusServerRootCertificateResponse(
        @Nullable String name,
        @Nullable String publicCertData) {
        this.name = name;
        this.publicCertData = publicCertData;
    }

    private VpnServerConfigRadiusServerRootCertificateResponse() {
        this.name = null;
        this.publicCertData = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnServerConfigRadiusServerRootCertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String publicCertData;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnServerConfigRadiusServerRootCertificateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.publicCertData = defaults.publicCertData;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder publicCertData(@Nullable String publicCertData) {
            this.publicCertData = publicCertData;
            return this;
        }        public VpnServerConfigRadiusServerRootCertificateResponse build() {
            return new VpnServerConfigRadiusServerRootCertificateResponse(name, publicCertData);
        }
    }
}
