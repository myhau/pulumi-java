// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class VirtualNodeSpecListenerConnectionPoolGrpc {
    /**
     * Maximum number of inflight requests Envoy can concurrently support across hosts in upstream cluster. Minimum value of `1`.
     * 
     */
    private final Integer maxRequests;

    @OutputCustomType.Constructor({"maxRequests"})
    private VirtualNodeSpecListenerConnectionPoolGrpc(Integer maxRequests) {
        this.maxRequests = maxRequests;
    }

    /**
     * Maximum number of inflight requests Envoy can concurrently support across hosts in upstream cluster. Minimum value of `1`.
     * 
    */
    public Integer getMaxRequests() {
        return this.maxRequests;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerConnectionPoolGrpc defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxRequests;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerConnectionPoolGrpc defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxRequests = defaults.maxRequests;
        }

        public Builder setMaxRequests(Integer maxRequests) {
            this.maxRequests = Objects.requireNonNull(maxRequests);
            return this;
        }
        public VirtualNodeSpecListenerConnectionPoolGrpc build() {
            return new VirtualNodeSpecListenerConnectionPoolGrpc(maxRequests);
        }
    }
}