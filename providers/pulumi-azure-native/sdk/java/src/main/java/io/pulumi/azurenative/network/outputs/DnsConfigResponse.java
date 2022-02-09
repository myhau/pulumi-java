// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DnsConfigResponse {
    private final String fqdn;
    private final @Nullable String relativeName;
    private final @Nullable Double ttl;

    @OutputCustomType.Constructor({"fqdn","relativeName","ttl"})
    private DnsConfigResponse(
        String fqdn,
        @Nullable String relativeName,
        @Nullable Double ttl) {
        this.fqdn = Objects.requireNonNull(fqdn);
        this.relativeName = relativeName;
        this.ttl = ttl;
    }

    public String getFqdn() {
        return this.fqdn;
    }
    public Optional<String> getRelativeName() {
        return Optional.ofNullable(this.relativeName);
    }
    public Optional<Double> getTtl() {
        return Optional.ofNullable(this.ttl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DnsConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fqdn;
        private @Nullable String relativeName;
        private @Nullable Double ttl;

        public Builder() {
    	      // Empty
        }

        public Builder(DnsConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fqdn = defaults.fqdn;
    	      this.relativeName = defaults.relativeName;
    	      this.ttl = defaults.ttl;
        }

        public Builder setFqdn(String fqdn) {
            this.fqdn = Objects.requireNonNull(fqdn);
            return this;
        }

        public Builder setRelativeName(@Nullable String relativeName) {
            this.relativeName = relativeName;
            return this;
        }

        public Builder setTtl(@Nullable Double ttl) {
            this.ttl = ttl;
            return this;
        }

        public DnsConfigResponse build() {
            return new DnsConfigResponse(fqdn, relativeName, ttl);
        }
    }
}