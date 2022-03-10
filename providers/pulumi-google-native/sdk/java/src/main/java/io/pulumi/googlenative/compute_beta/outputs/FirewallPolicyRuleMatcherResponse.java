// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_beta.outputs.FirewallPolicyRuleMatcherLayer4ConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class FirewallPolicyRuleMatcherResponse {
    /**
     * CIDR IP address range. Maximum number of destination CIDR IP ranges allowed is 5000.
     * 
     */
    private final List<String> destIpRanges;
    /**
     * Pairs of IP protocols and ports that the rule should match.
     * 
     */
    private final List<FirewallPolicyRuleMatcherLayer4ConfigResponse> layer4Configs;
    /**
     * CIDR IP address range. Maximum number of source CIDR IP ranges allowed is 5000.
     * 
     */
    private final List<String> srcIpRanges;

    @OutputCustomType.Constructor
    private FirewallPolicyRuleMatcherResponse(
        @OutputCustomType.Parameter("destIpRanges") List<String> destIpRanges,
        @OutputCustomType.Parameter("layer4Configs") List<FirewallPolicyRuleMatcherLayer4ConfigResponse> layer4Configs,
        @OutputCustomType.Parameter("srcIpRanges") List<String> srcIpRanges) {
        this.destIpRanges = destIpRanges;
        this.layer4Configs = layer4Configs;
        this.srcIpRanges = srcIpRanges;
    }

    /**
     * CIDR IP address range. Maximum number of destination CIDR IP ranges allowed is 5000.
     * 
    */
    public List<String> getDestIpRanges() {
        return this.destIpRanges;
    }
    /**
     * Pairs of IP protocols and ports that the rule should match.
     * 
    */
    public List<FirewallPolicyRuleMatcherLayer4ConfigResponse> getLayer4Configs() {
        return this.layer4Configs;
    }
    /**
     * CIDR IP address range. Maximum number of source CIDR IP ranges allowed is 5000.
     * 
    */
    public List<String> getSrcIpRanges() {
        return this.srcIpRanges;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyRuleMatcherResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> destIpRanges;
        private List<FirewallPolicyRuleMatcherLayer4ConfigResponse> layer4Configs;
        private List<String> srcIpRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyRuleMatcherResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destIpRanges = defaults.destIpRanges;
    	      this.layer4Configs = defaults.layer4Configs;
    	      this.srcIpRanges = defaults.srcIpRanges;
        }

        public Builder setDestIpRanges(List<String> destIpRanges) {
            this.destIpRanges = Objects.requireNonNull(destIpRanges);
            return this;
        }

        public Builder setLayer4Configs(List<FirewallPolicyRuleMatcherLayer4ConfigResponse> layer4Configs) {
            this.layer4Configs = Objects.requireNonNull(layer4Configs);
            return this;
        }

        public Builder setSrcIpRanges(List<String> srcIpRanges) {
            this.srcIpRanges = Objects.requireNonNull(srcIpRanges);
            return this;
        }
        public FirewallPolicyRuleMatcherResponse build() {
            return new FirewallPolicyRuleMatcherResponse(destIpRanges, layer4Configs, srcIpRanges);
        }
    }
}
