// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsub_v1beta1a.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PushConfigResponse {
    private final String pushEndpoint;

    @OutputCustomType.Constructor({"pushEndpoint"})
    private PushConfigResponse(String pushEndpoint) {
        this.pushEndpoint = Objects.requireNonNull(pushEndpoint);
    }

    public String getPushEndpoint() {
        return this.pushEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PushConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String pushEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(PushConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pushEndpoint = defaults.pushEndpoint;
        }

        public Builder setPushEndpoint(String pushEndpoint) {
            this.pushEndpoint = Objects.requireNonNull(pushEndpoint);
            return this;
        }

        public PushConfigResponse build() {
            return new PushConfigResponse(pushEndpoint);
        }
    }
}