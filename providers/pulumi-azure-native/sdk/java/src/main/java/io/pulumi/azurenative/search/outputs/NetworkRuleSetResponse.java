// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.search.outputs;

import io.pulumi.azurenative.search.outputs.IpRuleResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class NetworkRuleSetResponse {
    private final @Nullable List<IpRuleResponse> ipRules;

    @OutputCustomType.Constructor({"ipRules"})
    private NetworkRuleSetResponse(@Nullable List<IpRuleResponse> ipRules) {
        this.ipRules = ipRules;
    }

    public List<IpRuleResponse> getIpRules() {
        return this.ipRules == null ? List.of() : this.ipRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkRuleSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<IpRuleResponse> ipRules;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkRuleSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipRules = defaults.ipRules;
        }

        public Builder setIpRules(@Nullable List<IpRuleResponse> ipRules) {
            this.ipRules = ipRules;
            return this;
        }

        public NetworkRuleSetResponse build() {
            return new NetworkRuleSetResponse(ipRules);
        }
    }
}