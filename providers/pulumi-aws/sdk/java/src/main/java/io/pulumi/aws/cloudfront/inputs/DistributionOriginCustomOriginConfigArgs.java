// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributionOriginCustomOriginConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionOriginCustomOriginConfigArgs Empty = new DistributionOriginCustomOriginConfigArgs();

    /**
     * The HTTP port the custom origin listens on.
     * 
     */
    @InputImport(name="httpPort", required=true)
      private final Input<Integer> httpPort;

    public Input<Integer> getHttpPort() {
        return this.httpPort;
    }

    /**
     * The HTTPS port the custom origin listens on.
     * 
     */
    @InputImport(name="httpsPort", required=true)
      private final Input<Integer> httpsPort;

    public Input<Integer> getHttpsPort() {
        return this.httpsPort;
    }

    /**
     * The Custom KeepAlive timeout, in seconds. By default, AWS enforces a limit of `60`. But you can request an [increase](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-request-timeout).
     * 
     */
    @InputImport(name="originKeepaliveTimeout")
      private final @Nullable Input<Integer> originKeepaliveTimeout;

    public Input<Integer> getOriginKeepaliveTimeout() {
        return this.originKeepaliveTimeout == null ? Input.empty() : this.originKeepaliveTimeout;
    }

    /**
     * The origin protocol policy to apply to
     * your origin. One of `http-only`, `https-only`, or `match-viewer`.
     * 
     */
    @InputImport(name="originProtocolPolicy", required=true)
      private final Input<String> originProtocolPolicy;

    public Input<String> getOriginProtocolPolicy() {
        return this.originProtocolPolicy;
    }

    /**
     * The Custom Read timeout, in seconds. By default, AWS enforces a limit of `60`. But you can request an [increase](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-request-timeout).
     * 
     */
    @InputImport(name="originReadTimeout")
      private final @Nullable Input<Integer> originReadTimeout;

    public Input<Integer> getOriginReadTimeout() {
        return this.originReadTimeout == null ? Input.empty() : this.originReadTimeout;
    }

    /**
     * The SSL/TLS protocols that you want
     * CloudFront to use when communicating with your origin over HTTPS. A list of
     * one or more of `SSLv3`, `TLSv1`, `TLSv1.1`, and `TLSv1.2`.
     * 
     */
    @InputImport(name="originSslProtocols", required=true)
      private final Input<List<String>> originSslProtocols;

    public Input<List<String>> getOriginSslProtocols() {
        return this.originSslProtocols;
    }

    public DistributionOriginCustomOriginConfigArgs(
        Input<Integer> httpPort,
        Input<Integer> httpsPort,
        @Nullable Input<Integer> originKeepaliveTimeout,
        Input<String> originProtocolPolicy,
        @Nullable Input<Integer> originReadTimeout,
        Input<List<String>> originSslProtocols) {
        this.httpPort = Objects.requireNonNull(httpPort, "expected parameter 'httpPort' to be non-null");
        this.httpsPort = Objects.requireNonNull(httpsPort, "expected parameter 'httpsPort' to be non-null");
        this.originKeepaliveTimeout = originKeepaliveTimeout;
        this.originProtocolPolicy = Objects.requireNonNull(originProtocolPolicy, "expected parameter 'originProtocolPolicy' to be non-null");
        this.originReadTimeout = originReadTimeout;
        this.originSslProtocols = Objects.requireNonNull(originSslProtocols, "expected parameter 'originSslProtocols' to be non-null");
    }

    private DistributionOriginCustomOriginConfigArgs() {
        this.httpPort = Input.empty();
        this.httpsPort = Input.empty();
        this.originKeepaliveTimeout = Input.empty();
        this.originProtocolPolicy = Input.empty();
        this.originReadTimeout = Input.empty();
        this.originSslProtocols = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOriginCustomOriginConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> httpPort;
        private Input<Integer> httpsPort;
        private @Nullable Input<Integer> originKeepaliveTimeout;
        private Input<String> originProtocolPolicy;
        private @Nullable Input<Integer> originReadTimeout;
        private Input<List<String>> originSslProtocols;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOriginCustomOriginConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpPort = defaults.httpPort;
    	      this.httpsPort = defaults.httpsPort;
    	      this.originKeepaliveTimeout = defaults.originKeepaliveTimeout;
    	      this.originProtocolPolicy = defaults.originProtocolPolicy;
    	      this.originReadTimeout = defaults.originReadTimeout;
    	      this.originSslProtocols = defaults.originSslProtocols;
        }

        public Builder setHttpPort(Input<Integer> httpPort) {
            this.httpPort = Objects.requireNonNull(httpPort);
            return this;
        }

        public Builder setHttpPort(Integer httpPort) {
            this.httpPort = Input.of(Objects.requireNonNull(httpPort));
            return this;
        }

        public Builder setHttpsPort(Input<Integer> httpsPort) {
            this.httpsPort = Objects.requireNonNull(httpsPort);
            return this;
        }

        public Builder setHttpsPort(Integer httpsPort) {
            this.httpsPort = Input.of(Objects.requireNonNull(httpsPort));
            return this;
        }

        public Builder setOriginKeepaliveTimeout(@Nullable Input<Integer> originKeepaliveTimeout) {
            this.originKeepaliveTimeout = originKeepaliveTimeout;
            return this;
        }

        public Builder setOriginKeepaliveTimeout(@Nullable Integer originKeepaliveTimeout) {
            this.originKeepaliveTimeout = Input.ofNullable(originKeepaliveTimeout);
            return this;
        }

        public Builder setOriginProtocolPolicy(Input<String> originProtocolPolicy) {
            this.originProtocolPolicy = Objects.requireNonNull(originProtocolPolicy);
            return this;
        }

        public Builder setOriginProtocolPolicy(String originProtocolPolicy) {
            this.originProtocolPolicy = Input.of(Objects.requireNonNull(originProtocolPolicy));
            return this;
        }

        public Builder setOriginReadTimeout(@Nullable Input<Integer> originReadTimeout) {
            this.originReadTimeout = originReadTimeout;
            return this;
        }

        public Builder setOriginReadTimeout(@Nullable Integer originReadTimeout) {
            this.originReadTimeout = Input.ofNullable(originReadTimeout);
            return this;
        }

        public Builder setOriginSslProtocols(Input<List<String>> originSslProtocols) {
            this.originSslProtocols = Objects.requireNonNull(originSslProtocols);
            return this;
        }

        public Builder setOriginSslProtocols(List<String> originSslProtocols) {
            this.originSslProtocols = Input.of(Objects.requireNonNull(originSslProtocols));
            return this;
        }
        public DistributionOriginCustomOriginConfigArgs build() {
            return new DistributionOriginCustomOriginConfigArgs(httpPort, httpsPort, originKeepaliveTimeout, originProtocolPolicy, originReadTimeout, originSslProtocols);
        }
    }
}
