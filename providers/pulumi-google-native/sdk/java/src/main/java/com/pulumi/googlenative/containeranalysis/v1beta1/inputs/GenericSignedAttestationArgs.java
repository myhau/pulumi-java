// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis.v1beta1.enums.GenericSignedAttestationContentType;
import com.pulumi.googlenative.containeranalysis.v1beta1.inputs.SignatureArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An attestation wrapper that uses the Grafeas `Signature` message. This attestation must define the `serialized_payload` that the `signatures` verify and any metadata necessary to interpret that plaintext. The signatures should always be over the `serialized_payload` bytestring.
 * 
 */
public final class GenericSignedAttestationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GenericSignedAttestationArgs Empty = new GenericSignedAttestationArgs();

    /**
     * Type (for example schema) of the attestation payload that was signed. The verifier must ensure that the provided type is one that the verifier supports, and that the attestation payload is a valid instantiation of that type (for example by validating a JSON schema).
     * 
     */
    @Import(name="contentType")
    private @Nullable Output<GenericSignedAttestationContentType> contentType;

    /**
     * @return Type (for example schema) of the attestation payload that was signed. The verifier must ensure that the provided type is one that the verifier supports, and that the attestation payload is a valid instantiation of that type (for example by validating a JSON schema).
     * 
     */
    public Optional<Output<GenericSignedAttestationContentType>> contentType() {
        return Optional.ofNullable(this.contentType);
    }

    /**
     * The serialized payload that is verified by one or more `signatures`. The encoding and semantic meaning of this payload must match what is set in `content_type`.
     * 
     */
    @Import(name="serializedPayload")
    private @Nullable Output<String> serializedPayload;

    /**
     * @return The serialized payload that is verified by one or more `signatures`. The encoding and semantic meaning of this payload must match what is set in `content_type`.
     * 
     */
    public Optional<Output<String>> serializedPayload() {
        return Optional.ofNullable(this.serializedPayload);
    }

    /**
     * One or more signatures over `serialized_payload`. Verifier implementations should consider this attestation message verified if at least one `signature` verifies `serialized_payload`. See `Signature` in common.proto for more details on signature structure and verification.
     * 
     */
    @Import(name="signatures")
    private @Nullable Output<List<SignatureArgs>> signatures;

    /**
     * @return One or more signatures over `serialized_payload`. Verifier implementations should consider this attestation message verified if at least one `signature` verifies `serialized_payload`. See `Signature` in common.proto for more details on signature structure and verification.
     * 
     */
    public Optional<Output<List<SignatureArgs>>> signatures() {
        return Optional.ofNullable(this.signatures);
    }

    private GenericSignedAttestationArgs() {}

    private GenericSignedAttestationArgs(GenericSignedAttestationArgs $) {
        this.contentType = $.contentType;
        this.serializedPayload = $.serializedPayload;
        this.signatures = $.signatures;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GenericSignedAttestationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GenericSignedAttestationArgs $;

        public Builder() {
            $ = new GenericSignedAttestationArgs();
        }

        public Builder(GenericSignedAttestationArgs defaults) {
            $ = new GenericSignedAttestationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contentType Type (for example schema) of the attestation payload that was signed. The verifier must ensure that the provided type is one that the verifier supports, and that the attestation payload is a valid instantiation of that type (for example by validating a JSON schema).
         * 
         * @return builder
         * 
         */
        public Builder contentType(@Nullable Output<GenericSignedAttestationContentType> contentType) {
            $.contentType = contentType;
            return this;
        }

        /**
         * @param contentType Type (for example schema) of the attestation payload that was signed. The verifier must ensure that the provided type is one that the verifier supports, and that the attestation payload is a valid instantiation of that type (for example by validating a JSON schema).
         * 
         * @return builder
         * 
         */
        public Builder contentType(GenericSignedAttestationContentType contentType) {
            return contentType(Output.of(contentType));
        }

        /**
         * @param serializedPayload The serialized payload that is verified by one or more `signatures`. The encoding and semantic meaning of this payload must match what is set in `content_type`.
         * 
         * @return builder
         * 
         */
        public Builder serializedPayload(@Nullable Output<String> serializedPayload) {
            $.serializedPayload = serializedPayload;
            return this;
        }

        /**
         * @param serializedPayload The serialized payload that is verified by one or more `signatures`. The encoding and semantic meaning of this payload must match what is set in `content_type`.
         * 
         * @return builder
         * 
         */
        public Builder serializedPayload(String serializedPayload) {
            return serializedPayload(Output.of(serializedPayload));
        }

        /**
         * @param signatures One or more signatures over `serialized_payload`. Verifier implementations should consider this attestation message verified if at least one `signature` verifies `serialized_payload`. See `Signature` in common.proto for more details on signature structure and verification.
         * 
         * @return builder
         * 
         */
        public Builder signatures(@Nullable Output<List<SignatureArgs>> signatures) {
            $.signatures = signatures;
            return this;
        }

        /**
         * @param signatures One or more signatures over `serialized_payload`. Verifier implementations should consider this attestation message verified if at least one `signature` verifies `serialized_payload`. See `Signature` in common.proto for more details on signature structure and verification.
         * 
         * @return builder
         * 
         */
        public Builder signatures(List<SignatureArgs> signatures) {
            return signatures(Output.of(signatures));
        }

        /**
         * @param signatures One or more signatures over `serialized_payload`. Verifier implementations should consider this attestation message verified if at least one `signature` verifies `serialized_payload`. See `Signature` in common.proto for more details on signature structure and verification.
         * 
         * @return builder
         * 
         */
        public Builder signatures(SignatureArgs... signatures) {
            return signatures(List.of(signatures));
        }

        public GenericSignedAttestationArgs build() {
            return $;
        }
    }

}
