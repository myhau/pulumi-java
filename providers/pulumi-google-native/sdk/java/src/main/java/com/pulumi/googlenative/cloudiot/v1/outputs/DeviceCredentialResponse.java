// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudiot.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.cloudiot.v1.outputs.PublicKeyCredentialResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DeviceCredentialResponse {
    /**
     * @return [Optional] The time at which this credential becomes invalid. This credential will be ignored for new client authentication requests after this timestamp; however, it will not be automatically deleted.
     * 
     */
    private final String expirationTime;
    /**
     * @return A public key used to verify the signature of JSON Web Tokens (JWTs). When adding a new device credential, either via device creation or via modifications, this public key credential may be required to be signed by one of the registry level certificates. More specifically, if the registry contains at least one certificate, any new device credential must be signed by one of the registry certificates. As a result, when the registry contains certificates, only X.509 certificates are accepted as device credentials. However, if the registry does not contain a certificate, self-signed certificates and public keys will be accepted. New device credentials must be different from every registry-level certificate.
     * 
     */
    private final PublicKeyCredentialResponse publicKey;

    @CustomType.Constructor
    private DeviceCredentialResponse(
        @CustomType.Parameter("expirationTime") String expirationTime,
        @CustomType.Parameter("publicKey") PublicKeyCredentialResponse publicKey) {
        this.expirationTime = expirationTime;
        this.publicKey = publicKey;
    }

    /**
     * @return [Optional] The time at which this credential becomes invalid. This credential will be ignored for new client authentication requests after this timestamp; however, it will not be automatically deleted.
     * 
     */
    public String expirationTime() {
        return this.expirationTime;
    }
    /**
     * @return A public key used to verify the signature of JSON Web Tokens (JWTs). When adding a new device credential, either via device creation or via modifications, this public key credential may be required to be signed by one of the registry level certificates. More specifically, if the registry contains at least one certificate, any new device credential must be signed by one of the registry certificates. As a result, when the registry contains certificates, only X.509 certificates are accepted as device credentials. However, if the registry does not contain a certificate, self-signed certificates and public keys will be accepted. New device credentials must be different from every registry-level certificate.
     * 
     */
    public PublicKeyCredentialResponse publicKey() {
        return this.publicKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceCredentialResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expirationTime;
        private PublicKeyCredentialResponse publicKey;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceCredentialResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationTime = defaults.expirationTime;
    	      this.publicKey = defaults.publicKey;
        }

        public Builder expirationTime(String expirationTime) {
            this.expirationTime = Objects.requireNonNull(expirationTime);
            return this;
        }
        public Builder publicKey(PublicKeyCredentialResponse publicKey) {
            this.publicKey = Objects.requireNonNull(publicKey);
            return this;
        }        public DeviceCredentialResponse build() {
            return new DeviceCredentialResponse(expirationTime, publicKey);
        }
    }
}
