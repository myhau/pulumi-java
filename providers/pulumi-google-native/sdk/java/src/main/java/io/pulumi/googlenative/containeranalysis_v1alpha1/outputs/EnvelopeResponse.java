// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.EnvelopeSignatureResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class EnvelopeResponse {
    /**
     * The bytes being signed
     * 
     */
    private final String payload;
    /**
     * The type of payload being signed
     * 
     */
    private final String payloadType;
    /**
     * The signatures over the payload
     * 
     */
    private final List<EnvelopeSignatureResponse> signatures;

    @OutputCustomType.Constructor
    private EnvelopeResponse(
        @OutputCustomType.Parameter("payload") String payload,
        @OutputCustomType.Parameter("payloadType") String payloadType,
        @OutputCustomType.Parameter("signatures") List<EnvelopeSignatureResponse> signatures) {
        this.payload = payload;
        this.payloadType = payloadType;
        this.signatures = signatures;
    }

    /**
     * The bytes being signed
     * 
    */
    public String getPayload() {
        return this.payload;
    }
    /**
     * The type of payload being signed
     * 
    */
    public String getPayloadType() {
        return this.payloadType;
    }
    /**
     * The signatures over the payload
     * 
    */
    public List<EnvelopeSignatureResponse> getSignatures() {
        return this.signatures;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvelopeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String payload;
        private String payloadType;
        private List<EnvelopeSignatureResponse> signatures;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvelopeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.payload = defaults.payload;
    	      this.payloadType = defaults.payloadType;
    	      this.signatures = defaults.signatures;
        }

        public Builder setPayload(String payload) {
            this.payload = Objects.requireNonNull(payload);
            return this;
        }

        public Builder setPayloadType(String payloadType) {
            this.payloadType = Objects.requireNonNull(payloadType);
            return this;
        }

        public Builder setSignatures(List<EnvelopeSignatureResponse> signatures) {
            this.signatures = Objects.requireNonNull(signatures);
            return this;
        }
        public EnvelopeResponse build() {
            return new EnvelopeResponse(payload, payloadType, signatures);
        }
    }
}
