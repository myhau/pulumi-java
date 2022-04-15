// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningcompute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SslConfigurationResponse {
    /**
     * The SSL cert data in PEM format.
     * 
     */
    private final @Nullable String cert;
    /**
     * The CName of the certificate.
     * 
     */
    private final @Nullable String cname;
    /**
     * The SSL key data in PEM format. This is not returned in response of GET/PUT on the resource. To see this please call listKeys API.
     * 
     */
    private final @Nullable String key;
    /**
     * SSL status. Allowed values are Enabled and Disabled.
     * 
     */
    private final @Nullable String status;

    @CustomType.Constructor
    private SslConfigurationResponse(
        @CustomType.Parameter("cert") @Nullable String cert,
        @CustomType.Parameter("cname") @Nullable String cname,
        @CustomType.Parameter("key") @Nullable String key,
        @CustomType.Parameter("status") @Nullable String status) {
        this.cert = cert;
        this.cname = cname;
        this.key = key;
        this.status = status;
    }

    /**
     * The SSL cert data in PEM format.
     * 
    */
    public Optional<String> cert() {
        return Optional.ofNullable(this.cert);
    }
    /**
     * The CName of the certificate.
     * 
    */
    public Optional<String> cname() {
        return Optional.ofNullable(this.cname);
    }
    /**
     * The SSL key data in PEM format. This is not returned in response of GET/PUT on the resource. To see this please call listKeys API.
     * 
    */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    /**
     * SSL status. Allowed values are Enabled and Disabled.
     * 
    */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SslConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cert;
        private @Nullable String cname;
        private @Nullable String key;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(SslConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cert = defaults.cert;
    	      this.cname = defaults.cname;
    	      this.key = defaults.key;
    	      this.status = defaults.status;
        }

        public Builder cert(@Nullable String cert) {
            this.cert = cert;
            return this;
        }
        public Builder cname(@Nullable String cname) {
            this.cname = cname;
            return this;
        }
        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }        public SslConfigurationResponse build() {
            return new SslConfigurationResponse(cert, cname, key, status);
        }
    }
}
