// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networksecurity.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.networksecurity.v1beta1.inputs.HttpHeaderMatchArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specification of traffic destination attributes.
 * 
 */
public final class DestinationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DestinationArgs Empty = new DestinationArgs();

    /**
     * List of host names to match. Matched against the &#34;:authority&#34; header in http requests. At least one host should match. Each host can be an exact match, or a prefix match (example &#34;mydomain.*&#34;) or a suffix match (example // *.myorg.com&#34;) or a presence(any) match &#34;*&#34;.
     * 
     */
    @Import(name="hosts", required=true)
    private Output<List<String>> hosts;

    /**
     * @return List of host names to match. Matched against the &#34;:authority&#34; header in http requests. At least one host should match. Each host can be an exact match, or a prefix match (example &#34;mydomain.*&#34;) or a suffix match (example // *.myorg.com&#34;) or a presence(any) match &#34;*&#34;.
     * 
     */
    public Output<List<String>> hosts() {
        return this.hosts;
    }

    /**
     * Optional. Match against key:value pair in http header. Provides a flexible match based on HTTP headers, for potentially advanced use cases. At least one header should match. Avoid using header matches to make authorization decisions unless there is a strong guarantee that requests arrive through a trusted client or proxy.
     * 
     */
    @Import(name="httpHeaderMatch")
    private @Nullable Output<HttpHeaderMatchArgs> httpHeaderMatch;

    /**
     * @return Optional. Match against key:value pair in http header. Provides a flexible match based on HTTP headers, for potentially advanced use cases. At least one header should match. Avoid using header matches to make authorization decisions unless there is a strong guarantee that requests arrive through a trusted client or proxy.
     * 
     */
    public Optional<Output<HttpHeaderMatchArgs>> httpHeaderMatch() {
        return Optional.ofNullable(this.httpHeaderMatch);
    }

    /**
     * Optional. A list of HTTP methods to match. At least one method should match. Should not be set for gRPC services.
     * 
     */
    @Import(name="methods")
    private @Nullable Output<List<String>> methods;

    /**
     * @return Optional. A list of HTTP methods to match. At least one method should match. Should not be set for gRPC services.
     * 
     */
    public Optional<Output<List<String>>> methods() {
        return Optional.ofNullable(this.methods);
    }

    /**
     * List of destination ports to match. At least one port should match.
     * 
     */
    @Import(name="ports", required=true)
    private Output<List<Integer>> ports;

    /**
     * @return List of destination ports to match. At least one port should match.
     * 
     */
    public Output<List<Integer>> ports() {
        return this.ports;
    }

    private DestinationArgs() {}

    private DestinationArgs(DestinationArgs $) {
        this.hosts = $.hosts;
        this.httpHeaderMatch = $.httpHeaderMatch;
        this.methods = $.methods;
        this.ports = $.ports;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DestinationArgs $;

        public Builder() {
            $ = new DestinationArgs();
        }

        public Builder(DestinationArgs defaults) {
            $ = new DestinationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hosts List of host names to match. Matched against the &#34;:authority&#34; header in http requests. At least one host should match. Each host can be an exact match, or a prefix match (example &#34;mydomain.*&#34;) or a suffix match (example // *.myorg.com&#34;) or a presence(any) match &#34;*&#34;.
         * 
         * @return builder
         * 
         */
        public Builder hosts(Output<List<String>> hosts) {
            $.hosts = hosts;
            return this;
        }

        /**
         * @param hosts List of host names to match. Matched against the &#34;:authority&#34; header in http requests. At least one host should match. Each host can be an exact match, or a prefix match (example &#34;mydomain.*&#34;) or a suffix match (example // *.myorg.com&#34;) or a presence(any) match &#34;*&#34;.
         * 
         * @return builder
         * 
         */
        public Builder hosts(List<String> hosts) {
            return hosts(Output.of(hosts));
        }

        /**
         * @param hosts List of host names to match. Matched against the &#34;:authority&#34; header in http requests. At least one host should match. Each host can be an exact match, or a prefix match (example &#34;mydomain.*&#34;) or a suffix match (example // *.myorg.com&#34;) or a presence(any) match &#34;*&#34;.
         * 
         * @return builder
         * 
         */
        public Builder hosts(String... hosts) {
            return hosts(List.of(hosts));
        }

        /**
         * @param httpHeaderMatch Optional. Match against key:value pair in http header. Provides a flexible match based on HTTP headers, for potentially advanced use cases. At least one header should match. Avoid using header matches to make authorization decisions unless there is a strong guarantee that requests arrive through a trusted client or proxy.
         * 
         * @return builder
         * 
         */
        public Builder httpHeaderMatch(@Nullable Output<HttpHeaderMatchArgs> httpHeaderMatch) {
            $.httpHeaderMatch = httpHeaderMatch;
            return this;
        }

        /**
         * @param httpHeaderMatch Optional. Match against key:value pair in http header. Provides a flexible match based on HTTP headers, for potentially advanced use cases. At least one header should match. Avoid using header matches to make authorization decisions unless there is a strong guarantee that requests arrive through a trusted client or proxy.
         * 
         * @return builder
         * 
         */
        public Builder httpHeaderMatch(HttpHeaderMatchArgs httpHeaderMatch) {
            return httpHeaderMatch(Output.of(httpHeaderMatch));
        }

        /**
         * @param methods Optional. A list of HTTP methods to match. At least one method should match. Should not be set for gRPC services.
         * 
         * @return builder
         * 
         */
        public Builder methods(@Nullable Output<List<String>> methods) {
            $.methods = methods;
            return this;
        }

        /**
         * @param methods Optional. A list of HTTP methods to match. At least one method should match. Should not be set for gRPC services.
         * 
         * @return builder
         * 
         */
        public Builder methods(List<String> methods) {
            return methods(Output.of(methods));
        }

        /**
         * @param methods Optional. A list of HTTP methods to match. At least one method should match. Should not be set for gRPC services.
         * 
         * @return builder
         * 
         */
        public Builder methods(String... methods) {
            return methods(List.of(methods));
        }

        /**
         * @param ports List of destination ports to match. At least one port should match.
         * 
         * @return builder
         * 
         */
        public Builder ports(Output<List<Integer>> ports) {
            $.ports = ports;
            return this;
        }

        /**
         * @param ports List of destination ports to match. At least one port should match.
         * 
         * @return builder
         * 
         */
        public Builder ports(List<Integer> ports) {
            return ports(Output.of(ports));
        }

        /**
         * @param ports List of destination ports to match. At least one port should match.
         * 
         * @return builder
         * 
         */
        public Builder ports(Integer... ports) {
            return ports(List.of(ports));
        }

        public DestinationArgs build() {
            $.hosts = Objects.requireNonNull($.hosts, "expected parameter 'hosts' to be non-null");
            $.ports = Objects.requireNonNull($.ports, "expected parameter 'ports' to be non-null");
            return $;
        }
    }

}
