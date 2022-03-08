// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DistributionLegacyCustomOrigin {
    private final String dNSName;
    private final @Nullable Integer hTTPPort;
    private final @Nullable Integer hTTPSPort;
    private final String originProtocolPolicy;
    private final List<String> originSSLProtocols;

    @OutputCustomType.Constructor({"dNSName","hTTPPort","hTTPSPort","originProtocolPolicy","originSSLProtocols"})
    private DistributionLegacyCustomOrigin(
        String dNSName,
        @Nullable Integer hTTPPort,
        @Nullable Integer hTTPSPort,
        String originProtocolPolicy,
        List<String> originSSLProtocols) {
        this.dNSName = dNSName;
        this.hTTPPort = hTTPPort;
        this.hTTPSPort = hTTPSPort;
        this.originProtocolPolicy = originProtocolPolicy;
        this.originSSLProtocols = originSSLProtocols;
    }

    public String getDNSName() {
        return this.dNSName;
    }
    public Optional<Integer> getHTTPPort() {
        return Optional.ofNullable(this.hTTPPort);
    }
    public Optional<Integer> getHTTPSPort() {
        return Optional.ofNullable(this.hTTPSPort);
    }
    public String getOriginProtocolPolicy() {
        return this.originProtocolPolicy;
    }
    public List<String> getOriginSSLProtocols() {
        return this.originSSLProtocols;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionLegacyCustomOrigin defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dNSName;
        private @Nullable Integer hTTPPort;
        private @Nullable Integer hTTPSPort;
        private String originProtocolPolicy;
        private List<String> originSSLProtocols;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionLegacyCustomOrigin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dNSName = defaults.dNSName;
    	      this.hTTPPort = defaults.hTTPPort;
    	      this.hTTPSPort = defaults.hTTPSPort;
    	      this.originProtocolPolicy = defaults.originProtocolPolicy;
    	      this.originSSLProtocols = defaults.originSSLProtocols;
        }

        public Builder setDNSName(String dNSName) {
            this.dNSName = Objects.requireNonNull(dNSName);
            return this;
        }

        public Builder setHTTPPort(@Nullable Integer hTTPPort) {
            this.hTTPPort = hTTPPort;
            return this;
        }

        public Builder setHTTPSPort(@Nullable Integer hTTPSPort) {
            this.hTTPSPort = hTTPSPort;
            return this;
        }

        public Builder setOriginProtocolPolicy(String originProtocolPolicy) {
            this.originProtocolPolicy = Objects.requireNonNull(originProtocolPolicy);
            return this;
        }

        public Builder setOriginSSLProtocols(List<String> originSSLProtocols) {
            this.originSSLProtocols = Objects.requireNonNull(originSSLProtocols);
            return this;
        }
        public DistributionLegacyCustomOrigin build() {
            return new DistributionLegacyCustomOrigin(dNSName, hTTPPort, hTTPSPort, originProtocolPolicy, originSSLProtocols);
        }
    }
}
