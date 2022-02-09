// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ManagedZonePeeringConfigTargetNetworkResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedZonePeeringConfigTargetNetworkResponse Empty = new ManagedZonePeeringConfigTargetNetworkResponse();

    @InputImport(name="deactivateTime", required=true)
    private final String deactivateTime;

    public String getDeactivateTime() {
        return this.deactivateTime;
    }

    @InputImport(name="kind", required=true)
    private final String kind;

    public String getKind() {
        return this.kind;
    }

    @InputImport(name="networkUrl", required=true)
    private final String networkUrl;

    public String getNetworkUrl() {
        return this.networkUrl;
    }

    public ManagedZonePeeringConfigTargetNetworkResponse(
        String deactivateTime,
        String kind,
        String networkUrl) {
        this.deactivateTime = Objects.requireNonNull(deactivateTime, "expected parameter 'deactivateTime' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.networkUrl = Objects.requireNonNull(networkUrl, "expected parameter 'networkUrl' to be non-null");
    }

    private ManagedZonePeeringConfigTargetNetworkResponse() {
        this.deactivateTime = null;
        this.kind = null;
        this.networkUrl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZonePeeringConfigTargetNetworkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deactivateTime;
        private String kind;
        private String networkUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZonePeeringConfigTargetNetworkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deactivateTime = defaults.deactivateTime;
    	      this.kind = defaults.kind;
    	      this.networkUrl = defaults.networkUrl;
        }

        public Builder setDeactivateTime(String deactivateTime) {
            this.deactivateTime = Objects.requireNonNull(deactivateTime);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setNetworkUrl(String networkUrl) {
            this.networkUrl = Objects.requireNonNull(networkUrl);
            return this;
        }

        public ManagedZonePeeringConfigTargetNetworkResponse build() {
            return new ManagedZonePeeringConfigTargetNetworkResponse(deactivateTime, kind, networkUrl);
        }
    }
}