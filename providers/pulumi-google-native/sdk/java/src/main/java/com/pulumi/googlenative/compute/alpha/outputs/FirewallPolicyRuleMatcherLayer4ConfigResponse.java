// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class FirewallPolicyRuleMatcherLayer4ConfigResponse {
    /**
     * @return The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following well known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp), or the IP protocol number.
     * 
     */
    private final String ipProtocol;
    /**
     * @return An optional list of ports to which this rule applies. This field is only applicable for UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: [&#34;22&#34;], [&#34;80&#34;,&#34;443&#34;], and [&#34;12345-12349&#34;].
     * 
     */
    private final List<String> ports;

    @CustomType.Constructor
    private FirewallPolicyRuleMatcherLayer4ConfigResponse(
        @CustomType.Parameter("ipProtocol") String ipProtocol,
        @CustomType.Parameter("ports") List<String> ports) {
        this.ipProtocol = ipProtocol;
        this.ports = ports;
    }

    /**
     * @return The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following well known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp), or the IP protocol number.
     * 
     */
    public String ipProtocol() {
        return this.ipProtocol;
    }
    /**
     * @return An optional list of ports to which this rule applies. This field is only applicable for UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: [&#34;22&#34;], [&#34;80&#34;,&#34;443&#34;], and [&#34;12345-12349&#34;].
     * 
     */
    public List<String> ports() {
        return this.ports;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyRuleMatcherLayer4ConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipProtocol;
        private List<String> ports;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyRuleMatcherLayer4ConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipProtocol = defaults.ipProtocol;
    	      this.ports = defaults.ports;
        }

        public Builder ipProtocol(String ipProtocol) {
            this.ipProtocol = Objects.requireNonNull(ipProtocol);
            return this;
        }
        public Builder ports(List<String> ports) {
            this.ports = Objects.requireNonNull(ports);
            return this;
        }
        public Builder ports(String... ports) {
            return ports(List.of(ports));
        }        public FirewallPolicyRuleMatcherLayer4ConfigResponse build() {
            return new FirewallPolicyRuleMatcherLayer4ConfigResponse(ipProtocol, ports);
        }
    }
}
