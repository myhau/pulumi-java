// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dns_v1beta2.outputs.RRSetRoutingPolicyGeoPolicyResponse;
import io.pulumi.googlenative.dns_v1beta2.outputs.RRSetRoutingPolicyWrrPolicyResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RRSetRoutingPolicyResponse {
    private final RRSetRoutingPolicyGeoPolicyResponse geo;
    private final RRSetRoutingPolicyGeoPolicyResponse geoPolicy;
    private final String kind;
    private final RRSetRoutingPolicyWrrPolicyResponse wrr;
    private final RRSetRoutingPolicyWrrPolicyResponse wrrPolicy;

    @OutputCustomType.Constructor
    private RRSetRoutingPolicyResponse(
        @OutputCustomType.Parameter("geo") RRSetRoutingPolicyGeoPolicyResponse geo,
        @OutputCustomType.Parameter("geoPolicy") RRSetRoutingPolicyGeoPolicyResponse geoPolicy,
        @OutputCustomType.Parameter("kind") String kind,
        @OutputCustomType.Parameter("wrr") RRSetRoutingPolicyWrrPolicyResponse wrr,
        @OutputCustomType.Parameter("wrrPolicy") RRSetRoutingPolicyWrrPolicyResponse wrrPolicy) {
        this.geo = geo;
        this.geoPolicy = geoPolicy;
        this.kind = kind;
        this.wrr = wrr;
        this.wrrPolicy = wrrPolicy;
    }

    public RRSetRoutingPolicyGeoPolicyResponse getGeo() {
        return this.geo;
    }
    public RRSetRoutingPolicyGeoPolicyResponse getGeoPolicy() {
        return this.geoPolicy;
    }
    public String getKind() {
        return this.kind;
    }
    public RRSetRoutingPolicyWrrPolicyResponse getWrr() {
        return this.wrr;
    }
    public RRSetRoutingPolicyWrrPolicyResponse getWrrPolicy() {
        return this.wrrPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RRSetRoutingPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RRSetRoutingPolicyGeoPolicyResponse geo;
        private RRSetRoutingPolicyGeoPolicyResponse geoPolicy;
        private String kind;
        private RRSetRoutingPolicyWrrPolicyResponse wrr;
        private RRSetRoutingPolicyWrrPolicyResponse wrrPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(RRSetRoutingPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.geo = defaults.geo;
    	      this.geoPolicy = defaults.geoPolicy;
    	      this.kind = defaults.kind;
    	      this.wrr = defaults.wrr;
    	      this.wrrPolicy = defaults.wrrPolicy;
        }

        public Builder setGeo(RRSetRoutingPolicyGeoPolicyResponse geo) {
            this.geo = Objects.requireNonNull(geo);
            return this;
        }

        public Builder setGeoPolicy(RRSetRoutingPolicyGeoPolicyResponse geoPolicy) {
            this.geoPolicy = Objects.requireNonNull(geoPolicy);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setWrr(RRSetRoutingPolicyWrrPolicyResponse wrr) {
            this.wrr = Objects.requireNonNull(wrr);
            return this;
        }

        public Builder setWrrPolicy(RRSetRoutingPolicyWrrPolicyResponse wrrPolicy) {
            this.wrrPolicy = Objects.requireNonNull(wrrPolicy);
            return this;
        }
        public RRSetRoutingPolicyResponse build() {
            return new RRSetRoutingPolicyResponse(geo, geoPolicy, kind, wrr, wrrPolicy);
        }
    }
}
