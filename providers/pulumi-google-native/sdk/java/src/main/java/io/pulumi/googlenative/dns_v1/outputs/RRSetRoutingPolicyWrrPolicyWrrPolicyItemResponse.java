// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class RRSetRoutingPolicyWrrPolicyWrrPolicyItemResponse {
    private final String kind;
    private final List<String> rrdatas;
    private final List<String> signatureRrdatas;
    private final Double weight;

    @OutputCustomType.Constructor({"kind","rrdatas","signatureRrdatas","weight"})
    private RRSetRoutingPolicyWrrPolicyWrrPolicyItemResponse(
        String kind,
        List<String> rrdatas,
        List<String> signatureRrdatas,
        Double weight) {
        this.kind = Objects.requireNonNull(kind);
        this.rrdatas = Objects.requireNonNull(rrdatas);
        this.signatureRrdatas = Objects.requireNonNull(signatureRrdatas);
        this.weight = Objects.requireNonNull(weight);
    }

    public String getKind() {
        return this.kind;
    }
    public List<String> getRrdatas() {
        return this.rrdatas;
    }
    public List<String> getSignatureRrdatas() {
        return this.signatureRrdatas;
    }
    public Double getWeight() {
        return this.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RRSetRoutingPolicyWrrPolicyWrrPolicyItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private List<String> rrdatas;
        private List<String> signatureRrdatas;
        private Double weight;

        public Builder() {
    	      // Empty
        }

        public Builder(RRSetRoutingPolicyWrrPolicyWrrPolicyItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.rrdatas = defaults.rrdatas;
    	      this.signatureRrdatas = defaults.signatureRrdatas;
    	      this.weight = defaults.weight;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setRrdatas(List<String> rrdatas) {
            this.rrdatas = Objects.requireNonNull(rrdatas);
            return this;
        }

        public Builder setSignatureRrdatas(List<String> signatureRrdatas) {
            this.signatureRrdatas = Objects.requireNonNull(signatureRrdatas);
            return this;
        }

        public Builder setWeight(Double weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }

        public RRSetRoutingPolicyWrrPolicyWrrPolicyItemResponse build() {
            return new RRSetRoutingPolicyWrrPolicyWrrPolicyItemResponse(kind, rrdatas, signatureRrdatas, weight);
        }
    }
}