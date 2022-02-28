// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCorsConfigAccessControlAllowHeadersArgs;
import io.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCorsConfigAccessControlAllowMethodsArgs;
import io.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCorsConfigAccessControlAllowOriginsArgs;
import io.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCorsConfigAccessControlExposeHeadersArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResponseHeadersPolicyCorsConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResponseHeadersPolicyCorsConfigArgs Empty = new ResponseHeadersPolicyCorsConfigArgs();

    /**
     * A Boolean value that CloudFront uses as the value for the `Access-Control-Allow-Credentials` HTTP response header.
     * 
     */
    @InputImport(name="accessControlAllowCredentials", required=true)
      private final Input<Boolean> accessControlAllowCredentials;

    public Input<Boolean> getAccessControlAllowCredentials() {
        return this.accessControlAllowCredentials;
    }

    /**
     * Object that contains an attribute `items` that contains a list of HTTP header names that CloudFront includes as values for the `Access-Control-Allow-Headers` HTTP response header.
     * 
     */
    @InputImport(name="accessControlAllowHeaders", required=true)
      private final Input<ResponseHeadersPolicyCorsConfigAccessControlAllowHeadersArgs> accessControlAllowHeaders;

    public Input<ResponseHeadersPolicyCorsConfigAccessControlAllowHeadersArgs> getAccessControlAllowHeaders() {
        return this.accessControlAllowHeaders;
    }

    /**
     * Object that contains an attribute `items` that contains a list of HTTP methods that CloudFront includes as values for the `Access-Control-Allow-Methods` HTTP response header. Valid values: `GET` | `POST` | `OPTIONS` | `PUT` | `DELETE` | `HEAD` | `ALL`
     * 
     */
    @InputImport(name="accessControlAllowMethods", required=true)
      private final Input<ResponseHeadersPolicyCorsConfigAccessControlAllowMethodsArgs> accessControlAllowMethods;

    public Input<ResponseHeadersPolicyCorsConfigAccessControlAllowMethodsArgs> getAccessControlAllowMethods() {
        return this.accessControlAllowMethods;
    }

    /**
     * Object that contains an attribute `items` that contains a list of origins that CloudFront can use as the value for the `Access-Control-Allow-Origin` HTTP response header.
     * 
     */
    @InputImport(name="accessControlAllowOrigins", required=true)
      private final Input<ResponseHeadersPolicyCorsConfigAccessControlAllowOriginsArgs> accessControlAllowOrigins;

    public Input<ResponseHeadersPolicyCorsConfigAccessControlAllowOriginsArgs> getAccessControlAllowOrigins() {
        return this.accessControlAllowOrigins;
    }

    /**
     * Object that contains an attribute `items` that contains a list of HTTP headers that CloudFront includes as values for the `Access-Control-Expose-Headers` HTTP response header.
     * 
     */
    @InputImport(name="accessControlExposeHeaders")
      private final @Nullable Input<ResponseHeadersPolicyCorsConfigAccessControlExposeHeadersArgs> accessControlExposeHeaders;

    public Input<ResponseHeadersPolicyCorsConfigAccessControlExposeHeadersArgs> getAccessControlExposeHeaders() {
        return this.accessControlExposeHeaders == null ? Input.empty() : this.accessControlExposeHeaders;
    }

    /**
     * A number that CloudFront uses as the value for the `max-age` directive in the `Strict-Transport-Security` HTTP response header.
     * 
     */
    @InputImport(name="accessControlMaxAgeSec")
      private final @Nullable Input<Integer> accessControlMaxAgeSec;

    public Input<Integer> getAccessControlMaxAgeSec() {
        return this.accessControlMaxAgeSec == null ? Input.empty() : this.accessControlMaxAgeSec;
    }

    /**
     * A Boolean value that determines how CloudFront behaves for the HTTP response header.
     * 
     */
    @InputImport(name="originOverride", required=true)
      private final Input<Boolean> originOverride;

    public Input<Boolean> getOriginOverride() {
        return this.originOverride;
    }

    public ResponseHeadersPolicyCorsConfigArgs(
        Input<Boolean> accessControlAllowCredentials,
        Input<ResponseHeadersPolicyCorsConfigAccessControlAllowHeadersArgs> accessControlAllowHeaders,
        Input<ResponseHeadersPolicyCorsConfigAccessControlAllowMethodsArgs> accessControlAllowMethods,
        Input<ResponseHeadersPolicyCorsConfigAccessControlAllowOriginsArgs> accessControlAllowOrigins,
        @Nullable Input<ResponseHeadersPolicyCorsConfigAccessControlExposeHeadersArgs> accessControlExposeHeaders,
        @Nullable Input<Integer> accessControlMaxAgeSec,
        Input<Boolean> originOverride) {
        this.accessControlAllowCredentials = Objects.requireNonNull(accessControlAllowCredentials, "expected parameter 'accessControlAllowCredentials' to be non-null");
        this.accessControlAllowHeaders = Objects.requireNonNull(accessControlAllowHeaders, "expected parameter 'accessControlAllowHeaders' to be non-null");
        this.accessControlAllowMethods = Objects.requireNonNull(accessControlAllowMethods, "expected parameter 'accessControlAllowMethods' to be non-null");
        this.accessControlAllowOrigins = Objects.requireNonNull(accessControlAllowOrigins, "expected parameter 'accessControlAllowOrigins' to be non-null");
        this.accessControlExposeHeaders = accessControlExposeHeaders;
        this.accessControlMaxAgeSec = accessControlMaxAgeSec;
        this.originOverride = Objects.requireNonNull(originOverride, "expected parameter 'originOverride' to be non-null");
    }

    private ResponseHeadersPolicyCorsConfigArgs() {
        this.accessControlAllowCredentials = Input.empty();
        this.accessControlAllowHeaders = Input.empty();
        this.accessControlAllowMethods = Input.empty();
        this.accessControlAllowOrigins = Input.empty();
        this.accessControlExposeHeaders = Input.empty();
        this.accessControlMaxAgeSec = Input.empty();
        this.originOverride = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicyCorsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> accessControlAllowCredentials;
        private Input<ResponseHeadersPolicyCorsConfigAccessControlAllowHeadersArgs> accessControlAllowHeaders;
        private Input<ResponseHeadersPolicyCorsConfigAccessControlAllowMethodsArgs> accessControlAllowMethods;
        private Input<ResponseHeadersPolicyCorsConfigAccessControlAllowOriginsArgs> accessControlAllowOrigins;
        private @Nullable Input<ResponseHeadersPolicyCorsConfigAccessControlExposeHeadersArgs> accessControlExposeHeaders;
        private @Nullable Input<Integer> accessControlMaxAgeSec;
        private Input<Boolean> originOverride;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicyCorsConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessControlAllowCredentials = defaults.accessControlAllowCredentials;
    	      this.accessControlAllowHeaders = defaults.accessControlAllowHeaders;
    	      this.accessControlAllowMethods = defaults.accessControlAllowMethods;
    	      this.accessControlAllowOrigins = defaults.accessControlAllowOrigins;
    	      this.accessControlExposeHeaders = defaults.accessControlExposeHeaders;
    	      this.accessControlMaxAgeSec = defaults.accessControlMaxAgeSec;
    	      this.originOverride = defaults.originOverride;
        }

        public Builder setAccessControlAllowCredentials(Input<Boolean> accessControlAllowCredentials) {
            this.accessControlAllowCredentials = Objects.requireNonNull(accessControlAllowCredentials);
            return this;
        }

        public Builder setAccessControlAllowCredentials(Boolean accessControlAllowCredentials) {
            this.accessControlAllowCredentials = Input.of(Objects.requireNonNull(accessControlAllowCredentials));
            return this;
        }

        public Builder setAccessControlAllowHeaders(Input<ResponseHeadersPolicyCorsConfigAccessControlAllowHeadersArgs> accessControlAllowHeaders) {
            this.accessControlAllowHeaders = Objects.requireNonNull(accessControlAllowHeaders);
            return this;
        }

        public Builder setAccessControlAllowHeaders(ResponseHeadersPolicyCorsConfigAccessControlAllowHeadersArgs accessControlAllowHeaders) {
            this.accessControlAllowHeaders = Input.of(Objects.requireNonNull(accessControlAllowHeaders));
            return this;
        }

        public Builder setAccessControlAllowMethods(Input<ResponseHeadersPolicyCorsConfigAccessControlAllowMethodsArgs> accessControlAllowMethods) {
            this.accessControlAllowMethods = Objects.requireNonNull(accessControlAllowMethods);
            return this;
        }

        public Builder setAccessControlAllowMethods(ResponseHeadersPolicyCorsConfigAccessControlAllowMethodsArgs accessControlAllowMethods) {
            this.accessControlAllowMethods = Input.of(Objects.requireNonNull(accessControlAllowMethods));
            return this;
        }

        public Builder setAccessControlAllowOrigins(Input<ResponseHeadersPolicyCorsConfigAccessControlAllowOriginsArgs> accessControlAllowOrigins) {
            this.accessControlAllowOrigins = Objects.requireNonNull(accessControlAllowOrigins);
            return this;
        }

        public Builder setAccessControlAllowOrigins(ResponseHeadersPolicyCorsConfigAccessControlAllowOriginsArgs accessControlAllowOrigins) {
            this.accessControlAllowOrigins = Input.of(Objects.requireNonNull(accessControlAllowOrigins));
            return this;
        }

        public Builder setAccessControlExposeHeaders(@Nullable Input<ResponseHeadersPolicyCorsConfigAccessControlExposeHeadersArgs> accessControlExposeHeaders) {
            this.accessControlExposeHeaders = accessControlExposeHeaders;
            return this;
        }

        public Builder setAccessControlExposeHeaders(@Nullable ResponseHeadersPolicyCorsConfigAccessControlExposeHeadersArgs accessControlExposeHeaders) {
            this.accessControlExposeHeaders = Input.ofNullable(accessControlExposeHeaders);
            return this;
        }

        public Builder setAccessControlMaxAgeSec(@Nullable Input<Integer> accessControlMaxAgeSec) {
            this.accessControlMaxAgeSec = accessControlMaxAgeSec;
            return this;
        }

        public Builder setAccessControlMaxAgeSec(@Nullable Integer accessControlMaxAgeSec) {
            this.accessControlMaxAgeSec = Input.ofNullable(accessControlMaxAgeSec);
            return this;
        }

        public Builder setOriginOverride(Input<Boolean> originOverride) {
            this.originOverride = Objects.requireNonNull(originOverride);
            return this;
        }

        public Builder setOriginOverride(Boolean originOverride) {
            this.originOverride = Input.of(Objects.requireNonNull(originOverride));
            return this;
        }
        public ResponseHeadersPolicyCorsConfigArgs build() {
            return new ResponseHeadersPolicyCorsConfigArgs(accessControlAllowCredentials, accessControlAllowHeaders, accessControlAllowMethods, accessControlAllowOrigins, accessControlExposeHeaders, accessControlMaxAgeSec, originOverride);
        }
    }
}
