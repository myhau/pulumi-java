// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SubscriptionExpirationPolicy {
    /**
     * Specifies the "time-to-live" duration for an associated resource. The
     * resource expires if it is not active for a period of ttl.
     * If ttl is not set, the associated resource never expires.
     * A duration in seconds with up to nine fractional digits, terminated by 's'.
     * Example - "3.5s".
     * 
     */
    private final String ttl;

    @OutputCustomType.Constructor({"ttl"})
    private SubscriptionExpirationPolicy(String ttl) {
        this.ttl = Objects.requireNonNull(ttl);
    }

    /**
     * Specifies the "time-to-live" duration for an associated resource. The
     * resource expires if it is not active for a period of ttl.
     * If ttl is not set, the associated resource never expires.
     * A duration in seconds with up to nine fractional digits, terminated by 's'.
     * Example - "3.5s".
     * 
     */
    public String getTtl() {
        return this.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionExpirationPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ttl;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionExpirationPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ttl = defaults.ttl;
        }

        public Builder setTtl(String ttl) {
            this.ttl = Objects.requireNonNull(ttl);
            return this;
        }

        public SubscriptionExpirationPolicy build() {
            return new SubscriptionExpirationPolicy(ttl);
        }
    }
}
