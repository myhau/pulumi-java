// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.binaryauthorization.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AttestorAttestationAuthorityNotePublicKeyPkixPublicKeyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AttestorAttestationAuthorityNotePublicKeyPkixPublicKeyGetArgs Empty = new AttestorAttestationAuthorityNotePublicKeyPkixPublicKeyGetArgs();

    /**
     * A PEM-encoded public key, as described in
     * `https://tools.ietf.org/html/rfc7468#section-13`
     * 
     */
    @InputImport(name="publicKeyPem")
    private final @Nullable Input<String> publicKeyPem;

    public Input<String> getPublicKeyPem() {
        return this.publicKeyPem == null ? Input.empty() : this.publicKeyPem;
    }

    /**
     * The signature algorithm used to verify a message against
     * a signature using this key. These signature algorithm must
     * match the structure and any object identifiers encoded in
     * publicKeyPem (i.e. this algorithm must match that of the
     * public key).
     * 
     */
    @InputImport(name="signatureAlgorithm")
    private final @Nullable Input<String> signatureAlgorithm;

    public Input<String> getSignatureAlgorithm() {
        return this.signatureAlgorithm == null ? Input.empty() : this.signatureAlgorithm;
    }

    public AttestorAttestationAuthorityNotePublicKeyPkixPublicKeyGetArgs(
        @Nullable Input<String> publicKeyPem,
        @Nullable Input<String> signatureAlgorithm) {
        this.publicKeyPem = publicKeyPem;
        this.signatureAlgorithm = signatureAlgorithm;
    }

    private AttestorAttestationAuthorityNotePublicKeyPkixPublicKeyGetArgs() {
        this.publicKeyPem = Input.empty();
        this.signatureAlgorithm = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttestorAttestationAuthorityNotePublicKeyPkixPublicKeyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> publicKeyPem;
        private @Nullable Input<String> signatureAlgorithm;

        public Builder() {
    	      // Empty
        }

        public Builder(AttestorAttestationAuthorityNotePublicKeyPkixPublicKeyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicKeyPem = defaults.publicKeyPem;
    	      this.signatureAlgorithm = defaults.signatureAlgorithm;
        }

        public Builder setPublicKeyPem(@Nullable Input<String> publicKeyPem) {
            this.publicKeyPem = publicKeyPem;
            return this;
        }

        public Builder setPublicKeyPem(@Nullable String publicKeyPem) {
            this.publicKeyPem = Input.ofNullable(publicKeyPem);
            return this;
        }

        public Builder setSignatureAlgorithm(@Nullable Input<String> signatureAlgorithm) {
            this.signatureAlgorithm = signatureAlgorithm;
            return this;
        }

        public Builder setSignatureAlgorithm(@Nullable String signatureAlgorithm) {
            this.signatureAlgorithm = Input.ofNullable(signatureAlgorithm);
            return this;
        }

        public AttestorAttestationAuthorityNotePublicKeyPkixPublicKeyGetArgs build() {
            return new AttestorAttestationAuthorityNotePublicKeyPkixPublicKeyGetArgs(publicKeyPem, signatureAlgorithm);
        }
    }
}
