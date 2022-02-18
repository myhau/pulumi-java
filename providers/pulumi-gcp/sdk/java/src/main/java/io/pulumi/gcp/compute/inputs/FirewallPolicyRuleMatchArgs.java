// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.FirewallPolicyRuleMatchLayer4ConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallPolicyRuleMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyRuleMatchArgs Empty = new FirewallPolicyRuleMatchArgs();

    /**
     * CIDR IP address range. Maximum number of destination CIDR IP ranges allowed is 256.
     * 
     */
    @InputImport(name="destIpRanges")
    private final @Nullable Input<List<String>> destIpRanges;

    public Input<List<String>> getDestIpRanges() {
        return this.destIpRanges == null ? Input.empty() : this.destIpRanges;
    }

    /**
     * Pairs of IP protocols and ports that the rule should match. Structure is documented below.
     * 
     */
    @InputImport(name="layer4Configs", required=true)
    private final Input<List<FirewallPolicyRuleMatchLayer4ConfigArgs>> layer4Configs;

    public Input<List<FirewallPolicyRuleMatchLayer4ConfigArgs>> getLayer4Configs() {
        return this.layer4Configs;
    }

    /**
     * CIDR IP address range. Maximum number of source CIDR IP ranges allowed is 256.
     * 
     */
    @InputImport(name="srcIpRanges")
    private final @Nullable Input<List<String>> srcIpRanges;

    public Input<List<String>> getSrcIpRanges() {
        return this.srcIpRanges == null ? Input.empty() : this.srcIpRanges;
    }

    public FirewallPolicyRuleMatchArgs(
        @Nullable Input<List<String>> destIpRanges,
        Input<List<FirewallPolicyRuleMatchLayer4ConfigArgs>> layer4Configs,
        @Nullable Input<List<String>> srcIpRanges) {
        this.destIpRanges = destIpRanges;
        this.layer4Configs = Objects.requireNonNull(layer4Configs, "expected parameter 'layer4Configs' to be non-null");
        this.srcIpRanges = srcIpRanges;
    }

    private FirewallPolicyRuleMatchArgs() {
        this.destIpRanges = Input.empty();
        this.layer4Configs = Input.empty();
        this.srcIpRanges = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyRuleMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> destIpRanges;
        private Input<List<FirewallPolicyRuleMatchLayer4ConfigArgs>> layer4Configs;
        private @Nullable Input<List<String>> srcIpRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyRuleMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destIpRanges = defaults.destIpRanges;
    	      this.layer4Configs = defaults.layer4Configs;
    	      this.srcIpRanges = defaults.srcIpRanges;
        }

        public Builder setDestIpRanges(@Nullable Input<List<String>> destIpRanges) {
            this.destIpRanges = destIpRanges;
            return this;
        }

        public Builder setDestIpRanges(@Nullable List<String> destIpRanges) {
            this.destIpRanges = Input.ofNullable(destIpRanges);
            return this;
        }

        public Builder setLayer4Configs(Input<List<FirewallPolicyRuleMatchLayer4ConfigArgs>> layer4Configs) {
            this.layer4Configs = Objects.requireNonNull(layer4Configs);
            return this;
        }

        public Builder setLayer4Configs(List<FirewallPolicyRuleMatchLayer4ConfigArgs> layer4Configs) {
            this.layer4Configs = Input.of(Objects.requireNonNull(layer4Configs));
            return this;
        }

        public Builder setSrcIpRanges(@Nullable Input<List<String>> srcIpRanges) {
            this.srcIpRanges = srcIpRanges;
            return this;
        }

        public Builder setSrcIpRanges(@Nullable List<String> srcIpRanges) {
            this.srcIpRanges = Input.ofNullable(srcIpRanges);
            return this;
        }

        public FirewallPolicyRuleMatchArgs build() {
            return new FirewallPolicyRuleMatchArgs(destIpRanges, layer4Configs, srcIpRanges);
        }
    }
}
