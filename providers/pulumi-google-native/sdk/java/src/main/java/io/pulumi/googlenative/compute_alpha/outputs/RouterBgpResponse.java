// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.RouterAdvertisedIpRangeResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class RouterBgpResponse {
    private final String advertiseMode;
    private final List<String> advertisedGroups;
    private final List<RouterAdvertisedIpRangeResponse> advertisedIpRanges;
    private final Integer asn;
    private final Integer keepaliveInterval;

    @OutputCustomType.Constructor({"advertiseMode","advertisedGroups","advertisedIpRanges","asn","keepaliveInterval"})
    private RouterBgpResponse(
        String advertiseMode,
        List<String> advertisedGroups,
        List<RouterAdvertisedIpRangeResponse> advertisedIpRanges,
        Integer asn,
        Integer keepaliveInterval) {
        this.advertiseMode = Objects.requireNonNull(advertiseMode);
        this.advertisedGroups = Objects.requireNonNull(advertisedGroups);
        this.advertisedIpRanges = Objects.requireNonNull(advertisedIpRanges);
        this.asn = Objects.requireNonNull(asn);
        this.keepaliveInterval = Objects.requireNonNull(keepaliveInterval);
    }

    public String getAdvertiseMode() {
        return this.advertiseMode;
    }
    public List<String> getAdvertisedGroups() {
        return this.advertisedGroups;
    }
    public List<RouterAdvertisedIpRangeResponse> getAdvertisedIpRanges() {
        return this.advertisedIpRanges;
    }
    public Integer getAsn() {
        return this.asn;
    }
    public Integer getKeepaliveInterval() {
        return this.keepaliveInterval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterBgpResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String advertiseMode;
        private List<String> advertisedGroups;
        private List<RouterAdvertisedIpRangeResponse> advertisedIpRanges;
        private Integer asn;
        private Integer keepaliveInterval;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterBgpResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advertiseMode = defaults.advertiseMode;
    	      this.advertisedGroups = defaults.advertisedGroups;
    	      this.advertisedIpRanges = defaults.advertisedIpRanges;
    	      this.asn = defaults.asn;
    	      this.keepaliveInterval = defaults.keepaliveInterval;
        }

        public Builder setAdvertiseMode(String advertiseMode) {
            this.advertiseMode = Objects.requireNonNull(advertiseMode);
            return this;
        }

        public Builder setAdvertisedGroups(List<String> advertisedGroups) {
            this.advertisedGroups = Objects.requireNonNull(advertisedGroups);
            return this;
        }

        public Builder setAdvertisedIpRanges(List<RouterAdvertisedIpRangeResponse> advertisedIpRanges) {
            this.advertisedIpRanges = Objects.requireNonNull(advertisedIpRanges);
            return this;
        }

        public Builder setAsn(Integer asn) {
            this.asn = Objects.requireNonNull(asn);
            return this;
        }

        public Builder setKeepaliveInterval(Integer keepaliveInterval) {
            this.keepaliveInterval = Objects.requireNonNull(keepaliveInterval);
            return this;
        }

        public RouterBgpResponse build() {
            return new RouterBgpResponse(advertiseMode, advertisedGroups, advertisedIpRanges, asn, keepaliveInterval);
        }
    }
}