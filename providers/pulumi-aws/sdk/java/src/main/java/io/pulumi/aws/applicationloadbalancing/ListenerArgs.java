// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.applicationloadbalancing;

import io.pulumi.aws.applicationloadbalancing.inputs.ListenerDefaultActionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerArgs Empty = new ListenerArgs();

    /**
     * Name of the Application-Layer Protocol Negotiation (ALPN) policy. Can be set if `protocol` is `TLS`. Valid values are `HTTP1Only`, `HTTP2Only`, `HTTP2Optional`, `HTTP2Preferred`, and `None`.
     * 
     */
    @InputImport(name="alpnPolicy")
      private final @Nullable Input<String> alpnPolicy;

    public Input<String> getAlpnPolicy() {
        return this.alpnPolicy == null ? Input.empty() : this.alpnPolicy;
    }

    /**
     * ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the `aws.lb.ListenerCertificate` resource.
     * 
     */
    @InputImport(name="certificateArn")
      private final @Nullable Input<String> certificateArn;

    public Input<String> getCertificateArn() {
        return this.certificateArn == null ? Input.empty() : this.certificateArn;
    }

    /**
     * Configuration block for default actions. Detailed below.
     * 
     */
    @InputImport(name="defaultActions", required=true)
      private final Input<List<ListenerDefaultActionArgs>> defaultActions;

    public Input<List<ListenerDefaultActionArgs>> getDefaultActions() {
        return this.defaultActions;
    }

    /**
     * ARN of the load balancer.
     * 
     */
    @InputImport(name="loadBalancerArn", required=true)
      private final Input<String> loadBalancerArn;

    public Input<String> getLoadBalancerArn() {
        return this.loadBalancerArn;
    }

    /**
     * Port. Specify a value from `1` to `65535` or `#{port}`. Defaults to `#{port}`.
     * 
     */
    @InputImport(name="port")
      private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    /**
     * Protocol. Valid values are `HTTP`, `HTTPS`, or `#{protocol}`. Defaults to `#{protocol}`.
     * 
     */
    @InputImport(name="protocol")
      private final @Nullable Input<String> protocol;

    public Input<String> getProtocol() {
        return this.protocol == null ? Input.empty() : this.protocol;
    }

    /**
     * Name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
     * 
     */
    @InputImport(name="sslPolicy")
      private final @Nullable Input<String> sslPolicy;

    public Input<String> getSslPolicy() {
        return this.sslPolicy == null ? Input.empty() : this.sslPolicy;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ListenerArgs(
        @Nullable Input<String> alpnPolicy,
        @Nullable Input<String> certificateArn,
        Input<List<ListenerDefaultActionArgs>> defaultActions,
        Input<String> loadBalancerArn,
        @Nullable Input<Integer> port,
        @Nullable Input<String> protocol,
        @Nullable Input<String> sslPolicy,
        @Nullable Input<Map<String,String>> tags) {
        this.alpnPolicy = alpnPolicy;
        this.certificateArn = certificateArn;
        this.defaultActions = Objects.requireNonNull(defaultActions, "expected parameter 'defaultActions' to be non-null");
        this.loadBalancerArn = Objects.requireNonNull(loadBalancerArn, "expected parameter 'loadBalancerArn' to be non-null");
        this.port = port;
        this.protocol = protocol;
        this.sslPolicy = sslPolicy;
        this.tags = tags;
    }

    private ListenerArgs() {
        this.alpnPolicy = Input.empty();
        this.certificateArn = Input.empty();
        this.defaultActions = Input.empty();
        this.loadBalancerArn = Input.empty();
        this.port = Input.empty();
        this.protocol = Input.empty();
        this.sslPolicy = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> alpnPolicy;
        private @Nullable Input<String> certificateArn;
        private Input<List<ListenerDefaultActionArgs>> defaultActions;
        private Input<String> loadBalancerArn;
        private @Nullable Input<Integer> port;
        private @Nullable Input<String> protocol;
        private @Nullable Input<String> sslPolicy;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alpnPolicy = defaults.alpnPolicy;
    	      this.certificateArn = defaults.certificateArn;
    	      this.defaultActions = defaults.defaultActions;
    	      this.loadBalancerArn = defaults.loadBalancerArn;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.sslPolicy = defaults.sslPolicy;
    	      this.tags = defaults.tags;
        }

        public Builder setAlpnPolicy(@Nullable Input<String> alpnPolicy) {
            this.alpnPolicy = alpnPolicy;
            return this;
        }

        public Builder setAlpnPolicy(@Nullable String alpnPolicy) {
            this.alpnPolicy = Input.ofNullable(alpnPolicy);
            return this;
        }

        public Builder setCertificateArn(@Nullable Input<String> certificateArn) {
            this.certificateArn = certificateArn;
            return this;
        }

        public Builder setCertificateArn(@Nullable String certificateArn) {
            this.certificateArn = Input.ofNullable(certificateArn);
            return this;
        }

        public Builder setDefaultActions(Input<List<ListenerDefaultActionArgs>> defaultActions) {
            this.defaultActions = Objects.requireNonNull(defaultActions);
            return this;
        }

        public Builder setDefaultActions(List<ListenerDefaultActionArgs> defaultActions) {
            this.defaultActions = Input.of(Objects.requireNonNull(defaultActions));
            return this;
        }

        public Builder setLoadBalancerArn(Input<String> loadBalancerArn) {
            this.loadBalancerArn = Objects.requireNonNull(loadBalancerArn);
            return this;
        }

        public Builder setLoadBalancerArn(String loadBalancerArn) {
            this.loadBalancerArn = Input.of(Objects.requireNonNull(loadBalancerArn));
            return this;
        }

        public Builder setPort(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder setProtocol(@Nullable Input<String> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = Input.ofNullable(protocol);
            return this;
        }

        public Builder setSslPolicy(@Nullable Input<String> sslPolicy) {
            this.sslPolicy = sslPolicy;
            return this;
        }

        public Builder setSslPolicy(@Nullable String sslPolicy) {
            this.sslPolicy = Input.ofNullable(sslPolicy);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public ListenerArgs build() {
            return new ListenerArgs(alpnPolicy, certificateArn, defaultActions, loadBalancerArn, port, protocol, sslPolicy, tags);
        }
    }
}
