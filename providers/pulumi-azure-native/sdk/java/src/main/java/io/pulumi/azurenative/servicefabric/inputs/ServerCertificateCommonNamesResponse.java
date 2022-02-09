// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.azurenative.servicefabric.inputs.ServerCertificateCommonNameResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServerCertificateCommonNamesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServerCertificateCommonNamesResponse Empty = new ServerCertificateCommonNamesResponse();

    @InputImport(name="commonNames")
    private final @Nullable List<ServerCertificateCommonNameResponse> commonNames;

    public List<ServerCertificateCommonNameResponse> getCommonNames() {
        return this.commonNames == null ? List.of() : this.commonNames;
    }

    @InputImport(name="x509StoreName")
    private final @Nullable String x509StoreName;

    public Optional<String> getX509StoreName() {
        return this.x509StoreName == null ? Optional.empty() : Optional.ofNullable(this.x509StoreName);
    }

    public ServerCertificateCommonNamesResponse(
        @Nullable List<ServerCertificateCommonNameResponse> commonNames,
        @Nullable String x509StoreName) {
        this.commonNames = commonNames;
        this.x509StoreName = x509StoreName;
    }

    private ServerCertificateCommonNamesResponse() {
        this.commonNames = List.of();
        this.x509StoreName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerCertificateCommonNamesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ServerCertificateCommonNameResponse> commonNames;
        private @Nullable String x509StoreName;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerCertificateCommonNamesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commonNames = defaults.commonNames;
    	      this.x509StoreName = defaults.x509StoreName;
        }

        public Builder setCommonNames(@Nullable List<ServerCertificateCommonNameResponse> commonNames) {
            this.commonNames = commonNames;
            return this;
        }

        public Builder setX509StoreName(@Nullable String x509StoreName) {
            this.x509StoreName = x509StoreName;
            return this;
        }

        public ServerCertificateCommonNamesResponse build() {
            return new ServerCertificateCommonNamesResponse(commonNames, x509StoreName);
        }
    }
}