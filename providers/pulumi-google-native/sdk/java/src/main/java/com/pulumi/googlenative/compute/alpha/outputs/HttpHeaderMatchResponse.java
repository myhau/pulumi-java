// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute.alpha.outputs.Int64RangeMatchResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class HttpHeaderMatchResponse {
    /**
     * @return The value should exactly match contents of exactMatch. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
     * 
     */
    private final String exactMatch;
    /**
     * @return The name of the HTTP header to match. For matching against the HTTP request&#39;s authority, use a headerMatch with the header name &#34;:authority&#34;. For matching a request&#39;s method, use the headerName &#34;:method&#34;. When the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true, only non-binary user-specified custom metadata and the `content-type` header are supported. The following transport-level headers cannot be used in header matching rules: `:authority`, `:method`, `:path`, `:scheme`, `user-agent`, `accept-encoding`, `content-encoding`, `grpc-accept-encoding`, `grpc-encoding`, `grpc-previous-rpc-attempts`, `grpc-tags-bin`, `grpc-timeout` and `grpc-trace-bin`.
     * 
     */
    private final String headerName;
    /**
     * @return If set to false, the headerMatch is considered a match if the preceding match criteria are met. If set to true, the headerMatch is considered a match if the preceding match criteria are NOT met. The default setting is false.
     * 
     */
    private final Boolean invertMatch;
    /**
     * @return The value of the header must start with the contents of prefixMatch. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
     * 
     */
    private final String prefixMatch;
    /**
     * @return A header with the contents of headerName must exist. The match takes place whether or not the request&#39;s header has a value. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
     * 
     */
    private final Boolean presentMatch;
    /**
     * @return The header value must be an integer and its value must be in the range specified in rangeMatch. If the header does not contain an integer, number or is empty, the match fails. For example for a range [-5, 0] - -3 will match. - 0 will not match. - 0.25 will not match. - -3someString will not match. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set. rangeMatch is not supported for load balancers that have loadBalancingScheme set to EXTERNAL.
     * 
     */
    private final Int64RangeMatchResponse rangeMatch;
    /**
     * @return The value of the header must match the regular expression specified in regexMatch. For more information about regular expression syntax, see Syntax. For matching against a port specified in the HTTP request, use a headerMatch with headerName set to PORT and a regular expression that satisfies the RFC2616 Host header&#39;s port specifier. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set. regexMatch only applies to load balancers that have loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    private final String regexMatch;
    /**
     * @return The value of the header must end with the contents of suffixMatch. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
     * 
     */
    private final String suffixMatch;

    @CustomType.Constructor
    private HttpHeaderMatchResponse(
        @CustomType.Parameter("exactMatch") String exactMatch,
        @CustomType.Parameter("headerName") String headerName,
        @CustomType.Parameter("invertMatch") Boolean invertMatch,
        @CustomType.Parameter("prefixMatch") String prefixMatch,
        @CustomType.Parameter("presentMatch") Boolean presentMatch,
        @CustomType.Parameter("rangeMatch") Int64RangeMatchResponse rangeMatch,
        @CustomType.Parameter("regexMatch") String regexMatch,
        @CustomType.Parameter("suffixMatch") String suffixMatch) {
        this.exactMatch = exactMatch;
        this.headerName = headerName;
        this.invertMatch = invertMatch;
        this.prefixMatch = prefixMatch;
        this.presentMatch = presentMatch;
        this.rangeMatch = rangeMatch;
        this.regexMatch = regexMatch;
        this.suffixMatch = suffixMatch;
    }

    /**
     * @return The value should exactly match contents of exactMatch. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
     * 
     */
    public String exactMatch() {
        return this.exactMatch;
    }
    /**
     * @return The name of the HTTP header to match. For matching against the HTTP request&#39;s authority, use a headerMatch with the header name &#34;:authority&#34;. For matching a request&#39;s method, use the headerName &#34;:method&#34;. When the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true, only non-binary user-specified custom metadata and the `content-type` header are supported. The following transport-level headers cannot be used in header matching rules: `:authority`, `:method`, `:path`, `:scheme`, `user-agent`, `accept-encoding`, `content-encoding`, `grpc-accept-encoding`, `grpc-encoding`, `grpc-previous-rpc-attempts`, `grpc-tags-bin`, `grpc-timeout` and `grpc-trace-bin`.
     * 
     */
    public String headerName() {
        return this.headerName;
    }
    /**
     * @return If set to false, the headerMatch is considered a match if the preceding match criteria are met. If set to true, the headerMatch is considered a match if the preceding match criteria are NOT met. The default setting is false.
     * 
     */
    public Boolean invertMatch() {
        return this.invertMatch;
    }
    /**
     * @return The value of the header must start with the contents of prefixMatch. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
     * 
     */
    public String prefixMatch() {
        return this.prefixMatch;
    }
    /**
     * @return A header with the contents of headerName must exist. The match takes place whether or not the request&#39;s header has a value. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
     * 
     */
    public Boolean presentMatch() {
        return this.presentMatch;
    }
    /**
     * @return The header value must be an integer and its value must be in the range specified in rangeMatch. If the header does not contain an integer, number or is empty, the match fails. For example for a range [-5, 0] - -3 will match. - 0 will not match. - 0.25 will not match. - -3someString will not match. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set. rangeMatch is not supported for load balancers that have loadBalancingScheme set to EXTERNAL.
     * 
     */
    public Int64RangeMatchResponse rangeMatch() {
        return this.rangeMatch;
    }
    /**
     * @return The value of the header must match the regular expression specified in regexMatch. For more information about regular expression syntax, see Syntax. For matching against a port specified in the HTTP request, use a headerMatch with headerName set to PORT and a regular expression that satisfies the RFC2616 Host header&#39;s port specifier. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set. regexMatch only applies to load balancers that have loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    public String regexMatch() {
        return this.regexMatch;
    }
    /**
     * @return The value of the header must end with the contents of suffixMatch. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
     * 
     */
    public String suffixMatch() {
        return this.suffixMatch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpHeaderMatchResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String exactMatch;
        private String headerName;
        private Boolean invertMatch;
        private String prefixMatch;
        private Boolean presentMatch;
        private Int64RangeMatchResponse rangeMatch;
        private String regexMatch;
        private String suffixMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpHeaderMatchResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exactMatch = defaults.exactMatch;
    	      this.headerName = defaults.headerName;
    	      this.invertMatch = defaults.invertMatch;
    	      this.prefixMatch = defaults.prefixMatch;
    	      this.presentMatch = defaults.presentMatch;
    	      this.rangeMatch = defaults.rangeMatch;
    	      this.regexMatch = defaults.regexMatch;
    	      this.suffixMatch = defaults.suffixMatch;
        }

        public Builder exactMatch(String exactMatch) {
            this.exactMatch = Objects.requireNonNull(exactMatch);
            return this;
        }
        public Builder headerName(String headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }
        public Builder invertMatch(Boolean invertMatch) {
            this.invertMatch = Objects.requireNonNull(invertMatch);
            return this;
        }
        public Builder prefixMatch(String prefixMatch) {
            this.prefixMatch = Objects.requireNonNull(prefixMatch);
            return this;
        }
        public Builder presentMatch(Boolean presentMatch) {
            this.presentMatch = Objects.requireNonNull(presentMatch);
            return this;
        }
        public Builder rangeMatch(Int64RangeMatchResponse rangeMatch) {
            this.rangeMatch = Objects.requireNonNull(rangeMatch);
            return this;
        }
        public Builder regexMatch(String regexMatch) {
            this.regexMatch = Objects.requireNonNull(regexMatch);
            return this;
        }
        public Builder suffixMatch(String suffixMatch) {
            this.suffixMatch = Objects.requireNonNull(suffixMatch);
            return this;
        }        public HttpHeaderMatchResponse build() {
            return new HttpHeaderMatchResponse(exactMatch, headerName, invertMatch, prefixMatch, presentMatch, rangeMatch, regexMatch, suffixMatch);
        }
    }
}
