// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class SecurityPolicyRuleMatchConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyRuleMatchConfigArgs Empty = new SecurityPolicyRuleMatchConfigArgs();

    /**
     * Set of IP addresses or ranges (IPV4 or IPV6) in CIDR notation
     * to match against inbound traffic. There is a limit of 10 IP ranges per rule. A value of '\*' matches all IPs
     * (can be used to override the default behavior).
     * 
     */
    @InputImport(name="srcIpRanges", required=true)
    private final Input<List<String>> srcIpRanges;

    public Input<List<String>> getSrcIpRanges() {
        return this.srcIpRanges;
    }

    public SecurityPolicyRuleMatchConfigArgs(Input<List<String>> srcIpRanges) {
        this.srcIpRanges = Objects.requireNonNull(srcIpRanges, "expected parameter 'srcIpRanges' to be non-null");
    }

    private SecurityPolicyRuleMatchConfigArgs() {
        this.srcIpRanges = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleMatchConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> srcIpRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleMatchConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.srcIpRanges = defaults.srcIpRanges;
        }

        public Builder setSrcIpRanges(Input<List<String>> srcIpRanges) {
            this.srcIpRanges = Objects.requireNonNull(srcIpRanges);
            return this;
        }

        public Builder setSrcIpRanges(List<String> srcIpRanges) {
            this.srcIpRanges = Input.of(Objects.requireNonNull(srcIpRanges));
            return this;
        }

        public SecurityPolicyRuleMatchConfigArgs build() {
            return new SecurityPolicyRuleMatchConfigArgs(srcIpRanges);
        }
    }
}
